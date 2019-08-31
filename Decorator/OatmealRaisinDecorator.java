public class OatmealRaisinDecorator extends CookieDecorator{

    public OatmealRaisinDecorator(BakeCookies newCookie) {
        super(newCookie);
    }
    @Override
    public String prepareCookies(){
        return super.prepareCookies() + "Oatmeal Raisin  Cookies are ready and they cost: ";
    }
    @Override
    public double cookiePrice(){
        return super.cookiePrice() + 0.35;
    }
    
}