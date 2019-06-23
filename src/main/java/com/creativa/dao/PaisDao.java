package com.creativa.dao;

import java.util.List;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.creativa.config.HibernateConfigCliente;
import com.creativa.entities.Pais;

@Repository
@Transactional
public class PaisDao {
	public List<Pais> listarPais() {
		try (Session session = HibernateConfigCliente.getSessionFactoryCliente().openSession()) {
			return session.createQuery("FROM Pais", Pais.class).list();
		}
	}

	public void AddPais(Pais p) {
		try (Session session = HibernateConfigCliente.getSessionFactoryCliente().openSession()){
			 session.save(p);
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
	}
}
