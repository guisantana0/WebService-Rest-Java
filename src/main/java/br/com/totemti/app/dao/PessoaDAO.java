package br.com.totemti.app.dao;

import br.com.totemti.app.model.Pessoa;
import br.com.totemti.core.infra.dao.BaseDAO;

public class PessoaDAO extends BaseDAO<Pessoa> {
	public PessoaDAO() {
		super(Pessoa.class);
	}
}
