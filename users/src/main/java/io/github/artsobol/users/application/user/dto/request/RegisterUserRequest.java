package io.github.artsobol.users.application.user.dto.request;

import io.github.artsobol.users.domain.user.model.LanguageCode;

public record RegisterUserRequest(
        Long telegramId, String username, String firstName, String lastName, LanguageCode languageCode
) {
}
