package com.creativa.config;

import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.creativa.entities.Ciudad;
import com.creativa.entities.Cliente;
import com.creativa.entities.Pais;
import com.creativa.entities.Telefono;

public class HibernateConfigCliente {
	private static SessionFactory sessionCliente;
	 public static SessionFactory getSessionFactoryCliente() {
	        if (sessionCliente == null) {
	            try {
	                Configuration configuration = new Configuration();
	                // Hibernate settings equivalent to hibernate.cfg.xml's properties
	                Properties settings = new Properties();
	                settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
	                settings.put(Environment.URL, "jdbc:mysql://localhost:3306/clientes");
	                settings.put(Environment.USER, "root");
	                settings.put(Environment.PASS, "");
	                settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
	                settings.put(Environment.SHOW_SQL, "true");
	                settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
	                //settings.put(Environment.HBM2DDL_AUTO, "create-drop");
	                configuration.setProperties(settings);
	                configuration.addAnnotatedClass(Cliente.class);
	                configuration.addAnnotatedClass(Telefono.class);
	                configuration.addAnnotatedClass(Ciudad.class);
	                configuration.addAnnotatedClass(Pais.class);
	                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
	                    .applySettings(configuration.getProperties()).build();
	                sessionCliente = configuration.buildSessionFactory(serviceRegistry);
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	        return sessionCliente;
	    }
}
