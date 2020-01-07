package graphics;

import java.util.List;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import logicalBlocks.Block;

public class DoubleBlock extends GraphicalBlock{
	
	private TextField box1,box2;
	
	public DoubleBlock() {
		super(200,40);
		
		box1 = new TextField();
		box1.setMaxWidth(30);
		box2 = new TextField();
		box2.setMaxWidth(30);
		HBox line = new HBox();
		line.setSpacing(5);
		line.setPadding(new Insets(8));
		Text text = new Text("Double");
		text.setFill(Color.WHITE);
		line.getChildren().add(text);
		line.getChildren().add(box1);
		line.getChildren().add(new Label("="));
		line.getChildren().add(box2);
		
		this.setBackground(new Background(new BackgroundFill(Color.DARKGREEN,CornerRadii.EMPTY,Insets.EMPTY)));
		
		this.getChildren().add(line);
		
		
	}
	
	public DoubleBlock(double width, double height) {
		super(width,height);
	}
	
	/**
	 * @apiNote O(1)
	 * @author Peter Timpane
	 */
	@Override
	public Block getLogicalBlock() {
		logicalBlocks.DoubleBlock ret = new logicalBlocks.DoubleBlock();
		ret.setValue(Double.parseDouble(box2.getText()));
		ret.setName(box1.getText());
		return ret;
	} 
	
	@Override
	public GraphicalBlock cloneBlock() {
		return new DoubleBlock();
	}

	@Override
	public String toJSON() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
