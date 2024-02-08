//////////////////////////////////////////////////////////
// This file was auto-generated by java_bindings.zig
// Do not manually modify.
//////////////////////////////////////////////////////////

package com.tigerbeetle;

public interface AccountFilterFlags {
    int NONE = (int) 0;

    /**
     * @see <a href="https://docs.tigerbeetle.com/reference/account_filter#flagsdebits">debits</a>
     */
    int DEBITS = (int) (1 << 0);

    /**
     * @see <a href="https://docs.tigerbeetle.com/reference/account_filter#flagscredits">credits</a>
     */
    int CREDITS = (int) (1 << 1);

    /**
     * @see <a href="https://docs.tigerbeetle.com/reference/account_filter#flagsreversed">reversed</a>
     */
    int REVERSED = (int) (1 << 2);

    static boolean hasDebits(final int flags) {
        return (flags & DEBITS) == DEBITS;
    }

    static boolean hasCredits(final int flags) {
        return (flags & CREDITS) == CREDITS;
    }

    static boolean hasReversed(final int flags) {
        return (flags & REVERSED) == REVERSED;
    }

}
