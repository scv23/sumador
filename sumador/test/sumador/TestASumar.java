package sumador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestASumar {

	@Test
	public void testUnaCifra() {
		ASumar sumi = new ASumar();
		String resultado = sumi.sumativo("6");
		
		System.out.println(resultado);
	}

}
