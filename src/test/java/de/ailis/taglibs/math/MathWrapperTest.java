/*
 * $Id$
 * Copyright (C) 2006 Klaus Reimer <k@ailis.de>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307  USA
 */

package de.ailis.taglibs.math;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


/**
 * Test class for MathWrapper
 *
 * @author Klaus Reimer (k@ailis.de)
 * @version $Revision$
 */

public class MathWrapperTest extends TestCase
{
    /**
     * Returns the test suite.
     *
     * @return The test suite
     */
    
    public static Test suite()
    {
        return new TestSuite(MathWrapperTest.class);
    }
    
    
    /**
     * Tests the round() method
     */
    
    public void testRound()
    {
        assertEquals(MathWrapper.round(1.0), 1);
        assertEquals(MathWrapper.round(1.4), 1);
        assertEquals(MathWrapper.round(1.5), 2);
        assertEquals(MathWrapper.round(2.0), 2);
    }
    
    
    /**
     * Tests the ceil() method
     */
    
    public void testCeil()
    {
        assertEquals(MathWrapper.ceil(1.0), 1);
        assertEquals(MathWrapper.ceil(1.4), 2);
        assertEquals(MathWrapper.ceil(1.5), 2);
        assertEquals(MathWrapper.ceil(2.0), 2);
    }
    
    
    /**
     * Tests the floor() method
     */
    
    public void testFloor()
    {
        assertEquals(MathWrapper.floor(1.0), 1);
        assertEquals(MathWrapper.floor(1.4), 1);
        assertEquals(MathWrapper.floor(1.5), 1);
        assertEquals(MathWrapper.floor(2.0), 2);
    }
}
