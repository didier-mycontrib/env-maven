package tp.service.test;

import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;
import tp.service.MyService;
import tp.service.impl.MyServiceImpl;

public class TestMyService {
	
private static MyService myService;
	
	@BeforeClass
	public static void setUp(){
		myService=new MyServiceImpl();
	}
	
	@Test
	public void testTva(){
		double res= myService.calculerTva(200,20);
		Assert.assertEquals(40,res,0.0001);
	}
	
	@Test
	public void testTtc(){
		double res= myService.calculerTtc(200, 20);
		Assert.assertEquals(240,res,0.0001);
	}


}
