package annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class Steps {

	@FindBy(xpath = "//h2[.='HONDA CITY']")
	public WebElement resultSet;

	WebDriver driver;
	WebElement element;
	String site = "https://www.webmotors.com.br/";

	@Dado("^que eu entre no site Webmotors$")
	public void queEuEntreNoSiteWebmotors() {
		System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(site);
	}

	@Quando("^digitar a marca \"([^\"]*)\"$")
	public void digitarAMarca(String marca) {
		WebElement searchBar = driver.findElement(By.id("searchBar"));
		searchBar.sendKeys(marca);
	}

	@Quando("^clicar no resultado principal$")
	public void clicarNoResultadoPrincipal() throws Throwable {
		WebElement resultado = driver.findElement(By.id("searchBar"));
		Thread.sleep(3000);
		resultado.sendKeys(Keys.TAB, Keys.ENTER);
		Thread.sleep(3000);
	}

	@Entao("^o site deve mostrar os veiculos desta marca")
	public void oSiteDeveMostrarOsVeiculosDestaMarca() throws Throwable {
		WebDriver navegador = new FirefoxDriver();
		WebElement resultados = driver.findElement(By.xpath("//h2[.='HONDA CITY']"));
		if (resultados.isDisplayed()) {
			System.out.println("Resultados obtidos");
			navegador.quit();
		} else if (!resultados.isDisplayed()) {
			;
			System.out.println("Erro na busca!");
			navegador.quit();
		}
		navegador.quit();
	}

	@Quando("^digitar a marca \"([^\"]*)\" e o modelo \"([^\"]*)\"$")
	public void digitar_a_marca_e_o_modelo(String marca, String modelo) throws Throwable {
		WebElement searchBar = driver.findElement(By.id("searchBar"));
		searchBar.sendKeys(marca + " " + modelo);
	}
}
