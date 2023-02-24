class Square {
  public static void main(String args[]) {
    int arr[][] = { { 2, 3, 4,9 }, { 5, 6, 7,4 }, { 8, 9, 10,9 } };
    int rows=0,cols=0,temp=0;
    for (int i = 0; i < arr.length; i++) {
        cols=0;
      for (int j = 0; j < arr[i].length; j++) {
        cols=cols+1;
      }
      rows=rows+1;
    }
    if(rows==cols){
      System.out.println("Yes it is Square matrix");
    }
    else{
      System.out.println("No it is not Square matrix");
    }
  }
}