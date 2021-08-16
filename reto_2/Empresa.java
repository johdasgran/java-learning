package reto_2;

import java.util.ArrayList;

public class Empresa {

	ArrayList<Empleado> empleados = new ArrayList<>();
	

	

	public static ArrayList<Double> liquidarNominaEmp(ArrayList<Empleado> empleados) {

		ArrayList<Double>  nomina = new ArrayList<Double>();

		double valorHora;
		double valorHoraExtra;
		double auxTrasporte = 106454;
		double total;
		double saludyPension;
		double totalMes;
		double totalDevengado;

		for (Empleado empleado : empleados) {

			valorHora = empleado.getSalario() / 240;
			valorHoraExtra = valorHora * empleado.getHorasExtra();
			total = (empleado.getSalario() + valorHoraExtra);
			saludyPension = total * 0.08;
			totalMes = (total - saludyPension);
			//totalMes = total;
			if (empleado.isAuxilioTrasporte()) {
				totalMes += auxTrasporte;
			}

			totalDevengado = totalMes;
			//totalDevengado = totalMes / 2;
			nomina.add(totalDevengado);
			
			//System.out.println("El total v1 es:"+ total);---31.250-----122.500---4520--22.604

		}


		return nomina;

	}

	public static ArrayList<Double> liquidarParafiscales(ArrayList<Empleado> empleados) {
		
		ArrayList<Double> parafiscales = new ArrayList<Double>();
		
		//ArrayList<Double> parafiscales = Empresa.luquidarNominaEmp(empleados);
		
		double valorHora;
		double valorHoraExtra;
		double total;
		double totalMes;
		double totalDevengado;

		for (Empleado empleado : empleados) {
			
			valorHora = empleado.getSalario() / 240.0;
			valorHoraExtra = valorHora * empleado.getHorasExtra();
			total = (empleado.getSalario() + valorHoraExtra);
			totalMes = total;
			totalDevengado = totalMes*0.09;
			
			parafiscales.add(totalDevengado);
			
			
		}
		
		
		//Se podria pero para calcular este valor que pide el reto toca tomar los decimales a las
		//horas extra xdd
		
		/*for (int i = 0; i < parafiscales.size(); i++) {
			
			double pf = parafiscales.get(i)-106454;
			double total = pf*0.09;
			p.add(total);	
			
		}*/
		

		return parafiscales;
	}

	
	
	
	
	
	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	
	
	
	
	
	
	
	
	
	
}













