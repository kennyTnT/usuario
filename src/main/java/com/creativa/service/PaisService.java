package com.creativa.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.creativa.dao.PaisDao;
import com.creativa.entities.Pais;

@Service
@Transactional
public class PaisService {
	
	@Autowired
	 PaisDao daoP;

	public  List<Pais> listarPais() {
		return daoP.listarPais();
	}

	public void AddPais(Pais p) {
		daoP.AddPais(p);
	}


}
