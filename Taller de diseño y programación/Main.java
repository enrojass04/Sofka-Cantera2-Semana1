package co.Sofka.Taller2;

import java.util.Scanner;

/**
 * 
 * @author Eduwin Rojas
 *
 */
public class Main {
	
	/**
	 * Entrada por teclado.
	 */
	private static Scanner in = new Scanner(System.in);
	/**
	 * Entrada por teclado para caracteres.
	 */
	private static Scanner inString = new Scanner(System.in);

	public static void main(String[] args) {

		boolean controlador = true;

		while (controlador == true) {
			
			menu();

			int opcion = in.nextInt();

			switch (opcion) {
			case 1:
				ShuttleSpacecraft shuttleSpacecraft = dataShuttleSpacecraft();
				System.out.println();
				shuttleSpacecraft.print();
				System.out.println();
				shuttleSpacecraft.propulsionSystem();
				break;
			case 2:
				MannedSpacecraft mannedSpacecraft = dataMannedSpacecraft();
				System.out.println();
				mannedSpacecraft.print();
				System.out.println();
				mannedSpacecraft.propulsionSystem();
				break;
			case 3:
				RoboticSpacecraft roboticSpacecraft = dataRoboticSpacecraft();
				System.out.println();
				roboticSpacecraft.print();
				System.out.println();
				roboticSpacecraft.propulsionSystem();
				break;
				
			case 4:
				System.out.println("Gracias por usar nuestros Servicios");
				controlador = false;
				break;

			default:
				System.out.println("Opcioón NO listada.");
			}

		}

	}
	
	/**
	 * Mestra el menu principal
	 */
	public static void menu() {
		System.out.println();
		System.out.println("Menú para la creación de Naves Espaciales");
		System.out.println("Seleccione una de las opciones para crear una Nave");
		System.out.println("1. Nave Lanzadera");
		System.out.println("2. Nave Tripulada");
		System.out.println("3. Nave Robotica");
		System.out.println("4. Salir");
		System.out.println();
	}
	
	/**
	 * Solicita ingresar nombre, pais y peso de la nave.
	 * @return Devuelve un objeto de la clase ShuttleSpacecraft.
	 */
	public static ShuttleSpacecraft dataShuttleSpacecraft() {		
		System.out.println("ingrese el nombre:");
		String name = inString.nextLine();
		System.out.println("ingrese el pais:");
		String country = inString.nextLine();
		System.out.println("ingrese el peso en Toneladas:");
		double weight = in.nextDouble();
		ShuttleSpacecraft shuttleSpacecraft = new ShuttleSpacecraft(name, country, weight);
		return shuttleSpacecraft;		
	}
	
	/**
	 * Solicita ingresar nombre, pais y peso de la nave.
	 * @return Devuelve un objeto de la clase MannedSpacecraft.
	 */
	public static MannedSpacecraft dataMannedSpacecraft() {	
		System.out.println("ingrese el nombre:");
		String name2 = inString.nextLine();
		System.out.println("ingrese el pais:");
		String country2 = inString.nextLine();
		System.out.println("ingrese el peso en Toneladas:");
		double weight2 = in.nextDouble();
		MannedSpacecraft mannedSpacecraft = new MannedSpacecraft(name2, country2, weight2);
		return mannedSpacecraft;
	}
	
	/**
	 * Solicita ingresar nombre, pais y peso de la nave.
	 * @return Devuelve un objeto de la clase RoboticSpacecraft.
	 */
	public static RoboticSpacecraft dataRoboticSpacecraft() {	
		System.out.println("ingrese el nombre:");
		String name3 = inString.nextLine();
		System.out.println("ingrese el pais:");
		String country3 = inString.nextLine();
		System.out.println("ingrese el peso en Toneladas:");
		double weight3 = in.nextDouble();
		RoboticSpacecraft roboticSpacecraft = new RoboticSpacecraft(name3, country3, weight3);
		return roboticSpacecraft;
	}
}
