package com.barton;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


/**
 * Looking for the most degenerate case
 */
public class NameInversTest {
    @Test(expected = NullPointerException.class)
    public void invertNullShouldThrowNullPointerException() {
        NameInvers.invert(null);

    }

    @Test
    public void emptyStringShouldReturnEmptyString() {
        assertThat(NameInvers.invert(" "), is(""));
        assertThat(NameInvers.invert("  "), is("  "));
    }

    @Test
    public void invertFirstNameShouldReturnFirstName() {
        assertThat(NameInvers.invert("John"), is("John"));
        assertThat(NameInvers.invert("    John   "), is("  John   "));
    }
    @Test
    public void invertFirstNameShouldReturnLastCommaLast() {
      assertThat(NameInvers.invert("John Smith"), is("Smith, John"));
    }
}
