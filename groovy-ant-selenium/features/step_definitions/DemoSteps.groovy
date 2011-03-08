import org.openqa.selenium.By
import static org.hamcrest.MatcherAssert.assertThat
import static org.hamcrest.Matchers.*

this.metaClass.mixin(cuke4duke.GroovyDsl)

When(~/^I search Google for "(.*)"$/) { String query ->
	browser.get("http://google.com/")
	searchField = browser.findElement(By.name("q"))
  searchField.sendKeys(query)
  searchField.submit()
}

Then(~/^there should be a result for "(.*)"$/) { String expectedResult ->
	results = browser.findElements(By.tagName("cite")).collect{ citeTag -> citeTag.getText() }
	assertThat(results, hasItem(expectedResult))
}