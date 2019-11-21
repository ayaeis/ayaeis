
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
		System.out.println(volumeToMass(FluidTable.WATER,1));
		System.out.println(volumeToMass2(GasTable.AIR,1));
		
	}
	/**
	 * En metod som ändrar fahrenheit till celsius med en formel.
	 * 
	 * @param Fahrenheit värdet för fahrenehit.
	 * @return Returnerar temperaturen i celsius.
	 */
	public static double fahrenheitToCelsius(double fahrenheit) {
		double celsius = (fahrenheit - 32)*5 / 9;
		return celsius;
	}
	/**
	 * En metod som omvandlar kelvin till celsius med en formel.
	 * 
	 * @param Kelvin värdet för kelvin.
	 * @return Returnerar temperaturen i celsius.
	 */
	public static double kelvinToCelsius(double kelvin) {
		double celsius = kelvin - 273.15; 
		return celsius;
	}
	/**
	 * En metod som räknar ut vätsketrycket i en viss vätska under ett visst djup med en formel.
	 * 
	 * @param fluid Värdet för densiteten av en vätska 
	 * @param deep värdet för djupet. Just nu är det 10 meter under vattnet.
	 * @return
	 */
	public static double fluidPressure(FluidTable fluid, double deep) {
		double thePressure = 0;
		thePressure = fluid.density*9.82*deep;
		return thePressure;
	}
	/**
	 * En metod som räknar ut vätsketrycket i vatten vid ett viss djup, samma formel som förra metod.
	 * 
	 * @param deep Djupet man mäter trycket i.
	 * @return returnerar vätsketycket.
	 */
	public static double pressureUnderWater(double deep) {
		double underwaterPressure = 0;
	    underwaterPressure = H20.density*9.82*deep;
	    return underwaterPressure;
	}
	/**
	 * Denna metod räknar ut kinetiska energin med hjälp av en formel.
	 * 
	 * @param mass Massan på ett objekt.
	 * @param velocity Hastigheten på ett objekt.
	 * @return Returnerar den kinetiska energin. 
	 */
	public static double kineticEnergy(double mass, double velocity) {
		double kineticEnergy = 0;
		kineticEnergy = (mass*velocity*velocity)/ 2;
		return kineticEnergy;
	}
	/**
	 * Denna metod räknar ut den potentiella energin på ett objekt. 
	 * 
	 * @param mass Massan på objektet.
	 * @param height Höjden som objektet befinner sig på i förhållande till nollpunkten.
	 * @return Returnerar den potentionella energin objektet har. 
	 */
	public static double potentialEnergy(double mass, double height) {
		double potentialEnergy = 0;
		potentialEnergy = mass*G*height;
		return potentialEnergy;
	}
	/**
	 * Metoden räknar ut den maximala hastigheten som ett objekt kommer att ha när den släpps från en viss höjd.
	 * 
	 * @param height Höjden objektet släpps ifrån.
	 * @return Returnerar hastigheten.
	 */
	public static double fallSpeed(double height) {
		double fallSpeed = 0;
		fallSpeed = Math.sqrt(2*G*height);
		return fallSpeed;
	}
	/**
	 * En metod som räknar ut skillnaden mellan två värden.
	 * 
	 * @param first Det första vädret.
	 * @param last Andra värdet.
	 * @return Returnerar skillnaden mellan värdena.
	 */
	public static double delta(double first, double last) {
		double delta = 0;
		delta = last - first;
		return delta;
	}
	/**
	 * En metod som omvandlar en vätskas volym till vad dens massa.
	 * 
	 * @param fluid Vätskan.
	 * @param volume Volymen.
	 * @return Retunerar västkans massa.
	 */
	public static double volumeToMass(FluidTable fluid, double volume) {
		double fluidMass = 0;
		fluidMass = volume*fluid.density;
		return fluidMass;
	}
	/**
	 * En metod som räknar ut vad en gas volym väger i massa. 
	 * 
	 * @param gas Gasen.
	 * @param volume Gasens volym.
	 * @return Returnerar gasens massa. 
	 */
	public static double volumeToMass2(GasTable gas, double volume) {
		double gasMass = 0;
		gasMass = volume*gas.density;
		return gasMass;	
	}
	/**
	 * En metod som räknar ut vad ett solid ämne väger i massa.
	 * 
	 * @param solid Det solida ämnet.
	 * @param volume Volymen på ämnet
	 * @return
	 */
	public static double volumeToMass3(SolidTable solid, double volume) {
		double solidMass = 0;
		solidMass = volume*solid.density;
		return solidMass;
	}
		
	}
	
	
	
	
	
