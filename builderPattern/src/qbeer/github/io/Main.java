package qbeer.github.io;

public class Main {

    public static void main(String[] args) {

        NYStylePizza nyStylePizza = new NYStylePizza.Builder(NYStylePizza.Size.MEDIUM)
                .addTopping(Pizza.Topping.MOZZARELLA)
                .addTopping(Pizza.Topping.HAM)
                .addTopping(Pizza.Topping.HAM)
                .build();

        Calzone calzone = new Calzone.Builder().addTopping(Pizza.Topping.MOZZARELLA)
                .sauceInside()
                .build();

        HungarianPizza hungarianPizza = new HungarianPizza.Builder()
                .addTopping(Pizza.Topping.HAM)
                .addTopping(Pizza.Topping.MUSHROOM)
                .withPaprika()
                .withSourCream()
                .thickness(HungarianPizza.Thickness.MEDIUM)
                .build();

        System.out.println(nyStylePizza);
        System.out.println(calzone);
        System.out.println(hungarianPizza);

    }
}
