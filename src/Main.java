import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Extrator e = new Extrator();
        ArrayList<Candidato> listaCandidatos = e.extrairCandidatos("test.txt");
        ArrayList<Concurso> listaConcursos = e.extrairConcursos("concursos.txt");

        System.out.println("LISTA DE CANDIDATOS");

        for(Candidato c : listaCandidatos){
            System.out.println(c);

        }

//        for(Concurso c : listaConcursos){
//            System.out.println(c);
//        }




    }
}