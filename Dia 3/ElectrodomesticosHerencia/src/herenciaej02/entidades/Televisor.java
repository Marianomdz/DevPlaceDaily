package herenciaej02.entidades;

import java.util.Scanner;

/**
 *
 * @author Mariano_mdz
 */
public class Televisor extends Electrodomestico {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private float resolucion;
    private boolean tdt = false;

    public Televisor() {
    }

    public Televisor(float resolucion, boolean tdt, float precio, String color, String consumoEnergetico, float peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
        precioFinal(peso, consumoEnerg, precio);
    }

    public float getResolucion() {
        return resolucion;
    }

    public void setResolucion(float resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Televisor{" + "resolucion= " + resolucion + ", tdt= " + tdt + ", precio= " + precio + ", color= " + color + ", consumoEnerg= " + consumoEnerg + ", peso= " + peso + '}';
    }

    public Televisor crearTelevisor() {
        String op;

        System.out.println("Vamos a crear un Televisor!!");
        super.crearElectro();
        System.out.println("Digite la resolucion:");
        resolucion = sc.nextFloat();
        System.out.println("Posee TDT ? SI/NO");
        op = sc.next();
        if (op.equalsIgnoreCase("si")) {
            tdt = true;
        }
        precioFinal(peso, consumoEnerg, precio);
        return new Televisor(resolucion, tdt, precio, color, consumoEnerg, peso);
    }

    @Override
    public void precioFinal(float peso1, String consumoEnergetico, float precio2) {
        super.precioFinal(peso1, consumoEnergetico, precio2);

        if (resolucion > 40) {
            this.precio = (float) (this.precio * 1.3);
        }
        if (tdt == true) {
            this.precio = this.precio + 500;
        }

    }

}
