package sut.linebranchcoverage;

import static org.junit.Assert.*;

import org.junit.Test;
import sut.ArrayNTree;

import java.util.Arrays;
import java.util.List;

public class TestNTreeSize {
	
	/*
	 * to coverage:
	 *     line 1, 2, 3, 4, 5
	 *     branch 1, 2, 3, 4
	 */

	@Test
	public void testWithElementsInsideList() {
		List<Integer> list = Arrays.asList(39, 59, 17, 85, 41, 45);
		ArrayNTree<Integer> mArrayNTree = new ArrayNTree<>(list, 4);
		assertEquals(6, mArrayNTree.size());
	}

}
