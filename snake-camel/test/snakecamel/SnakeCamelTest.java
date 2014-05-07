package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import org.junit.Test;

public class SnakeCamelTest {
	
	//-------captalizeのテスト--------
	
	@Test
	public void capitalizeの実装(){
		SnakeCamelUtil snak = new SnakeCamelUtil();
		String expected = "Kumi";
		String actual = snak.capitalize("kumi");
		assertThat(actual, is(expected));	
	}
	
	//-------uncapitalizeのテスト-----------
	
	@Test
	public void uncapitalizeの実装(){
		SnakeCamelUtil snak = new SnakeCamelUtil();
		String expected = "kUMI";
		String actual = snak.uncapitalize("KUMI");
		assertThat(actual, is(expected));	
	}
	
	//------snakeToCamelCaseのテスト--------
	
	@Test
	public void snakeToCamelacaseの実装_abcからAbcへ(){
		SnakeCamelUtil snak = new SnakeCamelUtil();
		String expected = "Kumi";
		String actual = snak.snakeToCamelcase("kumi");
		assertThat(actual, is(expected));	
	}
	
	@Test
	public void snakeToCamelacaseの実装_abc_defからAbcDefへ(){
		SnakeCamelUtil snak = new SnakeCamelUtil();
		String expected = "KumiKumi";
		String actual = snak.snakeToCamelcase("kumi_kumi");
		assertThat(actual, is(expected));	
	}
	
	@Test
	public void snakeToCamelacaseの実装_abc_def_ghからAbcDefGhへ(){
		SnakeCamelUtil snak = new SnakeCamelUtil();
		String expected = "KumiKumiKumi";
		String actual = snak.snakeToCamelcase("kumi_kumi_kumi");
		assertThat(actual, is(expected));	
	}
	
	@Test
	public void snakeToCamelacaseの実装_abc___def___ghからAbcDefGhへ(){
		SnakeCamelUtil snak = new SnakeCamelUtil();
		String expected = "KumiKumiKumi";
		String actual = snak.snakeToCamelcase("kumi___kumi___kumi");
		assertThat(actual, is(expected));	
	}
	
	@Test
	public void snakeToCamelacaseの実装__abc_def__からAbcDefへ(){
		SnakeCamelUtil snak = new SnakeCamelUtil();
		String expected = "KumiKumi";
		String actual = snak.snakeToCamelcase("__kumi_kumi__");
		assertThat(actual, is(expected));	
	}
	
	
	//-----camelToSnakeCaseのテスト-----
	
	@Test
	public void camelToSnakeCaseの実装_Abcからabcへ(){
		SnakeCamelUtil snak = new SnakeCamelUtil();
		String expected = "kumi";
		String actual = snak.camelToSnakecase("Kumi");
		assertThat(actual, is(expected));	
	}
	
	@Test
	public void camelToSnakeCaseの実装_AbcDefGhからabc_def_ghへ(){
		SnakeCamelUtil snak = new SnakeCamelUtil();
		String expected = "kumi_kumi_kumi";
		String actual = snak.camelToSnakecase("KumiKumiKumi");
		assertThat(actual, is(expected));	
	}
}

