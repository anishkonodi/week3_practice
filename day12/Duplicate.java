class Duplicate {
  public static void main(String args[]) {
    int arr[] = { 1, 2, 2, 3, 4, 4, 5, 6, 7, 8, 77, 77, 99, 89, 88, 99 };
    int duplicateelement[] = new int[arr.length];
    int count = 0, duplicate = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          count = count + 1;
          if (count == 1) {
            duplicateelement[duplicate] = arr[j];
            duplicate++;
          }
        }
      }
      count = 0;
    }
    for (int i = 0; i < duplicate; i++) {
      System.out.println(duplicateelement[i]);
    }
  }
}
