package org.test.worldManager;

import javax.swing.*;
import java.awt.event.*;

public class WorldManager {

    public static void main(String[] args) {
//create window
//create entry
//set entry position
// create table
// fill table by position
// add table to window
// create button
// create action
// add action to button
// draw window
// loop till done


                JFrame f=new JFrame("Button Example");
                f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                final JTextField tf=new JTextField();
                tf.setBounds(50,50, 150,20);
                JButton b=new JButton("Click Here");
                b.setBounds(50,100,95,30);
        final int[] i = {0};
        final SpecificPosition[] sp = {new SpecificPosition()};

        tf.setText("i:" + sp[0].getSpecificTableEntryId());

                b.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        sp[0].setSpecificTableEntryId(sp[0].getSpecificTableEntryId()+1);
                        tf.setText("i:" + sp[0].getSpecificTableEntryId());
                    }
                });
                f.add(b);f.add(tf);
                f.setSize(400,400);
                f.setLayout(null);
                f.setVisible(true);



    }

    public void ChangePositionAndRedraw(SpecificPosition CurrentPosition, JTable table){
        // Change Position of Current Entry Pointer
        // and overwrite table
        // and redraw window
    }



}
