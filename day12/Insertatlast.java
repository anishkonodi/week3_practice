import java.util.Scanner;

class Insertatlast {
  public static void main(String args[]) {
    Scanner s=new Scanner(System.in);
    System.out.println("enter element to insert");
    int key=s.nextInt();
    int arr[] = {22,33,44,55,66,77,88,99,99};
    int newarr[]=new int[15];
    int newarrindex=0;
    
    for(int i=0;i<arr.length;i++){
      newarr[newarrindex]=arr[i];
      newarrindex++;
    }
    newarr[newarrindex]=key;how
    System.out.println("Ater Inserting to the first index the elements in the array are");
     for(int i=0;i<=newarrindex;i++){
      System.out.println(newarr[i]);
    }
  }
}