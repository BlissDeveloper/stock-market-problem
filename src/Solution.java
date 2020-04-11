public class Solution {
    public static final int DAYS_IN_A_WEEK = 7;
    public static final int lowerLimit = 1;
    public static final int higherLimit = 100;
    static int stockPrices[] = new int[DAYS_IN_A_WEEK];


    public static void main(String[] args) {
        //Get the lowest value and highest
        //Their difference is the highest profit possible

        int lowestValue = 0, highestValue = 0, maximumProfit = 0;

        //Populating the array
        for (int i = 0; i < stockPrices.length; i++) {
            stockPrices[i] = generateRandomNumber();
            log("" + stockPrices[i]);
        }

        lowestValue = getLowestValue();
        highestValue = getHighestValue();

        maximumProfit = highestValue - lowestValue;

        log("The highest profit will be " + maximumProfit + " units.");
    }

    public static int generateRandomNumber() {
        return (int) (Math.random() * (higherLimit - lowerLimit));
    }

    public static void log(String message) {
        System.out.println(message);
    }

    public static int getLowestValue() {
        int candidate = stockPrices[0];
        for (int i = 0; i < stockPrices.length; i++) {
            if (stockPrices[i] < candidate) {
                candidate = stockPrices[i];
            }
        }
        return candidate;
    }
    public static int getHighestValue() {
        int candidate = stockPrices[0];
        for (int i = 0; i < stockPrices.length; i++) {
            if (stockPrices[i] > candidate) {
                candidate = stockPrices[i];
            }
        }
        return candidate;
    }

}
