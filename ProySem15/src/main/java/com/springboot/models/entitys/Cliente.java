package com.springboot.models.entitys;

public class Cliente {
	
	private int idcliente;
	private String nombrecliente;
	private String apellidocliente;
	private int dnicliente;
	private int iddistrito;
	public Cliente() {
		super();
	}
	public Cliente(int idcliente, String nombrecliente, String apellidocliente, int dnicliente, int iddistrito) {
		super();
		this.idcliente = idcliente;
		this.nombrecliente = nombrecliente;
		this.apellidocliente = apellidocliente;
		this.dnicliente = dnicliente;
		this.iddistrito = iddistrito;
	}
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	public String getNombrecliente() {
		return nombrecliente;
	}
	public void setNombrecliente(String nombrecliente) {
		this.nombrecliente = nombrecliente;
	}
	public String getApellidocliente() {
		return apellidocliente;
	}
	public void setApellidocliente(String apellidocliente) {
		this.apellidocliente = apellidocliente;
	}
	public int getDnicliente() {
		return dnicliente;
	}
	public void setDnicliente(int dnicliente) {
		this.dnicliente = dnicliente;
	}
	public int getIddistrito() {
		return iddistrito;
	}
	public void setIddistrito(int iddistrito) {
		this.iddistrito = iddistrito;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
