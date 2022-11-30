package Programa;

public class Cliente {

	private static int counter = 1;
	
	private String nome;
	private String cpf;
	private String email;

	
		
	public Cliente(String nome, String cpf, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		setCounter(getCounter() + 1);
	}
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
		
	}
	
	public String toString() {
		return "\nNome: " + this.getNome() + 
				"\nCPF: " + this.getCpf() +
				"\nEmail: " + this.getEmail();
		
	}
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		Cliente.counter = counter;
	}
	


}
