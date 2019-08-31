public class SugarCookieDecorator extends CookieDecorator{

    public SugarCookieDecorator(BakeCookies newCookie) {
        super(newCookie);
    }
    @Override
    public String prepareCookies(){
        return super.prepareCookies() + "Sugar Cookies are ready and they cost: ";
    }
    @Override
    public double cookiePrice(){
        return super.cookiePrice() + 0.5;
    }
    
}