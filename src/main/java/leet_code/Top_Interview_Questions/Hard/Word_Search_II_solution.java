package leet_code.Top_Interview_Questions.Hard;

import java.util.ArrayList;
import java.util.List;

public class Word_Search_II_solution {
    public static void main(String[] args) {
        char[][] board = {{'a','b','c'},{'a','e','d'},{'a','f','g'}};
        String[] words = {"eaafgdcba","eaabcdgfa"};
        List<String> ans = new ArrayList<>();
        for (String word : words){
            if (wordExists(board, word))
                ans.add(word);
        }

        System.out.println(ans.toString());
    }

    static boolean wordSearch(char[][] board, String word, int i, int j, int index) {
        if(index == word.length()) {
            return true;
        }
        int n = board.length;
        int m = board[0].length;
        if(i < 0 || j < 0 || i >= n || j >= m) {
            return false;
        }
        if(board[i][j] != word.charAt(index)) {
            return false;
        }
        boolean returnValue = wordSearch(board, word, i + 1, j, index + 1);
        returnValue |= wordSearch(board, word, i - 1, j, index + 1);
        returnValue |= wordSearch(board, word, i, j + 1, index + 1);
        returnValue |= wordSearch(board, word, i, j - 1, index + 1);
        return returnValue;
    }
    static boolean wordExists(char[][] board, String word) {
        int wordLen = word.length();
        if(wordLen == 0) {
            return true;
        }
        int n = board.length;
        int m = board[0].length;
        if(n == 0 || m == 0) {
            return false;
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if((board[i][j] - 'A') == (word.charAt(0) - 'A')) {
                    if(wordSearch(board, word, i, j, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
