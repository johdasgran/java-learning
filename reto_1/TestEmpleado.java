
package reto_1;

import java.util.ArrayList;

public class TestEmpleado {

	public static void main(String[] args) {
		
		


	
		ArrayList<Empleado> empleado = new ArrayList<Empleado>();

		
		
		//Con este constructor hago el ejemplo de la formula pero pueden 
		//probar con los otros contructores :)
		empleado.add(new Empleado("Ada", 3, true, 980000));

		
		
		//Test Reto 2
		
		empleado.add(new Empleado("Ada", 0, true, 1500000));
		empleado.add(new Empleado("Laura", 0, true, 1085000));
		
		//empleado.add(new Empleado("Laura", 2, true, 1050000));
		
		
		//El error que le da al compañero al calcular la nomina quincenal de este empleado
		//es porque le toma los decimales cuando se calcula el valor de la hora que seria 4520.83 -- aproximandola al 4521 --
		//para evistar esos decimales solo toma el valor de 240 como entero y no como decimal 240.0 //
		//Si cambias el valor de las horas trabajadas al mes de entero a decimal veras las dos formas de hacer 
		//la formula para sacar los valores segun el codegrade ---
		//empleado.add(new Empleado("Carmen", 5, true, 1085000));
	
		
		
		
		ArrayList<Double> resultado = Empleado.liquidarNominaQuincenal(empleado);
		
		System.out.println(resultado);
		
	}

}
