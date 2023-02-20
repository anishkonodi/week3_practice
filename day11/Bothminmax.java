class Bothminmax {
  public static void main(String args[]) {
    int arr[] = { 23, 34, 11, 44, 55, 77 };
    int max =arr[0],min =arr[0],smax=0;
    for (int i = 0; i < arr.length; i++){
      if(max<arr[i]){
        smax=max;
        max=arr[i];
      }
      else if(smax<arr[i]){
        smax=arr[i];
      }
      if(min>arr[i]){
        min=arr[i];
      }
      }
    System.out.println("maximun value is" + max);
    System.out.println("second maximun value is" + smax);
    System.out.println("minmum value is" + min);
  }
}


// class Example1 {  
//  public static void main(String args[]){     
// int arr[]={23,45,12,90,55,33,10,24,78,45};       
// int max=0,secondMax=0,min=0;       
//  max=arr[0];   // 23     
//   min=arr[0];   // 23      
// for(int i=1;i<arr.length;i++){        
// if(max<arr[i]){    // 90<78          
// secondMax=max;    //secondmax=78         
//  max=arr[i];      // max=90       
//  }       
//  else if(secondMax<arr[i]){  // 55<78         
//  secondMax=arr[i];            //55        
// }         
// if(min>arr[i]){         
//  min=arr[i];        
// }            
//   }     
// System.out.println("Max value: "+max);    
// System.out.println("Second Max value: "+secondMax);        
//     System.out.println("Min  value: "+min);          
//  }
// }     
