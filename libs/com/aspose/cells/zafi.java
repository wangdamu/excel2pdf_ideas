package com.aspose.cells;

import com.aspose.cells.b.a.b.za;
import com.aspose.cells.b.a.b.zj;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zk;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class zafi
{
  private Workbook a = null;
  private Worksheet b = null;
  private int c;
  private HtmlSaveOptions d = null;
  private zafo e = null;
  private String f;
  
  zafi(zafo paramzafo, int paramInt, String paramString, HtmlSaveOptions paramHtmlSaveOptions)
  {
    this.d = paramHtmlSaveOptions;
    this.e = paramzafo;
    this.c = paramInt;
    this.a = paramzafo.j;
    if (paramInt != -1) {
      this.b = ((Worksheet)paramzafo.u.get(paramInt));
    } else {
      this.b = ((Worksheet)paramzafo.u.get(0));
    }
    this.f = paramString;
  }
  
  String a(zago paramzago, String paramString1, String paramString2, String paramString3, String paramString4, HtmlSaveOptions paramHtmlSaveOptions)
    throws Exception
  {
    this.d = paramHtmlSaveOptions;
    this.f = paramString2;
    this.a.i();
    if (this.c == -1) {
      return null;
    }
    String str = "sheet" + zagn.a(this.c + 1, 3) + ".htm";
    StreamProviderOptions localStreamProviderOptions = new StreamProviderOptions();
    zago localzago = this.e.a(str, paramzago, paramString1, paramString2, paramString3, paramString4, localStreamProviderOptions);
    if (this.d.getExportDataOptions() == 255)
    {
      localzago.a("<!doctype html public \"-//w3c//dtd xhtml 1.0 transitional//en\" \"http://www.w3.org/tr/xhtml1/dtd/xhtml1-transitional.dtd\">");
      localzago.g();
      localzago.a(true, this.b.getDisplayRightToLeft());
      localzago.g();
      localzago.d();
      localzago.a(false);
      f(localzago);
      g(localzago);
      localzago.b("<!--[if gte mso 9]><xml>");
      d(localzago);
      a(localzago);
      localzago.b("</xml><![endif]-->");
      localzago.e();
      localzago.g();
    }
    b(localzago, paramString1, paramString2, paramString3, paramString4, paramHtmlSaveOptions);
    if (this.d.getExportDataOptions() == 255)
    {
      localzago.g();
      localzago.c();
      localzago.g();
    }
    localzago.h();
    this.e.x.closeStream(localStreamProviderOptions);
    return str;
  }
  
  String a(ArrayList paramArrayList, int paramInt1, int paramInt2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = paramInt1; i < paramInt2; i++)
    {
      if (i > paramInt1) {
        localStringBuilder.append(",");
      }
      CellArea localCellArea = (CellArea)paramArrayList.get(i);
      localStringBuilder.append(localCellArea.a());
    }
    return zs.a(localStringBuilder);
  }
  
  void a(zago paramzago)
    throws Exception
  {
    ConditionalFormattingCollection localConditionalFormattingCollection = this.b.getConditionalFormattings();
    for (int i = 0; i < localConditionalFormattingCollection.getCount(); i++)
    {
      FormatConditionCollection localFormatConditionCollection = localConditionalFormattingCollection.get(i);
      if (localFormatConditionCollection.getCount() == 0) {
        return;
      }
      paramzago.b("   <x:ConditionalFormatting>");
      if ((localFormatConditionCollection.b != null) && (localFormatConditionCollection.b.size() > 0))
      {
        String str1 = a(localFormatConditionCollection.b, 0, localFormatConditionCollection.b.size());
        paramzago.b("    <x:Range>" + str1 + "</x:Range>");
      }
      for (int j = 0; j < localFormatConditionCollection.getCount(); j++)
      {
        FormatCondition localFormatCondition = localFormatConditionCollection.get(j);
        paramzago.b("    <x:Condition>");
        if ((localFormatCondition.getType() == 0) && (localFormatCondition.b != 6))
        {
          str2 = zagn.b(localFormatCondition);
          if (str2 != null) {
            paramzago.b("     <x:Qualifier>" + str2 + "</x:Qualifier>");
          }
        }
        paramzago.b("     <x:Value1>" + zagn.h(localFormatCondition.getFormula1()) + "</x:Value1>");
        if ((localFormatCondition.b == 0) || (localFormatCondition.b == 7)) {
          paramzago.b("     <x:Value2>" + zagn.h(localFormatCondition.getFormula2()) + "</x:Value2>");
        }
        String str2 = zagn.a(localFormatCondition);
        String str3 = "Style='" + str2 + "'/>";
        paramzago.b("     <x:Format " + str3);
        paramzago.b("    </x:Condition>");
      }
      paramzago.b("   </x:ConditionalFormatting>");
    }
  }
  
  void b(zago paramzago)
    throws Exception
  {
    String str = this.b.d().m();
    if ((str == null) || ("Evaluation Warning".equals(this.b.getName()))) {
      return;
    }
    paramzago.b("<script>");
    paramzago.b("document.write(\"<div style='color:red;font-size:10pt;font-family:Arial'>");
    paramzago.a(str);
    paramzago.a("</div>\");");
    paramzago.b("</script>");
  }
  
  void b(zago paramzago, String paramString1, String paramString2, String paramString3, String paramString4, HtmlSaveOptions paramHtmlSaveOptions)
    throws Exception
  {
    int i = (this.b.w() != null) && (this.b.w().getCount() > 0) ? 1 : 0;
    Cells localCells = this.b.getCells();
    localCells.c = new zlt(localCells, 16383);
    localCells.b = new zlw(localCells, 16383);
    if (this.b.d != null) {
      this.b.d.a();
    }
    if (i != 0) {
      localCells.getRows().b(2);
    }
    try
    {
      Object localObject1;
      if (this.d.getExportDataOptions() == 255)
      {
        localObject1 = this.b.getCells().getColumns().a();
        StringBuilder localStringBuilder = new StringBuilder(100);
        localStringBuilder.append("<body link='blue' vlink='purple' ");
        if (this.b.getBackgroundImage() != null)
        {
          StreamProviderOptions localStreamProviderOptions = new StreamProviderOptions();
          int k = 0;
          ShapeCollection localShapeCollection = this.b.w();
          if (localShapeCollection != null) {
            k = localShapeCollection.getCount() + 1;
          } else {
            k = 1;
          }
          String str2 = "image00" + this.b.getIndex() + "_" + zauj.z(k) + "." + zaft.a(paramHtmlSaveOptions.getImageOptions());
          localStreamProviderOptions.a = (this.e.r + "/" + str2);
          this.e.x.initStream(localStreamProviderOptions);
          zj localzj = zj.a(new zh(this.b.getBackgroundImage()));
          Object localObject2;
          if (localzj.e().equals(ImageFormat.getBmp()))
          {
            localObject2 = new za(localzj);
            ((za)localObject2).a(localStreamProviderOptions.c, ImageFormat.getPng());
          }
          else if (this.d.getImageOptions().getSaveFormat() == 22)
          {
            localObject2 = new Picture(this.b.getShapes());
            ((Picture)localObject2).setWidth(localzj.i());
            ((Picture)localObject2).setHeight(localzj.h());
            ((Picture)localObject2).setData(this.b.getBackgroundImage());
            ((Picture)localObject2).a(localStreamProviderOptions.c, this.d.getImageOptions());
          }
          else
          {
            localzj.a(localStreamProviderOptions.c, ImageFormat.getPng());
          }
          this.e.x.closeStream(localStreamProviderOptions);
          if (this.e.u.size() == 1) {
            str2 = localStreamProviderOptions.b == null ? localStreamProviderOptions.getDefaultPath() : localStreamProviderOptions.b;
          }
          localStringBuilder.append("background='").append(str2).append("' ");
        }
        int j = ((Column)localObject1).c();
        if ((j != 15) && (j != -1))
        {
          localStringBuilder.append("class='x").append(zauj.z(j)).append("'>");
          paramzago.b(zs.a(localStringBuilder));
        }
        else
        {
          localStringBuilder.append(">");
          paramzago.b(zs.a(localStringBuilder));
        }
        localStringBuilder = null;
        paramzago.g();
        if ((this.e.k != null) && (this.e.o != null))
        {
          String str1 = "<h1 style='color:black;font-family:Arial;font-size:14.0pt;font-weight:800;font-style:normal'>" + this.e.o + "</h1>";
          paramzago.b(str1);
        }
      }
      b(paramzago);
      if (this.b.getType() == 1)
      {
        localObject1 = new zafg(this.e, this.b, paramzago, paramString1, this.f, paramString3, paramString4, paramHtmlSaveOptions);
        ((zafg)localObject1).a(this.f);
        ((zafg)localObject1).a();
      }
      else if ((this.b.getType() == 2) && (this.e.q != null))
      {
        if (paramHtmlSaveOptions.getSaveFormat() != 17) {
          e(paramzago);
        } else {
          a(paramzago, paramHtmlSaveOptions);
        }
      }
      paramzago.g();
      if (this.e.d.get(Integer.valueOf(this.b.getIndex())) != null) {
        a(paramzago, (HashMap)this.e.d.get(Integer.valueOf(this.b.getIndex())));
      }
      a(paramzago, (ArrayList)this.e.e.get(Integer.valueOf(this.b.getIndex())), (HashMap)this.e.f.get(Integer.valueOf(this.b.getIndex())), (HashMap)this.e.g.get(Integer.valueOf(this.b.getIndex())));
      b(paramzago, (ArrayList)this.e.i.get(Integer.valueOf(this.b.getIndex())), (HashMap)this.e.h.get(Integer.valueOf(this.b.getIndex())), (HashMap)this.e.g.get(Integer.valueOf(this.b.getIndex())));
      if (this.d.getExportDataOptions() == 255) {
        paramzago.b("</body>");
      }
    }
    finally
    {
      localCells.l();
      localCells.k();
      if (i != 0) {
        localCells.getRows().b();
      }
      if (this.b.d != null) {
        this.b.d.b();
      }
      paramzago.h();
    }
    paramzago.g();
  }
  
  private void a(zago paramzago, HashMap paramHashMap)
    throws Exception
  {
    if (paramHashMap.size() <= 0) {
      return;
    }
    paramzago.b("<script language = 'javascript' type='text/javascript'>");
    paramzago.b(" var ie = !-[1,];");
    paramzago.b(" function ChangeIEBase64()");
    paramzago.b(" {");
    paramzago.b("  var img;");
    paramzago.b("  if (ie)");
    paramzago.b("  {");
    Set localSet = paramHashMap.keySet();
    Iterator localIterator = localSet.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      paramzago.b("   img=document.getElementById(\"" + str + "\");");
      paramzago.b("   img.src=\"data:image/png;base64," + (String)paramHashMap.get(str) + "\";");
    }
    paramzago.b("  }");
    paramzago.b(" }");
    paramzago.b(" ChangeIEBase64();");
    paramzago.b("</script>");
  }
  
  private void a(zago paramzago, ArrayList paramArrayList, HashMap paramHashMap1, HashMap paramHashMap2)
    throws Exception
  {
    if (((paramArrayList == null) || (paramArrayList.size() <= 0)) && ((paramHashMap1 == null) || (paramHashMap1.size() <= 0))) {
      return;
    }
    paramzago.b("<script language = 'javascript' type='text/javascript'>");
    paramzago.b(" function ChangeColspanHiddenData()");
    paramzago.b(" {");
    paramzago.b("   var node;");
    String str1 = null;
    StringBuilder localStringBuilder;
    Object localObject;
    if (paramArrayList != null)
    {
      localStringBuilder = new StringBuilder("var params=[");
      for (int i = 0; i < paramArrayList.size(); i++)
      {
        str1 = (String)paramArrayList.get(i);
        if ((paramHashMap2 != null) && (paramHashMap2.get(str1) != null)) {
          localStringBuilder.append("\"" + (String)paramHashMap2.get(str1) + "\",");
        } else {
          localStringBuilder.append("\"" + str1 + "\",");
        }
      }
      localObject = zs.a(localStringBuilder);
      localStringBuilder = null;
      paramzago.b("   " + ((String)localObject).substring(0, 0 + (((String)localObject).length() - 1)) + "];");
      paramzago.b("   for (var i = 0;i < params.length; i++)");
      paramzago.b("   {");
      paramzago.b("       node = document.getElementById(params[i]);");
      paramzago.b("       if (node != null)");
      paramzago.b("       {");
      paramzago.b("           node.style.display = \"none\";");
      paramzago.b("       }");
      paramzago.b("   }");
    }
    if (paramHashMap1 != null)
    {
      localStringBuilder = new StringBuilder("var ids=[");
      localObject = new StringBuilder("var spans=[");
      Set localSet = paramHashMap1.keySet();
      Iterator localIterator = localSet.iterator();
      while (localIterator.hasNext())
      {
        str1 = (String)localIterator.next();
        localStringBuilder.append("\"" + str1 + "\",");
        ((StringBuilder)localObject).append("\"" + (Integer)paramHashMap1.get(str1) + "\",");
      }
      String str2 = zs.a(localStringBuilder);
      localStringBuilder = null;
      paramzago.b("   " + str2.substring(0, 0 + (str2.length() - 1)) + "];");
      String str3 = zs.a(localObject);
      localObject = null;
      paramzago.b("   " + str3.substring(0, 0 + (str3.length() - 1)) + "];");
      paramzago.b("   for (var i = 0;i < ids.length; i++)");
      paramzago.b("   {");
      paramzago.b("       node=document.getElementById(ids[i]);");
      paramzago.b("       if (node != null)");
      paramzago.b("       {");
      paramzago.b("           node.colSpan=spans[i];");
      paramzago.b("       }");
      paramzago.b("   }");
    }
    paramzago.b(" }");
    paramzago.b(" ChangeColspanHiddenData();");
    paramzago.b("</script>");
  }
  
  private void b(zago paramzago, ArrayList paramArrayList, HashMap paramHashMap1, HashMap paramHashMap2)
    throws Exception
  {
    if (((paramArrayList == null) || (paramArrayList.size() <= 0)) && ((paramHashMap1 == null) || (paramHashMap1.size() <= 0))) {
      return;
    }
    paramzago.b("<script language = 'javascript' type='text/javascript'>");
    paramzago.b(" function ChangeRowspanHiddenData()");
    paramzago.b(" {");
    paramzago.b("   var node;");
    String str1 = null;
    StringBuilder localStringBuilder;
    Object localObject;
    if (paramArrayList != null)
    {
      localStringBuilder = new StringBuilder("var params=[");
      for (int i = 0; i < paramArrayList.size(); i++)
      {
        str1 = (String)paramArrayList.get(i);
        if ((paramHashMap2 != null) && (paramHashMap2.get(str1) != null)) {
          localStringBuilder.append("\"" + (String)paramHashMap2.get(str1) + "\",");
        } else {
          localStringBuilder.append("\"" + str1 + "\",");
        }
      }
      localObject = zs.a(localStringBuilder);
      localStringBuilder = null;
      paramzago.b("   " + ((String)localObject).substring(0, 0 + (((String)localObject).length() - 1)) + "];");
      paramzago.b("   for (var i = 0;i < params.length; i++)");
      paramzago.b("   {");
      paramzago.b("       node = document.getElementById(params[i]);");
      paramzago.b("       if (node != null)");
      paramzago.b("       {");
      paramzago.b("           node.style.display = \"\";");
      paramzago.b("       }");
      paramzago.b("   }");
    }
    if (paramHashMap1 != null)
    {
      localStringBuilder = new StringBuilder("var ids=[");
      localObject = new StringBuilder("var spans=[");
      Set localSet = paramHashMap1.keySet();
      Iterator localIterator = localSet.iterator();
      while (localIterator.hasNext())
      {
        str1 = (String)localIterator.next();
        localStringBuilder.append("\"" + str1 + "\",");
        ((StringBuilder)localObject).append("\"" + (Integer)paramHashMap1.get(str1) + "\",");
      }
      String str2 = zs.a(localStringBuilder);
      localStringBuilder = null;
      paramzago.b("   " + str2.substring(0, 0 + (str2.length() - 1)) + "];");
      String str3 = zs.a(localObject);
      localObject = null;
      paramzago.b("   " + str3.substring(0, 0 + (str3.length() - 1)) + "];");
      paramzago.b("   for (var i = 0;i < ids.length; i++)");
      paramzago.b("   {");
      paramzago.b("       node=document.getElementById(ids[i]);");
      paramzago.b("       if (node != null)");
      paramzago.b("       {");
      paramzago.b("           node.rowSpan=spans[i];");
      paramzago.b("       }");
      paramzago.b("   }");
    }
    paramzago.b(" }");
    paramzago.b(" ChangeRowspanHiddenData();");
    paramzago.b("</script>");
  }
  
  private void a(zago paramzago, HtmlSaveOptions paramHtmlSaveOptions)
    throws Exception
  {
    if (this.b.getCharts().getCount() == 0) {
      return;
    }
    Chart localChart = this.b.getCharts().get(0);
    if (localChart == null) {
      return;
    }
    za localza;
    try
    {
      int i = 0;
      if (localChart.getChartArea().getArea().getFormatting() == 1)
      {
        localChart.getChartArea().getArea().setFormatting(2);
        localChart.getChartArea().getArea().setForegroundColor(Color.getWhite());
        i = 1;
      }
      localza = localChart.E();
      if (i != 0) {
        localChart.getChartArea().getArea().setFormatting(1);
      }
      if (localza == null) {
        return;
      }
    }
    catch (Exception localException)
    {
      return;
    }
    String str1 = "Chart" + this.b.getName() + "." + zaft.a(paramHtmlSaveOptions.getImageOptions());
    str1 = zagn.d(str1);
    if (this.e.b())
    {
      if (this.e.w != null) {
        str1 = this.e.w + str1;
      } else {
        str1 = this.e.q + str1;
      }
    }
    else if (!this.e.a()) {
      str1 = this.e.r + zk.a + str1;
    }
    str1 = this.f + str1;
    String str2 = "<img src=\"" + str1 + "\" alt='1'>";
    paramzago.b(str2);
    zh localzh = new zh();
    localza.a(localzh, paramHtmlSaveOptions.getImageOptions().getImageFormat());
    byte[] arrayOfByte = localzh.o();
    paramzago.b().put(str1, arrayOfByte);
  }
  
  private void e(zago paramzago)
    throws Exception
  {
    if (this.b.getCharts().getCount() == 0) {
      return;
    }
    Chart localChart = this.b.getCharts().get(0);
    if (localChart == null) {
      return;
    }
    za localza;
    try
    {
      int i = 0;
      if (localChart.getChartArea().getArea().getFormatting() == 1)
      {
        localChart.getChartArea().getArea().setFormatting(2);
        localChart.getChartArea().getArea().setForegroundColor(Color.getWhite());
        i = 1;
      }
      localza = localChart.E();
      if (i != 0) {
        localChart.getChartArea().getArea().setFormatting(1);
      }
      if (localza == null) {
        return;
      }
    }
    catch (Exception localException)
    {
      return;
    }
    String str1 = "Chart" + this.b.getName() + ".jpg";
    str1 = zagn.d(str1);
    String str2 = this.e.r + "/" + str1;
    StreamProviderOptions localStreamProviderOptions = new StreamProviderOptions();
    localStreamProviderOptions.a = str2;
    this.e.x.initStream(localStreamProviderOptions);
    zm localzm = localStreamProviderOptions.c;
    Encoding localEncoding = this.e.c().getEncoding();
    if (localEncoding == null) {
      localEncoding = Encoding.getUTF8();
    }
    localza.a(localStreamProviderOptions.c, ImageFormat.getJpeg());
    this.e.x.closeStream(localStreamProviderOptions);
    if (this.e.b())
    {
      if (this.e.w != null) {
        str1 = this.e.w + str1;
      } else {
        str1 = this.e.q + str1;
      }
    }
    else if (!this.e.a()) {
      str1 = this.e.r + zk.a + str1;
    }
    String str3 = "<img src=\"" + str1 + "\" alt=1>";
    paramzago.b(str3);
  }
  
  private void f(zago paramzago)
    throws Exception
  {
    if (this.e.m != null) {
      paramzago.b("<link id=\"Main-File\" rel=\"Main-File\" href=\"../" + this.e.m + "\">");
    }
    String str = (String)this.e.y.get("filelist.xml");
    if ((str != null) && (this.e.c().isFullPathLink())) {
      paramzago.b("<link rel=\"File-List\" href=\"" + str + "\">");
    } else {
      paramzago.b("<link rel=\"File-List\" href=\"filelist.xml\">");
    }
    paramzago.b("<link rel=\"Edit-Time-Data\" href=\"editdata.mso\">");
  }
  
  private void g(zago paramzago)
    throws Exception
  {
    paramzago.b("<!--[if !mso]>");
    paramzago.b("<style>");
    paramzago.b("v\\\\:* {behavior:url(#default#VML);}");
    paramzago.b("o\\\\:* {behavior:url(#default#VML);}");
    paramzago.b("x\\\\:* {behavior:url(#default#VML);}");
    paramzago.b(".shape {behavior:url(#default#VML);}");
    paramzago.b("</style>");
    paramzago.b("<![endif]-->");
    String str1 = "sheet" + zagn.a(this.c + 1, 3) + ".htm";
    String str2 = (String)this.e.y.get(str1);
    Object localObject;
    if ((str2 != null) && (this.e.c().isFullPathLink()))
    {
      localObject = str2.substring(0, 0 + str2.indexOf(str1)) + "stylesheet.css";
      paramzago.b("<link rel=\"Stylesheet\" href=\"" + (String)localObject + "\">");
    }
    else
    {
      paramzago.b("<link rel=\"Stylesheet\" href=\"stylesheet.css\">");
    }
    paramzago.b("<style>");
    paramzago.b("<!--table");
    paramzago.b(" {mso-displayed-decimal-separator:\"\\.\";");
    paramzago.b(" mso-displayed-thousand-separator:\"\\,\";}");
    c(paramzago);
    if ((this.b != null) && (this.b.isGridlinesVisible()) && (this.e.c().getExportGridLines()))
    {
      localObject = new zaff(this.e);
      ((zaff)localObject).a(paramzago, this.b);
    }
    paramzago.b("-->");
    paramzago.b("</style>");
    if (this.e.m != null)
    {
      if (!this.e.c().getDisableDownlevelRevealedComments()) {
        paramzago.b("<![if !supportTabStrip]>");
      }
      paramzago.b("<script language=\"JavaScript\">");
      paramzago.b("<!--");
      paramzago.b("function fnUpdateTabs()");
      paramzago.b(" {");
      paramzago.b("  if (parent.window.g_iIEVer>=4) {");
      paramzago.b("   if (parent.document.readyState==\"complete\"");
      paramzago.b("    && parent.frames['frTabs'].document.readyState==\"complete\")");
      paramzago.b("   parent.fnSetActiveSheet(" + zauj.z(this.c) + ");");
      paramzago.b("  else");
      paramzago.b("   window.setTimeout(\"fnUpdateTabs();\",150);");
      paramzago.b(" }");
      paramzago.b("}");
      paramzago.b("");
      paramzago.b("if (window.name!=\"frSheet\")");
      paramzago.b(" window.location.replace(\"../" + this.e.m + "\");");
      paramzago.b("else");
      paramzago.b(" fnUpdateTabs();");
      paramzago.b("//-->");
      paramzago.b("</script>");
      if (!this.e.c().getDisableDownlevelRevealedComments()) {
        paramzago.b("<![endif]>");
      }
    }
  }
  
  private String a(String paramString)
  {
    return null != paramString ? zw.a(paramString, "\"", "\\0022") : "";
  }
  
  void c(zago paramzago)
    throws Exception
  {
    PageSetup localPageSetup = this.b.getPageSetup();
    paramzago.b("@page");
    paramzago.b(" {");
    String str1 = "\"" + a(localPageSetup.a(true, 1)) + "\"";
    String str2 = "\"" + a(localPageSetup.a(false, 1)) + "\"";
    str1 = str1.trim();
    str2 = str2.trim();
    if (str1.length() > 0) {
      paramzago.b(" mso-header-data:" + str1 + ";");
    }
    if (str2.length() > 0) {
      paramzago.b(" mso-footer-data:" + str2 + ";");
    }
    String str3 = zauj.b(localPageSetup.getTopMarginInch()) + "in " + zauj.b(localPageSetup.getRightMarginInch()) + "in " + zauj.b(localPageSetup.getBottomMarginInch()) + "in " + zauj.b(localPageSetup.getLeftMarginInch()) + "in;";
    paramzago.b(" margin:" + str3);
    paramzago.b(" mso-header-margin:" + zauj.b(localPageSetup.getHeaderMarginInch()) + "in;");
    paramzago.b(" mso-footer-margin:" + zauj.b(localPageSetup.getFooterMarginInch()) + "in;");
    if (!localPageSetup.isAutoFirstPageNumber()) {
      paramzago.b(" mso-page-numbers-start:" + zauj.z(localPageSetup.getFirstPageNumber()) + ";");
    }
    String str4 = localPageSetup.getOrientation() == 0 ? "Landscape" : "Portrait";
    paramzago.b(" mso-page-orientation:" + str4 + ";");
    if (localPageSetup.getCenterHorizontally()) {
      paramzago.b(" mso-horizontal-page-align:center;");
    }
    if (localPageSetup.getCenterVertically()) {
      paramzago.b(" mso-vertical-page-align:center;");
    }
    paramzago.b(" }");
  }
  
  void d(zago paramzago)
    throws Exception
  {
    long l = zagn.d(this.b.getCells().getStandardWidthPixels());
    paramzago.b("<x:WorksheetOptions>");
    paramzago.b(" <x:StandardWidth>" + l + "</x:StandardWidth>");
    if (!this.b.getPageSetup().isPercentScale()) {
      paramzago.b(" <x:FitToPage/>");
    }
    j(paramzago);
    k(paramzago);
    if (this.b.isSelected()) {
      paramzago.b(" <x:Selected/>");
    }
    if (!this.b.isVisible()) {
      paramzago.b(" <x:Visible>SheetHidden</x:Visible>");
    }
    if (!this.b.isGridlinesVisible()) {
      paramzago.b(" <x:DoNotDisplayGridlines/>");
    }
    if (!this.b.isRowColumnHeadersVisible()) {
      paramzago.b(" <x:DoNotDisplayHeadings/>");
    }
    if (this.b.getFirstVisibleColumn() != 0) {
      paramzago.b(" <x:LeftColumnVisible>" + zauj.z(this.b.getFirstVisibleColumn()) + "</x:LeftColumnVisible>");
    }
    if (this.b.getFirstVisibleRow() != 0) {
      paramzago.b(" <x:TopRowVisible>" + zauj.z(this.b.getFirstVisibleRow()) + "</x:TopRowVisible>");
    }
    i(paramzago);
    if (this.b.a() != null) {
      h(paramzago);
    }
    paramzago.b("</x:WorksheetOptions>");
  }
  
  private void h(zago paramzago)
    throws Exception
  {
    Protection localProtection = this.b.a();
    if (!localProtection.getAllowEditingContent()) {
      paramzago.b(" <x:ProtectContents>True</x:ProtectContents>");
    } else {
      paramzago.b(" <x:ProtectContents>False</x:ProtectContents>");
    }
    if (!localProtection.getAllowEditingObject()) {
      paramzago.b(" <x:ProtectObjects>True</x:ProtectObjects>");
    } else {
      paramzago.b(" <x:ProtectObjects>False</x:ProtectObjects>");
    }
    if (!localProtection.getAllowEditingScenario()) {
      paramzago.b(" <x:ProtectScenarios>True</x:ProtectScenarios>");
    } else {
      paramzago.b(" <x:ProtectScenarios>False</x:ProtectScenarios>");
    }
    if ((!localProtection.getAllowSelectingLockedCell()) || (!localProtection.getAllowSelectingUnlockedCell())) {
      if ((!localProtection.getAllowSelectingLockedCell()) && (!localProtection.getAllowSelectingUnlockedCell())) {
        paramzago.b(" <x:EnableSelection>NoSelection</x:EnableSelection>");
      } else {
        paramzago.b(" <x:EnableSelection>UnlockedCells</x:EnableSelection>");
      }
    }
    if (localProtection.getAllowFormattingCell()) {
      paramzago.b(" <x:AllowFormatCells/>");
    }
    if (localProtection.getAllowFormattingColumn()) {
      paramzago.b(" <x:AllowSizeCols/>");
    }
    if (localProtection.getAllowFormattingRow()) {
      paramzago.b(" <x:AllowSizeRows/>");
    }
    if (localProtection.getAllowInsertingColumn()) {
      paramzago.b(" <x:AllowInsertCols/>");
    }
    if (localProtection.getAllowInsertingRow()) {
      paramzago.b(" <x:AllowInsertRows/>");
    }
    if (localProtection.getAllowInsertingHyperlink()) {
      paramzago.b(" <x:AllowInsertHyperlinks/>");
    }
    if (localProtection.getAllowDeletingColumn()) {
      paramzago.b(" <x:AllowDeleteCols/>");
    }
    if (localProtection.getAllowDeletingRow()) {
      paramzago.b(" <x:AllowDeleteRows/>");
    }
    if (localProtection.getAllowSorting()) {
      paramzago.b(" <x:AllowSort/>");
    }
    if (localProtection.getAllowFiltering()) {
      paramzago.b(" <x:AllowFilter/>");
    }
    if (localProtection.getAllowUsingPivotTable()) {
      paramzago.b(" <x:AllowUsePivotTables/>");
    }
  }
  
  private void i(zago paramzago) {}
  
  private void j(zago paramzago)
    throws Exception
  {
    paramzago.b(" <x:Print>");
    PageSetup localPageSetup = this.b.getPageSetup();
    if (localPageSetup.getFitToPagesWide() != 1) {
      paramzago.b("  <x:FitWidth>" + zauj.z(localPageSetup.getFitToPagesWide()) + "</x:FitWidth>");
    }
    if (localPageSetup.getFitToPagesTall() != 1) {
      paramzago.b("  <x:FitHeight>" + zauj.z(localPageSetup.getFitToPagesTall()) + "</x:FitHeight>");
    }
    if (localPageSetup.getOrder() == 1) {
      paramzago.b("  <x:LeftToRight/>");
    }
    if (localPageSetup.getBlackAndWhite()) {
      paramzago.b("  <x:BlackAndWhite/>");
    }
    if (localPageSetup.getPrintDraft()) {
      paramzago.b("  <x:DraftQuality/>");
    }
    paramzago.b("  <x:ValidPrinterInfo/>");
    paramzago.b("  <x:PaperSizeIndex>" + zauj.z(localPageSetup.a()) + "</x:PaperSizeIndex>");
    if (localPageSetup.getZoom() != 100) {
      paramzago.b("  <x:Scale>" + zauj.z(localPageSetup.getZoom()) + "</x:Scale>");
    }
    paramzago.b("  <x:HorizontalResolution>" + zauj.z(localPageSetup.getPrintQuality()) + "</x:HorizontalResolution>");
    paramzago.b("  <x:VerticalResolution>" + zauj.z(localPageSetup.getPrintQuality()) + "</x:VerticalResolution>");
    if (localPageSetup.getPrintHeadings()) {
      paramzago.b("  <x:RowColHeadings/>");
    }
    if (localPageSetup.getPrintComments() == 2) {
      paramzago.b("  <x:CommentsLayout>SheetEnd</x:CommentsLayout>");
    } else if (localPageSetup.getPrintComments() == 0) {
      paramzago.b("  <x:CommentsLayout>InPlace</x:CommentsLayout>");
    }
    if (localPageSetup.getPrintErrors() == 3) {
      paramzago.b("  <x:PrintErrors>NA</x:PrintErrors>");
    } else if (localPageSetup.getPrintErrors() == 1) {
      paramzago.b("  <x:PrintErrors>Dash</x:PrintErrors>");
    } else if (localPageSetup.getPrintErrors() == 0) {
      paramzago.b("  <x:PrintErrors>Blank</x:PrintErrors>");
    }
    if (localPageSetup.getPrintGridlines()) {
      paramzago.b("  <x:Gridlines/>");
    }
    a(paramzago, localPageSetup, true);
    a(paramzago, localPageSetup, false);
    paramzago.b(" </x:Print>");
  }
  
  private void a(zago paramzago, PageSetup paramPageSetup, boolean paramBoolean)
    throws Exception
  {
    Picture localPicture = null;
    StreamProviderOptions localStreamProviderOptions = null;
    String str = "";
    byte[] arrayOfByte = null;
    for (int i = 0; i < 3; i++)
    {
      localPicture = paramPageSetup.getPicture(paramBoolean, i);
      arrayOfByte = null != localPicture ? localPicture.getData() : null;
      if ((null != arrayOfByte) && (this.d.getSaveFormat() != 17))
      {
        str = "image00" + this.b.getIndex() + "_" + zauj.z(localPicture.w()) + localPicture.getName() + "." + zaft.a(localPicture.getImageFormat());
        localStreamProviderOptions = new StreamProviderOptions();
        localStreamProviderOptions.a = (this.e.r + zk.a + str);
        this.e.x.initStream(localStreamProviderOptions);
        localStreamProviderOptions.c.b(arrayOfByte, 0, arrayOfByte.length);
        this.e.x.closeStream(localStreamProviderOptions);
        a(paramzago, localPicture, i, str, paramBoolean);
      }
    }
  }
  
  private void a(zago paramzago, Picture paramPicture, int paramInt, String paramString, boolean paramBoolean)
    throws Exception
  {
    if (paramBoolean) {
      paramzago.b("  <x:HeaderPicture>");
    } else {
      paramzago.b("  <x:FooterPicture>");
    }
    paramzago.b("   <x:Location>" + a(paramInt) + "</x:Location>");
    if (b(paramString)) {
      paramzago.b("   <x:Source>" + paramString + "</x:Source>");
    }
    if (a(paramPicture.getHeight())) {
      paramzago.b("   <x:Height>" + paramPicture.getHeight() + "</x:Height>");
    }
    if (a(paramPicture.getWidth())) {
      paramzago.b("   <x:Width>" + paramPicture.getWidth() + "</x:Width>");
    }
    if (paramPicture.isLockAspectRatio()) {
      paramzago.b("   <x:LockAspectRatio/>");
    }
    if (a(paramPicture.getFormatPicture().getBrightness())) {
      paramzago.b("   <x:Brightness>" + paramPicture.getFormatPicture().getBrightness() + "</x:Brightness>");
    }
    if (a(paramPicture.getFormatPicture().getContrast())) {
      paramzago.b("   <x:Contrast>" + paramPicture.getFormatPicture().getContrast() + "</x:Contrast>");
    }
    if ((paramPicture.getFormatPicture().isGray()) && (!paramPicture.getFormatPicture().isBiLevel())) {
      paramzago.b("   <x:ColorType>Grayscale</x:ColorType>");
    } else if ((paramPicture.getFormatPicture().isBiLevel()) && (paramPicture.getFormatPicture().isGray())) {
      paramzago.b("   <x:ColorType>BlackAndWhite</x:ColorType>");
    } else if ((!paramPicture.getFormatPicture().isGray()) && (!paramPicture.getFormatPicture().isBiLevel()) && (a(paramPicture.getFormatPicture().getBrightness())) && (a(paramPicture.getFormatPicture().getContrast()))) {
      paramzago.b("   <x:ColorType>Watermark</x:ColorType>");
    } else {
      paramzago.b("   <x:ColorType>Automatic</x:ColorType>");
    }
    if (a(paramPicture.getFormatPicture().getBottomCrop())) {
      paramzago.b("   <x:CropBottom>" + paramPicture.getFormatPicture().getBottomCrop() + "</x:CropBottom>");
    }
    if (a(paramPicture.getFormatPicture().getLeftCrop())) {
      paramzago.b("   <x:CropLeft>" + paramPicture.getFormatPicture().getLeftCrop() + "</x:CropLeft>");
    }
    if (a(paramPicture.getFormatPicture().getTopCrop())) {
      paramzago.b("   <x:CropTop>" + paramPicture.getFormatPicture().getTopCrop() + "</x:CropTop>");
    }
    if (a(paramPicture.getFormatPicture().getRightCrop())) {
      paramzago.b("   <x:CropRight>" + paramPicture.getFormatPicture().getRightCrop() + "</x:CropRight>");
    }
    if (paramBoolean) {
      paramzago.b("  </x:HeaderPicture>");
    } else {
      paramzago.b("  </x:FooterPicture>");
    }
  }
  
  private String a(int paramInt)
  {
    String str = "";
    switch (paramInt)
    {
    case 0: 
      str = "Left";
      break;
    case 1: 
      str = "Center";
      break;
    case 2: 
      str = "Right";
      break;
    }
    return str;
  }
  
  private boolean b(String paramString)
  {
    return (null != paramString) && (!paramString.equals(""));
  }
  
  private boolean a(double paramDouble)
  {
    return (paramDouble > 0.0D) || (paramDouble < 0.0D);
  }
  
  private void k(zago paramzago)
    throws Exception
  {
    int i = this.b.getZoom();
    int j = 60;
    if (this.b.isPageBreakPreview()) {
      paramzago.b(" <x:ShowPageBreakZoom/>");
    }
    if (i != 100) {
      paramzago.b(" <x:Zoom>" + zauj.z(i) + "</x:Zoom>");
    }
    if (j != 60) {
      paramzago.b(" <x:PageBreakZoom>" + zauj.z(j) + "</x:PageBreakZoom>");
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zafi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */