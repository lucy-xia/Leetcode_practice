/* Time Limit Exceeded
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;
        return help(head, null);
    }
    private TreeNode help(ListNode start, ListNode end){
        if(start == end) return null;
        
        ListNode slow = start;
        ListNode quick = start;
        
        while(quick!= null && quick.next !=null){
            slow=slow.next;
            quick= quick.next.next;
        }
        
        TreeNode root= new TreeNode(slow.val);
        root.left= help(start, slow);
        root.right=help(slow.next, end);
        return root;
    }
}
*/

class Solution {
	public TreeNode sortedListToBST(ListNode head){
		int n=0;
		ListNode p=head;
		while(p!=null){ //先遍歷一遍計算n
			n++;
			p=p.next;
		}
		int arr[]=new int[n];
		for(int i=0;i<n;i++){ //講list存進去array裡面
			arr[i]=head.val;
			head=head.next;
		}
		return sortedArrayToBST(arr,0,n-1);
	}
	 private TreeNode sortedArrayToBST(int[] nums, int left, int right){
    	if(left > right ) return null;
    	int mid= left+(right-left)/2;
    	TreeNode node= new TreeNode(nums[mid]);
    	node.left= sortedArrayToBST(nums, left, (mid-1)); //左邊是從left開始，即傳遞給help函數的左邊界
    	node.right= sortedArrayToBST(nums, (mid+1), right); 
    	return node;
    }
}

