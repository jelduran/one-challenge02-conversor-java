package com.one.challenge.conversor.model;

public class ActivoFinanciero {
	
	private String tipo;
	private String codigo;
	private char simbolo;
	private double precio;
	private ActivoFinanciero activoRef;

	public ActivoFinanciero() {
		this.tipo = "Moneda";
		this.codigo = "USD";
		this.simbolo = '$';
		this.precio = 1;
		this.activoRef = this;
	}

	public ActivoFinanciero(String tipo, String codigo, char simbolo, double precio,
			ActivoFinanciero activoFinanciero) {
		this.tipo = tipo;
		this.codigo = codigo;
		this.simbolo = simbolo;
		this.precio = activoFinanciero != null ? precio : 0.0;
		this.activoRef = activoFinanciero != null ? activoFinanciero : null;
	}

}
