import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
public class HashMapColletion{
   public static void main(String x[]){
      Solution obj = new Solution();
      int arr[] = {1,2,1,3,2,1,1,4,4,5,8,9,4,2,2};
      int result[] = obj.hashMapOf(arr);
      for(int n : result){
         System.out.println(n);
      }
   }
}


class Solution{
   
   int[] hashMapOf(int a[]){
      HashMap<Integer,Integer> hmap = new HashMap<>();
      
      for(int element : a){
         int freq = 1;
         if(hmap.containsKey(element)) freq = hmap.get(element) +1 ;
         hmap.put(element,freq);
      }
      printMap(hmap);
      int result[] = new int[hmap.size()];
      AtomicInteger index = new AtomicInteger(0);
      hmap.forEach((k,v) -> {
         result[index.getAndIncrement()] = v;
      });
      return result;
   }
      
   void printMap(HashMap<Integer,Integer> hmap){
      for(Integer key : hmap.keySet()){
         System.out.println(key + " : " + hmap.get(key));
      }
      // hmap.forEach((key,value) -> {
      //    System.out.println(key + " : " + value);
      // });
   }
}