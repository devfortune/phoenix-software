package com.mfortune.softwarephoenix.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "phoenix_user")
@Data
public class PhoenixUser extends AbstractEntity {
    private String name;
    private String surname;
    private String patronymic;
    private String username;
    private String password;
    private String profileImageUrl;

}
