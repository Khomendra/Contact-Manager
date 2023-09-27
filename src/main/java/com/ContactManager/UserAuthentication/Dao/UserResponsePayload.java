package com.ContactManager.UserAuthentication.Dao;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.annotation.Collation;

import java.util.Date;

@Data
public class UserResponsePayload {

    @JsonProperty(value = "first_name")
    private String firstName;

    @JsonProperty(value = "last_name")
    private String lastName;

    @JsonProperty(value = "contact_number")
    private String contactNumber;

    @JsonProperty(value = "email")
    private String email;

    @JsonProperty(value = "date_of_birth")
    private Date dateOfBirth;

    @JsonProperty(value = "gender")
    private String gender;

    @JsonProperty(value = "profile_image")
    private ProfileImage profileImage;

    @JsonProperty(value = "password")
    private String password;
}
