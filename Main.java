public class Main {

    public static void main(String[] args) {
        var user1 = new User(2, "Rishabh Rawat", "abc");
        System.out.println(user1);

        System.out.println("###############################################################################");

        var user2 = new User("V3NOM");
        System.out.println(user2);

        System.out.println("###############################################################################");

        var user3 = new User("V3NOM");
        user3.instanceMethod();
        User.classMethod();
    }

}