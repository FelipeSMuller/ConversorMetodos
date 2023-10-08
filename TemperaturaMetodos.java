package treinandoMetodos;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class TemperaturaMetodos {

	// Método de formatação para temperaturas em Fahrenheit
	public static String formatacaoFahrenheit(Double temperatura) {

		String formatacaoDecimal = "";

		DecimalFormat df = new DecimalFormat("##.## °F");

		formatacaoDecimal = df.format(temperatura);

		return formatacaoDecimal;

	}

	// Método de formatação para temperaturas em Celsius

	public static String formatacaoCelsius(Double temperatura) {

		String formatacaoDecimal = "";

		// Utilização do DecimalFormat para formatações decimais
		DecimalFormat df = new DecimalFormat("##.## °C");

		formatacaoDecimal = df.format(temperatura);

		// Retorna a formatação
		return formatacaoDecimal;

	}

	// Método de formatação para temperaturas em Kelvin

	public static String formatacaoKelvin(Double temperatura) {

		String formatacaoDecimal = "";

		DecimalFormat df = new DecimalFormat("##.## °K");

		formatacaoDecimal = df.format(temperatura);

		return formatacaoDecimal;

	}

	public static void tratamentoDeErro(Double temperatura) {

		try {

			// Após receber um número com ponto flutuante, verifica se é menor ou igual a 0
			if (temperatura <= 0) {

				JOptionPane.showMessageDialog(null, "Insira temperaturas maiores do que zero!!!");

			}

		} catch (NumberFormatException | NullPointerException erro) {

			JOptionPane.showMessageDialog(null,
					"Dados não numéricos foram inseridos ou o programa foi fechado incorretamente!!!");
		}

	}

	// Método para conversão de Celsius para Fahrenheit
	public static void celsiusFahrenheit(Double temperatura) {

		// verifica o valor do parametro
		tratamentoDeErro(temperatura);

		// Obtém o calculo e armazena em uma variavel.
		Double fahrenheit = (temperatura * 9 / 5) + 32;

		// Chama o método para formatar o valor
		String formatacaoTemperatura = formatacaoFahrenheit(fahrenheit);

		// Chama o método para formatar o valor

		String formatacaoCelsius = formatacaoCelsius(temperatura);

		// Imprime os valores formatados no prompt.
		JOptionPane.showMessageDialog(null, "Temperatura em Celsius:  " + formatacaoCelsius
				+ "\nTemperatura em Fahrenheit:  " + formatacaoTemperatura);

	}

	public static void fahrenheitCelsius(Double temperatura) {

		// verifica o valor do parametro

		tratamentoDeErro(temperatura);

		// Obtém o calculo e armazena em uma variavel.

		Double celsius = (temperatura - 32) * 5 / 9;

		// Chama o método para formatar o valor

		String formatacaoCelsius = formatacaoCelsius(celsius);

		// Chama o método para formatar o valor

		String formatacaoFahrenheit = formatacaoFahrenheit(temperatura);

		// Imprime os valores formatados no prompt.

		JOptionPane.showMessageDialog(null, "Temperatura em Fahrenheit:  " + formatacaoFahrenheit
				+ "\nTemperatura em Celsius:  " + formatacaoCelsius);

	}

	public static void celsiusKelvin(Double temperatura) {

		// Verifica o parametro
		tratamentoDeErro(temperatura);

		// Atribui o calculo em uma variavel
		Double kelvin = temperatura + 273.15;

		// Atribui em uma variavel o método para conversão de temperaturas em kelvin
		String formatacaoKelvin = formatacaoKelvin(kelvin);

		// Atribui em uma variavel o método para conversão de temperaturas em Celsius
		String formatacaoCelsius = formatacaoCelsius(temperatura);

		//Imprime no prompt as temperaturas formatadas.
		JOptionPane.showMessageDialog(null,
				"Temperatura em Celsius:  " + formatacaoCelsius + "\nTemperatura em Kelvin:  " + formatacaoKelvin);

	}

	public static void kelvinCelsius(Double temperatura) {

		tratamentoDeErro(temperatura);

		Double celsius = temperatura - 273.15;

		String formatacaoCelsius = formatacaoCelsius(celsius);

		String formatacaoKelvin = formatacaoKelvin(temperatura);

		JOptionPane.showMessageDialog(null,
				"Temperatura em Kelvin:  " + formatacaoKelvin + "\nTemperatura em Celsius:  " + formatacaoCelsius);

	}

	public static void fahrenheitKelvin(Double temperatura) {

		tratamentoDeErro(temperatura);

		Double kelvin = (temperatura - 32) * 5 / 9 + 273.15;

		String formatacaoFahrenheit = formatacaoFahrenheit(temperatura);

		String formatacaoKelvin = formatacaoKelvin(kelvin);

		JOptionPane.showMessageDialog(null,
				"Temperatura em Fahrenheit:  " + formatacaoFahrenheit + "\nTemperatura em Kelvin: " + formatacaoKelvin);

	}

	public static void kelvinFahrenheit(Double temperatura) {

		tratamentoDeErro(temperatura);

		Double fahrenheit = (temperatura - 273.15) * 9 / 5 + 32;

		String formatacaoFahrenheit = formatacaoFahrenheit(fahrenheit);

		String formatacaoKelvin = formatacaoKelvin(temperatura);

		JOptionPane.showMessageDialog(null,
				"Temperatura em Kelvin:  " + formatacaoKelvin + "\nTemperatura em Fahrenheit: " + formatacaoFahrenheit);

	}

}
