public class User {
    public String userId;
    public String name;

    public User (String userId, String name){
        this.userId = userId;
        this.name = name;
    }

    public User() {

    }

    public void printUserDetails () {
        this.userId = userId;
        this.name = name;
        System.out.println("User's ID: " + userId);
        System.out.println("User's Name: " + name);
    }

}
