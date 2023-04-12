package junit5Testit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Testit {

	
	@ParameterizedTest(name = "testaa tuleeko luvulla {0} oikea tulos")
	@CsvSource({ "0, 0:00:00", "60, 0:01:00", "3665, 1:01:05", "20, 0:00:20", "2400, 0:40:00", "-5, -1", "32000, -1" })
	public void testCorrectResult(int luku, String tulos) {

		String result = TimeUtils.secToTime(luku);
		assertEquals(tulos, result);
	}

	



}
