package Proxy;

import java.util.List;

public class BancodDados implements IBancodDados {
	private String sql;

	public void select(String tabela, String campos, String where) {
		sql = "select " + campos + "from" + tabela + where + "id = 1";
		System.out.println(sql);
	}

	public void update(String tabela, String campos, String where) {
		sql = "update" + tabela + "set " + campos + "= valor" + where + "id = 1";
		System.out.println(sql);
	}

	public void insert(String tabela, String campos, String values) {
		sql = "insert into " + tabela + "campos" + values;
		System.out.println(sql);
	}

	public void delete(String tabela, int id) {
		sql = "delete from" + tabela + "where id = " + id;
		System.out.println(sql);
	}
}
