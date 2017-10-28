package br.com.totemti.core.infra.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

public class BaseDAO<T> {
	@PersistenceContext
	protected EntityManager em;
	
	private Class<T> clazz;
	
	public BaseDAO(Class<T> clazz) {
		this.clazz = clazz;
	}
	public List<T> listar(){
		Query query= em.createQuery("FROM "+ this.clazz.getName());
		return query.getResultList();
	}
}
