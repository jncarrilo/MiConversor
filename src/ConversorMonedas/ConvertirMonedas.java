package ConversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {

	// Convertir Pesos Colombianos a Dolares (Julio 27 de 2023)
	public void ConvertirPesosADolares(double valor) {
		double monedaDolar = valor / 3958.83;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Dolares");
	}
	
	// Convertir Pesos Colombianos a Euros (Julio 27 de 2023)
	public void ConvertirPesosAEuros(double valor) {
		double monedaEuro = valor / 4345.94;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Euros");
	}
	// Convertir Pesos Colombianos a Libras (Julio 27 de 2023)
	public void ConvertirPesosALibras(double valor) {
		double monedaLibra = valor / 5063.29;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibra+ " Libras Esterlinas");
	}
	
	// Convertir Pesos Colombianos a Yen (Julio 27 de 2023)
	public void ConvertirPesosAYen(double valor) {
		double monedaYen = valor / 29.43;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Yuanes");
	}
	
	// Convertir Pesos Colombianos a Won (Julio 27 de 2023)
	public void ConvertirPesosAWon(double valor) {
		double monedaWon = valor / 3.09;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Wons");
	}
}

