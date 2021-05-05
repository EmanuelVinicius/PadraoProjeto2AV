package Composite;

import java.util.ArrayList;

public class Botao extends Item {
	public Botao(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	private ArrayList<Item> itens = new ArrayList<Item>();
	
	public void AdicionarItem(Item item) {
		itens.add(item);
		System.out.println("item" + item.GetNome() + "adicionado ao bot�o" + Nome);
	}
	
	public void RemoverItem(Item item) {
		itens.add(item);
		System.out.println("item" + item.GetNome() + "removido do bot�o" + Nome);
	}
	
	public void MostrarItem() {
		System.out.println("itens no bot�o" + Nome + ":");
		for (Item item: itens)
			System.out.println(item.GetNome());
	}
}
