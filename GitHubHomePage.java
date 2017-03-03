package com.githubauto.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GitHubHomePage {
  private WebDriver dr;

  public GitHubHomePage(WebDriver driver) {
    dr = driver;
  }

  public GitHubLoginPage signin() {
    dr.navigate().to("https://github.com");
    WebElement signin = dr.findElement(By.linkText("Sign in"));
    signin.click();
    return new GitHubLoginPage(dr);
  }
}
