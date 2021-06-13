// class Solution {
//     public int longestPalindrome(String s) {
//         List<Character> array= new ArrayList<>();
//         for(int i=0; i<s.length(); i++){
//             if(array.contains(s.charAt(i))){
//                 s++;
//                 array.remove(s.charAt(i));
//             }
//             array.add(s.chatAt(i));    
//         }
//         return !array.isEmpty()?s++:s;
            
//     }
// }

class Solution {
     public int longestPalindrome(String s) {
         int[] count= new int[128]; //ASCII共有128个字符
         
         char[] ch=s.toCharArray(); //把字母对照ASCII码储存成数字
         for(int i=0;i<s.length();i++){  
            count[ch[i]]++;  
         }
     //另一种写法：
     // for(char c:s.toCharArray()){
     //     count[c]++;
     // }
         
         int result=0;
         for(int cur: count){
             result+=(cur/2*2);
             //另一种写法：
             //result+=(cur%2==0? cur: cur-1);
             if(result%2==0 && cur%2==1) //一旦让一个单独的cur成为result的一员， result就不是偶数了，下一个单独的cur就不能继续加进去result里面
                 result+=1;
         }
         return result;
         
           
             
     }       
}