package com.example.Portfolio.entity;

public class Contact {

    private int id;
    private String name;
    private String email;
    private String messages;

    private String subject;

    public Contact() {
    }

    public Contact(String name, String email, String messages, String subject) {
        this.name = name;
        this.email = email;
        this.messages = messages;
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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


    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
