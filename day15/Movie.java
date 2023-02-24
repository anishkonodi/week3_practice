class Movie {
  public static void main(String args[]) {
    int arr[][] = { { 4, 6, 2, 5 }, { 7, 9, 4, 8 }, { 6, 9, 3, 7 } };
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
          sum = sum + arr[i][3];
    }
    float avg = (float) sum / arr.length;
    System.out.println("The average movie rating by colum three is " + avg);
  }
}