package week14.BrowserInheritance;

import java.lang.reflect.WildcardType;

public class Browser {

    private String browserType;
    public static String operatingSystem = "Windows";

    public Browser(String name){
        browserType = name;
    }
    public String getName(){return browserType;}

    public void closeBrowser(){browserType=null;}

    public void setName(String name){
        if(browserType==null)
            this.browserType=name;
        else
            System.out.println("there is already an open browser.");
    }

    public static String getOSName(){return operatingSystem;}

}
