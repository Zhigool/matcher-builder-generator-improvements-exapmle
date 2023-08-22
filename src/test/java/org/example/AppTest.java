package org.example;

import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class AppTest {
    @Test
    public void test1() {
        User actualUser = User.builder()
                .id(0L)
                .name("username")
                .createdAt(Instant.now())
                .status(RegistrationStatus.ACTIVE)
                .tokens(List.of("23234243")).build();
        assertThat(actualUser, UserMatchers.activeUser());
    }
}
