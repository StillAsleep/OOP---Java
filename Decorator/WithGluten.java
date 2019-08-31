public class WithGluten implements BakeCookies{
    @Override
    public String prepareCookies(){
        return "Regular ";
    }
    @Override
    public double cookiePrice(){
        return 2.0;
    }
}