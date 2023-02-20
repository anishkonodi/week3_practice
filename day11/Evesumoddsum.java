class Evesumoddsum{
  public static void main(String args[]){
    int arr[]={1,3,4,5,3,2,7,8};
    int esum=0,osum=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]%2==0){
        esum=esum+arr[i];
      }
      else{
        osum=osum+arr[i];
      }
    }
    system.out.println("even sum in array"+esum);
    system.out.println("odd sum in array"+osum);
  }
}