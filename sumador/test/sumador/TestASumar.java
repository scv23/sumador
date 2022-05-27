package sumador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestASumar {

	@Test
	public void testUnaCifra() {
		ASumar sumi = new ASumar();
		System.out.println(sumi.total(3433));
	}
}