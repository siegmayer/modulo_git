public class calculoMedio {
    public static void main(String args[]){
      notas();
    }
    private static void notas(){
        System.out.println("****notas****");

        int nota1 = 10;
        int nota2 = 7;
        int nota3 = 9;
        int nota4 = 8;
        System.out.println(nota1);
        System.out.println(nota2);
        System.out.println(nota3);
        System.out.println(nota4);
        System.out.println("****media****");
        int media = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println(media);



    }
}
