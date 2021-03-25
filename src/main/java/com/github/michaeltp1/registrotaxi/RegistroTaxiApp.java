package com.github.michaeltp1.registrotaxi;

import com.github.michaeltp1.registrotaxi.controller.RegistroTaxiController;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RegistroTaxiApp extends Application {
	
	private RegistroTaxiController controller;

	@Override
	public void start(Stage primaryStage) throws Exception {

		controller=new RegistroTaxiController();
		
		Scene escena = new Scene(controller.getView());

		primaryStage.setScene(escena);
		primaryStage.setTitle("GoBurgerTPV");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
