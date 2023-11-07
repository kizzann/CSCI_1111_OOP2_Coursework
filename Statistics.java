import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.Arrays;

public class Statistics extends Application {
    ArrayList<String> ContractzChampions = new ArrayList<>(Arrays.asList("Sejuani", "Poppy", "Ivern", "Wukong"));
    ArrayList<String> FBIChampions = new ArrayList<>(Arrays.asList("Senna", "Kaisa", "Kalista", "Sivir"));
    ArrayList<String> BlaberChampions = new ArrayList<>(Arrays.asList("Sejuani", "Taliyah", "Belveth", "JarvanIV"));
    ArrayList<String> DhoklaChampions = new ArrayList<>(Arrays.asList("Rumble", "Aatrox", "Jax", "Kennen"));
    ArrayList<String> APAChampions = new ArrayList<>(Arrays.asList("Ziggs", "Tristana", "Cassiopeia", "Neeko"));
    ArrayList<String> PyosikChampions = new ArrayList<>(Arrays.asList("JarvanIV", "Kindred", "Lee Sin", "Sejuani"));
    ArrayList<String> YeonChampions = new ArrayList<>(Arrays.asList("Aphelios", "Ashe", "Lucian", "Samira"));
    ArrayList<String> RiverChampions = new ArrayList<>(Arrays.asList("Sejuani", "Kindred", "Vi", "Nautilus"));
    ArrayList<String> PalafoxChampions = new ArrayList<>(Arrays.asList("Jayce", "Neeko", "Orianna", "Sylas"));
    ArrayList<String> StixxayChampions = new ArrayList<>(Arrays.asList("Aphelios", "Kaisa", "Lucian", "Varus"));
    BorderPane bp = new BorderPane();
    VBox vBoxForButtons = new VBox(20);

    @Override
    public void start(Stage primaryStage) throws Exception {
        buildGui(primaryStage);

    }
    public void buildGui(Stage stage) {
        createButtons();
        createTableView();
        createScene(stage);
    }
    public void createButtons() {
        ToggleGroup group = new ToggleGroup();
        RadioButton kills = new RadioButton("Kills");
        RadioButton deaths = new RadioButton("Deaths");
        RadioButton assists = new RadioButton("Assists");
        RadioButton damage = new RadioButton("Damage");
        RadioButton minions = new RadioButton("Minions");
        RadioButton gold = new RadioButton("Gold");
        RadioButton allStats = new RadioButton("All Stats");
        kills.setOnAction(e -> eventHandlerKills());
        deaths.setOnAction(e -> eventHandlerDeaths());
        assists.setOnAction(e -> eventHandlerAssists());
        damage.setOnAction(e -> eventHandlerDamage());
        minions.setOnAction(e -> eventHandlerMinions());
        gold.setOnAction(e -> eventHandlerGold());
        allStats.setOnAction(e -> eventHandlerAllStats());
        //kills.setOnMouseClicked(e -> eventHandlerKills());
        group.getToggles().addAll(kills, deaths, assists, damage, minions, gold, allStats);
        vBoxForButtons.getChildren().addAll(kills, deaths, assists, damage, minions, gold, allStats);
        bp.setLeft(vBoxForButtons);
        bp.setPadding(new Insets(10, 10, 10, 10));

    }
    public void createTableView() {
        TableView<Player> player = new TableView<>();

        ObservableList<Player> playerStats = getStats();

        TableColumn<Player, String> playerColumn = new TableColumn<>("Player");
        playerColumn.setCellValueFactory(new PropertyValueFactory<>("player"));

        TableColumn<Player, Integer> killsColumn = new TableColumn<>("Average Kills");
        killsColumn.setCellValueFactory(new PropertyValueFactory<>("kills"));

        TableColumn<Player, Integer> deathsColumn = new TableColumn<>("Average Deaths");
        deathsColumn.setCellValueFactory(new PropertyValueFactory<>("deaths"));

        TableColumn<Player, Integer> assistsColumn = new TableColumn<>("Average Assists");
        assistsColumn.setCellValueFactory(new PropertyValueFactory<>("assists"));

        TableColumn<Player, Integer> damageColumn = new TableColumn<>("Average Damage Per Minute");
        damageColumn.setCellValueFactory(new PropertyValueFactory<>("damage"));

        TableColumn<Player, Integer> minionsColumn = new TableColumn<>("Average Minions Per Minute");
        minionsColumn.setCellValueFactory(new PropertyValueFactory<>("minions"));

        TableColumn<Player, Integer> goldColumn = new TableColumn<>("Average Gold Per Minute");
        goldColumn.setCellValueFactory(new PropertyValueFactory<>("gold"));

        TableColumn<Player, String> championColumn = new TableColumn<>("Most Played Champions");
        championColumn.setCellValueFactory(new PropertyValueFactory<>("champions"));

        player.getColumns().add(playerColumn);
        player.getColumns().add(killsColumn);
        player.getColumns().add(deathsColumn);
        player.getColumns().add(assistsColumn);
        player.getColumns().add(damageColumn);
        player.getColumns().add(minionsColumn);
        player.getColumns().add(goldColumn);
        player.getColumns().add(championColumn);

        player.setItems(playerStats);



        bp.setCenter(player);}
    public void createScene (Stage stage) {

        Scene scene = new Scene(bp, 1200, 850);
        bp.setStyle("-fx-background-color: beige");
        stage.setTitle("Top 10 North American Player Stats in 2023 LCS");
        stage.setScene(scene);
        stage.show();
    }
    public void eventHandlerKills() {
        TableView<Player2> player2 = new TableView<Player2>();

        TableColumn<Player2, String> playerColumn = new TableColumn<Player2, String>("Player");
        playerColumn.setCellValueFactory(new PropertyValueFactory<>("player"));

        TableColumn<Player2, Integer> killsColumn = new TableColumn<Player2, Integer>("Average Kills");
        killsColumn.setCellValueFactory(new PropertyValueFactory<>("kills"));
        player2.getColumns().add(playerColumn);
        player2.getColumns().add(killsColumn);
        player2.getItems().add(new Player2("Contractz", 2));
        player2.getItems().add(new Player2("FBI", 5));
        player2.getItems().add(new Player2("Blaber", 3.3));
        player2.getItems().add(new Player2("Dhokla", 2.4));
        player2.getItems().add(new Player2("APA", 4.5));
        player2.getItems().add(new Player2("Pyosik", 2.8));
        player2.getItems().add(new Player2("Yeon", 4.3));
        player2.getItems().add(new Player2("River", 2.9));
        player2.getItems().add(new Player2("Palafox", 3.8));
        player2.getItems().add(new Player2("Stixxay", 4.6));
        bp.setCenter(player2);
    }
    public void eventHandlerDeaths() {
        TableView<Player3> player3 = new TableView<Player3>();

        TableColumn<Player3, String> playerColumn = new TableColumn<Player3, String>("Player");
        playerColumn.setCellValueFactory(new PropertyValueFactory<>("player"));

        TableColumn<Player3, Integer> deathsColumn = new TableColumn<Player3, Integer>("Average Deaths");
        deathsColumn.setCellValueFactory(new PropertyValueFactory<>("deaths"));
        player3.getColumns().add(playerColumn);
        player3.getColumns().add(deathsColumn);
        player3.getItems().add(new Player3("Contractz", 3.1));
        player3.getItems().add(new Player3("FBI", 2.9));
        player3.getItems().add(new Player3("Blaber", 1.9));
        player3.getItems().add(new Player3("Dhokla", 3));
        player3.getItems().add(new Player3("APA", 2.8));
        player3.getItems().add(new Player3("Pyosik", 3.2));
        player3.getItems().add(new Player3("Yeon", 1.6));
        player3.getItems().add(new Player3("River", 2.3));
        player3.getItems().add(new Player3("Palafox", 2.2));
        player3.getItems().add(new Player3("Stixxay", 1.8));
        bp.setCenter(player3);
    }
    public void eventHandlerAssists() {
        TableView<Player4> player4 = new TableView<Player4>();

        TableColumn<Player4, String> playerColumn = new TableColumn<Player4, String>("Player");
        playerColumn.setCellValueFactory(new PropertyValueFactory<>("player"));

        TableColumn<Player4, Integer> assistsColumn = new TableColumn<Player4, Integer>("Average Assists");
        assistsColumn.setCellValueFactory(new PropertyValueFactory<>("assists"));
        player4.getColumns().add(playerColumn);
        player4.getColumns().add(assistsColumn);
        player4.getItems().add(new Player4("Contractz", 8.7));
        player4.getItems().add(new Player4("FBI", 5.3));
        player4.getItems().add(new Player4("Blaber", 7.5));
        player4.getItems().add(new Player4("Dhokla", 5.7));
        player4.getItems().add(new Player4("APA", 6.3));
        player4.getItems().add(new Player4("Pyosik", 7.7));
        player4.getItems().add(new Player4("Yeon", 4.6));
        player4.getItems().add(new Player4("River", 8.6));
        player4.getItems().add(new Player4("Palafox", 6.1));
        player4.getItems().add(new Player4("Stixxay", 5));
        bp.setCenter(player4);
    }
    public void eventHandlerDamage() {
        TableView<Player5> player5 = new TableView<Player5>();

        TableColumn<Player5, String> playerColumn = new TableColumn<Player5, String>("Player");
        playerColumn.setCellValueFactory(new PropertyValueFactory<>("player"));

        TableColumn<Player5, Integer> damageColumn = new TableColumn<Player5, Integer>("Average Damage Per Minute");
        damageColumn.setCellValueFactory(new PropertyValueFactory<>("damage"));
        player5.getColumns().add(playerColumn);
        player5.getColumns().add(damageColumn);
        player5.getItems().add(new Player5("Contractz", 342));
        player5.getItems().add(new Player5("FBI", 667));
        player5.getItems().add(new Player5("Blaber", 462));
        player5.getItems().add(new Player5("Dhokla", 458));
        player5.getItems().add(new Player5("APA", 774));
        player5.getItems().add(new Player5("Pyosik", 384));
        player5.getItems().add(new Player5("Yeon", 658));
        player5.getItems().add(new Player5("River", 393));
        player5.getItems().add(new Player5("Palafox", 649));
        player5.getItems().add(new Player5("Stixxay", 613));
        bp.setCenter(player5);
    }
    public void eventHandlerMinions() {
        TableView<Player6> player6 = new TableView<Player6>();

        TableColumn<Player6, String> playerColumn = new TableColumn<Player6, String>("Player");
        playerColumn.setCellValueFactory(new PropertyValueFactory<>("player"));

        TableColumn<Player6, Integer> minionsColumn = new TableColumn<Player6, Integer>("Average Minions Per Minute");
        minionsColumn.setCellValueFactory(new PropertyValueFactory<>("minions"));
        player6.getColumns().add(playerColumn);
        player6.getColumns().add(minionsColumn);
        player6.getItems().add(new Player6("Contractz",5.2));
        player6.getItems().add(new Player6("FBI", 9.2));
        player6.getItems().add(new Player6("Blaber", 5.8));
        player6.getItems().add(new Player6("Dhokla", 7.5));
        player6.getItems().add(new Player6("APA", 8.5));
        player6.getItems().add(new Player6("Pyosik", 5.7));
        player6.getItems().add(new Player6("Yeon", 9.3));
        player6.getItems().add(new Player6("River", 5.8));
        player6.getItems().add(new Player6("Palafox", 9.1));
        player6.getItems().add(new Player6("Stixxay", 9.8));
        bp.setCenter(player6);

    }
    public void eventHandlerGold() {
        TableView<Player7> table7 = new TableView<Player7>();

        TableColumn<Player7, String> playerColumn = new TableColumn<Player7, String>("Player");
        playerColumn.setCellValueFactory(new PropertyValueFactory<>("player"));

        TableColumn<Player7, Integer> goldColumn = new TableColumn<Player7, Integer>("Average Gold Per Minute");
        goldColumn.setCellValueFactory(new PropertyValueFactory<>("gold"));
        table7.getColumns().add(playerColumn);
        table7.getColumns().add(goldColumn);
        table7.getItems().add(new Player7("Contractz", 329));
        table7.getItems().add(new Player7("FBI", 438));
        table7.getItems().add(new Player7("Blaber", 347));
        table7.getItems().add(new Player7("Dholka", 347));
        table7.getItems().add(new Player7("APA", 465));
        table7.getItems().add(new Player7("Pyosik", 362));
        table7.getItems().add(new Player7("Yeon", 447));
        table7.getItems().add(new Player7("River", 360));
        table7.getItems().add(new Player7("Palafox", 428));
        table7.getItems().add(new Player7("Stixxay", 458));
        bp.setCenter(table7);
    }
    public void eventHandlerAllStats() {
        TableView<Player> player = new TableView<>();

        ObservableList<Player> playerStats = getStats();

        TableColumn<Player, String> playerColumn = new TableColumn<>("Player");
        playerColumn.setCellValueFactory(new PropertyValueFactory<>("player"));

        TableColumn<Player, Integer> killsColumn = new TableColumn<>("Average Kills");
        killsColumn.setCellValueFactory(new PropertyValueFactory<>("kills"));

        TableColumn<Player, Integer> deathsColumn = new TableColumn<>("Average Deaths");
        deathsColumn.setCellValueFactory(new PropertyValueFactory<>("deaths"));

        TableColumn<Player, Integer> assistsColumn = new TableColumn<>("Average Assists");
        assistsColumn.setCellValueFactory(new PropertyValueFactory<>("assists"));

        TableColumn<Player, Integer> damageColumn = new TableColumn<>("Average Damage Per Minute");
        damageColumn.setCellValueFactory(new PropertyValueFactory<>("damage"));

        TableColumn<Player, Integer> minionsColumn = new TableColumn<>("Average Minions Per Minute");
        minionsColumn.setCellValueFactory(new PropertyValueFactory<>("minions"));

        TableColumn<Player, Integer> goldColumn = new TableColumn<>("Average Gold Per Minute");
        goldColumn.setCellValueFactory(new PropertyValueFactory<>("gold"));

        TableColumn<Player, String> championColumn = new TableColumn<>("Most Played Champions");
        championColumn.setCellValueFactory(new PropertyValueFactory<>("champions"));

        player.getColumns().add(playerColumn);
        player.getColumns().add(killsColumn);
        player.getColumns().add(deathsColumn);
        player.getColumns().add(assistsColumn);
        player.getColumns().add(damageColumn);
        player.getColumns().add(minionsColumn);
        player.getColumns().add(goldColumn);
        player.getColumns().add(championColumn);

        player.setItems(playerStats);



        bp.setCenter(player);
    }
    public ObservableList<Player> getStats() {
        ObservableList<Player> mainPlayer = FXCollections.observableArrayList();

        mainPlayer.add(new Player("Contractz", 2, 3.1, 8.7, 342,
                5.2, 329, " " + ContractzChampions.toString().replace("[",
                "").replace("]", "")));
        mainPlayer.add(new Player("FBI", 5, 2, 5.3, 667,
                9.2, 438, " " + FBIChampions.toString().replace("[",
                "").replace("]", "")));
        mainPlayer.add(new Player("Blaber", 2.2, 3.5, 9.5, 384,
                5.8, 347, " " + BlaberChampions.toString().replace("[",
                "").replace("]", "")));
        mainPlayer.add(new Player("Dholka", 3.5, 3.6, 5.7, 501,
                7.5, 382, " " + DhoklaChampions.toString().replace("[",
                "").replace("]", "")));
        mainPlayer.add( new Player("APA", 4.5, 2.8, 6.3, 774,
                8.5, 465, " " + APAChampions.toString().replace("[",
                "").replace("]", "")));
        mainPlayer.add( new Player("Pyosik", 2.8, 3.2, 7.7, 384,
                5.7, 362, " " + PyosikChampions.toString().replace("[",
                "").replace("]", "")));
        mainPlayer.add(new Player("Yeon", 4.3, 1.6, 4.6, 658,
                9.3, 447, " " + YeonChampions.toString().replace("[",
                "").replace("]", "")));
        mainPlayer.add(new Player("River", 2.9, 2.3, 8.6, 393,
                5.8, 360, " " + RiverChampions.toString().replace("[",
                "").replace("]", "")));
        mainPlayer.add(new Player("Palafox", 3.8, 2.2, 6.1, 649,
                9.1, 428, " " + PalafoxChampions.toString().replace("[",
                "").replace("]", "")));
        mainPlayer.add(new Player("Stixxay", 4.6, 1.8, 5, 613,
                9.8, 458, " " + StixxayChampions.toString().replace("[",
                "").replace("]", "")));

        return mainPlayer;
    }
}
