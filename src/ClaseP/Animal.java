package ClaseP;

public class Animal {  //
	private int cantidadProducto;
	private String codigoRegistro, fechaAdq, raza;
	private byte edad;
	private short año;

	// C O N S T R U C T O R
	//PARAMETROS CON LAS INSTANCIAS DE LAS CARCATERITICAS DE AMBOS ANIMALES
	public Animal(String codigoRegistro, int cantidadProducto, String fechaAdq, String raza, byte edad, short año) {
		this.codigoRegistro = codigoRegistro;
		this.cantidadProducto = cantidadProducto;
		this.fechaAdq = fechaAdq;
		this.raza = raza;
		this.edad = edad;
		this.año = año;
	}

	// METODOS GET
	public String getCodigoRegistro() {
		return codigoRegistro;
	}

	public int getCantidadProducto() {
		return cantidadProducto;
	}

	public String getFechaAdq() {
		return fechaAdq;
	}

	public String getRaza() {
		return raza;
	}

	public byte getEdad() {
		return edad;
	}

	public short getAño() {
		return año;
	}

	//METODOS SET
	public void setCodigoRegistro(String codigoRegistro) {
		this.codigoRegistro = codigoRegistro;
	}

	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}

	public void setFechaAdq(String fechaAdq) {
		this.fechaAdq = fechaAdq;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public void setEdad(byte edad) {
		this.edad = edad;
	}

	public void setAño(short año) {
		this.año = año;
	}
	
}
