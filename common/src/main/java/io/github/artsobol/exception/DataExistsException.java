package io.github.artsobol.exception;

import java.util.Map;

public class DataExistsException extends BaseException {
    public DataExistsException(String messageKey, Object... args) {
        super(messageKey, messageKey, 409, Map.of(), null, args);
    }
}
