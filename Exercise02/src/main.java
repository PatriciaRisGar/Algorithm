/*El cuadrado de un número se obtiene al sumar tantos números impares como indique el número.
La suma debe empezar con el uno (1). Así: El cuadrado de 1 : 1 = 1 El cuadrado de 2 : 1 + 3 = 4 El cuadrado de 3: 1 + 3 + 5 = 9 
Se debe desarrollar un programa que utilice este método para calcular el cuadrado de cualquier número entero. 
 */

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		int number = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número"));
		
		JOptionPane.showMessageDialog(null, findSquare(number));
	}

	private static int findSquare(int number) {
		int square = 0;
		int count = 0;
		
		for (int i = 1; count != number; ++i) {
			if ( i%2 != 0 ) {
				square += i;
				count ++;
			}		
		}
		
		return square;
	}

}
