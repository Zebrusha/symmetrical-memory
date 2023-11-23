package ru.netology.stats;

public class StatsService {
    public int CalcSumService(int[] arg) {
        int a = 0;
        for (int j = 0; j < arg.length; j++) {
            a = a + arg[j];
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
        for (int j = 0; j < arg.length; j++) {
            a = a + arg[j];

        }
        a = a / b;
        System.out.println(a);
        return a;
    }

    public int CalcMaxAverage(int[] arg) {
        int a = 0;
        for (int i = 0; i < arg.length; i++) {
            if (arg[i] >= arg[a]) {
                a = i;

            }
        }
        System.out.println(a + 1);
        return a + 1;
    }

    public int CalcMinAverage(int[] arg) {
        int a = 0;
        for (int i = 0; i < arg.length; i++) {
            if (arg[i] < arg[a]) {
                a = i;
            }
        }
        System.out.println(a + 1);
        return a + 1;
    }

   /* public int CalcAverageMinMonth(int[] arg) {
        int a = 0;
        int b = 0;
        int i;
        for (int c = 0; c < arg.length; c++) {
            b++;
        }
        for (int j = 0; j < arg.length; j++) {
            a = (a + arg[j]);
        }
        a = a / b;
        for (i = 0; i < arg.length; i++) {
            if (a < arg[i]) {
                i++;
            }
        }
        System.out.println(i);
        return i;
    }

    public int CalcAverageMaxMonth(int[] arg) {
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < arg.length; i++) {
            b++;
        }
        for (int j = 0; j < arg.length; j++) {
            a = (a + j) / b;
        }
        for (int k = 0; k < arg.length; k++) {
            if (a < arg[k]) {
                c++;
            }
        }
        return c;
    }
    */
}



