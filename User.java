record User(int id, String name, String password) {

    public User(String name, String password) {
        this(2, name, password);
    }

    public User(String name) {
        this(2, name, "hello");
    }

    public void instanceMethod() {
        System.out.println("Instance Method");
    }

    public static void classMethod() {
        System.out.println("Class Method");
    }

};
