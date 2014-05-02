package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamelTest {
	
	/*@Test
	public void multipluで3と4の乗算結果が取得できる() {
		SnakeCamelUtil calc = new SnakeCamelUtil();
		int expected = ;
		int actual = calc.multiply(3, 4);
		assertThat(actual, is(expected));
		//fail("Not yet implemented");
	}*/
	
	@Test
	public void capitalizeの実装(){
		SnakeCamelUtil snak = new SnakeCamelUtil();
		String expected = "Kkkkll";
		String actual = snak.capitalize("kkkkll");
		assertThat(actual, is(expected));	
	}
	
	@Test
	public void uncapitalizeの実装(){
		SnakeCamelUtil snak = new SnakeCamelUtil();
		String expected = "kUMI";
		String actual = snak.uncapitalize("KUMI");
		assertThat(actual, is(expected));	
	}
	
	@Test
	public void snakeToCamelacaseの実装(){
		SnakeCamelUtil snak = new SnakeCamelUtil();
		String expected = "KumiKumiKumi";
		String actual = snak.snakeToCamelcase("kumi_kumi_kumi");
		assertThat(actual, is(expected));	
	}
	
	@Test
	public void camelacaseToSnakeの実装(){
		SnakeCamelUtil snak = new SnakeCamelUtil();
		String expected = "kumi_kumi_kumi";
		String actual = snak.camelToSnakecase("KumiKumiKumi");
		assertThat(actual, is(expected));	
	}
}
