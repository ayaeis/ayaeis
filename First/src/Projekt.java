
public class Projekt {
		static double G = 9.82;
		static double P_0 = 101.3E3;
		static double R = 8.3145;
		static double C = 2.99792458;
		static double G_= 6.6726 * 1E-11;
		static double LY = 9.46055 * 1E15;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hur mycket v�ger 60 dm^3 j�rn?"); 
		// 60 dm^3 �r 0,06 m^3
		System.out.println(volumeToMass3(SolidTable.IRON,0.06)+"kg");
		System.out.println("ur l�ngt hinner Tomas om han l�per med medelhastigheten 2.7 m/s i 50 minuter?");
		// 50 minuter �r 3000 sekunder
		System.out.println(svtDistance(2.7,3000)+"meter");
		System.out.println("Hur mycket energi kr�vs f�r att v�rma upp 4 liter vatten fr�n rumstemperatur (22 grader) till kokpunkten?");
		// 4 liter vatten �r 4 kg, skillnaden i temperaturen �r 100-22=78 grader.
		System.out.println(heat2(FluidTable.WATER, 4, 78)+"joule");
		System.out.println("Hur stort �r det totala trycket 75 meter under havsytan?");
		System.out.println(fluidPressure(FluidTable.WATER,75));
		System.out.println("Tomas som �r 180cm l�ng kastar upp en boll med massan 250 gram i luften s� den f�r starthastigheten 60 km/h. Hur h�gt kommer bollen?");
		// 60 km/h = 16.67 m/s  och 180 cm = 1.8 m
		
		System.out.println(velocityToHeight(16.67) + 1.8 + "meter");
		System.out.println("En bil med massan 735kg accelererar med konstant acceleration fr�n 0-100 p� 4.8 sekunder. Hur stor effekt har bilens motor uppn�tt?");
		// 100 km/h  / 3.6 = 27.78 m/s
		// accelerationen = 27.78 / 4.8 = 5.79 m^2
		// Kraft = m*a = 735 * 5.79 = 4 353,4 newton
		// str�ckan = 27.78 * 4.8 = 133,3 meter
		// Arbete = kraft * str�cka = 580500 newtonmeter
		System.out.println(power(580500, 4.8)+"w");
		System.out.println("En studsboll som v�ger 1kg sl�pps fr�n 12 meters h�jd och varje g�ng den nuddar marken tappar den 1% av sin energi. Hur m�nga g�nger kommer bollen studsa i marken innan den inte studsar h�rge �n 0.5 meter?\r\n");
		System.out.println(numberOfBounces(12));
		System.out.println("Hur mycket v�ger Sara, som har massan 55 kg, p� jorden?");
		System.out.println(newtonEarthWeight(55));
		System.out.println("En bils hastighet �ndras fr�n 50 m/s till 60m/s p� 4 sekunder, hur stor var accelerationen?");
		// Skillnaden i hastigheten 60 - 50 = 10
		// Skillnaden i tiden 4 - 0 = 4
		System.out.println(acceleration(10, 4));
		

		
		
		
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
	 * @param deep v�rdet f�r djupet.
	 * @return retunerar v�tsketrycket
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
	 * @param mass Massan p� ett objekt i kg.
	 * @param velocity Hastigheten p� ett objekt i m/s.
	 * @return Returnerar den kinetiska energin kgm/s. 
	 */
	public static double kineticEnergy(double mass, double velocity) {
		double kineticEnergy = 0;
		kineticEnergy = (mass*velocity*velocity)/ 2;
		return kineticEnergy;
	}
	/**
	 * Denna metod r�knar ut den potentiella energin p� ett objekt. 
	 * 
	 * @param mass Massan p� objektet i kg.
	 * @param height H�jden som objektet befinner sig p� i f�rh�llande till nollpunkteni meter.
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
	 * @param height H�jden objektet sl�pps ifr�n i meter.
	 * @return Returnerar hastigheten i m/s.
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
	 * @param volume Volymen i m^3 .
	 * @return Retunerar v�stkans massa i kg.
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
	 * @param volume Gasens volym i m^3.
	 * @return Returnerar gasens massa i kg. 
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
	 * @param volume Volymen p� �mneti m^3
	 * @return returnerar massan i kg.
	 */
	public static double volumeToMass3(SolidTable solid, double volume) {
		double solidMass = 0;
		solidMass = volume*solid.density;
		return solidMass;
	}
	/**
	 * En metod som r�knar ut medelhastigheten med en formel p� str�cka och tid.
	 * 
	 * @param distance En variable p� str�ckan i meter.
	 * @param time En variable p� tiden i sekunder. 
	 * @return Returnerar medelhastigheten i m/s.
	 */ 
	public static double svtVelocity(double distance, double time) {
		return (distance/time);
	}
	/**
	 * En metod som r�knar ut str�ckan med hj�lp av hastighet-str�cka-tid formel.
	 *
	 * @param velocity En variable f�r hastigheten m/s.
	 * @param time En variable f�r tiden i sekunder.
	 * @return returnerar str�ckan i meter.
	 */
	public static double svtDistance(double velocity, double time) {
		return (velocity*time);
	}
	/**
	 * En metod som r�knar ut tiden med en hj�lp av en formel.
	 * 
	 * @param distance En variable f�r str�ckan i meter.
	 * @param velocity En variable f�r hastigheten i m/s.
	 * @return returnerar tiden i sekunder.
	 */
	public static double svtTime(double distance, double velocity) {
		return (distance/velocity);
	}
	/**
	 * En metod som r�knar ut arbete med hj�lp av fysikens formel f�r arbete.
	 * 
	 * @param force En variable p� kraften i Newton.
	 * @param distance En variable p� str�ckan i meter.
	 * @return returnerar arbete i Newtonmeter.
	 */
	public static double work(double force, double distance) {
		return (force*distance);
	}
	/**
	 * En metod som r�knar ut effekt med hj�lp av arbete och tid
	 * .
	 * @param work En variable p� arbete i newtonmeter.
	 * @param time En variable p� tid i sekunder.
	 * @return returnerar effeket i watt.
	 */
	public static double power(double work, double time) {
		return(work/time);
	}
	/**
	 * En metod som r�knar ut hur mycket energi som kr�vs f�r att v�rma ett visst material ett angivet antal grader.
	 * 
	 * @param solid En variable p� materialet.
	 * @param mass En variable p� massan i kg.
	 * @param deltaT En variable f�r skillnaden i temperatur. 
	 * @return returnerar hur mycket energi som kr�vs i joule. 
	 */
	public static double heat(SolidTable solid, double mass, double deltaT) {
		return(solid.heatCapacity*mass*deltaT);
	}
	/**
	 * En metod som r�knar ut hur mycket energi det kr�vs f�r att v�rma upp en v�tska till en viss temperatur.
	 * 
	 * @param fluid En variable f�r v�tskan.
	 * @param mass En variable f�r massan i kg.
	 * @param deltaT En variable f�r skillnaden i temperatur.
	 * @return returnerar hur mycket energi som kr�vs i joule.
	 */
	public static double heat2(FluidTable fluid, double mass, double deltaT) {
		return(fluid.heatCapacity*mass*deltaT);
	}
	/**
	 * En metod som r�knar ut hur mycket energi det kr�vs f�r att v�rma upp en gas till en viss temperatur.
	 * 
	 * @param gas En variable f�r gas.
	 * @param mass En variable f�r massan i kg.
	 * @param deltaT En variable f�r skillnaden i temperatur.
	 * @return returnerar hur mycket energi som kr�vs i joule.
	 */
	public static double heat3(GasTable gas, double mass, double deltaT) {
		return (gas.heatCapacity*mass*deltaT);
	}
	/**
	 * En metod som r�knar ut hur h�gt ett objekt kommer om man vet hastigjeten. 
	 * 
	 * @param velocity En variable f�r hastigheten i m/s.
	 * @return returnerar h�jden i meter.
	 */
	public static double velocityToHeight(double velocity) {
		return (Math.pow(velocity, 2)/(2*G));
	}
	/**
	 * En metod som r�knar ut hur m�nga g�nger en studsboll som v�ger 1kg studsar i marken innan den inte studsar h�rge �n 0.5 meter, ifall den 1kg studsar  ifall den  sl�pps fr�n 12 meters h�jd och varje g�ng den nuddar marken tappar den 1% av sin energi.

	 * @param height 12 meter h�jden i meter.
	 * @return hur m�nga g�nger den studsar
	 */
	public static double numberOfBounces(double height) {
		double finalEnergy = height*9.82;
		int counterBounces = 0;
		double i = 12;
		while (i >=0.5) {
			finalEnergy *=0.99;
			i = finalEnergy / 9.82;
			counterBounces++;
		}
		return counterBounces;
	}
	/**
	 * En metod som r�knar ut hur mycket ett f�rem�l v�ger i Newton p� jorden med hj�lp av massan.
	 * @param mass F�rem�lets massa i kg
	 * @return f�rem�lets vikt i newton
	 */
	
	public static double newtonEarthWeight(double mass) {
		return (mass*G);
	}
	/** 
	 * En metod som r�knar ut accelerationen med accelerationens formell.
	 * @param deltaV skillnaden i hastigheten
	 * @param deltaT skillnaden i tiden
	 * @return accelerationen
	 */
	public static double acceleration(double deltaV, double deltaT) {
		return (deltaV/deltaT);
	}
	
	
		
	}
	
	
	
	
	
