package io.github.artsobol.exception;

import java.util.Map;

public class BaseException extends RuntimeException {

    private final String errorCode;
    private final String messageKey;
    private final int status;
    private final transient Map<String, Object> details;
    private final transient Object[] messageArgs;

    protected BaseException(
            String errorCode,
            String messageKey,
            int status,
            Map<String, Object> details,
            Throwable cause,
            Object... messageArgs
    ) {
        super(messageKey, cause);
        this.errorCode = errorCode;
        this.messageKey = messageKey;
        this.status = status;
        this.details = details == null ? Map.of() : Map.copyOf(details);
        this.messageArgs = messageArgs;
    }
}
