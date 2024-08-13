package entities;

public class Address {
	// Address = Endereço
	
	// Atributo
	private String email; // email = correspondencia eletrônica
	private String phone; // phone = telefone
	
	// Método Getter e Setter
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhone(String phone) {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	// Método Construtor
	
	public Address() {
		
	}
	
	public Address(String email, String phone) {
		this.email = email;
		this.phone = phone;
	}
	
	// Método
}
