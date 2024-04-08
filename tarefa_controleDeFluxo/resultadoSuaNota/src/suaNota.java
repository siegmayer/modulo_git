import java.util.Scanner;

public class suaNota {
        public static void main(String[] args) {
            Scanner a = new Scanner(System.in);
            System.out.println("insira sua nota 1 a 10");
            int nota1 = a.nextInt();

            Scanner b = new Scanner(System.in);
            System.out.println("insira sua nota 1 a 10");
            int nota2 = b.nextInt();

            Scanner c = new Scanner(System.in);
            System.out.println("insira sua nota 1 a 10");
            int nota3 = c.nextInt();

            Scanner d = new Scanner(System.in);
            System.out.println("insira sua nota 1 a 10");
            int nota4 = d.nextInt();

            int media = (nota1 + nota2 + nota3 + nota4)/4;

            System.out.println("suas notas são:" + nota1 + "," + nota2 +"," + nota3 +"," + nota4 + "?");
            Scanner e = new Scanner(System.in);

            String resposta = e.next();



                while (resposta.equals("Sim"))
                {
                    System.out.println("Sua media é :" + media);
                    break;

                }if (media >=7){

                    System.out.println("Você foi Aprovado");
                }else if(media >=5 && media <=6) {
                System.out.println("Você esta de Recuperação");
                }else{
                    System.out.println("Você foi Reprovado");

                }



            }

        }
