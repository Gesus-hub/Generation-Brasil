package Aula5;

/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

public class Aula5Exer1Cliente 
{
	private String nome;
	private String email;
	private String telefone;
	private String endereco;
	private String senha;
	
	public Aula5Exer1Cliente(String nome, String email, String telefone, String endereco, String senha)
	{
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
		this.senha = senha;
	}
	
	public void printAula5Exer1Cliente()
	{
		System.out.println("\nO nome cadastrado foi: "+nome);
		System.out.println("\nO e-mail informado: "+email);
		System.out.println("\nTelefone cadastrado: "+telefone);
		System.out.println("\nConfirme sua senha: "+senha);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
