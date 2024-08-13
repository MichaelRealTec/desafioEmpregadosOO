package entities;
import java.util.ArrayList;
import java.util.List;

import javax.lang.model.util.SimpleAnnotationValueVisitor14;
public class Department {
	// Department = Departamento
	
	// Atributo
	private String name;  // name = nome
	private Integer payDay;  // payDay = dia do pagamento
	private List<Employee> employees = new ArrayList<Employee>(); // Criando uma lista para armazenar funcionário
	private Address address;
	
	// Método Getter e Setter
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getPayDay() {
		return payDay;
	}
	
	public void setPayDay(Integer payDay) {
		this.payDay = payDay;
	}
	
	
	public List<Employee> getEmployees(){
		return employees;
	}
	
	/* PARA PROTEGER A LISTA NÃO FOI CRIADO O MÉTODO GETTER E SETTER DE LIST EMPLOYEES
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	*/
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	// Método Construtor
	
	public Department() {
		
	}
	
	public Department(String name, Integer payDay, Address address) {
		this.name = name;
		this.payDay = payDay;
		this.address = address;
	}
	
	// Método
	public void addEmployee(Employee employee) {  // Comando responsável por acrescentar funcionário
		employees.add(employee);
	}
	
	public void removeEmployee(Employee employee) { // Comando responsável por remover funcionário
		employees.remove(employee);
	}
	
	public double payroll() {  // Comando responsável por calcular o valor da folha de pagamento
		double sum = 0.0;
		for(Employee emp : employees) {
			sum +=  emp.getSalary();
		}
		return sum;
	}
	
	@Override
	public String toString() {
				for(Employee emp : employees) {
					
					System.out.println(emp.getName());
				}
		return null;
	}
	
}
