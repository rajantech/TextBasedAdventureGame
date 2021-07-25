import java.util.Scanner;

public class mainExit extends middle {
    Scanner kb=new Scanner(System.in);

    /**
     *choice selected by the player has been stored in this variable
     */
    public int selection;


    /**
     *<p>
     *     player is in the main exit of the police station
     *     and he have have 3 options to take
     *
     *</p>
     */
    public void mainExitt()
    {
        System.out.println();
        System.out.println();
        System.out.println("You are at the Main Exit");
        System.out.println("A Police Officer is there And");
        System.out.println("You have Three Options as Following ");
        System.out.println("1: Talk to the Security Officer.");
        System.out.println("2: Fight with him to open the Gate");
        System.out.println("3: Leave the Main Exit Area");
        System.out.println();

        System.out.println("Please enter your choice");
        selection=kb.nextInt();

            if(selection==1)
            {
                System.out.println("Security: You can't go outside as your imprisonment sentence is not over. ");
                kb.nextLine();
                count++;
                mainExitt();

            }
            else if (selection==2)
            {
                if (playerHealth<=10)
                {
                    youThrashed();
                }
                else {
                    System.out.println("Security: you are doing offence and you will be punished");
                    System.out.println("you got beaten bu security person and");
                    playerHealth = (playerHealth - 15);
                    System.out.println("your health/power Reduces by 20 points and now is " + playerHealth);
                    kb.nextLine();
                    count++;
                    mainExitt();
                }
            }
            else if (selection==3)
            {

                System.out.println("you are now at the middle of police Station");
                count++;
              middleOfPoliceStation();
            }
            else
            {

                System.out.println(name+ " this choice is not available ,Please check choices again");
                mainExitt();
            }


    }
}
