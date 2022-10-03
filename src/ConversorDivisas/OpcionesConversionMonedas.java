package ConversorDivisas;

import javax.swing.JOptionPane;

public class OpcionesConversionMonedas {
	
	ConvertirMonedas  monedas = new ConvertirMonedas();

	public void ConvertirMonedas(double valor) {
	String opcion = (JOptionPane.showInputDialog(null, "Elige el tipo de moneda a la qie quieres convertir tu dinero", "Monedas",
			JOptionPane.PLAIN_MESSAGE, null, new Object[]{
					"De Pesos AR a Dólar", "De Pesos AR a Euro", "De Pesos AR a Libras Esterlinas", "De Pesos AR a Yen Japonés", "De Pesos Ar a Won sul-Coreano",
					"De Dólar a Pesos AR", "De Euro a Pesos AR", "De Libras Esterlinas a Pesos AR", "De Yen Japonés a Pesos AR", "De Won sul-Coreano a Pesos AR"},
					"Selección")).toString();
		switch(opcion) {
			case"De Pesos AR a Dólar": 
				monedas.ConvertirPesosArgentinosADolares(valor);
				break;
			
			case "De Pesos AR a Euro":
				monedas.ConvertirPesosArgentinosAEuros(valor);
				break;
		
			case "De Pesos AR a Libras Esterlinas":
				monedas.ConvertirPesosArgentinosALibras(valor);
				break;
			
			case "De Pesos AR a Yen Japonés":
				monedas.ConvertirPesosArgentinosAYen(valor);
				break;
			
			case "De Pesos Ar a Won sul-Coreano":
				monedas.ConvertirPesosArgentinosAWon(valor);
				break;
			
			case "De Dólar a Pesos AR":
				monedas.ConvertirDolaresAPesosArgentinos(valor);
				break;
			
			case "De Euro a Pesos AR":
				monedas.ConvertirEurosAPesosArgentinos(valor);
				break;
			
			case "De Libras Esterlinas a Pesos AR":
				monedas.ConvertirLibrasAPesosArgentinos(valor);
				break;
			
			case "De Yen Japonés a Pesos AR":
				monedas.ConvertirYenPesosArgentinos(valor);
				break;
			
			case "De Won sul-Coreano a Pesos AR":
				monedas.ConvertirWonAPesosArgentinos(valor);
				break;
			
		}
	}
}