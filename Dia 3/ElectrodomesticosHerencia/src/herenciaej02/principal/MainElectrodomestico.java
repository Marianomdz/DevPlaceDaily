package herenciaej02.principal;

import herenciaej02.entidades.Electrodomestico;
import herenciaej02.entidades.Lavadora;
import herenciaej02.entidades.Televisor;

import java.util.ArrayList;
import java.util.List;

/*
 * @author Mariano_mdz 
 */
public class MainElectrodomestico {

    public static void main(String[] args) {

        Lavadora lavadora1 = new Lavadora();

        Electrodomestico lavadora2 = new Lavadora(80, 1500, "rojo", "B", 30);
        Electrodomestico lavadora3 = new Lavadora(30, 1000, "gris", "C", 18);
        Electrodomestico lavadora4 = new Lavadora(65, 1200, "blanco", "A", 25);

        Televisor tele1 = new Televisor();
        Electrodomestico tele2 = new Televisor(42, true, 13000, "negro", "A", 10);
        Electrodomestico tele3 = new Televisor(32, true, 10000, "negro", "B", 10);
        Electrodomestico tele4 = new Televisor(54, true, 18000, "gris", "A", 12);

        lavadora1.crearLavadora();
        tele1.crearTelevisor();

        List<Electrodomestico> electrodomesticos = new ArrayList();
        electrodomesticos.add(lavadora1);
        electrodomesticos.add(lavadora2);
        electrodomesticos.add(lavadora3);
        electrodomesticos.add(lavadora4);
        electrodomesticos.add(tele1);
        electrodomesticos.add(tele2);
        electrodomesticos.add(tele3);
        electrodomesticos.add(tele4);

        double totalElectros = 0;
        double totalElectrosLav = 0;
        double totalElectrosTv = 0;
        Integer contLavadora = 0;
        Integer contTv = 0;
        for (Electrodomestico aux : electrodomesticos) {
            if (aux instanceof Lavadora) {
                contLavadora++;
                totalElectrosLav = totalElectrosLav + aux.isPrecio();
            }
            if (aux instanceof Televisor) {
                contTv++;
                totalElectrosTv = totalElectrosTv + aux.isPrecio();

            }

            System.out.println(aux.toString());

        }

        totalElectros = totalElectrosLav + totalElectrosTv;
        System.out.println("Total de Lavadoras: " + contLavadora + " Precio: $" + totalElectrosLav);
        System.out.println("Total de Televisores: " + contTv + " Precio: $" + totalElectrosTv);
        System.out.println("Precio Total = $ " + totalElectros);

        //System.out.println("$ "+totalElectros);
        //System.out.println(lavadora1.toString());
    }

}
