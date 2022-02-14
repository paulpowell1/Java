import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class window implements ActionListener{
	
	static void createGUI() {
        //Create and set up the window.
//    	textboxes stats = new textboxes();
		
        JFrame frame = new JFrame("5e Character Creator");
        frame.setTitle("5e Character Creator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//      labels
        JLabel label = new JLabel();
		label.setText("Character Name");
		label.setBounds(250, 0, 100, 100);
		
		
        
//      stats for characters
        JTextField t1,t2,t3,t4,t5,t6;  
	    t1=new JTextField("str");  
	    t1.setBounds(250,150, 50,30);  
	    t2=new JTextField("dex");  
	    t2.setBounds(250,200, 50,30);
	    t3=new JTextField("con");  
	    t3.setBounds(250,250, 50,30);  
	    t4=new JTextField("int");  
	    t4.setBounds(250,300, 50,30);  
	    t5=new JTextField("wis");  
	    t5.setBounds(250,350, 50,30); 
	    t6=new JTextField("cha");  
	    t6.setBounds(250,400, 50,30);  
	    frame.add(t1); frame.add(t2); frame.add(t3); frame.add(t4); frame.add(t5); frame.add(t6);

//	    Name
	    JTextField name;
	    name = new JTextField("name");
	    name.setBounds(250, 60, 300, 50);
	    frame.add(name);
//	    Details
	    JTextField name2, background, playername, race, alignment, xp;
	    name2 = new JTextField("Class");
	    name2.setBounds(600, 60, 150, 30);
	    background = new JTextField("Background");
	    background.setBounds(800, 60, 150, 30);
	    playername = new JTextField("Player Name");
	    playername.setBounds(1000, 60, 150, 30);
	    race = new JTextField("Race");
	    race.setBounds(600, 150, 150, 30);
	    alignment = new JTextField("Alignment");
	    alignment.setBounds(800, 150, 150, 30);
	    xp = new JTextField("XP");
	    xp.setBounds(1000, 150, 150, 30);
	    frame.add(name2); frame.add(background); frame.add(playername); frame.add(race); frame.add(alignment);frame.add(xp);
//	    skills
	    JTextField insperation, prof;
	    JTextArea saving, skills;
	    insperation = new JTextField("insperation");
	    insperation.setBounds(350, 150, 150, 30);
	    prof = new JTextField("profficency");
	    prof.setBounds(350, 200, 150, 30);
	    saving = new JTextArea("saving");
	    saving.setBounds(350, 250, 150, 100);
	    skills = new JTextArea("skills");
	    skills.setBounds(350, 375, 150, 300);
	    frame.add(insperation);frame.add(prof); frame.add(saving);frame.add(skills);
//center
	    JTextArea AC,IN,S,HP,TP,HD,DS,ATTK;
	    AC = new JTextArea("AC");
	    AC.setBounds(600, 200, 50, 30);
	    IN = new JTextArea("Initiative");
	    IN.setBounds(700, 200, 50, 30);
	    S = new JTextArea("Speed");
	    S.setBounds(800, 200, 50, 30);
	    HP = new JTextArea("Current HP");
	    HP.setBounds(600, 250, 250, 30);
	    TP = new JTextArea("Temp HP");
	    TP.setBounds(600, 300, 250, 30);
	    HD = new JTextArea("Hit Dice");
	    HD.setBounds(600, 350, 100, 30);
	    DS = new JTextArea("Death saves");
	    DS.setBounds(750, 350, 100, 30);
	    ATTK = new JTextArea("Gear");
	    ATTK.setBounds(600, 400, 250, 275);
	    frame.add(AC);frame.add(IN);frame.add(S);frame.add(HP);frame.add(TP);frame.add(HD);frame.add(DS);frame.add(ATTK);
//	    
//	    right
	    JTextArea P, I, B, F, M;
	    P = new JTextArea("Personality");
	    P.setBounds(925, 200, 250, 75);
	    I = new JTextArea("Ideals");
	    I.setBounds(925, 300, 250, 75);
	    B = new JTextArea("Bonds");
	    B.setBounds(925, 400, 250, 75);
	    F = new JTextArea("Flaws");
	    F.setBounds(925, 500, 250, 75);
	    M = new JTextArea("Features");
	    M.setBounds(925, 600, 250, 75);
	    frame.add(P);frame.add(I);frame.add(B);frame.add(B);frame.add(F);frame.add(M);
	    JButton b = new JButton("Generate");
	    b.setBounds(680, 720, 100, 30);
	    frame.add(b);
//	    colors
	    JPanel left = new JPanel();
	    left.setBackground(new Color(107, 106, 104));
	    left.setBounds(250, 0, 300, 900);
	    frame.add(left);
	    JPanel Tright = new JPanel();
	    Tright.setBackground(new Color(102, 153, 204));
	    Tright.setBounds(250, 0, 950, 200);
	    frame.add(Tright);
	    JPanel Center = new JPanel();
	    Center.setBackground(new Color(247, 214, 208));
	    Center.setBounds(550, 150, 350, 900);
	    frame.add(Center);
	    JPanel Rcenter = new JPanel();
	    Rcenter.setBackground(new Color(100, 200, 200));
	    Rcenter.setBounds(850, 150, 350, 900);
	    frame.add(Rcenter);
	    JPanel back = new JPanel();
	    back.setBackground(new Color(211,211,211));
	    back.setBounds(0, 0, 1900, 1000);
	    frame.add(back);
	    
	    
//	    frame
	    
	    frame.setSize(1920,1080);  
	    frame.setLayout(null);  
	    frame.setVisible(true);
	    frame.add(label);
//	    
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
