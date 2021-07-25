/**
 * <p>
 *     This Project Is All About a Prisoner Who is Trying To go Out From The Police Station.
 *     He Has Several Choices in The Program to Make in Order To Get Succeed.
 *     @author  Harpreet Singh Titriya(1992553),Rajan(1992552) In MAD-317.
 *
 * </p>
 *
 */

public class Main {
    /**
     *  this is Main Method in which we create a object and call methods.
     * @param args parameter with string[] args
     */

    public static void main(String[] args)
    {
        playerBioData pData=new playerBioData();
        pData.setPlayerData();;
        mainExit me=new mainExit();
        me.mainExitt();
    }
}
