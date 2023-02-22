import java.util.Scanner;

class Insert {
  public static void main(String args[]) {
    Scanner s=new Scanner(System.in);
    System.out.println("enter element to insert");
    int key=s.nextInt();
    System.out.println("enter specific position to insert");
    int position=s.nextInt();
    int arr[] = {22,33,44,55,66,77,88,99,99};
    int newarr[]=new int[15];
    int arrindex=0,newarrindex=1;
    newarr[position]=key;
    for(int i=0;i<arr.length;i++){
      if(position!=i){
      newarr[i]=arr[arrindex];
      arrindex++;
      newarrindex++;
      }
      else{
        continue;
      }
    }
    System.out.println("Ater Inserting to the specific index the elements in the array are");
     for(int i=0;i<newarrindex;i++){
      System.out.println(newarr[i]);
    }
  }
}