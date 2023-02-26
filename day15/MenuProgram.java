import java.util.Scanner;

class MenuProgram {
  Scanner s = new Scanner(System.in);

  int arr[][] = { { 8, 2, 3, 7 }, { 4, 5, 9, 4 }, { 7, 8, 9, 4 }, { 2, 5, 1, 9 } };

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

  public void isTranspose() {
    System.out.println("Before transpose of a matrix");
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println("After transpose of a matrix");
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        System.out.print(arr[j][i] + " ");
      }
      System.out.println();
    }
    System.out.println("*******************");
  }

  public void isMax() {
    int max = arr[0][0], rowindex = 0, colindex = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (max <= arr[i][j]) {
          max = arr[i][j];
          rowindex = i;
          colindex = j;
        }
      }
    }
    System.out.println("*******************");
    System.out.println();
    System.out.println("The maximum element is " + max + " present in the index " + rowindex + " " + colindex);
    System.out.println("*******************");
    System.out.println();
  }

  public void isMin() {
    int min = arr[0][0], rowindex = 0, colindex = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (min >= arr[i][j]) {
          min = arr[i][j];
          rowindex = i;
          colindex = j;
        }
      }
    }
    System.out.println("*******************");
    System.out.println();
    System.out.println("The minimum element is " + min + " present in the index " + rowindex + " " + colindex);
    System.out.println("*******************");
    System.out.println();
  }

  public void isContinue(){
    System.out.println("1. If you want to continue ");
    System.out.println("0. If you want to EXIT ");
    int choice=s.nextInt();
    switch(choice){
      case 1:{
        viewOptions();
        break;
      }
      case 0:{
        System.out.println("Thank you");
        System.out.println("*******************");
        break;
      }
    }
  }

  public void viewOptions() {
    System.out.println("Please Select your option");
    System.out.println("1. To Display all the elements in the 2D array");
    System.out.println("2. To get sum of all the elements in the 2D array");
    System.out.println("3. To check whether it is square matrix or not");
    System.out.println("4. To know Diagonal elements");
    System.out.println("5. To get Transpose of a matrix");
    System.out.println("6. To get maximum element in two-dimensional array");
    System.out.println("7. To get minimum element in two-dimensional array");
    System.out.println("0. To Exit");
    System.out.println();
    System.out.println("Enter your option");
    int option = s.nextInt();
    switch (option) {
      case 1: {
        isDisplay();
        isContinue();
        break;
      }
      case 2: {
        isSum();
        isContinue();
        break;
      }
      case 3: {
        isSquare();
        isContinue();
        break;
      }
      case 4: {
        isDiagonal();
        isContinue();
        break;
      }
      case 5: {
        isTranspose();
        isContinue();
        break;
      }
      case 6: {
        isMax();
        isContinue();
        break;
      }
      case 7: {
        isMin();
        isContinue();
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
