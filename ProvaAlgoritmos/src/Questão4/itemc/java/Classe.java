/*c.Declare uma vari�vel do tipo boolean de nome �verdadeiro� com valor false. 
  Declare outra vari�vel do tipo boolean de nome �falso� com valor true. 
  Imprima no console o resultado da condi��o da nega��o da vari�vel �verdadeiro� e a dupla nega��o 
  da vari�vel �falso�.
 */

package Quest�o4.itemc.java;

public class Classe {
	public static void main(String[] args) {

		boolean verdadeiro = false;
		boolean falso = true;

		System.out.println(verdadeiro + " -> " + !verdadeiro + " ");
		System.out.println(falso + " -> " + !!falso);
	}
}
