public class FinancialForecastor {
    public double predictFutureValueRecursive(double initialValue, double growthRate, int years) {
        if (years == 0) {
            return initialValue;
        }
        return predictFutureValueRecursive(initialValue, growthRate, years - 1) * (1 + growthRate);
    }
    public double predictFutureValueIterative(double initialValue, double growthRate, int years) {
        double result = initialValue;
        for (int i = 0; i < years; i++) {
            result *= (1 + growthRate);
        }
        return result;
    }
    public static void main(String[] args) {
        FinancialForecastor forecaster = new FinancialForecastor();

        double initialValue = 1000.0;  
        double growthRate = 0.10;      
        int years = 5;                

        double futureRecursive = forecaster.predictFutureValueRecursive(initialValue, growthRate, years);
        System.out.printf("Recursive: Future value after %d years: %.2f\n", years, futureRecursive);

        double futureIterative = forecaster.predictFutureValueIterative(initialValue, growthRate, years);
        System.out.printf("Iterative: Future value after %d years: %.2f\n", years, futureIterative);
    }
}
