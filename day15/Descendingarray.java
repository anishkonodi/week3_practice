class Descendingarray {
  public static void main(String args[]) {
    int arr[] = { -1,-7,-8,-9, 5, 6, 3, 2, 7,0 };

    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        int temp = 0;
        if(arr[j]<0){
              if (arr[i] < arr[j]) {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
        }
          else if(arr[i]==0){
            temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
          }
        else{
            if (arr[i] > arr[j]) {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
        }
      }
    }
    System.out.println("After sorting the elements in the array are");
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}