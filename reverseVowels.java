class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels= new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        
        char[] cur=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        
        while(i<j){
            while(i<j && !vowels.contains(cur[i]))
                i++;
            while(i<j && !vowels.contains(cur[j]))
                j--;
            char tmp=cur[i];
            cur[i]=cur[j];
            cur[j]=tmp;
        }
        return new String(cur);
    }
}