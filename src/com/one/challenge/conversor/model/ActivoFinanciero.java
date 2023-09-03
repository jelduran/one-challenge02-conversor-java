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
		this.precio = activoFinanciero != null ? precio : 0.0;
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

	public double convertirA(double cantidad, ActivoFinanciero activo) {
		if (activo.getActivoRef().getCodigo() == this.getActivoRef().getCodigo()) {
			double factorConversion = this.precio / activo.precio;
			return cantidad * factorConversion;
		} else {
			return 0.0;
		}
	}
	
}
