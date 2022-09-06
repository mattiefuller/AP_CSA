package classes;

public class MinecraftPlayer{
    String username;
    String skin;
    int health = 20;
    boolean rightHanded;
    int total_dirt = 0;

    MinecraftPlayer(){
        username = "Minecraft Player";
        skin = "Steve";
        rightHanded = true;
    }

    MinecraftPlayer(String user, String skin_name, boolean r_handed){
        username = user;
        skin = skin_name;
        rightHanded = r_handed;
    }

    public void digDirt(){ // void means that nothing will be returned
        total_dirt++;
        System.out.println(username + " has digged " + total_dirt + " blocks.");
    }   

    public int get_health(){
        System.out.println(username + " has " + health + " health.");
        return health;
    }

    public int set_health(int change){
        health = health + change;
        return health;
    }

    void dmg_other(MinecraftPlayer plyr){
        plyr.set_health (-5);
        System.out.print(plyr.username + " Oof!");
    }
}
