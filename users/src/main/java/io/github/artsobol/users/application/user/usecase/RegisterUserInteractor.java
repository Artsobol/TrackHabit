package io.github.artsobol.users.application.user.usecase;

import io.github.artsobol.users.application.user.dto.request.RegisterUserRequest;
import io.github.artsobol.users.application.user.port.in.RegisterUserUseCase;
import io.github.artsobol.users.application.user.port.out.UserRepositoryPort;
import io.github.artsobol.users.domain.user.model.User;

public class RegisterUserInteractor implements RegisterUserUseCase {

    private final UserRepositoryPort userRepository;

    public RegisterUserInteractor(UserRepositoryPort userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void register(RegisterUserRequest request) {
        if (userRepository.findByTelegramId(request.telegramId()).isPresent()) {
            return;
        }

        User user = new User.Builder().telegramId(request.telegramId())
                .username(request.username())
                .firstName(request.firstName())
                .lastName(request.lastName())
                .languageCode(request.languageCode())
                .build();
        userRepository.save(user);
    }
}
