public class Task5 {
    public static void main(String x[]){
        System.out.println(sumOfN(5));
    }
    public static int sumOfN(int n){
        if(n==1){
            return n;
        }
        return n+ sumOfN(n-1);
    }
}
