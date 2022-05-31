package week14.BrowserInheritance;

public class AmazonHomepage extends Browser{

    public static String product;
    public AmazonHomepage(String name) {
        super(name);
    }

    public void navigate(String link){
        System.out.println("navigating to " + link + " using " + super.getName());
    }

    public void shopFor(String product){
        this.product=product;
        System.out.println("navigate to " + this.product+"'s page.          m");
    }

    @Override
    public String toString() {
        return "AmazonHomepage{" +
                "product='" + product + '\'' +
                '}';
    }
}
