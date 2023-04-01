package automacao.web;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	WebDriver driver;

	public void abrirNavegador() {
		String url = "https://www.google.com.br";
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

	}

	public void fecharNavegador() {
		driver.quit();
	}
	
	public void validarTitulo(String texto) {
		driver.getTitle();
	}
	
	public void evidencias(String evidencia) {
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
		File scrDest = new File("./evidencias/" + evidencia + ".png");
		try {
			FileUtils.copyFile(scrFile, scrDest);
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
