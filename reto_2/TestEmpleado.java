
package reto_2;

import java.util.ArrayList;

import reto_2.Empleado;
import reto_2.Empresa;

public class TestEmpleado {

	public static void main(String[] args) {
		
	

	
		ArrayList<Empleado> empresa = new ArrayList<Empleado>();

		
		//Test Reto 2
		
		empresa.add(new Empleado("Ada", 5, true, 1500000));
		empresa.add(new Empleado("Laura", 5, true, 1085000));
		
		
	
		ArrayList<Double> resultado = Empresa.liquidarNominaEmp(empresa);
		System.out.println(resultado);
		
		
		
		ArrayList<Double> resultadoParafiscales = Empresa.liquidarParafiscales(empresa);
		System.out.println(resultadoParafiscales);
		
	
		
		
	}

}
