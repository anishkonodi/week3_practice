class Frequency {
  public static void main(String args[]) {
    int arr[] = { 10, 89, 10, 12, 77, 12, 90, 41 };
    int count = 1;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          count++;
          arr[j] = 0;
        }
      }
      if (arr[i] !=0) {
        System.out.println("The frequency of : "+arr[i]+" is " + count);
      }
      count = 1;
    }
  }
}