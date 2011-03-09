import org.openqa.selenium.htmlunit.HtmlUnitDriver
import org.apache.commons.logging.LogFactory

this.metaClass.mixin(cuke4duke.GroovyDsl)

// suppress unnecessary warnings from HtmlUnit
LogFactory.getFactory().setAttribute("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog")

Before() {
  browser = new HtmlUnitDriver()
}

After() {
  browser.close()
  browser.quit()
}