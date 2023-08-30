package com.one.challenge.conversor.view;

import javax.swing.JOptionPane;

public class ConversorView extends JOptionPane{

	private static final long serialVersionUID = 9027372087370487375L;
	
	private String[] opcionesConversion;
	private String[] conversionesMoneda;
	private String[] conversionesCripto;
	private String[] conversionesStock;
	
	public ConversorView() {
		opcionesConversion = new String[] { "Monedas", "Criptos", "Stocks" };
		conversionesMoneda = new String[] { "COP a USD", "COP a EUR", "COP a GBP", "COP a JPY", "COP a KRW",
				"USD a COP", "EUR a COP", "GBP a COP", "JPY a COP", "KRW a COP" };
		conversionesCripto = new String[] { "BTC a ETH", "BTC a USDT", "BTC a BNB", "BTC a XRP", "ETH a BTC",
				"USDT a BTC", "BNB a BTC", "XRP a BTC" };
		conversionesStock = new String[] { "USD a TSLA", "USD a NVDA", "USD a NKE", "USD a DUFN", "TSLA a USD",
				"NVDA a USD", "NKE a USD", "DUFN a USD"};
	}

	public String[] getOpcionesConversion() {
		return opcionesConversion;
	}

	public String[] getConversionesMoneda() {
		return conversionesMoneda;
	}

	public String[] getConversionesCripto() {
		return conversionesCripto;
	}

	public String[] getConversionesStock() {
		return conversionesStock;
	}

}
