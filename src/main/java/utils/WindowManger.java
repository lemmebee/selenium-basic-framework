package utils;

import org.openqa.selenium.WebDriver;

public class WindowManger {
    private WebDriver driver;
    private WebDriver.Navigation navigate;

    public WindowManger(WebDriver driver){
        this.driver = driver;
        navigate = driver.navigate();
    }
    public void goBack(){
        navigate.back();
    }
    public void goForward(){
        navigate.forward();
    }
    public void refreshPage(){
        navigate.refresh();
    }
    public void goTo(String url){
        navigate.to(url);
    }
    public void switchToTab(String tabTitle){
        var windows = driver.getWindowHandles();
        // Print out list of window handels
        windows.forEach(System.out::println);
        for(String window : windows){
            driver.switchTo().window(window);
            if(tabTitle.equals((driver.getTitle()))){
                break;
            }
        }
    }
}