public class Brownie implements Factory {

    @Override
    public void createCookie(String Brownie) {
        System.out.println("Here is the Brownie Recipe: ");
    }

    @Override
    public void getRecipe() {
        System.out.println("1. Preheat oven to 350 degrees F (175 degrees C). Grease and flour an 8-inch square pan.");
        System.out.println(
                "2. In a large saucepan, melt 1/2 cup butter. Remove from heat, and stir in sugar, eggs, and 1 teaspoon vanilla. Beat in 1/3 cup cocoa, 1/2 cup flour, salt, and baking powder. Spread batter into prepared pan.");
        System.out.println("3. Bake in preheated oven for 25 to 30 minutes. Do not overcook.");
        System.out.println(
                "4. To Make Frosting: Combine 3 tablespoons softened butter, 3 tablespoons cocoa, honey, 1 teaspoon vanilla extract, and 1 cup confectioners' sugar. Stir until smooth. Frost brownies while they are still warm.");

    }
}