package ru.netology.stats;

public class StatsService {
    public int calcSumService(long[] arr) {
        long sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum = sum + arr[j];
        }

        return (int) sum;
    }

    public int calcAverageSalesAmount(long[] arr) {
        long averageSum = 0;

        for (int j = 0; j < arr.length; j++) {
            averageSum = averageSum + arr[j];

        }
        averageSum = averageSum / arr.length;

        return (int) averageSum;
    }

    public int calcMaxAverage(long[] arr) {
        int maxAverage = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= arr[maxAverage]) {
                maxAverage = i;
            }
        }

        return maxAverage + 1;

    }

    public int calcMinAverage(long[] arr) {
        int minAverage = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[minAverage]) {
                minAverage = i;
            }
        }
        return minAverage + 1;
    }

    public int calcAverageMinMonth(long[] arr) {
        int averageSum = 1;
        int minMonth = 0;

        for (int j = 0; j < arr.length; j++) {
            averageSum += arr[j];
        }
        averageSum = averageSum / arr.length;

        for (long j : arr) {
            if (averageSum < j) {
                minMonth++;
            }
        }

        return minMonth;
    }

    public int calcAverageMaxMonth(long[] arr) {
        int averageSum = 1;
        int maxMonth = 0;

        for (int j = 0; j < arr.length; j++) {
            averageSum += arr[j];
        }
        averageSum = averageSum / arr.length;

        for (long j : arr) {
            if (averageSum > j) {
                maxMonth++;
            }
        }

        return maxMonth;
    }

}



