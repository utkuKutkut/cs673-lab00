package edu.usfca.cs673;

import static java.lang.Math.min;

public class Task1 {
  // TODO: When returning your answer, take the answer modulo MOD (i.e., "answer" % MOD),
  // because the numbers can get really large and lead to integer overflow.

  final static int MOD = 99991;

  // TODO: Feel free to declare a new variable, if needed.

  public static int getNumberOfWaysRecursive(int n) {
    if (n == 1) {
      return 1;
    } else if (n <= 0) {
      return 0;
    }
    return getNumberOfWaysIterative(n - 1) + getNumberOfWaysIterative(n - 2);
  }

  public static int getNumberOfWaysIterative(int n) {
    //Equation: 2x+y=n
    int sum = 0;
    long x = n / 2;
    long y = n % 2;
    long loopNumber = (n / 2) + 1;
    for (int i = 0; i < loopNumber; i++) {
      sum += comb(x + y, min(x, y));
      x -= 1;
      y += 2;
    }
    return (sum) % MOD;
  }

  public static double comb(long x, long y) {
    long top = 1;
    long bottom = 1;
    long tempX = x;
    long tempY = y;
    for (int i = 0; i < y; i++) {
      top = (top * tempX);
      bottom = (bottom * tempY);
      tempX -= 1;
      tempY -= 1;
    }
    return top / bottom;
  }
}