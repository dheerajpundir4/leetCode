import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack("", 0, 0, n, result);
        return result;
    }

    private static void backtrack(String s, int left, int right, int n, List<String> result) {
        if (s.length() == 2 * n) {
            result.add(s);
            return;
        }

        if (left < n) {
            backtrack(s + '(', left + 1, right, n, result);
        }
        if (right < left) {
            backtrack(s + ')', left, right + 1, n, result);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        List<String> result = generateParenthesis(n);
        System.out.println(result);
    }
}
