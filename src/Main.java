import java.util.ArrayList;
import java.util.List;
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

    public static ArrayList<Concurso> concursosCompativeis(String cpf, ArrayList<Candidato> listaCandidatos, ArrayList<Concurso> listaConcursos){

        //lista de retorno com os concursos compativeis
        ArrayList<Concurso> compCon = new ArrayList<>();

        //achar o candidato na lista de candidatos
        Candidato cand;
        for(Candidato c : listaCandidatos){

            if(c.getCpf().equals(cpf)){
                cand = c;

            }else{
                return null;
            }
        }


        //pra cada preferencia na sua lista de profissoes
        //procurar concurso na lista de concursos, mas tomar cuidado pra não adicionar 2x o mesmo
        //adicionar no compCon



        return compCon;
    }

    public static ArrayList<Candidato> candidatosCompativeis(String codigo){

        ArrayList<Candidato> compCan = new ArrayList<>();

        System.out.println(" to implement");
        return compCan;
    }


    public static void main(String[] args) {


        //inicia extrator e scanner
        Extrator e = new Extrator();
        Scanner s = new Scanner(System.in);

        //le arquivos de candidatos e concursos
        ArrayList<Candidato> listaCandidatos = e.extrairCandidatos("candidatos.txt");
        ArrayList<Concurso> listaConcursos = e.extrairConcursos("concursos.txt");


        //inicia menu de opcoes
        int op = menu();

        if(op == 1){

            //leitura do cpf
            System.out.printf("Digite o cpf do candidado (xxx.xxx.xxx-xx): ");
            String cpf = s.nextLine();

            ArrayList<Concurso> compCon =  concursosCompativeis(cpf, listaCandidatos, listaConcursos);

            //fazer funcao de printar listas e passar compativeis como parametro


        }else if( op == 2){

            //leitura do codigo
            System.out.printf("Digite o código do concurso: ");
            String codigo = s.nextLine();

            ArrayList<Candidato> compCan = candidatosCompativeis(codigo);

            //fazer funcao de printar listas e passar codigo como parametro

        } else if (op == 0) {
            System.out.println("FIM DO PROGRAMA");
        }

    }
}