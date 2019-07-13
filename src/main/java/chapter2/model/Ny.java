package chapter2.model;

public class Ny extends Pizza {

    private boolean isParcel = false;

    private Ny(Builder builder) {
        super(builder);
    }

    public static class Builder extends Pizza.Builder<Builder> {
        private boolean isParcel = false;


        @Override
        Ny build() {
            return new Ny(this);
        }

        @Override
        protected Builder self() {
            return this;
        }

        public Builder isParcel(boolean value) {
            isParcel=value;
            return this;
        }
    }

    public static void main(String[] args) {

        Ny pizza=new Builder().isParcel(true).size("medium").toppingType("freshPan").isParcel(true).build();
        System.out.println(pizza.isParcel);
    }
}