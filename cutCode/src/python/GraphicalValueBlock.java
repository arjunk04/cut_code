package python;

import cutcode.BlockCodeCompilerErrorException;
import cutcode.InvalidNestException;
import cutcode.LogicalBlock;
import cutcode.GraphicalBlock;
import javafx.geometry.Insets;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

import java.util.HashMap;

public class GraphicalValueBlock extends GraphicalBlock {
	private TextField value;
	/**
	 * O(1)
	 * @author Arjun Khanna
	 */
	public GraphicalValueBlock() {
		super(200, 40);
		value = new TextField();
		Text label = new Text("value ");
		value.setMinHeight(32);
		HBox line = new HBox();
		line.setSpacing(5);
		line.setPadding(new Insets(8));
		line.getChildren().add(label);
		line.getChildren().add(value);
		this.getChildren().add(line);
		this.setBackground(
				new Background(new BackgroundFill(Color.web("#F0A3FF"), CornerRadii.EMPTY, Insets.EMPTY)));
	}

	/**
	 * O(1)
	 * @author Arjun Khanna
	 */
	@Override
	public LogicalBlock getLogicalBlock() throws BlockCodeCompilerErrorException {
		return logicalFactory.createValue(value.getText());
	}

	/**
	 * O(1)
	 * @author Arjun Khanna
	 */
	@Override
	public GraphicalBlock cloneBlock() {
		return new GraphicalValueBlock();
	}

	@Override
	public void nest(int index, GraphicalBlock nest) throws InvalidNestException {
		throw new InvalidNestException(); //No nesting in value blocks
	}

	@Override
	public void unnest(VBox box, GraphicalBlock rem) throws InvalidNestException {
		throw new InvalidNestException(); //No nesting in value blocks
	}

	@Override
	public int putInHashMap(HashMap<Integer, GraphicalBlock> lineLocations) {
		return 0;
	}


}
