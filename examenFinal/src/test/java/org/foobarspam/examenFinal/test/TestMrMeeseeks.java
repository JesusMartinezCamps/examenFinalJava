package org.foobarspam.examenFinal.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.foobarspam.examenFinal.business.MrMeeseeks;
import org.foobarspam.examenFinal.business.ProxyMrMeeseeks;
import org.junit.Test;

public class TestMrMeeseeks {

	@Test
	public void testGenerateMrMeeseeks() {
		ArrayList<MrMeeseeks> setMrMe = new ArrayList<MrMeeseeks>();

		ProxyMrMeeseeks box = new ProxyMrMeeseeks();
		
		MrMeeseeks mrMee = new MrMeeseeks();

		String first = "Open ";
		String second = "stupid jar";
		
		
		mrMee.formulateRequest(first, second);
	}


}
