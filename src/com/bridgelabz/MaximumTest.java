/**
 * Finding the maximum number in three integers
 * @author - kiran
 * @date = 4/11
 */
package com.bridgelabz;

public class MaximumTest {
   //class level variables
   public Integer x,y,z;
   public Float a,b,c;
   public String s1,s2,s3;

   /**
    *passing three integers as parameters0 to get maximum number
    * @param x
    * @param y
    * @param z
    * @return maximum
    */
   int maximumOfIntegers(Integer x,Integer y, Integer z){
      this.x = x;
      this.y = y;
      this.z = z;
      int maximum=0;
      if(x.compareTo(y) > 0 && x.compareTo(z) > 0)
         maximum = x;
      if (y.compareTo(x) > 0 && y.compareTo(z) > 0)
         maximum = y;
      if (z.compareTo(x) > 0 && z.compareTo(y) > 0)
         maximum = z;
      return maximum;
   }

   /**
    * Comparing the floats and retuning the maximum number
    * @param a
    * @param b
    * @param c
    * @return maximum
    */
    float maximumOfFloats(Float a,Float b, Float c){
      this.a = a;
      this.b = b;
      this.c = c;
      float maximum=0;
      if(a.compareTo(b) > 0 && a.compareTo(c) > 0)
         maximum = a;
      if (b.compareTo(a) > 0 && b.compareTo(c) > 0)
         maximum = b;
      if (c.compareTo(a) > 0 && c.compareTo(b) > 0)
         maximum = c;
      return maximum;
   }

    /**
     * Comparing the three strings and returning the maximum string
     * @param s1
     * @param s2
     * @param s3
     * @return maximum
     */
    String maximumOfStrings(String s1,String s2, String s3){
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        String maximum = null;
        if(s1.compareTo(s2) > 0 && s1.compareTo(s3) > 0)
            maximum = s1;
        else if (s2.compareTo(s1) > 0 && s2.compareTo(s3) > 0)
            maximum = s2;
        else
            maximum = s3;
        return maximum;
    }
}
