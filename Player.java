public class Player {
    private String player = "";
    private double kills = 0;
    private double deaths = 0;
    private double assists = 0;
    private double damage = 0;
    private double minions = 0;
    private double gold = 0;
    private String champions = "";

    public Player() {
    }

    public Player(String player, double kills, double deaths, double assists, double damage, double minions, double gold, String champions) {
        this.player = player;
        this.kills = kills;
        this.deaths = deaths;
        this.assists = assists;
        this.damage = damage;
        this.minions = minions;
        this.gold = gold;
        this.champions = champions;
    }
    public void setPlayer(String player) {
        this.player = player;
    }
    public String getPlayer() {
        return this.player;
    }
    public void setKills(double kills) {
        this.kills = kills;
    }
    public double getKills() {
        return kills;
    }
    public void setDeaths(double deaths) {
        this.deaths = deaths;
    }
    public double getDeaths() {
        return deaths;
    }
    public void setAssists(double assists) {
        this.assists = assists;
    }
    public double getAssists() {
        return assists;
    }
    public void setDamage(double damage) {
        this.damage = damage;
    }
    public double getDamage() {
        return damage;
    }
    public void setMinions(double minions) {
        this.minions = minions;
    }
    public double getMinions() {
        return minions;
    }
    public void setGold(double gold) {
        this.gold = gold;
    }
    public double getGold() {
        return gold;
    }
    public void setChampions(String champions) {
        this.champions = champions;
    }
    public String getChampions() {
        return champions;
    }
}
