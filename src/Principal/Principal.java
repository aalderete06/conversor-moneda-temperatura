package Principal;
import javax.swing.*;

import ConversorDivisas.OpcionesConversionMonedas;
import ConversorTemperatura.OpcionesConversionTemperatura;
public class Principal {

	public static void main(String[] args) {
		OpcionesConversionMonedas convertirMoneda = new OpcionesConversionMonedas();
		OpcionesConversionTemperatura convertirTemperatura = new OpcionesConversionTemperatura();
		
		while(true) {
			String opciones =(String) JOptionPane.showInputDialog(null, "Selecciones una opci�n de conversi�n", "Men�",JOptionPane.PLAIN_MESSAGE, null, new Object[] {
					"Conversor de Monedas", "Conversor de Temperatura"
			}, "Elegir");
			
			if (opciones =="Conversor de Monedas" && opciones != null) {
				try {
				String input = JOptionPane.showInputDialog(null, "Ingrese un Valor");
				double valorRecibido = Double.parseDouble(input);
				convertirMoneda.ConvertirMonedas(valorRecibido);
				}
				catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Valor no V�lido");
					
				}
			
				int respuesta = JOptionPane.showConfirmDialog(null, "�Desea realizar otra conversi�n?");
				if(JOptionPane.OK_OPTION == respuesta) {
					System.out.println("Seleccion� respuesta afirmativa");
				} else {
					JOptionPane.showMessageDialog(null, "Gracias por usar el Conversor");
				}
			}else if (opciones == "Conversor de Temperatura"&& opciones != null) {
					try {
					String inputTemperatura = JOptionPane.showInputDialog(null, "Ingrese un Valor");
					double valorRecibido = Double.parseDouble(inputTemperatura);
					convertirTemperatura.ConvertirTemperatura(valorRecibido);
					}
					catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Valor no V�lido");
					
				}
			
				int respuestaTemperatura = JOptionPane.showConfirmDialog(null, "�Desea realizar otra conversi�n?");
				if(JOptionPane.OK_OPTION == respuestaTemperatura) {
					System.out.println("Seleccion� respuesta afirmativa");
				} else {
					JOptionPane.showMessageDialog(null, "Gracias por usar el Conversor");
				}
			} else {
				JOptionPane.showMessageDialog(null, "Gracias por usar el Conversor");
				break;
			}
		}
	}
}