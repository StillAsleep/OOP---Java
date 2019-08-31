public abstract class CookieDecorator implements BakeCookies{
    private BakeCookies newCookie;
    
    public CookieDecorator(BakeCookies newCookie){
        this.newCookie=newCookie;
    }
    @Override
    public String prepareCookies(){ 
        return newCookie.prepareCookies();
    }
    @Override
    public double cookiePrice(){
        return newCookie.cookiePrice();
    }
}