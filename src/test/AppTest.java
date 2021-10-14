public void testGoogleSearch() throws InterruptedException {
    System.setProperty("webdriver.edge.driver", "/usr/bin/msedgedriver.exe");
 
    final WebDriver driver = new EdgeDriver();
    driver.get("http://www.google.com");
    Thread.sleep(5000); 
    final WebElement searchBox = driver.findElement(By.name("q"));
    searchBox.sendKeys("EdgeDriver");
    searchBox.submit();
    Thread.sleep(5000); 
    driver.quit();
}
