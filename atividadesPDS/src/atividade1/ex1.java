package atividade1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class ex1 {
 public static void main(String[] args) {
	 
	 Scanner leitor = new Scanner(System.in);
	 System.out.println("digite um numero de 1 a 10: ");
	 int numero = leitor.nextInt();
	 String nArquivo = "tabuada_"+numero+".txt;";
			 
			 try (BufferedReader leitura = new BufferedReader( new FileReader(nArquivo))){
				 String linha;
				 while ((linha = leitura.readLine())!=null) {
					 System.out.println(linha);
				 }
			 }catch (IOException e) {
				System.out.println("arquivonao encontrado: "+nArquivo);
			 } finally {
				 leitor.close();
			 }
	 
	 
	 
 }
}
