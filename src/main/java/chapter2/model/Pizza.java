package chapter2.model;


public abstract class Pizza {

    private String size = "m";
    private boolean isCheesy = false;
    private String toppingType = "Fresh Pan";


    /**
     * this builder class is written in generic way since we have done T extends Builder<T>
     * so that only Builder class types can we passed
     *
     * @param <T>
     */
    abstract static class Builder<T extends Builder<T>> {

        private String size = "m";
        private boolean isCheesy = false;
        private String toppingType = "Fresh Pan";

        public T size(String value) {
            size = value;
            return self();
        }

        public T isCheesy(boolean value) {
            isCheesy = value;
            return self();
        }

        public T toppingType(String value) {
            toppingType = value;
            return self();
        }

        abstract T self();

        abstract Pizza build();
    }

     Pizza(Builder<?> builder) {
        size = builder.size;
        isCheesy = builder.isCheesy;
        toppingType = builder.toppingType;
    }
}