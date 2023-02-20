import java.util.Scanner;
class Printarray{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
   
     System.out.println("enter number of values");
    int n=s.nextInt();
    int arr[]=new int[n];
    System.out.println("enter values to store in array");
    
    for(int i=0;i<n;i++){
      arr[i]=s.nextInt();
    }
    System.out.println("Your numbers inside the array are");
    for(int i=0;i<n;i++){
      System.out.println(arr[i]);
    }
  }
}