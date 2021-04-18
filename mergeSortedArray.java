class Solution {mergeSortedArray
    public void (int[] nums1, int m, int[] nums2, int n) {
        /*先將nums1陣列上的數值都放在整個整列的最後面，然後按照從小到大的數值要求比較nums1和nums2
        for(int i=0; i<m; i++){
            nums1[n+i]=nums1[i];
        }
        int a=0;
        int b=0;
        for(int i=0; i<m+n; i++){
            if(nums1[n+a]<=nums2[b]) {
                nums1[i]=nums1[n+a];
                a++;
            }
            else if (nums1[n+a]>nums2[b]) {
                nums1[i]=nums2[b];
                b++;
            }
        }
        */
        
        /*將待放入數字的位置指針設為i，按照從後往前的順序比較兩個陣列*/
         int p=m+n-1;
         int m1=m-1;
         int n1=n-1;
        while(n1>=0){
            if(m1>=0 && nums1[m1]>nums2[n1]){
                nums1[p--]=nums1[m1--];
            }
            else 
                nums1[p--]=nums2[n1--];
        }
    }
}