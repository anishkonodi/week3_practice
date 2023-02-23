class LastOccurence {
  public static void main(String args[]) {

    int index = 0;
    int arr[] = {1,2,3,4,3,2,5};
    int count = 0,size=arr.length;
    int duplicate[]=new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          count = count + 1;
          if (count == 1) {
             duplicate[index] = j;
            index++;
          }
        }
      }
      count=0;
    }
    for(int i=0;i<index;i++){
      for (int k=duplicate[i];k<arr.length-1; k++) {
        arr[k] = arr[k+ 1];
      }
      size--;
    }
  for(int i=0;i<size;i++){
    System.out.println(arr[i]);
  }
  }
}