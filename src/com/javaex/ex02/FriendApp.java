package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<Friend> fList = new ArrayList<Friend>();

		System.out.println("친구를 3명 등록해 주세요");
		for ( int i = 0; i < 3; i++ ) {
			String[] friendInfo = (scan.nextLine()).split(" ");
			String[] friendArray = new String[3];
			friendArray = friendInfo;
			Friend f = new Friend(friendArray[0], friendArray[1], friendArray[2]);
			fList.add(f);
		}

		for ( Friend f : fList ) {
			f.showInfo();
		}

		scan.close();

	}

}
