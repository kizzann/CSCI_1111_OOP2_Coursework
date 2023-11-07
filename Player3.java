public class Player3 {
    private String player;
    private double deaths;

    public Player3() {
        this.player = "";
        this.deaths = 0;
    }

    public Player3(String player, double deaths) {
        this.player = player;
        this.deaths = deaths;
    }
    public void setPlayer(String player) {
        this.player = player;
    }
    public String getPlayer() {
        return player;
    }
    public void setDeaths(double deaths) {
        this.deaths = deaths;
    }
    public double getDeaths() {
        return deaths;
    }
}
