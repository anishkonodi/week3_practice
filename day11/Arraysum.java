class Arraysum {
  public static void main(String args[]) {
    int arr[] = { 23, 45, 12, 90, 55, 33 }, sum = 0;
    System.out.println("number of elements: " + arr.length);
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
      sum = sum + arr[i];
    }
    System.out.println("the sum of all the elements in the array is " + sum);
  }
}