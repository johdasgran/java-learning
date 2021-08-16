
//Comentar el package antes de subir a la plataforma o les marcara error 
//porque internamente ya tiene uno :)
package reto_1;


import java.util.ArrayList;

//	Reto 1 ciclo 2 Mision Tic UPB
public class Empleado {

	private int id;
	private String nombre;
	private int horasExtra;
	private boolean auxilioTrasporte;
	private int salario;



	//Constructor segun lo pedido por el backlog
	public Empleado(String nombre, int horasExtra, boolean auxilioTrasporte, int salario) {

		this.nombre = nombre;
		this.horasExtra = horasExtra;
		this.auxilioTrasporte = auxilioTrasporte;
		this.salario = salario;

	}


	//Metodo estatico segun lo pedido por el backlog
	public static ArrayList<Double> liquidarNominaQuincenal(ArrayList<Empleado> empleados) {

		
			
		//Creo la variable nomina tipo ArrayList<Double> - es el array
		//que me servira para poder agregar y guardar la nomina quincenal de cada empleado 
		//---- Agrega los valores como decimales -----
		
		
		
		ArrayList<Double> nomina = new ArrayList<Double>();
		
		
		
		//inicializo variables para que poder usarlas en el foreach --
		double valorHora =0;
		double valorHoraExtra = 0;
		double auxTrasporte = 106454;
		double total = 0;
		double saludyPension = 0;
		double totalMes = 0;
		double totalDevengado = 0;
		

		//El foreach recorre el Array de tipo Clase "Empleado" y me
		//saca los datos con los getters que necesito para las operaciones xd

		for (Empleado empleado : empleados) {



			//Ejemplo formula con los valores del reto--
			//--- Empleada "Ada" ----
			
			
			//El valor de la hora sale de dividir 980000/240 = 4083.0 --
			// ---- aclaro, realmente es 4083.3 - pero al dividir por entero queda en 4083.0 --
			valorHora = empleado.getSalario() / 240.0; 
			//El error esta al tomar 240.0 como decimal y no como entero por que si lo toma como decimal
			//guardara los valores con los decimales lo que cambiara la salida esperada por el codegrade--


			//El valor de las horas extras; en este caso las pago como si fuera horas normales -
			//o sea sin ningun tipo de recargo, ya que el reto no nos pide sacar el recargo xd
			//En ejemplo de ada que son 3 horas extras y el valor de la hora es de 4083.0 --
			// multiplicamos (4083.0*3) que seria igual a 12249.0
			valorHoraExtra = valorHora * empleado.getHorasExtra();
			
			
			
			//El total es la suma del salario mas las horas extras 
			//en este caso 980000+12249.0 = 992249.0
			total = (empleado.getSalario() + valorHoraExtra);
			

			//Salud y pension lo calculo del total de mes y no de la quincena
			// en esta formula me da el valor a descontar de salud y pension que es 79379.92
			saludyPension = total * 0.08;
		
			
			
			//totalMes es el total menos la salud y pension el resultado de esta 
			//operacion es 992249.0 - 79379.92 = 912869.08
			totalMes = (total - saludyPension);
			

			
			//Aqui lo que hago es validar si el aux de trasporte es true 
			//se ejecuta la condicion y le agrega al totalMes el aux de trasporte que es 106454  -
			//la operacion es: 912869.08 + 106454 = 1019323.08
			if(empleado.isAuxilioTrasporte()){
				totalMes += auxTrasporte;
			} 
			
			
			//Y listoooo, aca solo es dividir por 2 totalMes 
			// que es igual a 1019323.08 / 2 = 509661.54
			totalDevengado = totalMes / 2;
			//totalDevengado = totalMes;
			
			//Me agrega al ArrayList<Double> "nomina" cada salario de cada trabajador que recorre :)	
			nomina.add(totalDevengado);

			
		}

		//Para hacer pruebas de las salidas de cada operacion con distintos constructores xd
		//System.out.println(valorHora +"\n" + valorHoraExtra +"\n" + total +"\n"
		//		+ saludyPension +"\n" + totalMes +"\n" + totalDevengado);

		return nomina;

	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getHorasExtra() {
		return horasExtra;
	}



	public void setHorasExtra(int horasExtra) {
		this.horasExtra = horasExtra;
	}



	public boolean isAuxilioTrasporte() {
		return auxilioTrasporte;
	}



	public void setAuxilioTrasporte(boolean auxilioTrasporte) {
		this.auxilioTrasporte = auxilioTrasporte;
	}



	public int getSalario() {
		return salario;
	}



	public void setSalario(int salario) {
		this.salario = salario;
	}



	
	
	
}
