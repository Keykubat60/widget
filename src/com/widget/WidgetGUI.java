package com.widget;

import javax.swing.*;
import java.awt.*;

public class WidgetGUI  {
    static JFrame frame;
 static    JLabel facebookLabel;
 static   JLabel twitterLabel;
static  JLabel googleLabel;
   static  JLabel youtubeLabel;
    static JPanel background;

    public WidgetGUI(){

    }

    public void getWidget(){

        createFrame();
        createLabels();
        createBackground();
        new Handler();
    }
    public void  createFrame(){
        frame = new JFrame();
        frame.setSize(240,50);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, 0);
        frame.setUndecorated(true);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setFocusable(true);
        frame.setResizable(false);
        frame.setBackground(new Color(2,2,2,20));


    }
    public void createBackground(){
        background =  new JPanel();
        background.setVisible(true);
        background.setBounds(0,0,240,50);
        background.setBackground(new Color(0, 0, 0, 50));
        frame.add(background);
    }
    public void createLabels(){
        youtubeLabel = new JLabel();
        youtubeLabel.setBounds(16,5,40,40);
        youtubeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/youtube.png")));
        frame.add(youtubeLabel);

        facebookLabel = new JLabel();
        facebookLabel.setBounds(72,5,40,40);
        facebookLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/facebook.png")));
        frame.add(facebookLabel);

        googleLabel = new JLabel();
        googleLabel.setBounds(72+56,5,40,40);
        googleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/google.png")));
        frame.add(googleLabel);

        twitterLabel = new JLabel();
        twitterLabel.setBounds(72+56+56,5,40,40);
        twitterLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sada/twitter.png")));
        frame.add(twitterLabel);

    }
    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public void setFacebookLabel(JLabel facebookLabel) {
        this.facebookLabel = facebookLabel;
    }

    public void setTwitterLabel(JLabel twitterLabel) {
        this.twitterLabel = twitterLabel;
    }



    public void setYoutube(JLabel youtube) {
        this.youtubeLabel = youtube;
    }

    public void setBackground(JPanel background) {
        this.background = background;
    }

    public JFrame getFrame() {
        return frame;
    }

    public JLabel getFacebookLabel() {
        return facebookLabel;
    }

    public JLabel getTwitterLabel() {
        return twitterLabel;
    }



    public JLabel getYoutube() {
        return youtubeLabel;
    }

    public JPanel getBackground() {
        return background;
    }
}
