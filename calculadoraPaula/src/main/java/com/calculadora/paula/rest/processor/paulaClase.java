package com.calculadora.paula.rest.processor;

import org.apache.camel.Exchange;
import org.springframework.stereotype.Component;
import org.apache.camel.Processor;

@Component("CALCULAR")
public class paulaClase implements Processor {
	public void process(final Exchange exchange) throws Exception {
		final float num1 = (float) exchange.getProperty("Numero1",  Float.TYPE);
		final float num2 = (float) exchange.getProperty("Numero2",  Float.TYPE);
		final String operacion = (String) exchange.getProperty("Operador", (Class<?>) String.class);
		final char operador = operacion.charAt(0);
		final float resultado ;
		if (operador == '+') {
			resultado = num1 + num2;
			exchange.getOut().setBody((Object) resultado);
		} else if (operador == '-') {
			resultado = num1 - num2;
			exchange.getOut().setBody((Object) resultado);
		} else if (operador == '*') {
			resultado = num1 * num2;
			exchange.getOut().setBody((Object) resultado);
		} else {
			if (operador == '/') {
				resultado = num1 / num2;
				exchange.getOut().setBody((Object) resultado);
			}
		}
	}
}
