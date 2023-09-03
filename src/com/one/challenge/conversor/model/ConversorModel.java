package com.one.challenge.conversor.model;

public class ConversorModel {

	ActivoFinanciero[] monedas;
	ActivoFinanciero[] criptomonedas;
	ActivoFinanciero[] stocks;
	
	ActivoFinanciero activoBase;
	
	public ConversorModel() {
		
		activoBase = new ActivoMoneda("USD", '$', 1, activoBase);
		
		monedas = new ActivoMoneda[6];
		monedas[0] = new ActivoMoneda("COP", '$', 0, activoBase);
		monedas[1] = new ActivoMoneda("USD", '$', 0, activoBase);
		monedas[2] = new ActivoMoneda("EUR", '\u20AC', 0, activoBase);
		monedas[3] = new ActivoMoneda("GBP", '\u00A3', 0, activoBase);
		monedas[4] = new ActivoMoneda("JPY", '\uFFE5', 0, activoBase);
		monedas[5] = new ActivoMoneda("KRW", '\uFFE6', 0, activoBase);
		
		criptomonedas = new ActivoCriptomoneda[5];
		criptomonedas[0] = new ActivoCriptomoneda("BTC", '\u20BF', 0, activoBase);
		criptomonedas[1] = new ActivoCriptomoneda("ETH", '\u00A4', 0, activoBase);
		criptomonedas[2] = new ActivoCriptomoneda("USDT", '\u00A4', 0, activoBase);
		criptomonedas[3] = new ActivoCriptomoneda("BNB", '\u00A4', 0, activoBase);
		criptomonedas[4] = new ActivoCriptomoneda("XRP", '\u00A4', 0, activoBase);
		
		stocks = new ActivoStock[6];
		stocks[0] = new ActivoStock("TSLA", '\u2191', 0, activoBase);
		stocks[1] = new ActivoStock("META", '\u2191', 0, activoBase);
		stocks[2] = new ActivoStock("AMZN", '\u2191', 0, activoBase);
		stocks[3] = new ActivoStock("GOOGL", '\u2191', 0, activoBase);
		stocks[4] = new ActivoStock("AAPL", '\u2191', 0, activoBase);
		stocks[4] = new ActivoStock("MSFT", '\u2191', 0, activoBase);
	}
}
