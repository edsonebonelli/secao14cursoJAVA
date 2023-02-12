package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.outsourcedEmployee;

//EXERCÍCIO RESOLVIDO POLIMORFISMO

		/*
		 * Uma empresa possui funcionários próprios e tercerizados. Para cada funcionário, deseja-se 
		 * registrar nome, horas trabalhadas e valor por hora. Funcionários terceirizados possuem ainda uma despesa adicional.
		 * 
		 * O pagamento dos funcionários corresponde ao valor da hora multiplicaod pelas horas trabalhadas, sendo que os funcionários
		 * terceirizados ainda recebem um bônus correspondente a 110% de sua despesa adicional.
		 * 
		 * Fazer um programa para ler os dados de N funcionários (N fornecidos pelo usuários) e armazená-los
		 * em uma lista. Depois de ler todos os dados, mostrar nome e pagamentos de cada funcionário na mesma ordem em que foram digitados.
		 * 
		 * Construa um programa conforme projeto ao lado. Veja exemplo na próxima página.
		 */

public class Program_4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Employee #" + i + "data:");
			System.out.print("Outsource (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			if (ch == 'y') {
					System.out.print("Additional charge: ");
					double additionalCharge = sc.nextDouble();
					list.add(new outsourcedEmployee(name, hours, valuePerHour, additionalCharge));	
			}else {
				list.add(new Employee(name, hours, valuePerHour));
			}
		}
		System.out.println();
		System.out.println("PAYMENTS: ");
		for (Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
		sc.close();

	}

}
