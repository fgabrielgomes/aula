package aula;
import java.util.Scanner;

public class bar {

	public static void main(String[] args){
		
		int cervejas = 5;
		int opcao;
		int quantidade;
		
		while (cervejas >= 0){	
			System.out.println(cervejas + " cervejas no freezer.");
			System.out.println("Pega uma garrafa, passo pra frente.");
			cervejas = cervejas - 1;
			System.out.println("agora são " + cervejas +" no freezer.");
		
			if (cervejas == 1 ){
				
				Scanner compra = new Scanner(System.in);
				System.out.println("a cerveja acabou. deseja comprar mais?\n 1-SIM\t2-NÃO");
				opcao = compra.nextInt();
				
				if (opcao == 1){
					System.out.println("quantas cervejas deseja comprar? ");
					quantidade = compra.nextInt();
					
					cervejas = quantidade;
					System.out.println("você comprou "+ cervejas + " cervejas!");
				}//fim if
				
				else if( opcao == 2){
					System.exit(0);
					compra.close();
				}//fim else if
				
				else{ System.out.println("opcao invaida");
				}//fim else	
			}//fim if		
		}//fim while	
	}//fim main	
	}//fim class

