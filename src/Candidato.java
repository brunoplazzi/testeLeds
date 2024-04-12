import org.w3c.dom.ls.LSOutput;

public class Candidato {

    //atributos
    private String nome, sobrenome, dtNasc, cpf;
    private String[] profissoes;


    //construtor
    public Candidato(String nome, String sobrenome, String dtNasc, String cpf, String[] profissoes){

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dtNasc = dtNasc;
        this.cpf = cpf;
        this.profissoes = profissoes;
    }

    //metodos
    public String toString(){

        String sep = " | ";
        String nomeCompleto = this.getNome() + " " + this.getSobrenome();
        String niver = this.getDtNasc();

        String profs = "[";

        for(String s : this.getProfissoes()){
            profs = profs + s + ", ";
        }

        profs = profs.substring(0, profs.length() -2) + "]";

        return nomeCompleto + sep + niver + sep + this.getCpf() + sep + profs;
    }

    //getters
    public String getNome() {
        return this.nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public String getDtNasc() {
        return this.dtNasc;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String[] getProfissoes() {
        return this.profissoes;
    }
}
