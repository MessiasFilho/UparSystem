package Entidades;

public class Usuario {

	private String nome ; 
	private Integer idade ; 
	private String Email ; 
	
	
	public Usuario () {}
	
	public Usuario (String no , Integer id , String email ) {
		
		nome = no ; 
		idade = id ; 
		Email = email ; 
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", idade=" + idade + ", Email=" + Email + "]";
	}
	
	
	
	
	
}
