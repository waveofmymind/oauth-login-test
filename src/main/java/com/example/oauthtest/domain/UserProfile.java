package com.example.oauthtest.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
public class UserProfile {
    private final String oauthId;
    private final String name;
    private final String email;
    private final String imageUrl;



    public Member toMember() {
        return new Member(oauthId, name, email, imageUrl, Role.USER);
    }

    public String getOauthId() {
        return oauthId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}