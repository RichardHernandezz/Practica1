package Metodo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import ClaseH.Cabras;

public class RegistroCabra {
    final int N = 300;
	private int limite;
	private Cabras lista[];

    public RegistroCabra() throws FileNotFoundException {
		limite = 0;
		lista  = new Cabras[N];
		cargaCabras();
	}

    // Lectura de datos del archivo txt
	private void cargaCabras() throws FileNotFoundException  {
    	Scanner input;
		
		input = new Scanner(new FileInputStream("C:\\Archivos\\DatosCabra.txt"));
		input.useDelimiter(";");
		while (input.hasNext()) {
			String codigoRegistro = input.next();
			int cantidadProducto  = input.nextInt();
			String fechaAdq       = input.next();
			String raza           = input.next();
			byte edad             = input.nextByte();
			short año            = input.nextShort();
			byte meses          = input.nextByte();
			lista[limite++] = new Cabras(codigoRegistro, cantidadProducto, fechaAdq, raza, edad, año, meses);
		}

		input.close();	
    }

    // Cantidad de producto (leche) por mes
	public int getCantidadProdMensual() {
		int producto = 0;
		for(int i=0; i<limite; i++)
			producto+=lista[i].getCantidadProducto();
		return producto;
	}

    // Calculo de la cantidad de productos maximos: 
	public float getMaxProducto() {
		float mProd = 0;
		for(int i=0;i<limite;i++)
    		if(lista[i].getCantidadProducto()>mProd)
				mProd = lista[i].getCantidadProducto();
		return mProd;
	}

	// Impresión de cabras con mayor produccion de leche
	public void imprimeMaxCabras() {
		float mProdcuto = getMaxProducto();
		System.out.print("Las Cabras con mayor produccion de leche son: \n");
		for(int i=0; i<limite; i++)
			if(lista[i].getCantidadProducto()==mProdcuto)
				System.out.println(lista[i].getCodigoRegistro());
	}

    // Impresion de datos generales
	public void imprimeDatosCabra() {
		System.out.println("\nCabras: ");
    	for(int i=0; i<limite; i++) {
    		System.out.print(lista[i].getCodigoRegistro());
    		System.out.print("\t"+lista[i].getCantidadProducto());
    		System.out.print("\t"+(lista[i].getCantidadProducto()*100)/getCantidadProdMensual()+"%");
    		System.out.print("\t"+lista[i].getFechaAdq());
    		System.out.print("\t"+lista[i].getRaza());
    		System.out.print("\t"+lista[i].getEdad());
    		System.out.print("\t"+lista[i].getAño());
    		System.out.print("\t"+lista[i].getMeses()+"\n");
    	}
    }

    public void impCantidadProductoCabra() {
		System.out.println("\n\nEl producto total obtenido de la Cabra por mensualidad es: "+getCantidadProdMensual());
	}
}


