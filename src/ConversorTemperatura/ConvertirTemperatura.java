package ConversorTemperatura;

import javax.swing.JOptionPane;

public class ConvertirTemperatura {
	public void ConvertirCelsiusAFarenheit(double valor) {
		double farenheit = valor * 1.8;
		double totalfarenheit = farenheit + 32;
		JOptionPane.showMessageDialog(null, valor + " grados Celsius se convierten en "+ totalfarenheit + " grados Farenheit");
	}
	
	public void ConvertirFarenheitACelsius(double valor) {
		double celsius = valor - 32;
		double totalCelsius = celsius / 1.8;
		JOptionPane.showMessageDialog(null,  valor + " grados Farenheit se convierten en "+ totalCelsius + " grados Celsius");
	}
}