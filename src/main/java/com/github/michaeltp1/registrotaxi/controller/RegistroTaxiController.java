package com.github.michaeltp1.registrotaxi.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.calendarfx.view.YearMonthView;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

public class RegistroTaxiController implements Initializable{

    @FXML
    private YearMonthView view;
	
	public RegistroTaxiController() throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/caca.fxml"));
		loader.setController(this);
		loader.load();}
	
	public YearMonthView getView() {
		return view;
	}

	public void setView(YearMonthView view) {
		this.view = view;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		view.selectionModeProperty().addListener((o,ov,nv)->{
			System.out.println(ov);
			System.out.println(nv);
		});
		view.dateProperty().addListener((o,ov,nv)->{
			System.out.println(ov);
			System.out.println(nv);
			System.out.println(o.getValue().getDayOfMonth());
		});
		
	}


}
