package ru.netology.stats;

public class StatsService {
    public int calcSumService(long[] arrayOfNumbers) {
        long sum = 0;
        for (int j = 0; j < arrayOfNumbers.length; j++) {
            sum = sum + arrayOfNumbers[j];
        }

        return (int) sum;
    }

    public int calcAverageSalesAmount(long[] arrayOfNumbers) {
        long averageSum = 0;

        for (int j = 0; j < arrayOfNumbers.length; j++) {
            averageSum = averageSum + arrayOfNumbers[j];

        }
        averageSum = averageSum / arrayOfNumbers.length;

        return (int) averageSum;
    }

    public int calcMaxAverage(long[] arrayOfNumbers) {
        int maxAverage = 0;
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] >= arrayOfNumbers[maxAverage]) {
                maxAverage = i;
            }
        }

        return maxAverage + 1;

    }

    public int calcMinAverage(long[] arrayOfNumbers) {
        int minAverage = 0;
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] < arrayOfNumbers[minAverage]) {
                minAverage = i;
            }
        }
        return minAverage + 1;
    }

    public int calcAverageMinMonth(long[] arrayOfNumbers) {
        int averageSum = 1;
        int minMonth = 0;

        for (int j = 0; j < arrayOfNumbers.length; j++) {
            averageSum += arrayOfNumbers[j];
        }
        averageSum = averageSum / arrayOfNumbers.length;

        for (long j : arrayOfNumbers) {
            if (averageSum < j) {
                minMonth++;
            }
        }

        return minMonth;
    }

    public int calcAverageMaxMonth(long[] arrayOfNumbers) {
        int averageSum = 1;
        int maxMonth = 0;

        for (int j = 0; j < arrayOfNumbers.length; j++) {
            averageSum += arrayOfNumbers[j];
        }
        averageSum = averageSum / arrayOfNumbers.length;

        for (long j : arrayOfNumbers) {
            if (averageSum > j) {
                maxMonth++;
            }
        }

        return maxMonth;
    }

}



