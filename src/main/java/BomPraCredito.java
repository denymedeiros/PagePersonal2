import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BomPraCredito {
	
	private static final CharSequence Today = null;

	@Test
	public void GerarCPF() {
		
		System.setProperty("webdriver.gecko.driver", "/Users/Denise/Downloads/geckodriver-v0.24.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.4devs.com.br/gerador_de_cpf");
		//System.out.println(driver.getTitle());
		driver.findElement(By.id("bt_gerar_cpf")).click();
		System.out.println(driver.findElement(By.id("texto_cpf")).getAttribute("textContent"));	
			
		driver.quit();
	
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
		try {
			driver.wait(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.quit();
		
	
	}

	@Test
	public void TestPage2() {
		System.setProperty("webdriver.gecko.driver", "/Users/Denise/Downloads/geckodriver-v0.24.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.bompracredito.com.br/v2/cadastrobasico?id=9e343012-030d-4bf0-85bd-aa01012eabab");
		driver.findElement(By.id("borrower.cpf")).sendKeys("291.873.238-93");
		driver.findElement(By.id("borrower.dateOfBirth")).sendKeys("07091990");
		driver.findElement(By.id("borrower.monthlyGrossIncome")).sendKeys("50000");
		driver.findElement(By.id("borrower.gender")).click();
		driver.findElement(By.id("borrower.maritalStatus")).click();
		WebElement Ocupacao = driver.findElement(By.id("borrower.jobType"));
		Select combo = new Select(Ocupacao);
		combo.selectByVisibleText("Autônomo");
		WebElement Profissao = driver.findElement(By.id("borrower.profession"));
		Select combo2 = new Select(Profissao);
		combo2.selectByVisibleText("Administrador");
		WebElement Instrucao = driver.findElement(By.id("borrower.educationLevel"));
		Select combo3 = new Select(Instrucao);
		combo3.selectByVisibleText("Superior Completo");
		WebElement TitularConta = driver.findElement(By.id("borrower.bankingData.bankNumber"));
		Select combo4 = new Select(TitularConta);
		combo4.selectByVisibleText("Outros");
		driver.findElement(By.id("borrower.bankingData.hasCheckbook")).click();
		driver.findElement(By.id("borrower.hasNegativeCreditRecord2")).click();
		driver.findElement(By.id("hasProperty")).click();
		driver.findElement(By.id("hasVehicle")).click();
		driver.findElement(By.id("button-borrower-info")).click();
		try {
			driver.wait(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.quit();
		
	}
	
	@Test
	public void TestPage3() {
		//System.setProperty("webdriver.gecko.driver", "/Users/Denise/Downloads/geckodriver-v0.24.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.bompracredito.com.br/v2/cadastrocompleto?id=4fb1ab9c-93e3-42fb-a966-aa030007ea5c");
		driver.findElement(By.id("homeAddress.cep")).sendKeys("06764290");
		driver.findElement(By.id("homeAddress.number")).sendKeys("1041");
		driver.findElement(By.id("mobilePhone")).sendKeys("11946523201");
		driver.findElement(By.id("button-borrower-info")).click();
		try {
			driver.wait(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.quit();
	}
	
	@Test
	public void TestPage4() {
		//System.setProperty("webdriver.gecko.driver", "/Users/Denise/Downloads/geckodriver-v0.24.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.bompracredito.com.br/v2/cadastrocompleto?id=4fb1ab9c-93e3-42fb-a966-aa030007ea5c");
		driver.findElement(By.id("nationality")).click();
		WebElement RGTipo = driver.findElement(By.id("rgType"));
		Select combo5 = new Select(RGTipo);
		combo5.selectByVisibleText("Carteira de identidade");
		driver.findElement(By.id("rgEmissionDate")).sendKeys(Today);
		driver.findElement(By.id("rg")).sendKeys("326063122");
		WebElement OE = driver.findElement(By.id("emmitedBy"));
		Select combo6 = new Select(OE);
		combo6.selectByVisibleText("SSP");
		WebElement UFOE = driver.findElement(By.id("ufrg"));
		Select combo7 = new Select(UFOE);
		combo7.selectByVisibleText("SP");
		driver.findElement(By.id("motherName")).sendKeys("Maria Silva da Cunha");
		driver.findElement(By.id("homeType")).click();
		driver.findElement(By.id("timeInAddress")).sendKeys("022005");
		WebElement Objetivo = driver.findElement(By.id("loanObjective"));
		Select combo8 = new Select(Objetivo);
		combo8.selectByVisibleText("Outros");
		driver.findElement(By.id("button-personal-info")).click();
		try {
			driver.wait(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.quit();
	
	}
	
	@Test
	public void TestPage5() {
		//System.setProperty("webdriver.gecko.driver", "/Users/Denise/Downloads/geckodriver-v0.24.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.bompracredito.com.br/v2/cadastrocompleto?id=4fb1ab9c-93e3-42fb-a966-aa030007ea5c");
		driver.findElement(By.id("incomeProof")).click();
		driver.findElement(By.id("startDate")).sendKeys("022005");
		driver.findElement(By.id("button-professional-info")).click();
		try {
			driver.wait(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.quit();
	
	}
	
	@Test
	public void TestPage6() {
		//System.setProperty("webdriver.gecko.driver", "/Users/Denise/Downloads/geckodriver-v0.24.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.bompracredito.com.br/v2/cadastrocompleto?id=4fb1ab9c-93e3-42fb-a966-aa030007ea5c");
		driver.findElement(By.id("realEstateData.value")).sendKeys("500000");
		driver.findElement(By.id("realEstateData.isFinanced")).click();
		driver.findElement(By.id("realEstateData.docsOk")).click();
		WebElement AnoVeic = driver.findElement(By.id("vehicleData.createDate"));
		Select combo9 = new Select(AnoVeic);
		combo9.selectByVisibleText("20015");
		WebElement MarcaVeic = driver.findElement(By.id("vehicleData.brand"));
		Select combo10 = new Select(MarcaVeic);
		combo10.selectByVisibleText("CHEVROLET");
		WebElement ModVeic = driver.findElement(By.id("vehicleData.model"));
		Select combo11 = new Select(ModVeic);
		combo11.selectByVisibleText("CLASSIC LS 1.0 VHC-E 8V FLEXPOWER");
		driver.findElement(By.id("vehicleData.isFinanced")).click();
		driver.findElement(By.id("button-real-state-vehicle-info")).click();
		try {
			driver.wait(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.quit();
	
	}


}
