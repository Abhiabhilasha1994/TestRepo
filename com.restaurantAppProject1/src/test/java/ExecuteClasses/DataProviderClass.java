package ExecuteClasses;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {
	
  
	 @DataProvider(name="Search Provider")
	  public static Object[][] getDataFromDataProvider() {
	    return new Object[][] {
	    	new Object[] { "admin", "1234" },
	    	new Object[] {"admin1", "password"}	      
	      
	    };
	  }
}
