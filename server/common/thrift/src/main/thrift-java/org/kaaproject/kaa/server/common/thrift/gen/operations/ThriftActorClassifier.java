/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.kaaproject.kaa.server.common.thrift.gen.operations;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum ThriftActorClassifier implements org.apache.thrift.TEnum {
  LOCAL(1),
  GLOBAL(2),
  APPLICATION(3);

  private final int value;

  private ThriftActorClassifier(int value) {
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
  public static ThriftActorClassifier findByValue(int value) { 
    switch (value) {
      case 1:
        return LOCAL;
      case 2:
        return GLOBAL;
      case 3:
        return APPLICATION;
      default:
        return null;
    }
  }
}
