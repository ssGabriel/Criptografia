
public class Criptografia {
	
	private String tipo;
	private int numero;
	

	
	
	public Criptografia (String tipo, int numero) {

		
		this.tipo = tipo;
		this.numero = numero;
		
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setTipo (String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo(){
		return this.tipo;
	}

	

	
}
