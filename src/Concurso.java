public class Concurso {

    //atributos
    private String orgao, edital, codigo;
    private String[] vagas;

    //construtor
    public Concurso(String orgao, String edital, String codigo, String[] vagas) {

        this.orgao = orgao;
        this.edital = edital;
        this.codigo = codigo;
        this.vagas = vagas;
    }

    //metodos
    public String toString(){

        //primeiros 3 campos
        String sep = " | ";
        String print = this.getOrgao() + sep + this.getEdital() + sep + this.getCodigo() + sep;


        String vags = "";

        for(String s : this.getVagas()){
            vags = vags + s + " ";
        }

        return print + vags;
    }


    //getters
    public String getOrgao() {
        return this.orgao;
    }

    public String getEdital() {
        return this.edital;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String[] getVagas() {
        return this.vagas;
    }
}
