/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.principal;

/**
 *
 * @author FPS
 */
public class Principal 
{
   
    public static void main(String[] args) {
        var empleado1 = new Empleado();
        var empleado2 = new Empleado();
        var empleado3 = new Empleado();
        
        empleado1.nombre="Manuel Yanza";
        empleado1.costoHora=4;
        empleado1.horasTrabajadas=140;
        empleado1.yearIngreso=2010;
        
        System.out.println(empleado1.mostrarInfo());
        System.out.println("El empleado gana un total de: "+empleado1.calcularIngreso(2022)+" $");
        System.out.println("El empleado gana un total de horas extras de: "+empleado1.calcularBonoHoraExtra()+" $");
        System.out.println("El empleado paga de impusto: "+empleado1.calcularImpuesto(1000, 2000, 3000));
        System.out.println("El empleado gana un total de: "+empleado1.calcularTotal()+" $");
        
        empleado2.nombre="Erick Otavalo";
        empleado2.costoHora=12;
        empleado2.horasTrabajadas=140;
        empleado2.yearIngreso=2018;
        
        System.out.println(empleado2.mostrarInfo());
        System.out.println("El empleado gana un total de: "+empleado2.calcularIngreso(2022)+" $");
        System.out.println("El empleado gana un total de horas extras de: "+empleado2.calcularBonoHoraExtra()+" $");
        System.out.println("El empleado paga de impusto: "+empleado2.calcularImpuesto(1000, 2000, 3000));
        System.out.println("El empleado gana un total de: "+empleado2.calcularTotal()+" $");
        
        empleado3.nombre="Pepito Salesiano";
        empleado3.costoHora=10;
        empleado3.horasTrabajadas=180;
        empleado3.yearIngreso=2000;
        
        System.out.println(empleado3.mostrarInfo());
        System.out.println("El empleado gana un total de: "+empleado3.calcularIngreso(2022)+" $");
        System.out.println("El empleado gana un total de horas extras de: "+empleado3.calcularBonoHoraExtra()+" $");
        System.out.println("El empleado paga de impusto: "+empleado3.calcularImpuesto(1000, 2000, 3000));
        System.out.println("El empleado gana un total de: "+empleado3.calcularTotal()+" $");
    }
}
