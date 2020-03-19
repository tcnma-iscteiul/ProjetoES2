package ES2.Grupo7;

/**
 * Hello world!
 *
 */
public class App{
	
	public int potencia (int base, int expoente) {
		int res = (int)(Math.pow(base, expoente));
		return res;
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
