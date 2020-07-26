package edu.usfca.cs673;

public class Task2 {
  static int num=0;
  static void mergeSort(int array[], int left, int right){
    if(left<right){
      int middle=(left+right)/2;
      mergeSort(array,left,middle);
      mergeSort(array,middle+1,right);
      count(array,left,middle,right);
    }
  }

  static void count(int array[],int left,int middle,int right){
    //find 2 arrays size
    int size1=middle-left+1;
    int size2=right-middle;

    //temp arrays
    int leftArray[]= new int [size1];
    int rightArray[]= new int[size2];
    for(int i=0;i<size1;++i){
      leftArray[i]=array[left+i];
    }
    for(int i=0;i<size2;++i){
      rightArray[i]=array[middle+1+i];
    }

    int i=0, j=0;
    int k=left;

    while(i<=size1){
      if(j>=size2){
        j=0;
        i++;
        if(i>=size1){
          break;
        }
      }
      int indexLeft= findIndex(array,leftArray[i]);
      int indexRight= findIndex(array,rightArray[j]);
      if(leftArray[i]>rightArray[j] && indexRight>indexLeft){
        j++;
        num++;
      }
      else{
        j++;
      }
      k++;
    }
  }

  public static int findIndex(int arr[], int t)
  {

    // if array is Null
    if (arr == null) {
      return -1;
    }

    // find length of array
    int len = arr.length;
    int i = 0;

    // traverse in the array
    while (i < len) {

      // if the i-th element is t
      // then return the index
      if (arr[i] == t) {
        return i;
      }
      else {
        i = i + 1;
      }
    }
    return -1;
  }

  public static int getNumberOfInversions(int[] A) {
    int n = A.length, cnt = 0;
    num=0;
    mergeSort(A,0,n-1);
    cnt=num;
    return cnt;
  }
}
