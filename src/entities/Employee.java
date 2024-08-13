package entities;

public class Employee {
	// Employee = Funcionário
	
	// Atributo
	private String name;
	private Double salary;
	
	// Método Getter e Setter
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getSalary() {
		return salary;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	// Método Construtor
	public Employee() {
		
	}
	
	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	// Método 
}
