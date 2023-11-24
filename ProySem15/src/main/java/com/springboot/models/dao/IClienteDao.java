package com.springboot.models.dao;

import java.util.List;

import com.springboot.models.entitys.Cliente;

public interface IClienteDao {

	/* METODOS CRUD */
	public List<Cliente> listar();

	public int guardar(Cliente cliente);

	public Cliente obtenerClientePorId(Long id);

	public int actualizarcliente(Cliente cliente);

	public int borrarcliente(Long id);

}
