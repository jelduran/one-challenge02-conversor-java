package com.one.challenge.conversor.model;

public class ActivoStock extends ActivoFinanciero {

	public ActivoStock(String codigo, char simbolo, double precio, ActivoFinanciero activoFinanciero) {
		super(codigo, simbolo, precio, activoFinanciero);
		this.tipo = "stock";
	}

}
