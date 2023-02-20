class Twomethods {
  int arr[] = { 123, 2, 4, 8, 3, 5, 7, 11, 121, 212, 333, 353 };
  int rev = 0, temp = 0, count = 0, rem = 0;
  int k = 0, i = 1;

  public void prime() {
    System.out.println("the prime numbers in the given array is ");

    for (k = 0; k < arr.length; k++) {
      count = 0;
      for (i = 1; i <= arr[k] / 2; i++) {
        if (arr[k] % i == 0) {
          count++;
        }
      }
      if (count == 1) {
        System.out.println(arr[k]);
      }
    }
  }

  public void palindrome() {
    System.out.println("the palindrome number in the given array is");
    for (k = 0; k < arr.length; k++) {
      temp=arr[k];
      rev=0;
      while (arr[k] != 0) {
        rem = arr[k] % 10;
        rev = (rev * 10) + rem;
        arr[k] = arr[k] / 10;
      }

      if (temp == rev) {
        System.out.println(temp);
      }
    }
  }

  public static void main(String args[]) {
    Twomethods obj = new Twomethods();
    obj.prime();
    obj.palindrome();

  }
}