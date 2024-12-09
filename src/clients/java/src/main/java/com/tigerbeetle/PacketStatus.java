//////////////////////////////////////////////////////////
// This file was auto-generated by java_bindings.zig
// Do not manually modify.
//////////////////////////////////////////////////////////

package com.tigerbeetle;

public enum PacketStatus {
    Ok((byte) 0),
    TooMuchData((byte) 1),
    ClientEvicted((byte) 2),
    ClientReleaseTooLow((byte) 3),
    ClientReleaseTooHigh((byte) 4),
    ClientShutdown((byte) 5),
    InvalidOperation((byte) 6),
    InvalidDataSize((byte) 7);

    public final byte value;

    static final PacketStatus[] enumByValue;
    static {
    final var values = values();
      enumByValue = new PacketStatus[values.length];
       for (final var item : values) {
          enumByValue[item.value] = item;
      }
    }

    PacketStatus(byte value) {
        this.value = value;
    }

    public static PacketStatus fromValue(byte value) {
        if (value < 0 || value >= enumByValue.length)
            throw new IllegalArgumentException(
                    String.format("Invalid PacketStatus value=%d", value));

        final var item = enumByValue[value];
        AssertionError.assertTrue(item.value == value,
          "Unexpected PacketStatus: found=%d expected=%d", item.value, value);
        return item;
    }
}

