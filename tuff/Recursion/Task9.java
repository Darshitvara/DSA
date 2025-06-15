public class Task9 {
    public static void main(String x[]){
        fibbonaci(5);
    }
    public static void fibbonaci(int n){
        int n0 = 0,n1 = 1,n2=0;
        if(n==0){
            System.out.println(0);
            return;
        }
        while(n2 <= n){
            System.out.println(n2);
            n0 = n1;
            n1 = n2;
            n2 = n1+n0;
          }
        

    }
}
