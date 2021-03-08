package academy.belhard;

import academy.belhard.entity.Person;
import academy.belhard.entity.User;

public class Main {

    public static void main(String[] args) {

        Person user1 = new Person( "Боцура" , "Катя");
        System.out.println(user1.getFullName());
        System.out.println();


        User user2 = new User("Иванов" , "Иван ", "ivan347@tut.by", "123456");
        System.out.println(user2.getFullInfo());
        System.out.println();

        System.out.println(user2.isPasswordCorrect("987654"));

        System.out.println(user2.isPasswordCorrect("123456"));
    }
}