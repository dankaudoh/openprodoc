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

package prodocUI.servlet;

import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import prodoc.PDFolders;

/**
 *
 * @author jhierrot
 */
public class RefreshDocs extends SParent
{
static private String List=PDFolders.fACL+"/"+PDFolders.fFOLDTYPE+"/"+PDFolders.fPARENTID+"/"+PDFolders.fPDID+"/"+PDFolders.fTITLE+"/"+PDFolders.fPDAUTOR+"/"+PDFolders.fPDDATE;

//-----------------------------------------------------------------------------------------------
/**
 *
 * @param Req
 * @param out
 * @throws Exception
 */
@Override
protected void ProcessPage(HttpServletRequest Req, PrintWriter out) throws Exception
{
HttpSession Sess=Req.getSession(true);
String NewTabId=Req.getParameter("NewTabId");
if (NewTabId==null)
    NewTabId="T0";
Sess.setAttribute("NewTabId", NewTabId);
String I=Req.getParameter("RowI");
if (I==null)
    I="0";
Sess.setAttribute("RowI", I);
//String CarpId=Req.getParameter("FoldId");
//if (CarpId==null)
//    {
//    CarpId=SParent.getActFolderId(Req);
//    if (CarpId==null)
//        CarpId=PDFolders.ROOTFOLDER;
//    }
//SParent.setActFoldId(Req, CarpId);
//FListDocs fm=new FListDocs(Req, CarpId);
//out.println(fm.ToHtml(Sess));
GenListForm(Req, out, LISTDOC_FORM, null, null);
}
//-----------------------------------------------------------------------------------------------

/**
 * Returns a short description of the servlet.
 * @return a String containing servlet description
 */
@Override
public String getServletInfo()
{
return "RefreshDocs Servlet";
}
//-----------------------------------------------------------------------------------------------
static public String getUrlServlet()
{
return("RefreshDocs");
}
//-----------------------------------------------------------------------------------------------
}
