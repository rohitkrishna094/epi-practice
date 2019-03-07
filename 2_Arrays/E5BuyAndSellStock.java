
/*
 *
 * Write a program that takes an array denoting the daily stock price and returns the max profit
 * that could be made by buying and then selling one share of that stock. Time complexity is O(n)
*/

import java.util.*;
import java.util.stream.Collectors;

public class E5BuyAndSellStock {
    public static void main(String[] args) {
        double[] prices = { 310, 315, 275, 295, 260, 270, 290, 230, 255, 250 };
        List<Double> list = Arrays.stream(prices).boxed().collect(Collectors.toList());
        double res = computeMaxPrices(list);
        System.out.println(res);
    }

    public static double computeMaxPrices(List<Double> prices) {
        double minPrice = Double.MAX_VALUE, maxPrice = Double.MIN_VALUE;
        for (int i = 0; i < prices.size(); i++) {
            maxPrice = Math.max(maxPrice, prices.get(i) - minPrice);
            minPrice = Math.min(minPrice, prices.get(i));
        }
        return maxPrice;
    }
}