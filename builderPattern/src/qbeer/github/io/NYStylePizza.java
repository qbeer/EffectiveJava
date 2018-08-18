package qbeer.github.io;

import java.util.Objects;

public class NYStylePizza extends Pizza {

    public enum Size {SMALL, MEDIUM, BIG}
    private final Size size;

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override public NYStylePizza build() {
            return new NYStylePizza(this);
        }

        @Override protected Builder self() {
            return this;
        }
    }

    private NYStylePizza(Builder builder) {
        super(builder);
        this.size = builder.size;
    }

    @Override public String toString() {
        return "NYStylePizza=[size=" + size +",toppings=" + this.toppings.toString() + "]";
    }

}
