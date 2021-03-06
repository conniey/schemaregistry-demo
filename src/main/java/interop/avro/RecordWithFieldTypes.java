/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package interop.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class RecordWithFieldTypes extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 6894405981564541997L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"RecordWithFieldTypes\",\"namespace\":\"interop.avro\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"age\",\"type\":\"int\"},{\"name\":\"married\",\"type\":\"boolean\"},{\"name\":\"height\",\"type\":\"float\"},{\"name\":\"randb\",\"type\":\"bytes\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<RecordWithFieldTypes> ENCODER =
      new BinaryMessageEncoder<RecordWithFieldTypes>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<RecordWithFieldTypes> DECODER =
      new BinaryMessageDecoder<RecordWithFieldTypes>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<RecordWithFieldTypes> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<RecordWithFieldTypes> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<RecordWithFieldTypes> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<RecordWithFieldTypes>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this RecordWithFieldTypes to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a RecordWithFieldTypes from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a RecordWithFieldTypes instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static RecordWithFieldTypes fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence name;
  private int age;
  private boolean married;
  private float height;
  private java.nio.ByteBuffer randb;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public RecordWithFieldTypes() {}

  /**
   * All-args constructor.
   * @param name The new value for name
   * @param age The new value for age
   * @param married The new value for married
   * @param height The new value for height
   * @param randb The new value for randb
   */
  public RecordWithFieldTypes(java.lang.CharSequence name, java.lang.Integer age, java.lang.Boolean married, java.lang.Float height, java.nio.ByteBuffer randb) {
    this.name = name;
    this.age = age;
    this.married = married;
    this.height = height;
    this.randb = randb;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return age;
    case 2: return married;
    case 3: return height;
    case 4: return randb;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.CharSequence)value$; break;
    case 1: age = (java.lang.Integer)value$; break;
    case 2: married = (java.lang.Boolean)value$; break;
    case 3: height = (java.lang.Float)value$; break;
    case 4: randb = (java.nio.ByteBuffer)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }


  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'age' field.
   * @return The value of the 'age' field.
   */
  public int getAge() {
    return age;
  }


  /**
   * Sets the value of the 'age' field.
   * @param value the value to set.
   */
  public void setAge(int value) {
    this.age = value;
  }

  /**
   * Gets the value of the 'married' field.
   * @return The value of the 'married' field.
   */
  public boolean getMarried() {
    return married;
  }


  /**
   * Sets the value of the 'married' field.
   * @param value the value to set.
   */
  public void setMarried(boolean value) {
    this.married = value;
  }

  /**
   * Gets the value of the 'height' field.
   * @return The value of the 'height' field.
   */
  public float getHeight() {
    return height;
  }


  /**
   * Sets the value of the 'height' field.
   * @param value the value to set.
   */
  public void setHeight(float value) {
    this.height = value;
  }

  /**
   * Gets the value of the 'randb' field.
   * @return The value of the 'randb' field.
   */
  public java.nio.ByteBuffer getRandb() {
    return randb;
  }


  /**
   * Sets the value of the 'randb' field.
   * @param value the value to set.
   */
  public void setRandb(java.nio.ByteBuffer value) {
    this.randb = value;
  }

  /**
   * Creates a new RecordWithFieldTypes RecordBuilder.
   * @return A new RecordWithFieldTypes RecordBuilder
   */
  public static interop.avro.RecordWithFieldTypes.Builder newBuilder() {
    return new interop.avro.RecordWithFieldTypes.Builder();
  }

  /**
   * Creates a new RecordWithFieldTypes RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new RecordWithFieldTypes RecordBuilder
   */
  public static interop.avro.RecordWithFieldTypes.Builder newBuilder(interop.avro.RecordWithFieldTypes.Builder other) {
    if (other == null) {
      return new interop.avro.RecordWithFieldTypes.Builder();
    } else {
      return new interop.avro.RecordWithFieldTypes.Builder(other);
    }
  }

  /**
   * Creates a new RecordWithFieldTypes RecordBuilder by copying an existing RecordWithFieldTypes instance.
   * @param other The existing instance to copy.
   * @return A new RecordWithFieldTypes RecordBuilder
   */
  public static interop.avro.RecordWithFieldTypes.Builder newBuilder(interop.avro.RecordWithFieldTypes other) {
    if (other == null) {
      return new interop.avro.RecordWithFieldTypes.Builder();
    } else {
      return new interop.avro.RecordWithFieldTypes.Builder(other);
    }
  }

  /**
   * RecordBuilder for RecordWithFieldTypes instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<RecordWithFieldTypes>
    implements org.apache.avro.data.RecordBuilder<RecordWithFieldTypes> {

    private java.lang.CharSequence name;
    private int age;
    private boolean married;
    private float height;
    private java.nio.ByteBuffer randb;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(interop.avro.RecordWithFieldTypes.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.age)) {
        this.age = data().deepCopy(fields()[1].schema(), other.age);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.married)) {
        this.married = data().deepCopy(fields()[2].schema(), other.married);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.height)) {
        this.height = data().deepCopy(fields()[3].schema(), other.height);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.randb)) {
        this.randb = data().deepCopy(fields()[4].schema(), other.randb);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
    }

    /**
     * Creates a Builder by copying an existing RecordWithFieldTypes instance
     * @param other The existing instance to copy.
     */
    private Builder(interop.avro.RecordWithFieldTypes other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.age)) {
        this.age = data().deepCopy(fields()[1].schema(), other.age);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.married)) {
        this.married = data().deepCopy(fields()[2].schema(), other.married);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.height)) {
        this.height = data().deepCopy(fields()[3].schema(), other.height);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.randb)) {
        this.randb = data().deepCopy(fields()[4].schema(), other.randb);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }


    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public interop.avro.RecordWithFieldTypes.Builder setName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public interop.avro.RecordWithFieldTypes.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'age' field.
      * @return The value.
      */
    public int getAge() {
      return age;
    }


    /**
      * Sets the value of the 'age' field.
      * @param value The value of 'age'.
      * @return This builder.
      */
    public interop.avro.RecordWithFieldTypes.Builder setAge(int value) {
      validate(fields()[1], value);
      this.age = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'age' field has been set.
      * @return True if the 'age' field has been set, false otherwise.
      */
    public boolean hasAge() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'age' field.
      * @return This builder.
      */
    public interop.avro.RecordWithFieldTypes.Builder clearAge() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'married' field.
      * @return The value.
      */
    public boolean getMarried() {
      return married;
    }


    /**
      * Sets the value of the 'married' field.
      * @param value The value of 'married'.
      * @return This builder.
      */
    public interop.avro.RecordWithFieldTypes.Builder setMarried(boolean value) {
      validate(fields()[2], value);
      this.married = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'married' field has been set.
      * @return True if the 'married' field has been set, false otherwise.
      */
    public boolean hasMarried() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'married' field.
      * @return This builder.
      */
    public interop.avro.RecordWithFieldTypes.Builder clearMarried() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'height' field.
      * @return The value.
      */
    public float getHeight() {
      return height;
    }


    /**
      * Sets the value of the 'height' field.
      * @param value The value of 'height'.
      * @return This builder.
      */
    public interop.avro.RecordWithFieldTypes.Builder setHeight(float value) {
      validate(fields()[3], value);
      this.height = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'height' field has been set.
      * @return True if the 'height' field has been set, false otherwise.
      */
    public boolean hasHeight() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'height' field.
      * @return This builder.
      */
    public interop.avro.RecordWithFieldTypes.Builder clearHeight() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'randb' field.
      * @return The value.
      */
    public java.nio.ByteBuffer getRandb() {
      return randb;
    }


    /**
      * Sets the value of the 'randb' field.
      * @param value The value of 'randb'.
      * @return This builder.
      */
    public interop.avro.RecordWithFieldTypes.Builder setRandb(java.nio.ByteBuffer value) {
      validate(fields()[4], value);
      this.randb = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'randb' field has been set.
      * @return True if the 'randb' field has been set, false otherwise.
      */
    public boolean hasRandb() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'randb' field.
      * @return This builder.
      */
    public interop.avro.RecordWithFieldTypes.Builder clearRandb() {
      randb = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public RecordWithFieldTypes build() {
      try {
        RecordWithFieldTypes record = new RecordWithFieldTypes();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.age = fieldSetFlags()[1] ? this.age : (java.lang.Integer) defaultValue(fields()[1]);
        record.married = fieldSetFlags()[2] ? this.married : (java.lang.Boolean) defaultValue(fields()[2]);
        record.height = fieldSetFlags()[3] ? this.height : (java.lang.Float) defaultValue(fields()[3]);
        record.randb = fieldSetFlags()[4] ? this.randb : (java.nio.ByteBuffer) defaultValue(fields()[4]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<RecordWithFieldTypes>
    WRITER$ = (org.apache.avro.io.DatumWriter<RecordWithFieldTypes>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<RecordWithFieldTypes>
    READER$ = (org.apache.avro.io.DatumReader<RecordWithFieldTypes>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.name);

    out.writeInt(this.age);

    out.writeBoolean(this.married);

    out.writeFloat(this.height);

    out.writeBytes(this.randb);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);

      this.age = in.readInt();

      this.married = in.readBoolean();

      this.height = in.readFloat();

      this.randb = in.readBytes(this.randb);

    } else {
      for (int i = 0; i < 5; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);
          break;

        case 1:
          this.age = in.readInt();
          break;

        case 2:
          this.married = in.readBoolean();
          break;

        case 3:
          this.height = in.readFloat();
          break;

        case 4:
          this.randb = in.readBytes(this.randb);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










