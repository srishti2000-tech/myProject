package com.delhivery;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.zaproxy.clientapi.core.ApiResponse;
import org.zaproxy.clientapi.core.ClientApi;
import org.zaproxy.clientapi.core.ClientApiException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ZAPSecurityTest {
	static final String  ZAP_PROXY_ADD ="localhost";
	static final int ZAP_PROXY_PORT =8080;
	static final String ZAP_API_KEY ="okrrnb7p70j8o3t7gug0f1nqbl";
	
	private WebDriver driver;
	private ClientApi api;
	@BeforeMethod
	public void setup() {
		String ProxyServerUrl = ZAP_PROXY_ADD +":"+ZAP_PROXY_PORT;
		Proxy proxy = new Proxy();
		proxy.setHttpProxy(ProxyServerUrl);
		proxy.setSslProxy(ProxyServerUrl);
		
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.setAcceptInsecureCerts(true);
		co.setProxy(proxy);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(co);
		api = new ClientApi(ZAP_PROXY_ADD,ZAP_PROXY_PORT,ZAP_API_KEY);
	}
	@SuppressWarnings("deprecation")
	@Test
	public void delhiverySecurityTest() {
		driver.get("https://constellation-dev.delhivery.com/manage/vendor-site-codes");
		/*driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Login with username")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("qahq");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Hq@123123123");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[contains(@class,'m-b-0 pull-right btn btn-red btn-lg btn-block password-signin-btn')]")).click();
		*/
	}
	
	@AfterMethod
	public void tearDown() {
		if(api!=null) {
			String title = "Delhivery_ZAP_Security_Report";
			String template = "traditional-html";
			String description = "ZAP Security Report";
			String reportfilename = "delhivery-zap-report.html";
			String targetfolder = System.getProperty("user.dir");
			try {
				ApiResponse response =api.reports.generate(title, template, null, description, null, null, null, null, null, reportfilename, null, targetfolder, null);
			    System.out.println("ZAP REPORT :"+response.toString());
			} catch (ClientApiException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		driver.quit();
	}
	
	
	
	
}
