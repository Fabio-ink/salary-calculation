package application;

import java.util.Scanner;

import entities.Funcionario;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.print("Name: ");
        funcionario.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        funcionario.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        funcionario.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Funcionario: " + funcionario.name + ", $ " + funcionario.NetSalary());
        System.out.println();

        System.out.print("Qual a percentagem de aumento no salário? ");
        Double percent = sc.nextDouble();

        System.out.println();
        System.out.println("Informações atualizadas: " + funcionario.name + ", $ " + funcionario.IncriseSalary(percent));

        sc.close();
    }
}
