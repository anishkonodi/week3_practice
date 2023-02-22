import java.util.Scanner;

class Searchcount {
  public static void main(String args[]) {
    Scanner s=new Scanner(System.in);
    System.out.println("enter element to search");
    int key=s.nextInt();
    int arr[] = { 23, 44,54,44,33,43,22,34,55,55,55,};
    int count=0;
    for (int i = 0; i < arr.length; i++) {
      if(key==arr[i]){
        count=count+1;
        
      }
    }
    if(count>=1){
        System.out.println("entered number is present ");
        System.out.println("entered number is present "+count+" times");
      }
      else{
        System.out.println("entered number is not present");
      }
  }
