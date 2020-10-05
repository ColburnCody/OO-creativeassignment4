package view;

import javax.swing.JPanel;

import model.idemo.IRender;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;

import java.util.ArrayList;

public class IDemoCanvas extends JPanel {

    private IDemoPanel panel;

    private ArrayList<IRender> pictures = new ArrayList<>();
    private int selectedIndex = -1;

    public IDemoCanvas(IDemoPanel panel){
        this.panel = panel;
        setPreferredSize(new Dimension(500, 500));
        setBackground(Color.black);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        for(int i = 0; i < pictures.size(); i++){
            IRender pic = pictures.get(i);
            pic.render(g2);
            if(i == selectedIndex){
                g2.setStroke(new BasicStroke(5));
                g2.setColor(Color.red);
                g2.draw(pic.getBoundingBox());
            }
        }

    }

    public ArrayList<IRender> getPictures() {
        return pictures;
    }
    
}
