package test;

import java.util.*;
public class eightBall{
    public static void main(String[] args){
        Random rand = new Random();
        Scanner read = new Scanner(System.in);
        
            System.out.println("Ask a question: ");
            String x = read.nextLine();
             
           while(true) {
            	   int n = rand.nextInt(20) + 1;
            	   
           if(n==1)
                System.out.println("It is certain");
                
           else if(n==2)
                System.out.println("It is decidedly so");
                
           else if (n==3)
                System.out.println("Without a doubt");
                     
           else if (n==4)
			    System.out.println("Yes, definitely");
			
			else if(n==5) 
				System.out.println("You may rely on it");
			
			else if(n==6) 
				System.out.println("As I see it, yes");
			
			else if(n==7) 
				System.out.println("Most likely");
			
			else if(n==8) 
				System.out.println("Outlook good");
			
			else if(n==9) 
				System.out.println("Yes");
                
			else if(n==10) 
				System.out.println("Signs point to yes");
			
			else if(n==11)
            System.out.println("Reply hazy try again");
            
            else if(n==12)
            System.out.println("Ask again later");
            
            else if(n==13) 
				System.out.println("Better not tell you now");
			
			
			else if(n==14)
				System.out.println("Cannot predict now");
			
			
			else if(n==15) 
				System.out.println("Concentrate and ask again");
			
			
			else if(n==16) 
				System.out.println("Don't count on it ");
			
			
			else if(n==17) 
				System.out.println("My reply is no");
			
			
			else if(n==18) 
				System.out.println("My sources say no");
			
			
			else if(n==19) 
				System.out.println("Outlook no so good");
			
			
			else if(n==20) 
				System.out.println("Very doubtful");
           
			
        System.out.println("Ask another question? If you do not want to, press N");
        String y = read.nextLine();
        if(y.equals("N")){
            break;
        }
          }
           
              
        }
        
    }
