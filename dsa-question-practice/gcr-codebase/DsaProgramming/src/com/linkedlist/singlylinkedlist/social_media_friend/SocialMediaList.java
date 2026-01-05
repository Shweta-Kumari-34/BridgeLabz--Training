package com.linkedlist.singlylinkedlist.social_media_friend;

public class SocialMediaList {

	class UserNode {
		int userId;
		String name;
		int age;
		int[] friends = new int[10]; 
		int friendCount = 0;
		UserNode next;

		UserNode(int id, String name, int age) {
			this.userId = id;
			this.name = name;
			this.age = age;
			this.next = null;
		}
	}

	UserNode head = null;

	void addUser(int id, String name, int age) {
		UserNode newUser = new UserNode(id, name, age);

		if (head == null) {
			head = newUser;
		} else {
			UserNode temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newUser;
		}
	}

	UserNode findUserById(int id) {
		UserNode temp = head;
		while (temp != null) {
			if (temp.userId == id)
				return temp;
			temp = temp.next;
		}
		return null;
	}


	void searchByName(String name) {
		UserNode temp = head;
		while (temp != null) {
			if (temp.name.equalsIgnoreCase(name)) {
				System.out.println("User Found: " + temp.name + " (ID: " + temp.userId + ")");
				return;
			}
			temp = temp.next;
		}
		System.out.println("User not found");
	}

	void addFriend(int id1, int id2) {
		UserNode u1 = findUserById(id1);
		UserNode u2 = findUserById(id2);

		if (u1 != null && u2 != null) {
			u1.friends[u1.friendCount++] = id2;
			u2.friends[u2.friendCount++] = id1;
			System.out.println("Friend connection added between " + id1 + " and " + id2);
		} else {
			System.out.println("User not found");
		}
	}

	void removeFriend(int id1, int id2) {
		UserNode u1 = findUserById(id1);
		UserNode u2 = findUserById(id2);

		if (u1 != null && u2 != null) {
			removeFromFriendList(u1, id2);
			removeFromFriendList(u2, id1);
			System.out.println("Friend connection removed");
		}
	}

	void removeFromFriendList(UserNode user, int id) {
		for (int i = 0; i < user.friendCount; i++) {
			if (user.friends[i] == id) {
				for (int j = i; j < user.friendCount - 1; j++) {
					user.friends[j] = user.friends[j + 1];
				}
				user.friendCount--;
				break;
			}
		}
	}

	void displayFriends(int id) {
		UserNode user = findUserById(id);
		if (user == null)
			return;

		System.out.print("Friends of " + user.name + ": ");
		for (int i = 0; i < user.friendCount; i++) {
			System.out.print(user.friends[i] + " ");
		}
		System.out.println();
	}

	void mutualFriends(int id1, int id2) {
		UserNode u1 = findUserById(id1);
		UserNode u2 = findUserById(id2);

		System.out.print("Mutual Friends: ");
		for (int i = 0; i < u1.friendCount; i++) {
			for (int j = 0; j < u2.friendCount; j++) {
				if (u1.friends[i] == u2.friends[j]) {
					System.out.print(u1.friends[i] + " ");
				}
			}
		}
		System.out.println();
	}

	void countFriends() {
		UserNode temp = head;
		while (temp != null) {
			System.out.println(temp.name + " has " + temp.friendCount + " friends");
			temp = temp.next;
		}
	}
}
