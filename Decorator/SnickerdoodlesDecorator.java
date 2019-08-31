public class SnickerdoodlesDecorator extends CookieDecorator{

    public SnickerdoodlesDecorator(BakeCookies newCookie) {
        super(newCookie);
    
    }
    @Override
    public String prepareCookies(){
        return super.prepareCookies() + "Snickerdoodle  Cookies are ready and they cost: ";
    }
    @Override
    public double cookiePrice(){
        return super.cookiePrice() + 1;
    }
}