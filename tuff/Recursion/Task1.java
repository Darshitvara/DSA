public class Task1{
   public static void main(String x[]){
      iterate(5);
   }
   public static int iterate(int n){
        if(n==0){
            return 0;
        }
        System.out.println("Task1 is completed.");
        return iterate(n-1);
   }
}
