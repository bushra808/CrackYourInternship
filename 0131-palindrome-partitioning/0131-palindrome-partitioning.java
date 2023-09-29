class Solution {
    public List<List<String>> partition(String s) {
        ArrayList<List<String>> ans = new ArrayList<>();
        palin(s, 0, ans, new ArrayList<>());
        return ans;
    }

    public void palin(String s, int i, ArrayList<List<String>> ans, ArrayList<String> substrings) {
        if (i == s.length()) {
            ans.add(new ArrayList<>(substrings)); // Create a copy of substrings to avoid modifying the same instance
            return;
        }

        for (int j = i; j < s.length(); j++) {
            String curr = s.substring(i, j + 1);
            if (isPalindrome(curr)) {
                substrings.add(curr);
                palin(s, j + 1, ans, substrings);
                substrings.remove(substrings.size() - 1); // Backtrack by removing the last added substring
            }
        }
    }

    public boolean isPalindrome(String s) {
        StringBuilder reversedString = new StringBuilder();

        // Iterate through the characters of the input string in reverse order
        for (int i = s.length() - 1; i >= 0; i--) {
            reversedString.append(s.charAt(i));
        }

        // Convert the StringBuilder to a String
        String result = reversedString.toString();

        return s.equals(result);
    }
}
