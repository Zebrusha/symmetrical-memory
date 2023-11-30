package ru.netology.stats;

public class StatsService {
    public int CalcSumService(int[] arg) {
        int a = 0;
        for (int j = 0; j < arg.length; j++) {
            a = a + arg[j];
        }
        
        return a;
    }

    public int CalcAverageSalesAmount(int[] arg) {
        int a = 0;

        int b = 0;
        for (int i = 0; i < arg.length; i++) {
            b++;
        }
        for (int j = 0; j < arg.length; j++) {
            a = a + arg[j];

        }
        a = a / b;
       
        return a;
    }

    public int CalcMaxAverage(int[] arg) {
        int a = 0;
        for (int i = 0; i < arg.length; i++) {
            if (arg[i] >= arg[a]) {
                a = i;
            }
        }
        return a + 1;
    }

    public int CalcMinAverage(int[] arg) {
        int a = 0;
        for (int i = 0; i < arg.length; i++) {
            if (arg[i] < arg[a]) {
                a = i;
            }
        }
        return a + 1;
    }

    public int CalcAverageMinMonth(int[] arg) {
        int a = 1;
        int b = 0;
        int i = 0;

        for (int j = 0; j < arg.length; j++) {
            a += arg[j];
        }
        a = a / arg.length;

        for (int j : arg) {
            if (a < j) {
                i++;
            }
        }

        return i;
    }

    public int CalcAverageMaxMonth(int[] arg) {
        int a = 1;
        int b = 0;
        int i = 0;

        for (int j = 0; j < arg.length; j++) {
            a += arg[j];
        }
        a = a / arg.length;

        for (int j : arg) {
            if (a > j) {
                i++;
            }
        }

        return i;
    }

}



