
package herenciaej02.entidades;

import java.util.Scanner;

/**
 *
 * @author Mariano_mdz
 */
public class Electrodomestico {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    protected float precio;
    protected String color;
    protected String consumoEnerg;
    protected float peso;

    public Electrodomestico() {
    }

    public Electrodomestico(float precio, String color, String consumoEnerg, float peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnerg = consumoEnerg;
        this.peso = peso;
    }

    public float isPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumoEnerg() {
        return consumoEnerg;
    }

    public void setConsumoEnerg(String consumoEnerg) {
        this.consumoEnerg = consumoEnerg;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnerg=" + consumoEnerg + ", peso=" + peso + '}';
    }

    public void crearElectro() {
        String color1;
        String consumo;
        float precio1;

        System.out.println("ingrese el precio");
        precio1 = leer.nextFloat();
        if (precio1 < 1000) {
            precio1 = 1000;
        }
        System.out.println("ingrese el color");
        color1 = leer.next();
        System.out.println("ingrese el consumo Energético");
        consumo = leer.next().toUpperCase();
        System.out.println("ingrese peso");
        peso = leer.nextFloat();
        color = comprobarColor(color1);
        consumoEnerg = comprobarConsumoEnergetico(consumo);

        //precio = precioFinal(peso, consumoEnerg, precio1);
    }

    public String comprobarColor(String color1) {
        String color2;

        if (color1.equalsIgnoreCase("blanco") || color1.equalsIgnoreCase("negro") || color1.equalsIgnoreCase("rojo") || color1.equalsIgnoreCase("azul") || color1.equalsIgnoreCase("gris")) {
            color2 = color1;
        } else {
            color2 = "BLANCO";
        }

        return color2;
    }

    public String comprobarConsumoEnergetico(String letra) {
        String letra2;

        if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("B") || letra.equalsIgnoreCase("C") || letra.equalsIgnoreCase("D") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("F")) {
            letra2 = letra;
        } else {
            letra2 = "F";
        }

        return letra2;
    }

    public void precioFinal(float peso1, String consumoEnergetico, float precio2) {
        //float precio1 = 1000;

        if (precio2 < 1000) {
            precio2 = 1000;
        } else {
            precio2 = precio2;
        }

        switch (consumoEnergetico) {

            case "A":
                precio2 += 1000;

                break;

            case "B":
                precio2 += 800;

                break;

            case "C":
                precio2 += 600;

                break;

            case "D":
                precio2 += 500;

                break;

            case "E":
                precio2 += 300;

                break;

            case "F":
                precio2 += 100;

                break;

            default:
                precio2 += 100;

                break;

        }

        if ((peso1 >= 1) && (peso1 <= 19)) {
            precio2 += 100;
        } else {
            if ((peso1 >= 20) && (peso1 <= 49)) {
                precio2 += 500;
            } else {
                if ((peso1 >= 50) && (peso1 <= 79)) {
                    precio2 += 800;
                } else {
                    if ((peso1 >= 80)) {
                        precio2 += 1000;
                    }

                }

            }
        }

        this.precio = precio2;
    }
}
