package uw.cp510.assignments.assignment4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Assignment4Test {
    @Test
    @DisplayName("Can call main() on Assignment 4")
    void testWithDisplayNameContainingSpaces() throws OpCanceledException {
        Assignment4.main(new String[0]);
    }
}
