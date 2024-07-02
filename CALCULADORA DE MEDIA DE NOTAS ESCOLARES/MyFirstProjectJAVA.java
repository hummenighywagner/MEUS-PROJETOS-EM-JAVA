

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
    
        while (true) {
    System.out.println("Digite seu nome completo:" );
    String nomeCompleto = scanner.nextLine();
    System.out.println("Seu nome é" + nomeCompleto);
    
        if(nomeCompleto.matches("[a-zA-Z\\s]+")){
        break;
        
        }else{
        System.out.println("Apenas letras são permitidas!");
 
            
        }
        
        }
    
    String entrada;
        
        while(true) {
    System.out.println("Digite a sua idade:");
    entrada = scanner.nextLine();
   
        
        if(entrada.matches("\\d+")){
        break;    
            
        }else{
        System.out.println("Apenas números são permitidos neste campo!");
        
        }
        
        }
        int numeros = Integer.parseInt(entrada);
    
    String ano;
    
        while(true){
    System.out.println("Digite seu ano escolar:");
    ano = scanner.nextLine();
    System.out.println("Seu ano escolar é:" + ano);
    
        if(ano.matches("\\d+")){
        break;
        
        }else{
        System.out.println("Apenas números são permitidos neste campo!");

        }
        
        }
        
        int anoEscolar = Integer.parseInt(ano);

    
	
	System.out.println("Digite a sua primeira nota:");
	double primeiraNota = scanner.nextDouble();
	System.out.println("Digite a sua segunda nota:");
	double segundaNota = scanner.nextDouble();
	System.out.println("Digite a sua terceira nota:");
	double terceiraNota = scanner.nextDouble();
	System.out.println("Digite a sua quarta nota:");
	double quartaNota = scanner.nextDouble();
	
    double mediaDasNotas = (primeiraNota + segundaNota + terceiraNota + quartaNota)/4;
	
	 
	System.out.println("Sua média é" + mediaDasNotas);
	    
	    scanner.close();
	    
	  if(mediaDasNotas <7){
	  System.out.println("Você foi reprovado!");
	  }else if (mediaDasNotas ==7) {
	  System.out.println("Você passou por média, parabéns!");
	  }else{
	  System.out.println("Parabéns, você foi aprovadíssimo!");   
	  }
	}
}