public class Player7 {
    private String player;
    private double gold;

    public Player7() {
        this.player = "";
        this.gold = 0;
    }
    public Player7(String player, double gold) {
        this.player = player;
        this.gold = gold;
    }
    public void setPlayer(String player) {
        this.player = player;
    }
    public String getPlayer() {
        return player;
    }
    public void setGold(double gold) {
        this.gold = gold;
    }
    public double getGold() {
        return gold;
    }
}
