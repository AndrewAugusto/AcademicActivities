package Atividade;

public class Derrubalata {

		//Atributos
		String Atirador;
		String Premio;
		int Bola;
		int Alvo;		
		
		//M�todos
		void Derrubarlatas(int Derrubado) {
			Alvo -= Derrubado;
		}
		
		void Ganhoupremio(String Surpresa) {	
			System.out.println("Parab�ns Ganhou um: " + Premio);
		}
		
		void Arremessodebola(int Tentativa){
			Bola -= Tentativa;
		}
		
		void Cliente(){
			System.out.println("O nome do Atirador � Andrew Augusto");
		}
		
}
