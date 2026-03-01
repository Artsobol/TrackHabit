package io.github.artsobol.users.infrastructure.config;

import io.github.artsobol.users.application.user.port.in.RegisterUserUseCase;
import io.github.artsobol.users.application.user.port.out.UserRepositoryPort;
import io.github.artsobol.users.application.user.usecase.RegisterUserInteractor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserUseCaseConfig {

    @Bean
    public RegisterUserUseCase registerUserUseCase(UserRepositoryPort userRepositoryPort) {
        return new RegisterUserInteractor(userRepositoryPort);
    }
}
