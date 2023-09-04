package com.one.challenge.conversor.model;

public class ActivoFinanciero {
	
	protected String tipo;
	protected String codigo;
	protected char simbolo;
	protected double precio;
	protected ActivoFinanciero activoRef;

	public ActivoFinanciero(String codigo, char simbolo, double precio,
			ActivoFinanciero activoFinanciero) {
		this.tipo = "activo";
		this.codigo = codigo;
		this.simbolo = simbolo;
		this.precio = precio;
		this.activoRef = activoFinanciero != null ? activoFinanciero : this;
	}

	public String getTipo() {
		return tipo;
	}

	public String getCodigo() {
		return codigo;
	}

	public char getSimbolo() {
		return simbolo;
	}

	public double getPrecio() {
		return precio;
	}

	public ActivoFinanciero getActivoRef() {
		return activoRef;
	};
	
}
