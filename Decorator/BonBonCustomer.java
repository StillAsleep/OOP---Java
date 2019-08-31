import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BonBonCustomer {
    public static int number;
    public static int choice;

    public static void main(String[] args) throws NumberFormatException, IOException {
        do {
            // Print out menu and do logic while exit is not hit
            System.out.println("Welcome to Bon Bon Bakery!\n");
            System.out.print("=============Cookie Menu=============\n");
            System.out.print("1. Chocolate Chip Cookies.\n");
            System.out.print("2. Sugar Cookies.\n");
            System.out.print("3. Snickerdoodles.\n");
            System.out.print("4. Oatmeal Raisin Cookies.\n");
            System.out.print("5. Exit.\n");
            System.out.println("Please choose your order: \n");

            // Read input and store into variables
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            number = Integer.parseInt(reader.readLine());
            System.out.println("Would you like your order to be gluten-free?\n");
            System.out.print("1. No\n");
            System.out.print("2. Yes\n");
            choice = Integer.parseInt(reader.readLine());

            // Simple logic if-else within a do-while loop. Customer gets to choose his type
            // of cookie
            if (number == 1 && choice == 1) {
                BakeCookies cc = new ChocolateChipDecorator(new WithGluten());
                System.out.println(cc.prepareCookies());
                System.out.println(cc.cookiePrice());
                break;
            }

            else if (number == 2 && choice == 1) {

                BakeCookies sc = new SugarCookieDecorator(new WithGluten());
                System.out.println(sc.prepareCookies());
                System.out.println(sc.cookiePrice());
                break;
            }

            else if (number == 3 && choice == 1) {
                BakeCookies sd = new SnickerdoodlesDecorator(new WithGluten());
                System.out.println(sd.prepareCookies());
                System.out.println(sd.cookiePrice());
                break;
            }

            else if (number == 4 && choice == 1) {
                BakeCookies or = new OatmealRaisinDecorator(new WithGluten());
                System.out.println(or.prepareCookies());
                System.out.println(or.cookiePrice());
                break;
            }

            else if (number == 1 && choice == 2) {
                BakeCookies cc2 = new ChocolateChipDecorator(new GlutenFree());
                System.out.println(cc2.prepareCookies());
                System.out.println(cc2.cookiePrice());
                break;
            }

            else if (number == 2 && choice == 2) {
                BakeCookies sc2 = new SugarCookieDecorator(new GlutenFree());
                System.out.println(sc2.prepareCookies());
                System.out.println(sc2.cookiePrice());
                break;
            }

            else if (number == 3 && choice == 2) {
                BakeCookies sd2 = new SnickerdoodlesDecorator(new GlutenFree());
                System.out.println(sd2.prepareCookies());
                System.out.println(sd2.cookiePrice());
                break;
            }

            else if (number == 4 && choice == 2) {
                BakeCookies or2 = new OatmealRaisinDecorator(new GlutenFree());
                System.out.println(or2.prepareCookies());
                System.out.println(or2.cookiePrice());
                break;
            }

        } while (number != 5);  // As long as 5 is not hit, loop continues
    }
}