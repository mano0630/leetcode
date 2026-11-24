class Solution {
    List<String> result = new ArrayList<>();

    void solve(int openPar, int closePar, StringBuilder combination) {
        if (closePar == 0) {
            result.add(combination.toString());
            return;
        }
         if (openPar > 0) {
            combination.append('(');
            solve(openPar - 1, closePar, combination);
            combination.deleteCharAt(combination.length() - 1);
        }
        

        if (openPar < closePar) {
            combination.append(')');
            solve(openPar, closePar - 1, combination);
            combination.deleteCharAt(combination.length() - 1);
        }
    }

    public List<String> generateParenthesis(int n) {
        StringBuilder combination = new StringBuilder();
        solve(n, n, combination);
        return result;
    }
}