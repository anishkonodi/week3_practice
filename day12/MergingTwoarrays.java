class MergingTwoarrays {
  public static void main(String args[]) {
    int arr1[] = { 3, 5, 7, 8, 5, 6, 9 };
    int arr2[] = { 23, 56, 34, 44, 33, 66, };
    int arr3[] = new int[arr1.length + arr2.length];
    int thirdindex = 0;
    for (int i = 0; i < arr1.length; i++) {
      arr3[thirdindex] = arr1[i];
      thirdindex++;
    }
    for (int i = 0; i < arr2.length; i++) {
      arr3[thirdindex] = arr2[i];
      thirdindex++;
    }
    System.out.println("Third array elements are ");
    for (int i = 0; i < thirdindex; i++) {
      System.out.println(arr3[i]);
    }
  }
}