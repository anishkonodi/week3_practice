
class Maxrating {
  public static void main(String args[]) {
   
    int arr[][] = { { 4, 6, 2, 5 }, { 7, 9, 4, 8 }, { 6, 9, 3, 7 } };
     int max=arr[0][0],rowindex=0,colindex=0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if(max<=arr[i][j]){
          max=arr[i][j];
          rowindex=i;
          colindex=j;
        }
      }
    }
    System.out.println("The maximum rating is "+max+" in the index "+rowindex+" "+colindex);
  }
}