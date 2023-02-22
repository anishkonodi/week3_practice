class Unique {
  public static void main(String args[]) {
    int arr[] = { 1, 2, 2, 3, 4, 4, 5, 6, 7, 8, 77, 77, 99, 89, 88, 99 };
    int uniqueelement[] = new int[arr.length];
    int count = 0, unique = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          count = count + 1;
          if (count > 1) {
            continue;
          } else {
            uniqueelement[unique] = arr[i];
            unique++;
          }
        }
      }
      count = 0;
    }
    for (int i = 0; i < unique; i++) {
      System.out.println(uniqueelement[i]);
    }
  }
}
