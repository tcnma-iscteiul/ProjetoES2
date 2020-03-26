package ES2.Grupo7;

/**
 * @author ES2-IGEPL-Grupo7
 *
 */
public class App{
	
	
	/**
	 * função que, ao ser inserido 2 inteiros, devolve a potência calculada conforme a base e o expoente
	 * @param base
	 * @param expoente
	 * @return a potencia calculada
	 *  **/
	public int potencia (int base, int expoente) {
		int res = (int)(Math.pow(base, expoente));
		return res;
	}
	
	
	/**
	 * função que compara dois valores do tipo String e pode devolver uma entre 2 hipóteses: 
	 * true = as Strings são iguais
	 * false = as Strings são diferentes
	 * @param String g
	 * @param String w
	 * @return um booleano
	 *  **/
	public boolean compare (String g, String w) {
		return g.contains(w);
	}

    public static void main( String[] args ){
    	
    	int base = 2;
    	int expoente = 2;
    	App p = new App();
    	int res = p.potencia(base, expoente);
    	System.out.println("Resultado da potencia de " + base + "^" + expoente + " = " + res + "\n");
    	
        System.out.println( "Trabalho desenvolvido por: " + "\n" + "\n" 
        + "Tomás Afonso" + "\n" 
        + "Diogo Guerreiro" + "\n" 
        + "Paulo Jin" + "\n" 
        + "Zé Magalhães" + "\n" 
        + "André Ivan-Coca" + "\n" 
        + "António Oliveira");
    }
    
    
}
