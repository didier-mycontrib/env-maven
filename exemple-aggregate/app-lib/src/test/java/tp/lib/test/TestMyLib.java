package tp.lib.test;

import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;
import tp.lib.MyLib;
import tp.lib.impl.MyLibImpl;

public class TestMyLib {
	
	private static MyLib myLib;
	
	@BeforeClass
	public static void setUp(){
		myLib=new MyLibImpl();
	}
	
	@Test
	public void testAdd(){
		double res= myLib.add(5.5, 3.3);
		Assert.assertEquals(8.8,res,0.0001);
	}
	
	@Test
	public void testMult(){
		double res= myLib.mult(2.0, 3.3);
		Assert.assertEquals(6.6,res,0.0001);
	}

}
