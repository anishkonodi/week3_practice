class Diagonal {
  public static void main(String args[]) {
    int arr[][] = { { 2, 3, 4 }, { 5, 6, 7 }, { 8, 9, 10 } };
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {

      for (int j = 0; j < arr[i].length; j++) {

        if (i == j) {
          // System.out.println(arr[i][j]);
          sum = sum + arr[i][j];
        }
      }
    }
    System.out.println(sum);
  }
}