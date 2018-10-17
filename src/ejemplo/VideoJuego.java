package ejemplo;

public class VideoJuego {

	public static void main(String[] args) {
		Persona manuel = new Persona (22,4);
		Persona santiago = new Persona (22);
		Persona javier = new Persona (19);
		Persona david = new Persona("David", 4, "Negro", true, 25, 1.7);
		
		santiago.saludar();
		System.out.println(santiago.dimeEdad());
		javier.saludar();
		System.out.println(javier.dimeEdad());
		System.out.println("Tengo pelo: " + javier.getTienePelo());
		david.saludar();
		System.out.println("Hola, me llamo " + david.getNombre());
		System.out.println(david.dimeEdad());
		System.out.println("Tengo pelo: " + david.getTienePelo());
	}

}
