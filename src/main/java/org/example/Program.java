package org.example;

import com.azure.core.credential.TokenCredential;
import com.azure.core.experimental.models.MessageWithMetadata;
import com.azure.core.util.serializer.TypeReference;
import com.azure.data.schemaregistry.SchemaRegistryAsyncClient;
import com.azure.data.schemaregistry.SchemaRegistryClientBuilder;
import com.azure.data.schemaregistry.apacheavro.SchemaRegistryApacheAvroSerializer;
import com.azure.data.schemaregistry.apacheavro.SchemaRegistryApacheAvroSerializerBuilder;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.messaging.eventhubs.EventData;
import com.azure.messaging.eventhubs.EventHubClientBuilder;
import interop.avro.RecordWithFieldTypes;
import interop.avro.WriterSchema;
import reactor.core.publisher.Mono;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Collections;
import java.util.Map;

public class Program {
    private static final String FULLY_QUALIFIED_NAMESPACE = "python-sr-avro-interop-testing.servicebus.windows.net";
    private static final String SCHEMA_REGISTRY_FULLY_QUALIFIED_NAMESPACE = "python-sr-avro-interop-testing.servicebus.windows.net";

    private static final String SCENARIO_1 = "scenario1";
    private static final String SCENARIO_2 = "scenario2";
    private static final String SCENARIO_3 = "scenario3";
    private static final String SCENARIO_4 = "scenario4";

    public static void main(String[] args) {
        final TokenCredential credential = new DefaultAzureCredentialBuilder()
                .build();
        final SchemaRegistryAsyncClient schemaRegistryClient = new SchemaRegistryClientBuilder()
                .fullyQualifiedNamespace(SCHEMA_REGISTRY_FULLY_QUALIFIED_NAMESPACE)
                .credential(credential)
                .buildAsyncClient();
        final SchemaRegistryApacheAvroSerializer serializer = new SchemaRegistryApacheAvroSerializerBuilder()
                .schemaRegistryAsyncClient(schemaRegistryClient)
                .schemaGroup("avro-interop-testing")
                .autoRegisterSchema(false)
                .buildSerializer();
        final Map<String, String> applicationProperties = Collections.singletonMap("language", "java");

        Mono.when(
                scenario1(credential, serializer, applicationProperties),
                scenario2(credential, serializer, applicationProperties),
                scenario3(credential, serializer, applicationProperties),
                scenario4(credential, serializer, applicationProperties))
                .block(Duration.ofSeconds(60));
        System.err.println("Finished");
    }

    private static Mono<Void> scenario1(TokenCredential credential, SchemaRegistryApacheAvroSerializer serializer,
            Map<String, String> applicationProperties) {
        System.err.println("Scenario 1");

        final byte[] randomCharacter = "ÿ".getBytes(StandardCharsets.UTF_8);
        final RecordWithFieldTypes field = RecordWithFieldTypes.newBuilder()
                .setAge(3)
                .setName("Ben")
                .setMarried(false)
                .setHeight(13.5F)
                .setRandb(ByteBuffer.wrap(randomCharacter))
                .build();

        final MessageWithMetadata message = serializer.serializeMessageData(field,
                TypeReference.createInstance(MessageWithMetadata.class));
        final EventData eventData = new EventData(message.getBodyAsBinaryData())
                .setContentType(message.getContentType());

        applicationProperties.forEach((key, value) -> eventData.getProperties().put(key, value));
        return sendEvent(credential, SCENARIO_1, eventData);
    }

    private static Mono<Void> scenario2(TokenCredential credential, SchemaRegistryApacheAvroSerializer serializer,
            Map<String, String> applicationProperties) {
        System.err.println("Scenario 2");

        final WriterSchema writer = WriterSchema.newBuilder()
                .setFavoriteNumber(7)
                .setFavoriteColor("red")
                .setName("Ben")
                .build();

        final MessageWithMetadata message = serializer.serializeMessageData(writer,
                TypeReference.createInstance(MessageWithMetadata.class));

        final EventData eventData = new EventData(message.getBodyAsBinaryData())
                .setContentType(message.getContentType());

        applicationProperties.forEach((key, value) -> eventData.getProperties().put(key, value));

       return sendEvent(credential, SCENARIO_2, eventData);
    }

    private static Mono<Void> scenario3(TokenCredential credential, SchemaRegistryApacheAvroSerializer serializer,
            Map<String, String> applicationProperties) {
        System.err.println("Scenario 3");

        final WriterSchema writer = WriterSchema.newBuilder()
                .setFavoriteNumber(7)
                .setFavoriteColor("red")
                .setName("Ben")
                .build();

        final MessageWithMetadata message = serializer.serializeMessageData(writer,
                TypeReference.createInstance(MessageWithMetadata.class));

        final EventData eventData = new EventData(message.getBodyAsBinaryData())
                .setContentType(message.getContentType());

        applicationProperties.forEach((key, value) -> eventData.getProperties().put(key, value));

        return sendEvent(credential, SCENARIO_3, eventData);
    }

    private static Mono<Void> scenario4(TokenCredential credential, SchemaRegistryApacheAvroSerializer serializer,
            Map<String, String> applicationProperties) {
        System.err.println("Scenario 4");

        final WriterSchema writer = WriterSchema.newBuilder()
                .setFavoriteNumber(7)
                .setFavoriteColor("red")
                .setName("Ben")
                .build();

        final MessageWithMetadata message = serializer.serializeMessageData(writer,
                TypeReference.createInstance(MessageWithMetadata.class));

        final EventData eventData = new EventData(message.getBodyAsBinaryData())
                .setContentType(message.getContentType());

        applicationProperties.forEach((key, value) -> eventData.getProperties().put(key, value));

        return sendEvent(credential, SCENARIO_4, eventData);
    }

    private static Mono<Void> sendEvent(TokenCredential credential, String eventHubName, EventData eventData) {
        return Mono.usingWhen(Mono.fromCallable(() -> {
                    return new EventHubClientBuilder()
                            .credential(eventHubName, FULLY_QUALIFIED_NAMESPACE, credential)
                            .buildAsyncProducerClient();
                }),
                producer -> producer.send(Collections.singleton(eventData)),
                producer -> Mono.fromRunnable(() -> producer.close()));
    }
}
