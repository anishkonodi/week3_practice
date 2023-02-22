import java.util.Scanner;

class InsertionDeletion {

  Scanner s = new Scanner(System.in);
  int arr[] = new int[100];
  int numelements = 0;

  public void deleteFirst() {
    for (int i = 0; i < numelements; i++) {
      arr[i] = arr[i + 1];
    }
    numelements--;
  }

  public void deleteLast() {
    if (numelements == 0) {
      System.out.println("Array is empty");

    } else {
      numelements--;
    }
  }

  public void deleteSpecific() {
    if (numelements == 0) {
      System.out.println("Array is empty");

    } else {
      System.out.println("enter the specific index value to delete ");
      int index = s.nextInt();
      if (index <= numelements) {
        for (int i = index; i < numelements; i++) {
          arr[i] = arr[i + 1];
        }
        numelements--;
      } else {
        System.out.println("enter valid index ");
      }
    }

  }

  public void insertSpecific() {
    System.out.println("enter the value to insert");
    int value = s.nextInt();
    System.out.println("enter the index value to insert your value");
    int indexvalue = s.nextInt();
    if (indexvalue <= numelements) {
      if (numelements == 0) {
        arr[indexvalue] = value;
      } else {
        for (int i = numelements; i > indexvalue; i--) {
          arr[i] = arr[i - 1];
        }
        arr[indexvalue] = value;
        numelements++;
      }
    } else {
      System.out.println("enter valid index value which is less than" + numelements);
    }

  }

  public void insertLast() {
    System.out.println("enter the number to insert at last index ");
    int num = s.nextInt();

    if (numelements == 0) {
      arr[0] = num;
      numelements++;
    } else {
      arr[numelements] = num;
      numelements++;
    }
  }

  public void insertFirst() {
    System.out.println("enter the number to insert at first index ");
    int num = s.nextInt();
    if (numelements == 0) {
      arr[0] = num;
      numelements++;
    } else {
      for (int i = numelements; i > 0; i--) {
        arr[i] = arr[i - 1];

      }
      arr[0] = num;
      numelements++;
    }
  }

  public void deleteSearch() {
    System.out.println("Enter search element");
    int searchelement = s.nextInt();
    int index = -1, count = 0;
    for (int i = 0; i < numelements; i++) {
      if (searchelement == arr[i]) {
        index = i;
        count = count + 1;
        break;
      }
    }
    if (count == 1) {
      System.out.println("Yes entered element is present in the index " + index);
    }
    if (index >= 0) {
      for (int i = index; i < numelements; i++) {
        arr[i] = arr[i + 1];
      }
      numelements--;
    } else {
      System.out.println("not found");
    }
  }

  public void Display() {
    System.out.println("After make some operations the elements the Aarray elements are");
    for (int i = 0; i < numelements; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public void viewOptions() {
    int option = 0;
    do {
      System.out.println("1. To Insert an element in first index position");
      System.out.println("2. To Insert an element in last index position ");
      System.out.println("3. To Insert an element in specific index position");
      System.out.println("4. To delete  an element in first index position");
      System.out.println("5. To delete  an element in last index position");
      System.out.println("6. To delete  an element in specific index position");
      System.out.println("7. To delete  a search element in an array");
      System.out.println("0. To exit ");
      System.out.println("choose your option");

      option = s.nextInt();

      switch (option) {
        case 1: {
          insertFirst();
          Display();
          break;
        }
        case 2: {
          insertLast();
          Display();
          break;
        }
        case 3: {
          insertSpecific();
          Display();
          break;
        }
        case 4: {
          deleteFirst();
          Display();
          break;
        }
        case 5: {
          deleteLast();
          Display();
          break;
        }
        case 6: {
          deleteSpecific();
          Display();
          break;
        }
        case 7: {
          deleteSearch();
          Display();
          break;
        }
        default: {
          System.out.println("thank you");
        }
      }
    } while (option != 0);
  }

  public static void main(String args[]) {
    InsertionDeletion obj = new InsertionDeletion();
    obj.viewOptions();
  }
}