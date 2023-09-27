package com.ContactManager.UserAuthentication.Dao;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collation = "profile_image")
public class ProfileImage {

    @Id
    private int id;
    private String title;
    private Binary image;
}
