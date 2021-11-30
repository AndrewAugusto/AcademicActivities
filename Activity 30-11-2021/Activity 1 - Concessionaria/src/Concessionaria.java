import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Concessionaria {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		ArrayList<Carro> concessionaria = new ArrayList<Carro>();

		HashMap<String, Carro> mp = new HashMap<String, Carro>();

		Carro car;
		int qtd_carro;

		System.out.println("Quantos carros deseja adicionar? ");
		qtd_carro = s.nextInt();

		for (int i = 1; i <= qtd_carro; i++) {
			car = new Carro();
			System.out.println();
			System.out.println("Insira os dados do carro: " + i);
			System.out.print("Marca: ");
			car.setMarca(s.next());
			System.out.print("Modelo: ");
			car.setModelo(s.next());
			System.out.print("Placa: ");
			car.setPlaca(s.next());
			System.out.print("Preço: ");
			car.setPreco(s.nextFloat());
			concessionaria.add(car);
			mp.put(car.getPlaca(), car);
		}

		for (int i = 0; i < concessionaria.size(); i++) {
			car = (Carro) concessionaria.get(i);
		}

		for (int i = 0; i < concessionaria.size(); i++) {
			car = (Carro) concessionaria.get(i);
		}

		System.out.println();
		System.out.println("Consulte os dados do carro pela placa: ");

		String plc = s.next();
		car = (Carro) mp.get(plc);

		System.out.println();
		System.out.println("Marca: " + car.getMarca() + " | Modelo: " + car.getModelo() + " | Placa: " + car.getPlaca()
				+ " | Preço: " + car.getPreco());
	}
}
