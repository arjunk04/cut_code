package application;

import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.geometry.*;

public class BlockView extends Rectangle {
	public BlockView(int width, int height, Paint p) {
		//Paint p = new Paint();
		//this.setFill(p);
		this.setId("hi");
		this.setStyle("-fx-background-color: red;");
		this.setWidth(width);
		this.setHeight(height);
		
		System.err.println(this.getStyle());
	}
}
