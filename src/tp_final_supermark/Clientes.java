package tp_final_supermark;

import java.util.ArrayList;
import java.util.Scanner;

public class Clientes {
	public int id;
	 public String nombre;
	 public String apellido;
	 public String dni;
	 public String domicilio;
	 public Integer frecuencia;
	 
	public Clientes(int id,String nombre, String apellido, String dni, String domicilio, Integer frecuencia) {
		this.id=id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.domicilio = domicilio;
		this.frecuencia = frecuencia;
	}

	public String getNombre() {
		return nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public Integer getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(Integer frecuencia) {
		this.frecuencia = frecuencia;
	}
	

	
}