package org.example;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
@Builder
public class User {
    private Long id;
    private String name;
    private RegistrationStatus status;
    private List<String> tokens;
    private Instant createdAt;
}
