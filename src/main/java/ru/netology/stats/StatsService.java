package ru.netology.stats;

public class StatsService {
    public int calcSumService(int[] arr) {
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum = sum + arr[j];
        }

        return sum;
    }

    public int calcAverageSalesAmount(int[] arr) {
        int AverageSum = 0;

        for (int j = 0; j < arr.length; j++) {
            AverageSum = AverageSum + arr[j];

        }
        AverageSum = AverageSum / arr.length;

        return AverageSum;
    }

    public int calcMaxAverage(int[] arr) {
        int MaxAverage = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= arr[MaxAverage]) {
                MaxAverage = i;
            }
        }

        return MaxAverage + 1;

    }

    public int calcMinAverage(int[] arr) {
        int MinAverage = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[MinAverage]) {
                MinAverage = i;
            }
        }
        return MinAverage + 1;
    }

    public int calcAverageMinMonth(int[] arr) {
        int AverageSum = 1;
        int MinMonth = 0;

        for (int j = 0; j < arr.length; j++) {
            AverageSum += arr[j];
        }
        AverageSum = AverageSum / arr.length;

        for (int j : arr) {
            if (AverageSum < j) {
                MinMonth++;
            }
        }

        return MinMonth;
    }

    public int calcAverageMaxMonth(int[] arr) {
        int AverageSum = 1;
        int MaxMonth = 0;

        for (int j = 0; j < arr.length; j++) {
            AverageSum += arr[j];
        }
        AverageSum = AverageSum / arr.length;

        for (int j : arr) {
            if (AverageSum > j) {
                MaxMonth++;
            }
        }

        return MaxMonth;
    }

}



