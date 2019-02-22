import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BomPraCredito {
	
	@Test
	public void GerarCPF() {
		
		System.setProperty("webdriver.gecko.driver", "/Users/Denise/Downloads/geckodriver-v0.24.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.4devs.com.br/gerador_de_cpf");
		//System.out.println(driver.getTitle());
		driver.findElement(By.id("bt_gerar_cpf")).click();
		System.out.println(driver.findElement(By.id("texto_cpf")).getAttribute("value"));	
		
		//driver.quit();
		
	}
	
	@Test
	public void TestPage() {
		System.setProperty("webdriver.gecko.driver", "/Users/Denise/Downloads/geckodriver-v0.24.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.bompracredito.com.br/emprestimo-pessoal");
		//System.out.println(driver.getTitle());
		driver.findElement(By.id("btnThreeThousand")).click();
		driver.findElement(By.id("btnTwelveTerm")).click();
		driver.findElement(By.id("name")).sendKeys("Denise Medeiros");
		driver.findElement(By.id("email")).sendKeys("denymed@gmail.com");
		driver.findElement(By.cssSelector(".active > p")).click();
		driver.findElement(By.id("btnContinue")).click();
		
		//System.out.println(driver.getCurrentUrl());
		
	
	}

	@Test
	public void TestPage2() {
		System.setProperty("webdriver.gecko.driver", "/Users/Denise/Downloads/geckodriver-v0.24.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.findElement(By.id("borrower.cpf")).sendKeys("291.873.278-93");
		driver.findElement(By.id("borrower.dateOfBirth")).sendKeys("07091990");
		driver.findElement(By.id("borrower.monthlyGrossIncome")).sendKeys("50000");
		driver.findElement(By.id("borrower.gender")).click();
		driver.findElement(By.id("borrower.maritalStatus")).click();
		WebElement Instrucao = driver.findElement(By.id("borrower.jobType"));
		Select combo = new Select(Instrucao);
		combo.selectByVisibleText("Autônomo");
		WebElement Profissao = driver.findElement(By.id("borrower.profession"));
		Select combo2 = new Select(Profissao);
		combo2.selectByVisibleText(" Administrador ");
		
		//driver.quit();
		
	}
	
	

}
