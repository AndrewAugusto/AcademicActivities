import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AgenciaBancaria {

	public static void main(String[] args) {
		 ArrayList<Conta> contas = new ArrayList<>();
	        ArrayList<Person> persons = new ArrayList<>();
			
	        Map <String, Conta> mapaContas = new HashMap<String, Conta>();
	        
	        Set <String> CPFClientes = new HashSet<String>();

	        //Adicionar Pessoa
	        Person person1 = new Person("424.687.497-74", "Andrew Augusto");
	        Person person2 = new Person("576.218.367-67", "Renata Silveira");
	        Person person3 = new Person("026.598.514-78", "Igor Almeida");

	        persons.add(person1);
	        persons.add(person2);
	        persons.add(person3);

	        //Adicionar contas
	        Conta account1 = new Conta(296, 535.55, person1.getNome());
	        Conta account2 = new Conta(001, 1567.37, person2.getNome());
	        Conta account3 = new Conta(294, 2016.08, person3.getNome());

	        contas.add(account1);
	        contas.add(account2);
	        contas.add(account3);


	        for (Person person : persons) {
	            CPFClientes.add(person.getCpf());
	        }

	        //Relacionando Cpf a uma conta
	        for (int i = 0; i < persons.size(); i++) {
	            Person pessoa = persons.get(i);
	            Conta conta = contas.get(i);
	            mapaContas.put(pessoa.getCpf(), conta);
	        }
	        
	        //Retorna dados pelo CPF
	        String cpf = "424.687.497-74";
	        Conta conta = (Conta)mapaContas.get(cpf);
	        System.out.println();
	        System.out.println("CPF: " + cpf + conta.toString());
	    }
	}
