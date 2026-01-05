package com.linkedlist.singlylinkedlist.social_media_friend;

public class Main {
	    public static void main(String[] args) {

	        SocialMediaList sm = new SocialMediaList();

	        sm.addUser(1, "Alice", 22);
	        sm.addUser(2, "Bob", 23);
	        sm.addUser(3, "Charlie", 21);
	        sm.addUser(4, "David", 24);

	        sm.addFriend(1, 2);
	        sm.addFriend(1, 3);
	        sm.addFriend(2, 3);
	        sm.addFriend(2, 4);

	        sm.displayFriends(1);
	        sm.displayFriends(2);

	        sm.mutualFriends(1, 2);

	        sm.searchByName("Charlie");

	        sm.countFriends();

	        sm.removeFriend(1, 3);
	        sm.displayFriends(1);
	    }
	}


