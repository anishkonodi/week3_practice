import java.util.Scanner;

class InsertatFirst {
  public static void main(String args[]) {
    Scanner s=new Scanner(System.in);
    System.out.println("enter element to insert");
    int key=s.nextInt();
    int arr[] = {22,33,44,55,66,77,88,99,99};
    int newarr[]=new int[15];
    int arrindex=0,newarrindex=1;
    newarr[0]=key;
    for(int i=1;i<arr.length+1;i++){
      newarr[i]=arr[arrindex];
      arrindex++;
      newarrindex++;
    }
    System.out.println("Ater Inserting to the first index the elements in the array are");
     for(int i=0;i<newarrindex;i++){
      System.out.println(newarr[i]);
    }
  }
}