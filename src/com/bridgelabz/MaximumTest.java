/**
 * Finding the maximum number in three objects
 * @author - kiran
 * @date = 4/11
 */
package com.bridgelabz;

public class MaximumTest<T extends Comparable> {
   //class level variables
   public T x,y,z;


   /**
    *passing three objects as parameters0 to get maximum number
    * @param x
    * @param y
    * @param z
    * @return maximum
    */
   T maximumOfObjects(T x,T y, T z){
      this.x = x;
      this.y = y;
      this.z = z;
      T maximum = null;
      if(x.compareTo(y) > 0 && x.compareTo(z) > 0)
         maximum = x;
      if (y.compareTo(x) > 0 && y.compareTo(z) > 0)
         maximum = y;
      if (z.compareTo(x) > 0 && z.compareTo(y) > 0)
         maximum = z;
      return maximum;
   }
}
