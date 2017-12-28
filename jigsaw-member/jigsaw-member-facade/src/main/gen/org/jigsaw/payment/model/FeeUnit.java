// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: enums.proto

package org.jigsaw.payment.model;

/**
 * <pre>
 **
 * 货币类型
 * </pre>
 *
 * Protobuf enum {@code FeeUnit}
 */
public enum FeeUnit
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNKNOWN_FEE_UNIT = 0;</code>
   */
  UNKNOWN_FEE_UNIT(0),
  /**
   * <code>CNY = 1;</code>
   */
  CNY(1),
  /**
   * <code>USD = 2;</code>
   */
  USD(2),
  /**
   * <code>EUR = 3;</code>
   */
  EUR(3),
  /**
   * <code>HKD = 4;</code>
   */
  HKD(4),
  /**
   * <code>TWD = 5;</code>
   */
  TWD(5),
  /**
   * <code>JPY = 6;</code>
   */
  JPY(6),
  ;

  /**
   * <code>UNKNOWN_FEE_UNIT = 0;</code>
   */
  public static final int UNKNOWN_FEE_UNIT_VALUE = 0;
  /**
   * <code>CNY = 1;</code>
   */
  public static final int CNY_VALUE = 1;
  /**
   * <code>USD = 2;</code>
   */
  public static final int USD_VALUE = 2;
  /**
   * <code>EUR = 3;</code>
   */
  public static final int EUR_VALUE = 3;
  /**
   * <code>HKD = 4;</code>
   */
  public static final int HKD_VALUE = 4;
  /**
   * <code>TWD = 5;</code>
   */
  public static final int TWD_VALUE = 5;
  /**
   * <code>JPY = 6;</code>
   */
  public static final int JPY_VALUE = 6;


  public final int getNumber() {
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static FeeUnit valueOf(int value) {
    return forNumber(value);
  }

  public static FeeUnit forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN_FEE_UNIT;
      case 1: return CNY;
      case 2: return USD;
      case 3: return EUR;
      case 4: return HKD;
      case 5: return TWD;
      case 6: return JPY;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<FeeUnit>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      FeeUnit> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<FeeUnit>() {
          public FeeUnit findValueByNumber(int number) {
            return FeeUnit.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return org.jigsaw.payment.model.Enums.getDescriptor().getEnumTypes().get(2);
  }

  private static final FeeUnit[] VALUES = values();

  public static FeeUnit valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private FeeUnit(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:FeeUnit)
}
