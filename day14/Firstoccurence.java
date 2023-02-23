
class Firstoccurence {
  public static void main(String args[]) {
    int arr[] = { 23, 89, 10, 12, 77, 10, 90, 41, 12 };
    int duplicate[] = new int[arr.length];
    int count = 0;
    int index = -1, indexvalue = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          count = count + 1;
          if (count == 1) {
            duplicate[indexvalue] = arr[j];
            indexvalue++;
          }
        }
      }
      count = 0;
    }
    int size = arr.length;
    for (int a = 0; a <= indexvalue; a++) {
      for (int i = 0; i < arr.length; i++) {
        if (duplicate[a] == arr[i]) {
          for (int k = i; k < arr.length - 1; k++) {
            arr[k] = arr[k + 1];
          }
          size--;
          break;
        }
      }
    }

    for (int i = 0; i < size; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();

    // for (int i = 0; i < indexvalue; i++) {
    // System.out.println(duplicate[i]);
    // }
  }
}