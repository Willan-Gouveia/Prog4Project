/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import DAL.Item;
import java.util.Random;
import javax.swing.SwingUtilities;

/**
 *
 * @author LanceDH
 */
public class LootPanel extends javax.swing.JPanel {

    GameWindow _parent;
    Item equipedChest;
    Item equipedLegs;
    Item equipedFeet;
    Item equipedWeapon;
    Item loot;
    /**
     * Creates new form LootWindow
     */
    public LootPanel(GameWindow parent) {
        initComponents();
        this._parent = parent;
        Services.itemServices.LoadAllLoot();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_CharacterName = new javax.swing.JLabel();
        btn_ChangeCharacter = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbl_ChestIcon = new javax.swing.JLabel();
        lbl_LegsIcon = new javax.swing.JLabel();
        lbl_FeetIcon = new javax.swing.JLabel();
        lbl_WeaponIcon = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbl_LootIcon = new javax.swing.JLabel();
        btn_Loot = new javax.swing.JButton();
        lbl_ItemName = new javax.swing.JLabel();
        lbl_ItemSlot = new javax.swing.JLabel();
        lbl_ItemAtt1 = new javax.swing.JLabel();
        lbl_ItemAtt1Val = new javax.swing.JLabel();
        btn_Equip = new javax.swing.JButton();

        lbl_CharacterName.setToolTipText("");
        lbl_CharacterName.setMaximumSize(new java.awt.Dimension(5, 14));
        lbl_CharacterName.setMinimumSize(new java.awt.Dimension(5, 14));
        lbl_CharacterName.setPreferredSize(new java.awt.Dimension(5, 14));

        btn_ChangeCharacter.setText("Change Charater");
        btn_ChangeCharacter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ChangeCharacterActionPerformed(evt);
            }
        });

        lbl_ChestIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Slot-Chest.png"))); // NOI18N
        lbl_ChestIcon.setToolTipText("");
        lbl_ChestIcon.setMinimumSize(new java.awt.Dimension(64, 64));
        lbl_ChestIcon.setPreferredSize(new java.awt.Dimension(64, 64));

        lbl_LegsIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Slot-Legs.png"))); // NOI18N
        lbl_LegsIcon.setToolTipText("");

        lbl_FeetIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Slot-Feet.png"))); // NOI18N
        lbl_FeetIcon.setToolTipText("");

        lbl_WeaponIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_WeaponIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Slot-Weapon.png"))); // NOI18N
        lbl_WeaponIcon.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_FeetIcon, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(lbl_ChestIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(lbl_WeaponIcon)
                .addGap(9, 9, 9)
                .addComponent(lbl_LegsIcon))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbl_ChestIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_LegsIcon)
                    .addComponent(lbl_WeaponIcon))
                .addGap(9, 9, 9)
                .addComponent(lbl_FeetIcon))
        );

        lbl_LootIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Slot-Loot.png"))); // NOI18N
        lbl_LootIcon.setToolTipText("");

        btn_Loot.setText("Loot");
        btn_Loot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LootActionPerformed(evt);
            }
        });

        lbl_ItemName.setText("Name");

        lbl_ItemSlot.setText("Slot");

        lbl_ItemAtt1.setText("Attribute");

        lbl_ItemAtt1Val.setText("value");

        btn_Equip.setText("Equip");
        btn_Equip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EquipActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_LootIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_ItemName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_ItemSlot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_ItemAtt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_ItemAtt1Val, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btn_Loot, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(btn_Equip)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(btn_Loot)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_LootIcon)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_ItemName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_ItemSlot)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_ItemAtt1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_ItemAtt1Val)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Equip)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_CharacterName, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addComponent(btn_ChangeCharacter)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_CharacterName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ChangeCharacter))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ChangeCharacterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ChangeCharacterActionPerformed
        _parent.activeCharacter = null;
        _parent.remove(this);
        _parent.ShowCharacterSelect();
    }//GEN-LAST:event_btn_ChangeCharacterActionPerformed

    private void btn_LootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LootActionPerformed
        Random rnd = new Random();
        loot = Services.itemServices.LootList.get(rnd.nextInt(Services.itemServices.LootList.size()));
        _parent.ChangeIcon(lbl_LootIcon, "/Images/" + loot.getIconPath() + ".png");
        lbl_ItemName.setText(loot.getName());
        lbl_ItemSlot.setText(loot.getSlot().getName());
        lbl_ItemAtt1.setText(loot.getAttribute().getName());
        lbl_ItemAtt1Val.setText("" + loot.getAttribute1value());
    }//GEN-LAST:event_btn_LootActionPerformed

    private void btn_EquipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EquipActionPerformed
        //Don't allow equiping when there is no loot
        if (loot == null) {
            return;
        }
        
        switch(loot.getSlot().getId()){
            case 2: //Chest
                _parent.activeCharacter.setItemByChestItemId(loot);
                break;
            case 3: //Legs
                _parent.activeCharacter.setItemByLegsItemId(loot);
                break;
            case 4: //Boots
                _parent.activeCharacter.setItemByBootsItemId(loot);
                break;
            case 5: //Weapon
                _parent.activeCharacter.setItemByWeaponItemId(loot);
                break;
        }
        UpdateCharacterLoot();
    }//GEN-LAST:event_btn_EquipActionPerformed

    public void Reset(){
        _parent.ChangeIcon(lbl_ChestIcon, "/Images/Slot-Chest.png");
        _parent.ChangeIcon(lbl_FeetIcon, "/Images/Slot-Feet.png");
        _parent.ChangeIcon(lbl_LegsIcon, "/Images/Slot-Legs.png");
        _parent.ChangeIcon(lbl_WeaponIcon, "/Images/Slot-Weapon.png");
        _parent.ChangeIcon(lbl_LootIcon, "/Images/Slot-Loot.png");
    }
    
    public void UpdateCharacterLoot(){
        lbl_CharacterName.setText(_parent.activeCharacter.getName());
        if (_parent.activeCharacter.getItemByChestItemId() != null) {
            _parent.ChangeIcon(lbl_ChestIcon, "/Images/" + _parent.activeCharacter.getItemByChestItemId().getIconPath() + ".png");
        }
        if (_parent.activeCharacter.getItemByBootsItemId() != null) {
            _parent.ChangeIcon(lbl_FeetIcon, "/Images/" + _parent.activeCharacter.getItemByBootsItemId().getIconPath() + ".png");
        }
        if (_parent.activeCharacter.getItemByLegsItemId() != null) {
            _parent.ChangeIcon(lbl_LegsIcon, "/Images/" + _parent.activeCharacter.getItemByLegsItemId().getIconPath() + ".png");
        }
        if (_parent.activeCharacter.getItemByWeaponItemId() != null) {
            _parent.ChangeIcon(lbl_WeaponIcon, "/Images/" + _parent.activeCharacter.getItemByWeaponItemId().getIconPath() + ".png");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ChangeCharacter;
    private javax.swing.JButton btn_Equip;
    private javax.swing.JButton btn_Loot;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_CharacterName;
    private javax.swing.JLabel lbl_ChestIcon;
    private javax.swing.JLabel lbl_FeetIcon;
    private javax.swing.JLabel lbl_ItemAtt1;
    private javax.swing.JLabel lbl_ItemAtt1Val;
    private javax.swing.JLabel lbl_ItemName;
    private javax.swing.JLabel lbl_ItemSlot;
    private javax.swing.JLabel lbl_LegsIcon;
    private javax.swing.JLabel lbl_LootIcon;
    private javax.swing.JLabel lbl_WeaponIcon;
    // End of variables declaration//GEN-END:variables
}
