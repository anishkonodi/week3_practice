class Midvalue{
  public static void main(String args[]){
    int arr[]={12,23,45,66,77,54,33};
    int i=0,mid=0;
     mid=(arr.length)/2;
     if(mid%2==0){
       System.out.println("midle element is "+arr[mid-1]+"and "+arr[mid]);
     }
     else{
       System.out.println("Middle element is "+arr[mid]);
     }
  }
}