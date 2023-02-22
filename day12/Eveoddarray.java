class Eveoddarray{
  public static void main(String args[]){
    int arr[]={3,5,7,9,22,89,33,45,66,77,88,66,76};
    int arr1[]=new int[arr.length];
    int arr2[]=new int[arr.length];
    int evenindex=0,oddindex=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]%2==0){
        
        arr1[evenindex]=arr[i];
        evenindex=evenindex+1;
      }
      else{
        
        arr2[oddindex]=arr[i];
        oddindex=oddindex+1;
      }
    }
    System.out.println("the even numbers in the array are ");
    for(int i=0;i<evenindex;i++){
    System.out.println(arr1[i]);
    }
    System.out.println("The odd numbers in the array are ");
    for(int i=0;i<oddindex;i++){
    System.out.println(arr2[i]);
    }
  }
}