package steps;

import api.UserService;
import io.restassured.response.Response;
import models.User;
import net.serenitybdd.annotations.Step;
import org.junit.Assert;
import testdata.UserFactory;
import utils.Log;
import utils.LogUtils;
import utils.TestContext;
import validations.ResponseValidator;

public class ApiSteps {

    UserService userService = new UserService();

    Response response;


    @Step
    public void verifyUserCreated() {

        ResponseValidator.validateStatusCode(
                response,
                201);

        ResponseValidator.validateUserCreated(
                response,
                TestContext.userName,
                TestContext.userEmail);
    }

    @Step
    public void getUser() {

        response = userService.getUser(
                TestContext.userId
        );
    }

    @Step
    public void verifyUserRetrieved() {

        ResponseValidator.validateStatusCode(
                response,
                200);
    }

    @Step
    public void updateUser() {

        User user = UserFactory.createUser();

        user.setName("Updated Krishna");

        response = userService.updateUser(
                TestContext.userId,
                user
        );
    }

    @Step
    public void verifyUserUpdated() {

        ResponseValidator.validateStatusCode(
                response,
                200);
    }

    @Step
    public void deleteUser() {

        response = userService.deleteUser(
                TestContext.userId
        );
    }

    @Step
    public void verifyUserDeleted() {

        ResponseValidator.validateStatusCode(
                response,
                204);
    }

    @Step
    public void createUser() {

        LogUtils.step(
                "CREATE USER");

        User user =
                UserFactory.createUser();

        TestContext.userName =
                user.getName();

        TestContext.userEmail =
                user.getEmail();

        response =
                userService.createUser(user);

        TestContext.userId =
                response.jsonPath()
                        .getInt("id");
    }
}