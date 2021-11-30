public class Parente {

    String nome;
    String Idade;


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getRA() {
        return Idade;
    }


    public void setRA(String idade) {
        Idade = idade;
    }


    public Parente(String nome, String idade) {
        super();
        this.nome = nome;
        Idade = idade;
    }
    
    public String toString() {
        return "( " + nome + " ) Idade:" + Idade + " Anos" ;
    }
}