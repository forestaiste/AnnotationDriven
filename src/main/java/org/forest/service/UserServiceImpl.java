package org.forest.service;

import org.forest.interfaces.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {


    public static final String LAST_NAME = "san";
    private String firstName;
    private String nickName;

    public void say() {
        System.out.println("username is mike");

        validate();
        loadFromDb();
        getFullName(LAST_NAME, this.firstName);
    }

    private void loadFromDb() {
        getFullName(LAST_NAME, this.firstName);
        getFullName(LAST_NAME, this.firstName);
        getFullName(LAST_NAME, this.firstName);
    }

    private void validate() {
        getFullName(LAST_NAME, this.firstName);
        getFullName(LAST_NAME, this.firstName);
    }

    private String getFullName(String lastName, String firstName) {
        String fullName = firstName + ", " + lastName;

        return fullName;
    }

    public String getFirstName(List<String> names) {
        for (String name : names) {
            if (name != null) {

            }

            if (name == null) {

            }

            try {
                loadFromDb();
            } catch (Exception e) {
                e.printStackTrace();
            }


        }
        return firstName;
    }

    public void setNickName(String nickName, boolean hasNickName) {
        this.nickName = nickName;

        if (hasNickName(nickName)) {

        }
    }

    public boolean hasNickName(String nickName) {
        return nickName.length() > 0;
    }
}
