package com.creativa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.creativa.entities.Cliente;
import com.creativa.entities.Telefono;
import com.creativa.service.CiudadService;
import com.creativa.service.ClienteService;
import com.creativa.service.TelefonoService;

@Controller
public class ClienteController {
	@Autowired
	CiudadService ciServicio;
	@Autowired
	ClienteService cServicio;
	@Autowired
	TelefonoService tServicio;

	// redireccion a la vista del formulario cliente
	@RequestMapping(value = "/crearClient", method = RequestMethod.GET)
	public String crearCliente(Model model) {
		model.addAttribute("cliente", new Cliente());
		model.addAttribute("telefono", new Telefono());
		model.addAttribute("listCliente", cServicio.listarCliente());
		model.addAttribute("listCiudad", ciServicio.listarCiudad());
		return "clientes";
	}

	// metodo para guardar datos del cliente
	@RequestMapping(value = "/crearCliente", method = RequestMethod.POST)
	public String crearNuevoCliente(@ModelAttribute("cliente") Cliente cliente,
			@RequestParam(name = "idCiudad") int idCiudad, Model model) {
		cServicio.AddCliente(cliente, idCiudad);
		model.addAttribute("mensaje", "Cliente se Registrado Exitosamente");
		
		model.addAttribute("cliente", new Cliente());
		model.addAttribute("telefono", new Telefono());
		model.addAttribute("listCliente", cServicio.listarCliente());
		model.addAttribute("listCiudad", ciServicio.listarCiudad());
		return "clientes";
	}

	// metodo para agregar nuevos telefonos
	@RequestMapping(value = "/crearTelefono", method = RequestMethod.POST)
	public String crearTelefono(@ModelAttribute("telefono") Telefono telefono,
			@RequestParam(name="idCliente") int idCliente, Model model) {
		tServicio.AddTelefono(telefono, idCliente);
		model.addAttribute("mensaje2", "Se agrego nuevo telefono");
		
		model.addAttribute("cliente", new Cliente());
		model.addAttribute("telefono", new Telefono());
		model.addAttribute("listCliente", cServicio.listarCliente());
		model.addAttribute("listCiudad", ciServicio.listarCiudad());
		return "clientes";
	}

	// metodo para listar clientes
	@RequestMapping(value = "/listClient", method = RequestMethod.GET)
	public String mostrarCliente(Model model) {
		model.addAttribute("clienteList", cServicio.listarCliente());
		model.addAttribute("ciudadList", ciServicio.listarCiudad());
		model.addAttribute("telefonoList", tServicio.listarTelefono());
		return "listaCliente";
	}
}
