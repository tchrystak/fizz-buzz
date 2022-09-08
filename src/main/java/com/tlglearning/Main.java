package com.tlglearning;

import java.util.Set;

public class Main {

  /*while loop */

//  public static void main(String[] args) {
//    int i = 1;
//    while ( i <= 100) { // while loop
//      String value =(FizzBuzz.valueOf(i));
//      System.out.println(value);
//      if (value.equals("fizzbuzz")) {
//        break;
//      }
//      i++;
//    }
//  }

  // do while
  public static void main(String[] args) {
    int i = 1;
    do {
      Set<FizzBuzz> value =(FizzBuzz.valueOf(i));
      System.out.printf("%d:%s%n", i, value);
       i++;
    } while (i <= 100);
  }
}
