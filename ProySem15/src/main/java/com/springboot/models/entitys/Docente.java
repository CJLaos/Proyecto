package com.springboot.models.entitys;

public class Docente {
	
	private int iddocente;
	private String nombre;
	private String apellido;
	private String direccion;
	private String telefono;
	private double sueldo;
	
	public Docente() {
		super();
	}

	public Docente(int iddocente, String nombre, String apellido, String direccion, String telefono, double sueldo) {
		super();
		this.iddocente = iddocente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
		this.sueldo = sueldo;
	}

	public int getIddocente() {
		return iddocente;
	}

	public void setIddocente(int iddocente) {
		this.iddocente = iddocente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	
	
	
	
	
	

}
