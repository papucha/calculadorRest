package com.calculadora.paula.rest.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * 
 * @author Paula Andrea Vargas <>
 * <br/>
 * Date: 10/04/2018 9:04:30 a.m.
 *
 */
@JsonAutoDetect
@JsonSerialize
public class RequestDTO implements Serializable {

    private static final long serialVersionUID = 6872117570224011584L;
    
    @JsonProperty(required = true)
    private float num1;
    @JsonProperty(required = true)
    private float num2;
    @JsonProperty(required = true)
    private char operador;
    
    public float getNum1() {
        return this.num1;
    }
    
    public void setNum1(final float num1) {
        this.num1 = num1;
    }
    
    public float getNum2() {
        return this.num2;
    }
    
    public void setNum2(final float num2) {
        this.num2 = num2;
    }
    
    public char getOperador() {
        return this.operador;
    }
    
    public void setOperador(final char operador) {
        this.operador = operador;
    }
}
