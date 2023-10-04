import java.util.PriorityQueue;
class Solution{
public boolean isNStraightHand(int[] hand, int W) {
    int len = hand.length;
    if (len % W != 0) return false;  // If the hand cannot be divided evenly into groups of size W, return false.

    // Create a PriorityQueue to maintain the counts of cards.
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    
    // Populate the PriorityQueue with the counts of each unique card.
    for (int num : hand) {
        minHeap.offer(num);
    }
    
    while (!minHeap.isEmpty()) {
        int first = minHeap.poll();  // Get the smallest card number.
        
        // Check if there are W consecutive cards starting from 'first'.
        for (int j = 1; j < W; j++) {
            int next = first + j;
            
            // If the next consecutive card is not in the PriorityQueue, return false.
            if (!minHeap.remove(next)) {
                return false;
            }
        }
    }
    
    return true;  // If all cards can be grouped into consecutive sets of size W, return true.
}
}
