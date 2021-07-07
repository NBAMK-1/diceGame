package projects5;

import java.util.Random;

class Program {
    public static void six(){
        System.out.print("---------\n| * * |\n| * * |\n| * * |\n-------- ");
    }
    public static void five(){
        System.out.print("---------\n| * * |\n|  *  |\n| * * |\n-------- ");
    }
    public static void four(){
        System.out.print("---------\n| * * |\n|     |\n| * * |\n-------- ");
    }
    public static void three(){
        System.out.print("---------\n|  *  |\n|  *  |\n|  *  |\n-------- ");
    }
    public static void two(){
        System.out.print("---------\n|  *  |\n|     |\n|  *  |\n-------- ");
    }
    public static void one(){
        System.out.print("---------\n|     |\n|  *  | \n|     |\n-------- ");
    }
}

public class Main {

    public static void main(String[] args) {
        int you = random();
        int computer = random();

        System.out.println("you");
        switch(you){
            case 1: Program.one(); break;
            case 2: Program.two(); break;
            case 3: Program.three(); break;
            case 4: Program.four(); break;
            case 5: Program.five(); break;
            case 6: Program.six(); break;
        }
        System.out.println("\n");
        System.out.println("computer");
        switch(computer){
            case 1: Program.one(); break;
            case 2: Program.two(); break;
            case 3: Program.three(); break;
            case 4: Program.four(); break;
            case 5: Program.five(); break;
            case 6: Program.six(); break;
        }

        if(you > computer){
            System.out.println("\n Lucky! you won.\n Don't forget like :)");
        }
        if(computer > you){
            System.out.println("\n You lost.\n tap run button till you won:)");
        }
        if(you == computer){
            System.out.println("\n Draw.\n Click run button again:)");
        }

    }

    private static int random() {
        Random r = new Random();
        int a = r.nextInt(6)+ 1;
        return a;
    }
}
