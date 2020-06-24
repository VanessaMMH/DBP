package com.ecodeup.proyecto;

import java.io.Serializable;

public class EstudianteBean implements Serializable {
	private String nombre;
	private int id;

	
	public EstudianteBean() {
		super();
	}
	/**
	 * @param nombre
	 * @param id
	 
	 */
	public EstudianteBean(String nombre,int id) {
		this.nombre = nombre;
		this.id = id;
		
	}
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	

}
