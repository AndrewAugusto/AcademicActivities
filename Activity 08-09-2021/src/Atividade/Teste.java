package Atividade;

public class Teste {
	public static void main (String [] args) {
	
		//Classe Aluno
		System.out.println("---------------------------- Sobre o Aluno ----------------------------");
		
		Aluno aluno1 = new Aluno();
		
		aluno1.nome = "Andrew Augusto Dias";
		aluno1.prova = 8;
		aluno1.curso = "Banco de Dados";

		aluno1.assistirAula();
		System.out.println();
		
		aluno1.calcularNota(aluno1.prova);
		System.out.println("A média do aluno é:" + aluno1.prova);
		
		//Classe Carro
		System.out.println("---------------------------- Sobre o Carro ----------------------------");
		
		Carro ve = new Carro();
		
		ve.nome = "Virtus";
		ve.marca = "Volkswagen";
		ve.ano = 2020;
		ve.velocidade = 110;
		
		ve.acelerar(50);
		System.out.println("Velocidade Acelerando:" + ve.velocidade + "Km/h");
		
		ve.freiar(70);
		System.out.println("Velocidade Freiando:" + ve.velocidade + "Km/h");
		
		//Classe Derrubalata
		System.out.println("---------------------------- Sobre o Derruba Lata ----------------------------");
		
		Derrubalata out = new Derrubalata();
	
		out.Atirador = "Andrew Augusto";
		out.Premio = "Ursinho de Pelucia";
		out.Alvo = 10;
		out.Bola = 3;
		
		out.Arremessodebola(1);
		System.out.println("Você ainta tem " + out.Bola + " Bolas");
		
		out.Derrubarlatas(10);
		System.out.println("Faltam "+ out.Alvo + " latas para derrubar");
		
		out.Ganhoupremio(null);
		System.out.println();
	
	}
}
