public class Task6 {
    public static void main(String x[]){
        System.out.println(factorial(5));
    }
    public static int factorial(int n){
        if(n==1){
            return n;
        }
        return n* factorial(n-1);
    }
}
