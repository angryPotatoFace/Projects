package tp1.examenfinal.clases;

public enum Origen {

	ARGENTINA("Argentina"), BRITANICA("Britanica"), AMERICANA("Norte Americana"), COLOMBIANA("Colombiana"), 
	MEXICANA("Mexicana"), VENEZOLANA("Venezolana"), CUBANA("Cubana"), PERUANA("Peruana"), URUGAUAYA("Uruguaya"), BRASILERA("Brasilera"), 
	ESPANIOLA("Española"), FRANCESA("Francesa");
	
	private String nombre;
	
	private Origen(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return this.nombre;
	}
}
