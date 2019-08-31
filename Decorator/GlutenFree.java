public class GlutenFree implements BakeCookies{
    @Override
    public String prepareCookies(){
        return "Gluten-free ";
    }
    @Override
    public double cookiePrice(){
        return 4.0;
    }
}