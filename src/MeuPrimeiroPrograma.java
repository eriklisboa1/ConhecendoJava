import  java.util.Scanner;

public class MeuPrimeiroPrograma {

    public static void cls() {
        for(int i = 0; i < 25; i++ ){
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("Qual a sua idade?");
            //input.nextLine();

            int idade = input.nextInt();
            System.out.println("E seu nome ?");
            String nome = input.next();

            System.out.println("Então seu nome é " + nome
                    + " e você tem " + idade + " anos, correto?\n1-SIM\n2-NÃO\n");
            int op = input.nextInt();
            if (op == 1) {
                System.out.println("EBAA ENTÃO TUDO CORRETO\nVOCÊ DESEJA PRENCHER NOVAMENTE?\n1-SIM\n2-NÃO");
                if (op == 1) {
                    cls();
                }else if(op == 2) {
                    run = false;
                    System.out.println("Programa Encerrado");
                }else{
                    System.out.println("Digite uma opção correta\n1-PRENCHER NOVAMENTE\n2-SAIR");

                }
            }else if(op == 2){
                run = false;
                System.out.println("Programa encerrado");
            }


        }
    }
}
