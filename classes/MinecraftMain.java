package classes;

public class MinecraftMain{
    public static void main(String[] args){
        MinecraftPlayer myguy = new MinecraftPlayer("JoeBob", "steve", true);
        MinecraftPlayer mydude = new MinecraftPlayer();
        System.out.println(myguy.username);
        System.out.println(mydude.username);
        mydude.set_health(-5);
        int x = mydude.get_health() + 5;
        System.out.println(x);
        myguy.digDirt();
        myguy.get_health();
        }
    }