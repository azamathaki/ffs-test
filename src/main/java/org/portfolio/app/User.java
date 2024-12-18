package org.portfolio.app;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User {

    private int id;
    private String username;
    private String password;

    public User() {
    }

    public User(int id,String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }


    private Set<User> followers = new HashSet<>();

    private Set<User> followings = new HashSet<>();


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<User> getFollowers() {
        return followers;
    }

    public void setFollowers(Set<User> followers) {
        this.followers = followers;
    }

    public Set<User> getFollowings() {
        return followings;
    }

    public void setFollowings(Set<User> followings) {
        this.followings = followings;
    }

    // helper methods to set relationships between
    public void follow(User user){
        this.getFollowings().add(user);
        user.getFollowers().add(this);
    }

    public void unfollow(User user){
        this.getFollowings().remove(user);
        user.getFollowers().remove(this);
    }

}
