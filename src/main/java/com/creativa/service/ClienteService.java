package com.creativa.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.creativa.dao.CiudadDao;
import com.creativa.dao.ClientesDao;
import com.creativa.entities.Ciudad;
import com.creativa.entities.Cliente;

@Service
@Transactional
public class ClienteService {

	@Autowired
	ClientesDao daoC;

	@Autowired
	CiudadDao daoCi;

	// lista cliente service
	public List<Cliente> listarCliente() {
		return daoC.listarCliente();
	}

	// agregar cliente service
	public void AddCliente(Cliente c, int idCiudad) {
		Ciudad ciudad = daoCi.obtenerPorId(idCiudad);
		c.setCiudad(ciudad);
		daoC.AddCliente(c);
	}
  
}
