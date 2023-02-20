class Min {
  public static void main(String args[]) {
    int arr[] = { 23, 90, 34, 11, 44, 55 };
    int min = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (min > arr[i]) {
        min = arr[i];
      }
    }
    System.out.println("minimum value is" + min);
  }
}