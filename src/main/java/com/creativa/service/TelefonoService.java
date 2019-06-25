package com.creativa.service;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.creativa.dao.ClientesDao;
import com.creativa.dao.TelefonoDao;
import com.creativa.entities.Cliente;
import com.creativa.entities.Telefono;

@Service
@Transactional
public class TelefonoService {
	@Autowired
	TelefonoDao daoT;
	
	@Autowired
	ClientesDao daoC;

	// lista telefono service
	public List<Telefono> listarTelefono() {
		return daoT.listarTelefono();
	}

	// crear telefono service
	public void AddTelefono(Telefono t, int idCliente) {
		Cliente cliente = daoC.obtenerPorId(idCliente);
		t.setCliente(cliente);
		daoT.AddTelefono(t);
	}
}