package chapter2.model;

public class User {

    private final String name;
    private final String age;
    private final String gender;
    private final String address;

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    private User(UserBuilder userBuilder) {

        name = userBuilder.name;
        age = userBuilder.age;
        gender = userBuilder.gender;
        address = userBuilder.address;
    }

    public static class UserBuilder {

        private String name;
        private String age;
        private String gender;
        private String address;


        public UserBuilder name(String value) {
            name = value;
            return this;
        }

        public UserBuilder age(String value) {
            age = value;
            return this;
        }

        public UserBuilder gender(String value) {
            gender = value;
            return this;
        }

        public UserBuilder address(String value) {
            address = value;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }


    public static void main(String[] args) {

        User user = new UserBuilder().address("Bangalore").age("22").name("anmol").gender("Male").build();
        System.out.println(user.getAddress());


    }
}
