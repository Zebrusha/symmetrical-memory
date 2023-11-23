package ru.netology.stats;

import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    void amountSls() {
        StatsService service = new StatsService();

        int[] arg = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int ExpectedSum = 180;
        int ActualSum = service.CalcSumService(arg);
    }

    @Test
    void CalcAverageSalesAmountTest() {
        StatsService service = new StatsService();

        int[] arg = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int ExpectedASA = 15;
        int ActualASA = service.CalcAverageSalesAmount(arg);

    }

    @Test
    void CalcMaxAverageTest() {
        StatsService service = new StatsService();

        int[] arg = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int ExpectedMAT = 5;
        int ActualMAT = service.CalcMaxAverage(arg);

    }

    @Test
    void CalcMinAverageTest() {
        StatsService service = new StatsService();

        int[] arg = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int ExpectedMiAT = 7;
        int Actual = service.CalcMinAverage(arg);

    }

    @Test
    void CalcAverageMinMonth() {
        StatsService service = new StatsService();

        int[] arg = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int ExpectedAMM = 5;
        int ActualAMM = service.CalcAverageMinMonth(arg);
    }

    @Test
    void CalcAverageMaxMonth() {
        StatsService service = new StatsService();

        int[] arg = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int Expected = 5;
        int Actual = service.CalcAverageMaxMonth(arg);
    }


}
