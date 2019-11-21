
public class Projekt {
		static double G = 9.82;
		static double P_0 = 101.3E3;
		static double R = 8.3145;
		static double C = 2.99792458;
		static double G_= 6.6726 * 1E-11;
		static double LY = 9.46055 * 1E15;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fahrenheitToCelsius(50));
		System.out.println(kelvinToCelsius(0));
		System.out.println(fluidPressure(FluidTable.WATER, 10));
		System.out.println(pressureUnderWater(10));
		System.out.println(kineticEnergy(2,2));
		System.out.println(potentialEnergy(2,5));
		System.out.println(fallSpeed(2.5));
		System.out.println(delta(1,10));
		

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
	public static double potentialEnergy(double mass, double height) {
		double potentialEnergy = 0;
		potentialEnergy = mass*G*height;
		return potentialEnergy;
	}
	public static double fallSpeed(double height) {
		double fallSpeed = 0;
		fallSpeed = Math.sqrt(2*G*height);
		return fallSpeed;
	}
	public static double delta(double first, double last) {
		double delta = 0;
		delta = last - first;
		retrun delta;
	}
		
	}
	
	
	
	
	
