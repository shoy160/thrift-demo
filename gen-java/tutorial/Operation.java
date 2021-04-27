/**
 * Autogenerated by Thrift Compiler (0.14.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package tutorial;


/**
 * You can define enums, which are just 32 bit integers. Values are optional
 * and start at 1 if not supplied, C style again.
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.1)", date = "2021-04-27")
public enum Operation implements org.apache.thrift.TEnum {
  ADD(1),
  SUBTRACT(2),
  MULTIPLY(3),
  DIVIDE(4);

  private final int value;

  private Operation(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  @org.apache.thrift.annotation.Nullable
  public static Operation findByValue(int value) { 
    switch (value) {
      case 1:
        return ADD;
      case 2:
        return SUBTRACT;
      case 3:
        return MULTIPLY;
      case 4:
        return DIVIDE;
      default:
        return null;
    }
  }
}
