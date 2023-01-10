package interface2;

public class Complex implements Iuser{
    @Override
    public boolean checkuser(user user) {
        return true;
    }

    public boolean checkUser(user user){
        if (user.getAge() >= 18 && user.getName().startsWith("gi")){
            return true;
        }
        return false;
    }
}
