
/**
 * Author: Franz Perez 
 * Email. franz.perez290@gmail.com
 * Description: This program helps you find out your score average 
 */

	import javax.swing.JPanel;
	import java.awt.Color;
	import java.awt.GridLayout;
	import java.awt.Dimension;
	import javax.swing.JTextField;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JButton;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;

	public class Score implements ActionListener{

		
			private JFrame frame;
			private JPanel panel;
			private JTextField [] TextField= new JTextField[8];
			private JLabel label2;
			private JLabel label1;
			private JLabel output;
			private JButton button;
			public Score()
			{	frame=new JFrame();
				frame.setSize(new Dimension (600,700));
				TextField[0]= new JTextField(5);
				TextField[1]= new JTextField(5);
				TextField[2]= new JTextField(5);
				TextField[3]= new JTextField(5);
				TextField[4]= new JTextField(5);
				TextField[5]= new JTextField(5);
				TextField[6]= new JTextField(5);
				TextField[7]= new JTextField(5);

				panel=new JPanel();
				panel.setLayout(new GridLayout(10,2));
				panel.setBackground(Color.blue);
				label1 = new JLabel();
				label1.setText("Enter Scores");
				label2 = new JLabel();
				label2.setText("Enter how much they weight");
				panel.add(label1);
				panel.add(label2);
				panel.add(TextField[0]);
				panel.add(TextField[1]);
				panel.add(TextField[2]);
				panel.add(TextField[3]);
				panel.add(TextField[4]);
				panel.add(TextField[5]);
				panel.add(TextField[6]);
				panel.add(TextField[7]);
				
				output = new JLabel();
				output.setText("---");
				panel.add(output);
				button = new JButton("Calculate average");
				button.addActionListener(this);
				panel.add(button);
				frame.add(panel);
				frame.setVisible(true);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}
			
			public double getCalculateAvgScore(double calculateAvgScore) {
			//method for  getting weighed average
				double Score1 = Double.parseDouble(TextField[0].getText());
				double Score2 = Double.parseDouble(TextField[2].getText());
				double Score3 = Double.parseDouble(TextField[4].getText());
				double Score4 = Double.parseDouble(TextField[6].getText());
				double Weigh5 = Double.parseDouble(TextField[1].getText());
				double Weigh6 = Double.parseDouble(TextField[3].getText());
				double Weigh7 = Double.parseDouble(TextField[5].getText());
				double Weigh8 = Double.parseDouble(TextField[7].getText());
				calculateAvgScore=Score1*Weigh5+Score2*Weigh6+Score3*Weigh7+Score4*Weigh8;
				return calculateAvgScore;
			}
			public void actionPerformed(ActionEvent e) {
				output.setText(String.valueOf(getCalculateAvgScore(0)));
			}
		}