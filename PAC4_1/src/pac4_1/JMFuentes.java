package pac4_1;

public class JMFuentes {
	public String nombre;
	public String apellido1;
	public int edad;
	
	/////////////////////////////////CONSTRUCTOR/////////////////////////////////
	public JMFuentes(String nombre, String apellido1, int edad) {
		this.nombre="José Manuel";
		this.apellido1="Fuentes Fernández";//Añado segundo apellido//
		this.edad=19;
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