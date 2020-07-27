package Staff;

public abstract class Employee {

    private String name;
    private int NIN;
    private double salary;

    public Employee(String name, int NIN, double salary){
        this.name = name;
        this.NIN = NIN;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public int getNIN() {
        return NIN;
    }

    public String getName() {
        return name;
    }

    public void raiseSalary(double raiseAmount){
        if(raiseAmount > 0)
            this.salary += raiseAmount;
        else
            System.out.println("Negative number not accepted");
    }

    public double payBonus(double salary){
        return salary * 0.01;
    }
}
