package com.creativa.dao;

import java.util.List;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.creativa.config.HibernateConfigCliente;
import com.creativa.entities.Telefono;

@Repository
@Transactional
public class TelefonoDao {
	// lista telefonos
	public List<Telefono> listarTelefono() {
		try (Session session = HibernateConfigCliente.getSessionFactoryCliente().openSession()) {
			return session.createQuery("FROM Telefono", Telefono.class).list();
		}
	}

	// agregar telefonos
	public void AddTelefono(Telefono t) {
		try (Session session = HibernateConfigCliente.getSessionFactoryCliente().openSession()) {
			session.save(t);
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
	}
}
