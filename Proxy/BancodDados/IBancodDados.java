package Proxy;

import java.util.List;

public interface IBancodDados {

	public void select(String tabela, String campos, String where);

	public void update(String tabela, String campos, String where);

	public void insert(String tabela, String campos, String values);

	public void delete(String tabela, int id);
}
