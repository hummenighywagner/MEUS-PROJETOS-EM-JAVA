/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        while (true) {
            System.out.println("Digite o seu nome:");
            name = scanner.nextLine();
            if (name.matches("[a-zA-Z\\s]+")) {
                break;
            } else {
                System.out.println("Preencha apenas letras neste campo!!");
            }
        }

        int idade;
        while (true) {
            System.out.println("Digite a sua idade:");
            if (scanner.hasNextInt()) {
                idade = scanner.nextInt();
                if (idade >= 0) {
                    break;
                }
            } else {
                System.out.println("Apenas números são permitidos neste campo!");
                scanner.next();
            }
        }

        double peso;
        while (true) {
            System.out.println("Digite o seu peso:");
            if (scanner.hasNextDouble()) {
                peso = scanner.nextDouble();
                if (peso >= 0) {
                    break;
                }
            } else {
                System.out.println("Apenas números são permitidos!");
                scanner.next();
            }
        }

        double altura;
        while (true) {
            System.out.println("Digite a sua altura:");
            if (scanner.hasNextDouble()) {
                altura = scanner.nextDouble();
                if (altura >= 0) {
                    break;
                }
            } else {
                System.out.println("Apenas números são permitidos!");
                scanner.next();
            }
        }

        double IMC = peso / Math.pow(altura, 2);
        System.out.println("\nNome: " + name + "\nIdade: " + idade + "\nMinha altura: " + altura + "\nMeu peso: " + peso);
        System.out.println("Seu IMC é: " + IMC);

        if (IMC < 16) {
            System.out.println("Magreza grave");
        } else if (IMC < 17) {
            System.out.println("Magreza moderada");
        } else if (IMC < 18.5) {
            System.out.println("Magreza leve");
        } else if (IMC < 25) {
            System.out.println("Peso ideal");
        } else if (IMC < 30) {
            System.out.println("obesidade grau I");
        } else if ( IMC < 39.9){
            System.out.println("obesidade grau II");
        }else  {
            System.out.println("obesidade grau III ou mórbida");
        }
        scanner.close();
    }
}
 