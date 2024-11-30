/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.EJERCICIO2.YUPANQUI.model;

/**
 *
 * @author Usuario
 */
public class Empleado {
private double sueldoBase;
    private int horasExtra;

    // Getters y Setters
    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    // Método para calcular la tarifa por hora
    public double calcularTarifaPorHora() {
        return sueldoBase / 160;
    }

    // Método para calcular el sueldo total a pagar
    public double calcularSueldoTotal() {
        return sueldoBase + (horasExtra * 8);
    }
}
