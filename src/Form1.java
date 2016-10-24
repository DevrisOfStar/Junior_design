import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Form1 extends JFrame{

	public static void main(String[] args) {
		
		new SearchResult();

	}
	
	BufferedImage img = null;
	
	public Form1(){
		setLayout(null);
		setSize(750, 550);
		setLocation(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("����ã�� ���α׷�");
		
		JLabel label1 = new JLabel("�� �̸�");
		label1.setBounds(50, 20, 200, 30);
		add(label1);
		
		JTextField Text1 = new JTextField();
		add(Text1);
		Text1.setBounds(100, 20, 200, 30);

		JButton button1 = new JButton("�˻�");
		add(button1);
		button1.setBounds(320, 20, 60, 30);
		
		JButton button2 = new JButton("�Ǹ��� �α���");
		add(button2);
		button2.setBounds(550, 80,150, 30);
		button2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			setVisible(false);
			new Login();}
			});
		JButton button3 = new JButton("ȸ������");
		add(button3);
		button3.setBounds(550, 130,150, 30);
		button3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			setVisible(false);
			new SignUp();}
			});

		try{
			img = ImageIO.read(new File("seoul_map.gif"));
		}catch(IOException e){
			System.out.println("�̹��� �ҷ����� ����");
			System.exit(0);
		}
		
		MyPanel panelimage = new MyPanel();
		panelimage.setBounds(50,80,600,500);
		add(panelimage);
		
		
		setVisible(true);
	}
	class MyPanel extends JPanel{
		public void paint(Graphics g){
		g.drawImage(img,  0,  0,  null);
		}
	}

}