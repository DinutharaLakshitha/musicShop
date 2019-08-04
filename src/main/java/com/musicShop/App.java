package com.musicShop;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Dinuthara Lakshitha
 *
 * mongod --dbpath Projects/musicShopAssignment/data/
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {

        //Manager functions scene

        WestminsterMusicStoreManager manager = new WestminsterMusicStoreManager();

        Label mainLabel = new Label("Westminster Music Store");
        Button addItem = new Button("Add a new Item");
        Button deleteItem = new Button("Delete an Item");
        Button viewItemList = new Button("Available Items");
        Button sortItems = new Button("Sort Items");
        Button buyItem = new Button("Buy an Item");
        Button report = new Button("Report");

        VBox musicStoreLayout = new VBox(10);
        musicStoreLayout.setAlignment(Pos.CENTER);
        musicStoreLayout.getChildren().addAll(mainLabel,addItem,deleteItem,viewItemList,sortItems,buyItem,report);
        Scene mainScene = new Scene(musicStoreLayout,600,600);


        stage.setScene(mainScene);
        stage.setTitle("Westminster Music");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}