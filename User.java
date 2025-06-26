public class User{
    private static Long uidCounter = 201L;
    private Long uid;
    private String name;
    private String email;

    public User(String name, String email){
        this.uid = uidCounter++;
        this.name = name;
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    @Override
    public String toString() {
        return "[" + uid + "] " + name + " (" + email + ")";
    }
}