package ireporterTest;

import org.apache.bcel.classfile.Utility;
import org.apache.poi.hpsf.Util;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {
    @Test
    public void testMethodOne(){
        Assert.assertTrue(true);
    }
	  
    @Test
    public void testMethodTwo(){
	Assert.assertTrue(false);
    }
	  
    @Test(dependsOnMethods={"testMethodTwo"})
        public void testMethodThree(){
        Assert.assertTrue(true);
    }
    
    Utility.capture
}