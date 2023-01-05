package leet_code.Top_Interview_Questions.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Word_Search_II {
    public static void main(String[] args) {
//        char[][] board = {{'o','a','a','n'},{'e','t','a','e'},{'i','h','k','r'},{'i','f','l','v'}};
//        String[] words = {"eat","oath","pea","rain"};
        char[][] board = {{'a','a'},{'a','a'}};
        String[] words = {"aaaaa"};
        System.out.println(findWords(board, words));
    }

    public static List<String> findWords(char[][] board, String[] words) {
        ArrayList<String> ans = new ArrayList<>();
        int row=board.length, col= board[0].length;

        for (int n=0; n<words.length; n++){
            String word = words[n];
            ArrayList<int[]> arrList = findFirstCharAllOccurenceInMatrix(word.charAt(0), board, row, col);
            if (arrList.size()==0)
                continue;           // first char only not found

            for (int[] charPos : arrList){
                boolean found=true;

                ArrayList<String> visitedList = new ArrayList<>();
                visitedList.add(charPos[0] + "" + charPos[1]);

                for (int k=1; k<word.length(); k++){
                    charPos = findInMatrixAdj(visitedList, board, row, col,  word.charAt(k), charPos[0], charPos[1]);
                    visitedList.add(charPos[0] + "" + charPos[1]);
                    if (charPos[0] == -1){
                        found= false;
                        break;
                    }
                }
                if (found){
                    ans.add(word);
                    break;
                }
            }

        }
        return ans;
    }

    static int[] findInMatrixAdj(ArrayList<String> visitedList, char[][] board, int row, int col,char c, int i, int j){
        if (i-1>=0 && board[i-1][j]==c && !visitedList.contains(i-1 + "" + j))
            return new int[]{i-1, j};
        if (i+1<row && board[i+1][j]==c && !visitedList.contains(i+1 + "" + j))
            return new int[]{i+1, j};
        if (j-1>=0 && board[i][j-1]==c && !visitedList.contains(i + "" + (j-1)))
            return new int[]{i, j-1};
        if (j+1<col && board[i][j+1]==c && !visitedList.contains(i + "" + (j+1)))
            return new int[]{i, j+1};
        return new int[]{-1, -1};
    }

    static ArrayList<int[]> findFirstCharAllOccurenceInMatrix(char c, char[][] board, int row, int col){
        ArrayList<int[]> list = new ArrayList<>();
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                if (board[i][j] == c)
                list.add(new int[]{i, j});
            }
        }
        return list;
    }
}
