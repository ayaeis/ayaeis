
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
	 * En metod som �ndrar fahrenheit till celsius med en formel.
	 * 
	 * @param Fahrenheit v�rdet f�r fahrenehit.
	 * @return Returnerar temperaturen i celsius.
	 */
	public static double fahrenheitToCelsius(double fahrenheit) {
		double celsius = (fahrenheit - 32)*5 / 9;
		return celsius;
	}
	/**
	 * En metod som omvandlar kelvin till celsius med en formel.
	 * 
	 * @param Kelvin v�rdet f�r kelvin.
	 * @return Returnerar temperaturen i celsius.
	 */
	public static double kelvinToCelsius(double kelvin) {
		double celsius = kelvin - 273.15; 
		return celsius;
	}
	/**
	 * En metod som r�knar ut v�tsketrycket i en viss v�tska under ett visst djup med en formel.
	 * 
	 * @param fluid V�rdet f�r densiteten av en v�tska 
	 * @param deep v�rdet f�r djupet. Just nu �r det 10 meter under vattnet.
	 * @return
	 */
	public static double fluidPressure(FluidTable fluid, double deep) {
		double thePressure = 0;
		thePressure = fluid.density*9.82*deep;
		return thePressure;
	}
	/**
	 * En metod som r�knar ut v�tsketrycket i vatten vid ett viss djup, samma formel som f�rra metod.
	 * 
	 * @param deep Djupet man m�ter trycket i.
	 * @return returnerar v�tsketycket.
	 */
	public static double pressureUnderWater(double deep) {
		double underwaterPressure = 0;
	    underwaterPressure = FluidTable.H20.density*9.82*deep;
	    return underwaterPressure;
	}
	/**
	 * Denna metod r�knar ut kinetiska energin med hj�lp av en formel.
	 * 
	 * @param mass Massan p� ett objekt.
	 * @param velocity Hastigheten p� ett objekt.
	 * @return Returnerar den kinetiska energin. 
	 */
	public static double kineticEnergy(double mass, double velocity) {
		double kineticEnergy = 0;
		kineticEnergy = (mass*velocity*velocity)/ 2;
		return kineticEnergy;
	}
	/**
	 * Denna metod r�knar ut den potentiella energin p� ett objekt. 
	 * 
	 * @param mass Massan p� objektet.
	 * @param height H�jden som objektet befinner sig p� i f�rh�llande till nollpunkten.
	 * @return Returnerar den potentionella energin objektet har. 
	 */
	public static double potentialEnergy(double mass, double height) {
		double potentialEnergy = 0;
		potentialEnergy = mass*G*height;
		return potentialEnergy;
	}
	/**
	 * Metoden r�knar ut den maximala hastigheten som ett objekt kommer att ha n�r den sl�pps fr�n en viss h�jd.
	 * 
	 * @param height H�jden objektet sl�pps ifr�n.
	 * @return Returnerar hastigheten.
	 */
	public static double fallSpeed(double height) {
		double fallSpeed = 0;
		fallSpeed = Math.sqrt(2*G*height);
		return fallSpeed;
	}
	/**
	 * En metod som r�knar ut skillnaden mellan tv� v�rden.
	 * 
	 * @param first Det f�rsta v�dret.
	 * @param last Andra v�rdet.
	 * @return Returnerar skillnaden mellan v�rdena.
	 */
	public static double delta(double first, double last) {
		double delta = 0;
		delta = last - first;
		return delta;
	}
	/**
	 * En metod som omvandlar en v�tskas volym till vad dens massa.
	 * 
	 * @param fluid V�tskan.
	 * @param volume Volymen.
	 * @return Retunerar v�stkans massa.
	 */
	public static double volumeToMass(FluidTable fluid, double volume) {
		double fluidMass = 0;
		fluidMass = volume*fluid.density;
		return fluidMass;
	}
	/**
	 * En metod som r�knar ut vad en gas volym v�ger i massa. 
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
	 * En metod som r�knar ut vad ett solid �mnes volym v�ger i  massa.
	 * 
	 * @param solid Det solida �mnet.
	 * @param volume Volymen p� �mnet
	 * @return returnerar massan.
	 */
	public static double volumeToMass3(SolidTable solid, double volume) {
		double solidMass = 0;
		solidMass = volume*solid.density;
		return solidMass;
	}
	/**
	 * En metod som r�knar ut medelhastigheten med en formel p� str�cka och tid.
	 * 
	 * @param distance En variable p� str�ckan.
	 * @param time En variable p� tiden. 
	 * @return Returnerar medelhastigheten.
	 */ 
	public static double svtVelocity(double distance, double time) {
		return (distance/time);
	}
	/**
	 * En metod som r�knar ut str�ckan med hj�lp av hastighet-str�cka-tid formel.
	 *
	 * @param velocity En variable f�r hastigheten.
	 * @param time En variable f�r tiden.
	 * @return returnerar str�ckan.
	 */
	public static double svtDistance(double velocity, double time) {
		return (velocity*time);
	}
	/**
	 * En metod som r�knar ut tiden med en hj�lp av en formel.
	 * 
	 * @param distance En variable f�r str�ckan.
	 * @param velocity En variable f�r hastigheten.
	 * @return returnerar tiden.
	 */
	public static double svtTime(double distance, double velocity) {
		return (distance/velocity);
	}
	/**
	 * En metod som r�knar ut arbete med hj�lp av fysikens formel f�r arbete.
	 * 
	 * @param force En variable p� kraften.
	 * @param distance En variable p� str�ckan.
	 * @return returnerar arbete.
	 */
	public static double work(double force, double distance) {
		return (force*distance);
	}
	/**
	 * En metod som r�knar ut effekt med hj�lp av arbete och tid
	 * .
	 * @param work En variable p� arbete.
	 * @param time En variable p� tid.
	 * @return returnerar effeket.
	 */
	public static double power(double work, double time) {
		return(work/time);
	}
	/**
	 * En metod som r�knar ut hur mycket energi som kr�vs f�r att v�rma ett visst material ett angivet antal grader.
	 * 
	 * @param solid En variable p� materialet.
	 * @param mass En variable p� massan.
	 * @param deltaT En variable f�r skillnaden i temperatur. 
	 * @return returnerar hur mycket energi som kr�vs. 
	 */
	public static double heat(SolidTable solid, double mass, double deltaT) {
		return(solid.heatCapacity*mass*deltaT);
	}
	/**
	 * En metod som r�knar ut hur mycket energi det kr�vs f�r att v�rma upp en v�tska till en viss temperatur.
	 * 
	 * @param fluid En variable f�r v�tskan.
	 * @param mass En variable f�r massan.
	 * @param deltaT En variable f�r skillnaden i temperatur.
	 * @return returnerar hur mycket energi som kr�vs.
	 */
	public static double heat2(FluidTable fluid, double mass, double deltaT) {
		return(fluid.heatCapacity*mass*deltaT);
	}
	/**
	 * En metod som r�knar ut hur mycket energi det kr�vs f�r att v�rma upp en gas till en viss temperatur.
	 * 
	 * @param gas En variable f�r gas.
	 * @param mass En variable f�r massan.
	 * @param deltaT En variable f�r skillnaden i temperatur.
	 * @return returnerar hur mycket energi som kr�vs.
	 */
	public static double heat3(GasTable gas, double mass, double deltaT) {
		return (gas.heatCapacity*mass*deltaT);
	}
		
	}
	
	
	
	
	
