import java.util.*;

public class day99 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int total = 1 << N;

            List<Long> subsetSums = new ArrayList<>();
            for (int i = 0; i < total; i++) {
                subsetSums.add(sc.nextLong());
            }

            Collections.sort(subsetSums);

            List<Long> result = new ArrayList<>();
            List<Long> builtSums = new ArrayList<>();
            builtSums.add(0L);

            // Use freq map to remove sums safely
            Map<Long, Integer> freq = new HashMap<>();
            for (long val : subsetSums) {
                freq.put(val, freq.getOrDefault(val, 0) + 1);
            }

            // Remove empty subset value
            freq.put(0L, freq.get(0L) - 1);

            for (int i = 0; i < N; i++) {
                long smallest = -1;

                for (long key : freq.keySet()) {
                    if (freq.get(key) > 0) {
                        smallest = key;
                        break;
                    }
                }

                result.add(smallest);

                List<Long> newGenerated = new ArrayList<>();
                for (long s : builtSums) {
                    long formed = s + smallest;
                    freq.put(formed, freq.get(formed) - 1);
                    newGenerated.add(formed);
                }

                builtSums.addAll(newGenerated);
                Collections.sort(builtSums);
            }

            Collections.sort(result);
            for (long x : result) System.out.print(x + " ");
            System.out.println();
        }

        sc.close();
    }
}
