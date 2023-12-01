package ru.netology.stats;

public class StatsService {
    public int calcSumService(int[] arg) {
        int sum = 0;
        for (int j = 0; j < arg.length; j++) {
            sum = sum + arg[j];
        }

        return sum;
    }

    public int calcAverageSalesAmount(int[] arg) {
        int AverageSum = 0;

        for (int j = 0; j < arg.length; j++) {
            AverageSum = AverageSum + arg[j];

        }
        AverageSum = AverageSum / arg.length;

        return AverageSum;
    }

    public int calcMaxAverage(int[] arg) {
        int MaxAverage = 0;
        for (int i = 0; i < arg.length; i++) {
            if (arg[i] >= arg[MaxAverage]) {
                MaxAverage = i;
            }
        }

        return MaxAverage + 1;
    }

    public int calcMinAverage(int[] arg) {
        int MinAverage = 0;
        for (int i = 0; i < arg.length; i++) {
            if (arg[i] < arg[MinAverage]) {
                MinAverage = i;
            }
        }
        return MinAverage + 1;
    }

    public int calcAverageMinMonth(int[] arg) {
        int AverageSum = 1;
        int MinMonth = 0;

        for (int j = 0; j < arg.length; j++) {
            AverageSum += arg[j];
        }
        AverageSum = AverageSum / arg.length;

        for (int j : arg) {
            if (AverageSum < j) {
                MinMonth++;
            }
        }

        return MinMonth;
    }

    public int calcAverageMaxMonth(int[] arg) {
        int AverageSum = 1;
        int MaxMonth = 0;

        for (int j = 0; j < arg.length; j++) {
            AverageSum += arg[j];
        }
        AverageSum = AverageSum / arg.length;

        for (int j : arg) {
            if (AverageSum > j) {
                MaxMonth++;
            }
        }

        return MaxMonth;
    }

}



