public class ChocolateChipDecorator extends CookieDecorator{

    public ChocolateChipDecorator(BakeCookies newCookie) {
        super(newCookie);
    }
    @Override
    public String prepareCookies(){
        return super.prepareCookies() + "Chocolate Chip Cookies are ready and they cost: ";
    }
    @Override
    public double cookiePrice(){
        return super.cookiePrice() + 1.5;
    }
    
}