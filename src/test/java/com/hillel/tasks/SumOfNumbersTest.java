package com.hillel.tasks;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by ANN on 09.01.2017.
 */
public class SumOfNumbersTest {

  @Test
  public void testSum() {


    SumOfNumbers sumOfNumbers = new SumOfNumbers();
    int result = sumOfNumbers.getSum(100);

    assertThat(result, is(5050));

  }



}
