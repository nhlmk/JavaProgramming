package week14.BrowserInheritance;

public class CartPage extends AmazonHomepage{


    public String buyerInfo;

    public CartPage(String name, String buyerInfo){
        super(name);
        this.buyerInfo=buyerInfo;
    }

    public void fillInfo(){
        System.out.println("filling the necessary fields with " +  buyerInfo);
    }

    public void payFor(long cardNumber){
        System.out.println("Paying with credit card " + cardNumber);
    }

}
