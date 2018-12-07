import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
import javax.swing.*;
import java.awt.event.*;
class Client extends JFrame
{
	JTextField t1=new JTextField();
	JTextField t2=new JTextField();
	JTextField t3=new JTextField();
	JButton b1=new JButton("Add");
	JButton b2=new JButton("Sub");
	JButton b3=new JButton("Mul");
	JButton b4=new JButton("Div");
	ServerInterface si;
	Client()
	{
		setLayout(null);
		setSize(400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		t1.setBounds(50,50,200,30);add(t1);
		t2.setBounds(50,90,200,30);add(t2);
		t3.setBounds(50,130,200,30);add(t3);
		b1.setBounds(50,170,100,30);add(b1);
		b2.setBounds(150,170,100,30);add(b2);
		b3.setBounds(50,210,100,30);add(b3);
		b4.setBounds(150,210,100,30);add(b4);
		b1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){b1_Click(e);}});
		b2.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){b2_Click(e);}});
		b3.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){b3_Click(e);}});
		b4.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){b4_Click(e);}});
		try{
				Registry rr=LocateRegistry.getRegistry("127.0.0.1",1099);
				si=(ServerInterface)rr.lookup("MATH");
		}catch(Exception ee){System.out.println("Server Error");}
	}
	void b1_Click(ActionEvent e)
	{
		try{
				String s=si.add(t1.getText(),t2.getText());
				t3.setText(s);
		}catch(Exception ee){}
	}
	void b2_Click(ActionEvent e)
	{
		try{
				String s=si.sub(t1.getText(),t2.getText());
				t3.setText(s);
		}catch(Exception ee){}
	}
	void b3_Click(ActionEvent e)
	{
		try{
				String s=si.mul(t1.getText(),t2.getText());
				t3.setText(s);
		}catch(Exception ee){}
	}
	void b4_Click(ActionEvent e)
	{
		try{
				String s=si.div(t1.getText(),t2.getText());
				t3.setText(s);
		}catch(Exception ee){}
	}
	public static void main(String[] ar)
	{
			new Client().setVisible(true);
	}
}