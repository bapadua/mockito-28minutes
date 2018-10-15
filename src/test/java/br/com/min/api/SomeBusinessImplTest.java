package br.com.min.api;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomeBusinessImplTest {
	
	@Test
	public void testFindTheGreatestFromAllData() {
		 SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());
		 int result = businessImpl.findTheGreatestFromAllData();
		 assertEquals(24, result);
		 
	}
}

class DataServiceStub implements DataService{

	@Override
	public int[] retrieveAllData() {
		return new int[] {24,12,15};
	}
	
}