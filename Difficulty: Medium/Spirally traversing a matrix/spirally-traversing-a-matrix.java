class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int mat[][]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        int m = mat.length, n = mat[0].length;
        
        int minRow = 0 , maxRow = m-1;
        int minCol = 0, maxCol = n-1;
        
        while(minRow <= maxRow && minCol <=maxCol)
        {
            for(int j=minCol; j<=maxCol; j++)
            {
                ans.add(mat[minRow][j]);
            }
            minRow++;
            //Up to down
            if(minRow > maxRow || minCol > maxCol) break;
            for(int i=minRow; i<=maxRow; i++)
            {
                ans.add(mat[i][maxCol]);
            }
            maxCol--;
            
            //RIght to left
            if(minRow > maxRow || minCol > maxCol) break;
              for(int j=maxCol; j>=minCol; j--)
            {
                ans.add(mat[maxRow][j]);
            }
            maxRow--;
            
            // Below to above
           if(minRow > maxRow || minCol > maxCol) break;
            for(int i=maxRow; i>=minRow; i--)
            {
                ans.add(mat[i][minCol]);
            }
            minCol++;
        }
        return ans;
    }
}
