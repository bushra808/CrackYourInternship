class Solution {
    public boolean winnerOfGame(String colors) {
        int aliceMoves = 0;
        int bobMoves = 0;

        // Start from the second piece and end at the second-to-last piece
        for (int i = 1; i < colors.length() - 1; i++) {
            char current = colors.charAt(i);
            char prev = colors.charAt(i - 1);
            char next = colors.charAt(i + 1);

            if (current == 'A') {
                // Alice's turn, check if both neighbors are 'A'
                if (prev == 'A' && next == 'A') {
                    aliceMoves++;
                }
            } else if (current == 'B') {
                // Bob's turn, check if both neighbors are 'B'
                if (prev == 'B' && next == 'B') {
                    bobMoves++;
                }
            }
        }

        // Determine the winner based on the number of moves made by Alice and Bob
        return aliceMoves > bobMoves;
    }
}
