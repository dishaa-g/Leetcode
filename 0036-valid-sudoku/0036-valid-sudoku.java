class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n=9;

        HashSet<Character>[] rows = new HashSet[n];
        HashSet<Character>[] cols = new HashSet[n];
        HashSet<Character>[] box = new HashSet[n];

        for (int i = 0; i < n; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            box[i] = new HashSet<>();
        }

        for(int r=0;r<n;r++){
            for(int c=0;c<n;c++){
                char ch = board[r][c];
                if(ch=='.') continue;
                if(rows[r].contains(ch)) return false;
                rows[r].add(ch);
                if(cols[c].contains(ch)) return false;
                cols[c].add(ch);
                int index=(c/3)*3+(r/3);
                if(box[index].contains(ch)) return false;
                box[index].add(ch);
            }
        }
        return true;
    }
}