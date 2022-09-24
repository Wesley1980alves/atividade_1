package atividade3;

public class Executar {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa("ketty", "987654321", 20);

		p1.nome = "wesley luis alves";
		p1.cpf = "123456789";
		p1.idade = 25;

		// MOSTRANDO NA TELA OS DADOS DO CONTRUTOR PADRAO
		System.out.println("Nome " + p1.nome + "\nCpf:" + p1.cpf + "\nIdade:" + p1.idade);

		// MOSTRANDO OS DADOS DO CONSTRUTOR COM PARAMENTRO
		System.out.println("\nNome: " + p2.nome + "\nCpf: " + p2.cpf + "\nIdade " + p2.idade);
		p1.meusDados();

	}

}
