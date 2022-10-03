package ConversorTemperatura;

import javax.swing.JOptionPane;

public class OpcionesConversionTemperatura {
	ConvertirTemperatura temperatura = new ConvertirTemperatura();
	
	public void ConvertirTemperatura(double valor) {
		
		String opcion = (JOptionPane.showInputDialog(null, "Elige el de temperatura que deseas convertir", "Temperatura",
				JOptionPane.PLAIN_MESSAGE, null, new Object[]{
						"De Celsius a Farenheit", "De Farenheit a Celsius"},
						"Selección")).toString();
			switch(opcion) {
				case"De Celsius a Farenheit": 
					temperatura.ConvertirCelsiusAFarenheit(valor);
					break;
				
				case "De Farenheit a Celsius":
					temperatura.ConvertirFarenheitACelsius(valor);
					break;
			}
	}

}