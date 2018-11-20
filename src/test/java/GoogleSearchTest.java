import org.junit.Assert;
import org.junit.Test;

public class GoogleSearchTest extends InitTest{

	@Test
	public void googleSearchTest(){
		driver.get("https://google.com");
		GooglePage googlePage = new GooglePage(driver);
		googlePage.setSearch("yandex.ru");
		String actualRes = googlePage.getSearchResult(0);
		Assert.assertTrue(actualRes.contains("yandex.ru"));

	}
}
