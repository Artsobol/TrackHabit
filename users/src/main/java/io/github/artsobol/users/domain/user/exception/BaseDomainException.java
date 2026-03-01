package io.github.artsobol.users.domain.user.exception;

public class BaseDomainException extends RuntimeException {
    public BaseDomainException(String message) {
        super(message);
    }
}
