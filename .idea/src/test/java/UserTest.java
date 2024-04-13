import org.example.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class UserTest {

    @Test
    @DisplayName("Object")
    public void testUserParam() {
        //given
        User user = new User("LOGIN", "EMAIL@.com");
        assertNotNull(user);
    }
    @Test
    @DisplayName("NullObject")
    public void testUserNullParam(){
        User user = new User(null, null);
        assertNotNull(user);

    }
    @Test
    @DisplayName("Email")
    public void testUseremail(){
        User user = new User("LOGIN", "EMAILcom");
        assertNull(user.getEmail());
    }
    @Test
    @DisplayName("Login")
    public void testUserlogin(){
        User user = new User("why?", "EMAIL@.com");
        assertNull(user.getLogin());
    }
}

