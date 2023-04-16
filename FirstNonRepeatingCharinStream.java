import java.util.*;

// package Queue;

//first non repeating character
public class FirstNRCharacter {
    public static void main(String[] args) {
        String str = "aabccxb";
        int[] freq = new int[26];
        Queue<Character> q = new LinkedList<>();

        char[] ans = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;

            while(!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }
            if (q.isEmpty()) {
                ans[i] = '#';
            } else {
                ans[i] = q.peek();
            }
        }

        for(int i=0; i<ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

    }
}
