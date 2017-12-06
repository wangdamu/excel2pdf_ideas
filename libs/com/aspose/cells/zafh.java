package com.aspose.cells;

import java.util.ArrayList;
import java.util.HashMap;

class zafh
{
  private zafo a = null;
  
  zafh(zafo paramzafo)
  {
    this.a = paramzafo;
  }
  
  void a(zago paramzago, String paramString1, String paramString2, String paramString3, String paramString4)
    throws Exception
  {
    StreamProviderOptions localStreamProviderOptions = new StreamProviderOptions();
    zago localzago = this.a.a(paramzago, paramString1, paramString2, paramString3, paramString4, localStreamProviderOptions);
    localzago.a("<html>");
    localzago.b("<head>");
    localzago.b("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">");
    localzago.b("<meta name=\"ProgId\" content=\"Excel.Sheet\">");
    localzago.b("<meta name=\"Generator\" content=\"Microsoft Excel 11\">");
    if (this.a.m != null) {
      localzago.b("<link id=\"Main-File\" rel=\"Main-File\" href=\"../" + this.a.m + "\">");
    }
    localzago.b("");
    localzago.b("<script language=\"JavaScript\">");
    localzago.b("<!--");
    localzago.b("if (window.name!=\"frTabs\")");
    localzago.b(" window.location.replace(document.all.item(\"Main-File\").href);");
    localzago.b("//-->");
    localzago.b("</script>");
    localzago.b("<style>");
    localzago.b("<!--");
    localzago.b("A {");
    localzago.b("    text-decoration:none;");
    localzago.b("    color:#000000;");
    localzago.b("    font-size:9pt;");
    localzago.b("}");
    localzago.b("-->");
    localzago.b("</style>");
    localzago.b("</head>");
    localzago.b("<body topmargin='0' leftmargin='0' bgcolor=\"#808080\">");
    localzago.b("<table border='0' cellspacing='1'>");
    localzago.b(" <tr>");
    for (int i = 0; i < this.a.u.size(); i++)
    {
      Worksheet localWorksheet = (Worksheet)this.a.u.get(i);
      if ((localWorksheet.isVisible()) || (this.a.c().getExportHiddenWorksheet()))
      {
        String str1 = "sheet" + zagn.a(i + 1, 3) + ".htm";
        String str2 = (String)this.a.y.get(str1);
        String str3 = (str2 != null) && (this.a.c().isFullPathLink()) ? str2 : str1;
        localzago.b(" <td bgcolor=\"#FFFFFF\" nowrap><b><small><small>&nbsp;<a href=\"" + str3 + "\" target=\"frSheet\"><font face=\"Arial\" color=\"#000000\">" + localWorksheet.getName() + "</font></a>&nbsp;</small></small></b></td>");
      }
    }
    localzago.g();
    localzago.b(" </tr>");
    localzago.b("</table>");
    localzago.b("</body>");
    localzago.b("</html>");
    localzago.g();
    localzago.h();
    this.a.x.closeStream(localStreamProviderOptions);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zafh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */