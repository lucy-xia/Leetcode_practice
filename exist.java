//method1: A & tmp
class Solution {
    public boolean exist(char[][] board, String word) {
        // if(board==null || board.length==0)
        //     return false;
        //char[] candidate= word.toCharArray();
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(helper(i,j,board,0,word))
                    return true;
            }
        }
        return false;
    }
    
    private boolean helper(int i,int j, char[][] board, int count,String word){
        if(count==word.length())
            return true;
        if(i<0 || i>=board.length ||j<0 || j>=board[0].length
            || board[i][j]!=word.charAt(count))
            return false;
        char tmp=board[i][j]; //暂存这个位置的char值
        board[i][j]='A'; //一个字母不能使用超过一次
        boolean result=helper(i+1,j,board,count+1,word) 
                    || helper(i-1,j,board,count+1,word) 
                    || helper(i,j+1,board,count+1,word) 
                    || helper(i,j-1,board,count+1,word);
        board[i][j]=tmp; //如果这次char没有用到，那么把它恢复，说不准接下来会用到
        return result;
    }
}

//method2: boolean[][] visited
public class Solution {
    static boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        visited = new boolean[board.length][board[0].length];
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if((word.charAt(0) == board[i][j]) && search(board, word, i, j, 0)){
                    return true;
                }
            }
        }
        
        return false;
    }
    
    private boolean search(char[][]board, String word, int i, int j, int index){
        if(index == word.length()){
            return true;
        }
        
        if(i >= board.length || i < 0 || j >= board[i].length || j < 0 
            || board[i][j] != word.charAt(index) 
            || visited[i][j]){
            return false;
        }
        
        visited[i][j] = true;
        if(search(board, word, i-1, j, index+1) 
           || search(board, word, i+1, j, index+1) 
           || search(board, word, i, j-1, index+1) 
           || search(board, word, i, j+1, index+1))
            return true;
 
        visited[i][j] = false;
        return false;
    }
}

//method3: HashSet<String> visited = new HashSet<>();
class Solution {
    public boolean exist(char[][] board, String word) {
        // if(board==null || board.length==0)
        //     return false;
        //char[] candidate= word.toCharArray();
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(helper(i,j,board,0,word,new HashSet<>()))
                    return true;
            }
        }
        return false;
    }
    
    private boolean helper(int i,int j, char[][] board, int count,String word, HashSet<String> visited){
        if(count==word.length())
            return true;
        if(i<0 || i>=board.length ||j<0 || j>=board[0].length
           || board[i][j]!=word.charAt(count)
           ||visited.contains(i+","+j))
            return false;
        visited.add(i+","+j);
        if(helper(i+1,j,board,count+1,word,visited) 
            || helper(i-1,j,board,count+1,word,visited) 
            || helper(i,j+1,board,count+1,word,visited) 
            || helper(i,j-1,board,count+1,word,visited))
            return true;
        visited.remove(i+","+j);
        return false;
    }
}