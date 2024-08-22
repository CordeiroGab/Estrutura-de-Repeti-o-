package Quest03;

import java.util.Scanner;

public class Quest03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n=0, passos=-1, valor = 0 , soma=0, limite;

        System.out.print("Digite um número: ");
        n = sc.nextInt();

        System.out.print("Digite o limite : ");
        limite = sc.nextInt();

        int i = 1;

        System.out.print("Sequência: "+n+"->");

        while (i <= limite) {
            i++;

                  if (n % 2 == 0 ){n = n / 2;
                      System.out.print(n+"->");
                  }else {
                      n = n * 3 +1 ;
                      System.out.print(n+"->");
                  }
                  passos++;
                  valor ++;
                  soma+=n;
              }
                System.out.println("\nPassos: "+passos+", Termos: "+valor+ ", Soma: "+soma);

              }


            }

