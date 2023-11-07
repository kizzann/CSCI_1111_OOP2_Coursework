public class Player6 {
            private String player;
            private double minions;

            public Player6() {
                this.player = "";
                this.minions = 0;
            }

            public Player6(String player, double minions) {
                this.player = player;
                this.minions = minions;
            }
            public void setPlayer(String player) {
                this.player = player;
            }
            public String getPlayer() {
                return player;
            }
            public void setMinions(double minions) {
                this.minions = minions;
            }
            public double getMinions() {
                return minions;
            }
        }
