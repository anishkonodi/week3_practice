class Deleteatfirst {
  public static void main(String args[]) {
    int arr[] = { 22, 33, 44, 55, 66, 77, 88, 99, 99 };
    int newarr[] = new int[15];
    int newarrindex = 0;
    for (int i = 1; i < arr.length; i++) {
      newarr[newarrindex] = arr[i];
      newarrindex++;
    }
    System.out.println("Ater deleting to the first index the elements in the array are");
    for (int i = 0; i < newarrindex; i++) {
      System.out.println(newarr[i]);
    }
  }
}