import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      boolean executando = true;

      while(executando) {

          //fazer o usuario escolher o tipo de operação matematica
          System.out.println("Digite um numero da sua operação matematica, 1-adção, 2-subtração, 3-multiplicação, 4-divisão ou 5- para sair");
          int op = scanner.nextInt();


          //chamar função de acordo com a operação matematica que o usuario escolheu
          switch (op) {

              case 1:
                  int resultado = soma(scanner);
                  System.out.println("O resultado da sua adção é : " + resultado);
                  break;


              case 2:
                  int resultado2 = subtracao(scanner);
                  System.out.println("O resultado da sua subtracao é : " + resultado2);
                  break;

              case 3:
                  int resultado3 = multiplicacao(scanner);
                  System.out.println("O resultado da sua multiplicacao é : " + resultado3);
                  break;

              case 4:
                  int resultado4 = divisao(scanner);
                  System.out.println("O resultado da sua multiplicacao é : " + resultado4);
                  break;

              case 5:
                  executando = false;
                  System.out.println("Obrigado por escolher a nossa calculadora");
                  break;

              default:
                  System.out.println("Numero Invalido");
          }
      }
    }


    //funções apra resolver os problemas matematicos do usuario

    public static int soma(Scanner scanner){
        System.out.println("digite dois numeros para a soma");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        return n1 + n2;
    }


    public static int subtracao(Scanner scanner){
        System.out.println("digite dois numeros para a subtração");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        return n1 - n2;
    }


    public static int multiplicacao(Scanner scanner){
        System.out.println("digite dois numeros para a multiplicação");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        return n1 * n2;
    }

    public static int divisao(Scanner scanner){
        System.out.println("digite dois numeros para a divisão");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        return n1 / n2;
    }



}