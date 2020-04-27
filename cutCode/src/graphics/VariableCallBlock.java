package graphics;

import java.util.List;

import javafx.geometry.Insets;
import javafx.geometry.Point2D;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import logicalBlocks.Block;

public class VariableCallBlock extends GraphicalBlock {
	private TextField name;
	/**
	 * O(1)
	 * @author Arjun Khanna
	 */
	public VariableCallBlock() {
		super(200, 40);
		name = new TextField();
		Text label = new Text("var:");
		label.setFill(Color.WHITE);
		name.setMinHeight(32);
		HBox line = new HBox();
		line.setSpacing(5);
		line.setPadding(new Insets(8));
		line.getChildren().add(label);
		line.getChildren().add(name);
		this.getChildren().add(line);
		this.setBackground(new Background(new BackgroundFill(Color.DARKOLIVEGREEN, CornerRadii.EMPTY, Insets.EMPTY)));

	}

	/**
	 * O(1)
	 * @author Arjun Khanna
	 */
	@Override
	public Block getLogicalBlock() {
		return null;
	}

	/**
	 * O(1)
	 * @author Arjun Khanna
	 */
	@Override
	public GraphicalBlock cloneBlock() {
		return new VariableCallBlock();
	}

	@Override
	public Point2D[] getNestables() {
		return new Point2D[0];
	}

	@Override
	public void nest(int index, GraphicalBlock nest) throws InvalidNestException {
		throw new InvalidNestException();
	}



}
