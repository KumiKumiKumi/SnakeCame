package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamelTest {
	
	/*@Test
	public void multiplu‚Å3‚Æ4‚ÌæZŒ‹‰Ê‚ªæ“¾‚Å‚«‚é() {
		SnakeCamelUtil calc = new SnakeCamelUtil();
		int expected = ;
		int actual = calc.multiply(3, 4);
		assertThat(actual, is(expected));
		//fail("Not yet implemented");
	}*/
	
	@Test
	public void capitalize‚ÌÀ‘•(){
		SnakeCamelUtil snak = new SnakeCamelUtil();
		String expected = "Kkkkll";
		String actual = snak.capitalize("kkkkll");
		assertThat(actual, is(expected));	
	}
	
	@Test
	public void uncapitalize‚ÌÀ‘•(){
		SnakeCamelUtil snak = new SnakeCamelUtil();
		String expected = "kUMI";
		String actual = snak.uncapitalize("KUMI");
		assertThat(actual, is(expected));	
	}
	
	@Test
	public void snakeToCamelacase‚ÌÀ‘•(){
		SnakeCamelUtil snak = new SnakeCamelUtil();
		String expected = "KumiKumiKumi";
		String actual = snak.snakeToCamelcase("kumi_kumi_kumi");
		assertThat(actual, is(expected));	
	}
	
	@Test
	public void camelacaseToSnake‚ÌÀ‘•(){
		SnakeCamelUtil snak = new SnakeCamelUtil();
		String expected = "kumi_kumi_kumi";
		String actual = snak.camelToSnakecase("KumiKumiKumi");
		assertThat(actual, is(expected));	
	}
}
