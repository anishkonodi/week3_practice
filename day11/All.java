//5. WAP to find following of a given array.       Number of even elements :     Number of odd elements :     Sum of odd elements :     Sum of even elements :     Sum of all the elements:
//answer 

class All {
  public static void main(String args[]) {
    int arr[] = { 1, 3, 4, 5, 3, 2, 7, 8 };
    int esum = 0, osum = 0, sum = 0, ecount = 0, ocount = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 0) {
        esum = esum + arr[i];
        ecount = ecount + 1;
      } else {
        osum = osum + arr[i];
        ocount = ocount + 1;
      }
    }
    sum = esum + osum;
    System.out.println("even number count" + ecount);
    System.out.println("odd number count" + ocount);
    System.out.println("even sum in array" + esum);
    System.out.println("odd sum in array" + osum);
    System.out.println("sum of all the elements " + sum);
  }
}