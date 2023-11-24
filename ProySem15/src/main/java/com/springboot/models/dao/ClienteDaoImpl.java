package com.springboot.models.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springboot.models.entitys.Cliente;

@Repository

public class ClienteDaoImpl implements IClienteDao{

	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public List<Cliente> listar() {
		String sql = "select * from cliente";
		List<Cliente> lista = jt.query(sql, BeanPropertyRowMapper.newInstance(Cliente.class));
		return lista;
	}
	

	@Override
	public int guardar(Cliente cliente) {
		// TODO Auto-generated method stub
		String sql= "insert into cliente(nombrecliente,apellidocliente,dnicliente,iddistrito)values(?,?,?,?)";
		return jt.update(sql, cliente.getNombrecliente(), cliente.getApellidocliente(), cliente.getDnicliente(),
				cliente.getIddistrito());
	
	}
	
	 @Override
	    public Cliente obtenerClientePorId(Long id) {
	        String sql = "SELECT * FROM cliente WHERE idcliente = ?";
	        return jt.queryForObject(sql, BeanPropertyRowMapper.newInstance(Cliente.class), id);
	    }

	    @Override
	    public int actualizarcliente(Cliente cliente) {
	        String sql = "UPDATE cliente SET nombrecliente = ?, apellidocliente = ?, dnicliente = ?, iddistrito = ? WHERE idcliente = ?";
	        return jt.update(sql, cliente.getNombrecliente(), cliente.getApellidocliente(), cliente.getDnicliente(),
					cliente.getIddistrito(), cliente.getIdcliente());
	    }

	    @Override
	    public int borrarcliente(Long id) {
	        String sql = "DELETE FROM cliente WHERE idcliente = ?";
	        return jt.update(sql, id);
	    }

		
}
