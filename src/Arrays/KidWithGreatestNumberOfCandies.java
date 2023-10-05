package Arrays;

import java.util.*;

public class KidWithGreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        System.out.println(kidsWithCandies(candies, 3));
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> arr = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (max <= candies[i]) {
                max = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            int sum = candies[i] + extraCandies;
            if (sum >= max) {
                arr.add(true);
            } else {
                arr.add(false);
            }
        }
        return arr;
    }
}
