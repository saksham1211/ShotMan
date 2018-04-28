package sakshamMyWorld;

import java.util.Scanner;

class Answers{
		String ans;
		String a1="mammals";
		String b1="fish";
		String a2="eyes";
		String b2="heart";
}

 class GenQues{
	
		String ques1= " Are dolphins fish or mammals?";
		String ques2=" Which body part stays the same size from when we are born until we die?";
}















public class ShotMan {
 
	
	
	
	public static void main(String[] args) {
		
		
		
		System.out.println("\t\t WELCOME TO THE SHOTMAN ");
		System.out.println("\n\n\t\t WHERE THE MAN DIES BECAUSE OF YOUR STUPIDITY : ");
		
		System.out.println("\n\n \t \tTYPE 'YES' TO ENTER INTO THE GAME ");
		String a;
		String output;
		Scanner input= new Scanner(System.in);
		
			a=input.next();
		
			if(a=="YES"||a=="yes");
			{
				GenQues obj1 =new GenQues();
				Answers obj2=new Answers();
				String b;
						System.out.println("HERE ARE THE RULES:-  "  );
						System.out.println("\n1. This is a word guessing game.");
						System.out.println("\n2. The questions will be based on general knowledge.");
						System.out.println("\n3. You will get only 1 chances to save the life of the man. As his ammo can only bear 1 shots. ");
						System.out.println("\n4. You can type your answer either in lowercase or in Uppercase, this doesn't really matters, but it should be correct.");
						System.out.println("\n5. Answer in one word only.");
						System.out.println("\n\n \t IF YOU KILL THE MAN, THEN YOUR GENERAL KNOWLEDGE SUCKS REALLY BAD. ");
						
						System.out.println("********************************************************************************************************************************");
						System.out.println("\n\n \t Type **start** in the console to begin the game:- ");
						
						b=input.next();
						
							if(b.equals("start")||b.equals("START"))
							{
								 
									System.out.println("QUES 1:- " + obj1.ques1);
									
									System.out.println("\nANS:-  ");
									obj2.ans=input.next();
									output=answer(obj2.ans);
									System.out.println("\n"+output);
									System.out.println("\n QUES 2:- "+ obj1.ques2);
									System.out.println("\nANS:-  ");
									obj2.ans=input.next();
									output=answer(obj2.ans);
									
							}
							else
							{
									System.out.println("WRONG INPUT");
							}
							
							
							
			}		
		
			input.close();
			
	}
	
		private static String answer (String ans)
		{
			int t=2;
			Answers obj2=new Answers();
			if(ans.equals(obj2.a1))
			{
				manstatus(t);
				return "GOOD JOB";
				
			}
			else if(ans.equals(obj2.b1))
				
			{
				t=1;
				manstatus(t);
				return "Shot fired";
				
				
			
			}
			
			if(ans.equals(obj2.a2))
			{
				manstatus(t);
				return "GOOD JOB";
			}
			
			else if(ans.equals(obj2.b2))
			{
				t=1;
				manstatus(t);
				return "Shot fired";
			}
				
			return null;
			
		
		
		}
		
		private static  void manstatus(int t)
		{
				if(t==2)
				{
					System.out.println(" +\"\"\"\"\"+ ");
			        System.out.println("[| o o |]");
			        System.out.println(" |  ^  | ");
			        System.out.println(" | '-' | ");
			        System.out.println(" +-----+ ");
				}
				else if(t==1)
				{
					String in;
					Scanner cin= new Scanner(System.in);
					System.out.println(" +\"\"\"\"\"+ ");
			        System.out.println("[| o o |]");
			        System.out.println(" | * * |");
			        System.out.println(" | --- | ");
			        System.out.println(" +-----+ ");
			        System.out.println("\n YOU JUST KILLED ME, MY BLOOD IS IN YOUR HANDS, STUPID CREATURE.");
			        
			        System.out.println("\n\n ** IF YOU ARE NOT A PUSSY **, TYPE 'try again', else TYPE 'I QUIT' ");
			        	in=cin.next();
			        	if(in.equals("try again")||in.equals("TRY AGAIN"))
			        	{
			        		main(null);
			        	}
			        	else if((in.equals("i quit")||in.equals("I QUIT")))
			        	{
			        			System.exit(0);
			        	}
			        	else
			        	{
			        		System.out.println("\n INVALID INPUT");
			        	}
			        cin.close();
				}
		}
}
