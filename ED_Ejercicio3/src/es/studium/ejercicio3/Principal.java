package es.studium.ejercicio3;

public class Principal
{

	public static void main(String[] args)
	{
		//CONSTRUCTOR VAC�O
		Empleado empleado1 = new Empleado ();
		empleado1.setNombre("Oriana");
		empleado1.setApellidos("P�rez Llanos");
		empleado1.setDni("45779281");
		empleado1.setDomicilio("Calle Sierpes, n�16");
		empleado1.setPuesto("Dise�ador");
		empleado1.setTelefono(623141516);
		
		System.out.println(empleado1.getNombre() + " " + empleado1.getApellidos() + " " + empleado1.getDni() + " " + empleado1.getDomicilio() + " " + empleado1.getPuesto() + " " + empleado1.getTelefono());
	
		//CONSTRUCTOR POR PAR�METROS
		Empleado empleado2 = new Empleado ("Jorge", "S�nchez Garc�a", "34231232", "Avda, La Paz, n�3", "Programador", 954654756);
		System.out.println(empleado2.getNombre() + " " + empleado2.getApellidos() + " " + empleado2.getDni() + " " + empleado2.getDomicilio() + " " + empleado2.getPuesto() + " " + empleado2.getTelefono());
	}

}
