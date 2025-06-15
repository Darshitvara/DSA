public class Task2 {
    public static void main(String x[]){
        iterate_name("Recursion",5);
    }
    public static int iterate_name(String x,int n){
        if(n == 0){
            return 0;
        }
        System.out.println(x);
        return iterate_name(x,n-1);
    }
}
