package com.one.challenge.conversor.model;

public class ActivoStock extends ActivoFinanciero {

	public ActivoStock() {
		// TODO Auto-generated constructor stub
	}

	public ActivoStock(String codigo, char simbolo, double precio, ActivoFinanciero activoFinanciero) {
		super("stock", codigo, simbolo, precio, activoFinanciero);
		// TODO Auto-generated constructor stub
	}

}
