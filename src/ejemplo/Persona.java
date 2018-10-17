package ejemplo;

public class Persona {
	private String nombrePersona;
	private int numEstremidades;
	private String colorPelo;
	private boolean tienePelo;
	private int edad;
	private double estatura; //En metros
	
	public Persona (int edad) {
		this.edad=edad;
	}
	
	public Persona (int edad, int numEstremidades) {
		this.edad=edad;
		this.numEstremidades = numEstremidades;
	}
	
	public Persona(String nombrePersona, int numEstremidades, String colorPelo, boolean tienePelo, int edad, double estatura) {
		this.nombrePersona = nombrePersona;
		this.numEstremidades = numEstremidades;
		this.colorPelo = colorPelo;
		this.tienePelo = tienePelo;
		this.edad = edad;
		this.estatura = estatura;
	}

	public int dimeEdad () {
		return edad;
	}
	
	public void saludar () {
		System.out.println("Hola");
	}
	
	public String getNombre () {
		return nombrePersona;
	}
	
	public boolean getTienePelo () {
		return tienePelo;
	}
	
}
