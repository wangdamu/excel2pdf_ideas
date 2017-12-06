package com.aspose.cells;

import com.aspose.cells.a.c.zp;
import com.aspose.cells.b.a.d.zd;
import com.aspose.cells.b.a.d.zk;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zr;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;
import java.util.HashMap;

class zagc
{
  private static final za a = new za(new String[] { "Subject", "LastAuthor", "Keywords", "Description", "Category", "Manager", "Company", "Version", "shapetype", "shape", "position", "margin-left", "margin-top", "width", "height", "z-index", "visibility", "imagedata", "ClientData", "MoveWithCells", "SizeWithCells", "Locked", "PrintObject", "CF", "AutoPict", "1", "2", "3", "4", "5", "6", "7", "xx-small", "x-small", "small", "medium", "large", "x-large", "xx-large", "larger", "smaller", "font-style", "font-weight", "text-line-through", "text-underline-style", "color", "border-top", "border-right", "border-bottom", "border-left", "border", "background", "mso-pattern", "Left", "Center", "Right", "Blank", "Dash", "NA", "InPlace", "SheetEnd", "8", "9", "11", "12", "13", "43", "dateTime.tz", "boolean", "float", "string" });
  
  public static void a(zcju paramzcju, BuiltInDocumentPropertyCollection paramBuiltInDocumentPropertyCollection)
  {
    for (int i = 0; i < paramzcju.a(); i++)
    {
      zcjn localzcjn1 = (zcjn)paramzcju.a(i);
      zcju localzcju = localzcjn1.l();
      for (int j = 0; j < localzcju.a(); j++)
      {
        zcjs localzcjs = localzcju.a(j);
        if (!(localzcjs instanceof zcjx))
        {
          zcjn localzcjn2 = (zcjn)localzcjs;
          String str1 = localzcjn2.a();
          String str2 = localzcjn2.g;
          switch (a.a(str2))
          {
          case 0: 
            paramBuiltInDocumentPropertyCollection.setSubject(str1);
            break;
          case 1: 
            paramBuiltInDocumentPropertyCollection.setAuthor(str1);
            break;
          case 2: 
            paramBuiltInDocumentPropertyCollection.setKeywords(str1);
            break;
          case 3: 
            paramBuiltInDocumentPropertyCollection.setComments(str1);
            break;
          case 4: 
            paramBuiltInDocumentPropertyCollection.setCategory(str1);
            break;
          case 5: 
            paramBuiltInDocumentPropertyCollection.setManager(str1);
            break;
          case 6: 
            paramBuiltInDocumentPropertyCollection.setCompany(str1);
            break;
          case 7: 
            paramBuiltInDocumentPropertyCollection.setVersion(str1);
          }
        }
      }
    }
  }
  
  public static void a(zcju paramzcju, HashMap paramHashMap, String paramString, IStreamProvider paramIStreamProvider)
    throws Exception
  {
    for (int i = 0; i < paramzcju.a(); i++)
    {
      zcjn localzcjn1 = (zcjn)paramzcju.a(i);
      zcju localzcju = localzcjn1.l();
      for (int j = 0; j < localzcju.a(); j++)
      {
        zcjs localzcjs = localzcju.a(j);
        if (!(localzcjs instanceof zcjx))
        {
          zcjn localzcjn2 = (zcjn)localzcjs;
          String str = localzcjn2.g;
          switch (a.a(str))
          {
          case 8: 
            break;
          case 9: 
            zagf localzagf = new zagf();
            localzagf.a(localzcjn2.a("id"));
            localzagf.c(paramString);
            a(localzcjn2.a("style"), localzagf);
            a(localzcjn2.l(), localzagf, paramString, paramIStreamProvider);
            paramHashMap.put(localzagf.a(), localzagf);
          }
        }
      }
    }
  }
  
  private static void a(String paramString, zagf paramzagf)
  {
    String[] arrayOfString1 = zw.d(paramString, ';');
    for (String str1 : arrayOfString1)
    {
      String[] arrayOfString3 = zw.d(str1, ':');
      String str2 = e(arrayOfString3[0]);
      switch (a.a(str2))
      {
      case 10: 
        break;
      case 11: 
        paramzagf.a((int)zbxp.a(arrayOfString3[1]));
        break;
      case 12: 
        paramzagf.b((int)zbxp.a(arrayOfString3[1]));
        break;
      case 13: 
        paramzagf.c((int)zbxp.a(arrayOfString3[1]));
        break;
      case 14: 
        paramzagf.d((int)zbxp.a(arrayOfString3[1]));
        break;
      case 15: 
        break;
      case 16: 
        
      }
    }
  }
  
  private static void a(zcju paramzcju, zagf paramzagf, String paramString, IStreamProvider paramIStreamProvider)
    throws Exception
  {
    for (int i = 0; i < paramzcju.a(); i++)
    {
      zcjs localzcjs = paramzcju.a(i);
      if (!(localzcjs instanceof zcjx))
      {
        zcjn localzcjn = (zcjn)localzcjs;
        String str1 = localzcjn.g;
        switch (a.a(str1))
        {
        case 17: 
          String str2 = localzcjn.a("src");
          paramzagf.b(paramString + str2);
          Object localObject;
          if (!zd.c(paramzagf.c()))
          {
            localObject = new StreamProviderOptions();
            ((StreamProviderOptions)localObject).a = str2;
            ((StreamProviderOptions)localObject).b = paramzagf.c();
            paramIStreamProvider.initStream((StreamProviderOptions)localObject);
            zm localzm = ((StreamProviderOptions)localObject).c;
            if (localzm != null) {
              paramzagf.a(localzm);
            }
          }
          else
          {
            localObject = zd.b(paramzagf.c());
            paramzagf.a((zm)localObject);
          }
          break;
        case 18: 
          a(localzcjn.l(), paramzagf);
        }
      }
    }
  }
  
  private static void a(zcju paramzcju, zagf paramzagf)
  {
    for (int i = 0; i < paramzcju.a(); i++)
    {
      zcjs localzcjs = paramzcju.a(i);
      if (!(localzcjs instanceof zcjx))
      {
        zcjn localzcjn = (zcjn)localzcjs;
        String str = localzcjn.g;
        switch (a.a(str))
        {
        case 19: 
          paramzagf.e(0);
          break;
        case 20: 
          if (paramzagf.i() != 0) {
            paramzagf.e(1);
          }
          break;
        case 21: 
          paramzagf.a(Boolean.parseBoolean(localzcjn.a()));
          break;
        case 22: 
          paramzagf.b(Boolean.parseBoolean(localzcjn.a()));
          break;
        case 23: 
          break;
        case 24: 
          
        }
      }
    }
  }
  
  public static void a(Font paramFont, String paramString)
  {
    if ((paramString.endsWith("pt")) || (paramString.endsWith("px")) || (paramString.endsWith("in")))
    {
      double d = zbxp.a(paramString, "pt", zbxp.a());
      if ((d > 0.0D) && (d < 1.0D)) {
        d = 1.0D;
      }
      paramFont.setDoubleSize(zr.a(d));
    }
    else if (paramString.endsWith("%"))
    {
      paramString = paramString.substring(0, 0 + (paramString.length() - 1));
      paramFont.setDoubleSize(paramFont.getDoubleSize() * (zp.a(paramString) / 100.0D));
    }
    else if (paramString.endsWith("em"))
    {
      paramString = paramString.substring(0, 0 + (paramString.length() - 2));
      paramFont.setDoubleSize(paramFont.getDoubleSize() * zp.a(paramString));
    }
    else if (c(paramString))
    {
      paramFont.setDoubleSize(paramFont.getDoubleSize() * d(paramString));
    }
    else if (a(paramString))
    {
      paramFont.setDoubleSize(b(paramString));
    }
    else
    {
      if (paramString.indexOf("!important") != -1) {
        paramString = paramString.substring(0, 0 + (paramString.indexOf("!") - 1)).trim();
      }
      paramFont.setDoubleSize(zbxp.a(paramString, "pt", zbxp.a()));
    }
  }
  
  public static boolean a(String paramString)
  {
    switch (a.a(paramString))
    {
    case 25: 
    case 26: 
    case 27: 
    case 28: 
    case 29: 
    case 30: 
    case 31: 
      return true;
    }
    return zarb.c(paramString);
  }
  
  public static double b(String paramString)
  {
    if (zauj.F(paramString) > 7) {
      return 36.0D;
    }
    switch (a.a(paramString))
    {
    case 25: 
      return 7.5D;
    case 26: 
      return 10.0D;
    case 27: 
      return 12.0D;
    case 28: 
      return 13.5D;
    case 29: 
      return 18.0D;
    case 30: 
      return 24.0D;
    case 31: 
      return 36.0D;
    }
    return 10.0D;
  }
  
  public static boolean c(String paramString)
  {
    switch (a.a(paramString.toLowerCase()))
    {
    case 32: 
    case 33: 
    case 34: 
    case 35: 
    case 36: 
    case 37: 
    case 38: 
    case 39: 
    case 40: 
      return true;
    }
    return false;
  }
  
  public static double d(String paramString)
  {
    switch (a.a(paramString.toLowerCase()))
    {
    case 32: 
      return 0.8D;
    case 33: 
      return 1.0D;
    case 34: 
      return 1.2D;
    case 35: 
      return 1.4D;
    case 36: 
      return 1.8D;
    case 37: 
      return 2.4D;
    case 38: 
      return 3.6D;
    case 39: 
      return 1.2D;
    case 40: 
      return 0.75D;
    }
    return 1.0D;
  }
  
  public static void a(String paramString, Font paramFont)
  {
    paramString = zw.a(zw.a(paramString, "\"", ""), "'", "");
    if (paramString.indexOf("\r\n") != -1) {
      paramString = new com.aspose.cells.b.a.g.a.ze("[\\s]+").b(paramString, " ");
    }
    String[] arrayOfString = zw.d(paramString, ',');
    if (arrayOfString.length > 1) {
      paramFont.setName(arrayOfString[0]);
    } else {
      paramFont.setName(paramString);
    }
  }
  
  public static String e(String paramString)
  {
    return zw.a(zw.a(zw.a(zw.a(paramString, "\t", ""), "\n", ""), "\r", ""), " ", "");
  }
  
  public static void a(zcjm paramzcjm, Workbook paramWorkbook)
  {
    zcju localzcju1 = paramzcjm.c("x:HideWorkbookTabs");
    paramWorkbook.getSettings().setShowTabs(localzcju1.a() <= 0);
    zcju localzcju2 = paramzcjm.c("x:HideHorizontalScrollBar");
    paramWorkbook.getSettings().setHScrollBarVisible(localzcju2.a() <= 0);
    zcju localzcju3 = paramzcjm.c("x:HideVerticalScrollBar");
    paramWorkbook.getSettings().setVScrollBarVisible(localzcju3.a() <= 0);
  }
  
  public static void a(zcjm paramzcjm, zagd paramzagd)
    throws Exception
  {
    zcju localzcju1 = paramzcjm.c("x:WorksheetOptions");
    if (localzcju1.a() > 0) {
      for (int i = 0; i < localzcju1.a(); i++)
      {
        zcjn localzcjn = (zcjn)localzcju1.a(i);
        zcju localzcju2 = localzcjn.c("x:DoNotDisplayGridlines");
        if (localzcju2.a() > 0) {
          paramzagd.aa().setGridlinesVisible(false);
        } else {
          paramzagd.aa().setGridlinesVisible(true);
        }
        zcju localzcju3 = localzcjn.c("x:TopRowVisible");
        if (localzcju3.a() > 0) {
          paramzagd.aa().setFirstVisibleRow(zauj.F(zauz.a(localzcju3.a(0))));
        }
        zcju localzcju4 = localzcjn.c("x:LeftColumnVisible");
        if (localzcju4.a() > 0) {
          paramzagd.aa().setFirstVisibleColumn(zauj.F(zauz.a(localzcju4.a(0))));
        }
        zcju localzcju5 = localzcjn.c("x:FreezePanes");
        if (localzcju5.a() > 0) {
          a(localzcjn, paramzagd.aa());
        }
        zcju localzcju6 = localzcjn.c("x:DefaultRowHeight");
        if (localzcju6.a() > 0)
        {
          double d = zagn.i(zauz.a(localzcju6.a(0))) / 15.0D;
          paramzagd.aa().getCells().setStandardHeight(d * zafz.c / zafz.e);
        }
        zcju localzcju7 = localzcjn.c("x:StandardWidth");
        if (localzcju7.a() > 0) {}
        zcju localzcju8 = localzcjn.c("x:Zoom");
        if (localzcju8.a() > 0) {
          paramzagd.aa().setZoom(com.aspose.cells.b.a.ze.d(localzcju8.a(0).a()));
        }
        zcju localzcju9 = localzcjn.c("x:TabColorIndex");
        if (localzcju9.a() > 0)
        {
          int j = zauj.F(zauz.a(localzcju9.a(0)));
          paramzagd.aa().c(j);
        }
        zcju localzcju10 = localzcjn.c("x:DoNotDisplayHeadings");
        if (localzcju10.a() > 0) {
          paramzagd.aa().setRowColumnHeadersVisible(false);
        }
        zcju localzcju11 = localzcjn.c("x:Visible");
        if (localzcju11.a() > 0)
        {
          localObject = zauz.a(localzcju11.a(0));
          if ((((String)localObject).equals("SheetHidden")) || (((String)localObject).equals("SheetVeryHidden"))) {
            paramzagd.aa().setVisible(false);
          } else {
            paramzagd.aa().setVisible(true);
          }
        }
        Object localObject = localzcjn.c("x:ShowPageBreakZoom");
        if (((zcju)localObject).a() > 0)
        {
          paramzagd.aa().setPageBreakPreview(true);
          zcju localzcju12 = localzcjn.c("x:PageBreakZoom");
          if (localzcju12.a() > 0) {
            paramzagd.aa().setZoom(zauj.F(zauz.a(localzcju12.a(0))));
          }
        }
        c(paramzcjm, paramzagd);
      }
    }
  }
  
  public static void b(zcjm paramzcjm, zagd paramzagd)
  {
    Worksheet localWorksheet = paramzagd.aa();
    zcju localzcju = paramzcjm.c("x:ConditionalFormatting");
    ConditionalFormattingCollection localConditionalFormattingCollection = localWorksheet.getConditionalFormattings();
    FormatConditionCollection localFormatConditionCollection = null;
    zcjn localzcjn = null;
    if ((null != localzcju) && (localzcju.a() > 0)) {
      for (int i = 0; i < localzcju.a(); i++)
      {
        localzcjn = (zcjn)localzcju.a(i);
        localFormatConditionCollection = localConditionalFormattingCollection.get(localConditionalFormattingCollection.add());
        a(localzcjn, localFormatConditionCollection, localWorksheet);
      }
    }
  }
  
  private static void a(zcjn paramzcjn, FormatConditionCollection paramFormatConditionCollection, Worksheet paramWorksheet)
  {
    zcju localzcju = null;
    zcjn localzcjn = null;
    localzcju = paramzcjn.c("x:Range");
    String str;
    Object localObject1;
    Object localObject5;
    Object localObject3;
    Object localObject2;
    if ((null != localzcju) && (localzcju.a() > 0))
    {
      str = zauz.a(localzcju.a(0));
      localObject1 = zw.d(str, ',');
      com.aspose.cells.b.a.g.a.ze localze = new com.aspose.cells.b.a.g.a.ze("\\$?[a-zA-Z]{1,3}:\\$?[a-zA-Z]{1,3}");
      for (localObject5 : localObject1)
      {
        if (localze.d(((String)localObject5).trim()))
        {
          localObject3 = paramWorksheet.getCells().createRange((String)localObject5);
          localObject2 = CellArea.createCellArea(((Range)localObject3).getFirstRow(), ((Range)localObject3).getFirstColumn(), ((Range)localObject3).getRowCount(), ((Range)localObject3).getColumnCount());
        }
        else
        {
          localObject2 = (CellArea)CellArea.a(((String)localObject5).trim(), true);
        }
        paramFormatConditionCollection.addArea((CellArea)localObject2);
      }
    }
    localzcju = paramzcjn.c("x:Condition");
    if ((null != localzcju) && (localzcju.a() > 0))
    {
      str = "";
      localObject1 = "";
      localObject2 = "";
      localObject3 = "";
      int i = 6;
      int j = 0;
      HashMap localHashMap = new HashMap();
      localObject5 = null;
      for (int n = 0; n < localzcju.a(); n++)
      {
        localzcjn = (zcjn)localzcju.a(n);
        str = b(localzcjn.c("x:Qualifier"));
        localObject1 = b(localzcjn.c("x:Value1"));
        if ((null != localObject1) && (!"".equals(localObject1))) {
          localObject1 = "=" + zagn.b((String)localObject1);
        }
        localObject2 = b(localzcjn.c("x:Value2"));
        if ((null != localObject2) && (!"".equals(localObject2))) {
          localObject2 = "=" + zagn.b((String)localObject2);
        }
        localObject3 = a(localzcjn.c("x:Format"));
        HashMap[] arrayOfHashMap = { localHashMap };
        a((String)localObject3, arrayOfHashMap);
        localHashMap = arrayOfHashMap[0];
        if ((null == str) || ("".equals(str.trim())))
        {
          j = 1;
          i = 6;
        }
        else
        {
          i = zbek.a(str);
          j = 0;
        }
        ??? = paramFormatConditionCollection.addCondition(j, i, (String)localObject1, (String)localObject2);
        localObject5 = paramFormatConditionCollection.get(???);
        a(localHashMap, (FormatCondition)localObject5);
      }
    }
  }
  
  private static void a(HashMap paramHashMap, FormatCondition paramFormatCondition)
  {
    String str1 = "";
    String str2 = "";
    String str3 = "";
    String str4 = "";
    String str5 = "";
    String str6 = "";
    int i = 0;
    ArrayList localArrayList = new ArrayList(paramHashMap.keySet());
    for (int j = 0; j < localArrayList.size(); j++)
    {
      str1 = (String)localArrayList.get(j);
      str2 = (String)paramHashMap.get(str1);
      switch (a.a(str1))
      {
      case 41: 
        paramFormatCondition.getStyle().getFont().setItalic("italic".equals(str2));
        break;
      case 42: 
        paramFormatCondition.getStyle().getFont().setBold("700".equals(str2));
        break;
      case 43: 
        paramFormatCondition.getStyle().getFont().setStrikeout("single".equals(str2));
        break;
      case 44: 
        paramFormatCondition.getStyle().getFont().setUnderline(zbek.b(str2));
        break;
      case 45: 
        paramFormatCondition.getStyle().getFont().setColor(zauj.aN(str2));
        break;
      case 46: 
        if (-1 == str2.toLowerCase().indexOf("none"))
        {
          i = str2.lastIndexOf(' ');
          str4 = str2.substring(i).trim();
          str3 = str2.substring(0, 0 + (str2.length() - str4.length())).trim();
        }
        else
        {
          str4 = "#000000";
          str3 = "none";
        }
        paramFormatCondition.getStyle().getBorders().getByBorderType(4).setLineStyle(zbek.d(str3));
        paramFormatCondition.getStyle().getBorders().getByBorderType(4).setColor(f(str4));
        break;
      case 47: 
        if (-1 == str2.toLowerCase().indexOf("none"))
        {
          i = str2.lastIndexOf(' ');
          str4 = str2.substring(i).trim();
          str3 = str2.substring(0, 0 + (str2.length() - str4.length())).trim();
        }
        else
        {
          str4 = "#000000";
          str3 = "none";
        }
        paramFormatCondition.getStyle().getBorders().getByBorderType(2).setLineStyle(zbek.d(str3));
        paramFormatCondition.getStyle().getBorders().getByBorderType(2).setColor(f(str4));
        break;
      case 48: 
        if (-1 == str2.toLowerCase().indexOf("none"))
        {
          i = str2.lastIndexOf(' ');
          str4 = str2.substring(i).trim();
          str3 = str2.substring(0, 0 + (str2.length() - str4.length())).trim();
        }
        else
        {
          str4 = "#000000";
          str3 = "none";
        }
        paramFormatCondition.getStyle().getBorders().getByBorderType(8).setLineStyle(zbek.d(str3));
        paramFormatCondition.getStyle().getBorders().getByBorderType(8).setColor(f(str4));
        break;
      case 49: 
        if (-1 == str2.toLowerCase().indexOf("none"))
        {
          i = str2.lastIndexOf(' ');
          str4 = str2.substring(i).trim();
          str3 = str2.substring(0, 0 + (str2.length() - str4.length())).trim();
        }
        else
        {
          str4 = "#000000";
          str3 = "none";
        }
        paramFormatCondition.getStyle().getBorders().getByBorderType(1).setLineStyle(zbek.d(str3));
        paramFormatCondition.getStyle().getBorders().getByBorderType(1).setColor(f(str4));
        break;
      case 50: 
        if (-1 == str2.toLowerCase().indexOf("none"))
        {
          i = str2.lastIndexOf(' ');
          str4 = str2.substring(i).trim();
          str3 = str2.substring(0, 0 + (str2.length() - str4.length())).trim();
        }
        else
        {
          str4 = "#000000";
          str3 = "none";
        }
        paramFormatCondition.getStyle().getBorders().getByBorderType(4).setLineStyle(zbek.d(str3));
        paramFormatCondition.getStyle().getBorders().getByBorderType(4).setColor(f(str4));
        paramFormatCondition.getStyle().getBorders().getByBorderType(2).setLineStyle(zbek.d(str3));
        paramFormatCondition.getStyle().getBorders().getByBorderType(2).setColor(f(str4));
        paramFormatCondition.getStyle().getBorders().getByBorderType(8).setLineStyle(zbek.d(str3));
        paramFormatCondition.getStyle().getBorders().getByBorderType(8).setColor(f(str4));
        paramFormatCondition.getStyle().getBorders().getByBorderType(1).setLineStyle(zbek.d(str3));
        paramFormatCondition.getStyle().getBorders().getByBorderType(1).setColor(f(str4));
        break;
      case 51: 
        paramFormatCondition.getStyle().setBackgroundColor(f(str2));
        break;
      case 52: 
        i = str2.lastIndexOf(' ');
        if ((-1 == i) || ("auto".equals(str2)))
        {
          paramFormatCondition.getStyle().setPattern(0);
          paramFormatCondition.getStyle().setForegroundColor(Color.getBlack());
        }
        else if (-1 != i)
        {
          str5 = str2.substring(i).trim();
          str6 = str2.substring(0, 0 + (str2.length() - str5.length())).trim();
          paramFormatCondition.getStyle().setPattern(zbek.e(str5));
          paramFormatCondition.getStyle().setForegroundColor(f(str6));
        }
        break;
      }
    }
  }
  
  private static Color f(String paramString)
  {
    Color localColor = Color.getBlack();
    if (-1 != paramString.indexOf('#')) {
      localColor = zauj.s(zw.a(paramString, "#", ""));
    } else {
      localColor = zauj.aN(paramString);
    }
    return localColor;
  }
  
  private static void a(String paramString, HashMap[] paramArrayOfHashMap)
  {
    paramString = paramString.trim();
    paramArrayOfHashMap[0].clear();
    String[] arrayOfString1 = zw.d(paramString, ';');
    String[] arrayOfString2 = null;
    for (int i = 0; i < arrayOfString1.length; i++)
    {
      arrayOfString1[i] = arrayOfString1[i].trim();
      if ((null != arrayOfString1[i]) && (!"".equals(arrayOfString1[i])))
      {
        arrayOfString2 = zw.d(arrayOfString1[i], ':');
        arrayOfString2[0] = arrayOfString2[0].trim();
        if ((null != arrayOfString2[0]) && (!"".equals(arrayOfString2[0]))) {
          paramArrayOfHashMap[0].put(arrayOfString2[0], arrayOfString2[1].trim());
        }
      }
    }
  }
  
  private static String a(zcju paramzcju)
  {
    String str = "";
    if ((null != paramzcju) && (paramzcju.a() > 0)) {
      str = zauz.a((zcjn)paramzcju.a(0), "Style").h;
    }
    return str;
  }
  
  private static String b(zcju paramzcju)
  {
    String str = "";
    if ((null != paramzcju) && (paramzcju.a() > 0)) {
      str = zauz.a(paramzcju.a(0));
    }
    return str;
  }
  
  private static void c(zcjm paramzcjm, zagd paramzagd)
    throws Exception
  {
    Worksheet localWorksheet = paramzagd.aa();
    zcju localzcju = null;
    localzcju = paramzcjm.c("x:Scale");
    localWorksheet.getPageSetup().setZoom(a(localzcju, 100));
    localzcju = paramzcjm.c("x:FitWidth");
    localWorksheet.getPageSetup().setFitToPagesWide(a(localzcju, 1));
    localzcju = paramzcjm.c("x:FitHeight");
    localWorksheet.getPageSetup().setFitToPagesTall(a(localzcju, 1));
    localzcju = paramzcjm.c("x:PaperSizeIndex");
    localWorksheet.getPageSetup().setPaperSize(g(localzcju));
    localzcju = paramzcjm.c("x:HorizontalResolution");
    localWorksheet.getPageSetup().setPrintQuality(a(localzcju, 300));
    localzcju = paramzcjm.c("x:VerticalResolution");
    localWorksheet.getPageSetup().setPrintQuality(a(localzcju, 300));
    localzcju = paramzcjm.c("x:Selected");
    localWorksheet.setSelected((null != localzcju) && (1 == localzcju.a()));
    localzcju = paramzcjm.c("x:FitToPage");
    localWorksheet.getPageSetup().setPercentScale((null == localzcju) || (0 == localzcju.a()));
    localzcju = paramzcjm.c("x:LeftToRight");
    localWorksheet.getPageSetup().setOrder(f(localzcju));
    localzcju = paramzcjm.c("x:BlackAndWhite");
    localWorksheet.getPageSetup().setBlackAndWhite(e(localzcju));
    localzcju = paramzcjm.c("x:DraftQuality");
    localWorksheet.getPageSetup().setPrintDraft(e(localzcju));
    localzcju = paramzcjm.c("x:Gridlines");
    localWorksheet.getPageSetup().setPrintGridlines(e(localzcju));
    localzcju = paramzcjm.c("x:RowColHeadings");
    localWorksheet.getPageSetup().setPrintHeadings(e(localzcju));
    localzcju = paramzcjm.c("x:CommentsLayout");
    localWorksheet.getPageSetup().setPrintComments(d(localzcju));
    localzcju = paramzcjm.c("x:PrintErrors");
    localWorksheet.getPageSetup().setPrintErrors(c(localzcju));
    a(paramzcjm, paramzagd, false);
    a(paramzcjm, paramzagd, true);
  }
  
  private static void a(zcjm paramzcjm, zagd paramzagd, boolean paramBoolean)
    throws Exception
  {
    Worksheet localWorksheet = paramzagd.aa();
    zcju localzcju1 = null;
    if (paramBoolean) {
      localzcju1 = paramzcjm.c("x:HeaderPicture");
    } else {
      localzcju1 = paramzcjm.c("x:FooterPicture");
    }
    if (null == localzcju1) {
      return;
    }
    zcjn localzcjn = null;
    zcju localzcju2 = null;
    Picture localPicture = null;
    String str1 = "";
    com.aspose.cells.b.a.d.ze localze = null;
    byte[] arrayOfByte = null;
    String str2 = "";
    String str3 = paramzagd.a().j();
    for (int i = 0; i < localzcju1.a(); i++)
    {
      localzcjn = (zcjn)localzcju1.a(i);
      localzcju2 = localzcjn.c("x:Location");
      if ((null != localzcju2) && (localzcju2.a() > 0)) {
        str2 = zauz.a(localzcju2.a(0));
      }
      localzcju2 = localzcjn.c("x:Source");
      if ((null != localzcju2) && (localzcju2.a() > 0))
      {
        str1 = zauz.a(localzcju2.a(0));
        if ((null != str1) && (!"".equals(str1)))
        {
          if (str1.startsWith("file:///")) {
            str1 = zafz.c(str1);
          } else if (("".equals(zk.e(str1))) || (null == zk.e(str1))) {
            str1 = str3.substring(0, 0 + (str3.length() - str3.substring(str3.lastIndexOf('.')).length())) + "_files" + zk.a + zafz.c(str1);
          } else {
            str1 = paramzagd.a().i() + str1;
          }
          if (!zd.c(str1)) {
            str1 = zw.a(str1, "_files", ".files");
          }
          localze = new com.aspose.cells.b.a.d.ze(str1, 3, 1);
          arrayOfByte = new byte[(int)localze.h()];
          localze.a(arrayOfByte, 0, (int)localze.h());
          switch (a.a(str2))
          {
          case 53: 
            localPicture = paramBoolean ? localWorksheet.getPageSetup().setHeaderPicture(0, arrayOfByte) : localWorksheet.getPageSetup().setFooterPicture(0, arrayOfByte);
            break;
          case 54: 
            localPicture = paramBoolean ? localWorksheet.getPageSetup().setHeaderPicture(1, arrayOfByte) : localWorksheet.getPageSetup().setFooterPicture(1, arrayOfByte);
            break;
          case 55: 
            localPicture = paramBoolean ? localWorksheet.getPageSetup().setHeaderPicture(2, arrayOfByte) : localWorksheet.getPageSetup().setFooterPicture(2, arrayOfByte);
            break;
          }
          localze.a();
        }
      }
      localzcju2 = localzcjn.c("x:Height");
      if ((null != localzcju2) && (localzcju2.a() > 0)) {
        localPicture.setHeight((int)zagn.i(zauz.a(localzcju2.a(0))));
      }
      localzcju2 = localzcjn.c("x:Width");
      if ((null != localzcju2) && (localzcju2.a() > 0)) {
        localPicture.setWidth((int)zagn.i(zauz.a(localzcju2.a(0))));
      }
      localzcju2 = localzcjn.c("x:CropTop");
      if ((null != localzcju2) && (localzcju2.a() > 0)) {
        localPicture.getFormatPicture().setTopCrop(zagn.i(zauz.a(localzcju2.a(0))));
      }
      localzcju2 = localzcjn.c("x:CropRight");
      if ((null != localzcju2) && (localzcju2.a() > 0)) {
        localPicture.getFormatPicture().setRightCrop(zagn.i(zauz.a(localzcju2.a(0))));
      }
      localzcju2 = localzcjn.c("x:CropLeft");
      if ((null != localzcju2) && (localzcju2.a() > 0)) {
        localPicture.getFormatPicture().setLeftCrop(zagn.i(zauz.a(localzcju2.a(0))));
      }
      localzcju2 = localzcjn.c("x:CropBottom");
      if ((null != localzcju2) && (localzcju2.a() > 0)) {
        localPicture.getFormatPicture().setBottomCrop(zagn.i(zauz.a(localzcju2.a(0))));
      }
      localzcju2 = localzcjn.c("x:Brightness");
      if ((null != localzcju2) && (localzcju2.a() > 0)) {
        localPicture.getFormatPicture().setBrightness(zagn.i(zauz.a(localzcju2.a(0))));
      }
      localzcju2 = localzcjn.c("x:Contrast");
      if ((null != localzcju2) && (localzcju2.a() > 0)) {
        localPicture.getFormatPicture().setContrast(zagn.i(zauz.a(localzcju2.a(0))));
      }
      localzcju2 = localzcjn.c("x:ColorType");
      if ((null != localzcju2) && (localzcju2.a() > 0))
      {
        if ("BlackAndWhite".equals(zauz.a(localzcju2.a(0))))
        {
          localPicture.getFormatPicture().setBiLevel(true);
          localPicture.getFormatPicture().setGray(true);
        }
        if ("Grayscale".equals(zauz.a(localzcju2.a(0))))
        {
          localPicture.getFormatPicture().setGray(true);
          localPicture.getFormatPicture().setBiLevel(false);
        }
      }
      localzcju2 = localzcjn.c("x:LockAspectRatio");
      localPicture.setLockAspectRatio((null != localzcju2) && (localzcju2.a() > 0));
    }
  }
  
  private static int c(zcju paramzcju)
  {
    int i = 2;
    if ((null != paramzcju) && (1 == paramzcju.a())) {
      switch (a.a(paramzcju.a(0).a()))
      {
      case 56: 
        i = 0;
        break;
      case 57: 
        i = 1;
        break;
      case 58: 
        i = 3;
        break;
      }
    }
    return i;
  }
  
  private static int d(zcju paramzcju)
  {
    int i = 1;
    if ((null != paramzcju) && (1 == paramzcju.a())) {
      switch (a.a(paramzcju.a(0).a()))
      {
      case 59: 
        i = 0;
        break;
      case 60: 
        i = 2;
        break;
      }
    }
    return i;
  }
  
  private static boolean e(zcju paramzcju)
  {
    return (null != paramzcju) && (1 == paramzcju.a());
  }
  
  private static int f(zcju paramzcju)
  {
    if ((null != paramzcju) && (1 == paramzcju.a())) {
      return 1;
    }
    return 0;
  }
  
  private static int g(zcju paramzcju)
  {
    if ((null != paramzcju) && (1 == paramzcju.a()))
    {
      switch (a.a(paramzcju.a(0).a()))
      {
      case 27: 
        return 3;
      case 29: 
        return 5;
      case 61: 
        return 8;
      case 62: 
        return 9;
      case 63: 
        return 11;
      case 64: 
        return 12;
      case 65: 
        return 13;
      case 66: 
        return 43;
      }
      return 9;
    }
    return 9;
  }
  
  private static int a(zcju paramzcju, int paramInt)
  {
    int i = 0;
    if ((null != paramzcju) && (1 == paramzcju.a())) {
      i = zauj.F(paramzcju.a(0).a());
    } else {
      i = paramInt;
    }
    return i;
  }
  
  private static void a(zcjn paramzcjn, Worksheet paramWorksheet)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    zcju localzcju1 = paramzcjn.c("x:SplitHorizontal");
    if (localzcju1.a() > 0) {
      k = zauj.F(zauz.a(localzcju1.a(0)));
    }
    zcju localzcju2 = paramzcjn.c("x:TopRowBottomPane");
    if (localzcju2.a() > 0) {
      i = zauj.F(zauz.a(localzcju2.a(0)));
    }
    zcju localzcju3 = paramzcjn.c("x:SplitVertical");
    if (localzcju3.a() > 0) {
      m = zauj.F(zauz.a(localzcju3.a(0)));
    }
    zcju localzcju4 = paramzcjn.c("x:LeftColumnRightPane");
    if (localzcju4.a() > 0) {
      j = zauj.F(zauz.a(localzcju4.a(0)));
    }
    paramWorksheet.freezePanes(i, j, k, m);
  }
  
  public static void a(zcju paramzcju, CustomDocumentPropertyCollection paramCustomDocumentPropertyCollection)
    throws Exception
  {
    for (int i = 0; i < paramzcju.a(); i++)
    {
      zcjn localzcjn1 = (zcjn)paramzcju.a(i);
      zcju localzcju = localzcjn1.l();
      for (int j = 0; j < localzcju.a(); j++)
      {
        zcjs localzcjs = localzcju.a(j);
        if (!(localzcjs instanceof zcjx))
        {
          zcjn localzcjn2 = (zcjn)localzcjs;
          String str = localzcjn2.a("dt:dt");
          a(localzcjn2.g, localzcjn2.a(), str, paramCustomDocumentPropertyCollection);
        }
      }
    }
  }
  
  private static void a(String paramString1, String paramString2, String paramString3, CustomDocumentPropertyCollection paramCustomDocumentPropertyCollection)
    throws Exception
  {
    paramString1 = g(paramString1);
    switch (a.a(paramString3))
    {
    case 67: 
      String str = zafz.b(paramString2);
      DateTime localDateTime = DateTime.a(str);
      paramCustomDocumentPropertyCollection.add(paramString1, localDateTime);
      break;
    case 68: 
      paramCustomDocumentPropertyCollection.add(paramString1, paramString2.equals("1"));
      break;
    case 69: 
      double d = zagn.i(paramString2);
      paramCustomDocumentPropertyCollection.add(paramString1, d);
      break;
    case 70: 
      paramCustomDocumentPropertyCollection.add(paramString1, paramString2);
      break;
    }
  }
  
  private static String g(String paramString)
  {
    StringBuilder localStringBuilder1 = new StringBuilder();
    if (paramString.startsWith("o:")) {
      paramString = paramString.substring(2);
    }
    int i = paramString.length();
    for (int j = 0; j < i; j++)
    {
      char c1 = paramString.charAt(j);
      if ((c1 == '_') && (j + 6 < i) && (paramString.charAt(j + 1) == 'x') && (paramString.charAt(j + 6) == '_'))
      {
        int k = 1;
        StringBuilder localStringBuilder2 = new StringBuilder();
        char c2;
        for (int m = j + 2; m < j + 6; m++)
        {
          c2 = paramString.charAt(m);
          if (!a(c2))
          {
            k = 0;
            break;
          }
          localStringBuilder2.append(paramString.charAt(m));
        }
        if (k != 0)
        {
          m = com.aspose.cells.b.a.ze.b(zs.a(localStringBuilder2), 16);
          c2 = (char)m;
          localStringBuilder1.append(c2);
          j += 6;
        }
        else
        {
          localStringBuilder1.append(c1);
        }
      }
      else
      {
        localStringBuilder1.append(c1);
      }
    }
    return zs.a(localStringBuilder1);
  }
  
  private static boolean a(char paramChar)
  {
    return ((paramChar >= '0') && (paramChar <= '9')) || ((paramChar >= 'a') && (paramChar <= 'f')) || ((paramChar >= 'A') && (paramChar <= 'F'));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zagc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */