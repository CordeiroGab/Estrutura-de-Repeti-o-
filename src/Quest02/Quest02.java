package Quest02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Quest02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opção = -1;
        double valor = 0.0;

        System.out.println("______________________\n" +
                "1. Arroz- 8 usd\n" +
                "2. Feijao - 10 usd\n" +
                "3. Batata - 15 usd\n" +
                "4. Carne - 100 usd\n" +
                "0. Sair\n" +
                "Ingresse com uma opção\n" +
                "______________________");

        while (opção!=0) {



            System.out.print("Opção:");
            opção = sc.nextInt();

            switch (opção) {

                case 1 -> {
                    valor += 8;
                    break;
                }

                case 2 -> {
                    valor += 10;
                    break;
                }

                case 3 -> {
                    valor += 15;
                    break;
                }

                case 4 -> {
                    valor += 100;
                    break;
                }



            }if (opção !=0) {

                System.out.println("Valor atual: " + valor+ "usd\n");
                }

            }

        System.out.println("Total: "+ valor+"usd\n");
}
}

