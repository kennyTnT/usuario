package com.creativa.dao;

import java.util.List;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.creativa.config.HibernateConfigCliente;
import com.creativa.entities.Cliente;

@Repository
@Transactional
public class ClientesDao {
    //lista cliente
	public List<Cliente> listarCliente() {
		try (Session session = HibernateConfigCliente.getSessionFactoryCliente().openSession()) {
			return session.createQuery("FROM Cliente", Cliente.class).list();
		}
	}

    //agregar cliente
	public void AddCliente(Cliente c) {
		try (Session session = HibernateConfigCliente.getSessionFactoryCliente().openSession()) {
			session.save(c);
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
	}
	
	// obtener cliente por id
		public Cliente obtenerPorId(Integer id) {
			try (Session session = HibernateConfigCliente.getSessionFactoryCliente().openSession()) {
				return (Cliente) session.get(Cliente.class, id);
			} catch (Exception e) {
				System.err.println("Error: " + e.getMessage());
				return null;
			}
		}
}
