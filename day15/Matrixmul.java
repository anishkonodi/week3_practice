class Matrixmul {
  public static void main(String args[]) {
    int arr[][] = { { 4, 6, 2 }, { 7, 9, 4 }, { 6, 9, 3 } };
    int arr1[][] = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
    int r1 = arr.length;
    int c1 = arr[0].length;
    int r2 = arr1.length;
    int c2 = arr1[0].length;
    int c[][] = new int[r1][c2];
    if (c1 == r2) {
      for (int i = 0; i < r1; i++) {
        for (int j = 0; j < c2; j++) {
          c[i][j] = 0;
          for (int k = 0; k < c1; k++)
            c[i][j] = c[i][j] + arr[i][k] * arr1[k][j];
        }
      }
    }
    for (int i = 0; i < c.length; i++) {
      for (int j = 0; j < c.length; j++) {
        System.out.print(c[i][j] + " ");
      }
      System.out.println();
    }
  }
}
