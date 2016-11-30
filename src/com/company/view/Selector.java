package com.company.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JCheckBoxMenuItem;


/**
 * Created by ARBA on 25/11/2016.
 */
public class Selector extends JDialog {
    private boolean sendData;
    private JLabel projectLabel, icon;
    private JCheckBoxMenuItem voucherBox,optionsBox,productBox,catalogBox;
    private JComboBox project;
    private String dataProject;
    private String[] dataSection;

    public void openFrame() {
        this.sendData = false;
        this.setVisible(true);
    }

    public Selector(){
        super((JFrame)null, "Tucano automation tool", true);
        this.setSize(900, 500);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.initComponent();
    }

    private void initComponent(){
        //Icône
        icon = new JLabel(new ImageIcon("imgs/layout/logo.png"));
        JPanel panIcon = new JPanel();
        panIcon.setBackground(Color.white);
        panIcon.setLayout(new BorderLayout());
        panIcon.add(icon);

        //Project
        JPanel panProject = new JPanel();
        panProject.setBackground(Color.white);
        panProject.setPreferredSize(new Dimension(440, 60));
        panProject.setBorder(BorderFactory.createTitledBorder("Project to test"));
        project = new JComboBox();
        project.addItem("EcoNet");
        project.addItem("Telecentro");
        project.addItem("beIn France");
        project.addItem("beIn Mena");
        project.addItem("Orange");
        projectLabel = new JLabel("Select a project : ");
        panProject.add(projectLabel);
        panProject.add(project);

        //Section is a part to test in Wecare
        JPanel panSection = new JPanel();
        panSection.setBackground(Color.white);
        panSection.setBorder(BorderFactory.createTitledBorder("Sections to test"));
        panSection.setPreferredSize(new Dimension(440, 200));
        voucherBox = new JCheckBoxMenuItem("Vouchers");
        optionsBox = new JCheckBoxMenuItem("Options");
        productBox = new JCheckBoxMenuItem("Product");
        catalogBox = new JCheckBoxMenuItem("Catalog");
        panSection.add(voucherBox);
        panSection.add(optionsBox);
        panSection.add(productBox);
        panSection.add(catalogBox);

        JPanel content = new JPanel();
        content.setBackground(Color.white);
        content.add(panProject);
        content.add(panSection);

        JPanel control = new JPanel();
        JButton okBouton = new JButton("Start the automation");

        okBouton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                dataProject = (String)project.getSelectedItem();
                dataSection = getSection();
                setVisible(false);
            }

            public String[] getSection(){
                String voucher = "";
                String options = "";
                String product = "";
                String catalog = "";
                if (voucherBox.isSelected()){
                    voucher = voucherBox.getText();
                }
                if (optionsBox.isSelected()){
                    options = optionsBox.getText();
                }
                if (productBox.isSelected()){
                    product = productBox.getText();
                }
                if (catalogBox.isSelected()){
                    catalog = catalogBox.getText();
                }

                String sections[] = {voucher, options, product,catalog};

                return sections;
            }
        });

        control.add(okBouton);

        this.getContentPane().add(panIcon, BorderLayout.WEST);
        this.getContentPane().add(content, BorderLayout.CENTER);
        this.getContentPane().add(control, BorderLayout.SOUTH);
    }

    public String[] get_dataSection()
    {
        return dataSection;
    }

    public String get_dataProject()
    {
        return dataProject;
    }
}
