package Staff.Management;

public class Director extends Manager {
    private double budget;

    public Director(String name, int NIN, double salary, String deptName, double budget){
        super(name, NIN, salary, deptName);
        this.budget = budget;

    }

    public double getBudget() {
        return budget;
    }
}
