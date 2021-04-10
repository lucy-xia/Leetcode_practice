 public int strStr(String haystack, String needle) {
    int m = haystack.length();
    int n = needle.length();
    if (n>m) return -1;
    if(needle == null || haystack == null) return 0;
    for(int i = 0; i <= m-n; i++){
        if(haystack.substring(i, i+n).equals(needle))  //substring是取字符串中的某几个字
            return i;
    }
    return -1;
}