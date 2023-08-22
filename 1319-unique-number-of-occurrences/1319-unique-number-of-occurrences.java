class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count occurrences of each value in the array
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Use a HashSet to keep track of unique occurrence values
        HashSet<Integer> uniqueOccurrences = new HashSet<>();

        // Iterate through the occurrences in the hashmap
        for (int occurrences : map.values()) {
            // If the same occurrence count is already in the set, return false
            if (uniqueOccurrences.contains(occurrences)) {
                return false;
            }
            // Otherwise, add the occurrence count to the set
            uniqueOccurrences.add(occurrences);
        }

        // If we've reached here, all occurrence counts are unique
        return true;
    }
}
