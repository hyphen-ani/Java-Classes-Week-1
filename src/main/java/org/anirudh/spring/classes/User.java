package org.anirudh.spring.classes;

public class User {
    // properties
    private Long id;
    private String name;
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

// Bhai mere, User agar banayega toh yeh honi chahiye (or) User
// aisa dikhna chahiye, uske andar id, name, email honi chahiye