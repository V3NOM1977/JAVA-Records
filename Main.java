public class Main {

    /**
     * 1. Introduced in java 14.
     * 2. Used as data carring objects.
     * 3. Consist one or more data field with final litral.
     * 4. Auto generate getters, hashcode, equals, toString methods.
     * 5. Reords are final.
     * 6. Can have multi constructors.
     * 7. Can have instance and staic methods.
     * 8. Records are immutable in nature.
     * 
     * @param args
     */
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