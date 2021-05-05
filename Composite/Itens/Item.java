package Composite;

public abstract class Item {
	protected String Nome;
	
	public Item (String nome) {
		this.Nome = nome;
	}
	
	public String GetNome() {
		return Nome;
	}
}
