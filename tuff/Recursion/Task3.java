public class Task3 {
    public static void main(String x[]){
        iterate(1,5);
    }
    public static int iterate(int i,int n){
        System.out.println(i);
        if(i==n){
            return 0;
        }
        i++;
        return iterate(i,n);
    }
}
