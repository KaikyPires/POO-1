package Televisão;

import java.util.Scanner;

public class Televisao1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Televisao controle = new Televisao();

        controle.tv();

        if (controle.ligado == false) {

            char ligar = teclado.next().charAt(0);
            String fim = "iniciar";
            String comando = "";

            if (ligar == 'l') {
                controle.ligarTelevisao();
                System.out.println("Para desligar o Televisor basta digitar : d ");
                while (comando != fim) {
                    
                    comando = teclado.nextLine();
                    
                    switch (comando) {
                        case "w":
                            controle.aumentarvolume();
                            break;
                        case "s":
                            controle.diminuirvolume();
                            break;
                        case "q":
                            controle.aumentarcanal();
                            break;
                        case "a":
                            controle.diminuircanal();
                            break;
                        case "k":
                           controle.mostraStatus();
                            break;
                        case "d":    
                            comando = fim;
                    }
                    
                }
                controle.desligarTelevisao();
     }

 }

    }
}

