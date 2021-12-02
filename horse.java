import java.util.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        List<Integer> s = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            s.add(in.nextInt());
        }
        Collections.sort(s);

        int min = 99999;
        for (int i = 1; i < s.size(); i++) {
            int diff = s.get(i) - s.get(i-1);
            if (diff < min) {
                min = diff;
            }
        }

        System.out.println(min);
    }
}
