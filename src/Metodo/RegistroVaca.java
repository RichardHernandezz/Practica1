package Metodo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import ClaseH.Vacas;

public class RegistroVaca {
    final int N = 300;
	private int limite;
	private Vacas lista[];

	public RegistroVaca() throws FileNotFoundException {
		limite = 0;
		lista  = new Vacas[N];
		cargaVacas();
	}

	// Lectura de datos del archivo txt
	private void cargaVacas() throws FileNotFoundException  {
    	Scanner input;
		
		input = new Scanner(new FileInputStream("C:\\Archivos\\DatosVaca.txt"));
		input.useDelimiter(";");
		while (input.hasNext()) {
			String codigoRegistro = input.next();
			int cantidadProducto  = input.nextInt();
			String fechaAdq       = input.next();
			String raza           = input.next();
			byte edad             = input.nextByte();
			short año            = input.nextShort();
			byte semanas          = input.nextByte();
			lista[limite++] = new Vacas(codigoRegistro, cantidadProducto, fechaAdq, raza, edad, año, semanas);
		}

		input.close();	
    }

	// Cantidad de producto (leche) por semana
	public int getCantidadProdSemanal() {
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

	// Impresión de vacas con mayor produccion de leche
	public void imprimeMaxVacas() {
		float mProdcuto = getMaxProducto();
		System.out.print("Las vacas con mayor produccion de leche son: \n");
		for(int i=0; i<limite; i++)
			if(lista[i].getCantidadProducto()==mProdcuto)
				System.out.println(lista[i].getCodigoRegistro());
	}

	// Impresion de datos generales
	public void imprimeDatos() {
		System.out.println("Vacas: ");
    	for(int i=0; i<limite; i++) {
    		System.out.print(lista[i].getCodigoRegistro());
    		System.out.print("\t"+lista[i].getCantidadProducto());
    		System.out.print("\t"+(lista[i].getCantidadProducto()*100)/getCantidadProdSemanal()+"%");
    		System.out.print("\t"+lista[i].getFechaAdq());
    		System.out.print("\t"+lista[i].getRaza());
    		System.out.print("\t"+lista[i].getEdad());
    		System.out.print("\t"+lista[i].getAño());
    		System.out.print("\t"+lista[i].getSemanas()+"\n");
    	}
    }

	public void impCantidadProductoVaca() {
		System.out.println("\n\nEl producto total obtenido de la vaca por semana es: "+getCantidadProdSemanal());
	}
}


