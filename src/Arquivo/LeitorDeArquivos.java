package Arquivo;
import java.io.File;

import java.io.FileReader;
import java.util.Scanner;

import PesquisaCovid.Colecao;
import java.io.BufferedReader;

public class LeitorDeArquivos{
	public static void main(String args[]){
		try{
		   	Scanner input = new Scanner (System.in); 
		   	
		   	PesquisaCovid.Colecao biblioteca = new PesquisaCovid.Colecao();  
		   	
			File tmpArquivo = new File("DadosCovid.txt");
			FileReader rdArquivo = new FileReader(tmpArquivo);
			BufferedReader br = new BufferedReader(rdArquivo);
			
			String linha;
			int op, opEstado; 
			String procura = "vazia"; 
			

			
			do {System.out.println("Escolha uma opção. Para finalizar digite 0 ");
				System.out.println("1 - Pesquisa por estado");
				System.out.println("2 - Pesquisa por região");
				op = input.nextInt();
				
				if (op == 0) {
					System.out.println("Programa Finalizado!");
				}
				else if (op == 1) {
					System.out.println();
					System.out.println("Digite a sigla do estado: (ex: MG)");
					System.out.println();
					procura = input.nextLine(); 
									
				}
			

				else if (op == 2) {
					
				
					System.out.println("Escolha uma região:");
					System.out.println("1 - Norte");
					System.out.println("2 - Nordeste");
					System.out.println("3 - Sul");
					System.out.println("4 - Suldeste");
					System.out.println("5 - Centro-Oeste");
					opEstado = input.nextInt();
					if(opEstado ==1) {
						procura = "Norte"; 
								
					}
					else if(opEstado ==2) {
						procura = "Nordeste"; 
					}
					else if(opEstado ==3) {
						procura = "Sul"; 
					}
					else if(opEstado ==4) {
						procura = "Suldeste"; 
					}
					else if(opEstado ==5) {
						procura = "Centro-Oeste"; 
					}
					else {
						System.out.println("Opção invalida");
					}
					
				}
				
				else{
				procura = null; 
				System.out.println("Opção Invalida");	
				}
					
				while ( (linha = br.readLine()) != null  ){
					
					String infos[] = linha.split(";");
			
						String resultado = (biblioteca.buscaSequencial(infos, procura));
						System.out.println(resultado);
					}
				br.close();
				rdArquivo.close();

				
			}
			while (op != 0); 
			
			
			
		}
		catch(Exception ex){
			System.out.println("ERRO:"+ex.getMessage());
		}

	}
}