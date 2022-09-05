package ClaseH;

import ClaseP.Animal;

public class Vacas extends Animal { //HEREDA LOS ATRIBUTOS DE LA CLASE ANIMAL
	private byte semanas;

	// CONSTRUCTOR
	public Vacas(String codigoRegistro, int cantidadProducto, String fechaAdq, String raza, byte edad, short año,
			byte semanas) {
		super(codigoRegistro, cantidadProducto, fechaAdq, raza, edad, año);
		this.semanas = semanas;
	}

	//METODO SET
	public byte getSemanas() {
		return semanas;
	}

	//METODO GET
	public void setSemanas(byte semanas) {
		this.semanas = semanas;
	}

}
