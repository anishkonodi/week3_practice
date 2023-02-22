class Duplicateelements {
  public static void main(String args[]) {

    int index = 0;
    int arr[] = { 11, 22, 33, 33, 22, 44 };
    int duplicate[] = new int[arr.length];
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          count = count + 1;
          if (count == 1) {
            duplicate[index] = arr[j];
            index++;
          }
        }
      }
      count=0;
    }
    for (int k = 0; k < index; k++) {
      System.out.println(duplicate[k]);
    }
  }
}