package br.com.min.api;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;	
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockAnnotationTest {

	@Mock
	DataService dataService;
	
	@InjectMocks
	SomeBusinessImpl businessImpl;

	@Test
	public void testFindTheGreatestFromAllData() {
		when(dataService.retrieveAllData()).thenReturn(new int[] {25, 15, 10});
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(25, result);
	}
	
	@Test
	public void testFindTheGreatestFromAllData_One() {
		when(dataService.retrieveAllData()).thenReturn(new int[] {1});
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(1, result);
	}


}