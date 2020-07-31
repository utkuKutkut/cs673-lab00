package edu.usfca.cs673;

import static java.lang.Integer.max;
import static java.lang.Math.pow;

public class Task4 {
  public static double getProbability(int n, int k) {
    double prob,com;
    double all,n1,n2;

    if(k==0){
      if(n%2==0){
        all= (int) pow(2,n);
        com=comb(n,n/2);
        prob=com/all;
      }
      else{
        //impossible
        return 0.;
      }
    }
    else{
      if((k+n)%2!=0){
        return 0.;
      }
      n2=(k+n)/2;
      n1=n-n2;
      all= (int) pow(2,n);
      //select maximum of n1 and n2
      if(n1>n2){
        com=2*comb(n,n1);
      }
      else{
        com=2*comb(n,n2);
      }
      prob=com/all;
    }
    return prob;
  }

  public static double comb(double x, double y) {
    double top = 1;
    double bottom = 1;
    double tempX = x;
    double tempY = y;
    for (int i = 0; i < y; i++) {
      top = (top * tempX);
      bottom = (bottom * tempY);
      tempX -= 1;
      tempY -= 1;
    }
    return top/bottom;
  }
}
