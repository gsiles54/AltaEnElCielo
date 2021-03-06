package com.unlam.altaenelcielo;

import java.util.ArrayList;
import java.util.List;

public class Escuela {
	
	private int orden;
	private int ultimoCocido;
	private int tamaņoBandera;
	private List<Integer> retazos;
	
	public Escuela(int retazoInicial,int  orden) {
		this.tamaņoBandera=retazoInicial;
		this.orden=orden;
		this.ultimoCocido=retazoInicial;
		retazos = new ArrayList<>();
	}
	public void agregarRetazo(int retazo) {
		ultimoCocido=retazo;
		tamaņoBandera+=retazo;
		retazos.add(retazo);
	}
	public int getOrden() {
		return orden;
	}
	public void setOrden(int orden) {
		this.orden = orden;
	}
	public int getUltimoCocido() {
		return ultimoCocido;
	}
	public void setUltimoCocido(int ultimoCocido) {
		this.ultimoCocido = ultimoCocido;
	}
	public int getTamaņoBandera() {
		return tamaņoBandera;
	}
	public void setTamaņoBandera(int tamaņoBandera) {
		this.tamaņoBandera = tamaņoBandera;
	}
	public List<Integer> getRetazos() {
		return retazos;
	}
	public void setRetazos(List<Integer> retazos) {
		this.retazos = retazos;
	}
	
	
}
