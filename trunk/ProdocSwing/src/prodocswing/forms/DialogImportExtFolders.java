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
 * DialogEditFold.java
 *
 * Created on 28-mar-2010, 20:14:35
 */

package prodocswing.forms;

import java.io.File;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import prodoc.*;

/**
 *
 * @author jhierrot
 */
public class DialogImportExtFolders extends javax.swing.JDialog
{

private Record EditedDoc;
private boolean Cancel;

/**
 * 
 */
public File SelFolder=null;

/** Creates new form DialogEditFold
 * @param parent
 * @param modal 
 */
public DialogImportExtFolders(java.awt.Frame parent, boolean modal)
{
super(parent, modal);
initComponents();
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
        OrigFormatLabel = new javax.swing.JLabel();
        CBOrigFormat = new javax.swing.JComboBox();
        DeleteAfterImportLab = new javax.swing.JLabel();
        CheckDelete = new javax.swing.JCheckBox();
        LabelFoldType1 = new javax.swing.JLabel();
        FoldTypeCB = new javax.swing.JComboBox();
        DateFormatLab = new javax.swing.JLabel();
        DateFormatTF = new javax.swing.JTextField();
        TimeStampForLab = new javax.swing.JLabel();
        TimeStampForTF = new javax.swing.JTextField();
        FilePathLabel = new javax.swing.JLabel();
        FilePathTextField = new javax.swing.JTextField();
        ButtonSelFile = new javax.swing.JButton();
        ButtonAcept = new javax.swing.JButton();
        ButtonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(MainWin.TT("Import_Folders"));
        setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
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
        LabelOperation.setText(MainWin.TT("Import_Folders"));

        OrigFormatLabel.setFont(MainWin.getFontDialog());
        OrigFormatLabel.setText(MainWin.TT("Origin_System"));

        CBOrigFormat.setFont(MainWin.getFontDialog());
        CBOrigFormat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Abby", "Kofax" }));

        DeleteAfterImportLab.setFont(MainWin.getFontDialog());
        DeleteAfterImportLab.setText(MainWin.TT("Delete_After_Import"));

        CheckDelete.setFont(MainWin.getFontDialog());

        LabelFoldType1.setFont(MainWin.getFontDialog());
        LabelFoldType1.setText(MainWin.TT("Folder_Type"));

        FoldTypeCB.setFont(MainWin.getFontDialog());
        FoldTypeCB.setModel(getComboModelFold());

        DateFormatLab.setFont(MainWin.getFontDialog());
        DateFormatLab.setText(MainWin.TT("Date_format"));

        DateFormatTF.setFont(MainWin.getFontDialog());
        DateFormatTF.setText("yyyy-MM-dd");

        TimeStampForLab.setFont(MainWin.getFontDialog());
        TimeStampForLab.setText(MainWin.TT("TimeStamp_format"));

        TimeStampForTF.setFont(MainWin.getFontDialog());
        TimeStampForTF.setText("yyyy-MM-dd HH:mm:ss");

        FilePathLabel.setFont(MainWin.getFontDialog());
        FilePathLabel.setText(MainWin.TT("Source_Folder"));

        FilePathTextField.setFont(MainWin.getFontDialog());

        ButtonSelFile.setFont(MainWin.getFontDialog());
        ButtonSelFile.setText("Sel");
        ButtonSelFile.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonSelFileActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DeleteAfterImportLab, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TimeStampForLab, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FilePathLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelFoldType1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OrigFormatLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DateFormatLab, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CheckDelete)
                            .addComponent(TimeStampForTF, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FilePathTextField)
                            .addComponent(CBOrigFormat, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FoldTypeCB, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DateFormatTF, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonSelFile, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ButtonAcept)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonCancel)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LabelOperation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {DateFormatLab, DeleteAfterImportLab, FilePathLabel, LabelFoldType1, OrigFormatLabel, TimeStampForLab});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelOperation)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBOrigFormat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OrigFormatLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CheckDelete)
                    .addComponent(DeleteAfterImportLab))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelFoldType1)
                    .addComponent(FoldTypeCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateFormatTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateFormatLab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TimeStampForTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TimeStampForLab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FilePathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FilePathLabel)
                    .addComponent(ButtonSelFile))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonAcept)
                    .addComponent(ButtonCancel))
                .addGap(62, 62, 62))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCancelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonCancelActionPerformed
    {//GEN-HEADEREND:event_ButtonCancelActionPerformed
Cancel=true;
this.dispose();
}//GEN-LAST:event_ButtonCancelActionPerformed

    private void ButtonAceptActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonAceptActionPerformed
    {//GEN-HEADEREND:event_ButtonAceptActionPerformed
if (SelFolder==null)
    {
    SelFolder=new File(FilePathTextField.getText());
    }
Cancel = false;
this.dispose();
}//GEN-LAST:event_ButtonAceptActionPerformed

    private void ButtonSelFileActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonSelFileActionPerformed
    {//GEN-HEADEREND:event_ButtonSelFileActionPerformed
JFileChooser fc = new JFileChooser();
fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
int returnVal = fc.showOpenDialog(this);
if (returnVal == JFileChooser.APPROVE_OPTION)
    {
    SelFolder = fc.getSelectedFile();
    FilePathTextField.setText(SelFolder.getAbsolutePath());
    }
    }//GEN-LAST:event_ButtonSelFileActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
Cancel=true;
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAcept;
    private javax.swing.JButton ButtonCancel;
    private javax.swing.JButton ButtonSelFile;
    private javax.swing.JComboBox CBOrigFormat;
    private javax.swing.JCheckBox CheckDelete;
    private javax.swing.JLabel DateFormatLab;
    private javax.swing.JTextField DateFormatTF;
    private javax.swing.JLabel DeleteAfterImportLab;
    private javax.swing.JLabel FilePathLabel;
    private javax.swing.JTextField FilePathTextField;
    private javax.swing.JComboBox FoldTypeCB;
    private javax.swing.JLabel LabelFoldType1;
    private javax.swing.JLabel LabelOperation;
    private javax.swing.JLabel OrigFormatLabel;
    private javax.swing.JLabel TimeStampForLab;
    private javax.swing.JTextField TimeStampForTF;
    // End of variables declaration//GEN-END:variables

//----------------------------------------------------------------
/**
* @return the Folder edited
*/
public Record getRecord()
{
return EditedDoc;
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
 * Obtains a list of clases of type Doc allowed to the user
 * @return a DefaultComboModel with names of classes of Docs
 */
private DefaultComboBoxModel getComboModelDoc()
{
Vector VObjects=new Vector();
try {
DriverGeneric Session=MainWin.getSession();
PDObjDefs Obj = new PDObjDefs(Session);
Cursor CursorId = Obj.getListDocs();
Record Res=Session.NextRec(CursorId);
while (Res!=null)
    {
    Attribute Attr=Res.getAttr(PDObjDefs.fNAME);
    VObjects.add(Attr.getValue());
    Res=Session.NextRec(CursorId);
    }
} catch (PDException ex)
    {
    MainWin.Message(ex.getLocalizedMessage());
    }
return(new DefaultComboBoxModel(VObjects));
}
//----------------------------------------------------------------
/**
 * Obtains a list of clases of type folder allowed to the user
 * @return a DefaultComboModel with names of classes of folder
 */
private DefaultComboBoxModel getComboModelFold()
{
Vector VObjects=new Vector();
try {
DriverGeneric Session=MainWin.getSession();
PDObjDefs Obj = new PDObjDefs(Session);
Cursor CursorId = Obj.getListFold();
Record Res=Session.NextRec(CursorId);
while (Res!=null)
    {
    Attribute Attr=Res.getAttr(PDObjDefs.fNAME);
    VObjects.add(Attr.getValue());
    Res=Session.NextRec(CursorId);
    }
} catch (PDException ex)
    {
    MainWin.Message("Error"+ex.getLocalizedMessage());
    }
return(new DefaultComboBoxModel(VObjects));
}
//----------------------------------------------------------------
public String ImpFormat()
{
return((String)CBOrigFormat.getSelectedItem());  
}    
//----------------------------------------------------------------
public boolean DeleteAfterImport()
{
return(CheckDelete.isSelected());  
}    
//----------------------------------------------------------------
public String DefaultFoldType()
{
return((String)FoldTypeCB.getSelectedItem());  
}    
//----------------------------------------------------------------
public String DateFormat()
{
return(DateFormatTF.getText());  
}    
//----------------------------------------------------------------
public String TimeStampFormat()
{
return(TimeStampForTF.getText());  
}    
//----------------------------------------------------------------
}