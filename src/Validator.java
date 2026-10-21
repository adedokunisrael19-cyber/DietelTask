public class Validator {

    public static boolean isEmailValid(String email){
        if(email == null){
            return false;
        }
        String regex = "^[\\w.]+@[\\w-]+\\.[\\w.]+$";
        return email.matches(regex);
    }

    public static boolean passwordValidator(String password){
        if(password == null){
            return false;
        }
//        String pass= "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#_+])\\s{8,16}";
        String pass= "^(?=.*\\d)(?=.*[@#_+])\\S{8,16}$";
        return  password.matches(pass);
    }

    public static void main(String[] args) {
        String email = "p.nwakor@native.semicolon.africa";

        System.out.println(Validator.isEmailValid(email));
    }
}


//
//        import java.util.regex.Pattern;
//
//public class EmailValidator {
//    private static final String REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
//
//    public static boolean validateEmail(String email) {
//        return Pattern.compile(REGEX).matcher(email).matches();
//    }
//}
