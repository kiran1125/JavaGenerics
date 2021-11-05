/**
 * Finding the maximum number in three objects
 * @author - kiran
 * @date = 4/11
 */
package com.bridgelabz;

public class MaximumTest<T extends Comparable<T>> {
   /**
    * Finding maximum for the n elements
    * @param element
    * @return maximum
    */

   T maximum(T ...element ){
      T maximum = element[0];
      for (T a:element) {
         if(a.compareTo(maximum) > 0)
            maximum = a;
      }
      return maximum;
   }
}
