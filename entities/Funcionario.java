package entities;

public class Funcionario {
    public String name;
    public Double grossSalary;
    public Double tax;

    public Double NetSalary(){
        return grossSalary - tax;
    }

    public Double IncriseSalary(Double percent){
        return NetSalary() + (grossSalary * (percent / 100));
    }

}
