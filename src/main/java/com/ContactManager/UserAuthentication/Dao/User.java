package com.ContactManager.UserAuthentication.Dao;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Getter
@Setter
@Document(collation = "user_registration_details")
public class User {

    @Id
    private int userId;

    @Field(value = "first_name")
    private String firstName;

    @Field(value = "last_name")
    private String lastName;

    @Field(value = "contact_number")
    private String contactNumber;

    @Field(value = "email")
    private String email;

    @Field(value = "date_of_birth")
    private Date dateOfBirth;

    @Field(value = "gender")
    private String gender;

    @Field(value = "profile_image")
    private ProfileImage profileImage;

    @Field(value = "password")
    private String password;
}
