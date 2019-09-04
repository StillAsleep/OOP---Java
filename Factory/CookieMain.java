import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CookieMain {

    public static int number;

    public static void main(String[] args) throws NumberFormatException, IOException {
        do {
            // Print out menu and do logic while exit is not hit
            System.out.println("Welcome to the Cookie Recipe Book!\n");
            System.out.print("=============Cookies=============\n");
            System.out.print("1. Brownie.\n");
            System.out.print("2. Biscotti.\n");
            System.out.print("3. Macaroons.\n");
            System.out.print("4. Exit.\n");
            System.out.println("Please choose your recipe: \n");

            // Read input and store into variables
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            number = Integer.parseInt(reader.readLine());

            switch (number) {
            case 1:
                Factory cookie = CookieFactory.getCookie("Brownie");
                cookie.createCookie("Brownie");
                cookie.getRecipe();
                break;

            default:
                break;
            case 2:
                cookie = CookieFactory.getCookie("Biscotti");
                cookie.createCookie("Biscotti");
                cookie.getRecipe();

            case 3:
                cookie = CookieFactory.getCookie("Macaroon");
                cookie.createCookie("Macaroon");
                cookie.getRecipe();
            }
        } while (number != 5);

    }
}