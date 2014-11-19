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
 * ListObjects.java
 *
 * Created on 12-feb-2010, 20:39:16
 */

package prodocswing.forms;

import java.awt.Frame;
import java.io.File;
import java.io.PrintWriter;
import java.util.Vector;
import javax.swing.*;
import prodoc.*;
import prodocswing.PDTableModel;

/**
 *
 * @author jhierrot
 */
public abstract class ListObjects extends javax.swing.JDialog
{
protected ObjPD PDObject;
protected PDTableModel UserList1 = new PDTableModel();
protected Frame Fparent;
static private DefaultComboBoxModel CBMRoles=null;
static private DefaultComboBoxModel CBMUsers=null;
static private DefaultComboBoxModel CBMGroups=null;
static private DefaultComboBoxModel CBMACL=null;
static private DefaultComboBoxModel CBMReposit=null;
static private DefaultComboBoxModel CBMAuthenticators=null;
static private DefaultComboBoxModel CBMCustomizers=null;
private boolean Filled=false;
/**
 * 
 */
protected JDialog MantForm;

/** Creates new form ListObjects
 * @param parent 
 * @param modal
 * @param pPDObject 
 */
public ListObjects(java.awt.Frame parent, boolean modal, ObjPD pPDObject)
{
super(parent, modal);
Fparent=parent;
initComponents();
ObjectsTable.setAutoCreateRowSorter(true);
ObjectsTable.setAutoCreateColumnsFromModel(true);
PDObject = pPDObject;
AssignLabels();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        ObjectsTable = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        AddButton = new javax.swing.JButton();
        DelButton = new javax.swing.JButton();
        EditButton = new javax.swing.JButton();
        CopyButton = new javax.swing.JButton();
        ExportButton = new javax.swing.JButton();
        ExportAllButton = new javax.swing.JButton();
        ImportButton = new javax.swing.JButton();
        ExpCSV = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        UserFilter = new javax.swing.JTextField();
        ButtonFilter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                formWindowClosing(evt);
            }
        });

        ObjectsTable.setFont(MainWin.getFontList());
        ObjectsTable.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                ObjectsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ObjectsTable);

        jToolBar1.setRollover(true);

        AddButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add.png"))); // NOI18N
        AddButton.setToolTipText("");
        AddButton.setEnabled(false);
        AddButton.setFocusable(false);
        AddButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AddButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        AddButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                AddButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(AddButton);

        DelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/del.png"))); // NOI18N
        DelButton.setToolTipText("");
        DelButton.setEnabled(false);
        DelButton.setFocusable(false);
        DelButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        DelButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        DelButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                DelButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(DelButton);

        EditButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/edit.png"))); // NOI18N
        EditButton.setToolTipText("");
        EditButton.setEnabled(false);
        EditButton.setFocusable(false);
        EditButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        EditButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        EditButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                EditButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(EditButton);

        CopyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/copy.png"))); // NOI18N
        CopyButton.setToolTipText("");
        CopyButton.setEnabled(false);
        CopyButton.setFocusable(false);
        CopyButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CopyButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        CopyButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                CopyButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(CopyButton);

        ExportButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/export.png"))); // NOI18N
        ExportButton.setToolTipText("");
        ExportButton.setEnabled(false);
        ExportButton.setFocusable(false);
        ExportButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ExportButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ExportButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ExportButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(ExportButton);

        ExportAllButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/export_all.png"))); // NOI18N
        ExportAllButton.setToolTipText("");
        ExportAllButton.setEnabled(false);
        ExportAllButton.setFocusable(false);
        ExportAllButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ExportAllButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ExportAllButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ExportAllButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(ExportAllButton);

        ImportButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/import.png"))); // NOI18N
        ImportButton.setToolTipText("");
        ImportButton.setEnabled(false);
        ImportButton.setFocusable(false);
        ImportButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ImportButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ImportButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ImportButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(ImportButton);

        ExpCSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/expCSV.png"))); // NOI18N
        ExpCSV.setToolTipText("");
        ExpCSV.setEnabled(false);
        ExpCSV.setFocusable(false);
        ExpCSV.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ExpCSV.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ExpCSV.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ExpCSVActionPerformed(evt);
            }
        });
        jToolBar1.add(ExpCSV);

        jLabel1.setFont(MainWin.getFontDialog());
        jLabel1.setText(MainWin.TT("Filter"));

        UserFilter.setFont(MainWin.getFontDialog());
        UserFilter.setToolTipText("Introducir nombre completo o parcial del usuario");
        UserFilter.setName("UserFilter"); // NOI18N

        ButtonFilter.setFont(MainWin.getFontDialog());
        ButtonFilter.setText(MainWin.TT("Ok"));
        ButtonFilter.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonFilterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(UserFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonFilter)
                        .addGap(0, 56, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(UserFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonFilter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonFilterActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonFilterActionPerformed
    {//GEN-HEADEREND:event_ButtonFilterActionPerformed
RefreshTable();
int Tot=getObjectsTable().getRowCount();
if (Tot>0)
    {
    getObjectsTable().setRowSelectionInterval(0, 0);
    }
    }//GEN-LAST:event_ButtonFilterActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_AddButtonActionPerformed
    {//GEN-HEADEREND:event_AddButtonActionPerformed
int Pos=getObjectsTable().getSelectedRow();
if (Pos<0)
    Pos=0;
try {
PDObject.Clear();
MantForm=AddMode();
MantForm.setLocationRelativeTo(null);
} catch (PDException ex)
        {
        MainWin.Message(MainWin.DrvTT(ex.getLocalizedMessage()));
        }
while (true)
    {
    try {
    MantForm.setVisible(true);
    if (!AddModeOk())
        return;
    MainWin.getSession().IniciarTrans();
    PDObject.insert();
    PostInsert(MantForm);
    MainWin.getSession().CerrarTrans();
    RefreshTable();
    int Tot=getObjectsTable().getRowCount();
    if (Tot>0)
        {
        int Sel=Math.min(Tot-1, Pos);
        getObjectsTable().setRowSelectionInterval(Sel, Sel);
        }
    return;
    } catch (PDException ex)
        {
        if (MainWin.getSession().isInTransaction())    
            {try{
             MainWin.getSession().AnularTrans();
                } catch (PDException ex1)
                {
                }
            }
        MainWin.Message(MainWin.DrvTT(ex.getLocalizedMessage()));
        }
    }
    }//GEN-LAST:event_AddButtonActionPerformed

    private void DelButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_DelButtonActionPerformed
    {//GEN-HEADEREND:event_DelButtonActionPerformed
int Pos=getObjectsTable().getSelectedRow();
if (Pos==-1)
    return;
try {
MantForm=DelMode();
MantForm.setLocationRelativeTo(null);
MantForm.setVisible(true);
if (!DelModeOk())
    return;
MainWin.getSession().IniciarTrans();
PDObject.delete();
MainWin.getSession().CerrarTrans();
RefreshTable();
int Tot=getObjectsTable().getRowCount();
if (Tot>0)
    {
    int Sel=Math.min(Tot-1, Pos);
    getObjectsTable().setRowSelectionInterval(Sel, Sel);
    }
} catch (PDException ex)
    {
    if (MainWin.getSession().isInTransaction())    
        {try{
            MainWin.getSession().AnularTrans();
            } catch (PDException ex1)
            {
            }
        }
MainWin.Message(MainWin.DrvTT(ex.getLocalizedMessage()));
    }
    }//GEN-LAST:event_DelButtonActionPerformed

private void EditButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_EditButtonActionPerformed
{//GEN-HEADEREND:event_EditButtonActionPerformed
int Pos=getObjectsTable().getSelectedRow();
if (Pos==-1)
    return;
try {
MantForm=EditMode();
MantForm.setLocationRelativeTo(null);
} catch (PDException ex)
    {MainWin.Message(MainWin.DrvTT(ex.getLocalizedMessage()));
    }
while (true)
    {
    try {
    MantForm.setVisible(true);
    if (!EditModeOk())
        return;
    MainWin.getSession().IniciarTrans();
    PDObject.update();
    PostEdit(MantForm);
    MainWin.getSession().CerrarTrans();
    RefreshTable();
    int Tot=getObjectsTable().getRowCount();
    if (Tot>0)
        {
        int Sel=Math.min(Tot-1, Pos);
        getObjectsTable().setRowSelectionInterval(Sel, Sel);
        }
    return; 
   } catch (PDException ex)
        {
        if (MainWin.getSession().isInTransaction())    
            {try{
             MainWin.getSession().AnularTrans();
                } catch (PDException ex1)
                {
                }
            }
        MainWin.Message(MainWin.DrvTT(ex.getLocalizedMessage()));
        }
    }
}//GEN-LAST:event_EditButtonActionPerformed

private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
{//GEN-HEADEREND:event_formWindowClosing
}//GEN-LAST:event_formWindowClosing

private void CopyButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_CopyButtonActionPerformed
{//GEN-HEADEREND:event_CopyButtonActionPerformed
int Pos=getObjectsTable().getSelectedRow();
if (Pos==-1)
    return;
try {
MantForm=CopyMode();
MantForm.setLocationRelativeTo(null);
MantForm.setVisible(true);
if (!CopyModeOk())
    return;
MainWin.getSession().IniciarTrans();
PDObject.insert();
PostInsert(MantForm);
MainWin.getSession().CerrarTrans();
RefreshTable();
int Tot=getObjectsTable().getRowCount();
if (Tot>0)
    {
    int Sel=Math.min(Tot-1, Pos);
    getObjectsTable().setRowSelectionInterval(Sel, Sel);
    }
} catch (PDException ex)
    {
    if (MainWin.getSession().isInTransaction())    
        {try{
            MainWin.getSession().AnularTrans();
            } catch (PDException ex1)
            {
            }
        }
    MainWin.Message(MainWin.DrvTT(ex.getLocalizedMessage()));
    }
}//GEN-LAST:event_CopyButtonActionPerformed

private void ExportButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ExportButtonActionPerformed
{//GEN-HEADEREND:event_ExportButtonActionPerformed
if (getObjectsTable().getSelectedRow()==-1)
    return;
PrintWriter PW =null;
try {
PDTableModel TM = (PDTableModel) getObjectsTable().getModel();
//String Name=(String)TM.getElement(getObjectsTable().getSelectedRow()).getAttr(PDUser.fNAME).getValue();
String Name=PDObject.getTabName();
String FileName=MainWin.SelectDestination(Name+".opd", "opd", true);
if (FileName.length()==0)
    return;
Record r=TM.getElement(getSelectedRow());
PW = new PrintWriter(FileName);
ExportXML(PW, r);
PW.flush();
PW.close();
} catch (Exception ex)
    {
     if (PW!=null)
        PW.close();
     MainWin.Message(MainWin.DrvTT(ex.getLocalizedMessage()));
    }
}//GEN-LAST:event_ExportButtonActionPerformed

private void ImportButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ImportButtonActionPerformed
{//GEN-HEADEREND:event_ImportButtonActionPerformed
int Pos=getObjectsTable().getSelectedRow();
if (Pos==-1)
    Pos=0;
String FileName=MainWin.SelectDestination(null, "opd", false);
if (FileName.length()==0)
    return;
try {
File FileImp=new File(FileName);  
MainWin.getSession().ProcessXML(FileImp, null); 
} catch (Exception ex)
    {
    MainWin.Message(MainWin.DrvTT(ex.getLocalizedMessage()));
    }
RefreshTable();
int Tot=getObjectsTable().getRowCount();
if (Tot>0)
    {
    int Sel=Math.min(Tot-1, Pos);
    getObjectsTable().setRowSelectionInterval(Sel, Sel);
    }
}//GEN-LAST:event_ImportButtonActionPerformed

private void ExportAllButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ExportAllButtonActionPerformed
{//GEN-HEADEREND:event_ExportAllButtonActionPerformed
String FileName=MainWin.SelectDestination("List_"+PDObject.getTabName()+".opd", "opd", true);
if (FileName.length()==0)
    return;
PrintWriter PW =null;
try{
PW = new PrintWriter(FileName);
ExportAllXML(PW);
PW.flush();
PW.close();
} catch (Exception ex)
    {
    if (PW!=null)
        PW.close();
    MainWin.Message(MainWin.DrvTT(ex.getLocalizedMessage()));
    }
}//GEN-LAST:event_ExportAllButtonActionPerformed

    private void ObjectsTableMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_ObjectsTableMouseClicked
    {//GEN-HEADEREND:event_ObjectsTableMouseClicked
if (evt.getClickCount()<2)
    return;
int Pos=getObjectsTable().getSelectedRow();
if (Pos==-1)
    return;
try {
MantForm=EditMode();
MantForm.setLocationRelativeTo(null);
} catch (PDException ex)
    {MainWin.Message(MainWin.DrvTT(ex.getLocalizedMessage()));
    }
while (true)
    {
    try {
    MantForm.setVisible(true);
    if (!EditModeOk())
        return;
    MainWin.getSession().IniciarTrans();
    PDObject.update();
    PostEdit(MantForm);
    MainWin.getSession().CerrarTrans();
    RefreshTable();
    int Tot=getObjectsTable().getRowCount();
    if (Tot>0)
        {
        int Sel=Math.min(Tot-1, Pos);
        getObjectsTable().setRowSelectionInterval(Sel, Sel);
        }
    return; 
   } catch (PDException ex)
        {
        if (MainWin.getSession().isInTransaction())    
            {try{
             MainWin.getSession().AnularTrans();
                } catch (PDException ex1)
                {
                }
            }
        MainWin.Message(MainWin.DrvTT(ex.getLocalizedMessage()));
        }
    }
    }//GEN-LAST:event_ObjectsTableMouseClicked

    private void ExpCSVActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ExpCSVActionPerformed
    {//GEN-HEADEREND:event_ExpCSVActionPerformed
String FileName=MainWin.SelectDestination("List_"+PDObject.getTabName()+".csv", "csv", true);
if (FileName.length()==0)
    return;
PrintWriter PW =null;
try{
PW = new PrintWriter(FileName);
ExportAllCSV(PW);
PW.flush();
PW.close();
} catch (Exception ex)
    {
    if (PW!=null)
        PW.close();
    MainWin.Message(MainWin.DrvTT(ex.getLocalizedMessage()));
    }
        
    }//GEN-LAST:event_ExpCSVActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton ButtonFilter;
    private javax.swing.JButton CopyButton;
    private javax.swing.JButton DelButton;
    private javax.swing.JButton EditButton;
    private javax.swing.JButton ExpCSV;
    private javax.swing.JButton ExportAllButton;
    private javax.swing.JButton ExportButton;
    private javax.swing.JButton ImportButton;
    private javax.swing.JTable ObjectsTable;
    private javax.swing.JTextField UserFilter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

//----------------------------------------------------------------
/**
 * 
 * @param ListName
 * @return
 */
static public DefaultComboBoxModel getComboModel(String ListName)
{
Vector VObjects=new Vector();
try {
DriverGeneric Session=MainWin.getSession();
ObjPD Obj = null;
if (ListName.equals("Roles"))
    Obj = new PDRoles(Session);
else if (ListName.equals("Users"))
    Obj = new PDUser(Session);
else if (ListName.equals("Groups"))
    Obj = new PDGroups(Session);
else if (ListName.equals("ACL"))
    Obj = new PDACL(Session);
else if (ListName.equals("Reposit"))
    Obj = new PDRepository(Session);
else if (ListName.equals("Authenticators"))
    Obj = new PDAuthenticators(Session);
else if (ListName.equals("Customizers"))
    Obj = new PDCustomization(Session);
Cursor CursorId = Obj.SearchLike("*");
Record Res=Session.NextRec(CursorId);
while (Res!=null)
    {
    Attribute Attr=Res.getAttr(PDRoles.fNAME); //it is the same name, but potential problems...
    VObjects.add(Attr.getValue());
    Res=Session.NextRec(CursorId);
    }
Session.CloseCursor(CursorId);
} catch (PDException ex)
    {
    MainWin.Message(MainWin.DrvTT(ex.getLocalizedMessage()));
    }
if (ListName.equals("Roles"))
    {
    CBMRoles=new DefaultComboBoxModel(VObjects);
    return(CBMRoles);
    }
else if (ListName.equals("Users"))
    {
    CBMUsers=new DefaultComboBoxModel(VObjects);
    return(CBMUsers);
    }
else if (ListName.equals("Groups"))
    {
    CBMGroups=new DefaultComboBoxModel(VObjects);
    return(CBMGroups);
    }
else if (ListName.equals("ACL"))
    {
    CBMACL=new DefaultComboBoxModel(VObjects);
    return(CBMACL);
    }
else if (ListName.equals("Reposit"))
    {
    CBMReposit=new DefaultComboBoxModel(VObjects);
    return(CBMReposit);
    }
else if (ListName.equals("Authenticators"))
    {
    CBMAuthenticators=new DefaultComboBoxModel(VObjects);
    return(CBMAuthenticators);
    }
else if (ListName.equals("Customizers"))
    {
    CBMCustomizers=new DefaultComboBoxModel(VObjects);
    return(CBMCustomizers);
    }
return(null);
}
//----------------------------------------------------------------
/**
 * 
 * @return
 */
protected PDTableModel getPDTableModel()
{
return ((PDTableModel) getObjectsTable().getModel());
}
//----------------------------------------------------------------
/**
 * 
 * @return
 */
protected int getSelectedRow()
{
return (getObjectsTable().convertRowIndexToModel(getObjectsTable().getSelectedRow()));
}
//----------------------------------------------------------------
/**
 * 
 * @return
 * @throws PDException
 */
abstract protected JDialog AddMode() throws PDException;
//--------------------------------------------------------------------
/**
 * 
 * @return
 * @throws PDException
 */
abstract protected boolean AddModeOk() throws PDException;
//--------------------------------------------------------------------
/**
 * 
 * @return
 * @throws PDException
 */
abstract protected JDialog DelMode() throws PDException;
//--------------------------------------------------------------------
/**
 * 
 * @return
 * @throws PDException
 */
abstract protected boolean DelModeOk() throws PDException;
//--------------------------------------------------------------------
/**
 * 
 * @return
 * @throws PDException
 */
abstract protected JDialog EditMode() throws PDException;
//--------------------------------------------------------------------
/**
 * 
 * @return
 * @throws PDException
 */
abstract protected boolean EditModeOk() throws PDException;
//--------------------------------------------------------------------
/**
 * 
 * @return
 * @throws PDException
 */
abstract protected JDialog CopyMode()  throws PDException;
//--------------------------------------------------------------------
/**
 * 
 * @return
 * @throws PDException
 */
abstract protected boolean CopyModeOk()  throws PDException;
/**
 * 
 */
abstract protected void AssignLabels();
//--------------------------------------------------------------------
/**
 * 
 * @return
 */
protected JButton getAddButton()
{ return AddButton; }
//--------------------------------------------------------------------
/**
 * 
 * @return
 */
protected JButton getDelButton()
{ return DelButton; }
//--------------------------------------------------------------------
/**
 * 
 * @return
 */
protected JButton getEditButton()
{ return EditButton; }
//--------------------------------------------------------------------
/**
 * 
 * @return
 */
protected JButton getCopyButton()
{ return CopyButton; }
//--------------------------------------------------------------------
/**
 * 
 * @return
 */
protected JButton getExportButton()
{ return ExportButton ;}
//--------------------------------------------------------------------
/**
 * 
 * @return
 */
protected JButton getExportAllButton()
{ return ExportAllButton ;}
//--------------------------------------------------------------------
/**
 * 
 * @return
 */
protected JButton getImportButton()
{ return ImportButton ;}
//--------------------------------------------------------------------
/**
 * 
 * @return
 */
protected JLabel getjLabel1()
{ return jLabel1 ;}
//--------------------------------------------------------------------
/**
 * 
 * @return
 */
protected JTextField getUserFilter()
{ return UserFilter ;}
//--------------------------------------------------------------------
/**
 * Do a query, filling with the results the grid.
 */
protected void RefreshTable()
{
try {
PDTableModel ObjectsList2 = new PDTableModel();
ObjectsList2.setDrv(MainWin.getSession());
ObjectsList2.setListFields(PDObject.getRecord());
ObjectsList2.setCursor(PDObject.SearchLike(UserFilter.getText()));
getObjectsTable().setModel(ObjectsList2);
if (!Filled) // first time
    {
    AddButton.setEnabled(true);
    EditButton.setEnabled(true);
    CopyButton.setEnabled(true);
    DelButton.setEnabled(true);
    ImportButton.setEnabled(true);
    ExportButton.setEnabled(true);
    ExportAllButton.setEnabled(true);
    ExpCSV.setEnabled(true);
    Filled=true;
    }
} catch (PDException ex)
    {
    MainWin.Message(MainWin.TT("Error_assigning_columns_to_table")+":"+MainWin.DrvTT(ex.getLocalizedMessage()));
    }
}
//--------------------------------------------------------------------
/**
* @return the ObjectsTable
*/
protected javax.swing.JTable getObjectsTable()
{
return ObjectsTable;
}
//--------------------------------------------------------------------
/* method to overwrite to do a postinsert operation
 * not abstract to avoid create in all clases
 * @throws PDException
 */
protected void PostInsert(JDialog D) throws PDException
{
}
//--------------------------------------------------------------------
/* method to overwrite to do a postedit operation
 * not abstract to avoid create in all clases
 * @throws PDException
 */
protected void PostEdit(JDialog D) throws PDException
{
}
//--------------------------------------------------------------------
/**
 * Exports the selected line to xml.
 * @param PW file to write the XML
 * @param r  Record selected to be exported
 * @throws Exception  
 */
private void ExportXML(PrintWriter PW, Record r) throws Exception
{
PW.print(PDObject.StartXML());    
PDObject.assignValues(r);   
PW.print(PDObject.toXML());
PW.print(PDObject.EndXML());    
}    
//--------------------------------------------------------------------
/**
 * Exports all the elements to xml.
 * @param PW file to write the XML
 * @throws Exception  in any error 
 */
private void ExportAllXML(PrintWriter PW) throws Exception
{
PDTableModel TM = (PDTableModel) getObjectsTable().getModel();
PW.print(PDObject.StartXML());    
for (int i = 0; i < TM.getRowCount(); i++)
    {
    Record r=TM.getElement(i);
    PDObject.assignValues(r);   
    PW.print(PDObject.toXML());
    } 
PW.print(PDObject.EndXML());    
}
//--------------------------------------------------------------------
/**
 * Exports all the elements to CSV
 * @param PW Destination of the CSV text
 * @throws Exception in any error
 */
private void ExportAllCSV(PrintWriter PW) throws Exception
{
PDTableModel TM = (PDTableModel) getObjectsTable().getModel();
boolean HeaderWrite=false;
for (int NumRow = 0; NumRow < TM.getRowCount(); NumRow++)
    {
    Record r=TM.getElement(NumRow);
    if (!HeaderWrite)
        {
        r.initList();
        for (int NumAt = 0; NumAt < r.NumAttr(); NumAt++)
            {    
            Attribute At=r.nextAttr(); 
            PW.print(At.getName());
            if (NumAt<r.NumAttr()-1)
               PW.print(";");
            }
        PW.println("");
        HeaderWrite=true;
        }
    r.initList();
    for (int NumAt = 0; NumAt < r.NumAttr(); NumAt++)
        {
        Attribute At=r.nextAttr(); 
        PW.print(At.ToCSV());
        if (NumAt<r.NumAttr()-1)
           PW.print(";");
        }
    PW.println("");
    }    
}
//--------------------------------------------------------------------
}
