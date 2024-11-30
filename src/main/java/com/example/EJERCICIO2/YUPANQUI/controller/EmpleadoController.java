/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.EJERCICIO2.YUPANQUI.controller;

import com.example.EJERCICIO2.YUPANQUI.model.Empleado;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmpleadoController {

    // Mostrar el formulario
    @GetMapping("/formulario")
    public String mostrarFormulario() {
        return "formulario_empleado";
    }

    // Procesar el formulario y mostrar los resultados
    @PostMapping("/resultado")
    public String mostrarResultado(
        @RequestParam("sueldoBase") double sueldoBase,
        @RequestParam("horasExtra") int horasExtra,
        Model model
    ) {
        // Crear instancia del modelo
        Empleado empleado = new Empleado();
        empleado.setSueldoBase(sueldoBase);
        empleado.setHorasExtra(horasExtra);

        // Calcular resultados
        double tarifaPorHora = empleado.calcularTarifaPorHora();
        double sueldoTotal = empleado.calcularSueldoTotal();

        // Agregar datos al modelo
        model.addAttribute("sueldoBase", sueldoBase);
        model.addAttribute("horasExtra", horasExtra);
        model.addAttribute("tarifaPorHora", tarifaPorHora);
        model.addAttribute("sueldoTotal", sueldoTotal);

        return "resultado_empleado"; // Retorna la vista de resultados
    }
}

