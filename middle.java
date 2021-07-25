import java.util.Scanner;

public class middle extends destiny {

Scanner kb=new Scanner(System.in);


    /**
     * choice selected by the player stored in this atrribrute
     */
    public int selection1;


    /**
     *<p>
     *     player is in the middle of the police station
     *     where player can select in which direction he wants to go from
     *     given three options that is east,west,north
     *</p>
     */
    public void middleOfPoliceStation()
{
    System.out.println("You Are Now At The Middle Of Police Station");
    System.out.println("You have 3 Options as Following");
    System.out.println("1: Go to East Side(Canteen,MedicalRoom)");
    System.out.println("2: Go to West Side(Personal_Room,WashRoom)");
    System.out.println("3: Go to North(Watchman And Fire Exit Area)");

    selection1=kb.nextInt();

    if(selection1==1)
    {
        count++;
      eastSide()   ;
    }
    else if (selection1==2)
    {
        count++;
        westSide();
    }
    else if(selection1==3)
    {
        count++;
       NorthFireExitArea();
    }
    else
    {
        System.out.println(name+" , This Choice is not Available , Please check Choices Again");
        middleOfPoliceStation();
    }
}


    /**
     * <p>
     *     player is in the east side where he have
     *     three option to select
     * </p>
     */
    public void eastSide()
{
    System.out.println("You Are Now In The East Side Of Police Station");
    System.out.println("You Have Following Choice here");
    System.out.println("Press 1 For East Side Canteen");
    System.out.println("Press 2 for Medical Room");
    System.out.println("Press 3 to go Back to Middle of the Police Station");

    selection1=kb.nextInt();

    if (selection1==1)
    {
        count++;
        EastCanteen();
    }
    else if (selection1==2)
    {
        count++;
        EastMedicalRoom();
    }
    else if (selection1==3)
    {
        middleOfPoliceStation();
    }
    else{
        System.out.println(name+" , This Chocie Is Not Available , Please Check Your Choices Agian");
        eastSide();
    }
}

    /**
     *  <p>
     *      player is in the east direction in the canteen
     *      where he have three options to take
     *  </p>
     */
    public  void EastCanteen()
{
    System.out.println();
    System.out.println("You Are In the Canteen/Eaton Hall");
    System.out.println("You can take drink Or You can Go back to The Middle of Police Station");
    System.out.println("1: For Energy Drink");
    System.out.println("2: For Food");
    System.out.println("3: GO back to The EastSide Of Police Station");
    System.out.println();
    selection1=kb.nextInt();

    if(selection1==1)
    {
        count++;
        System.out.println("Drink success");
        if (playerHealth<90)
        {
            playerHealth= playerHealth +10;
            System.out.println("Your Body Power increase to "+playerHealth);
        }
        else
            {
            System.out.println("You took the drink, but Your health was already at peak");
        }
        EastCanteen();
    }
    else if (selection1==2)
    {
        System.out.println("Food Taken Successfully");
        if (playerHealth<90)
        {

            playerHealth=playerHealth+10;
            System.out.println("you Health Increases To "+playerHealth);
        }
        else {
            System.out.println("you took the food successfully And You Health Was Already at Peak.");
        }
        EastCanteen();
    }
    else if (selection1==3)
    {
        count++;
        eastSide();
    }
    else {
        System.out.println(name+" , This choice in unavailable, please check choice again");
        EastCanteen();
    }


}


    /**
     *<p>
     *     player is in the east direction in the medical room
     *     where he have three option to take
     *</p>
     */
    public  void EastMedicalRoom()
{
    System.out.println();
    System.out.println("You Are Now in The Medical Room");
    System.out.println("You can Take Energy pills For Power");
    System.out.println("Press 1 For Energy Pills");
    System.out.println("Press 2 for Leaving this Area And Go back to East Side oF Police Station");
     selection1=kb.nextInt();
    System.out.println();
     if (selection1==1)
     {
         count++;
         System.out.println("You Took The Energy Tablet");
         if (playerHealth<10)
         {
             playerHealth= playerHealth +10;
             System.out.println("Your Body Power increase to "+playerHealth);
         }
         else
         {
             System.out.println("You took the tablet, but Your health was already at peak");
         }
         EastMedicalRoom();
     }
     else if (selection1==2)
     {
         count++;
         eastSide();
     }
     else {
         System.out.println(name+" , This Choice is not Available, Please Check choices Again");
         EastMedicalRoom();
     }
}

    /**
     * <p>
     *     Player has been selected the west side direction,from here he
     *     have three options to take
     * </p>
     */
    public  void westSide()
{
    System.out.println();
    System.out.println("You are now in the west side of police Station");
    System.out.println("From here, You can choose one form the following");
    System.out.println("Press 1 For West Side Personal Room");
    System.out.println("Press 2 For West Side WashRoom");
    System.out.println("Press 3 for to go back to the Middle Of the police station");
    System.out.println();
    selection1=kb.nextInt();

    if(selection1==1)
    {
        count++;
        westPersonalRoom();
    }
    else if (selection1==2)
    {
        count++;
        WestWashRoom();

    }
    else if (selection1==3)
    {
        count++;
        middleOfPoliceStation();
    }
    else
    {
        System.out.println(name+" , This Choice is not Available, Please Check choices Again");
        westSide();
    }
}
public  void westPersonalRoom()
{
    System.out.println();
    System.out.println("You are In Your Personal Room In west Side ");
    System.out.println("At The Moment, You Have Two Choices");
    System.out.println("1: pick The Sharp Wire As a Weapon");
    System.out.println("2: Drink Water");
    System.out.println("3: Go back to the West Side of Police Station");

    System.out.println();

    selection1=kb.nextInt();

    if (selection1==1)
    {
        count++;
        playerWeapon="sharpWire";
        System.out.println("Now You have Sharp wire as Your Weapon");
        System.out.println("Press 1 to Leave the room and go back to the West Side");

        selection1=kb.nextInt();

        if (selection1==1)
        {
            count++;
            westSide();
        }
        else
        {
            System.out.println(name+" ,This Choice is not Available, Please check Choices Again");
            westPersonalRoom();
        }
    }
    else if (selection1==2){
        count++;
        System.out.println("You Drink Water Succesfully");
        if(playerHealth<95)
        {
            playerHealth=playerHealth+5;
            System.out.println("Your health increases to "+playerHealth);

        }
        else {
            System.out.println("You drink the water And Your Health was Already At Peak");
        }
        westPersonalRoom();
    }
    else if (selection1==3){
        count++;
        westSide();
    }
    else {
        System.out.println(name+" ,This Choice is not Available, Please check Choices Again");
        westPersonalRoom();
    }
}

    /**
     * <p>
     *     player has selected the west side direction
     *     and he is in the  wash room now he have  three
     *     options to take
     *
     * </p>
     */
    public void WestWashRoom()
{
    System.out.println();
    System.out.println("You are now in the West Side WashRoom");
    System.out.println("Blade is one of the Material you can Pick from Here and use it as a Weapon");
    System.out.println("Press 1 : For Blade");
    System.out.println("Press 2: To Leave WashRoom And Go Back To West Side");
    System.out.println();

    selection1=kb.nextInt();

    if (selection1==1)
    {
        count++;
        playerWeapon="Blade";
        System.out.println("You Successfully Pick Blade As Your Weapon");
        System.out.println("You can now leave WashRoom and go to the West Side by pressing 1");

        selection1=kb.nextInt();

        if (selection1==1)
        {
            westSide();
        }
        else {
            System.out.println(name+" , This Choice Is Not Available , please Check Choices Again");
            WestWashRoom();
        }

    }
    else if (selection1==2)
    {
        count++;
        westSide();
    }
    else {
        System.out.println(name+" , This Choice is Not Available, Please Check Choices Again ");
        WestWashRoom();
    }
}

    /**
     *<p>
     *     player has selected the north direction where
     *     he is in fire exit area  and have three option to take
     *</p>
     */
    public void  NorthFireExitArea()
{
    System.out.println();
    System.out.println("You are at the North Fire Exit Area");
    System.out.println("At this point there is a WatchMan Without Gun");
    System.out.println("You have 2 Options as Following");
    System.out.println("1: For Fight With WatchMan");
    System.out.println("2: For Discussion, If He Can Let You Go Outside");
    System.out.println("3: Run back to The Middle Of The Police Station");

    System.out.println();

    selection1=kb.nextInt();

    if (selection1==1)
    {
        count++;
        fightWithWatchMan();
    }
    else if (selection1==2)
    {
        count++;
        System.out.println("WatchMan: No,You Can't Go OutSide, You Imprisonment Sentence is Not Over.");
        System.out.println();
        NorthFireExitArea();
    }
    else if (selection1==3)
    {
        count++;
        middleOfPoliceStation();
    }
    else
    {
        System.out.println(name+" , This Choice Is Not Available, Check Choices Again");
        NorthFireExitArea();
    }

}


    /**
     * <p>
     *     player is in the north side
     *     where he will decide whether he will attack the watchman or
     *     go back to the middle of the police station
     * </p>
     */

    public void fightWithWatchMan()
{
    System.out.println();
    System.out.println("Are You Sure You Want To Attack Wathc Man.You can Still decide");
    System.out.println("Press 1 for Start Attack and ");
    System.out.println("press 2 for Leave Area and go back to the Middle of the Police Station");
    System.out.println();

    selection1=kb.nextInt();

    if (selection1==1)
    {
        count++;
       attackStarted();
    }
    else if (selection1==2)
    {
        count++;
        middleOfPoliceStation();
    }
    else {
        System.out.println(name+" , This choice is not Available , Please Check Choices Again");
        fightWithWatchMan();
    }
}


}