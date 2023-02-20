class Max {
  public static void main(String args[]) {
    int max = 0;
    int arr[] = { 23, 34, 11, 44, 55, 77 };
    for (int i = 0; i < arr.length; i++) {
      for (int j = 1; j < arr.length; j++) {
        if (arr[i] < arr[j]) {
          max = arr[j];
        }
      }
    }
    System.out.println("maximun value is" + max);
  }
}