import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws IOException {
		
		System.out.println("--- Criptogafia ---");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o nome do arquivo:");
		
		String tNome = input.nextLine();
		
		System.out.println("Digite o texto a ser criptografado:");
		
		String texto = input.nextLine();
		
		Texto abc = new Texto(tNome, texto);
		
		System.out.println(abc);
		
		System.out.println("Digite o nome da criptografia:");
		
		String cNome = input.nextLine();
		
		System.out.println("Digite a chave de criptografia");
		
		int chave = input.nextInt();
		
		Criptografia cripto = new Criptografia(cNome, chave);
		
		abc.Criptografia(cripto);
		
		FileWriter file = new FileWriter(("/Users/Gabriel/Desktop/"+abc.getNome()+".txt"));
		
		PrintWriter writeFile = new PrintWriter(file);
		
		writeFile.printf("Texto:");
		
		writeFile.printf(abc.getTexto());
		
		file.close();
		
		System.out.println("Concluido com sucesso");
		


		
	}

}
