import java.util.Scanner;

class MenuProgram {
  Scanner s = new Scanner(System.in);

  int arr[][] = { { 1, 2, 3, 4 }, { 4, 5, 6, 4 }, { 7, 8, 9, 4 }, { 2, 5, 7, 9 } };

  public void isDisplay() {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println("*******************");
  }

  public void isSum() {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {

        sum = sum + arr[i][j];
      }
    }
    System.out.println("The sum of the elements in array is " + sum);
    System.out.println("*******************");
  }

  public void isSquare() {
    if (arr.length == arr[0].length) {
      System.out.println("Yes it is Square matrix");
      System.out.println("*******************");
    } else {
      System.out.println("No it is not Square matrix");
      System.out.println("*******************");
    }
  }

  public void isDiagonal() {
    int sum = 0;
    System.out.println("The Diagonal Elements in the array are");
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (i == j) {
          System.out.println(arr[i][j]);
          sum = sum + arr[i][j];
        }
      }
    }
    System.out.println("The sum of the Diagonal Elements is " + sum);
    System.out.println("*******************");
  }

  public void viewOptions() {
    System.out.println("Enter your option");
    System.out.println("1. To Display all the elements in the 2D array");
    System.out.println("2. To get sum of all the elements in the 2D array");
    System.out.println("3. To check whether it is square matrix or not");
    System.out.println("4. To know Diagonal elements");
    System.out.println("0. To Exit");
    int option = s.nextInt();
    switch (option) {
      case 1: {
        isDisplay();
        viewOptions();
        break;
      }
      case 2: {
        isSum();
        viewOptions();
        break;
      }
      case 3: {
        isSquare();
        viewOptions();
        break;
      }
      case 4: {
        isDiagonal();
        viewOptions();
        break;
      }
      case 0: {
        System.out.println("Thank you");
        System.out.println("*******************");
        break;
      }
    }
  }

  public static void main(String args[]) {
    MenuProgram obj = new MenuProgram();
    obj.viewOptions();
  }
}