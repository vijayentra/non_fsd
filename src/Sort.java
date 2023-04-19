import java.util.*;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {6,4,4,2,1,2,3,3,3,5,5,5,5};

        
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int i : arr) {
            freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
        }

        List<Integer> sortedKeys = new ArrayList<>(freqMap.keySet());
        Collections.sort(sortedKeys, (a, b) -> {
            int freqCompare = freqMap.get(b).compareTo(freqMap.get(a));
            if (freqCompare == 0) {
                return a.compareTo(b);
            } else {
                return freqCompare;
            }
        });
 
        int[] sortedArr = new int[arr.length];
        int index = 0;
        for (int key : sortedKeys) {
            int freq = freqMap.get(key);
            for (int i = 0; i < freq; i++) {
                sortedArr[index++] = key;
            }
        }

        System.out.println(Arrays.toString(sortedArr));
    }
}
