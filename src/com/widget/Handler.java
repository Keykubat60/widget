package com.widget;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;
import java.net.URI;

public class Handler  implements MouseListener , MouseMotionListener {

    private int xMove;
    private int yMove;


    public Handler(){

      WidgetGUI.youtubeLabel.addMouseListener(this);
      WidgetGUI.twitterLabel.addMouseListener(this);
      WidgetGUI.googleLabel.addMouseListener(this);
      WidgetGUI.facebookLabel.addMouseListener(this);
      WidgetGUI.background.addMouseListener(this);
      WidgetGUI.background.addMouseMotionListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()==WidgetGUI.youtubeLabel){

            System.out.println("Clicked Youtube");
            try {
                Desktop.getDesktop().browse(URI.create("www.youtube.com"));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        else  if(e.getSource()==WidgetGUI.twitterLabel){
            System.out.println("Clicked Youtube");
            try {
                Desktop.getDesktop().browse(URI.create("www.twitter.com"));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        else  if(e.getSource()==WidgetGUI.googleLabel){
            System.out.println("Clicked Youtube");
            try {
                Desktop.getDesktop().browse(URI.create("www.google.com"));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        else   if(e.getSource()==WidgetGUI.facebookLabel){
            System.out.println("Clicked Youtube");
            try {
                Desktop.getDesktop().browse(URI.create("www.facebook.com"));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(e.getSource()==WidgetGUI.background)
        {  xMove = e.getX();
            yMove = e.getY();}


    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if(e.getSource()==WidgetGUI.background)
        {   int xCordinate = e.getXOnScreen();
            int yCordinate = e.getYOnScreen();

            WidgetGUI.frame.setLocation(xCordinate-xMove,yCordinate-yMove);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
