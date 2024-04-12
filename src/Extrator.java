import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Extrator {

    //metodos
    ArrayList<Candidato> extrairCandidatos(String nomeArquivo){

        ArrayList<Candidato> candidatos = new ArrayList<>();

        try{

            BufferedReader b = new BufferedReader(new FileReader(nomeArquivo));

            String linha;

            while((linha = b.readLine()) != null){

                String[] tokens = linha.split("\\s+");


                String nome = tokens[0].trim();
                String sobrenome = tokens[1].trim();
                String dataNascimento = tokens[2].trim();
                String cpf = tokens[3].trim();

                //tratamento do array recebido
                String[] interesses = Arrays.copyOfRange(tokens, 4, tokens.length);
                String interesse = String.join(" ", interesses);

                String conteudoInteresse = interesse.substring(1, interesse.length() - 1);
                String[] elementos = conteudoInteresse.split(", ");
                String[] vetor = new String[elementos.length];
                System.arraycopy(elementos, 0, vetor, 0, elementos.length);


                Candidato atual = new Candidato(nome, sobrenome, dataNascimento, cpf, vetor);
                candidatos.add(atual);
            }


        }catch (IOException e){

            System.out.println("Erro na leitura do arquivo de candidatos");
        }

        return candidatos;
    }

    ArrayList<Concurso> extrairConcursos(String nomeArquivo){

        ArrayList<Concurso> concursos = new ArrayList<>();

        try{

            BufferedReader b = new BufferedReader(new FileReader(nomeArquivo));

            String linha;

            while((linha = b.readLine()) != null){

                String[] tokens = linha.split("\\s+");

                String orgao = tokens[0].trim();
                String edital = tokens[1].trim();
                String codigo = tokens[2].trim();
                String[] vagas = Arrays.copyOfRange(tokens, 3, tokens.length);

                String vaga = String.join(" ", vagas);

                String conteudoVaga = vaga.substring(1, vaga.length() - 1);
                String[] elementos = conteudoVaga.split(", ");

                String[] vetor = new String[elementos.length];
                System.arraycopy(elementos, 0, vetor, 0, elementos.length);

                Concurso concurso = new Concurso(orgao, edital, codigo, vetor);
                concursos.add(concurso);
            }


        }catch (IOException e){

            System.out.println("Erro na leitura do arquivo de concursos");
        }

        return concursos;
    }




}
