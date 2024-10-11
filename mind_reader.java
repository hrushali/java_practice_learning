package controlflow;
import java.util.Random;
import java.util.Scanner;

class player_A{
    int p_scr=0;
    int p_input;
String name;

    public void printdetails(String name){

        name = name;
        System.out.println("name of player:"+name);
        System.out.println("score of player:"+p_scr);
    }

}
class computer{
    int c_scr=0;
    int c_prad;
    public int pradiction(){
        Random r= new Random();
        return r.nextInt(2);
    }
    public void printdetails(){

       
        System.out.println("score of player:"+c_scr);
    }

}




public class mind_reader {
    public static void main(String[] args) {
        player_A p=new player_A();
        computer c=new computer();

        Scanner s= new Scanner(System.in);
        for(;;){
            System.out.println("enter your input:");
            p.p_input = s.nextInt();
            System.out.println("you entered:"+p.p_input);
            c.c_prad=s.nextInt();
            System.out.println("pradiction"+c.c_prad);
        
        if(p.p_input == c.c_prad){
           c.c_scr++;
        }
        else{
            p.p_scr++;
        }
        System.out.println("computer score "+c.c_scr );
        System.out.println("player :"+p.p_scr);

       
        
        if(c.c_scr==4){
            System.out.println("computer is winner");
        c.printdetails();

        }else if(p.p_scr==4){
            System.out.println("player is winner");
            p.printdetails("kattappa");
            break;

        }
    
    }
}
}
