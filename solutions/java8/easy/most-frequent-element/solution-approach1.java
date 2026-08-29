// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/bits-hyderabad-practice-test-1/challenges/most-frequent-element/problem?isFullScreen=true
// Problem     Most Frequent Element!
// Difficulty  Easy
// Subdomain   N/A
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-29, 03:55 p.m.
// ──────────────────────────────────────────────────

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int answer = Integer.MAX_VALUE;
        int maxFreq = 0;

        for (int x : map.keySet()) {
            int freq = map.get(x);

            if (freq > maxFreq) {
                maxFreq = freq;
                answer = x;
            } 
            else if (freq == maxFreq && x < answer) {
                answer = x;
            }
        }

        System.out.println(answer);

        sc.close();
    }
}
