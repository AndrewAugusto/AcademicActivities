package Atividade;

public class Aluno {
	
	//Atributos
	String nome;
	String curso;
	int prova;
	int idade;
	
	
	//M�todos
	void assistirAula() {
		System.out.println("O aluno ser� convidado para assistir a aula de LP1");
	}
	
	void fazerProva(int p1) {	
		prova += p1;
	}
	
	void calcularNota(int media){
		prova = media;
	}
	
}
