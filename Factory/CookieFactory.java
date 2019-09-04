public abstract class CookieFactory implements Factory{

    public static Factory getCookie(String cookieName) {
		
		if (cookieName.equals("Biscotti")) {
			Factory biscotti = new Biscotti();
			biscotti.createCookie("Biscotti");
			biscotti.getRecipe();
		}
		
		if (cookieName.equals("Brownie")) {
			Factory brownie = new Brownie();
			brownie.createCookie("Brownie");
			brownie.getRecipe();
		}
		
		if (cookieName.equals("Macaroon")) {
			Factory macaroon = new Macaroon();
			macaroon.createCookie("Macaroon");
			macaroon.getRecipe();
		}
		
		return null;
	}
}