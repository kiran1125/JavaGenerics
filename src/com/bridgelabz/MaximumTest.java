/**
 * Finding the maximum number in three integers
 * @author - kiran
 * @date = 4/11
 */
package com.bridgelabz;

public class MaximumTest {
   //class level variables
   public Integer x,y,z;

   /**
    *passing three integers as parameters0 to get maximum number
    * @param x
    * @param y
    * @param z
    * @return maximum
    */
   public int maximumOfIntegers(Integer x,Integer y, Integer z){
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
}
