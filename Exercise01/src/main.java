/*Haga un programa que dados dos números introducidos por teclado  indique si son amigos o no. El programa debe ofrecer la posibilidad de  continuar. 

Nota: Dos números amigos son dos enteros positivos (n1, n2)  tales que la suma de los divisores propios de uno de ellos es igual al  otro (la unidad se considera divisor propio, pero no lo es el mismo  número). 
Por ejemplo, 220 y 284 son amigos, ya que: 
Suma de divisores de  284: 1 + 2 + 4 + 71 + 142 = 220 
Suma de divisores de 220: 1 + 2 + 4 + 5 +  10 + 11 + 20 + 22 + 44 + 55 + 110 = 284. También son números amigos 17296  y 18416
 */

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {

		int number1 = Integer.parseInt(JOptionPane.showInputDialog("Primer número"));
		int number2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo número"));
		boolean result = amigos(number1, number2);
		JOptionPane.showMessageDialog(null, result );
	}

	public static boolean amigos(int number1, int number2) {

		int suma1 = divisores(number1);
		int suma2 = divisores(number2);
		
		
		return (suma1 == number2 && suma2 == number1);

	}

	public static int divisores(int number) {
		int sumaDivisores = 0;
		for (int x = 1; x < number; x++) {
			if (number % x == 0) {
				sumaDivisores += x;
			}
		}
		return sumaDivisores;
	}
}
