import java.util.Scanner;

public class mod_10 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int soma = 0;
        double media;
          
            for (int i=0; i<4; i++) {
                System.out.println("Entre com uma nota");
                num = scan.nextInt();
                soma += num;
            }

            media = soma / 4;
           
            System.out.println("media  " + media);
            if (media >=7) {
                System.out.println("Voce esta aprovado " );
            } else if ( media >=5) {
                System.out.println("Voce de recuperação " );
            } else {
               System.out.println("reprovado" );
            }
            scan.close();
    }
}
