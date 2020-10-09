// CaloriesCalculator.java
public class CaloriesCalculator {
    public static final double KILOGRAMS_PER_POUND = 2.2;
    public static final int RUNNING_METS = 10;
    public static final int BASKETBALL_METS = 8;
    public static final int SLEEPING_METS = 1;

    public static void main(String[] args) {
        double weightInKilograms = 150 / KILOGRAMS_PER_POUND;
        double runningTimeInMinutes = 30;
        double basketballTimeInMinutes = 30;
        double sleepintTimeInMinutes = 6 * 60;

        double caloriesBurnedForRunning = 0.0175
                * RUNNING_METS * weightInKilograms
                * runningTimeInMinutes;

        double caloriesBurnedForBasketball = 0.0175
                * BASKETBALL_METS * weightInKilograms
                * basketballTimeInMinutes;

        double caloriesBurnedForSleeping = 0.0175
                * SLEEPING_METS * weightInKilograms
                * sleepintTimeInMinutes;

        double totalCaloriesBurned = caloriesBurnedForRunning
                + caloriesBurnedForBasketball
                + caloriesBurnedForSleeping;

        System.out.println(
                "Number of calories burned for running:    "
                        + caloriesBurnedForRunning);

        System.out.println(
                "Number of calories burned for basketball: "
                        + caloriesBurnedForBasketball);

        System.out.println(
                "Number of calories burned for sleeping:   "
                        + caloriesBurnedForSleeping);

        System.out.println(
                "\nTotal number of calories burned per minute: "
                        + totalCaloriesBurned);
    }
}