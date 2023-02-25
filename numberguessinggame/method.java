package numberguessinggame;

import java.util.Scanner;

public class Method {
	
		Scanner sc=new Scanner(System.in);

	void run(){

			int random = (int)(1+Math.random() * 100);
			System.out.println("Random No:"+random); 


			int k=5;
			while(k>0) {
				System.out.println("Enter the guess:");
				int guess=sc.nextInt();
				if(guess==random) {
					System.out.println("You have guessed correct number!");
					break;
				}

				else if(guess<random) {
					System.out.println("Wrong Guess !! Guess number greater than previous one! ");
				}

				else if(guess>random){
					System.out.println("Wrong Guess !! Guess number lesser than previous one! ");
				}


				k--;
			System.out.println("You have "+k+" more attempts remaining to guess the number!!");

			}

			int count=k;
			switch(count) {
			case 5:
				System.out.println("Your Score is 100 !");
				break;
			case 4:
				System.out.println("Your Score is 80 ");
				break;
			case 3:
				System.out.println("Your Score is 60 ");
				break;
			case 2:
				System.out.println("Your Score is 40 ");
				break;
			case 1:
				System.out.println("Your Score is 20 ");
				break;
			default:
				System.out.println("Your Score is 0");


			   }
      }

	}

