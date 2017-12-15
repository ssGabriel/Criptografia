import sun.security.util.Length;

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
		
		char[] nTexto = new char[texto.length()];
		
		for(int i=0;i<texto.length();i++) {	
			nTexto[i] = (char) (texto.charAt(i)+cripto.getNumero());			
			}
			System.out.println(nTexto);
			this.texto = nTexto.toString();
		}
		 
		
		
	}
	
	


