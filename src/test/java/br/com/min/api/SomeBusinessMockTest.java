package br.com.min.api;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class SomeBusinessMockTest {

	DataService dataService = mock(DataService.class);

	@Test
	public void testFindTheGreatestFromAllData() {
		when(dataService.retrieveAllData()).thenReturn(new int[] {25, 15, 10});
		
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataService);
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(25, result);
	}
	
	@Test
	public void testFindTheGreatestFromAllData_One() {
		when(dataService.retrieveAllData()).thenReturn(new int[] {1});
		
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataService);
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(1, result);
	}


}