package com.creativa.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.creativa.dao.ClientesDao;
import com.creativa.entities.Cliente;

@Service
@Transactional
public class ClienteService {

	@Autowired
	 ClientesDao daoC;

	public  List<Cliente> listarCliente() {
		return daoC.listarCliente();
	}

	public void AddCliente(Cliente c) {
		daoC.AddCliente(c);
	}


}
