package dependency_injection;

public class main {
    static void main(String[] args) {
       User u=new User(new EmailSend());
       u.UserSend();

       // so here we create an object of email and inject it to User
        // User have not required to create an object User only focus in their business logic


    }
}
