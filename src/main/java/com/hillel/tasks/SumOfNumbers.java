package com.hillel.tasks;

/**
 * Created by ANN on 09.01.2017.
 */
public class SumOfNumbers {

 public int getSum(int limit){

   int sum = 0;
   for (int i = 0; i <=limit ; i++) {
     sum = sum + i;
   }
   return sum;
 }
}

