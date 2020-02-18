package com.testFramework.f13works.uatProductPro.helper.frame;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.testFramework.f13works.uatProductPro.helper.logger.LoggerHelper;
import com.testFramework.f13works.uatProductPro.helper.wait.WaitHelper;

public class FrameHelper {
	
	private WebDriver driver;
	private Logger log = LoggerHelper.getLogger(WaitHelper.class);
	
	public FrameHelper(WebDriver driver ){
		this.driver = driver;
	}
	
	/**
	 * This method will swithcToFrame base on frameIndex
	 * @param frameIndex
	 */
	public void swithcToFrame(int frameIndex) {
		driver.switchTo().frame(frameIndex);
		log.info("switch to :"+frameIndex+" frame");
	}
	
	/**
	 * This method will swithcToFrame base on frameName
	 * @param frameIndex
	 */
	public void swithcToFrame(String frameName) {
		driver.switchTo().frame(frameName);
		log.info("switch to :"+frameName+" frame");
	}
	
	/**
	 * This method will swithcToFrame base on frame WebElement
	 * @param frameIndex
	 */
	public void swithcToFrame(WebElement element) {
		driver.switchTo().frame(element);
		log.info("switch to frame"+element.toString());
	}
	
	
	

}
