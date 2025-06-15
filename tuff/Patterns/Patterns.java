// import java.util.*;
public class Patterns{
   public static void main(String x[]){
      // Demo obj = new Demo();
      // Scanner sc = new Scanner(System.in);
      // int outerLoop=5,innerLoop=5;
      // System.out.print("  Enter Value of i : ");
      // outerLoop = sc.nextInt();
      // System.out.print("  Enter Value of j : ");
      // innerLoop = sc.nextInt();
      // obj.printPattern22();

      System.out.println(Math.log10(100000) + 1);
   }
}
class Demo{
   public void printPattern1(){
      for(int i = 0;i< 5;i++){
         for(int j = 0 ; j<5;j++){
            System.out.print("*");
         }
         System.out.println();
      }
   }
   public void printPattern2(){
      for(int i = 0;i<= 5;i++){
         for(int j = 0 ; j<i;j++){
            System.out.print("*");
         }
         System.out.println();
      }
   }
   public void printPattern3(){
      for(int i = 0;i <= 5;i++){
         for(int j = 0 ; j<i;j++){
            System.out.print(j+1);
         }
         System.out.println();
      }
   }
   public void printPattern4(){
      for(int i = 0;i <= 5;i++){
         for(int j = 0 ; j<i;j++){
            System.out.print(i);
         }
         System.out.println();
      }
   }
   public void printPattern5(){
      for(int i = 5;i>0;i--){
         for(int j = 0 ; j<i;j++){
            System.out.print(" * ");
         }
         System.out.println();
      }
   }
   public void printPattern6(){
      for(int i = 5;i>0;i--){
         for(int j = 0 ; j<i;j++){
            System.out.print(j+1);
         }
         System.out.println();
      }
   }

   public void printPattern7(){
      for(int i = 10;i>0;i--){
         if(i % 2 == 0){
            for(int j = 0 ; j<i;j++){
               System.out.print(" ");
            }
            for(int k = 10 ; k >= i ; k--){
               System.out.print(" *");
            }
         }
         System.out.println();
      }
   }
   public void printPattern8(){
      for(int i = 10;i>0;i--){
            for(int j = 10 ; j>=i;j--){
               System.out.print(" ");
            }
            for(int k = 0 ; k < i ; k++){
               System.out.print(" *");
            }
         System.out.println();
      }
   }
   public void printPattern9(){
      System.out.println("\n\n");
      for(int i = 0;i<10;i++){
         if(i % 2 == 0){
            for(int j = 10 ; j>=i;j--){
               System.out.print(" ");
            }
            for(int k = 0; k <= i ; k++){
               System.out.print(" *");
            }
         }
         System.out.println();
      }
      for(int i = 9;i>0;i--){
      if(i % 2 != 0){
         for(int j = 11 ; j>=i;j--){
            System.out.print(" ");
         }
         for(int k = 0 ; k < i ; k++){
            System.out.print(" *");
         }
      }
      System.out.println();
   }
   System.out.println("\n\n");


   }
   public void printPattern10(){
      for(int i = 0;i<8;i++){
         for(int j = 0;j<=i;j++){
            System.out.print("*");
         }
         System.out.println();
      }
      for(int i = 7;i>0;i--){
         for(int j = i;j>0;j--){
            System.out.print("*");
         }
         System.out.println();
      }
   }
   public void printPattern11(){
      for(int i = 1;i<8;i++){
         for(int j = 1;j<=i;j++){
            if(j%2==0){

               System.out.print(" 0");
            }else{
               System.out.print(" 1");
            }
         }
         System.out.println();
      }
      
   }
   public void printPattern12(){
      for(int i = 1;i<5;i++){
         for(int j = 1;j<=i;j++){
               System.out.print(j);
         }
         for(int k = 4 ;k > i;k--){
            System.out.print(" ");
         }
         for(int l= 4;l>i;l--){
            System.out.print(" ");
         }
         for(int m = i;m>=1;m--){
            System.out.print(m);
         }
         System.out.println();
      }
      
   }
   public void printPattern13(){
      int k = 0;
      for(int i = 1;i<=5;i++){
         for(int j = 1;j<=i;j++){
            k++;
               System.out.print(" "+k);
         }
         
         System.out.println();
      }
      
   }
  
   public void printPattern14(){
      
      for(int i = 0;i<=5;i++){
         for(int j = 0;j<i;j++){
               System.out.print(((char)(65+j)));
         }
         System.out.println();
      }
      
   }
   public void printPattern15(){
      
      for(int i = 5;i >=0;i--){
         for(int j = 0;j<i;j++){
               System.out.print(((char)(65+j)));
         }
         System.out.println();
      }
      
   }
   public void printPattern16(){
      for(int i = 0;i<=5;i++){
         for(int j = 0;j<i;j++){
               System.out.print(((char)(65+(i-1))));
         }
         System.out.println();
      }
   }
   public void printPattern17(){
      for(int i = 0;i<5;i++){
         for(int k = 5;k>i;k--){
            System.out.print(" ");
         }
         for(int j = 0;j<=i;j++){
               System.out.print(((char)(65+j)));
         }
         for(int l = i;l>0;l--){
            System.out.print(((char)(65+(l-1))));
         }
         System.out.println();
      }
   }
   public void printPattern18(){
      for(int i = 5;i>0;i--){
         for(int j = i;j<=5;j++){
               System.out.print(((char)(65+(j-1))));
         }
         System.out.println();
      }
   }
   public void printPattern19(){
      System.out.println("\n\n");
      for(int i = 10;i>0;i--){
            for(int j = 0 ; j<i;j++){
               System.out.print("*");
            }
            for(int k = 10; k >i ; k--){
               System.out.print(" ");
            }
            for(int l= 10;l>i ;l--){
               System.out.print(" ");
            }
            for(int m = 0 ;m < i;m++){
               System.out.print("*");
            }
            
         System.out.println();
      }
      for(int i = 9;i>0;i--){
         for(int j = 10 ; j>=i;j--){
            System.out.print("*");
         }
         for(int k = 1 ; k < i ; k++){
            System.out.print(" ");
         }
         for(int l = 1 ; l<i;l++){
            System.out.print(" ");
         }
         for(int k = 10;k>=i;k--){
            System.out.print("*");
         }

      System.out.println();
   }
   System.out.println("\n\n");


   }


   public void printPattern20(){
      for(int i = 0;i<8;i++){
         for(int j = 0;j<=i;j++){
            System.out.print("*");
         }
         for(int k = 7;k>i;k--){
            System.out.print("  ");
         }
         for(int l = 0;l<=i;l++){
            System.out.print("*");
         }
         System.out.println();
      }
      for(int i = 7;i>0;i--){
         for(int j = i;j>0;j--){
            System.out.print("*");
         }
         for(int k=7;k>=i;k--){
            System.out.print("  ");
         }
         for(int j = i;j>0;j--){
            System.out.print("*");
         }
         
         System.out.println();
      }
   }
   public void printPattern21(){
      for(int i = 0;i<=6;i++){
         if(i%2==0){
            if(i==0 || i==6){
               for(int j=0;j<4;j++){
                  System.out.print(" *");
               }
            }else{
            for(int j = 0 ;j<4;j++){
               if(j == 3 || j== 0){
               System.out.print(" *");
               }else{
                  System.out.print("  ");
               }
            }
         }
         }
         System.out.println();
      }
   }
   public void printPattern22(){
   //    int k;
   //    for(int i = 0;i<7;i++){
   //       for(int j=0;j<7;j++){
   //          k=4;
            
   //          if((i==0 || i==6 || j==0 ||j==6) ){
   //             System.out.print( " " +k);
   //          }
   //          else if((i==1 || i==5) ||(j==1 || j==5)){
   //             k -= 1;
   //             System.out.print(" "+k);
   //          }
   //          else if((i==2 || i==4) || (j==2 || j==4)){
   //             k-=2;
   //             System.out.print(" "+k);
   //          }
   //          else{
   //             System.out.print(" 1");
   //          }
   //       }
   //       System.out.println();
   //    }
   // }

   for (int i = 0; i < 7; i++) {
      for (int j = 0; j < 7; j++) {
          int k = 4;
          // Calculate the minimum distance to the border of the matrix
          int minDistanceToBorder = Math.min(Math.min(i, 6 - i), Math.min(j, 6 - j));
          k -= minDistanceToBorder;
          
          System.out.print(" " + k);
      }
      System.out.println();
   }
}

}



   