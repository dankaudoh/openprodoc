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

package html;

import javax.servlet.http.HttpSession;

/**
 *
 * @author jhierrot
 */
public class FieldThes extends Field
{
private int Size=0;    
private String UrlImgSearch="";
private String AltImgSearch="";
private String AltImgExit="";
private String UrlImgExit="";
private String AltImgOk="";
private String UrlImgOk="";
private String AltImgInfo="";
private String UrlImgInfo="";
private String UrlImagArrowD="";

private String IdTes="";

//-----------------------------------------------------------------------------------------------    
    
/** Creates a new instance of Literal
 * @param pNombre 
 */
public FieldThes(String pNombre)
{
super(pNombre);    
}
//-----------------------------------------------------------------------------------------------    
/**
 * 
 * @param pSize
 */
public void setSize(int pSize)
{
Size = pSize;
}
//-----------------------------------------------------------------------------------------------    
private String getIdTes()
{
return IdTes;
}
//-----------------------------------------------------------------------------------------------    
/**
 * 
 * @param Sess 
 * @return
 */
@Override
public String ToHtml(HttpSession Sess)
{
StringBuilder Result=new StringBuilder(1900);   


Result.append("<div class=\"").append(getCSSClass()).append("\" id=\"").append(getCSSId()).append("P\" style=\"visibility: hidden;\">");
Result.append("<table id=\"").append(getCSSId()).append("T\">");
Result.append("<tbody><tr><td></td>");
Result.append("<td><input name=\"Entry\" class=\"FFormInput\" id=\"").append(getCSSId()).append("F\"></td>");
Result.append("<td><img onclick=\"FillListTerm('").append(getCSSId()).append("','").append(getIdTes()).append("')\" alt=\"").append(getAltImgSearch()).append("\" src=\"").append(getUrlImgSearch()).append("\">") ;
Result.append("<img onclick=\"NoVerSelThes('").append(getCSSId()).append("', '0')\" alt=\"").append(getAltImgExit()).append("\" src=\"").append(getUrlImgExit()).append("\"> ");
Result.append("<img onclick=\"NoVerSelThes('").append(getCSSId()).append("', '1')\" alt=\"").append(getAltImgOk()).append("\" src=\"").append(getUrlImgOk()).append("\"> ");
Result.append("<img onclick=\"InfoTerm('").append(getCSSId()).append("')\" alt=\"").append(getAltImgInfo()).append("\" src=\"").append(getUrlImgInfo()).append("\"> ");
Result.append("</td></tr><tr><td colspan=\"3\">");
Result.append("<select class=\"FFormInput\" onchange=\"SelOption('").append(getCSSId()).append("')\" size=\"4\" id=\"").append(getCSSId()).append("S\">");
Result.append("<option value=\"\"></option></select></td></tr></tbody></table></div>");
Result.append("<div class=\"MultiEdit\" id=\"").append(getCSSId()).append("P2\" style=\"visibility: hidden;\">");
Result.append("<table id=\"").append(getCSSId()).append("T1\">");
Result.append("<tbody><tr><td></td><td><img onclick=\"NoVerInfoTerm('").append(getCSSId()).append("', '1')\" alt=\"").append(getAltImgOk()).append("\" src=\"").append(getUrlImgOk()).append("\"></td>");
Result.append("</tr></tbody></table></div>");
if (MensStatus!=null && Activado)
    Result.append("<input onblur=\"this.form.Status.value=''\" onmouseout=\"this.form.Status.value=''\" onfocus=\"this.form.Status.value='").append(getMensStatus()).append("'\" onmouseover=\"this.form.Status.value='").append(getMensStatus()).append("'\" class=\"FFormInput\" value=\"\" onclick=\"VerSelThes('").append(getCSSId()).append("', '").append(getIdTes()).append("')\" readonly=\"readonly\" name=\"Attr1\" id=\"").append(getCSSId()).append("\">");
    Result.append("<img onclick=\"VerSelThes('").append(getCSSId()).append("', '").append(getIdTes()).append("')\" src=\"").append(getUrlImagArrowD()).append("\">");
return(Result.toString());  
}        
//-----------------------------------------------------------------------------------------------    
/**
 * @return the UrlImgSearch
 */
public String getUrlImgSearch()
{
return UrlImgSearch;
}
//-----------------------------------------------------------------------------------------------    
/**
 * @param UrlImgSearch the UrlImgSearch to set
 */
public void setUrlImgSearch(String UrlImgSearch)
{
this.UrlImgSearch = UrlImgSearch;
}
//-----------------------------------------------------------------------------------------------    
/**
 * @return the AltImgSearch
 */
public String getAltImgSearch()
{
return AltImgSearch;
}
//-----------------------------------------------------------------------------------------------    
/**
 * @param AltImgSearch the AltImgSearch to set
 */
public void setAltImgSearch(String AltImgSearch)
{
this.AltImgSearch = AltImgSearch;
}
//-----------------------------------------------------------------------------------------------    
/**
 * @return the AltImgExit
 */
public String getAltImgExit()
{
return AltImgExit;
}
//-----------------------------------------------------------------------------------------------    
/**
 * @param AltImgExit the AltImgExit to set
 */
public void setAltImgExit(String AltImgExit)
{
this.AltImgExit = AltImgExit;
}
//-----------------------------------------------------------------------------------------------    
/**
 * @return the UrlImgExit
 */
public String getUrlImgExit()
{
return UrlImgExit;
}
//-----------------------------------------------------------------------------------------------    
/**
 * @param UrlImgExit the UrlImgExit to set
 */
public void setUrlImgExit(String UrlImgExit)
{
this.UrlImgExit = UrlImgExit;
}
//-----------------------------------------------------------------------------------------------    
/**
 * @return the AltImgOk
 */
public String getAltImgOk()
{
return AltImgOk;
}
//-----------------------------------------------------------------------------------------------    
/**
 * @param AltImgOk the AltImgOk to set
 */
public void setAltImgOk(String AltImgOk)
{
this.AltImgOk = AltImgOk;
}
//-----------------------------------------------------------------------------------------------    
/**
 * @return the UrlImgOk
 */
public String getUrlImgOk()
{
return UrlImgOk;
}
//-----------------------------------------------------------------------------------------------    
/**
 * @param UrlImgOk the UrlImgOk to set
 */
public void setUrlImgOk(String UrlImgOk)
{
this.UrlImgOk = UrlImgOk;
}
//-----------------------------------------------------------------------------------------------    
/**
 * @return the AltImgInfo
 */
public String getAltImgInfo()
{
return AltImgInfo;
}
//-----------------------------------------------------------------------------------------------    
/**
 * @param AltImgInfo the AltImgInfo to set
 */
public void setAltImgInfo(String AltImgInfo)
{
this.AltImgInfo = AltImgInfo;
}
//-----------------------------------------------------------------------------------------------    
/**
 * @return the UrlImgInfo
 */
public String getUrlImgInfo()
{
return UrlImgInfo;
}
//-----------------------------------------------------------------------------------------------    
/**
 * @param UrlImgInfo the UrlImgInfo to set
 */
public void setUrlImgInfo(String UrlImgInfo)
{
this.UrlImgInfo = UrlImgInfo;
}
//-----------------------------------------------------------------------------------------------    
/**
 * @return the UrlImagArrowD
 */
public String getUrlImagArrowD()
{
return UrlImagArrowD;
}
//-----------------------------------------------------------------------------------------------    
/**
 * @param UrlImagArrowD the UrlImagArrowD to set
 */
public void setUrlImagArrowD(String UrlImagArrowD)
{
this.UrlImagArrowD = UrlImagArrowD;
}
//-----------------------------------------------------------------------------------------------    
/**
 * @param IdTes the IdTes to set
 */
public void setIdTes(String IdTes)
{
this.IdTes = IdTes;
}
//-----------------------------------------------------------------------------------------------    
}