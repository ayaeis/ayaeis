
public class Projekt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fahrenheitToCelsius(50));
		System.out.println(kelvinToCelsius(0));
		System.out.println(fluidPressure(FluidTable.WATER, 10));
		System.out.println(pressureUnderWater(10));
		System.out.println(kineticEnergy(2,2));
		

	}
	public static double fahrenheitToCelsius(double fahrenheit) {
		double celsius = (Farhenheit - 32)*5 / 9;
		return celsius;
	}
	public static double kelvinToCelsius(double kelvin) {
		double celsius = kelvin - 273.15; 
		return celsius;
	}
	public static double fluidPressure(FluidTable fluid, double deep) {
		double thePressure = 0;
		thePressure = fluid.density*9.82*deep;
		return thePressure;
	}
	public static double pressureUnderWater(double deep) {
	    double underwaterPressure = 0;
	    underwaterPressure = H20.density*9.82*deep;
	    return underwaterPressure;
	}
	public static double kineticEnergy(double mass, double velocity) {
		double kineticEnergy = 0;
		kineticEnergy = (mass*velocity*velocity)/ 2;
		return kineticEnergy;
	}
	public static double potentialEnergy()
	
	}
	
	
