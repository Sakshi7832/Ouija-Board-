//You can add more features according to your wish.

package Random_Practice;

import java.util.*;

class Ouija_Board
{
public static void main(String args[])
{
while(true)
{
Scanner sc = new Scanner(System.in);
Random random = new Random();

System.out.println("Ask question:- ");
String user = sc.nextLine();
String[] responses1 = {"I am with you ","I am here ","I am behind you"};
String[] responses2 = {"Amelia","Emma","Charlotte","Evelyn","Scarlett","Ella","Chloe","Lily","Jack","Oliver","James","Joseph","George"};
String[] responses3 = {"I live in cemetery","I live in your house"};
String[] responses4 = {"Yes","No","May be"};
String[] responses5 = {"Yes","May be","Yes, I will kill you if you don't do my work"};
String[] responses6 = {"No, I am devil","I am evil","I am demon","No, I am ghost","No"};
String[] responses7 = {"You will die after 3 days","You will die after 10 days","You will die after 1 month","You will die after 4 months","You will die after 1 year"};
String[] responses8 = {"You have to find my dead body","You have to find my body in Winchester Myster House"};

if(user.equals("Is anyone here?") || user.equals("Are you here?") || user.equals ("Where are you?"))
{
System.out.println("The Ouija board says: " + responses1[random.nextInt(responses1.length)]);
}
else if(user.equals("What's your name?") || user.equals("What is your name?"))
{
    System.out.println("The Ouija board says: " + responses2[random.nextInt(responses2.length)]);
}
else if(user.equals("How old are you?")||user.equals("What is your age?"))
{
   int age = random.nextInt(1000);
    System.out.println("The Ouija board says: "+age);
}
else if(user.equals("Where are you from?"))
{
    System.out.println("The Ouija board says: " + responses3[random.nextInt(responses3.length)]);
}
else if(user.equals("Are you angry?"))
{
System.out.println("The Ouija board says: " + responses4[random.nextInt(responses4.length)]);
}
else if(user.equals("Are you kill me?"))
{
    System.out.println("The Ouija board says: " + responses5[random.nextInt(responses5.length)]);
}
else if(user.equals("Are you an angel?"))
{
    System.out.println("The Ouija board says: " + responses6[random.nextInt(responses6.length)]);
}
else if(user.equals("Do you have anything to tell me about my future?"))
{
    System.out.println("The Ouija board says: " + responses7[random.nextInt(responses7.length)]);
}
else if(user.equals("How can I help you?")|| user.equals("May, I help you?"))
{
    System.out.println("The Ouija board says: " + responses8[random.nextInt(responses8.length)]);
}
else if(user.equals("exit")||user.equals("bye")||user.equals("goodbye"))
{
    System.exit(0);
}
}}}