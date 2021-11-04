/**
 * Finding the maximum number in three integers
 * @author - kiran
 * @date = 4/11
 */
package com.bridgelabz;

public class MaximumTest {
   //class level variables
   public int x,y,z;

   /**
    *passing three integers as parameters0 to get maximum number
    * @param x
    * @param y
    * @param z
    * @return maximum
    */
   public int maximumOfIntegers(int x,int y, int z){
      this.x = x;
      this.y = y;
      this.z = z;
      int maximum=0;
      if(x>y && x>z)
         maximum = x;
      if (y>x && y>z)
         maximum = y;
      if (z>x && z>y)
         maximum = z;
      return maximum;
   }
}
