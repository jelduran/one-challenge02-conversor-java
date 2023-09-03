package com.one.challenge.conversor.model;

public class ActivoMoneda extends ActivoFinanciero {

	public ActivoMoneda(String codigo, char simbolo, double precio, ActivoFinanciero activoFinanciero) {
		super(codigo, simbolo, precio, activoFinanciero);
		this.tipo = "moneda";
	}

}
