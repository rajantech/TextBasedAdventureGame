import java.util.Scanner;

public class destiny extends playerBioData {
    /**
     * This attribute indicate how much points has watchman reduced during the fight
     */
    int lossToWatchMan=0;
    Scanner kb=new Scanner(System.in);

    /**
     *The selected value has been stored in this attribute
     */
    public int selection2;

    /**
     * <p>
     *player has attacked the watchman and in this method either
     * watchman health will get reduce or the player depend upon the
     * weather player has weapon or not
     * </p>
     */
    public void attackStarted()
    {
        System.out.println("You Attcked The WatchMan");


        if (playerWeapon.equals("sharpWire"))
        {
lossToWatchMan=new java.util.Random().nextInt(20);
        }
        else if (playerWeapon.equals("Blade"))
    {
            lossToWatchMan=new java.util.Random().nextInt(30);

        }
       else  {
            System.out.println("You had Nothing as Weapon with You while fighting");
            System.out.println("HENCE");
            System.out.println();
            youThrashed();
        }



        System.out.println(name+" (You) Attacked the WatchMan and he his Power Reduces By "+lossToWatchMan);
        watchManHealth=watchManHealth-lossToWatchMan;
        System.out.println("Now the watchMan Health is = "+watchManHealth);
        if (watchManHealth<=0)
        {
            youWin();
        }
        else if (watchManHealth>0)
        {
            int lossToYou=0;
            lossToYou=new java.util.Random().nextInt(4);
            System.out.println("The WatchMan Attacked You And Your Health Reduces By "+lossToYou);
            playerHealth=playerHealth-lossToYou;
            System.out.println("Now , Your Health is = "+playerHealth);
            if (playerHealth<=0)
            {
                youThrashed();
            }
            else if(playerHealth>0) {
                attackStarted();
            }
        }

    }

    /**
     * <p>
     * Player has won the fight with watchman and by pressing
     *  1 now he can leave from the prison
     *  </p>
     */
    public void youWin()
    {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("You Finally killed the Watch Man and got the Fire Exit's Key ");
        System.out.println("Now , You Can only Go outside of the prison Department ");
        System.out.println("Press 1 For Opening the Fire Exit Door And Leave The Prison Station ");
        System.out.println();

        selection2=kb.nextInt();

        if (selection2==1)
        {
            count++;
            Success();
        }
    }

    /**
     *player has lost the fight with watchman
     */
    public void youThrashed()
    {
        System.out.println();
        System.out.println("You Lose All Your Health And Lost The Game");
        System.out.println("Total Choices Taken = "+count);
        System.out.println("Good Luck For the Next Time");
        System.out.println();
        System.exit(0);
    }

    /**
     *<p>
     *     player has won the game ,and how much
     *     choices he has taken in the entire game has been displayed
     *     along with congratulation message
     *</p>
     */
    public void Success()
    {
        System.out.println();
        System.out.println("Total Choices Taken = "+count);
        System.out.println("You Are finally out of the Polica Station And Won The Game");

        System.out.println("///////////////////////////////////////////////////////////");
        System.out.println();
        System.out.println("THANKS "+name+" For You Time ,Hope You Enjoyed The Game");
        System.out.println();
        System.out.println("///////////////////////////////////////////////////////////");
        System.out.println();
    }
}
