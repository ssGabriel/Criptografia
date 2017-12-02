
public class Texto {
	
	public Texto(String nome, String texto) {
		this.nome = nome;
		this.texto = texto;
		this.cripto = null;
	}


	private String nome;
	private String texto;
	private Criptografia cripto;


	public String getTexto() {
		return texto;
	}


	public void setTexto(String a) {
		this.texto = a;
	}
	
	
	@Override
	public String toString() {
		return "Nome: "+this.nome+" Texto associado: "+this.texto;
		
	}


	public void setCripto(Criptografia cripto) {
		this.cripto = cripto;
		
	}
	
	public void Criptografia (Criptografia cripto) {
		char[] vetor = this.texto.toCharArray(); 
		int [] aux = new int[vetor.length];
		char [] aux2 = new char[vetor.length];
		char a;
		
		for(int i=0;i<vetor.length;i++) {
			 aux[i] = ((int)vetor[i]);
			 aux[i] =+ cripto.getNumero();
			 aux2[i] = a.charAt(aux[i]);
			
		}
		 this.texto = aux.toString();
		
		
	}
	
	

}
