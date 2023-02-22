class Innerloop3 {
  public static void main(String args[]) {
    int j=90,k=10;
    for(int row=1;row<=5;row++){
      for(int col=1;col<=5;col++){
        if(row%2==1){
        
        System.out.print(k+" "); 
          k=k+1;
        }
        else{
        
        System.out.print(j+" ");
          j=j-1;
        }
      }
      System.out.println();
    }
  }
}

