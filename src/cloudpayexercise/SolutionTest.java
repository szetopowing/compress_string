package cloudpayexercise;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.Test;


class SolutionTest {

	@Test
	void testCompress() {
		Solution sol = new Solution();
		assertEquals(sol.compress("AAAAANNNMMMMYYYYuuuuUUUUaaaarWWLLLLJ888DDDDDDDDD"),"A5N3M4Y4u4U4a4r1W2L4J183D9");
	}

	@Test
	void testDecompress() {
		Solution sol = new Solution();
		assertEquals(sol.decompress("A5N3M4Y4u4U4a4r1W2L4J183D9"),"AAAAANNNMMMMYYYYuuuuUUUUaaaarWWLLLLJ888DDDDDDDDD");
	}

}
