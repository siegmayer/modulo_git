import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NomeSeparadoVirgula {
    public static void main(String[] args) {
        nomesSeparados();
        nomeSeparadosSexo();
    }

    private static void nomeSeparadosSexo() {
        List<String> misturada = new ArrayList<>();
        List<String> feminino = new ArrayList<>();
        List<String> masculino = new ArrayList<>();


        String nomesJunto = ("jailson Mendes-M,Edinaldo Pereira-M,Tammy Gretchen-F,Catarina Paolino-F");
        String[] nomes = nomesJunto.split(",");
        System.out.println("*******  Nomes misturados  ********");
        for(String listaMisturada : nomes){
          System.out.println(listaMisturada);
        };
        for (String listaMisturada : nomes){
            misturada.add(listaMisturada);
        };

        for (String sexos : misturada){
            char sexo = sexos.charAt(sexos.length() -1);
            if(sexo == 'M'){
                masculino.add(sexos);
            } else if (sexo == 'F') {
                feminino.add(sexos);

            }

        }
        System.out.println("******* Pessoas do sexo masculino: ******");
        for (String homem : masculino) {
            System.out.println(homem);
        }
        System.out.println("******* Pessoas do sexo feminino: ******");
        for (String mulher : feminino) {
            System.out.println(mulher);
        }



    }

    private static void nomesSeparados() {
        Scanner colocaNome = new Scanner(System.in);
        System.out.println("**** Escreva nomes seprados por virgulas ******");
        String osNome = colocaNome.nextLine();
        String[] nomes = osNome.split(",");
        System.out.println("**** nomes separados fora de ordem alfabetica ******");
        for (String listaFora : nomes) {
            System.out.println(listaFora);

        }
        ;

        List<String> nomesColetados = new ArrayList<>();

        for (String nomesSplitados : nomes) {
            nomesColetados.add(nomesSplitados);

        }
        Collections.sort(nomesColetados);
        System.out.println("nome coletados e em ordem alfabetica");
        for (String alista : nomesColetados) {
            System.out.println(alista);
        }


    }
}
