import java.util.ArrayList;
import java.util.List;

public class Separacao {
    public static void main(String[] args) {
        pessoas();
    }
      public static void pessoas(){
           System.out.println("****** Essas são as Pessoas ******");
//brendon franklin é meu irmão kkk
          List<Pessoa> pessoasSeparar = new ArrayList<>();
          pessoasSeparar.add(new Pessoa("Matheus Aparecido","Masculino"));
          pessoasSeparar.add(new Pessoa("Brendon Franklin","Feminino"));
          pessoasSeparar.add(new Pessoa("Maria Thereza","Feminino"));
          pessoasSeparar.add(new Pessoa("Thales Yan","Masculino"));
          pessoasSeparar.add(new Pessoa("Ana Tepecinha","Feminino"));


          for (Pessoa pissua : pessoasSeparar) {
              System.out.println(pissua.getNome());
          }
          System.out.println("****** Separando as Pessoas ******");
          List<Pessoa> sexoMasculino = new ArrayList<>();
          List<Pessoa> sexoFeminino = new ArrayList<>();

          for (Pessoa pessoa : pessoasSeparar){
              if (pessoa.getSexo().equals("Masculino")){
                  sexoMasculino.add(pessoa);

              }else if(pessoa.getSexo().equals("Feminino")){
                  sexoFeminino.add(pessoa);
              }


          }
          System.out.println("****** homens ******");
          for (Pessoa macho : sexoMasculino) {
              System.out.println(macho.getNome());
          }
          System.out.println("****** mulheres ******");

          for (Pessoa femea : sexoFeminino) {
              System.out.println(femea.getNome());
          }




      }


    }
