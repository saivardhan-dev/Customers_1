package com.mycompany.app;

public record CustomerRequest(
        String firstName,
        String lastName,
        String email
) {
}
