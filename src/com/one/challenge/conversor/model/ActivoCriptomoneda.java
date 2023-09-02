package com.one.challenge.conversor.model;

public class ActivoCriptomoneda extends ActivoFinanciero {

	public ActivoCriptomoneda() {
		this.tipo = "criptomoneda";
		this.codigo = "BTC";
		this.simbolo = '\u20BF';
		this.precio = 25743.20;
		this.activoRef = new ActivoMoneda();
	}

	public ActivoCriptomoneda(String codigo, char simbolo, double precio, ActivoFinanciero activoFinanciero) {
		super("criptomoneda", codigo, simbolo, precio, activoFinanciero);
		// TODO Auto-generated constructor stub
	}

}
