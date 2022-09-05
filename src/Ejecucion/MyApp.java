package Ejecucion;
import java.io.FileNotFoundException;

import Metodo.RegistroCabra;
import Metodo.RegistroVaca;

public class MyApp {

    static void run() throws FileNotFoundException {
		RegistroVaca  vaca = new RegistroVaca();//INVOCACION DE LA CLASES CON LOS ATRIBUTOS
        RegistroCabra cabra = new RegistroCabra();//INVOCACION DE LA CLASES CON LOS ATRIBUTOS
		vaca.imprimeDatos();
        cabra.imprimeDatosCabra();
        vaca.impCantidadProductoVaca();
        cabra.impCantidadProductoCabra();
        vaca.imprimeMaxVacas();
        cabra.imprimeMaxCabras();
	}

    public static void main(String[] args) throws FileNotFoundException {//CREACION DE FICHERO SIN RUTA ESPECIFICADA
        run();
    }
}

