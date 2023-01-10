package interface2;

public class SignUp {
    private Iuser iuser;

    public SignUp(Iuser iuser) {
        this.iuser = iuser;
    }

    public void singup(user user) {
        if (iuser.checkuser(user)) {
            System.out.println("kullanıcı kayıt oldu: " + user.getName());
        } else {

            System.out.println("kullanıcı kayıt olamadı");
        }
    }
}

