package reto_3;

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
		double totalParafiscales;

		for (Empleado empleado : empleados) {
			
			valorHora = (double)(empleado.getSalario() / 240);
			valorHoraExtra = valorHora * empleado.getHorasExtra();
			total = (empleado.getSalario() + valorHoraExtra);
			totalParafiscales = total*0.09;
			
			parafiscales.add(totalParafiscales);
			
			
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

	
	
	
	
	
	
public static ArrayList<Double> liquidarSegSocialEmp(ArrayList<Empleado> empleados) {
		
		ArrayList<Double> seguridadSocial = new ArrayList<Double>();
		
		
		double valorHora;
		double valorHoraExtra;
		double total;
		double totalMes;
		double totalSegSocial;
		double saludPensionYRiesgoEmp;


		for (Empleado empleado : empleados) {
			
			valorHora = (double)(empleado.getSalario() / 240);
			valorHoraExtra = valorHora * empleado.getHorasExtra();
			total = (empleado.getSalario() + valorHoraExtra);
			totalMes = total;
			//System.out.println(totalMes);
			saludPensionYRiesgoEmp = (totalMes*0.21022);

		;
			totalSegSocial = saludPensionYRiesgoEmp;
			//totalDevengado = Math.round(saludPensionYRiesgoEmp);
			
			seguridadSocial.add(totalSegSocial);
			
			
		}
		
		

		return seguridadSocial;
	}
	
	
	
	
public static ArrayList<Double> liquidarPrestacionesEmp(ArrayList<Empleado> empleados) {
	
	ArrayList<Double> prestacionesEmp = new ArrayList<Double>();
	
	
	double valorHora;
	double valorHoraExtra;
	double total;
	double salarioMasExtras;
	double auxTrasporte = 106454;
	double prima;
	double cesantias;
	double interesesCesantias;
	double vacaciones;
	double totalPrestaciones;

	for (Empleado empleado : empleados) {
		
		valorHora = (double)(empleado.getSalario() / 240);
		valorHoraExtra = valorHora * empleado.getHorasExtra();
		salarioMasExtras = (empleado.getSalario() + valorHoraExtra);
		total = salarioMasExtras + auxTrasporte;
		prima = total*0.0833;
		cesantias = total*0.0833;
		
		
		interesesCesantias = cesantias * 0.12;

		vacaciones = empleado.getSalario() * 0.0416;
		
		
		totalPrestaciones = (prima + cesantias + interesesCesantias +vacaciones);
		
		
		prestacionesEmp.add(totalPrestaciones);
		
		
	}
	
	

	return prestacionesEmp;
}























	
	
	
	
	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	
	
	
	
	
	
	
	
	
	
}













