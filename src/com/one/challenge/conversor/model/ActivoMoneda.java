package com.one.challenge.conversor.model;

public class ActivoMoneda extends ActivoFinanciero {

	public ActivoMoneda() {
	}

	public ActivoMoneda(String codigo, char simbolo, double precio, ActivoFinanciero activoFinanciero) {
		super("moneda", codigo, simbolo, precio, activoFinanciero);
	}

}
