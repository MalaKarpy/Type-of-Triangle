import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.fluentlenium.core.filter.FilterConstructor.*;
import static org.assertj.core.api.Assertions.assertThat;

public class TriangleTrackerIntegrationTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
  goTo("http://localhost:4567/");
  assertThat(pageSource()).contains("Triangle Tracker");
  }

  @Test
  public void titleTest() {
  goTo("http://localhost:4567/");
  assertThat(title()).contains("Triangle Tracker");
  }

  @Test
  public void enterEqualSides() {
  goTo("http://localhost:4567/");
  fill("#firstSide").with("12");
  fill("#secondSide").with("12");
  fill("#thirdSide").with("12");
  submit(".btn");
  assertThat(pageSource()).contains("You entered Equilateral triangle");
  }

  @Test
  public void enterEqual() {
  goTo("http://localhost:4567/");
  fill("#firstSide").with("12");
  fill("#secondSide").with("12");
  fill("#thirdSide").with("12");
  submit(".btn");
  assertThat(pageSource()).contains("Side One:12");
  }

  @Test
  public void testLink() {
  goTo("http://localhost:4567/");
  fill("#firstSide").with("12");
  fill("#secondSide").with("12");
  fill("#thirdSide").with("12");
  submit(".btn");
  find("a", withText("Return to home page")).click();
  assertThat(pageSource()).contains("Side One");
  }

}
