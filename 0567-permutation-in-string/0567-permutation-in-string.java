class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        if(n>m)
        return false;

        HashMap<Character, Integer> map1=new HashMap<>();
        HashMap<Character, Integer> map2=new HashMap<>();

        for (int i = 0; i < n; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            map1.put(c1, map1.getOrDefault(c1, 0) + 1);
            map2.put(c2, map2.getOrDefault(c2, 0) + 1);
        }

        int matches = 0;
         for (int i = n; i < m; i++) {
            // Check if map1 and map2 have the same character frequencies
            if (map1.equals(map2)) {
                return true; // Found a permutation of s1 in s2
            }

            char charToRemove = s2.charAt(i - n); // Character leaving the window
            char charToAdd = s2.charAt(i); // Character entering the window

            // Update map2 for the new window
            map2.put(charToRemove, map2.get(charToRemove) - 1);
            if (map2.get(charToRemove) == 0) {
                map2.remove(charToRemove);
            }

            map2.put(charToAdd, map2.getOrDefault(charToAdd, 0) + 1);

        }

        // Check the last window
        return map1.equals(map2);

    }
}