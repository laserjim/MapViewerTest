package com.test.googlemaps;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class MapViewer extends Application
{
	public static void main(String[] args)
	{
		launch(args);
	}

	@Override
	public void start(Stage primaryStage)
	{
		Scene scene = new Scene(new MyBrowser(), 790, 400);

		primaryStage.setScene(scene);
		primaryStage.show();
	}

	class MyBrowser extends Region
	{
		HBox toolbar;

		WebView webView = new WebView();
		WebEngine webEngine = webView.getEngine();

		public MyBrowser()
		{
			String urlGoog = "http://maps.google.com";
			String urlApi = getClass().getResource("/googlemaps.html") + "";

			webEngine.load(urlApi); // TODO: YOU CAN CHANGE ME TO 'urlApi' or 'urlGoog'
			// Notice it works with urlGoog but not with urlApi

			getChildren().add(webView);
		}
	}
}
