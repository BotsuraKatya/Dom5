package academy.belhard.entity;



public class User extends Person {



    private String email;
    private String password;

    public User(String firstName, String lastName, String email, String password){
        super(firstName, lastName);

        this.email =email;
        this.password = password;
    }

    public String getFullInfo() {

        return getFullName() +  "\n" + "E-mail:" + email;
    }

    public boolean  isPasswordCorrect(String password2){

        String str1 = password;
        String str2 = password2;

        return str1.equals(str2);
    }
}