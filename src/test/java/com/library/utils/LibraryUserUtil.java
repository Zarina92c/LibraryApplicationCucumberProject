package com.library.utils;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class LibraryUserUtil {
    public static Map<String,Object> createUser(int userGroup) {
        Faker faker = new Faker();
        String fullName = faker.name().fullName();
        String password = faker.number().digits(5);
        String usernameEmail = faker.name().username();
        String companyUrl = faker.company().url().substring(4);
        String email = usernameEmail + "@" + companyUrl;
        String address = faker.address().fullAddress();
        Map<String, Object> user = new HashMap<>();
        user.put("full_name", fullName);
        user.put("password", password);
        user.put("email", email);
        user.put("user_group_id", userGroup);
        user.put("status", "active");
        user.put("start_date", LocalDate.now().format(DateTimeFormatter.ofPattern("YYYY-mm-dd")));
        user.put("end_date", "2021-12-31");
        user.put("address", address);
        return user;

    }
}
