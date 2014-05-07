package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import org.junit.Test;

public class SnakeCamelTest {
	
	//-------captalize�̃e�X�g--------
	
	@Test
	public void capitalize�̎���(){
		SnakeCamelUtil snak = new SnakeCamelUtil();
		String expected = "Kumi";
		String actual = snak.capitalize("kumi");
		assertThat(actual, is(expected));	
	}
	
	//-------uncapitalize�̃e�X�g-----------
	
	@Test
	public void uncapitalize�̎���(){
		SnakeCamelUtil snak = new SnakeCamelUtil();
		String expected = "kUMI";
		String actual = snak.uncapitalize("KUMI");
		assertThat(actual, is(expected));	
	}
	
	//------snakeToCamelCase�̃e�X�g--------
	
	@Test
	public void snakeToCamelacase�̎���_abc����Abc��(){
		SnakeCamelUtil snak = new SnakeCamelUtil();
		String expected = "Kumi";
		String actual = snak.snakeToCamelcase("kumi");
		assertThat(actual, is(expected));	
	}
	
	@Test
	public void snakeToCamelacase�̎���_abc_def����AbcDef��(){
		SnakeCamelUtil snak = new SnakeCamelUtil();
		String expected = "KumiKumi";
		String actual = snak.snakeToCamelcase("kumi_kumi");
		assertThat(actual, is(expected));	
	}
	
	@Test
	public void snakeToCamelacase�̎���_abc_def_gh����AbcDefGh��(){
		SnakeCamelUtil snak = new SnakeCamelUtil();
		String expected = "KumiKumiKumi";
		String actual = snak.snakeToCamelcase("kumi_kumi_kumi");
		assertThat(actual, is(expected));	
	}
	
	@Test
	public void snakeToCamelacase�̎���_abc___def___gh����AbcDefGh��(){
		SnakeCamelUtil snak = new SnakeCamelUtil();
		String expected = "KumiKumiKumi";
		String actual = snak.snakeToCamelcase("kumi___kumi___kumi");
		assertThat(actual, is(expected));	
	}
	
	@Test
	public void snakeToCamelacase�̎���__abc_def__����AbcDef��(){
		SnakeCamelUtil snak = new SnakeCamelUtil();
		String expected = "KumiKumi";
		String actual = snak.snakeToCamelcase("__kumi_kumi__");
		assertThat(actual, is(expected));	
	}
	
	
	//-----camelToSnakeCase�̃e�X�g-----
	
	@Test
	public void camelToSnakeCase�̎���_Abc����abc��(){
		SnakeCamelUtil snak = new SnakeCamelUtil();
		String expected = "kumi";
		String actual = snak.camelToSnakecase("Kumi");
		assertThat(actual, is(expected));	
	}
	
	@Test
	public void camelToSnakeCase�̎���_AbcDefGh����abc_def_gh��(){
		SnakeCamelUtil snak = new SnakeCamelUtil();
		String expected = "kumi_kumi_kumi";
		String actual = snak.camelToSnakecase("KumiKumiKumi");
		assertThat(actual, is(expected));	
	}
}

