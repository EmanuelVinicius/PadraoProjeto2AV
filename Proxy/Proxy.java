package Proxy;

import java.util.List;

public class Proxy implements IBancodDados {

	private BancodDados db = new BancodDados();

	@Override
	public void select(String tabela, String campos, String where) {
		// TODO Auto-generated method stub
		db.select(tabela, campos, where);
	}

	@Override
	public void update(String tabela, String campos, String where) {
		// TODO Auto-generated method stub
		db.update(tabela, campos, where);
	}

	@Override
	public void insert(String tabela, String campos, String values) {
		// TODO Auto-generated method stub
		db.insert(tabela, campos, values);
	}

	@Override
	public void delete(String tabela, int id) {
		// TODO Auto-generated method stub
		db.delete(tabela, id);
	}

}
