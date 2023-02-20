import java.util.Scanner;

class Calculatorswitch {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int res, num1, num2;
    System.out.println("enter the num1");
    num1 = s.nextInt();
    System.out.println("enter the num2");
    num2 = s.nextInt();
    System.out.println("enter the operator to perform ");
    char c = s.next().charAt(0);
    switch (c) {
      case '+': {
        res = num1 + num2;
        System.out.println("the addition of two number is : " + res);
        break;
      }
      case '-': {
        res = num1 - num2;
        System.out.println("the subtraction of two number is : " + res);
        break;
      }
      case '*': {
        res = num1 * num2;
        System.out.println("the Multiplication of two number is : " + res);
        break;
      }
      case '/': {
        res = num1 / num2;
        System.out.println("the Division of two number is : " + res);
        break;
      }
      case '%': {
        res = num1 % num2;
        System.out.println("the Modulus of two number is : " + res);
        break;
      }
      default: {
        System.out.println("! Please enter valid operator within +,-,*,/,%  these : ");
        break;
      }
    }
  }
}