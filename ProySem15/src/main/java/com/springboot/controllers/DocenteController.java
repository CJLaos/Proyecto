package com.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.models.dao.DocenteDaoImpl;
import com.springboot.models.entitys.Docente;

@Controller
public class DocenteController {
	@Autowired
	private DocenteDaoImpl dao;
	
	@GetMapping("/viewIndex")
	public String index(Model modelo) {
		List<Docente>lista = dao.listar();
		modelo.addAttribute("listaDocentes", lista);
		return "viewIndex";
	}

	@GetMapping("/nuevo")
	public String nuevo (Model modelo) {
		modelo.addAttribute("docente", new Docente());
		return "viewNuevo";
	}
	
	@PostMapping("/guardar")
	public String guardar (@ModelAttribute Docente docente) {
		dao.guardar(docente);
		
		return "redirect:/viewIndex";
	}
	
		@GetMapping("/editar/{iddocente}")
	    public String mostrarFormularioEditar(@PathVariable("iddocente") Long iddocente, Model model) {
	        Docente docente = dao.obtenerDocentePorId(iddocente);
	        model.addAttribute("docente", docente);
	        return "editar"; // Reemplaza con el nombre de tu página de formulario de edición
	    }

	    @PostMapping("/guardarEdicion")
	    public String guardarEdicion(@ModelAttribute("docente") Docente docente) {
	        dao.actualizar(docente);
	        return "redirect:/viewIndex"; // Redirigir a la lista de docentes después de editar
	    }

	    @GetMapping("/borrar/{iddocente}")
	    public String borrarDocente(@PathVariable("iddocente") Long iddocente) {
	        dao.borrar(iddocente);
	        return "redirect:/viewIndex"; // Redirigir a la lista de docentes después de borrar
	    
	}
	
	
	
}
