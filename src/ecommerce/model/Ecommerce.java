package ecommerce.model;

public abstract class Ecommerce {

	private String numeroSerie;
	private String tipo;
	private String nome;
	private float preço;
	
	public Ecommerce(String numeroSerie, String tipo, String nome, float preço) {
		super();
		this.numeroSerie = numeroSerie;
		this.tipo = tipo;
		this.nome = nome;
		this.preço = preço;
		
}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreço() {
		return preço;
	}

	public void setPreço(float preço) {
		this.preço = preço;
	}

	public void ListarProdutos() {
	
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do Produto:");
		System.out.println("***********************************************************");
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Nome da marca: " + this.nome);
		System.out.println("Preço do porduto: R$"+ this.preço);
		System.out.println("Número de série: " + this.numeroSerie);
}

	public abstract void visualizar();

}
