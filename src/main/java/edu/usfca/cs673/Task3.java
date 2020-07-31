package edu.usfca.cs673;

public class Task3 {
  // TODO: When returning your answer, take the answer modulo MOD (i.e., "answer" % MOD),
  // because the numbers can get really large and lead to integer overflow.

  final static int MOD = 99991;

  public static int getNumberOfTeamFormations(int n) {
    int twoN=2*n;
    int top=1;
    int bottom=1;
    int temp=n;
    for(int i=0;i<temp;i++){
      top*=twoN;
      bottom*=n;
      n-=1;
      twoN-=1;
    }
    int divide=top/bottom;
    return (divide/2)%MOD;
  }
}
