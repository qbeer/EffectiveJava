package qbeer.github.io;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {

    public enum Topping {HAM, MUSHROOM, MOZZARELLA, ANCHOVY, CORN, PINEAPPLE};
    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }
        abstract Pizza build();
        protected abstract T self(); // protected so only
    }

    public Pizza(Builder<?> builder){
        toppings = builder.toppings.clone();
    }

}