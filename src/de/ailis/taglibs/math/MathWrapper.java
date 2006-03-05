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


/**
 * This class wraps the java.lang.Math class to export only the methods which
 * are useful for a JSP taglib. 
 *
 * @author Klaus Reimer (k@ailis.de)
 * @version $Revision$
 */

public class MathWrapper
{
    /**
     * @see java.lang.Math#E
     */
    
    public static double E()
    {
        return Math.E;
    }
    

    /**
     * @see java.lang.Math#PI
     */
    
    public static double PI()
    {
        return Math.PI;
    }

    
    /**
     * @see java.lang.Math#abs(double)
     */
    
    public static double abs(double a)
    {        
        return Math.abs(a);
    }

    
    /**
     * @see java.lang.Math#acos(double)
     */
    
    public static double acos(double a)
    {        
        return Math.acos(a);
    }

    
    /**
     * @see java.lang.Math#asin(double)
     */
    
    public static double asin(double a)
    {        
        return Math.asin(a);
    }

    
    /**
     * @see java.lang.Math#atan(double)
     */
    
    public static double atan(double a)
    {        
        return Math.atan(a);
    }

    
    /**
     * @see java.lang.Math#atan2(double, double)
     */
    
    public static double atan2(double y, double x)
    {        
        return Math.atan2(y,x );
    }

    
    /**
     * @see java.lang.Math#cbrt(double)
     */
    
    public static double cbrt(double a)
    {        
        return Math.cbrt(a);
    }

    
    /**
     * @see java.lang.Math#ceil(double)
     */

    public static long ceil(double a)
    {
        return (long) Math.ceil(a);
    }  

    
    /**
     * @see java.lang.Math#cos(double)
     */
    
    public static double cos(double a)
    {        
        return Math.cos(a);
    }

    
    /**
     * @see java.lang.Math#cosh(double)
     */
    
    public static double cosh(double x)
    {        
        return Math.cosh(x);
    }

    
    /**
     * @see java.lang.Math#exp(double)
     */
    
    public static double exp(double a)
    {        
        return Math.exp(a);
    }

    
    /**
     * @see java.lang.Math#expm1(double)
     */
    
    public static double expm1(double a)
    {        
        return Math.expm1(a);
    }

    
    /**
     * @see java.lang.Math#floor(double)
     */

    public static long floor(double input)
    {
        return (long) Math.floor(input);
    }
    
    
    /**
     * @see java.lang.Math#hypot(double, double)
     */
    
    public static double hypot(double x, double y)
    {        
        return Math.hypot(x, y);
    }

    
    /**
     * @see java.lang.Math#IEEEremainder(double, double)
     */
    
    public static double IEEEremainder(double f1, double f2)
    {        
        return Math.IEEEremainder(f1, f2);
    }

    
    /**
     * @see java.lang.Math#log(double)
     */
    
    public static double log(double a)
    {        
        return Math.log(a);
    }

    
    /**
     * @see java.lang.Math#log10(double)
     */
    
    public static double log10(double a)
    {        
        return Math.log10(a);
    }

    
    /**
     * @see java.lang.Math#log1p(double)
     */
    
    public static double log1p(double a)
    {        
        return Math.log1p(a);
    }

    
    /**
     * @see java.lang.Math#max(double, double)
     */
    
    public static double max(double a, double b)
    {        
        return Math.max(a, b);
    }

    
    /**
     * @see java.lang.Math#min(double, double)
     */
    
    public static double min(double a, double b)
    {        
        return Math.min(a, b);
    }

    
    /**
     * @see java.lang.Math#pow(double, double)
     */
    
    public static double pow(double a, double b)
    {        
        return Math.pow(a, b);
    }

    
    /**
     * @see java.lang.Math#random
     */
    
    public static double random()
    {        
        return Math.random();
    }

    
    /**
     * @see java.lang.Math#rint(double)
     */
    
    public static double rint(double a)
    {        
        return Math.rint(a);
    }

    
    /**
     * @see java.lang.Math#round(double)
     */

    public static long round(double a)
    {
        return Math.round(a);
    }
    
    
    /**
     * @see java.lang.Math#signum(double)
     */
    
    public static double signum(double d)
    {        
        return Math.signum(d);
    }
    
    
    /**
     * @see java.lang.Math#sin(double)
     */
    
    public static double sin(double a)
    {        
        return Math.sin(a);
    }    
    
    
    /**
     * @see java.lang.Math#sinh(double)
     */
    
    public static double sinh(double a)
    {        
        return Math.sinh(a);
    }    
    
    
    /**
     * @see java.lang.Math#sqrt(double)
     */
    
    public static double sqrt(double a)
    {        
        return Math.sqrt(a);
    }    
    
    
    /**
     * @see java.lang.Math#tan(double)
     */
    
    public static double tan(double a)
    {        
        return Math.tan(a);
    }    
    
    
    /**
     * @see java.lang.Math#tanh(double)
     */
    
    public static double tanh(double x)
    {        
        return Math.tanh(x);
    }    
    
    
    /**
     * @see java.lang.Math#toDegrees(double)
     */
    
    public static double toDegrees(double angrad)
    {        
        return Math.toDegrees(angrad);
    }    
    
    
    /**
     * @see java.lang.Math#toRadians(double)
     */
    
    public static double toRadians(double angdeg)
    {        
        return Math.toRadians(angdeg);
    }    
    
    
    /**
     * @see java.lang.Math#ulp(double)
     */
    
    public static double ulp(double d)
    {        
        return Math.ulp(d);
    }    
}
