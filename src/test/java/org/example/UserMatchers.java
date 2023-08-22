package org.example;

import lombok.experimental.UtilityClass;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.IsNull.notNullValue;

@UtilityClass
public class UserMatchers {
    public static UserMatcher createdUser() {
        return UserMatcher.isUser()
                .withId(notNullValue())
                .withName(notNullValue())
                .withCreatedAt(notNullValue())
                .withStatus(RegistrationStatus.CREATED)
                .withTokens(emptyIterable());
    }

    public static UserMatcher verifiedUser() {
        return createdUser()
                .withStatus(RegistrationStatus.VERIFIED);
    }


    public static UserMatcher activeUser() {
        return verifiedUser()
                .withStatus(RegistrationStatus.ACTIVE)
                .withTokens(hasSize(1));
    }
}
