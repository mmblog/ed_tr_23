package pac4_1;

public class CGuerrero {
	public String nombre;
	public String apellido1;
	public int edad;
	
	/////////////////////////////////CONSTRUCTOR/////////////////////////////////
	public CGuerrero(String nombre, String apellido1, int edad) {
		this.nombre="Christian Jesus";
		this.apellido1="Guerrero";
		this.edad=28;
	}
	
	
	//////////////////////////////////METODOS///////////////////////////////////
	public void borrarDatos() {
		this.nombre="";
		this.apellido1="";
		this.edad=0;
	}
		
	public void cumpleanyo() {
		this.edad+=1;
	}
		
	@Override
	public String toString(){ 
		return "\n"+nombre+" "+apellido1+" ("+edad+")";    
	}  	
	
}