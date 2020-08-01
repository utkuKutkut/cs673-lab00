package edu.usfca.cs673;

public class Task3 {
  // TODO: When returning your answer, take the answer modulo MOD (i.e., "answer" % MOD),
  // because the numbers can get really large and lead to integer overflow.

  final static int MOD = 99991;

  public static int getNumberOfTeamFormations(int n) {
    long twoN=2*n;
    double top=1;
    double bottom=1;
    long temp=n;
    for(int i=0;i<temp;i++){
      top*=twoN;
      bottom*=n;
      n-=1;
      twoN-=1;
    }
    double divide=top/bottom;
    return (int) ((divide/2)%MOD);
  }
}
