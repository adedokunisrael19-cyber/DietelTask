import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @Test
    public void testThatEmailIsValid() {
        String regex = "p.nwakor@native.semicolon.africa";
        assertTrue(Validator.isEmailValid(regex));
    }

    @Test
    public void testThatEmailValid() {
        String regex = "m.nwakor@native.semicolon.africa";
        assertTrue(Validator.isEmailValid(regex));
    }

    @Test
    public void testForNull(){
        String regex = null;
        assertFalse(Validator.isEmailValid(regex));
    }

    @Test
    public void testThatEmailIsInvalid(){
        String regex = "nmadixgmail.com";
        assertFalse(Validator.isEmailValid(regex));
    }

    @Test
    public void testThatEmailIsInvalid0(){
        String regex = "nmadix  gmail.com";
        assertFalse(Validator.isEmailValid(regex));
    }

    @Test
    public void testThatPasswordIsValid(){
        String password = "Password@1";
        assertTrue(Validator.passwordValidator(password));
    }

    @Test
    public void testThatPasswordValid(){
        String password = "password@1";
        assertTrue(Validator.passwordValidator(password));
    }

    @Test
    public void testThatPasswordisInValidIfDoesNotcontainSpecialCharacters(){
        String password = "password1";
        assertFalse(Validator.passwordValidator(password));
    }

    @Test
    public void testThatPasswordInValidIfDoesNotContainDigits(){
        String password = "password@";
        assertFalse(Validator.passwordValidator(password));
    }
    @Test
    public void testThatPasswordIsInvalidIfContainsSpace(){
        String password = "password  @1";
        assertFalse(Validator.passwordValidator(password));
    }
    @Test
    public void testThatPasswordIsInvalidIfNotUpTo8Characters(){
        String password = "pass@";
        assertFalse(Validator.passwordValidator(password));
    }

    @Test
    public void testThatPasswordIsInvalidIfMore16Characters(){
        String password = "passwordpassword@1";
        assertFalse(Validator.passwordValidator(password));
    }
}