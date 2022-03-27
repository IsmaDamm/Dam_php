package proyectos_grandes;

import java.util.Iterator;
import java.util.Scanner;

public class juego_de_la_vida {

	public static void main(String[] args) {

		int numeros[][];
		int settings[] = new int [3];
		settings[0]=2;
		settings[1]=3;
		settings[2]=3;
		
		boolean pregunta = true;
		int menu;
		juego_de_la_vida p = new juego_de_la_vida();
		menu = p.menu();
		if (menu == 1) {
			settings = p.settings(settings);
			menu = 2;
		}
		if (menu == 2) {
			numeros = p.LeerTablero();
			while (pregunta) {
				numeros = p.print(numeros);
				numeros = p.veines(numeros,settings);
				pregunta  = p.continuar();
			}
		}
	}

	public int[][] LeerTablero() {

		Scanner entrada = new Scanner(System.in);

		char pregunta = 0;
		int x;
		int y;
		int x1;
		int y1;
		boolean hola = true;
		System.out.println("digues les mides del tauler");
		System.out.print("x : ");
		x = entrada.nextInt() + 2;
		System.out.print("y : ");
		y = entrada.nextInt() + 2;
		int tablero[][] = new int[x][y];

		do {
			System.out.println("vols configurar el joc manual o automatic(m/a)");
			pregunta = entrada.next().toLowerCase().charAt(0);
			if (pregunta == 'm') {
				hola = false;
				for (int i = 0; i < 5; i++) {
					System.out.println("digues on vols colocar la cel·lula numero" + i);
					System.out.print("x : ");
					x1 = entrada.nextInt();
					while ((x1 > x - 2) || (x1 == 0)) {
						System.out.println("Aquesta posició x, surt del tauler");
						System.out.print("x : ");
						x1 = entrada.nextInt();
					}
					System.out.print("y : ");
					y1 = entrada.nextInt();
					while ((y1 > y - 2) || (y1 == 0)) {
						System.out.println("Aquesta posició y, surt del tauler");
						System.out.print("y : ");
						y1 = entrada.nextInt();
					}
					tablero[x1][y1] = 1;
				}
			} else if (pregunta == 'a') {
				hola = false;
				System.out.println("quantes colonies de 5 cel·lules vols?");
				int grups = entrada.nextInt();
				 while (grups*18 > (tablero.length*tablero[0].length)) {
						System.out.println("El tauler es molt petit per posar aquesta quantitat de colonies,posa una quantitat de colonies mes petita");
						grups = entrada.nextInt();
				 }
				System.out.println("hola");
				int contador=0;
				int numero=0;
				
				for (int i = 0; i != grups; i++) {
					try {
					contador=0;
					do {
						x1 =  (int) ((Math.random()*x-1));
						y1 =  (int) ((Math.random()*y-1));
					} while (x1 == 0 || x1 ==1 || x1 ==2 || y1 ==0 || y1 ==1 || y1 ==2 || x1 ==x-1 || x1 ==x-2 || y1 ==y-1 ||y1 ==y-2 );

					
					if (tablero[x1][y1] == 0) {
						if (tablero[x1 + 1][y1] == 1) {
							contador++;
						}
						if (tablero[x1 - 1][y1] == 1) {
							contador++;
						}
						if (tablero[x1][y1 + 1] == 1) {
							contador++;
						}
						if (tablero[x1][y1 - 1] == 1) {
							contador++;
						}
						if (tablero[x1 + 1][y1 + 1] == 1) {
							contador++;
						}
						if (tablero[x1 + 1][y1 - 1] == 1) {
							contador++;
						}
						if (tablero[x1 - 1][y1 - 1] == 1) {
							contador++;
						}
						if (tablero[x1 - 1][y1 + 1] == 1) {
							contador++;
						}
						if (contador == 0) {
								while (contador != 5) {
									numero = (int) (Math.random()*7);
									if (numero == 0) {
										if (tablero[x1 + 1][y1] == 0) {
											tablero[x1 + 1][y1] = 1;
											contador++;
										}
									}
									if (numero == 1) {
										if (tablero[x1 - 1][y1] == 0) {
											tablero[x1 - 1][y1] = 1;
											contador++;
										}
									}
									if (numero == 2) {
										if (tablero[x1][y1 + 1] == 0) {
											tablero[x1][y1 + 1] = 1;
											contador++;
										}
									}
									if (numero == 3) {
										if (tablero[x1][y1 - 1] == 0) {
											tablero[x1][y1 - 1] = 1;
											contador++;
										}
									}
									if (numero == 4) {
										if (tablero[x1 + 1][y1 + 1] == 0) {
											tablero[x1 + 1][y1 + 1] = 1;
											contador++;
										}
									}
									if (numero == 5) {
										if (tablero[x1 + 1][y1 - 1] == 0) {
											tablero[x1 + 1][y1 - 1] = 1;
											contador++;
										}
									}
									if (numero == 6) {
										if (tablero[x1 - 1][y1 - 1] == 0) {
											tablero[x1 - 1][y1 - 1] = 1;
											contador++;
										}
									}
									if (numero == 7) {
										if (tablero[x1 - 1][y1 + 1] == 0) {
											tablero[x1 - 1][y1 + 1] = 1;
											contador++;
										}
									}
									
								}
						}
						else {
							contador = 0;
							i--;
						}
					}
					else {
						contador = 0;
						i--;
					}
					} catch (Exception e) {
						System.out.println("nomes he pogut incorporar " + i + " colonies");
					}
				}
				System.out.println("sistema automatic acabat");
				
				
			} else {
				System.out.println("no t'he entés, torna a escriure");
			}
		} while (hola);
		System.out.println(" ");
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				System.out.print(tablero[i][j] + " ");
			}
			System.out.println(" ");
		}
		System.out.println("");
		return tablero;
	}

	public int[][] veines(int[][] vecinos, int[] condiciones) {
		int contador = 0;
		int[][] vecinosfinal = new int [vecinos.length][vecinos[0].length];

		for (int i = 0; i < vecinos.length; i++) {
			for (int j = 0; j < vecinos[0].length; j++) {
				vecinosfinal[i][j] = vecinos[i][j];
			}
		}
		for (int i = 1; i < vecinos.length - 1; i++) {
			for (int j = 1; j < vecinos[0].length - 1; j++) {
				contador = 0;
				if (vecinos[i + 1][j] == 1) {
					contador++;
				}
				if (vecinos[i - 1][j] == 1) {
					contador++;
				}
				if (vecinos[i][j + 1] == 1) {
					contador++;
				}
				if (vecinos[i][j - 1] == 1) {
					contador++;
				}
				if (vecinos[i + 1][j + 1] == 1) {
					contador++;
				}
				if (vecinos[i + 1][j - 1] == 1) {
					contador++;
				}
				if (vecinos[i - 1][j - 1] == 1) {
					contador++;
				}
				if (vecinos[i - 1][j + 1] == 1) {
					contador++;
				}
				if (vecinosfinal[i][j] == 1) {
					if ((contador == condiciones[0]) || (contador == condiciones[1])) {
						vecinosfinal[i][j] = 1;
					} else {
						vecinosfinal[i][j] = 0;
					}
				}
				if (vecinosfinal[i][j] == 0) {
					if (contador == condiciones[2]) {
						vecinosfinal[i][j] = 1;
					}
				}
			}
		}
		return vecinosfinal;
	}

	public int[][] print(int[][] vecinos) {
		for (int i = 1; i < vecinos.length - 1; i++) {
			for (int j = 1; j < vecinos[0].length - 1; j++) {
				System.out.print(vecinos[i][j] + " ");
			}
			System.out.println(" ");
		}
		return vecinos;
	}
	public boolean continuar() {
		System.out.println(" ");
		Scanner entrada = new Scanner(System.in);
		char pregunta = 's';
		do {
			System.out.println("Vols continuar (s/n)");
			pregunta = entrada.next().charAt(0);
			if (pregunta == 's') {
				return true;
			}
			if (pregunta == 'n') {
				return false;
			}
		} while (pregunta != 's' || pregunta != 'n');
		return false;
	}
	public int menu() {
		System.out.println("Bienvenido al juego de la Oca !!!");
		System.out.println("  ");
		Scanner entrada =new Scanner(System.in);
		int menu=0;
		do {
			System.out.println("Opcion 1: Configurar settings");
			System.out.println("Opcion 2: empezar juego");
			menu = entrada.nextInt();
		switch (menu) {
		
		case 1:
			return menu;
		case 2:
			return menu;
		}
		} while (menu != 1 || menu != 2 );
		return 0;
	}
	public int[] settings(int[] settings) {
		
		Scanner entrada = new Scanner(System.in);
		
		settings = new int [3];
		System.out.println("benvingut a la configuracio sobre sobreviure i renaixer");
		for (int i = 0; i < 2; i++) {
			System.out.println("Escriu la posibilitat " + i + " de sobreviure");
			settings[i] = entrada.nextInt();
		}
		System.out.println("Escriu la posibilitat de renaixença");
		settings[2] = entrada.nextInt();
		
		return settings;
		
	}
}
