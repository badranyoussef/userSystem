package userSystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserHandlerTest {

    @Test
    void isValidTooShort() {
        UserHandler userhandler = new UserHandler();
        String password = "1234";
        userhandler.isValid(password);
        assertEquals(false,userhandler.isValid(password)); //regner med: exptected false, fra det der kaldes
    }

    @Test
    void isValidLenght() {
        UserHandler userhandler = new UserHandler();
        String password = "12345678";
        userhandler.isValid(password);
        assertEquals(true,userhandler.isValid(password)); //regner med: exptected false, fra det der kaldes
    }
}