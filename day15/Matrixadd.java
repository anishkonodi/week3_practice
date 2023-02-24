class Matrixadd {
  public static void main(String args[]) {

    int arr[][] = { { 4, 6, 2 }, { 7, 9, 4 }, { 6, 9, 3 } };
    int arr1[][] = { { 1, 2, 3 }, { 4, 4, 5 }, { 5, 7, 8 } };
    int arr2[][] = new int[3][3];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        arr2[i][j] = arr[i][j] + arr1[i][j];
      }
    }
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        System.out.print(arr2[i][j] + " ");
      }
      System.out.println();
    }
  }
}