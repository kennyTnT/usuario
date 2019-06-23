package com.creativa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.creativa.entities.Cliente;
import com.creativa.entities.Telefono;
import com.creativa.service.CiudadService;
import com.creativa.service.ClienteService;
import com.creativa.service.PaisService;
import com.creativa.service.TelefonoService;

@Controller
public class ClienteController {
	@Autowired
	CiudadService ciServicio;
	@Autowired
	ClienteService cServicio;
	@Autowired
	PaisService pServicio;
	@Autowired
	TelefonoService tServicio;
	
	@RequestMapping(value = "/crearClient", method = RequestMethod.GET)
	public String crearCliente(Model model) {
		model.addAttribute("telefono", new Telefono());
		model.addAttribute("clientes", new Cliente());
		return "clientes";
	}
	
	@RequestMapping(value = "/crearCliente", method = RequestMethod.POST)
	public String crearRol(@ModelAttribute("cliente") Cliente cliente, @ModelAttribute("telefono") Telefono telefono,Model model) {	
		cServicio.AddCliente(cliente);
		tServicio.AddTelefono(telefono);
		ciServicio.listarCiudad();
		return "clientes";
	}
	
	@RequestMapping(value = "/listClient", method = RequestMethod.GET)
	public String mostrarCliente(Model model) {
		model.addAttribute("cliente", cServicio.listarCliente());
		return "listaCliente";
	}
	
}
