class Solution {
    class Pair{
        int row;
        int col;
        Pair(int row,int col){
            this.row=row;
            this.col=col;
        }
    }
    public int limitFinder(int row,int col){
        int rowBox=row/3; //i.e 0 || 1 || 2
        int colBox=col/3; //i.e 0|| 1 || 2   
        /*{but we need coordinates together like which 3*3 cell it belong to i.e 1 || 2 || 3 || 4 ||.....|| 9}*/
        return rowBox*3+colBox;

    }
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer,ArrayList<Pair>> hm = new HashMap<>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='.')    //its important to avoid the '.' char 
                    continue;
                int val=board[i][j]-'0';
                int limit=limitFinder(i,j);
                if(hm.containsKey(val)){
                    ArrayList<Pair> l=hm.get(val);
                    for(int k=0;k<l.size();k++){
                        int row=l.get(k).row;
                        int col=l.get(k).col;
                        if(row==i ||col==j ||limitFinder(row,col)==limit) return false;
                    }
                }
                if(!hm.containsKey(val)){
                    hm.put(val,new ArrayList<>());
                }
                hm.get(val).add(new Pair(i,j));
            }
        }
        return true;
    }
}
