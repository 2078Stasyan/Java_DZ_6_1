public class StatsService {

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            if (sale >= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int sumSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageSalesAmount(long[] sales) {
        int sum = sumSales(sales);
        int average;
            average = sum / sales.length;
        return average;
    }

    public int belowAverage(long[] sales) {
        int aver = averageSalesAmount(sales);
        int result = 0;
        for (long sale : sales) {
            if (sale >= aver) {
                result++;
            }
        }
        return result;
    }

    public int aboveAverage(long[] sales) {
        int aver = averageSalesAmount(sales);
        int result = 0;
        for (long sale : sales) {
            if (sale <= aver) {
                result++;
            }
        }
        return result;
    }
}


