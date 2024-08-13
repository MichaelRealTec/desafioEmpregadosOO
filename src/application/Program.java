package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		// DesafioEmpregadosOO
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Atributo
		String name;
		Integer payDay;
		String email;
		String phone;
		Integer qtdEmployee;
		Employee employee;
		Department department;
		
		System.out.print("Nome do departamento: ");
		name = sc.nextLine();
		
		System.out.print("Dia do pagamento: ");
		payDay = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Email: ");
		email = sc.nextLine();
		
		System.out.print("Telefone: ");
		phone = sc.next();
		
		Address address = new Address(email, phone);
		department = new Department(name, payDay, address);
		
		
		System.out.print("Quantos funcionários tem o departamento? ");
		qtdEmployee = sc.nextInt();
		
		
		for(int i = 0; i < qtdEmployee; i++) {
			sc.nextLine();
			System.out.println("Dados do funcionário " + (i + 1));
			System.out.print("Nome: ");
			String nameEmp = sc.nextLine();
			System.out.print("Salário: ");
			Double salaryEmp = sc.nextDouble();
			
			employee = new Employee(nameEmp, salaryEmp);
			
			department.addEmployee(employee);			
			
		}
	
		showReport(department);
		
		sc.close();
	}
	
	public static void showReport(Department department) { // showReport = mostrar relatório
		// MOSTRAR NA TELA OS DADOS DO RELATÓRIO
		System.out.println();
		System.out.println("FOLHA DE PAGAMENTO");
		System.out.printf("Departamento %s = R$ %.2f\n", department.getName(), department.payroll());
		System.out.printf("Pagamento realizado no dia %d\n", department.getPayDay());
		System.out.println("Funcionários:");
		department.toString();
		System.out.print("Para dúvidas favor entrar em contato: vendas@lojatop.com\n");
	}

}
