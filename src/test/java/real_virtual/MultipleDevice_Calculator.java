package real_virtual;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleDevice_Calculator extends BaseTest{
	
	
	
	@Test
	public void verifyAddTest() {
		
		System.out.println("add test feature.....");
		
		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		driver.findElement(By.id("digit_9")).click();
		driver.findElement(By.id("digit_8")).click();
		driver.findElement(By.id("digit_8")).click();
		driver.findElement(By.id("digit_7")).click();
		driver.findElement(By.id("digit_7")).click();
		
		
		//click on plus icon ----- com.google.android.calculator:id/op_add
		driver.findElement(By.id("op_add")).click();
				
		
		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		driver.findElement(By.id("digit_9")).click();
		driver.findElement(By.id("digit_8")).click();
		driver.findElement(By.id("digit_8")).click();
		driver.findElement(By.id("digit_9")).click();
		driver.findElement(By.id("digit_9")).click();
		
		
		//click on EQUAL icon ----- com.google.android.calculator:id/eq
		driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
		
		
		//GET THE RESULTS
		String results = driver.findElement(By.id("result_final")).getText();
		
		System.out.println("Results are: " + results);
		
		Assert.assertEquals(results, "1997776");
		
	}

}
