package com.snakesandladder;

public class SnakesAndLadders {
	public static void main(String[] args) {
		int player1=0;
		int rolls=0;
		while(player1<100) {
			int dice=(int) Math.floor(Math.random()*6+1);
			int option=(int) Math.floor(Math.random()*2);
			int temp=player1;
			switch(option) {
			case 0:
				//Ladder-play
				player1=player1+dice;
				System.out.println("player1 position="+player1);
				break;
			case 1:
				//Snake-play
				player1=player1-dice;
				System.out.println("player1 position="+player1);
				break;
			default:
				//no-play
				System.out.println("player1 position="+player1);
				break;
			}
			if(player1<0) {
				player1=0;
			}
			if(player1>100) {
				player1=temp;
			}
			rolls++;
		}
		System.out.println("Number of rolls required to win the game="+rolls);
		System.out.println("final position="+player1);
	}
}
