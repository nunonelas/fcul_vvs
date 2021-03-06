package sut.linebranchcoverage;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

import sut.ArrayNTree;

public class TestNTreeToString {

	/*
	 * to coverage: 
	 *     line 1
	 *     branch 1
	 */

	@Test
	public void testToStringTree() {
		ArrayNTree<Integer> mArrayNTree = new ArrayNTree<Integer>(Arrays.asList(2, 0, 4), 2);
		
		assertTrue(mArrayNTree.toString().equals("[0:[2][4]]"));
	}
}
