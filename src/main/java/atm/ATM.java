package atm;

import java.util.*;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nominators = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            nominators.add(sc.nextInt());
        }
        Collections.sort(nominators);
        Handler_price prev = new Handler_price(nominators.get(0), null);
        for (int i = 1; i < nominators.size(); i++) {
            prev = new Handler_price(nominators.get(i), prev);
        }
        prev.process(sc.nextInt());
    }
}