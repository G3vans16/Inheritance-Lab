package staff;

public abstract class Employee {

    private String name;
    private Integer niNumber;
    private Double salary;

    public Employee(String name, Integer niNumber, Double salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public Integer getNiNumber(){
        return this.niNumber;
    }

    public Double getSalary() {
        return this.salary;
    }

    public void raiseSalary(Double raiseAmount){
        this.salary += raiseAmount;
    }

    public void payBonus(){
//        double bonus = getSalary()/100;
        this.salary += getSalary()/100;
    }
}
