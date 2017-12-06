package com.aspose.cells;

import com.aspose.cells.a.c.zk;
import com.aspose.cells.b.a.c.za;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zafe
{
  private Workbook a;
  private int b = 0;
  private int c = 0;
  private Worksheet d = null;
  private zafi e = null;
  private boolean f = false;
  private zafo g = null;
  
  zafe(zafo paramzafo, String paramString, HtmlSaveOptions paramHtmlSaveOptions)
  {
    this.g = paramzafo;
    this.a = this.g.j;
    int i = this.g.u.size();
    if (i == 1)
    {
      this.d = ((Worksheet)this.g.u.get(0));
      this.e = new zafi(paramzafo, -1, paramString, paramHtmlSaveOptions);
    }
    else if (i == 0)
    {
      this.f = true;
    }
    int j = this.a.getWorksheets().getActiveSheetIndex();
    for (int k = 0; k < i; k++)
    {
      Worksheet localWorksheet = (Worksheet)this.g.u.get(k);
      if (localWorksheet.isVisible()) {
        this.c += 1;
      }
      if (localWorksheet.getIndex() == j) {
        this.b = k;
      }
    }
  }
  
  void a(zago paramzago, String paramString1, String paramString2, String paramString3, String paramString4, HtmlSaveOptions paramHtmlSaveOptions)
    throws Exception
  {
    zago localzago1 = this.g.a(paramzago, paramString1, paramString2, paramString3, paramString4);
    try
    {
      if (this.f)
      {
        a(localzago1);
        return;
      }
      zaff localzaff;
      if ((!this.g.a()) && (paramHtmlSaveOptions.getExportDataOptions() == 1))
      {
        this.e.b(localzago1, paramString1, paramString2, paramString3, paramString4, paramHtmlSaveOptions);
        String str = "stylesheet.css";
        StreamProviderOptions localStreamProviderOptions = new StreamProviderOptions();
        zago localzago2 = this.g.b(paramzago, paramString1, str, paramString3, paramString4, localStreamProviderOptions);
        localzago2.b("table");
        localzago2.b(" {mso-displayed-decimal-separator:\"\\.\";");
        localzago2.b(" mso-displayed-thousand-separator:\"\\,\";}");
        this.e.c(localzago2);
        localzago2.g();
        localzaff = new zaff(this.g);
        localzaff.a(localzago2);
        this.g.x.closeStream(localStreamProviderOptions);
        return;
      }
      boolean bool = (1 == this.a.getWorksheets().getCount()) && (this.a.getWorksheets().get(0).getDisplayRightToLeft());
      localzago1.a("<!doctype html public \"-//w3c//dtd xhtml 1.0 transitional//en\" \"http://www.w3.org/tr/xhtml1/dtd/xhtml1-transitional.dtd\">");
      localzago1.g();
      localzago1.a(true, bool);
      localzago1.g();
      localzago1.d();
      localzago1.a(this.g.a());
      d(localzago1);
      b(localzago1);
      if ((paramHtmlSaveOptions.getExportFrameScriptsAndProperties()) || (!this.g.a())) {
        e(localzago1);
      }
      if (this.g.a())
      {
        if (paramHtmlSaveOptions.getExportFrameScriptsAndProperties()) {
          f(localzago1);
        }
      }
      else {
        c(localzago1);
      }
      int i = this.g.j.getWorksheets().C().b();
      if ((paramHtmlSaveOptions.getExportFrameScriptsAndProperties()) || (!this.g.a())) {
        g(localzago1);
      }
      localzago1.e();
      if (this.g.a()) {
        i(localzago1);
      } else {
        this.e.b(localzago1, paramString1, paramString2, paramString3, paramString4, paramHtmlSaveOptions);
      }
      int j = this.g.j.getWorksheets().C().b();
      if (j != i)
      {
        localzago1.b("<style>");
        localzago1.b("<!--");
        localzaff = new zaff(this.g);
        zajm localzajm = this.g.j.getWorksheets().C();
        for (int k = i; k < j; k++) {
          localzaff.a(localzago1, localzajm.a(k), k);
        }
        localzago1.b("-->");
        localzago1.b("</style>");
      }
      localzago1.c();
      localzago1.g();
      localzago1.h();
    }
    finally
    {
      if ((!this.g.b()) && (localzago1 != null) && (paramzago == null)) {
        localzago1.f();
      }
    }
  }
  
  private void a(zago paramzago)
    throws Exception
  {
    paramzago.a("<!doctype html public \"-//w3c//dtd xhtml 1.0 transitional//en\" \"http://www.w3.org/tr/xhtml1/dtd/xhtml1-transitional.dtd\">");
    paramzago.g();
    paramzago.a(true, false);
    paramzago.g();
    paramzago.d();
    paramzago.a(false);
    b(paramzago);
    e(paramzago);
    paramzago.e();
    paramzago.b("<body link='blue' vlink='purple'>");
    paramzago.b("no sheets for display");
    paramzago.b("</body>");
    paramzago.c();
    paramzago.g();
    paramzago.f();
  }
  
  private void b(zago paramzago)
    throws Exception
  {
    if ((this.g.o == null) || (this.g.o.length() == 0)) {
      return;
    }
    String str = "<title>" + this.g.o + "</title>";
    paramzago.b(str);
  }
  
  private void c(zago paramzago)
    throws Exception
  {
    paramzago.b("<style>");
    paramzago.b("<!--table");
    paramzago.b(" {mso-displayed-decimal-separator:\"\\.\";");
    paramzago.b(" mso-displayed-thousand-separator:\"\\,\";}");
    this.e.c(paramzago);
    paramzago.g();
    zaff localzaff = new zaff(this.g);
    localzaff.a(paramzago);
    paramzago.b("-->");
    paramzago.b("</style>");
  }
  
  private void d(zago paramzago)
    throws Exception
  {
    String str = (String)this.g.y.get("filelist.xml");
    if (str != null) {
      paramzago.b("<link rel=\"File-List\" href=\"" + str + "\">");
    } else {
      paramzago.b("<link rel=\"File-List\" href=\"" + this.g.r + "/filelist.xml\">");
    }
    paramzago.b("<link rel=\"Edit-Time-Data\" href=\"" + this.g.r + "/editdata.mso\">");
    paramzago.b("<link rel=\"OLE-Object-Data\" href=\"" + this.g.r + "/oledata.mso\">");
  }
  
  private void e(zago paramzago)
    throws Exception
  {
    paramzago.b("<!--[if gte mso 9]><xml>");
    paramzago.b(" <o:DocumentProperties>");
    BuiltInDocumentPropertyCollection localBuiltInDocumentPropertyCollection = this.g.j.getWorksheets().getBuiltInDocumentProperties();
    String str1 = localBuiltInDocumentPropertyCollection.getTitle();
    if (str1.length() > 0) {
      paramzago.b("  <o:Title>" + zagn.a(str1) + "</o:Title>");
    }
    str1 = localBuiltInDocumentPropertyCollection.getSubject();
    if (str1.length() > 0) {
      paramzago.b("  <o:Subject>" + zagn.a(str1) + "</o:Subject>");
    }
    str1 = localBuiltInDocumentPropertyCollection.getAuthor();
    if (str1.length() > 0) {
      paramzago.b("  <o:Author>" + zagn.a(str1) + "</o:Author>");
    }
    str1 = localBuiltInDocumentPropertyCollection.getKeywords();
    if (str1.length() > 0) {
      paramzago.b("  <o:Keywords>" + zagn.a(str1) + "</o:Keywords>");
    }
    String str2 = localBuiltInDocumentPropertyCollection.getRevision();
    if (!"0".equals(str2)) {
      paramzago.b("  <o:Revision>" + str2 + "</o:Revision>");
    }
    double d1 = localBuiltInDocumentPropertyCollection.getTotalEditingTime();
    if (d1 > 0.0D) {
      paramzago.b("  <o:TotalTime>" + zauj.b(d1) + "</o:TotalTime>");
    }
    DateTime localDateTime = localBuiltInDocumentPropertyCollection.getLastPrinted();
    if (zk.b(localDateTime, DateTime.a))
    {
      str1 = localDateTime.a("yyyy-MM-dd\\THH:mm:ss\\Z", za.b());
      paramzago.b("  <o:LastPrinted>" + str1 + "</o:LastPrinted>");
    }
    localDateTime = localBuiltInDocumentPropertyCollection.getCreatedTime();
    if (zk.b(localDateTime, DateTime.a))
    {
      str1 = localDateTime.a("yyyy-MM-dd\\THH:mm:ss\\Z", za.b());
      paramzago.b("  <o:Created>" + str1 + "</o:Created>");
    }
    localDateTime = localBuiltInDocumentPropertyCollection.getLastSavedTime();
    if (zk.b(localDateTime, DateTime.a))
    {
      str1 = localDateTime.a("yyyy-MM-dd\\THH:mm:ss\\Z", za.b());
      paramzago.b("  <o:LastSaved>" + str1 + "</o:LastSaved>");
    }
    int i = localBuiltInDocumentPropertyCollection.getPages();
    if (i > 0) {
      paramzago.b("  <o:Pages>" + zauj.z(i) + "</o:Pages>");
    }
    i = localBuiltInDocumentPropertyCollection.getWords();
    if (i > 0) {
      paramzago.b("  <o:Words>" + zauj.z(i) + "</o:Words>");
    }
    i = localBuiltInDocumentPropertyCollection.getCharacters();
    if (i > 0) {
      paramzago.b("  <o:Characters>" + zauj.z(i) + "</o:Characters>");
    }
    str1 = localBuiltInDocumentPropertyCollection.getCategory();
    if (str1.length() > 0) {
      paramzago.b("  <o:Category>" + str1 + "</o:Category>");
    }
    str1 = localBuiltInDocumentPropertyCollection.getManager();
    if (str1.length() > 0) {
      paramzago.b("  <o:Manager>" + zagn.a(str1) + "</o:Manager>");
    }
    str1 = localBuiltInDocumentPropertyCollection.getCompany();
    if (str1.length() > 0) {
      paramzago.b("  <o:Company>" + zagn.a(str1) + "</o:Company>");
    }
    i = localBuiltInDocumentPropertyCollection.getBytes();
    if (i > 0) {
      paramzago.b("  <o:Bytes>" + zauj.z(i) + "</o:Bytes>");
    }
    i = localBuiltInDocumentPropertyCollection.getLines();
    if (i > 0) {
      paramzago.b("  <o:Lines>" + zauj.z(i) + "</o:Lines>");
    }
    i = localBuiltInDocumentPropertyCollection.getParagraphs();
    if (i > 0) {
      paramzago.b("  <o:Paragraphs>" + zauj.z(i) + "</o:Paragraphs>");
    }
    i = localBuiltInDocumentPropertyCollection.getCharactersWithSpaces();
    if (i > 0) {
      paramzago.b("  <o:CharactersWithSpaces>" + zauj.z(i) + "</o:CharactersWithSpaces>");
    }
    paramzago.b("</o:DocumentProperties>");
    paramzago.b("</xml><![endif]-->");
  }
  
  private void f(zago paramzago)
    throws Exception
  {
    if (!this.g.c().getDisableDownlevelRevealedComments()) {
      paramzago.b("<![if !supportTabStrip]>");
    }
    Object localObject;
    for (int i = 1; i <= this.c; i++)
    {
      localObject = (String)this.g.y.get("sheet" + zagn.a(i, 3) + ".htm");
      if (localObject != null) {
        paramzago.b("<link id=\"shLink\" href=\"" + (String)localObject + "\">");
      } else {
        paramzago.b("<link id=\"shLink\" href=\"" + this.g.r + "/sheet" + zagn.a(i, 3) + ".htm\">");
      }
    }
    paramzago.g();
    paramzago.b("<link id=\"shLink\">");
    paramzago.g();
    paramzago.b("<script language=\"JavaScript\">");
    paramzago.b("<!--");
    paramzago.b(" var c_lTabs=" + zauj.z(this.c) + ";");
    paramzago.g();
    paramzago.b(" var c_rgszSh=new Array(c_lTabs);");
    for (i = 0; i < this.g.u.size(); i++)
    {
      localObject = (Worksheet)this.g.u.get(i);
      if (!((Worksheet)localObject).isVisible()) {
        break;
      }
      paramzago.b(" c_rgszSh[" + zauj.z(i) + "]=\"" + zagn.c(((Worksheet)localObject).getName()) + "\";");
    }
    paramzago.g();
    paramzago.g();
    paramzago.g();
    zafc.a(paramzago, this.b);
    paramzago.b("</script>");
    if (!this.g.c().getDisableDownlevelRevealedComments()) {
      paramzago.b("<![endif]>");
    }
  }
  
  private void g(zago paramzago)
    throws Exception
  {
    paramzago.b("<!--[if gte mso 9]><xml>");
    paramzago.b(" <x:ExcelWorkbook>");
    paramzago.b("  <x:ExcelWorksheets>");
    if (this.g.a())
    {
      for (int i = 0; i < this.g.u.size(); i++)
      {
        Worksheet localWorksheet = (Worksheet)this.g.u.get(i);
        a(paramzago, localWorksheet, i + 1);
      }
    }
    else
    {
      paramzago.b("   <x:ExcelWorksheet>");
      paramzago.b("    <x:Name>" + a(this.d.getName()) + "</x:Name>");
      this.e.d(paramzago);
      this.e.a(paramzago);
      paramzago.b("   </x:ExcelWorksheet>");
    }
    paramzago.b("  </x:ExcelWorksheets>");
    if (this.g.a())
    {
      String str = (String)this.g.y.get("stylesheet.css");
      if (str != null) {
        paramzago.b("  <x:Stylesheet HRef=\"" + str + "\"/>");
      } else {
        paramzago.b("  <x:Stylesheet HRef=\"" + this.g.r + "/stylesheet.css\"/>");
      }
    }
    h(paramzago);
    paramzago.b(" </x:ExcelWorkbook>");
    j(paramzago);
    paramzago.b("</xml><![endif]-->");
  }
  
  private void a(zago paramzago, Worksheet paramWorksheet, int paramInt)
    throws Exception
  {
    paramzago.b("   <x:ExcelWorksheet>");
    paramzago.b("    <x:Name>" + a(paramWorksheet.getName()) + "</x:Name>");
    String str = (String)this.g.y.get("sheet" + zagn.a(paramInt, 3) + ".htm");
    if (str != null) {
      paramzago.b("    <x:WorksheetSource HRef=\"" + str + "\"/>");
    } else {
      paramzago.b("    <x:WorksheetSource HRef=\"" + this.g.r + "/sheet" + zagn.a(paramInt, 3) + ".htm\"/>");
    }
    paramzago.b("   </x:ExcelWorksheet>");
  }
  
  private void h(zago paramzago)
    throws Exception
  {
    WorksheetCollection localWorksheetCollection = this.g.j.getWorksheets();
    paramzago.b("  <x:WindowHeight>" + zauj.z(localWorksheetCollection.p().getSettings().v()) + "</x:WindowHeight>");
    paramzago.b("  <x:WindowWidth>" + zauj.z(localWorksheetCollection.p().getSettings().u()) + "</x:WindowWidth>");
    paramzago.b("  <x:WindowTopX>" + zauj.z(localWorksheetCollection.p().getSettings().s()) + "</x:WindowTopX>");
    paramzago.b("  <x:WindowTopY>" + zauj.z(localWorksheetCollection.p().getSettings().t()) + "</x:WindowTopY>");
    paramzago.b("  <x:RefModeR1C1/>");
    paramzago.b("  <x:TabRatio>" + zauj.z(localWorksheetCollection.p().getSettings().getSheetTabBarWidth()) + "</x:TabRatio>");
    paramzago.b("  <x:ActiveSheet>" + zauj.z(this.b) + "</x:ActiveSheet>");
    if (!localWorksheetCollection.p().getSettings().isHScrollBarVisible()) {
      paramzago.b("  <x:HideHorizontalScrollBar/>");
    }
    if (!localWorksheetCollection.p().getSettings().isVScrollBarVisible()) {
      paramzago.b("  <x:HideVerticalScrollBar/>");
    }
    if (!localWorksheetCollection.p().getSettings().getShowTabs()) {
      paramzago.b("  <x:HideWorkbookTabs/>");
    }
  }
  
  private void i(zago paramzago)
    throws Exception
  {
    paramzago.b("    <frameset rows=\"*,39\" border=\"0\" width=\"0\" frameborder=\"no\" framespacing=\"0\">");
    String str1 = "sheet" + zagn.a(this.b + 1, 3) + ".htm";
    String str2 = (String)this.g.y.get(str1);
    if (str2 != null) {
      paramzago.b("     <frame src=\"" + str2 + "\" name=\"frSheet\">");
    } else {
      paramzago.b("     <frame src=\"" + this.g.r + "/" + str1 + "\" name=\"frSheet\">");
    }
    paramzago.b("     <frame src=\"" + (String)this.g.y.get("tabstrip.htm") + "\" name=\"frTabs\" marginwidth=\"0\" marginheight=\"0\">");
    paramzago.b("     <noframes>");
    paramzago.b("      <body>");
    paramzago.b("       <p>This page uses frames, but your browser doesn't support them.</p>");
    paramzago.b("      </body>");
    paramzago.b("     </noframes>");
    paramzago.b("    </frameset>");
  }
  
  private void j(zago paramzago)
    throws Exception
  {
    Iterator localIterator = this.a.getWorksheets().getNames().iterator();
    while (localIterator.hasNext())
    {
      Name localName = (Name)localIterator.next();
      if (localName.r() != 1) {
        if ((zw.a(localName.getText().toLowerCase(), "print_area", true) == 0) || (zw.a(localName.getText().toLowerCase(), "print_titles", true) == 0))
        {
          a(paramzago, localName.getText(), localName.getSheetIndex(), localName.getRefersTo());
        }
        else
        {
          String str = localName.getRefersTo();
          if ((str != null) && (str.length() > 1))
          {
            str = str.substring(1);
            if ((str.indexOf("#REF!") != -1) || (str.equals("{}"))) {
              str = "#REF!";
            }
            int i = -1;
            if (localName.getSheetIndex() != 0) {
              for (int j = 0; j < this.g.u.size(); j++)
              {
                Worksheet localWorksheet = (Worksheet)this.g.u.get(j);
                if (localName.getSheetIndex() - 1 == localWorksheet.getIndex())
                {
                  i = j;
                  break;
                }
              }
            }
            paramzago.b(" <x:ExcelName>");
            paramzago.b("  <x:Name>" + a(localName.getText()) + "</x:Name>");
            if (localName.n()) {
              paramzago.b("  <x:Hidden/>");
            }
            if (i != -1) {
              paramzago.b("  <x:SheetIndex>" + i + "</x:SheetIndex>");
            }
            paramzago.b("  <x:Formula>" + a(str) + "</x:Formula>");
            paramzago.b(" </x:ExcelName>");
          }
        }
      }
    }
  }
  
  private void a(zago paramzago, String paramString1, int paramInt, String paramString2)
    throws Exception
  {
    if (("null".equals(paramString2)) || ("".equals(paramString2)) || (null == paramString2)) {
      return;
    }
    paramzago.b(" <x:ExcelName>");
    paramzago.b("  <x:Name>" + paramString1 + "</x:Name>");
    paramzago.b("  <x:SheetIndex>" + paramInt + "</x:SheetIndex>");
    paramzago.b("  <x:Formula>" + paramString2 + "</x:Formula>");
    paramzago.b(" </x:ExcelName>");
  }
  
  private String a(String paramString)
  {
    return zw.a(paramString, "&", "&amp;");
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zafe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */