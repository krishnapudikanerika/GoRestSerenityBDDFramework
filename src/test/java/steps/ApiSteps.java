package steps;

import api.UserService;
import constants.ApiConstants;
import io.restassured.response.Response;
import models.User;
import net.serenitybdd.annotations.Step;
import testdata.UserFactory;
import utils.LogUtils;
import utils.TestContext;
import validations.ResponseValidator;

public class ApiSteps {

    private final UserService userService =
            new UserService();

    private Response response;

    @Step
    public void createUser() {

        LogUtils.step("CREATE USER");

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

    @Step
    public void verifyUserCreated() {

        ResponseValidator.validateStatusCode(
                response,
                ApiConstants.SUCCESS_CREATE
        );

        ResponseValidator.validateUserId(
                response
        );

        ResponseValidator.validateUserName(
                response,
                TestContext.userName
        );

        ResponseValidator.validateUserEmail(
                response,
                TestContext.userEmail
        );
    }

    @Step
    public void getUser() {

        LogUtils.step(
                "GET USER : "
                        + TestContext.userId
        );

        response =
                userService.getUser(
                        TestContext.userId
                );
    }

    @Step
    public void verifyUserRetrieved() {

        ResponseValidator.validateStatusCode(
                response,
                ApiConstants.SUCCESS_GET
        );

        ResponseValidator.validateUserName(
                response,
                TestContext.userName
        );
    }

    @Step
    public void updateUser() {

        LogUtils.step("UPDATE USER");

        User updatedUser =
                UserFactory.createUser();

        TestContext.updatedUserName =
                ApiConstants.UPDATED_USER_NAME;

        updatedUser.setName(
                TestContext.updatedUserName
        );

        response =
                userService.updateUser(
                        TestContext.userId,
                        updatedUser
                );
    }

    @Step
    public void verifyUserUpdated() {

        ResponseValidator.validateStatusCode(
                response,
                ApiConstants.SUCCESS_UPDATE
        );

        ResponseValidator.validateUserName(
                response,
                TestContext.updatedUserName
        );
    }

    @Step
    public void deleteUser() {

        LogUtils.step("DELETE USER");

        response =
                userService.deleteUser(
                        TestContext.userId
                );
    }

    @Step
    public void verifyUserDeleted() {

        ResponseValidator.validateStatusCode(
                response,
                ApiConstants.SUCCESS_DELETE
        );
    }

    public Response getResponse() {
        return response;
    }
}