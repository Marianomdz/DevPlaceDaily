/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import interfaces.calculosFormas;
import java.util.Scanner;

/**
 *
 * @author Mariano_mdz
 */
public class Circulo implements calculosFormas{
    
    
    
    public double radio;
    public double diametro;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
        this.diametro = Math.pow(radio, 2);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    
    
    
    
    
    @Override
    public double calacularArea() {
        
        double area = (constantePi*radio)* Math.pow(this.radio, 2);
        return area;
    }

    @Override
    public double calcularPerimetro() {
       double perimetro = constantePi*this.diametro;
        
       return perimetro;
    }
    
    
}
