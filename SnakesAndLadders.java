package com.snakesandladder;

public class SnakesAndLadders {
	public static void main(String[] args) {
		int player1=0;
		while(player1<100) {
			int dice=(int) Math.floor(Math.random()*6+1);
			int option=(int) Math.floor(Math.random()*2);
			int temp=player1;
			switch(option) {
			case 0:
				//Ladder-play
				player1=player1+dice;
				break;
			case 1:
				//Snake-play
				player1=player1-dice;
				break;
			default:
				//no-play
				break;
			}
			if(player1>100) {
				player1=temp;
			}
		}
		System.out.println(player1);
	}
}
