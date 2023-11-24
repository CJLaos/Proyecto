package com.springboot.models.dao;

import java.util.List;

import com.springboot.models.entitys.Docente;

public interface IDocenteDao {

	/*METODOS CRUD*/
	public List<Docente>listar();
	
	public int guardar (Docente docente);
	 public Docente obtenerDocentePorId(Long id);

	   public int actualizar(Docente docente);

	 public   int borrar(Long id);

	
	
	
}
