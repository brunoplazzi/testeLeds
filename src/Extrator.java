import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Extrator {

    //metodos
    ArrayList<Candidato> extrairCandidatos(String nomeArq){

        ArrayList<Candidato> candidatos = new ArrayList<>();

        String nomeArquivo = nomeArq;

        try{

            BufferedReader b = new BufferedReader(new FileReader(nomeArquivo));

            String linha;

            while((linha = b.readLine()) != null){

                String[] tokens = linha.split("\\s+");


                String nome = tokens[0].trim();
                String sobrenome = tokens[1].trim();
                String dataNascimento = tokens[2].trim();
                String cpf = tokens[3].trim();
                String[] interesses = Arrays.copyOfRange(tokens, 4, tokens.length);


                Candidato atual = new Candidato(nome, sobrenome, dataNascimento, cpf, interesses);
                candidatos.add(atual);
            }


        }catch (IOException e){

            System.out.println("Erro na leitura do arquivo de candidatos");
        }

        return candidatos;
    }

    ArrayList<Concurso> extrairConcursos(String nomeArq){

        ArrayList<Concurso> concursos = new ArrayList<>();

        String nomeArquivo = nomeArq;

        try{

            BufferedReader b = new BufferedReader(new FileReader(nomeArquivo));

            String linha;

            while((linha = b.readLine()) != null){

                String[] tokens = linha.split("\\s+");

                String orgao = tokens[0].trim();
                String edital = tokens[1].trim();
                String codigo = tokens[2].trim();
                String[] vagas = Arrays.copyOfRange(tokens, 3, tokens.length);

                Concurso concurso = new Concurso(orgao, edital, codigo, vagas);
                concursos.add(concurso);
            }


        }catch (IOException e){

            System.out.println("Erro na leitura do arquivo de concursos");
        }

        return concursos;
    }




}
