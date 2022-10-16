/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author USUARIO
 */
public class Empleado 
    {
    String nombre;
    int horasTrabajadas;
    double costoHora;
    int yearIngreso;
    
    
    public String mostrarInfo(){
        var retorno="El empleado se llama : "+this.nombre+" el empleado trabajo estas horas: "+this.horasTrabajadas+" el costo por hora es:  "
                +this.costoHora+" e ingreso en el año : "+this.yearIngreso;
        return retorno;
    }
    public Double calcularIngreso(int yearActual){
        var antiguedad=0.0d;
        var retorno=0.0d;
        var porcentaje=0.0d;
        var horaExtra=0;
        if (this.horasTrabajadas<=160){
            porcentaje=(((yearActual)-this.yearIngreso)*2)/100;
            antiguedad=(this.costoHora*this.horasTrabajadas*porcentaje);
            retorno=(this.costoHora*this.horasTrabajadas)+antiguedad;
            return retorno;
        }else{
            porcentaje=(((yearActual)-this.yearIngreso)*2)/100;
            horaExtra=this.horasTrabajadas-160;
            antiguedad=(this.costoHora*(this.horasTrabajadas-horaExtra)*porcentaje);
            retorno=(this.costoHora*(this.horasTrabajadas-horaExtra))+antiguedad;
            return retorno;
        }
    }
     
    
    public double calcularBonoHoraExtra(){
        var retorno=0.0d;
        if(this.horasTrabajadas>160){
            var horaExtra=0;
            horaExtra=(this.horasTrabajadas-160)*2;
            retorno=this.costoHora*horaExtra;
            return retorno;
        }else{
            retorno=0;
            return retorno;
        }
       
    }
     
    /*
    limite0: 3200-No paga impuesto
    limite1: >3200 y 3800< -Paga el 5%
    limite2: >3800 y 4400< -Paga el 12%
    limite3: >4400 -Paga el 25%
    */
    
    
    public double calcularImpuesto(int limite1,int limite2,int limite3)
    {
        var retorno=0.0d;
        var resta=0.0d;
        if(this.calcularIngreso(2022)<=limite1&&this.calcularIngreso(2022)>0){
            retorno=0;
        }else if(this.calcularIngreso(2022)>limite1&&this.calcularIngreso(2022)<=limite2){
            retorno=this.calcularIngreso(2022)*0.05;
        }else if(this.calcularIngreso(2022)>limite2&&this.calcularIngreso(2022)<=limite3){
            retorno=this.calcularIngreso(2022)*0.12;
        }else if(this.calcularIngreso(2022)>limite3){
            retorno=this.calcularIngreso(2022)*0.25;
        }
        return retorno;
    }
    
    public double calcularTotal(){
        var retorno= 0.0d;
        retorno=this.calcularIngreso(2022)+this.calcularBonoHoraExtra()-this.calcularImpuesto(1000, 2000, 3000);
        return retorno;         
    }
   
}

