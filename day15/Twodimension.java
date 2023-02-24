class Twodimension {
  public static void main(String args[]) {
    int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 } };

    for (int i = 0; i < arr.length; i++) {
      int sum = 0;
      for (int j = 0; j < arr[i].length; j++) {

        sum = sum + arr[i][j];
      }
      System.out.println("the sum of the elements in row " + i + " is " + sum);
    }
  }
}