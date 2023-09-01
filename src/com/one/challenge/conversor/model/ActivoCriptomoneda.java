package com.one.challenge.conversor.model;

public class ActivoCriptomoneda extends ActivoFinanciero {

	public ActivoCriptomoneda() {
		
	}

	public ActivoCriptomoneda(String codigo, char simbolo, double precio, ActivoFinanciero activoFinanciero) {
		super("criptomoneda", codigo, simbolo, precio, activoFinanciero);
		// TODO Auto-generated constructor stub
	}

}
