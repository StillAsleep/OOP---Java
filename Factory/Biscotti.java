public class Biscotti implements Factory {

    @Override
    public void createCookie(String Biscotti) {
        System.out.println("Here is the Biscotti Recipe: ");
    }

    @Override
    public void getRecipe() {
        System.out.println("1. Preheat oven to 350 degrees F. Line a baking sheet with parchment paper.");
        System.out.println("2. Using an electric mixer, beat the butter and sugar together until creamy.");
        System.out.println(
                "3. Add the eggs and vanilla extract. If you would like to add almond extract or anise extract, add it now. Mix until well combined.");
        System.out.println(
                "4. In a medium bowl, whisk together the all purpose flour, white whole wheat flour, baking powder and salt.");
        System.out.println(
                "5. Add the flour mixture to the mixing bowl and mix on low speed until combined, scraping down the sides of the bowl as needed.");
        System.out.println(
                "6. Divide the dough in half. Shape each half into a ball and then use your hands to shape each ball into a log that is about 8 inches long.");
        System.out.println(
                "7. Place the logs on the prepared baking sheet. Use your hands to flatten the dough logs until they are about 3/4-inch thick. Gently press the sides and ends of the logs to even them out and flatten them.");
        System.out.println("8. If desired, sprinkle the logs with turbinado sugar.");
        System.out.println(
                "9. Bake for 20-25 minutes, until lightly golden and the center of the logs is almost firm and bounces back when touched.");
        System.out.println("10. Let the logs cool on the baking sheet for 30 minutes.");
        System.out.println(
                "11. Use a sharp knife to cut the logs into biscotti shape, on the diagonal. Press straight down with the knife, rather than sawing.");
        System.out.println(
                "12. Place the biscotti, cut side up, on the baking sheet. Bake for 12-16 more minutes, until dry. The centers of the cookies will be slightly soft and will crisp as they cool.");
        System.out.println(
                "13. Store biscotti in an airtight container at room temperature for 1-2 weeks or in the freezer for 3 months.");
    }
}