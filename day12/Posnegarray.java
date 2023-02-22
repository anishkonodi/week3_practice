class Posnegarray {
  public static void main(String args[]) {
    int arr[] = { 3, 5, -7, 9, -22, 89, 33, -45, 66, 77, -88, -66, 76 };
    int arr1[] = new int[arr.length];
    int arr2[] = new int[arr.length];
    int posindex = 0, negindex = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > 0) {

        arr1[posindex] = arr[i];
        posindex = posindex + 1;
      } else {

        arr2[negindex] = arr[i];
        negindex = negindex + 1;
      }
    }
    System.out.println("the positive numbers in the array are ");
    for (int i = 0; i < posindex; i++) {
      System.out.println(arr1[i]);
    }
    System.out.println("The negative numbers in the array are ");
    for (int i = 0; i < negindex; i++) {
      System.out.println(arr2[i]);
    }
  }
}