package es.studium.ejercicio3;

public class Empleado
{
	//Atributos privados
	
	private String nombre;
	private String apellidos;
	private String dni;
	private String domicilio;
	private String puesto;
	private int telefono;
	
	//Constructores 
	
	public Empleado() { //Constructor vacío
		nombre = "";
		apellidos = "";
		dni = "";
		domicilio = "";
		puesto = "";
		telefono = 0;
	}

	public Empleado(String nombre, String apellidos, String dni, String domicilio, String puesto, int telefono) //Constructor por parámetros
	{
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.domicilio = domicilio;
		this.puesto = puesto;
		this.telefono = telefono;
	}
	
	//Métodos

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public String getApellidos()
	{
		return apellidos;
	}

	public void setApellidos(String apellidos)
	{
		this.apellidos = apellidos;
	}

	public String getDni()
	{
		return dni;
	}

	public void setDni(String dni)
	{
		this.dni = dni;
	}

	public String getDomicilio()
	{
		return domicilio;
	}

	public void setDomicilio(String domicilio)
	{
		this.domicilio = domicilio;
	}
	
	public String getPuesto()
	{
		return puesto;
	}

	public void setPuesto(String puesto)
	{
		this.puesto = puesto;
	}

	public int getTelefono()
	{
		return telefono;
	}

	public void setTelefono(int telefono)
	{
		this.telefono = telefono;
	}
	
	
}
