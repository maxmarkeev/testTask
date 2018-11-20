import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage extends PageObj {
	public GooglePage(WebDriver driver){
		super(driver);
	}

	@FindBy(name = "q")
	private WebElement element;
	@FindBy(xpath = "//*[@id='rso']//a")
	private List<WebElement> findElements;

	/**
	 * Выполняте поиск
	 * @param line
	 */
	public void setSearch(String line){
		element.sendKeys(line);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		element.submit();
	}

	/**
	 * Возвращает ссылку заданого элемента из списка findElements
	 * @param n
	 * @return
	 */
	public String getSearchResult(int n){
		return findElements.get(n).getAttribute("href");
	}

}
