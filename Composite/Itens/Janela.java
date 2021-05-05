package Composite;

import java.util.ArrayList;

public class Janela extends Item {

	public Janela(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	private ArrayList<Item> itens = new ArrayList<Item>();
	
	public void AdicionarItem(Item item) {
		itens.add(item);
		System.out.println("item" + item.GetNome() + "adicionado a janela" + Nome);
	}
	
	public void RemoverItem(Item item) {
		itens.add(item);
		System.out.println("item" + item.GetNome() + "removido da janela" + Nome);
	}
	
	public void MostrarItem() {
		System.out.println("itens na janela" + Nome + ":");
		for (Item item: itens)
			System.out.println(item.GetNome());
	}
}
