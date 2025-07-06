
class Solution {
    public int strStr(String haystack, String needle) {
        int s1_length = haystack.length();
        int s2_length = needle.length();
        boolean flag = false;
        if(s2_length == 0) return -1;
        if(s1_length < s2_length) return -1;
    
            for( int i = 0 ; i< s1_length;i++){
                for(int j = 0 ;j< s2_length;j++){
                        if(s1_length > (i+j)){
                            if(haystack.charAt(i+j) == needle.charAt(j)){
                                flag = true;
                            }else{
                                flag = false;
                                break;
                            }
                        }else{
                            if(flag){
                                return -1;
                            }
                        }
                }
                if(flag){
                    return i;
                }
            }
        
        return -1;
    }
}

// Optimized version
// =================

// class Solution {
//     public int strStr(String haystack, String needle) {
//         int s1_length = haystack.length();
//         int s2_length = needle.length();

//         if (s2_length == 0) return 0; // Edge case: empty needle
//         if (s1_length < s2_length) return -1; // If haystack is smaller, needle can't be found

//         for (int i = 0; i <= s1_length - s2_length; i++) { // Only iterate where needle can fit
//             if (haystack.substring(i, i + s2_length).equals(needle)) {
//                 return i; // Return starting index if match found
//             }
//         }
//         return -1;
//     }
// }
