package ES2.Grupo7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testes {
	
	private App c = new App();
	
	private int base = 2;
	private int expoente =2;
	
	private String w = "André";
	private String j = "Paulo";
	
//	@Before
//	public void initTest() {
//		c = new App();
//		base = 2;
//		expoente = 2;
//		w = "André";
//		j = "Paulo";
//	}

	@Test
	void test() {
		
		assertEquals(4, c.potencia(base, expoente));
		assertFalse(c.compare(j, w));
//		fail("Not yet implemented");
	}
	
	

}
