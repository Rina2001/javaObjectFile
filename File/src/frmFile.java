import javax.swing.*;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.channels.NetworkChannel;

public class frmFile extends JFrame implements ActionListener {
	public frmFile(){
		this.setSize(300,300);
		this.setLayout(null);
		JLabel lblFirstFileName=new JLabel("First FileName");
		JLabel lblSecondFirstNaem=new JLabel("Second FileName");
	    JButton btnRead=new JButton("Read");
		JButton btnWrite=new JButton("Write");
		JButton btnRename=new JButton("Rename");
		JButton btnDelete=new JButton("Delete");
		JButton btnClose=new JButton("Close");
		
		btnRead.addActionListener(this);
		btnWrite.addActionListener(this);
		btnRename.addActionListener(this);
		btnDelete.addActionListener(this);
		btnClose.addActionListener(this);
		JTextField tfFirstName=new JTextField(20);
		JTextField tfSecondName=new JTextField(20);
		
		JTextArea ta=new JTextArea();
		
		JPanel pane=new JPanel(new GridLayout(2,2));
		JPanel paneButton=new JPanel(new GridLayout(5,0));
		pane.setSize(200,90);
		pane.add(lblFirstFileName);
		pane.add(tfFirstName);
		pane.add(lblSecondFirstNaem);
		pane.add(tfSecondName);
		this.add(pane);
		paneButton.add(btnRead);
		paneButton.add(btnWrite);
		paneButton.add(btnRename);
		paneButton.add(btnDelete);
		paneButton.add(btnClose);
		paneButton.setSize(200,90);
		this.add(paneButton,new );
		this.setVisible(true);
		
				
	}
	@Override
	public void actionPerformed(ActionEvent e){
		
	}
	public static void main(String args[]){
		new frmFile();
	}
}
