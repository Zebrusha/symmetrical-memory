package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    void amountSls() {
        StatsService service = new StatsService();

        long[] arrayOfNumbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int Expected = 180;
        int Actual = service.calcSumService(arrayOfNumbers);

        Assertions.assertEquals(Expected, Actual);
    }


    @Test
    void CalcAverageSalesAmountTest() {
        StatsService service = new StatsService();

        long[] arrayOfNumbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int Expected = 15;
        int Actual = service.calcAverageSalesAmount(arrayOfNumbers);

        Assertions.assertEquals(Expected, Actual);
    }

    @Test
    void CalcMaxAverageTest() {
        StatsService service = new StatsService();

        long[] arrayOfNumbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int Expected = 8;

        int Actual = service.calcMaxAverage(arrayOfNumbers);


        Assertions.assertEquals(Expected, Actual);
    }

    @Test
    void CalcMinAverageTest() {
        StatsService service = new StatsService();

        long[] arrayOfNumbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int Expected = 9;
        int Actual = service.calcMinAverage(arrayOfNumbers);

        Assertions.assertEquals(Expected, Actual);
    }

    @Test
    void CalcAverageMinMonth() {
        StatsService service = new StatsService();

        long[] arrayOfNumbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int Expected = 5;
        int Actual = service.calcAverageMinMonth(arrayOfNumbers);

        Assertions.assertEquals(Expected, Actual);
    }

    @Test
    void CalcAverageMaxMonth() {
        StatsService service = new StatsService();

        long[] arrayOfNumbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int Expected = 5;
        int Actual = service.calcAverageMaxMonth(arrayOfNumbers);

        Assertions.assertEquals(Expected, Actual);
    }


}
