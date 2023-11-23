package ru.netology.stats;

public class StatsService {
    public int CalcSumService(int[] arg) {
        int a = 0;
        for (int j : arg) {
            a = a + j;
        }
        System.out.println("Сумма всех продаж:" + a);
        return a;
    }

    public int CalcAverageSalesAmount(int[] arg) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < arg.length; i++) {
            b++;
        }
        for (int j : arg) {
            a = (a + j) / b;
        }

        return a;
    }

    public int CalcMaxAverage(int[] arg) {
        int a = 0;
        for (int i = 0; i < arg.length; i++) {
            if (arg[i] > arg[a]) {
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
        int a = 0;
        int b = 0;
        int i;
        for (int c = 0; c < arg.length; c++) {
            b++;
        }
        for (int j : arg) {
            a = (a + j) / b;
        }
        for (i = 0; i < arg.length; i++) {
            if (a < arg[i]) {
                i++;
            }
        }
        return i;
    }

    public int CalcAverageMaxMonth(int[] arg) {
        int a = 0;
        int b = 0;
        int i;
        for (int c = 0; c < arg.length; c++) {
            b++;
        }
        for (int j : arg) {
            a = (a + j) / b;
        }
        for (i = 0; i < arg.length; i++) {
            if (a > arg[i]) {
                i++;
            }
        }
        return i;
    }
}



