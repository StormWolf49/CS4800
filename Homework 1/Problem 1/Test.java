import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500));
        employees.add(new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32));
        employees.add(new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47));
        employees.add(new CommisionEmployee("Nicole", "Dior", "444-44-4444", 15, 50000));
        employees.add(new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700));
        employees.add(new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000));
        employees.add(new CommisionEmployee("Mahnaz", "Vaziri", "777-77-7777", 22, 40000));
    }
}
