import java.util.Scanner;

class Search {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int arr[] = { 12, 13, 45, 56, 67, 89, 90, 100 };
    System.out.println("enter element to search in array");
    int searchkey = s.nextInt();
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == searchkey) {
        count = count + 1;
        System.out.println("Yes, entered element is present in index " + i);
        break;
      }
    }
    if (count == 0) {
      System.out.println("No, entered element is not present");
    }
  }
}