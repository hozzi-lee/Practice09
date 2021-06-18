package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<Goods> gList = new ArrayList<Goods>();
		while (true) {
			String goods = scan.nextLine();
			if ( goods.equals("q") ) {
				System.out.println("입력완료");
				System.out.println("==============================");
				for ( Goods gg : gList ) {
					gg.showInfo();
				}
				System.out.println("모든 상품의 개수는 " + Goods.allCount() + "개입니다.");
				break;
			}
			String[] goodsArray = goods.split(",");
			int price = Integer.parseInt(goodsArray[1]);
			int count = Integer.parseInt(goodsArray[2]);
			Goods g = new Goods(goodsArray[0], price, count);
			gList.add(g);
		}

		scan.close();

	}

}
