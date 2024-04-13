package org.example;

public class User {
    private String login,email;
    public User(String login, String email) {
       if(login !=null && login.length()>=5){ this.login = login;}
       if(email !=null && email.contains("@") && email.contains(".")){this.email = email;}
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }
    public void theEmail(String email){
        if(email !=null && email.contains("@") && email.contains(".")){this.email = email;}
    }
    public void theLogin(String login){
        if(login !=null && login.length()>=5){ this.login = login;}
    }
}
