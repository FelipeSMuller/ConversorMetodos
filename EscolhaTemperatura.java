package treinandoMetodos;

import javax.swing.JOptionPane;

public class EscolhaTemperatura {

	public static void main(String[] args) {

		Double temperatura = 0.0;

		int userInput = 0;

		do {

			try {

				// Opções que o usuário pode selecionar
				userInput = Integer.parseInt(JOptionPane.showInputDialog(null,
						"CONVERSOR DE TEMPERATURAS \n1-Converter de Celsius para Fahrenheit"
								+ " \n2-Converter de Fahrenheit para Celsius" + " \n3-Converter de Celsius para Kelvin "
								+ "\n4-Converter de Kelvin para Celsius \n5-Converter de Fahrenheit para Kelvin"
								+ " \n6-Converter de Kelvin para Fahrenheit"));

				// Tratamento de erro, caso o programa seja fechado ou dados incorretos sejam
				// fornecidos
			} catch (NullPointerException | NumberFormatException erro) {

				JOptionPane.showMessageDialog(null,

						"Dados não numéricos foram inseridos ou o programa foi fechado incorretamente!!!");
			}

			switch (userInput) {

			case 1:

				temperatura = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a temperatura em Celsius"));

				TemperaturaMetodos.celsiusFahrenheit(temperatura);

				break;

			case 2:

				temperatura = Double
						.parseDouble(JOptionPane.showInputDialog(null, "Insira a temperatura em Fahrenheit"));

				TemperaturaMetodos.fahrenheitCelsius(temperatura);

				break;

			case 3:

				temperatura = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a temperatura em Celsius"));

				TemperaturaMetodos.celsiusKelvin(temperatura);

				break;

			case 4:

				temperatura = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a temperatura em Kelvin"));

				TemperaturaMetodos.kelvinCelsius(temperatura);

				break;

			case 5:

				temperatura = Double
						.parseDouble(JOptionPane.showInputDialog(null, "Insira a temperatura em Fahrenheit"));

				TemperaturaMetodos.fahrenheitKelvin(temperatura);

				break;

			case 6:

				temperatura = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a temperatura em Kelvin"));

				TemperaturaMetodos.kelvinFahrenheit(temperatura);

				break;

			default:

				JOptionPane.showMessageDialog(null,
						"Nenhuma opção foi selecionada, portanto a aplicação foi encerrada!!!!");

				break;
			}

		} while (userInput > 0);

	}

}
