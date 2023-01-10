package interface2;

public class AgeUser implements Iuser {
    @Override
    public boolean checkuser(user user) {

        if (user.getAge() >= 18 && user.getName().startsWith("gi")){
            return true;
        }
        return false;
    }
    }


