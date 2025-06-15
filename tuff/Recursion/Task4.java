public class Task4 {
    public static void main(String x[]){
        iterate(5);
    }
    public static int iterate(int n){
        if(n==0){
            return 0;
        }
        System.out.println(n);
        return iterate(n-1);
    }
}
