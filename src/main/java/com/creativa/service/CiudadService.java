package com.creativa.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.creativa.dao.CiudadDao;
import com.creativa.entities.Ciudad;

@Service
@Transactional
public class CiudadService {

	@Autowired
	 CiudadDao daoCi;
    
	//lista ciudad service
	public  List<Ciudad> listarCiudad() {
		return daoCi.listarCiudad();
	}
    
	//crear ciudad service
	public void AddCuidad(Ciudad ci) {
		daoCi.AddCiudad(ci);
	}

}
