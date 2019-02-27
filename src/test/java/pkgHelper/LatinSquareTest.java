package pkgHelper;

import static org.junit.Assert.*;

import org.junit.Test;

public class LatinSquareTest {
	
	@Test
	public void DoesElementExist_Test1() {
		int[] array1 = {1,2,3,4,5};
		int iValue = 2;
		boolean bExpectedCondition = true;
		boolean bActualCondition = LatinSquare.doesElementExist(array1, iValue);
		
		assertEquals(bExpectedCondition,bActualCondition);
		
	}
	@Test
	public void DoesElementExist_Test2() {
		int[] array1 = {1,2,3,4,5};
		int iValue = 6;
		boolean bExpectedCondition = false;
		boolean bActualCondition = LatinSquare.doesElementExist(array1, iValue);
		
		assertEquals(bExpectedCondition,bActualCondition);
		
	}
	@Test
	public void HasAllValues_Test1() {
		int[] array1 = {1,2,3,4};
		int[] array2 = {1,2,3,4};
		boolean bExpectedCondition = true;
		boolean bActualCondition = LatinSquare.hasAllValues(array1, array2);
		
		assertEquals(bExpectedCondition,bActualCondition);
		
	}
	
	@Test
	public void HasAllValues_Test2() {
		int[] array1 = {1,2,3,4};
		int[] array2 = {1,2,3,7};
		boolean bExpectedCondition = false;
		boolean bActualCondition = LatinSquare.hasAllValues(array1, array2);
		
		assertEquals(bExpectedCondition,bActualCondition);
		
	}
	
	@Test
	public void ContainsZero_Test1() {		
		int[][] puzzle = {{1,2,3},{2,3,1},{3,1,2}};
		LatinSquare ls = new LatinSquare(puzzle);
		boolean bExpectedCondition = false;
		boolean bActualCondition = ls.containsZero();
		
		assertEquals(bExpectedCondition,bActualCondition);
	}
	
	@Test
	public void ContainsZero_Test2() {		
		int[][] puzzle = {{1,2,3},{2,0,1},{3,1,2}};
		LatinSquare ls = new LatinSquare(puzzle);
		boolean bExpectedCondition = true;
		boolean bActualCondition = ls.containsZero();
		
		assertEquals(bExpectedCondition,bActualCondition);
	}
	
	@Test
	public void HasDuplicates_Test1() {		
		int[] arr = {1,2,3,4};
		boolean bExpectedCondition = false;
		boolean bActualCondition = LatinSquare.hasDuplicates(arr);
		
		assertEquals(bExpectedCondition,bActualCondition);
	}
	@Test
	public void HasDuplicates_Test2() {		
		int[] arr = {1,2,2,4};
		boolean bExpectedCondition = true;
		boolean bActualCondition = LatinSquare.hasDuplicates(arr);
		
		assertEquals(bExpectedCondition,bActualCondition);
	}
	@Test
	public void getRow_Test1() {		
		int[][] puzzle = {{1,2,3},{2,3,1},{3,1,2}};
		LatinSquare ls = new LatinSquare(puzzle);
		int[] rowCheck = {1,2,3};
		int[] rowActual = ls.getRow(0);
		
		assertArrayEquals(rowCheck,rowActual);
	}
	@Test
	public void getCol_Test1() {		
		int[][] puzzle = {{1,2,3},{4,5,6},{7,8,9}};
		LatinSquare ls = new LatinSquare(puzzle);
		int[] colActual = ls.getCol(0);
		int[] colCheck = {1,4,7};
		
		assertArrayEquals(colCheck,colActual);
	}
	@Test
	public void isLatinSquare_Test1() {		
		int[][] puzzle = {{1,2,3},{2,3,1},{3,1,2}};
		LatinSquare ls = new LatinSquare(puzzle);
		boolean bExpectedCondition = false;
		boolean bActualCondition = ls.isLatinSquare();
		
		assertEquals(bExpectedCondition,bActualCondition);
	}
	
}