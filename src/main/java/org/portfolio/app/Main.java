package org.portfolio.app;

public class Main {
    public static void main(String[] args) {

        User john = new User(1,"john","j@123");
        User tom = new User(2,"tom","t@123");
        User simon = new User(3,"simon","s@123");
        User joe = new User(4,"joe","j@123");

        // john follows
        john.follow(joe);
        john.unfollow(joe);

        // johns' followers
        joe.follow(john);
        tom.follow(john);
        simon.follow(john);

        joe.unfollow(john);


        System.out.println("john's followings: ");
        for (User user: john.getFollowings()){
            System.out.println(user.getUsername());
        }
        System.out.println("And followers: ");
        for (User user: john.getFollowers()){
            System.out.println(user.getUsername());
        }

        System.out.println("---> success ending code 9");

    }
}
