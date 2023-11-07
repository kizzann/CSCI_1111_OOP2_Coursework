public class Player5 {
        private String player;
        private double damage;

        public Player5() {
            this.player = "";
            this.damage = 0;
        }

        public Player5(String player, double damage) {
            this.player = player;
            this.damage = damage;
        }
        public void setPlayer(String player) {
            this.player = player;
        }
        public String getPlayer() {
            return player;
        }
        public void setDamage(double damage) {
            this.damage = damage;
        }
        public double getDamage() {
            return damage;
        }
    }
