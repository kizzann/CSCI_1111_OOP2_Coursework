public class Player4 {
    private String player;
    private double assists;

    public Player4() {
        this.player = "";
        this.assists = 0;
    }

    public Player4(String player, double assists) {
        this.player = player;
        this.assists = assists;
    }
    public void setPlayer(String player) {
        this.player = player;
    }
    public String getPlayer() {
        return player;
    }
    public void setAssists(double assists) {
        this.assists = assists;
    }
    public double getAssists() {
        return assists;
    }
}
