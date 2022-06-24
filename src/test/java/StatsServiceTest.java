import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @Test
    void MonthNumberMinSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 70, 14, 14, 18};
        long expected = 1;
        long actual = service.minSales(sales);
        System.out.println(actual);
        assertEquals(expected, actual);
    }

    @Test
    void MonthNumberMaxSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 70, 19, 20, 10, 14, 14, 18};
        long expected = 6;
        long actual = service.maxSales(sales);
        System.out.println(actual);
        assertEquals(expected, actual);
    }

    @Test
    void SummaSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 70, 19, 20, 10, 14, 14, 18};
        long expected = 233;
        long actual = service.sumSales(sales);
        System.out.println(actual);
        assertEquals(expected, actual);
    }

    @Test
    void AverageAmountOfSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 70, 19, 20, 10, 14, 14, 18};
        long expected = 19;
        long actual = service.averageSalesAmount(sales);
        System.out.println(actual);
        assertEquals(expected, actual);
    }

    @Test
    void monthlySalesBelowAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 70, 19, 20, 10, 14, 14, 18};
        long expected = 3;
        long actual = service.belowAverage(sales);
        System.out.println(actual);
        assertEquals(expected, actual);
    }

    @Test
    void monthlySalesAboveAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 70, 19, 20, 10, 14, 14, 18};
        long expected = 10;
        long actual = service.aboveAverage(sales);
        System.out.println(actual);
        assertEquals(expected, actual);
    }
}
