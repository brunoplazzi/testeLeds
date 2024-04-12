import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Extrator e = new Extrator();
        ArrayList<Candidato> listaCandidatos = e.extrairCandidatos("candidatos.txt");
        ArrayList<Concurso> listaConcursos = e.extrairConcursos("concursos.txt");


        for(Concurso c : listaConcursos){
            System.out.println(c);
        }

    }
}