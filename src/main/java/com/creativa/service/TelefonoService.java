package com.creativa.service;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.creativa.dao.TelefonoDao;
import com.creativa.entities.Telefono;


@Service
@Transactional
public class TelefonoService {
 @Autowired
 TelefonoDao daoT;
 
	public  List<Telefono> listarTelefono() {
 		return daoT.listarTelefono();
 	}
 
 	public void AddTelefono(Telefono t) {
 		daoT.AddTelefono(t);
 	}
}