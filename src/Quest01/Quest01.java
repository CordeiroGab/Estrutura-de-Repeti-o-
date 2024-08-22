package Quest01;

import java.util.Scanner;

public class Quest01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numb1, numb2, contador=0,soma=0;

        System.out.print("Digite um numero: ");
        numb1 = sc.nextInt();

        System.out.print("O segundo numero: ");
        numb2 = sc.nextInt();

        for (int i = numb1; i <= numb2; i++) {
            if (i % 3 == 0) {
                contador++;
                soma = soma + i;
            }

        }
        System.out.println("Intervalo:" +numb1 + " à " + numb2);
        System.out.println("Total de multiplos de 3: " + contador);;
        System.out.println("Total de multiplos de 3: " + soma);
    }

}



