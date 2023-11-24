package com.springboot.models.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springboot.models.entitys.Docente;

@Repository

public class DocenteDaoImpl implements IDocenteDao {

	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public List<Docente> listar() {
		String sql = "select * from docente";
		List<Docente> lista = jt.query(sql, BeanPropertyRowMapper.newInstance(Docente.class));
		return lista;
	}

	@Override
	public int guardar(Docente docente) {
		// TODO Auto-generated method stub
		String sql= "insert into docente(nombre,apellido,direccion,telefono,sueldo)values(?,?,?,?,?)";
		return jt.update(sql, docente.getNombre(), docente.getApellido(),
				docente.getDireccion(), docente.getTelefono(), docente.getSueldo());
	
	}
	
	 @Override
	    public Docente obtenerDocentePorId(Long id) {
	        String sql = "SELECT * FROM docente WHERE iddocente = ?";
	        return jt.queryForObject(sql, BeanPropertyRowMapper.newInstance(Docente.class), id);
	    }

	    @Override
	    public int actualizar(Docente docente) {
	        String sql = "UPDATE docente SET nombre = ?, apellido = ?, direccion = ?, telefono = ?, sueldo = ? WHERE iddocente = ?";
	        return jt.update(sql, docente.getNombre(), docente.getApellido(), docente.getDireccion(),
	                docente.getTelefono(), docente.getSueldo(), docente.getIddocente());
	    }

	    @Override
	    public int borrar(Long id) {
	        String sql = "DELETE FROM docente WHERE iddocente = ?";
	        return jt.update(sql, id);
	    }
}
