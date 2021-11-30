import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Empresa {

	public static void main(String[] args) {

        ArrayList<Parente> grau = new ArrayList<>();
        ArrayList<Informacoes> informacoes = new ArrayList<>();
        
        Map <Parente, Informacoes> InformacoesParentesco = new HashMap<Parente, Informacoes>();

        
        //Adicionar Nomes
        Parente vinculo1 = new Parente("Rosangela dos Santos Dalia", "49");
        Parente vinculo2 = new Parente("Cristina Rosa Dias Santos", "51");
        Parente vinculo3 = new Parente("Jennifer Dominique Dias", "21");
        Parente vinculo4 = new Parente("Romoaldo Dalia Dias", "50");
        Parente vinculo5 = new Parente("Luiz Fernando Dias Santos", "48");
        Parente vinculo6 = new Parente("Romoaldo Dalia Dias Santos", "51");
        
        grau.add(vinculo1);
        grau.add(vinculo2);
        grau.add(vinculo3);
        grau.add(vinculo4);
        grau.add(vinculo5);
        grau.add(vinculo6);

        
        //Adicionar Informacoes
        Informacoes Dados1 = new Informacoes("Tia", "São José dos Campos", "22/08/2021");
        Informacoes Dados2 = new Informacoes("Mae", "São José dos Campos", "29/11/2021");
        Informacoes Dados3 = new Informacoes("Irma", "São José dos Campos", "29/11/2021");
        Informacoes Dados4 = new Informacoes("Tio", "São José dos Campos", "22/08/2021");

        informacoes.add(Dados1);
        informacoes.add(Dados2);
        informacoes.add(Dados3);
        informacoes.add(Dados4);

        //Relacionameto de lista
        InformacoesParentesco.put(vinculo1, Dados1);
        InformacoesParentesco.put(vinculo2, Dados2);
        InformacoesParentesco.put(vinculo3, Dados3);
        InformacoesParentesco.put(vinculo4, Dados4);
        InformacoesParentesco.put(vinculo5, Dados4);
        InformacoesParentesco.put(vinculo6, Dados4);
        
        //Impressao das listas
        for (Map.Entry<Parente,Informacoes> entry : InformacoesParentesco.entrySet()){
            System.out.println (entry.getKey() + ", " + entry.getValue());
        }
    }
}
