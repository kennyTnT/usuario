package com.creativa.dao;

import java.util.List;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.creativa.config.HibernateConfigCliente;
import com.creativa.entities.Ciudad;

@Repository
@Transactional
public class CiudadDao {

	public List<Ciudad> listarCiudad() {
		try (Session session = HibernateConfigCliente.getSessionFactoryCliente().openSession()) {
			return session.createQuery("FROM Ciudad", Ciudad.class).list();
		}
	}

	public void AddCiudad(Ciudad ci) {
		try (Session session = HibernateConfigCliente.getSessionFactoryCliente().openSession()){
			 session.save(ci);
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
	}
}
