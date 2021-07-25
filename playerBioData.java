import java.util.Scanner;

public class playerBioData implements playerData,playerProperties {
    /**
     * Name of the player
     */
    public static String name;

    /**
     * Name of the Gender
     */
    public String gender;

    /**
     * Date of birth of the user
     */
    public String dateBirth;

    /**
     *  Age of thr player
     */
    public int age;

    /**
     *  There is watchman in the game whose health is described as 100
     */
    public static int watchManHealth=100; ;

    /**
     * weapon which can be use by player
     */
    public static String playerWeapon;

    /**
     * Health of the player in the game
     */
    public static int playerHealth=0;

    /**
     *count of choices taken by the player
     */
    public static int count;

Scanner kb=new Scanner(System.in);

    /**
     * <p>
     *     Player data has been asked to enter  the data
     *     to store it in the variables in this method
     * </p>
     */
     public void setPlayerData()
{
    System.out.println("enter your name");
    name=kb.nextLine();
    System.out.println("enter your gender");
    gender=kb.nextLine();
    System.out.println("enter you date of birth");
    dateBirth=kb.nextLine();
    System.out.println("enter your Age");
    age=kb.nextInt();
    setProperties();
    showData();
}

    /**
     *  Player health and its weapon status has been mentioned in this  method
     */
    public void setProperties()
{
    playerHealth=100;
    playerWeapon="nothing";
}

    /**
     *player data has been displayed in the screen to the user in this method
     *
     */
    public void showData()
{
    System.out.println("Your name is "+name);
    System.out.println("Your gender is "+gender);
    System.out.println("Your age is "+age);
    System.out.println("Your birthDate is "+dateBirth);
    System.out.println(name+" has "+playerWeapon+" as weapon at the moment");
    System.out.println("Right now your Power/Health is "+playerHealth);
}

}
