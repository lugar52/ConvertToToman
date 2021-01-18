package ejemploTdd.ejemplo2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConversorRomanoTest {

	//  0 => 0, 1 => I,  2 => II, 3 => III, 4 => IV, 5 => V, 6 => VI, 7 => VII, 8 => VIII, 9 => IX,
	//  11 => XI,  12 => XII, 13 => XIII, 14 => XIV, 15 => XV, 16 => XVI, 17 => XVII, 18 => XVIII, 19 => XIX,
	//  30 => "XxxxXX", 40 => XL,   50=> L, 60 => LX, 70 => LXX, 80 => LXXX, 90 => XC, 
	// 100 => C, 500 => D, 	999 => CMXCIX
	
	@Test
	void testIntToRoman() {
		
		assertEquals("", ConversorRomano.intToRoman(0));
		assertEquals("I", ConversorRomano.intToRoman(1));
		assertEquals("II", ConversorRomano.intToRoman(2));
		assertEquals("III", ConversorRomano.intToRoman(3));
		assertEquals("IV", ConversorRomano.intToRoman(4));
		assertEquals("V", ConversorRomano.intToRoman(5));
		assertEquals("VI", ConversorRomano.intToRoman(6));
		assertEquals("VII", ConversorRomano.intToRoman(7));
		assertEquals("VIII", ConversorRomano.intToRoman(8));
		assertEquals("IX", ConversorRomano.intToRoman(9));  // Marca Error
		assertEquals("X", ConversorRomano.intToRoman(10));  // Marca Error
		assertEquals("XI", ConversorRomano.intToRoman(11));  
		assertEquals("XII", ConversorRomano.intToRoman(12));
		assertEquals("XIII", ConversorRomano.intToRoman(13));
		assertEquals("XIV", ConversorRomano.intToRoman(14));
		assertEquals("XV", ConversorRomano.intToRoman(15));
		assertEquals("XVI", ConversorRomano.intToRoman(16));
		assertEquals("XVII", ConversorRomano.intToRoman(17));
		assertEquals("XVIII", ConversorRomano.intToRoman(18));
		assertEquals("XIX", ConversorRomano.intToRoman(19));
		assertEquals("XX", ConversorRomano.intToRoman(20));
		assertEquals("XXX", ConversorRomano.intToRoman(30));
		assertEquals("XXXV", ConversorRomano.intToRoman(35));
		assertEquals("XL", ConversorRomano.intToRoman(40));
		assertEquals("L", ConversorRomano.intToRoman(50));
		assertEquals("XC", ConversorRomano.intToRoman(90));
		assertEquals("C", ConversorRomano.intToRoman(100));
		assertEquals("D", ConversorRomano.intToRoman(500));
		assertEquals("CMXCIX", ConversorRomano.intToRoman(999));
		
		
	}

}
