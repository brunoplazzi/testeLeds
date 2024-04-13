import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static int menu(){

        Scanner s = new Scanner(System.in);
        int op;

        String strMenu = "Digite o numero da opção desejada:\n" +
                            "(1) Listar concursos, com base no CPF\n" +
                            "(2) Listar candidatos compatíveis, com base no código do concurso\n" +
                            "(0) SAIR";

        System.out.println(strMenu);

        op = Integer.parseInt(s.nextLine());

        while(op < 0 || op > 2){
            System.out.println("OPÇÃO INVÁLIDA");
            System.out.println(strMenu);
            op = Integer.parseInt(s.nextLine());
        }

        return op;
    }


    public static void main(String[] args) {

        //inicia extrator
        Extrator e = new Extrator();

        //le arquivos txt de candidatos e concursos
        ArrayList<Candidato> listaCandidatos = e.extrairCandidatos("candidatos.txt");
        ArrayList<Concurso> listaConcursos = e.extrairConcursos("concursos.txt");

        //inicia menu de opcoes
        int op = menu();

        if(op == 1){
            //recebe cpf, retorna lista de concursos compativeis
            System.out.println(op + " to implement");
        }else if( op == 2){
            //recebe código do concurso, retorna lista de candidatos compatíveis
            System.out.println(op + " to implement");
        } else if (op == 0) {
            System.out.println("FIM DO PROGRAMA");
        }

    }
}