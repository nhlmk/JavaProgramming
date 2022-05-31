package week14.BrowserInheritance;

public class TestCase {
    public static void main(String[] args) {

        AmazonHomepage amazonHomepage = new AmazonHomepage("Chrome");

        System.out.println(" I am automating : " + amazonHomepage.getName());
        System.out.println("My operating system is : " + Browser.getOSName());

        amazonHomepage.navigate("www.amazon.com");
        amazonHomepage.navigate("Search for laptops.");
        amazonHomepage.navigate("Samsung PC");

        ProductPage productObject = new ProductPage("Chrome", 2);
        productObject.shopFor("Samsung PC");

        CartPage cartPage = new CartPage("Chrome", "Mike Smith");
        cartPage.fillInfo();
        cartPage.payFor(120012009L);
        cartPage.closeBrowser();
        cartPage.setName("Firefox");
        System.out.println(" I am automating : " + amazonHomepage.getName());


    }
}
