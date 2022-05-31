package week14.BrowserInheritance;

public class ProductPage extends  AmazonHomepage{

    public int quantity;

    public ProductPage(String name, int quantity){
        super(name);
        this.quantity=quantity;
    }

    public void shopFor(String product){
        super.product=product;
        System.out.println("Automating " + getName());
        System.out.println("adding " + quantity + " amount of " + super.product);

    }


}
