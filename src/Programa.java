
public class Programa {

	public static void main(String[] args) {
		Texto abc = new Texto("Meu nome � Gabriel", "Ola tudo bem sua ...");
		
		System.out.println(abc);
		
		Criptografia cripto = new Criptografia("Decimal", 3);
		
		abc.Criptografia(cripto);
		
		System.out.println(abc);
		
		cripto.setNumero(-3);
		
		
		abc.Criptografia(cripto);
		

		
	}

}
