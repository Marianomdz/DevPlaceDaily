
package herenciaej02.entidades;

import java.util.Scanner;

/**
 *
 * @author Mariano_mdz
 */
public class Lavadora extends Electrodomestico {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    float cargaLavadora;

    public Lavadora() {
    }

    public Lavadora(float cargaLavadora) {
        this.cargaLavadora = cargaLavadora;
    }

    public Lavadora(float cargaLavadora, float precio, String color, String consumoEnerg, float peso) {
        super(precio, color, consumoEnerg, peso);
        this.cargaLavadora = cargaLavadora;
        precioFinal(peso, consumoEnerg, precio);
    }

    public float getCargaLavadora() {
        return cargaLavadora;
    }

    public void setCargaLavadora(float cargaLavadora) {
        this.cargaLavadora = cargaLavadora;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public float getPrecio() {
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
        return "Lavadora{" + "cargaLavadora= " + cargaLavadora + ", precio= " + precio + ", color= " + color + ", consumoEnerg= " + consumoEnerg + ", peso= " + peso + '}';
    }

    public Lavadora crearLavadora() {

        System.out.println("Vamos a crear una Lavadora!!");
        super.crearElectro();

        System.out.println("Ingrese la Caopacidad de carga de la lavadora");
        cargaLavadora = leer.nextFloat();
        precioFinal(peso, consumoEnerg, precio);
        return new Lavadora(cargaLavadora, precio, color, consumoEnerg, peso);
    }

    @Override
    public void precioFinal(float peso1, String consumoEnergetico, float precio2) {
        super.precioFinal(peso1, consumoEnergetico, precio2);

        if (cargaLavadora > 30) {
            this.precio = this.precio + 500;
            // this.precio=precio2;

        }

    }

}
