package com.one.challenge.conversor.model;

public class ActivoStock extends ActivoFinanciero {

	public ActivoStock() {
		this.tipo = "stock";
		this.codigo = "TSLA";
		this.simbolo = '\u2191';
		this.precio = 245.01;
		this.activoRef = new ActivoMoneda();
	}

	public ActivoStock(String codigo, char simbolo, double precio, ActivoFinanciero activoFinanciero) {
		super("stock", codigo, simbolo, precio, activoFinanciero);
		// TODO Auto-generated constructor stub
	}

}
