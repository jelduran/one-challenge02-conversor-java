package com.one.challenge.conversor.model;

public class ActivoCriptomoneda extends ActivoFinanciero {


	public ActivoCriptomoneda(String codigo, char simbolo, double precio, ActivoFinanciero activoFinanciero) {
		super(codigo, simbolo, precio, activoFinanciero);
		this.tipo = "criptomoneda";
	}

}
