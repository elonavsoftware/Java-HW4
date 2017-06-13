package decoration;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import animals.Animal;
import graphics.ZooPanel;

/**
 *  DecorateDialog class, extends JDialog and implements ActionListener
 * @author Mahdi Asali
 *
 */

@SuppressWarnings("serial")
public class DecorateDialog extends JDialog implements ActionListener
{
	JPanel leftPanel,rightPanel;
	protected String[] colors = {"Red", "Blue"};
    protected JRadioButton[] rb;
    protected JButton okBtn;
    protected ZooPanel zooPanel;
	protected ArrayList<Animal> animals;
	protected int[] arr;
	@SuppressWarnings("rawtypes")
	private JComboBox cb;
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public DecorateDialog(ZooPanel pan, String title)
	{
    	super(new JFrame(), title,true);
    	 this.zooPanel = pan;
    	setSize(800,300);
		rb = new JRadioButton[colors.length];

        JPanel panel = new JPanel(new GridLayout(1,2)); // split the panel in 1 rows and 2 cols
        JPanel panelOK=new JPanel();
        JPanel panelcompBoxOfAnimal=new JPanel();

        JPanel left = new JPanel(new GridLayout(3,1));
        JPanel right = new JPanel(new GridLayout(1,2));
        JPanel pTR  = new JPanel();
        JPanel pTL = new JPanel();

        pTR.add(new JLabel("Choose decoration color:"));
        pTL.add(new JLabel("Select Animal to decorate:"));

	    cb = new JComboBox();  
        okBtn = new JButton("OK");
        
        okBtn.addActionListener(this);
        okBtn.setBackground(Color.lightGray);
        cb.addItem("No animal");
        left.add(pTL);
        right.add(pTR);
        panelcompBoxOfAnimal.add(cb);
        left.add(panelcompBoxOfAnimal);
        panelOK.add(okBtn);
        left.add(panelOK);


		for(int i = 0; i < colors.length; i++)
		{
		    rb[i] = new JRadioButton(colors[i], false);
		    rb[i].addActionListener(this);
		    right.add(rb[i]);
		}
        
        panel.add(left);
        panel.add(right);

        add(panel);
        LoadStatus(); //loading the current animals in ComboBox.
	}
	@SuppressWarnings("unchecked")
	public void LoadStatus()
	{
		this.animals = zooPanel.getAnimals();
		String name,color;
		boolean status = false;
		double weight = 0;
		name = color="";
		arr = new int[animals.size()];
		arr[0] = 0;
		int j = 1;
		for(int i = 0 ; i < animals.size(); i++)
		{
			//we have to add only natural animal color.
			color = animals.get(i).getColor();
			if(color == "Natural")
			{
				name = animals.get(i).getName();
				status = animals.get(i).isRunning();
				weight = animals.get(i).getWeight();
			if(j != animals.size())
			{
				arr[j] = i + 1;
				j++;
			}
			cb.addItem((i + 1) + ".[" + name + ":" + "running=" + status + ",weight=" + weight + ", color=" + color + "]");}
		}
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		if(arg0.getSource() == okBtn)
		{
			if(!rb[0].isSelected() && !rb[1].isSelected())
			{
				JOptionPane.showMessageDialog(this, "No changes has been maded!");
				dispose();
				return;
			}
			//checking if no animal selected 
			if(cb.getSelectedItem()=="No animal")
			{
				setVisible(false);
				return;
			}
			//call Decorator DP method.
			int index = cb.getSelectedIndex() - 1;
			Animal an = animals.get(arr[index]);
			JOptionPane.showMessageDialog(this, "You have choosed index:" + index + "animal name:" + an.getName());
			String selectedcolor;
			ColoredAnimalDecorator dec = new ColoredAnimalDecorator(an);
				
			//checking weither the user choosed red or blue
			if(rb[0].isSelected())
				selectedcolor = "Red";
			else if (rb[1].isSelected())
				selectedcolor = "Blue";
			else
				selectedcolor = "null";
				
			//setting the current color to PaintAnimal
			dec.PaintAnimal(selectedcolor);
			
			//Hide the Form.
			setVisible(false);
		}
	}
} //class DecorateDialog extends JDialog implements ActionListener
