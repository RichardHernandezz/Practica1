package ClaseH;

import ClaseP.Animal;

public class Cabras extends Animal { //CABRAS HEREDA DE LA CLASE ANIMAL
	private byte meses;

	// CONSTRUCTOR CABRAS
	public Cabras(String codigoRegistro, int cantidadProducto, String fechaAdq, String raza, byte edad, short año,
			byte meses) {
		super(codigoRegistro, cantidadProducto, fechaAdq, raza, edad, año);
		this.meses = meses;
	}

	// METODO GET
	public byte getMeses() {
		return meses;
	}

	//METODO SET
	public void setMeses(byte meses) {
		this.meses = meses;
	}

}
