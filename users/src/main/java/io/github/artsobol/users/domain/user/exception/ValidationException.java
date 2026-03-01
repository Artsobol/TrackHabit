package io.github.artsobol.users.domain.user.exception;

public class ValidationException extends BaseDomainException {
    public ValidationException(String message) {
        super(message);
    }
}
