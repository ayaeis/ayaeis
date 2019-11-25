
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
		System.out.println(volumeToMass3(SolidTable.IRON,1));
		System.out.println(svtVelocity(10,5));
		System.out.println(svtDistance(10,5));
		System.out.println(svtTime(10,2));
		System.out.println(work(50,10));
		System.out.println(power(1000,2));
		System.out.println(heat(SolidTable.IRON,1,2));
		System.out.println(heat2(FluidTable.WATER,1,10));
		System.out.println(heat3(GasTable.AIR,1,1));
		
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
	    underwaterPressure = FluidTable.H20.density*9.82*deep;
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
	 * En metod som räknar ut vad ett solid ämnes volym väger i  massa.
	 * 
	 * @param solid Det solida ämnet.
	 * @param volume Volymen på ämnet
	 * @return returnerar massan.
	 */
	public static double volumeToMass3(SolidTable solid, double volume) {
		double solidMass = 0;
		solidMass = volume*solid.density;
		return solidMass;
	}
	/**
	 * En metod som räknar ut medelhastigheten med en formel på sträcka och tid.
	 * 
	 * @param distance En variable på sträckan.
	 * @param time En variable på tiden. 
	 * @return Returnerar medelhastigheten.
	 */ 
	public static double svtVelocity(double distance, double time) {
		return (distance/time);
	}
	/**
	 * En metod som räknar ut sträckan med hjälp av hastighet-sträcka-tid formel.
	 *
	 * @param velocity En variable för hastigheten.
	 * @param time En variable för tiden.
	 * @return returnerar sträckan.
	 */
	public static double svtDistance(double velocity, double time) {
		return (velocity*time);
	}
	/**
	 * En metod som räknar ut tiden med en hjälp av en formel.
	 * 
	 * @param distance En variable för sträckan.
	 * @param velocity En variable för hastigheten.
	 * @return returnerar tiden.
	 */
	public static double svtTime(double distance, double velocity) {
		return (distance/velocity);
	}
	/**
	 * En metod som räknar ut arbete med hjälp av fysikens formel för arbete.
	 * 
	 * @param force En variable på kraften.
	 * @param distance En variable på sträckan.
	 * @return returnerar arbete.
	 */
	public static double work(double force, double distance) {
		return (force*distance);
	}
	/**
	 * En metod som räknar ut effekt med hjälp av arbete och tid
	 * .
	 * @param work En variable på arbete.
	 * @param time En variable på tid.
	 * @return returnerar effeket.
	 */
	public static double power(double work, double time) {
		return(work/time);
	}
	/**
	 * En metod som räknar ut hur mycket energi som krävs för att värma ett visst material ett angivet antal grader.
	 * 
	 * @param solid En variable på materialet.
	 * @param mass En variable på massan.
	 * @param deltaT En variable för skillnaden i temperatur. 
	 * @return returnerar hur mycket energi som krävs. 
	 */
	public static double heat(SolidTable solid, double mass, double deltaT) {
		return(solid.heatCapacity*mass*deltaT);
	}
	/**
	 * En metod som räknar ut hur mycket energi det krävs för att värma upp en vätska till en viss temperatur.
	 * 
	 * @param fluid En variable för vätskan.
	 * @param mass En variable för massan.
	 * @param deltaT En variable för skillnaden i temperatur.
	 * @return returnerar hur mycket energi som krävs.
	 */
	public static double heat2(FluidTable fluid, double mass, double deltaT) {
		return(fluid.heatCapacity*mass*deltaT);
	}
	/**
	 * En metod som räknar ut hur mycket energi det krävs för att värma upp en gas till en viss temperatur.
	 * 
	 * @param gas En variable för gas.
	 * @param mass En variable för massan.
	 * @param deltaT En variable för skillnaden i temperatur.
	 * @return returnerar hur mycket energi som krävs.
	 */
	public static double heat3(GasTable gas, double mass, double deltaT) {
		return (gas.heatCapacity*mass*deltaT);
	}
		
	}
	
	
	
	
	
