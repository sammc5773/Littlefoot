import java.applet.Applet;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ToolApplet extends Applet {
	String[] positions = { "a","b","c" };
	String[] stls = { "gripA.stl" };
	TextField diameter = new TextField("6", 5);
	TextField lout = new TextField("20",5);
	TextField lin = new TextField("62",5);
	TextField filefield = new TextField("C:\\Users\\Megan\\Desktop\\LittlefootPrints\\grip.scad", 40);
	Choice position = new Choice();
	Choice stl = new Choice();
	Button submit = new Button("Submit");

	filewriter writer = new filewriter();

	public void init() {
		resize(400,100);
		diameter.setEditable(true);
		filefield.setEditable(true);
		lout.setEditable(true);
		lin.setEditable(true);
		for (String s : positions)
			position.add(s);
		for (String s : stls)
			stl.add(s);
		add(diameter);
		add(lout);
		add(lin);
		add(position);
		add(stl);
		add(filefield);
		add(submit);
	}

	public boolean action(Event evt, Object arg) {
		if (evt.target.equals(submit)) {
			writer.position = position.getSelectedItem();
			writer.stlTitle = stl.getSelectedItem();
			writer.diameter = Double.parseDouble(diameter.getText());
			writer.lout = Double.parseDouble(lout.getText());
			writer.lin = Double.parseDouble(lin.getText());
			writer.filename = filefield.getText();
			try {
				writer.writefile();
			} catch (FileNotFoundException | PositionNotSupportedException e) {
				e.printStackTrace();
			}
			showStatus("Submited file");
		} else
			return super.action(evt, arg);
		return true;

	}

}
