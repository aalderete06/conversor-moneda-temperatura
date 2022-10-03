package ConversorDivisas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {

		public void ConvertirPesosArgentinosADolares(double valor) {
			double monedaDolar = valor / 146.09;
			monedaDolar = (double) Math.round(monedaDolar * 100d)/100;
			JOptionPane.showMessageDialog(null, "Tienes $ "+monedaDolar+ " Dolares");
		}
		
		public void ConvertirPesosArgentinosAEuros(double valor) {
			double monedaEuros = valor / 141.56;
			monedaEuros = (double) Math.round(monedaEuros * 100d)/100;
			JOptionPane.showMessageDialog(null, "Tienes $ "+monedaEuros+ " Euros");
		}
		
		public void ConvertirPesosArgentinosALibras(double valor) {
			double monedaLibras = valor / 158.63;
			monedaLibras = (double) Math.round(monedaLibras * 100d)/100;
			JOptionPane.showMessageDialog(null, "Tienes $ "+monedaLibras+ " Libras Esterlinas");
		}
		
		public void ConvertirPesosArgentinosAYen(double valor) {
			double monedaYen = valor / 1.02;
			monedaYen = (double) Math.round(monedaYen * 100d)/100;
			JOptionPane.showMessageDialog(null, "Tienes $ "+monedaYen+ " Yen Japonés");
		}
		
		public void ConvertirPesosArgentinosAWon(double valor) {
			double monedaWon = valor / 0.10;
			monedaWon = (double) Math.round(monedaWon * 100d)/100;
			JOptionPane.showMessageDialog(null, "Tienes $ "+monedaWon+ " Won sul-Coreano");
		}
		
		public void ConvertirDolaresAPesosArgentinos(double valor) {
			double monedaPesoAR = valor * 146.09;
			monedaPesoAR = (double) Math.round(monedaPesoAR * 100d)/100;
			JOptionPane.showMessageDialog(null, "Tienes $ "+monedaPesoAR+ " Pesos Argentinos");
		}
		
		public void ConvertirEurosAPesosArgentinos(double valor) {
			double monedaPesoAR = valor *  141.56;
			monedaPesoAR = (double) Math.round(monedaPesoAR * 100d)/100;
			JOptionPane.showMessageDialog(null, "Tienes $ "+monedaPesoAR+ "  Pesos Argentinos");
		}
		
		public void ConvertirLibrasAPesosArgentinos(double valor) {
			double monedaPesoAR = valor * 158.63;
			monedaPesoAR = (double) Math.round(monedaPesoAR * 100d)/100;
			JOptionPane.showMessageDialog(null, "Tienes $ "+monedaPesoAR+ "  Pesos Argentinos");
		}
		
		public void ConvertirYenPesosArgentinos(double valor) {
			double monedaPesoAR = valor * 1.02;
			monedaPesoAR = (double) Math.round(monedaPesoAR * 100d)/100;
			JOptionPane.showMessageDialog(null, "Tienes $ "+monedaPesoAR+ "  Pesos Argentinos");
		}
		
		public void ConvertirWonAPesosArgentinos(double valor) {
			double monedaPesoAR = valor *0.10;
			monedaPesoAR = (double) Math.round(monedaPesoAR * 100d)/100;
			JOptionPane.showMessageDialog(null, "Tienes $ "+monedaPesoAR+ "  Pesos Argentinos");
		}
}