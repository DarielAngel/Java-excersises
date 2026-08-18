public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        return (daysSkipped < 5) ? 1f : 0.85;
    }

    public int bonusMultiplier(int productsSold) {
        return (productsSold < 20) ? 10 : 13;
    }

    public double bonusForProductsSold(int productsSold) {
        return (double)(bonusMultiplier(productsSold) * productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salario = salaryMultiplier(daysSkipped) * 1000.0f + bonusForProductsSold(productsSold);
        return (salario < 2000.0f) ? salario : 2000.0f;
    } 
}
