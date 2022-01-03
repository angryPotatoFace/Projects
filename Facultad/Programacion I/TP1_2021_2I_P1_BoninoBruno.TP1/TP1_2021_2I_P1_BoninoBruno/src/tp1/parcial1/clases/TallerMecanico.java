package tp1.parcial1.clases;
import java.awt.desktop.PrintFilesEvent;
import java.util.ArrayList;

public class TallerMecanico {

/*	todo completar */	
	private ArrayList<Servicio> serviciosEfectuados;
	private String nombre;
	private static final String FORMATO_CANTIDADES = "Se efectuaron: %d cambios de aceite, %d encendido y %d alineacion\n";

	
	public TallerMecanico(String nombre) {
		this.nombre=nombre;
		this.serviciosEfectuados = new ArrayList<Servicio>();
	}
	
	public boolean agregarServicio(Servicio nuevoServicio) {
		boolean pudo = false;
		if( buscarServicio(nuevoServicio)== null && nuevoServicio != null ){
			this.serviciosEfectuados.add(nuevoServicio);
			pudo=true;
		}
		return pudo;
	}
	
	public Servicio buscarServicio(Servicio service){
		Servicio encontrado=null;
		int i=0;
		
		while(encontrado==null && i<serviciosEfectuados.size() && service!=null){
			if(service.equals(serviciosEfectuados.get(i))) {
				encontrado = serviciosEfectuados.get(i);
			}
			i++;
		}
		return encontrado;
	}
	
	public void listarServicios() {
		double importe=0;
		int aceite=0,encendido=0,alineacion=0;
		System.out.println("Taller "+this.nombre);
		
		for (Servicio servicio : serviciosEfectuados) {
			importe += servicio.calcularPrecioVenta();
			if(servicio instanceof CambioAceite){
				aceite++;
			}
			if(servicio instanceof Encendido) {
				encendido++;
			}
			if(servicio instanceof Alineacion) {
				alineacion++;
			}
		}
		System.out.println("Se efecturon: "+aceite+" cambios de aceite, "+encendido+" encendido y "+alineacion+" alineacion" );
		System.out.println("El importe total de ventas es de $"+importe);
	}
}
