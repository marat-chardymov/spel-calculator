package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * Created by Marat_Chardymau on 7/7/2015.
 */
public class InputScanner {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext springContext = new ClassPathXmlApplicationContext("context.xml");
    SpelCalculator spelCalculator = springContext.getBean(SpelCalculator.class);

    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.println("Please enter your expression");
      String input = sc.nextLine();
      double result = spelCalculator.calculate(input);
      System.out.println("result = " + result);
    }
  }
}
