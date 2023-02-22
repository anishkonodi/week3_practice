import java.util.Scanner;

class Delete {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter specific position or index  to delete");
    int position = s.nextInt();
    int arr[] = { 22, 33, 44, 55, 66, 77, 88, 99, 99 };
    int newarr[] = new int[15];
    int arrindex = 0;
    for (int i = 0; i < arr.length; i++) {
      if (position == i) {
        continue;
      } else {
        newarr[arrindex] = arr[i];
        arrindex++;
      }
    }
    System.out.println("Ater deleting at the specific index the elements in the array are");
    for (int i = 0; i < arrindex; i++) {
      System.out.println(newarr[i]);
    }
  }
}