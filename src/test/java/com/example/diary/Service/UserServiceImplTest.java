package Service;

import Data.Dtos.Request.CreateUserRequest;
import Data.Dtos.Response.CreateUserResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


class UserServiceImplTest {

    @Autowired
    private UserService userService;
    private CreateUserRequest createUserRequest;

    @BeforeEach
    void setUp() {
        createUserRequest = new CreateUserRequest();
    }
    @Test
    void Test_ThatUserCanBeCreated(){
        createUserRequest.setFirstName("Egusi");
        createUserRequest.setLastName("Emmaunel");
        createUserRequest.setPhoneNumber("09086473282");
        createUserRequest.setEmail("money@gmail.com");
        createUserRequest.setPassWord("[Egusi#87]");

        assertNotNull(createUserRequest);
        CreateUserResponse createUserResponse = userService.createUser(createUserRequest);
        assertEquals("user created successfully", createUserResponse.getMessage());


    }


}