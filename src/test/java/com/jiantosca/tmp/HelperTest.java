package com.jiantosca.tmp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelperTest {

	@Test
	void test() {
		assertTrue(new Helper().help().equals("okay, helping"));
	}

}
