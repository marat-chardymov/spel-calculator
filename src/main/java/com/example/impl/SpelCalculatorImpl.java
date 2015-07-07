package com.example.impl;

import com.example.SpelCalculator;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.stereotype.Component;

/**
 * Created by Marat_Chardymau on 7/7/2015.
 */
@Component
public class SpelCalculatorImpl implements SpelCalculator
{
  @Override
  public double calculate(String expression) {
    ExpressionParser parser = new SpelExpressionParser();
    Expression exp = parser.parseExpression(expression);
    Object value = exp.getValue();
    if(value instanceof Integer){
      return ((Integer)exp.getValue()).doubleValue();
    } else {
      return (Double)exp.getValue();
    }
  }
}
