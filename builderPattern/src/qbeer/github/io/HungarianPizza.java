package qbeer.github.io;

import java.util.Objects;

public class HungarianPizza extends Pizza {

    private final boolean isWithPaprika;
    private final boolean isWithSourCream;
    public enum Thickness {THIN, MEDIUM, THICK}
    private final Thickness thickness;

    public static class Builder extends Pizza.Builder<Builder> {

        private boolean isWithPaprika = false;
        private boolean isWithSourCream = false;
        private Thickness thickness = Thickness.THICK;

        Builder withPaprika() {
            this.isWithPaprika = true;
            return this;
        }

        Builder withSourCream() {
            this.isWithSourCream = true;
            return this;
        }

        Builder thickness(Thickness thickness) {
            this.thickness = Objects.requireNonNull(thickness);
            return this;
        }

        @Override HungarianPizza build() {
            return new HungarianPizza(this);
        }

        @Override protected Builder self() {
            return this;
        }

    }

    private HungarianPizza(Builder builder) {
        super(builder);
        this.isWithPaprika = builder.isWithPaprika;
        this.isWithSourCream = builder.isWithSourCream;
        this.thickness = builder.thickness;
    }

    @Override public String toString() {
        return "HungarianPizza=[withPaprika=" + isWithPaprika + ",withSourCream=" + isWithSourCream +
                ",thickness=" + thickness.toString() + ",toppings=" + toppings.toString() + "]";
    }
}
