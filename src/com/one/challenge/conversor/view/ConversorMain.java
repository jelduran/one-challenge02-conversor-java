package com.one.challenge.conversor.view;

import javax.swing.JOptionPane;

public class ConversorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConversorView conversor = new ConversorView();
		
		String opcion = (String) JOptionPane.showInputDialog(
				null,
				"Seleccione una opción de conversión:",
				"Conversor",
				JOptionPane.PLAIN_MESSAGE,
				null,
				conversor.getOpcionesConversion(),
				conversor.getOpcionesConversion()[0]);
		
		System.out.println(opcion);
	}

}
