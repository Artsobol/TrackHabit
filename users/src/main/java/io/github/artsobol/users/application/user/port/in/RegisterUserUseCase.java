package io.github.artsobol.users.application.user.port.in;

import io.github.artsobol.users.application.user.dto.request.RegisterUserRequest;

public interface RegisterUserUseCase {
    void register(RegisterUserRequest request);
}
