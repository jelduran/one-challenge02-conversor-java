package com.one.challenge.conversor.model;

public class ConversorModel {

	ActivoFinanciero[] monedas;
	ActivoFinanciero[] criptomonedas;
	ActivoFinanciero[] stocks;
	
	ActivoFinanciero activoBase;
	
	public ConversorModel() {
		
		activoBase = new ActivoMoneda("USD", '$', 1, activoBase);
		
		monedas = new ActivoMoneda[6];
		monedas[0] = new ActivoMoneda("COP", '$', 0.00024, activoBase);
		monedas[1] = new ActivoMoneda("USD", '$', 1, activoBase);
		monedas[2] = new ActivoMoneda("EUR", '\u20AC', 1.08, activoBase);
		monedas[3] = new ActivoMoneda("GBP", '\u00A3', 1.26, activoBase);
		monedas[4] = new ActivoMoneda("JPY", '\uFFE5', 0.0068, activoBase);
		monedas[5] = new ActivoMoneda("KRW", '\uFFE6', 0.00076, activoBase);
		
		criptomonedas = new ActivoCriptomoneda[5];
		criptomonedas[0] = new ActivoCriptomoneda("BTC", '\u20BF', 25974.70, activoBase);
		criptomonedas[1] = new ActivoCriptomoneda("ETH", '\u00A4', 1638.95, activoBase);
		criptomonedas[2] = new ActivoCriptomoneda("USDT", '\u00A4', 1, activoBase);
		criptomonedas[3] = new ActivoCriptomoneda("BNB", '\u00A4', 214.04, activoBase);
		criptomonedas[4] = new ActivoCriptomoneda("XRP", '\u00A4', 0.51, activoBase);
		
		stocks = new ActivoStock[6];
		stocks[0] = new ActivoStock("TSLA", '\u2191', 245.01, activoBase);
		stocks[1] = new ActivoStock("META", '\u2191', 296.38, activoBase);
		stocks[2] = new ActivoStock("AMZN", '\u2191', 138.12, activoBase);
		stocks[3] = new ActivoStock("GOOGL", '\u2191', 135.66, activoBase);
		stocks[4] = new ActivoStock("AAPL", '\u2191', 189.46, activoBase);
		stocks[4] = new ActivoStock("MSFT", '\u2191', 328.66, activoBase);
	}

	public ActivoFinanciero[] getMonedas() {
		return monedas;
	}

	public ActivoFinanciero[] getCriptomonedas() {
		return criptomonedas;
	}

	public ActivoFinanciero[] getStocks() {
		return stocks;
	}

	public ActivoFinanciero getActivoBase() {
		return activoBase;
	}

	public double convertir(double cantidad, ActivoFinanciero activoOrigen, ActivoFinanciero activoDestino) {
		if (activoOrigen.getActivoRef().getCodigo() == activoDestino.getActivoRef().getCodigo()) {
			double factorConversion = activoOrigen.precio / activoDestino.precio;
			return cantidad * factorConversion;
		} else {
			return 0.0;
		}
	}
	
	
}
