/*
 * OpenProdoc
 * 
 * See the help doc files distributed with
 * this work for additional information regarding copyright ownership.
 * Joaquin Hierro licenses this file to You under:
 * 
 * License GNU GPL v3 http://www.gnu.org/licenses/gpl.html
 * 
 * you may not use this file except in compliance with the License.  
 * Unless agreed to in writing, software is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * author: Joaquin Hierro      2011
 * 
 */

/*
 * MantUsers.java
 *
 * Created on 17-feb-2010, 21:16:33
 */

package prodocswing.forms;

import java.util.HashSet;
import java.util.Vector;
import javax.swing.JDialog;
import prodoc.Attribute;
import prodoc.PDException;
import prodoc.PDThesaur;
import prodoc.Record;
import prodocswing.PDTableModel;

/**
 *
 * @author jhierrot
 */
public class MantTerm extends javax.swing.JDialog
{
private Record Term;
private boolean Cancel;
private PDThesaur TermAct;
private PDTableModel NTMembers;
private PDTableModel RTMembers;
private PDTableModel UFMembers;
private Vector VEmpty=new Vector();
private HashSet MemUF;
private HashSet MemNT;
private HashSet MemRT;
private Vector AttrMemRT=new Vector();
PDThesaur UseTerm=null;
String LocalThes=PDThesaur.ROOTTERM;

/** Creates new form MantUsers
 * @param parent 
 * @param modal
 */
public MantTerm(JDialog parent, boolean modal, String Thes)
{
super(parent, modal);
try {
initComponents();
LocalThes=Thes;
TermAct = new PDThesaur(MainWin.getSession());
NTTable.setAutoCreateRowSorter(true);
NTTable.setAutoCreateColumnsFromModel(true);
RTTable.setAutoCreateRowSorter(true);
RTTable.setAutoCreateColumnsFromModel(true);
UFTable.setAutoCreateRowSorter(true);
UFTable.setAutoCreateColumnsFromModel(true);
} catch (PDException ex)
    {MainWin.Message(MainWin.DrvTT(ex.getLocalizedMessage()));
    }
}

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        LabelOperation = new javax.swing.JLabel();
        TermNameLabel = new javax.swing.JLabel();
        TermDescripLabel = new javax.swing.JLabel();
        USELabel = new javax.swing.JLabel();
        TermNameTextField = new javax.swing.JTextField();
        TermDescripTextField = new javax.swing.JTextField();
        USETextField = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        PanelNT = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        NTTable = new javax.swing.JTable();
        ToolBarNT = new javax.swing.JToolBar();
        PanelRT = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        RTTable = new javax.swing.JTable();
        ToolBarRT = new javax.swing.JToolBar();
        AddButtonRT = new javax.swing.JButton();
        DelButtonRT = new javax.swing.JButton();
        PanelUF = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        UFTable = new javax.swing.JTable();
        ToolBarUF = new javax.swing.JToolBar();
        ButtonAcept = new javax.swing.JButton();
        ButtonCancel = new javax.swing.JButton();
        AddButtonU1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(MainWin.TT("Term_Maintenance"));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                formWindowClosing(evt);
            }
        });

        LabelOperation.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        LabelOperation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelOperation.setText("jLabel1");

        TermNameLabel.setFont(MainWin.getFontDialog());
        TermNameLabel.setText("jLabel1");

        TermDescripLabel.setFont(MainWin.getFontDialog());
        TermDescripLabel.setText("jLabel1");

        USELabel.setFont(MainWin.getFontDialog());
        USELabel.setText("jLabel1");

        TermNameTextField.setFont(MainWin.getFontDialog());

        TermDescripTextField.setFont(MainWin.getFontDialog());

        USETextField.setEditable(false);
        USETextField.setFont(MainWin.getFontDialog());

        jScrollPane1.setViewportView(NTTable);

        ToolBarNT.setRollover(true);

        javax.swing.GroupLayout PanelNTLayout = new javax.swing.GroupLayout(PanelNT);
        PanelNT.setLayout(PanelNTLayout);
        PanelNTLayout.setHorizontalGroup(
            PanelNTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNTLayout.createSequentialGroup()
                .addGroup(PanelNTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelNTLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ToolBarNT, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelNTLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelNTLayout.setVerticalGroup(
            PanelNTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNTLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ToolBarNT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab(MainWin.TT("Narrow_Terms"), PanelNT);

        jScrollPane2.setViewportView(RTTable);

        ToolBarRT.setRollover(true);

        AddButtonRT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add.png"))); // NOI18N
        AddButtonRT.setToolTipText(MainWin.TT("Add_user_to_group"));
        AddButtonRT.setFocusable(false);
        AddButtonRT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AddButtonRT.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        AddButtonRT.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                AddButtonRTActionPerformed(evt);
            }
        });
        ToolBarRT.add(AddButtonRT);

        DelButtonRT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/del.png"))); // NOI18N
        DelButtonRT.setToolTipText(MainWin.TT("Delete_user_from_group"));
        DelButtonRT.setFocusable(false);
        DelButtonRT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        DelButtonRT.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        DelButtonRT.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                DelButtonRTActionPerformed(evt);
            }
        });
        ToolBarRT.add(DelButtonRT);

        javax.swing.GroupLayout PanelRTLayout = new javax.swing.GroupLayout(PanelRT);
        PanelRT.setLayout(PanelRTLayout);
        PanelRTLayout.setHorizontalGroup(
            PanelRTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRTLayout.createSequentialGroup()
                .addGroup(PanelRTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelRTLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ToolBarRT, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRTLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelRTLayout.setVerticalGroup(
            PanelRTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRTLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ToolBarRT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab(MainWin.TT("Related_Terms"), PanelRT);

        jScrollPane3.setViewportView(UFTable);

        ToolBarUF.setRollover(true);

        javax.swing.GroupLayout PanelUFLayout = new javax.swing.GroupLayout(PanelUF);
        PanelUF.setLayout(PanelUFLayout);
        PanelUFLayout.setHorizontalGroup(
            PanelUFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUFLayout.createSequentialGroup()
                .addGroup(PanelUFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelUFLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ToolBarUF, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelUFLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelUFLayout.setVerticalGroup(
            PanelUFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUFLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ToolBarUF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab(MainWin.TT("Used_For"), PanelUF);

        ButtonAcept.setFont(MainWin.getFontDialog());
        ButtonAcept.setText(MainWin.TT("Ok"));
        ButtonAcept.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonAceptActionPerformed(evt);
            }
        });

        ButtonCancel.setFont(MainWin.getFontDialog());
        ButtonCancel.setText(MainWin.TT("Cancel"));
        ButtonCancel.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonCancelActionPerformed(evt);
            }
        });

        AddButtonU1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/tree.png"))); // NOI18N
        AddButtonU1.setToolTipText(MainWin.TT("Add_user_to_group"));
        AddButtonU1.setFocusable(false);
        AddButtonU1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AddButtonU1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        AddButtonU1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                AddButtonU1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(LabelOperation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ButtonAcept)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonCancel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(USELabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TermNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TermDescripLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TermNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TermDescripTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(USETextField, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AddButtonU1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {TermDescripLabel, TermNameLabel, USELabel});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelOperation)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TermNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TermNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TermDescripTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TermDescripLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(USELabel)
                        .addComponent(USETextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(AddButtonU1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonCancel)
                    .addComponent(ButtonAcept))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCancelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonCancelActionPerformed
    {//GEN-HEADEREND:event_ButtonCancelActionPerformed
Cancel=true;
try {
if (MainWin.getSession().isInTransaction())
        MainWin.getSession().AnularTrans();
} catch (PDException ex)
    {MainWin.Message(MainWin.DrvTT(ex.getLocalizedMessage()));
    }
this.dispose();
    }//GEN-LAST:event_ButtonCancelActionPerformed

    private void ButtonAceptActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonAceptActionPerformed
    {//GEN-HEADEREND:event_ButtonAceptActionPerformed
try {
Attribute Attr=Term.getAttr(PDThesaur.fNAME);
Attr.setValue(TermNameTextField.getText());
Attr=Term.getAttr(PDThesaur.fDESCRIP);
Attr.setValue(TermDescripTextField.getText());
Attr=Term.getAttr(PDThesaur.fUSE);
Attr.setValue(UseTerm.getPDId());
if (MainWin.getSession().isInTransaction())
    MainWin.getSession().CerrarTrans();
} catch (PDException ex)
    {MainWin.Message(MainWin.DrvTT(ex.getLocalizedMessage()));
    }
Cancel=false;
this.dispose();
    }//GEN-LAST:event_ButtonAceptActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
Cancel=true;
    }//GEN-LAST:event_formWindowClosing

    private void AddButtonRTActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_AddButtonRTActionPerformed
    {//GEN-HEADEREND:event_AddButtonRTActionPerformed
try {
AddTermRT ART=new AddTermRT(this, true, LocalThes);
ART.AddMode();
ART.setLocationRelativeTo(null);
ART.setVisible(true);
if (ART.isCancel())
    return;
PDThesaur RTerm=ART.getUseTerm();
if (RTerm==null)
    return;
getMemRT().add(RTerm.getPDId());
RefreshRT();
} catch (PDException ex)
    {
    MainWin.Message(MainWin.DrvTT(ex.getLocalizedMessage()));
    }
    }//GEN-LAST:event_AddButtonRTActionPerformed

    private void DelButtonRTActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_DelButtonRTActionPerformed
    {//GEN-HEADEREND:event_DelButtonRTActionPerformed
if (RTTable.getSelectedRow()==-1)
    return;
try {
AddTermRT ART=new AddTermRT(this, true, LocalThes);
ART.setRecord(RTMembers.getElement(RTTable.convertRowIndexToModel(RTTable.getSelectedRow())));
ART.DelMode();
ART.setLocationRelativeTo(null);
ART.setVisible(true);
if (ART.isCancel())
    return;
getMemRT().remove(ART.getUseTerm().getPDId());
RefreshRT();
} catch (PDException ex)
    {
    MainWin.Message(MainWin.DrvTT(ex.getLocalizedMessage()));
    }
    }//GEN-LAST:event_DelButtonRTActionPerformed

    private void AddButtonU1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_AddButtonU1ActionPerformed
    {//GEN-HEADEREND:event_AddButtonU1ActionPerformed
MainThes MTW=new MainThes( (JDialog)this, false, MainWin.getSession(), LocalThes);
MTW.setLocationRelativeTo(null);
MTW.ModeSelect();
MTW.setModal(true);
MTW.setVisible(true);
UseTerm=MTW.getTermAct();
if (UseTerm==null)
    USETextField.setText("");
else
    USETextField.setText(UseTerm.getName());
    }//GEN-LAST:event_AddButtonU1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButtonRT;
    private javax.swing.JButton AddButtonU1;
    private javax.swing.JButton ButtonAcept;
    private javax.swing.JButton ButtonCancel;
    private javax.swing.JButton DelButtonRT;
    private javax.swing.JLabel LabelOperation;
    private javax.swing.JTable NTTable;
    private javax.swing.JPanel PanelNT;
    private javax.swing.JPanel PanelRT;
    private javax.swing.JPanel PanelUF;
    private javax.swing.JTable RTTable;
    private javax.swing.JLabel TermDescripLabel;
    private javax.swing.JTextField TermDescripTextField;
    private javax.swing.JLabel TermNameLabel;
    private javax.swing.JTextField TermNameTextField;
    private javax.swing.JToolBar ToolBarNT;
    private javax.swing.JToolBar ToolBarRT;
    private javax.swing.JToolBar ToolBarUF;
    private javax.swing.JTable UFTable;
    private javax.swing.JLabel USELabel;
    private javax.swing.JTextField USETextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

/**
*
*/
public void AddMode()
{
LabelOperation.setText(MainWin.TT("Add_Term"));
//AddButtonRT.setEnabled(false);
//DelButtonRT.setEnabled(false);
}
//----------------------------------------------------------------
/**
*
*/
public void DelMode()
{
LabelOperation.setText(MainWin.TT("Delete_Term"));
TermNameTextField.setEditable(false);
TermDescripTextField.setEditable(false);
AddButtonRT.setEnabled(false);
DelButtonRT.setEnabled(false);
}
//----------------------------------------------------------------
/**
*
*/
public void EditMode()
{
LabelOperation.setText(MainWin.TT("Update_Term"));
TermNameTextField.setEditable(false);
}
//----------------------------------------------------------------
/**
*
*/
public void CopyMode()
{
LabelOperation.setText(MainWin.TT("Copy_Term"));
TermNameTextField.setText(TermNameTextField.getText()+"1");
}
//----------------------------------------------------------------
/**
* @return the ACL
*/
public Record getRecord()
{
return Term;
}
//----------------------------------------------------------------
/**
 * @param pTerm
*/
public void setRecord(Record pTerm)
{
try {
Term = pTerm;
Attribute Attr = Term.getAttr(PDThesaur.fPDID);
String Id=(String)Attr.getValue();
if (Id != null)
    {
    MemUF=TermAct.getListUF(Id);
    MemNT=TermAct.getListDirectDescendList(Id);
    MemRT=TermAct.getListRT(Id);
    RefreshNT();
    RefreshRT();
    RefreshUF();
    }
else
    {
    MemUF=new HashSet();
    MemRT=new HashSet();
    MemNT=new HashSet();
    }
Attr = Term.getAttr(PDThesaur.fNAME);
TermNameLabel.setText(MainWin.TT(Attr.getUserName()));
if (Attr.getValue() != null)
    {
    TermNameTextField.setText((String) Attr.getValue());
    }
TermNameTextField.setToolTipText(Attr.getDescription());
Attr = Term.getAttr(PDThesaur.fDESCRIP);
TermDescripLabel.setText(MainWin.TT(Attr.getUserName()));
if (Attr.getValue() != null)
    {
    TermDescripTextField.setText((String) Attr.getValue());
    }
TermDescripTextField.setToolTipText(Attr.getDescription());
Attr=Term.getAttr(PDThesaur.fUSE);
USELabel.setText(MainWin.TT(Attr.getUserName()));
UseTerm=new PDThesaur(MainWin.getSession());
if (Attr.getValue() != null)
    {
    UseTerm.Load((String) Attr.getValue());
    USETextField.setText(UseTerm.getName());
    }
USETextField.setToolTipText(Attr.getDescription());
} catch (PDException ex)
    {
    MainWin.Message(MainWin.DrvTT(ex.getLocalizedMessage()));
    }
}
//----------------------------------------------------------------
private void RefreshRT() throws PDException
{
RTMembers = new PDTableModel();
RTMembers.setDrv(MainWin.getSession());
RTMembers.setListFields(PDThesaur.getRecordStructPDThesaur());
AttrMemRT=TermAct.getList(getMemRT());
RTMembers.setVector(AttrMemRT);
RTTable.setModel(RTMembers);
RTTable.getColumnModel().getColumn(0).setMaxWidth(0);
RTTable.getColumnModel().removeColumn(RTTable.getColumnModel().getColumn(0));
}
//----------------------------------------------------------------
private void RefreshNT() throws PDException
{
NTMembers = new PDTableModel();
NTMembers.setDrv(MainWin.getSession());
NTMembers.setListFields(PDThesaur.getRecordStructPDThesaur());
if (!MemNT.isEmpty())
    NTMembers.setCursor(TermAct.LoadList(MemNT));
else    
    NTMembers.setVector(VEmpty);
NTTable.setModel(NTMembers);
NTTable.getColumnModel().getColumn(0).setMaxWidth(0);
NTTable.getColumnModel().removeColumn(NTTable.getColumnModel().getColumn(0));
}
//----------------------------------------------------------------
private void RefreshUF() throws PDException
{
UFMembers = new PDTableModel();
UFMembers.setDrv(MainWin.getSession());
UFMembers.setListFields(PDThesaur.getRecordStructPDThesaur());
if (!MemUF.isEmpty())
    UFMembers.setCursor(TermAct.LoadList(MemUF));
else    
    UFMembers.setVector(VEmpty);
UFTable.setModel(UFMembers);
UFTable.getColumnModel().getColumn(0).setMaxWidth(0);
UFTable.getColumnModel().removeColumn(UFTable.getColumnModel().getColumn(0));
}
//----------------------------------------------------------------
/**
* @return the Cancel
*/
public boolean isCancel()
{
return Cancel;
}
//----------------------------------------------------------------

    /**
     * @return the MemRT
     */
    public HashSet getMemRT()
    {
        return MemRT;
    }
}
