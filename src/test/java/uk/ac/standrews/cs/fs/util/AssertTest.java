/*
 * Created on Dec 6, 2004 at 9:38:51 PM.
 */
package uk.ac.standrews.cs.fs.util;

import org.junit.Test;

/**
 * @author graham
 *
 * Test class for util.Assert
 */
public class AssertTest {

    @Test
    public void testAssertion() {
        
        Assert.assertion(true, "asserting true");
    }
}
