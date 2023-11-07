public class Player2 {
    private String player;
    private double kills;

    public Player2() {
        this.player = "";
        this.kills = 0;
    }
    public Player2(String player, double kills) {
        this.player = player;
        this.kills = kills;
    }
    public void setPlayer(String player) {
        this.player = player;
    }
    public String getPlayer() {
        return player;
    }
    public void setKills(double kills) {
        this.kills = kills;
    }
    public double getKills() {
        return kills;
    }
}
