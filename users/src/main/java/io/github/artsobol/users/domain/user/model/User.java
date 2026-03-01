package io.github.artsobol.users.domain.user.model;

import io.github.artsobol.users.domain.user.exception.ValidationException;

public class User {

    private final Long userId;
    private final Long telegramId;
    private String username;
    private String firstName;
    private String lastName;
    private LanguageCode languageCode;
    private final Role role;

    public User(
            Long userId,
            Long telegramId,
            String username,
            String firstName,
            String lastName,
            LanguageCode languageCode,
            Role role
    ) {
        this.userId = userId;
        this.telegramId = telegramId;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.languageCode = languageCode;
        this.role = role;
    }

    public void changeUsername(String username) {
        this.username = username;
    }

    public void changeFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void changeLastName(String lastName) {
        this.lastName = lastName;
    }

    public void changeLanguageCode(LanguageCode languageCode) {
        if (languageCode == null) {
            throw new ValidationException("languageCode must not be null");
        }
        this.languageCode = languageCode;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getTelegramId() {
        return telegramId;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LanguageCode getLanguageCode() {
        return languageCode;
    }

    public Role getRole() {
        return role;
    }

    public static class Builder {
        private Long userId;
        private Long telegramId;
        private String username;
        private String firstName;
        private String lastName;
        private LanguageCode languageCode;
        private Role role;

        public Builder userId(Long userId) {
            this.userId = userId;
            return this;
        }

        public Builder telegramId(Long telegramId) {
            this.telegramId = telegramId;
            return this;
        }

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder languageCode(LanguageCode languageCode) {
            this.languageCode = languageCode;
            return this;
        }

        public Builder roles(Role role) {
            this.role = role;
            return this;
        }

        public User build() {
            return new User(userId, telegramId, username, firstName, lastName, languageCode, role);
        }
    }
}
