package com.aspose.cells;

import com.aspose.cells.a.c.zy;
import com.aspose.cells.b.a.b.zi;
import com.aspose.cells.b.a.c.zb;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.d.zn;
import com.aspose.cells.b.a.ze;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zbeg
{
  private String a = null;
  private String b = null;
  private String c = null;
  private Workbook d;
  private int e = 55;
  private HashMap f = new HashMap();
  private HashMap g = new HashMap();
  private boolean h;
  private static final com.aspose.cells.b.c.a.za i = new com.aspose.cells.b.c.a.za(new String[] { "dateTime.tz", "float", "boolean", "HideHorizontalScrollBar", "HideVerticalScrollBar", "HideWorkbookTabs", "ActiveSheet", "Calculation", "DoNotCalculateBeforeSave", "SemiAutomaticCalculation", "ManualCalculation", "Alignment", "Borders", "Font", "Interior", "NumberFormat", "Protection", "CenterAcrossSelection", "Fill", "Left", "Right", "Justify", "JustifyDistributed", "Distributed", "Center", "Automatic", "Top", "Bottom", "LeftToRight", "RightToLeft", "DiagonalLeft", "DiagonalRight", "None", "", "Continuous", "Dash", "Dot", "DashDot", "DashDotDot", "SlantDashDot", "Double", "Single", "SingleAccounting", "DoubleAccounting", "Subscript", "Superscript", "Solid", "Gray75", "Gray50", "Gray25", "Gray125", "Gray0625", "HorzStripe", "VertStripe", "ReverseDiagStripe", "DiagStripe", "DiagCross", "ThickDiagCross", "ThinHorzStripe", "ThinVertStripe", "ThinReverseDiagStripe", "ThinDiagStripe", "ThinHorzCross", "ThinDiagCross", "General", "General Number", "General Date", "Long Date", "Medium Date", "Short Date", "Long Time", "Medium Time", "Short Time", "Currency", "Euro Currency", "Fixed", "Standard", "Percent", "Scientific", "Yes/No", "True/False", "On/Off", "String", "Number", "DateTime", "Boolean", "Error", "ShowAlways", "DoNotDisplayGridlines", "PageSetup", "Print", "FitToPage", "DoNotDisplayZeros", "Visible", "DoNotDisplayHeadings", "Zoom", "FreezePanes", "SplitHorizontal", "TopRowBottomPane", "SplitVertical", "LeftColumnRightPane", "TabColorIndex", "TopRowVisible", "LeftColumnVisible", "ActivePane", "Panes", "AllowFilter", "AllowSort", "AllowSizeCols", "AllowSizeRows", "AllowDeleteRows", "AllowDeleteCols", "AllowFormatCells", "AllowInsertCols", "AllowInsertRows", "AllowInsertHyperlinks", "AllowUsePivotTables", "ProtectObjects", "ProtectScenarios", "InnerCustom", "Custom", "TopPercent", "BottomPercent", "Blanks", "NonBlanks", "AutoFilterCondition", "AutoFilterOr", "AutoFilterAnd", "GreaterThan", "GreaterThanOrEqual", "LessThan", "LessThanOrEqual", "DoesNotEqual", "Equals", "Date", "Decimal", "List", "TextLength", "Time", "Whole", "AnyValue", "Between", "NotBetween", "Equal", "NotEqual", "Greater", "Less", "GreaterOrEqual", "LessOrEqual", "0", "1", "2", "Stop", "Info", "Warn", "U", "I", "B", "S", "Sub", "Sup", "double", "single-accounting", "double-accounting", "Face", "Color", "Size" });
  
  public void a(zm paramzm, Workbook paramWorkbook)
    throws Exception
  {
    zcjy localzcjy = null;
    try
    {
      this.f = new HashMap();
      long l = paramzm.i();
      Encoding localEncoding = null;
      zn localzn = new zn(paramzm);
      char[] arrayOfChar = new char[60];
      int j = localzn.a(arrayOfChar, 0, arrayOfChar.length);
      if ((arrayOfChar[0] == '<') && (arrayOfChar[1] == '?'))
      {
        String str1 = new String(arrayOfChar, 0, j);
        String str2 = "encoding=\"";
        int k = str1.indexOf(str2);
        if (k != -1)
        {
          k += str2.length();
          int m = str1.indexOf('"', k);
          String str3 = str1.substring(k, k + (m - k));
          localEncoding = Encoding.getEncoding(str3);
        }
      }
      paramzm.b(l);
      localzcjy = zauy.b(paramzm, localEncoding);
      if (a(paramWorkbook, localzcjy))
      {
        a(localzcjy, paramWorkbook);
        paramzm.b(l);
        localzcjy = zauy.b(paramzm, localEncoding);
        a(paramWorkbook, localzcjy);
        a(localzcjy);
      }
    }
    finally
    {
      if (localzcjy != null) {
        localzcjy.c();
      }
    }
  }
  
  private boolean a(Workbook paramWorkbook, zcjy paramzcjy)
    throws Exception
  {
    this.d = paramWorkbook;
    paramzcjy.k();
    if (paramzcjy.s() != 1) {
      return false;
    }
    if (!"Workbook".equals(paramzcjy.q())) {
      throw new CellsException(18, "The file is corrupted or is not a spreadsheetML file.");
    }
    return true;
  }
  
  private void a(zcjy paramzcjy, Workbook paramWorkbook)
    throws Exception
  {
    paramWorkbook.getWorksheets().clear();
    if (paramzcjy.o()) {
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        if (!paramzcjy.a()) {
          break;
        }
      }
      else if ("Worksheet".equals(paramzcjy.q()))
      {
        String str = null;
        if (paramzcjy.n()) {
          while (paramzcjy.m()) {
            if ("Name".equals(paramzcjy.q())) {
              str = paramzcjy.t();
            }
          }
        }
        if (str == null) {
          a("A worksheet must have a name.", paramzcjy.u());
        }
        if (paramzcjy.o()) {
          return;
        }
        paramzcjy.a();
        Worksheet localWorksheet = paramWorkbook.getWorksheets().get(paramWorkbook.getWorksheets().add());
        localWorksheet.b(str);
      }
      else
      {
        paramzcjy.a();
      }
    }
  }
  
  private void a(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o()) {
      return;
    }
    paramzcjy.d();
    zug.a(this.d);
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1) {
        paramzcjy.a();
      } else if ("DocumentProperties".equals(paramzcjy.q())) {
        e(paramzcjy);
      } else if ("CustomDocumentProperties".equals(paramzcjy.q())) {
        f(paramzcjy);
      } else if ("ExcelWorkbook".equals(paramzcjy.q())) {
        g(paramzcjy);
      } else if ("Styles".equals(paramzcjy.q())) {
        h(paramzcjy);
      } else if ("Names".equals(paramzcjy.q())) {
        b(paramzcjy, this.d);
      } else if ("Worksheet".equals(paramzcjy.q())) {
        j(paramzcjy);
      } else if ("OfficeDocumentSettings".equals(paramzcjy.q())) {
        b(paramzcjy);
      } else {
        paramzcjy.a();
      }
    }
  }
  
  private void b(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if ((paramzcjy.s() == 1) && ("Colors".equals(paramzcjy.q()))) {
        c(paramzcjy);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void c(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if ((paramzcjy.s() == 1) && ("Color".equals(paramzcjy.q()))) {
        d(paramzcjy);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void d(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    String str1 = null;
    String str2 = null;
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1) {
        paramzcjy.a();
      } else if ("Index".equals(paramzcjy.q())) {
        str1 = paramzcjy.j();
      } else if ("RGB".equals(paramzcjy.q())) {
        str2 = paramzcjy.j();
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
    if ((str1 != null) && (str2 != null)) {
      try
      {
        if (str2.charAt(0) == '#') {
          str2 = str2.substring(1);
        }
        Color localColor = zauj.s(str2);
        int j = com.aspose.cells.b.a.zp.a(str1);
        this.d.changePalette(localColor, j);
      }
      catch (Exception localException) {}
    }
  }
  
  private void b(zcjy paramzcjy, Workbook paramWorkbook)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if (("NamedRange".equals(paramzcjy.q())) && (paramzcjy.n()))
      {
        String str1 = null;
        String str2 = null;
        while (paramzcjy.m()) {
          if ("Name".equals(paramzcjy.q())) {
            str1 = paramzcjy.t();
          } else if ("RefersTo".equals(paramzcjy.q())) {
            str2 = zauw.b(paramzcjy.t(), -1, -1);
          }
        }
        if ((str1 != null) && (str2 != null))
        {
          int j = paramWorkbook.getWorksheets().getNames().a(-1, str1);
          Name localName = paramWorkbook.getWorksheets().getNames().get(j);
          localName.setRefersTo(str2);
        }
        paramzcjy.l();
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void e(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    int j = 0;
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1) {
        paramzcjy.a();
      } else {
        for (int k = 0; k < zbek.a.length; k++) {
          if (!zw.b(paramzcjy.q(), zbek.a[k]))
          {
            if (k == zbek.a.length - 1) {
              a(paramzcjy.u(), paramzcjy.q());
            }
          }
          else
          {
            j = k + 1;
            String str = paramzcjy.j();
            BuiltInDocumentPropertyCollection localBuiltInDocumentPropertyCollection = this.d.getWorksheets().getBuiltInDocumentProperties();
            try
            {
              switch (k)
              {
              case 0: 
                localBuiltInDocumentPropertyCollection.setTitle(str);
                break;
              case 1: 
                localBuiltInDocumentPropertyCollection.setSubject(str);
                break;
              case 2: 
                localBuiltInDocumentPropertyCollection.setAuthor(str);
                break;
              case 3: 
                localBuiltInDocumentPropertyCollection.setKeywords(str);
                break;
              case 4: 
                localBuiltInDocumentPropertyCollection.setComments(str);
                break;
              case 5: 
                localBuiltInDocumentPropertyCollection.setLastSavedBy(str);
                break;
              case 6: 
                localBuiltInDocumentPropertyCollection.setRevision(str);
                break;
              case 7: 
                localBuiltInDocumentPropertyCollection.setNameOfApplication(str);
                break;
              case 8: 
                localBuiltInDocumentPropertyCollection.setTotalEditingTime(com.aspose.cells.b.a.zp.a(str));
                break;
              case 9: 
                localBuiltInDocumentPropertyCollection.setLastPrinted(DateTime.a(str));
                break;
              case 10: 
                localBuiltInDocumentPropertyCollection.setCreatedTime(DateTime.a(str));
                break;
              case 11: 
                localBuiltInDocumentPropertyCollection.setLastSavedTime(DateTime.a(str));
                break;
              case 12: 
                localBuiltInDocumentPropertyCollection.setPages(com.aspose.cells.b.a.zp.a(str));
                break;
              case 13: 
                localBuiltInDocumentPropertyCollection.setWords(com.aspose.cells.b.a.zp.a(str));
                break;
              case 14: 
                localBuiltInDocumentPropertyCollection.setCharacters(com.aspose.cells.b.a.zp.a(str));
                break;
              case 15: 
                localBuiltInDocumentPropertyCollection.setCategory(str);
                break;
              case 16: 
                break;
              case 17: 
                localBuiltInDocumentPropertyCollection.setManager(str);
                break;
              case 18: 
                localBuiltInDocumentPropertyCollection.setCompany(str);
                break;
              case 20: 
                localBuiltInDocumentPropertyCollection.setHyperlinkBase(str);
                break;
              case 21: 
                localBuiltInDocumentPropertyCollection.setBytes(com.aspose.cells.b.a.zp.a(str));
                break;
              case 22: 
                localBuiltInDocumentPropertyCollection.setLines(com.aspose.cells.b.a.zp.a(str));
                break;
              case 23: 
                localBuiltInDocumentPropertyCollection.setParagraphs(com.aspose.cells.b.a.zp.a(str));
              }
            }
            catch (Exception localException) {}
          }
        }
      }
    }
    paramzcjy.h();
  }
  
  private void f(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.b(true);
    paramzcjy.d();
    while (paramzcjy.s() != 4) {
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else
      {
        CustomDocumentPropertyCollection localCustomDocumentPropertyCollection = this.d.getWorksheets().getCustomDocumentProperties();
        String str1 = null;
        String str2 = null;
        if (paramzcjy.n())
        {
          str2 = paramzcjy.a("link");
          str1 = paramzcjy.a("dt", this.c);
        }
        if ("string".equals(str1)) {
          str1 = null;
        }
        int j = paramzcjy.u();
        String str3 = paramzcjy.q();
        String str4 = paramzcjy.j();
        DocumentProperty localDocumentProperty = null;
        if (str2 != null) {
          localDocumentProperty = localCustomDocumentPropertyCollection.addLinkToContent(str3, str2);
        }
        if (str1 == null)
        {
          if (localDocumentProperty == null) {
            localCustomDocumentPropertyCollection.add(str3, str4);
          } else {
            localDocumentProperty.setValue(str4);
          }
        }
        else {
          try
          {
            switch (i.a(str1))
            {
            case 0: 
              if (localDocumentProperty == null) {
                localCustomDocumentPropertyCollection.add(str3, DateTime.a(str4));
              } else {
                localDocumentProperty.setValue(DateTime.a(str4));
              }
              break;
            case 1: 
              if (localDocumentProperty == null) {
                localCustomDocumentPropertyCollection.add(str3, zauj.C(str4));
              } else {
                localDocumentProperty.setValue(Double.valueOf(zauj.C(str4)));
              }
              break;
            case 2: 
              if (localDocumentProperty == null) {
                localCustomDocumentPropertyCollection.add(str3, !"0".equals(str4));
              } else {
                localDocumentProperty.setValue(Boolean.valueOf(!"0".equals(str4)));
              }
              break;
            default: 
              a("Invalid dt value \"" + str1 + "\"", paramzcjy.u());
            }
          }
          catch (Exception localException)
          {
            a("\"" + str4 + "\" is not a valid " + str1, j);
            break;
          }
        }
      }
    }
    paramzcjy.h();
    paramzcjy.b(false);
  }
  
  private void g(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    int j = 0;
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else
      {
        String str = null;
        switch (i.a(paramzcjy.q()))
        {
        case 3: 
          this.d.getSettings().setHScrollBarVisible(false);
          paramzcjy.a();
          break;
        case 4: 
          this.d.getSettings().setVScrollBarVisible(false);
          paramzcjy.a();
          break;
        case 5: 
          this.d.getSettings().setShowTabs(false);
          paramzcjy.a();
          break;
        case 6: 
          str = paramzcjy.j();
          this.d.getWorksheets().setActiveSheetIndex(com.aspose.cells.b.a.zp.a(str));
          break;
        case 7: 
          str = paramzcjy.j();
          switch (i.a(str))
          {
          case 9: 
            this.d.getSettings().setCalcMode(1);
            break;
          case 10: 
            this.d.getSettings().setCalcMode(2);
          }
          break;
        case 8: 
          j = 1;
          paramzcjy.a();
          break;
        default: 
          paramzcjy.a();
        }
      }
    }
    if (j == 0) {}
    paramzcjy.h();
  }
  
  private void h(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o()) {
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1) {
        paramzcjy.a();
      } else if ("Style".equals(paramzcjy.q())) {
        i(paramzcjy);
      } else {
        a(paramzcjy.u(), paramzcjy.q());
      }
    }
    paramzcjy.h();
  }
  
  private void i(zcjy paramzcjy)
    throws Exception
  {
    zbzv localzbzv = (zbzv)this.d.getWorksheets().C();
    String str1 = paramzcjy.a("ID", this.b);
    if (str1 == null) {
      a("ID is required for \"Style\" element.", paramzcjy.u());
    }
    if (this.f.containsKey(str1)) {
      a("Duplicate Style ID \"" + str1 + "\"", paramzcjy.u());
    }
    String str2 = str1;
    Style localStyle1 = new Style(this.d.getWorksheets());
    if (this.h) {
      localStyle1.a(this.d.getWorksheets(), 15);
    }
    String str3 = paramzcjy.a("Parent", this.b);
    int j = 0;
    if (str3 != null)
    {
      j = ((Integer)this.g.get(str3)).intValue();
      localObject = localzbzv.a(j);
      if (localObject == null) {
        a("Can not find the specified Parent \"" + str3 + "\"", paramzcjy.u());
      }
      localStyle1.copy((Style)localObject);
      localStyle1.a(true);
      while (((Style)localObject).h() > 0)
      {
        j = ((Style)localObject).h();
        localObject = ((Style)localObject).getParentStyle();
      }
    }
    Object localObject = paramzcjy.a("Name", this.b);
    localStyle1.a((String)localObject);
    localStyle1.a(j);
    if (paramzcjy.o())
    {
      int k = localzbzv.a(localStyle1);
      this.f.put(str2, Integer.valueOf(k));
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (i.a(paramzcjy.q()))
      {
      case 11: 
        a(paramzcjy, localStyle1);
        break;
      case 12: 
        b(paramzcjy, localStyle1);
        break;
      case 13: 
        if (str3 != null) {
          localStyle1.c(11);
        }
        c(paramzcjy, localStyle1);
        break;
      case 14: 
        d(paramzcjy, localStyle1);
        break;
      case 15: 
        e(paramzcjy, localStyle1);
        break;
      case 16: 
        str1 = paramzcjy.a("Protected", this.b);
        localStyle1.setLocked((!"0".equals(str1)) && (!"".equals(str1)));
        str1 = paramzcjy.a("x:HideFormula");
        if (str1 != null) {
          localStyle1.setFormulaHidden((!"0".equals(str1)) && (!"".equals(str1)));
        }
        paramzcjy.a();
        break;
      default: 
        paramzcjy.a();
      }
    }
    if ((localStyle1.getName() != null) && ("Normal".equals(localStyle1.getName())))
    {
      this.h = true;
      localzbzv.a(0, localStyle1);
      localStyle1.a(false);
      Style localStyle2 = new Style(this.d.getWorksheets());
      localStyle2.copy(localStyle1);
      localStyle2.a(true);
      this.d.getWorksheets().b(localStyle2);
      this.f.put(str2, Integer.valueOf(15));
      this.g.put(str2, Integer.valueOf(0));
    }
    else if ("Default".equals(str2))
    {
      localzbzv.a(15, localStyle1);
      this.f.put(str2, Integer.valueOf(15));
      this.g.put(str2, Integer.valueOf(0));
    }
    else
    {
      int m;
      if ((localObject != null) && (!"".equals(localObject)))
      {
        m = localzbzv.e(localStyle1);
        this.g.put(str2, Integer.valueOf(m));
        int n = localzbzv.a(localStyle1, m);
        this.f.put(str2, Integer.valueOf(n));
      }
      else
      {
        m = this.d.getWorksheets().a(localStyle1);
        this.f.put(str2, Integer.valueOf(m));
        this.g.put(str2, Integer.valueOf(m));
      }
    }
  }
  
  private void a(zcjy paramzcjy, Style paramStyle)
    throws Exception
  {
    if (paramzcjy.n())
    {
      String str = null;
      try
      {
        str = paramzcjy.a("Horizontal", this.b);
        if (str != null) {
          switch (i.a(str))
          {
          case 17: 
            paramStyle.setHorizontalAlignment(2);
            break;
          case 18: 
            paramStyle.setHorizontalAlignment(4);
            break;
          case 19: 
            paramStyle.setHorizontalAlignment(7);
            break;
          case 20: 
            paramStyle.setHorizontalAlignment(8);
            break;
          case 21: 
          case 22: 
            paramStyle.setHorizontalAlignment(6);
            break;
          case 23: 
            paramStyle.setHorizontalAlignment(3);
            break;
          case 24: 
            paramStyle.setHorizontalAlignment(1);
            break;
          case 25: 
            break;
          default: 
            a("Invalid attribute value \"" + str + "\"", paramzcjy.u());
            break;
          }
        } else {
          paramStyle.setHorizontalAlignment(5);
        }
        str = paramzcjy.a("Vertical", this.b);
        if (str != null) {
          switch (i.a(str))
          {
          case 25: 
            break;
          case 26: 
            paramStyle.setVerticalAlignment(9);
            break;
          case 27: 
            paramStyle.setVerticalAlignment(0);
            break;
          case 24: 
            paramStyle.setVerticalAlignment(1);
            break;
          case 21: 
          case 22: 
            paramStyle.setVerticalAlignment(6);
            break;
          case 23: 
            paramStyle.setVerticalAlignment(3);
          }
        } else {
          paramStyle.setVerticalAlignment(0);
        }
        str = paramzcjy.a("Rotate", this.b);
        if (str != null) {
          paramStyle.setRotationAngle((int)zauj.C(str));
        }
        str = paramzcjy.a("ReadingOrder", this.b);
        if (str != null) {
          switch (i.a(str))
          {
          case 28: 
            paramStyle.setTextDirection(1);
            break;
          case 29: 
            paramStyle.setTextDirection(2);
          }
        }
        str = paramzcjy.a("VerticalText", this.b);
        if (str != null) {
          paramStyle.setRotationAngle(255);
        }
        str = paramzcjy.a("ShrinkToFit", this.b);
        if (str != null) {
          paramStyle.setShrinkToFit((!"0".equals(str)) && (!"".equals(str)));
        }
        str = paramzcjy.a("WrapText", this.b);
        if (str != null) {
          paramStyle.setTextWrapped((!"0".equals(str)) && (!"".equals(str)));
        }
        str = paramzcjy.a("Indent", this.b);
        if (str != null) {
          paramStyle.setIndentLevel((int)com.aspose.cells.a.c.zp.a(str));
        }
      }
      catch (Exception localException)
      {
        a("Invalid value \"" + str + "\"", paramzcjy.u());
      }
    }
    paramzcjy.a();
  }
  
  private void b(zcjy paramzcjy, Style paramStyle)
    throws Exception
  {
    if (paramzcjy.o())
    {
      if ((paramStyle.h() > 0) && (paramStyle.isModified(1))) {
        paramStyle.getBorders().setStyle(0);
      }
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    String str1 = null;
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1) {
        paramzcjy.a();
      } else {
        try
        {
          if ("Border".equals(paramzcjy.q()))
          {
            int j = 1;
            str1 = paramzcjy.a("Position", this.b);
            switch (i.a(str1))
            {
            case 19: 
              j = 1;
              break;
            case 26: 
              j = 4;
              break;
            case 20: 
              j = 2;
              break;
            case 27: 
              j = 8;
              break;
            case 30: 
              j = 16;
              break;
            case 31: 
              j = 32;
              break;
            case 21: 
            case 22: 
            case 23: 
            case 24: 
            case 25: 
            case 28: 
            case 29: 
            default: 
              a("Invalid value \"" + str1 + "\"", paramzcjy.u());
            }
            String str2 = "None";
            double d1 = 1.0D;
            str1 = paramzcjy.a("LineStyle", this.b);
            if (str1 != null) {
              str2 = str1;
            }
            str1 = paramzcjy.a("Weight", this.b);
            if (str1 != null) {
              d1 = zauj.C(str1);
            } else {
              d1 = 0.0D;
            }
            int k = 0;
            switch (i.a(str2))
            {
            case 32: 
              k = 0;
              break;
            case 33: 
              break;
            case 34: 
              if (d1 <= 0.5D) {
                k = 7;
              } else if (d1 <= 1.0D) {
                k = 1;
              } else if (d1 <= 2.0D) {
                k = 2;
              } else {
                k = 5;
              }
              break;
            case 35: 
              if (d1 <= 1.0D) {
                k = 3;
              } else {
                k = 8;
              }
              break;
            case 36: 
              if (d1 <= 0.8D) {
                k = 7;
              } else {
                k = 4;
              }
              break;
            case 37: 
              if (d1 <= 1.0D) {
                k = 9;
              } else {
                k = 10;
              }
              break;
            case 38: 
              if (d1 <= 1.0D) {
                k = 11;
              } else {
                k = 12;
              }
              break;
            case 39: 
              k = 13;
              break;
            case 40: 
              k = 6;
              break;
            default: 
              a("Invalid value \"" + str1 + "\"", paramzcjy.u());
            }
            paramStyle.getBorders().getByBorderType(j).setLineStyle(k);
            str1 = paramzcjy.a("Color", this.b);
            if (str1 != null) {
              paramStyle.getBorders().getByBorderType(j).setColor(a(com.aspose.cells.b.a.b.zf.a(str1)));
            }
            paramzcjy.a();
          }
          else
          {
            a(paramzcjy.u(), paramzcjy.q());
          }
        }
        catch (Exception localException)
        {
          a("Invalid value \"" + str1 + "\"", paramzcjy.u());
        }
      }
    }
    paramzcjy.h();
  }
  
  private void c(zcjy paramzcjy, Style paramStyle)
    throws Exception
  {
    Font localFont = paramStyle.getFont();
    String str = null;
    try
    {
      str = paramzcjy.a("Bold", this.b);
      localFont.setBold((str != null) && (!"0".equals(str)) && (!"".equals(str)));
      str = paramzcjy.a("Color", this.b);
      if ((str != null) && (!"".equals(str)) && (!zy.a(str, "AUTOMATIC"))) {
        localFont.setColor(a(com.aspose.cells.b.a.b.zf.a(str)));
      }
      str = paramzcjy.a("FontName", this.b);
      str = zw.b(str) ? "Arial" : str;
      localFont.a(str, false, 0);
      str = paramzcjy.a("Italic", this.b);
      localFont.setItalic((str != null) && (!"0".equals(str)) && (!"".equals(str)));
      str = paramzcjy.a("Size", this.b);
      if (str != null) {
        localFont.setDoubleSize(zauj.C(str));
      }
      str = paramzcjy.a("StrikeThrough", this.b);
      localFont.setStrikeout((str != null) && (!"0".equals(str)) && (!"".equals(str)));
      str = paramzcjy.a("Underline", this.b);
      if (str != null)
      {
        int j = 0;
        switch (i.a(str))
        {
        case 32: 
          j = 0;
          break;
        case 41: 
          j = 1;
          break;
        case 40: 
          j = 2;
          break;
        case 42: 
          j = 3;
          break;
        case 43: 
          j = 4;
          break;
        case 33: 
        case 34: 
        case 35: 
        case 36: 
        case 37: 
        case 38: 
        case 39: 
        default: 
          a("Invalid value \"" + str + "\"", paramzcjy.u());
        }
        localFont.setUnderline(j);
      }
      str = paramzcjy.a("VerticalAlign", this.b);
      if (str != null) {
        switch (i.a(str))
        {
        case 32: 
          localFont.setSubscript(false);
          localFont.setSuperscript(false);
          break;
        case 44: 
          localFont.setSubscript(true);
          break;
        case 45: 
          localFont.setSuperscript(true);
          break;
        default: 
          a("Invalid value \"" + str + "\"", paramzcjy.u());
        }
      }
    }
    catch (Exception localException)
    {
      a("Invalid value \"" + str + "\"", paramzcjy.u());
    }
    paramzcjy.a();
  }
  
  private void d(zcjy paramzcjy, Style paramStyle)
    throws Exception
  {
    String str1 = paramzcjy.a("Pattern", this.b);
    if (str1 == null) {
      str1 = "None";
    }
    switch (i.a(str1))
    {
    case 32: 
      paramStyle.setPattern(0);
      break;
    case 46: 
      paramStyle.setPattern(1);
      break;
    case 47: 
      paramStyle.setPattern(3);
      break;
    case 48: 
      paramStyle.setPattern(2);
      break;
    case 49: 
      paramStyle.setPattern(4);
      break;
    case 50: 
      paramStyle.setPattern(17);
      break;
    case 51: 
      paramStyle.setPattern(18);
      break;
    case 52: 
      paramStyle.setPattern(5);
      break;
    case 53: 
      paramStyle.setPattern(6);
      break;
    case 54: 
      paramStyle.setPattern(7);
      break;
    case 55: 
      paramStyle.setPattern(8);
      break;
    case 56: 
      paramStyle.setPattern(9);
      break;
    case 57: 
      paramStyle.setPattern(10);
      break;
    case 58: 
      paramStyle.setPattern(11);
      break;
    case 59: 
      paramStyle.setPattern(12);
      break;
    case 60: 
      paramStyle.setPattern(13);
      break;
    case 61: 
      paramStyle.setPattern(14);
      break;
    case 62: 
      paramStyle.setPattern(15);
      break;
    case 63: 
      paramStyle.setPattern(16);
      break;
    case 33: 
    case 34: 
    case 35: 
    case 36: 
    case 37: 
    case 38: 
    case 39: 
    case 40: 
    case 41: 
    case 42: 
    case 43: 
    case 44: 
    case 45: 
    default: 
      a("Invalid value \"" + str1 + "\"", paramzcjy.u());
    }
    String str2 = paramzcjy.a("Color", this.b);
    String str3 = paramzcjy.a("PatternColor", this.b);
    if (paramStyle.getPattern() != 1)
    {
      if ((str3 != null) && (!"".equals(str3)) && (!zy.a(str3, "AUTOMATIC"))) {
        paramStyle.setForegroundColor(a(com.aspose.cells.b.a.b.zf.a(str3)));
      }
      if ((str2 != null) && (!"".equals(str2)) && (!zy.a(str2, "AUTOMATIC"))) {
        paramStyle.setBackgroundColor(a(com.aspose.cells.b.a.b.zf.a(str2)));
      }
    }
    else if ((str2 != null) && (!"".equals(str2)) && (!zy.a(str2, "AUTOMATIC")))
    {
      paramStyle.setForegroundColor(a(com.aspose.cells.b.a.b.zf.a(str2)));
    }
    paramzcjy.a();
  }
  
  private void e(zcjy paramzcjy, Style paramStyle)
    throws Exception
  {
    String str = paramzcjy.a("Format", this.b);
    if (str == null)
    {
      paramzcjy.a();
      paramStyle.setNumber(0);
      return;
    }
    switch (i.a(str))
    {
    case 33: 
      break;
    case 64: 
      paramStyle.setNumber(0);
      break;
    case 65: 
      paramStyle.setNumber(1);
      break;
    case 66: 
      paramStyle.setNumber(22);
      break;
    case 67: 
      paramStyle.b(zb.a().c());
      break;
    case 68: 
      paramStyle.setNumber(15);
      break;
    case 69: 
      paramStyle.setNumber(14);
      break;
    case 70: 
      paramStyle.setNumber(19);
      break;
    case 71: 
      paramStyle.setNumber(18);
      break;
    case 72: 
      paramStyle.setNumber(20);
      break;
    case 73: 
      paramStyle.b("$#,##0.00_);[Red]($#,##0.00)");
      break;
    case 74: 
      paramStyle.b("[$€-2] #,##0.00_);[Red]([$€-2] #,##0.00)");
      break;
    case 75: 
      paramStyle.setNumber(2);
      break;
    case 76: 
      paramStyle.setNumber(4);
      break;
    case 77: 
      paramStyle.setNumber(10);
      break;
    case 78: 
      paramStyle.setNumber(11);
      break;
    case 79: 
      paramStyle.b("\"Yes\";\"Yes\";\"No\"");
      break;
    case 80: 
      paramStyle.b("\"True\";\"True\";\"False\"");
      break;
    case 81: 
      paramStyle.b("\"On\";\"On\";\"Off\"");
      break;
    case 34: 
    case 35: 
    case 36: 
    case 37: 
    case 38: 
    case 39: 
    case 40: 
    case 41: 
    case 42: 
    case 43: 
    case 44: 
    case 45: 
    case 46: 
    case 47: 
    case 48: 
    case 49: 
    case 50: 
    case 51: 
    case 52: 
    case 53: 
    case 54: 
    case 55: 
    case 56: 
    case 57: 
    case 58: 
    case 59: 
    case 60: 
    case 61: 
    case 62: 
    case 63: 
    default: 
      if (str.startsWith("[JPN]")) {
        str = str.substring("[JPN]".length());
      }
      paramStyle.b(str);
    }
    paramzcjy.a();
  }
  
  private void j(zcjy paramzcjy)
    throws Exception
  {
    String str = null;
    int j = 0;
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        if ("Name".equals(paramzcjy.q())) {
          str = paramzcjy.t();
        } else if ("Protected".equals(paramzcjy.q())) {
          j = !"0".equals(paramzcjy.t()) ? 1 : 0;
        } else if (!"RightToLeft".equals(paramzcjy.q())) {}
      }
      paramzcjy.l();
    }
    if (str == null) {
      a("A worksheet must have a name.", paramzcjy.u());
    }
    Worksheet localWorksheet = this.d.getWorksheets().get(str);
    if (j != 0) {
      localWorksheet.protect(0);
    } else {
      localWorksheet.unprotect();
    }
    if (paramzcjy.o()) {
      return;
    }
    zbef localzbef = null;
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1) {
        paramzcjy.a();
      } else if ("Table".equals(paramzcjy.q())) {
        a(localWorksheet, paramzcjy);
      } else if ("WorksheetOptions".equals(paramzcjy.q())) {
        b(localWorksheet, paramzcjy);
      } else if ("PageBreaks".equals(paramzcjy.q())) {
        d(localWorksheet, paramzcjy);
      } else if ("Names".equals(paramzcjy.q())) {
        f(localWorksheet, paramzcjy);
      } else if ("AutoFilter".equals(paramzcjy.q())) {
        e(localWorksheet, paramzcjy);
      } else if ("DataValidation".equals(paramzcjy.q())) {
        a(paramzcjy, localWorksheet);
      } else if ("ConditionalFormatting".equals(paramzcjy.q()))
      {
        if (paramzcjy.o())
        {
          paramzcjy.a();
        }
        else
        {
          if (localzbef == null) {
            localzbef = new zbef(localWorksheet);
          }
          localzbef.a(paramzcjy);
        }
      }
      else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void a(Worksheet paramWorksheet, zcjy paramzcjy)
    throws Exception
  {
    double d1 = 0.0D;
    com.aspose.cells.b.a.b.za localza = new com.aspose.cells.b.a.b.za(10, 10);
    try
    {
      zi localzi = zi.a(localza);
      try
      {
        d1 = localzi.f();
      }
      finally {}
    }
    finally
    {
      if (localza != null) {
        localza.b();
      }
    }
    int j = -1;
    double d2 = 72.0D / d1;
    zbej localzbej = new zbej();
    String str1 = null;
    if (paramzcjy.n())
    {
      str1 = paramzcjy.a("DefaultColumnWidth", this.b);
      if (str1 != null)
      {
        localzbej.c = zauj.C(str1);
        localzbej.f = true;
        double d3 = zlp.a(localzbej.c / d2, paramWorksheet.c());
        if (d3 == 0.0D) {
          paramWorksheet.getCells().getColumns().a().setHidden(true);
        } else {
          paramWorksheet.getCells().getColumns().a(d3);
        }
      }
      str1 = paramzcjy.a("DefaultRowHeight", this.b);
      if (str1 != null)
      {
        paramWorksheet.getCells().setStandardHeight(localzbej.d = zauj.C(str1));
        localzbej.e = true;
      }
      localzbej.g = paramzcjy.a("StyleID", this.b);
      if ((localzbej.g != null) && (!"".equals(localzbej.g)))
      {
        Object localObject3 = this.f.get(localzbej.g);
        paramWorksheet.getCells().getColumns().a().c(((Integer)localObject3).intValue());
        j = paramWorksheet.getCells().getColumns().a().c();
      }
      str1 = paramzcjy.a("LeftCell", this.b);
      if (str1 != null) {
        localzbej.a = (com.aspose.cells.b.a.zp.a(str1) - 2);
      }
      str1 = paramzcjy.a("TopCell", this.b);
      if (str1 != null) {
        localzbej.b = (com.aspose.cells.b.a.zp.a(str1) - 2);
      }
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    int k = 0;
    int m = 0;
    Cells localCells = paramWorksheet.getCells();
    localCells.a(4096, 4096, 64);
    RowCollection localRowCollection = localCells.getRows();
    zv localzv = localCells.e();
    Row localRow = null;
    zt localzt = null;
    int n = -1;
    zbdx localzbdx1 = new zbdx();
    localzbdx1.a(0, paramWorksheet.getCells());
    zbdx localzbdx2 = new zbdx();
    int i4;
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else
      {
        int i1;
        int i2;
        String str2;
        Object localObject6;
        if ("Column".equals(paramzcjy.q()))
        {
          k++;
          i1 = 0;
          if (paramzcjy.n())
          {
            str1 = paramzcjy.a("Index", this.b);
            if (str1 != null) {
              k = com.aspose.cells.b.a.zp.a(str1);
            }
            str1 = paramzcjy.a("Span", this.b);
            if (str1 != null) {
              i1 = com.aspose.cells.b.a.zp.a(str1);
            }
            str1 = paramzcjy.a("StyleID", this.b);
            i2 = 15;
            if (str1 != null)
            {
              Object localObject4 = this.f.get(str1);
              if (localObject4 != null) {
                i2 = ((Integer)localObject4).intValue();
              }
            }
            else if (j != -1)
            {
              i2 = j;
            }
            boolean bool1 = localzbej.f;
            str1 = paramzcjy.a("Width", this.b);
            double d4 = 0.0D;
            if (str1 != null)
            {
              bool1 = true;
              d4 = zlp.a(zauj.C(str1) / d2, paramWorksheet.c());
            }
            str1 = paramzcjy.a("Hidden", this.b);
            boolean bool3 = false;
            if ((str1 != null) && (!"".equals(str1)) && (!"0".equals(str1))) {
              bool3 = true;
            }
            str2 = paramzcjy.a("AutoFitWidth", this.b);
            for (int i7 = 0; i7 <= i1; i7++)
            {
              Column localColumn = paramWorksheet.getCells().getColumns().get(i7 + k + localzbej.a);
              if (bool1) {
                localColumn.a = d4;
              }
              localColumn.setHidden(bool3);
              localColumn.c(i2);
            }
            i7 = (str2 == null) || ("1".equals(str2)) ? 1 : 0;
            if ((i7 != 0) && (!bool3))
            {
              int i8 = 0;
              if (localzbej.i.size() > 0)
              {
                localObject6 = (zbei)localzbej.i.get(localzbej.i.size() - 1);
                if (((zbei)localObject6).a + ((zbei)localObject6).b == localzbej.a + k - 1)
                {
                  localObject6.b += i1 + 1;
                  i8 = 1;
                }
              }
              if (i8 == 0)
              {
                localObject6 = new zbei();
                ((zbei)localObject6).a = (localzbej.a + k);
                ((zbei)localObject6).b = i1;
                ((zbei)localObject6).c = i7;
                com.aspose.cells.b.a.a.zf.a(localzbej.i, localObject6);
              }
            }
          }
          k += i1;
          paramzcjy.a();
        }
        else if ("Row".equals(paramzcjy.q()))
        {
          m++;
          localzbdx2.a(localzbdx1);
          localzbdx2.a = (localzbej.b + m);
          i1 = 1;
          boolean bool2;
          if (paramzcjy.n())
          {
            str1 = paramzcjy.a("Index", this.b);
            if (str1 != null)
            {
              m = com.aspose.cells.b.a.zp.a(str1);
              localzbdx2.a = (localzbej.b + m);
            }
            str1 = paramzcjy.a("Span", this.b);
            i2 = 0;
            if (str1 != null) {
              i2 = com.aspose.cells.b.a.zp.a(str1);
            }
            str1 = paramzcjy.a("StyleID", this.b);
            if (str1 != null)
            {
              Object localObject5 = this.f.get(str1);
              if (localObject5 == null)
              {
                a("Invalid value \"" + str1 + "\"", paramzcjy.u());
              }
              else
              {
                localzbdx2.d = ((Integer)localObject5).intValue();
                localzbdx2.d(true);
                i1 = 0;
              }
            }
            bool2 = localzbej.e;
            str1 = paramzcjy.a("Height", this.b);
            if (str1 != null)
            {
              bool2 = true;
              localzbdx2.e = ((short)(int)(zauj.C(str1) * 20.0D + 0.5D));
              localzbdx2.c(false);
              if (localzbdx2.e == 0) {
                localzbdx2.b(true);
              }
              i1 = 0;
            }
            str1 = paramzcjy.a("Hidden", this.b);
            if (str1 != null)
            {
              localzbdx2.b(zauj.b(str1, true));
              i1 = 0;
            }
            if (!bool2)
            {
              str1 = paramzcjy.a("AutoFitHeight", this.b);
              if ((str1 != null) && (!"".equals(str1))) {
                if (!"0".equals(str1))
                {
                  zbei localzbei2 = new zbei();
                  localzbei2.a = (localzbej.b + m);
                  localzbei2.b = i2;
                  localzbei2.c = true;
                  com.aspose.cells.b.a.a.zf.a(localzbej.h, localzbei2);
                }
                else
                {
                  localzbdx2.c(false);
                  i1 = 0;
                }
              }
            }
            if (i1 == 0)
            {
              n = localzv.a(localzbdx2.a, n);
              if (n < 0)
              {
                n = localzv.a(-n - 1, localzbdx2, 64);
                localzt = localzv.f(n);
              }
              else
              {
                localzt = localzv.f(n);
                localzt.b(localzbdx2, 13);
              }
              if (i2 > 0) {
                for (i4 = 0; i4 < i2; i4++)
                {
                  m++;
                  localzbdx2.a += 1;
                  n = localzv.a(localzbdx2.a, n);
                  if (n < 0)
                  {
                    n = localzv.a(-n - 1, localzbdx2, 64);
                    localzt = localzv.f(n);
                  }
                  else
                  {
                    localzt = localzv.f(n);
                    localzt.b(localzbdx2, 13);
                  }
                }
              }
              localRow = new Row(localCells, localRowCollection, localzt, false);
            }
            else
            {
              m += i2;
            }
          }
          if (paramzcjy.o())
          {
            paramzcjy.a();
          }
          else
          {
            paramzcjy.d();
            i2 = 0;
            while (paramzcjy.s() != 4)
            {
              paramzcjy.k();
              if (paramzcjy.s() != 1)
              {
                paramzcjy.a();
              }
              else
              {
                i2++;
                if ("Cell".equals(paramzcjy.q()))
                {
                  bool2 = false;
                  i4 = 0;
                  int i5 = 0;
                  int i6 = -1;
                  str2 = null;
                  String str3 = null;
                  String str4 = null;
                  localObject6 = null;
                  int i3;
                  while (paramzcjy.m()) {
                    if ("StyleID".equals(paramzcjy.q()))
                    {
                      str1 = paramzcjy.t();
                      localObject7 = this.f.get(str1);
                      if (localObject7 == null) {
                        a("Invalid value \"" + str1 + "\"", paramzcjy.u());
                      }
                      i6 = ((Integer)localObject7).intValue();
                    }
                    else if ("Index".equals(paramzcjy.q()))
                    {
                      i2 = com.aspose.cells.b.a.zp.a(paramzcjy.t());
                    }
                    else if ("MergeAcross".equals(paramzcjy.q()))
                    {
                      i3 = com.aspose.cells.b.a.zp.a(paramzcjy.t());
                      i5 = 1;
                    }
                    else if ("MergeDown".equals(paramzcjy.q()))
                    {
                      i4 = com.aspose.cells.b.a.zp.a(paramzcjy.t());
                      i5 = 1;
                    }
                    else if ("Formula".equals(paramzcjy.q()))
                    {
                      str2 = paramzcjy.t();
                    }
                    else if ("ArrayRange".equals(paramzcjy.q()))
                    {
                      localObject6 = paramzcjy.t();
                    }
                    else if ("HRef".equals(paramzcjy.q()))
                    {
                      str3 = paramzcjy.t();
                    }
                    else if ("HRefScreenTip".equals(paramzcjy.q()))
                    {
                      str4 = paramzcjy.t();
                    }
                  }
                  if (i1 != 0)
                  {
                    i1 = 0;
                    n = localzv.a(localzbdx2.a, n);
                    if (n < 0)
                    {
                      n = localzv.a(-n - 1, localzbdx2, 64);
                      localzt = localzv.f(n);
                    }
                    else
                    {
                      localzt = localzv.f(n);
                      localzt.b(localzbdx2, 13);
                    }
                    localRow = new Row(localCells, localRowCollection, localzt, false);
                  }
                  Object localObject7 = localRow.c(i2 + localzbej.a);
                  if (str2 != null)
                  {
                    localObject8 = zauw.b(str2, ((Cell)localObject7).getRow(), ((Cell)localObject7).getColumn());
                    if (localObject6 != null)
                    {
                      CellArea localCellArea = zbek.a((String)localObject6, ((Cell)localObject7).getRow(), ((Cell)localObject7).getColumn());
                      ((Cell)localObject7).a((String)localObject8, localCellArea.EndRow - localCellArea.StartRow + 1, localCellArea.EndColumn - localCellArea.StartColumn + 1);
                    }
                    else
                    {
                      ((Cell)localObject7).setFormula((String)localObject8);
                    }
                  }
                  Object localObject8 = null;
                  int i9;
                  if ((str3 != null) && (!"".equals(str3)))
                  {
                    if (str3.charAt(0) == '#') {
                      str3 = str3.substring(1);
                    }
                    i9 = paramWorksheet.getHyperlinks().a(((Cell)localObject7).getRow(), ((Cell)localObject7).getColumn(), 1, 1, str3);
                    localObject8 = paramWorksheet.getHyperlinks().get(i9);
                    ((Hyperlink)localObject8).b("");
                    ((Hyperlink)localObject8).setScreenTip(str4);
                  }
                  if (i6 != -1) {
                    ((Cell)localObject7).b(i6);
                  }
                  int i11;
                  Object localObject9;
                  int i12;
                  if ((i5 != 0) && (i4 + i3 != 0))
                  {
                    paramWorksheet.getCells().merge(m + localzbej.b, i2 + localzbej.a, i4 + 1, i3 + 1);
                    ((Cell)localObject7).a();
                    if (i6 != -1)
                    {
                      if (i3 > 0) {
                        for (i9 = i2 + localzbej.a + 1; i9 <= i2 + localzbej.a + i3; i9++) {
                          localRow.c(i9).b(i6);
                        }
                      }
                      if (i4 > 0) {
                        for (i11 = m + localzbej.b + 1; i11 <= m + localzbej.b + i4; i11++)
                        {
                          localObject9 = localRowCollection.a(i11, false, true, false);
                          for (i12 = i2 + localzbej.a; i12 <= i2 + localzbej.a + i3; i12++) {
                            ((Row)localObject9).c(i12).b(i6);
                          }
                        }
                      }
                      ((Cell)localObject7).a();
                    }
                  }
                  paramzcjy.l();
                  if (paramzcjy.o())
                  {
                    paramzcjy.a();
                    i2 += i3;
                  }
                  else
                  {
                    paramzcjy.d();
                    while (paramzcjy.s() != 4)
                    {
                      paramzcjy.k();
                      if (paramzcjy.s() != 1)
                      {
                        paramzcjy.a();
                      }
                      else
                      {
                        Object localObject10;
                        Object localObject11;
                        if ("Data".equals(paramzcjy.q()))
                        {
                          localObject9 = null;
                          i11 = 0;
                          boolean bool4;
                          while (paramzcjy.m()) {
                            if ("Type".equals(paramzcjy.q())) {
                              localObject9 = paramzcjy.t();
                            } else if ("Ticked".equals(paramzcjy.q())) {
                              bool4 = "1".equals(paramzcjy.t());
                            }
                          }
                          paramzcjy.l();
                          if (localObject9 == null) {
                            localObject9 = "String";
                          }
                          i12 = 0;
                          str1 = null;
                          if (!paramzcjy.o())
                          {
                            if (!"String".equals(localObject9))
                            {
                              str1 = paramzcjy.j();
                            }
                            else
                            {
                              paramzcjy.c(true);
                              paramzcjy.p = true;
                              if ("http://www.w3.org/TR/REC-html40".equals(paramzcjy.a("xmlns")))
                              {
                                localObject10 = new ArrayList();
                                localObject11 = ((Cell)localObject7).p().q();
                                Font localFont = new Font(paramWorksheet.c(), null, false);
                                localFont.a((Font)localObject11, null);
                                a(paramzcjy, (ArrayList)localObject10, (Font)localObject11, localFont, paramWorksheet.c(), false);
                                i12 = 1;
                                a((Cell)localObject7, (ArrayList)localObject10, paramWorksheet.c());
                              }
                              else
                              {
                                localObject10 = new StringBuilder();
                                a(paramzcjy, (StringBuilder)localObject10, false);
                                str1 = zs.a(localObject10);
                              }
                              paramzcjy.c(false);
                              paramzcjy.p = true;
                              if (paramzcjy.s() == 3) {
                                paramzcjy.a();
                              }
                            }
                          }
                          else {
                            paramzcjy.a();
                          }
                          if (i12 == 0)
                          {
                            localObject10 = null;
                            switch (i.a((String)localObject9))
                            {
                            case 82: 
                              if (str1 == null) {
                                localObject10 = "";
                              } else {
                                localObject10 = str1;
                              }
                              break;
                            case 83: 
                              if ((str1 == null) || ("".equals(str1))) {
                                localObject10 = Double.valueOf(0.0D);
                              } else {
                                localObject10 = Double.valueOf(zauj.C(str1));
                              }
                              break;
                            case 84: 
                              if ((str1 == null) || ("".equals(str1)))
                              {
                                localObject10 = Double.valueOf(0.0D);
                              }
                              else
                              {
                                localObject11 = zw.a(zw.a(str1, "T", " "));
                                localObject10 = paramWorksheet.d().getSettings().f().i().parseObject((String)localObject11);
                                if (localObject10 == null) {
                                  localObject10 = str1;
                                }
                              }
                              break;
                            case 85: 
                              if ((str1 == null) || ("".equals(str1))) {
                                localObject10 = Boolean.valueOf(false);
                              } else {
                                localObject10 = "0".equals(str1) ? znq.e : znq.d;
                              }
                              break;
                            case 86: 
                              localObject10 = str1;
                              break;
                            }
                            if (((Cell)localObject7).g()) {
                              ((zaai)((Cell)localObject7).c.d).a((Cell)localObject7, localObject10);
                            } else {
                              ((Cell)localObject7).putValue(localObject10);
                            }
                            if (localObject8 != null) {
                              ((Hyperlink)localObject8).b(zs.a(localObject10));
                            }
                          }
                          if (bool4)
                          {
                            localObject10 = ((Cell)localObject7).getStyle();
                            ((Style)localObject10).k(true);
                            ((Cell)localObject7).setStyle((Style)localObject10);
                          }
                        }
                        else if ("Comment".equals(paramzcjy.q()))
                        {
                          int i10 = paramWorksheet.getComments().add(m + localzbej.b, i2 + localzbej.a);
                          Comment localComment = paramWorksheet.getComments().get(i10);
                          while (paramzcjy.m()) {
                            switch (i.a(paramzcjy.q()))
                            {
                            case 87: 
                              localComment.setVisible("1".equals(paramzcjy.t()));
                            }
                          }
                          paramzcjy.l();
                          if (paramzcjy.o())
                          {
                            paramzcjy.a();
                          }
                          else
                          {
                            paramzcjy.d();
                            while (paramzcjy.s() != 4)
                            {
                              paramzcjy.k();
                              if (paramzcjy.s() != 1)
                              {
                                paramzcjy.a();
                              }
                              else if ("Data".equals(paramzcjy.q()))
                              {
                                paramzcjy.p = true;
                                paramzcjy.c(true);
                                ArrayList localArrayList = new ArrayList();
                                localObject10 = localComment.getFont();
                                localObject11 = new Font(paramWorksheet.c(), null, false);
                                ((Font)localObject11).a((Font)localObject10, null);
                                a(paramzcjy, localArrayList, (Font)localObject10, (Font)localObject11, paramWorksheet.c(), false);
                                a(localComment, localArrayList, paramWorksheet.c());
                                paramzcjy.p = false;
                                paramzcjy.c(false);
                                if (paramzcjy.s() == 3) {
                                  paramzcjy.a();
                                }
                              }
                              else
                              {
                                paramzcjy.a();
                              }
                            }
                            paramzcjy.h();
                          }
                        }
                        else if ("NamedCell".equals(paramzcjy.q()))
                        {
                          paramzcjy.a();
                        }
                        else
                        {
                          paramzcjy.a();
                        }
                      }
                    }
                    i2 += i3;
                    paramzcjy.h();
                  }
                }
                else
                {
                  a(paramzcjy.u(), paramzcjy.q());
                }
              }
            }
            paramzcjy.h();
            if (i1 == 0) {
              localzt.l(0, 0);
            }
          }
        }
        else
        {
          a(paramzcjy.u(), paramzcjy.q());
        }
      }
    }
    localzv.a(-10, 0, 0, 0);
    localCells.f();
    AutoFitterOptions localAutoFitterOptions = new AutoFitterOptions();
    localAutoFitterOptions.b = true;
    Iterator localIterator = localzbej.i.iterator();
    zbei localzbei1;
    while (localIterator.hasNext())
    {
      localzbei1 = (zbei)localIterator.next();
      zlo.a(paramWorksheet.getCells(), 0, 1048575, localzbei1.a, localzbei1.a + localzbei1.b, localAutoFitterOptions);
    }
    localIterator = localzbej.h.iterator();
    while (localIterator.hasNext())
    {
      localzbei1 = (zbei)localIterator.next();
      for (i4 = localzbei1.a; i4 <= localzbei1.a + localzbei1.b; i4++) {
        paramWorksheet.autoFitRow(i4);
      }
    }
    paramzcjy.h();
  }
  
  private void b(Worksheet paramWorksheet, zcjy paramzcjy)
    throws Exception
  {
    boolean bool = true;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = -1;
    int i1 = -1;
    int i2 = -1;
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    Object localObject;
    while (zauz.a(paramzcjy)) {
      switch (i.a(paramzcjy.q()))
      {
      case 88: 
        paramWorksheet.setGridlinesVisible(false);
        paramzcjy.a();
        break;
      case 89: 
        g(paramWorksheet, paramzcjy);
        break;
      case 90: 
        h(paramWorksheet, paramzcjy);
        break;
      case 91: 
        bool = false;
        paramzcjy.a();
        break;
      case 92: 
        paramWorksheet.setDisplayZeros(false);
        paramzcjy.a();
        break;
      case 93: 
        String str = paramzcjy.j();
        if ("SheetHidden".equals(str)) {
          paramWorksheet.a(false, false);
        } else if ("SheetVeryHidden".equals(str)) {
          paramWorksheet.a(false, true);
        }
        break;
      case 94: 
        paramWorksheet.setRowColumnHeadersVisible(false);
        paramzcjy.a();
        break;
      case 95: 
        paramWorksheet.setZoom(com.aspose.cells.b.a.zp.a(paramzcjy.j()));
        break;
      case 96: 
        j = 1;
        paramzcjy.a();
        break;
      case 97: 
        n = com.aspose.cells.b.a.zp.a(paramzcjy.j());
        break;
      case 98: 
        k = com.aspose.cells.b.a.zp.a(paramzcjy.j());
        break;
      case 99: 
        i1 = com.aspose.cells.b.a.zp.a(paramzcjy.j());
        break;
      case 100: 
        m = com.aspose.cells.b.a.zp.a(paramzcjy.j());
        break;
      case 101: 
        int i3 = com.aspose.cells.b.a.zp.a(paramzcjy.j());
        if (i3 < 64) {
          paramWorksheet.c(i3);
        }
        break;
      case 102: 
        localObject = paramzcjy.j();
        if (localObject != null) {
          paramWorksheet.setFirstVisibleRow(com.aspose.cells.b.a.zp.a((String)localObject));
        }
        break;
      case 103: 
        localObject = paramzcjy.j();
        if (localObject != null) {
          paramWorksheet.setFirstVisibleColumn(com.aspose.cells.b.a.zp.a((String)localObject));
        }
        break;
      case 104: 
        i2 = com.aspose.cells.b.a.zp.a(paramzcjy.j());
        break;
      case 105: 
        c(paramWorksheet, paramzcjy);
        break;
      case 106: 
        paramWorksheet.getProtection().setAllowEditingContent(false);
        paramWorksheet.getProtection().setAllowFiltering(true);
        paramzcjy.a();
        break;
      case 107: 
        paramWorksheet.getProtection().setAllowEditingContent(false);
        paramWorksheet.getProtection().setAllowSorting(true);
        paramzcjy.a();
        break;
      case 108: 
        paramWorksheet.getProtection().setAllowEditingContent(false);
        paramWorksheet.getProtection().setAllowFormattingColumn(true);
        paramzcjy.a();
        break;
      case 109: 
        paramWorksheet.getProtection().setAllowEditingContent(false);
        paramWorksheet.getProtection().setAllowFormattingRow(true);
        paramzcjy.a();
        break;
      case 110: 
        paramWorksheet.getProtection().setAllowEditingContent(false);
        paramWorksheet.getProtection().setAllowDeletingRow(true);
        paramzcjy.a();
        break;
      case 111: 
        paramWorksheet.getProtection().setAllowEditingContent(false);
        paramWorksheet.getProtection().setAllowDeletingColumn(true);
        paramzcjy.a();
        break;
      case 112: 
        paramWorksheet.getProtection().setAllowEditingContent(false);
        paramWorksheet.getProtection().setAllowFormattingCell(true);
        paramzcjy.a();
        break;
      case 113: 
        paramWorksheet.getProtection().setAllowEditingContent(false);
        paramWorksheet.getProtection().setAllowInsertingColumn(true);
        paramzcjy.a();
        break;
      case 114: 
        paramWorksheet.getProtection().setAllowEditingContent(false);
        paramWorksheet.getProtection().setAllowInsertingRow(true);
        paramzcjy.a();
        break;
      case 115: 
        paramWorksheet.getProtection().setAllowEditingContent(false);
        paramWorksheet.getProtection().setAllowInsertingHyperlink(true);
        paramzcjy.a();
        break;
      case 116: 
        paramWorksheet.getProtection().setAllowEditingContent(false);
        paramWorksheet.getProtection().setAllowUsingPivotTable(true);
        paramzcjy.a();
        break;
      case 117: 
        paramWorksheet.getProtection().setAllowEditingContent(false);
        paramWorksheet.getProtection().setAllowEditingObject(!zauj.b(paramzcjy.j(), false));
        break;
      case 118: 
        paramWorksheet.getProtection().setAllowEditingContent(false);
        paramWorksheet.getProtection().setAllowEditingScenario(!zauj.b(paramzcjy.j(), false));
        break;
      default: 
        paramzcjy.a();
      }
    }
    paramWorksheet.getPageSetup().setPercentScale(bool);
    if (j != 0) {
      paramWorksheet.a(true);
    }
    if ((n != -1) || (i1 != -1))
    {
      localObject = paramWorksheet.b();
      ((PaneCollection)localObject).a(k);
      ((PaneCollection)localObject).b(m);
      if (i1 != -1) {
        ((PaneCollection)localObject).d(i1);
      }
      if (n != -1) {
        ((PaneCollection)localObject).c(n);
      }
      if (i2 != -1) {
        ((PaneCollection)localObject).a(ze.a(i2));
      }
    }
  }
  
  private void c(Worksheet paramWorksheet, zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    zbew localzbew = new zbew(paramWorksheet);
    paramWorksheet.a(localzbew);
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1) {
        paramzcjy.a();
      } else if ("Pane".equals(paramzcjy.q()))
      {
        if (paramzcjy.o())
        {
          paramzcjy.a();
        }
        else
        {
          int j = -1;
          int k = -1;
          int m = -1;
          String str1 = null;
          paramzcjy.d();
          while (paramzcjy.s() != 4)
          {
            paramzcjy.k();
            if (paramzcjy.s() != 1) {
              paramzcjy.a();
            } else if ("Number".equals(paramzcjy.q())) {
              j = com.aspose.cells.b.a.zp.a(paramzcjy.j());
            } else if ("ActiveRow".equals(paramzcjy.q())) {
              k = com.aspose.cells.b.a.zp.a(paramzcjy.j());
            } else if ("ActiveCol".equals(paramzcjy.q())) {
              m = com.aspose.cells.b.a.zp.a(paramzcjy.j());
            } else if ("RangeSelection".equals(paramzcjy.q())) {
              str1 = paramzcjy.j();
            } else {
              paramzcjy.a();
            }
          }
          paramzcjy.h();
          if (j != -1)
          {
            zbev localzbev = new zbev(j);
            com.aspose.cells.b.a.a.zf.a(localzbew, localzbev);
            if (k != -1) {
              localzbev.a(k);
            }
            if (m != -1) {
              localzbev.b(m);
            }
            localzbev.c(0);
            Object localObject;
            if ((str1 != null) && (!"".equals(str1)))
            {
              localObject = zw.d(str1, ',');
              for (int n = 0; n < localObject.length; n++)
              {
                String str2 = localObject[n].trim();
                if (str2.length() > 0)
                {
                  CellArea localCellArea = zbek.f(str2);
                  com.aspose.cells.b.a.a.zf.a(localzbev.b(), localCellArea);
                }
              }
            }
            else
            {
              localObject = new CellArea();
              if (k != -1) {
                ((CellArea)localObject).StartRow = (((CellArea)localObject).EndRow = k);
              }
              if (m != -1) {
                ((CellArea)localObject).StartColumn = (((CellArea)localObject).EndColumn = m);
              }
              com.aspose.cells.b.a.a.zf.a(localzbev.b(), localObject);
            }
          }
        }
      }
      else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void d(Worksheet paramWorksheet, zcjy paramzcjy)
    throws Exception
  {
    paramWorksheet.getHorizontalPageBreaks().clear();
    paramWorksheet.getVerticalPageBreaks().clear();
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else
      {
        int j;
        int k;
        int m;
        if ("ColBreaks".equals(paramzcjy.q()))
        {
          if (paramzcjy.o())
          {
            paramzcjy.a();
          }
          else
          {
            paramzcjy.d();
            while (paramzcjy.s() != 4)
            {
              paramzcjy.k();
              if (paramzcjy.s() != 1) {
                paramzcjy.a();
              } else if ("ColBreak".equals(paramzcjy.q()))
              {
                if (paramzcjy.o())
                {
                  paramzcjy.a();
                }
                else
                {
                  paramzcjy.d();
                  j = -1;
                  k = -1;
                  m = -1;
                  while (paramzcjy.s() != 4)
                  {
                    paramzcjy.k();
                    if ((paramzcjy.s() != 1) || (paramzcjy.o())) {
                      paramzcjy.a();
                    } else if ("Column".equals(paramzcjy.q())) {
                      j = com.aspose.cells.b.a.zp.a(paramzcjy.j());
                    } else if ("RowStart".equals(paramzcjy.q())) {
                      k = com.aspose.cells.b.a.zp.a(paramzcjy.j());
                    } else if ("RowEnd".equals(paramzcjy.q())) {
                      m = com.aspose.cells.b.a.zp.a(paramzcjy.j());
                    } else {
                      paramzcjy.a();
                    }
                  }
                  if (j != -1) {
                    if ((k != -1) || (m != -1))
                    {
                      if (k == -1) {
                        k = 0;
                      }
                      if (m == -1) {
                        m = 255;
                      }
                      paramWorksheet.getVerticalPageBreaks().add(k, m, j);
                    }
                    else
                    {
                      paramWorksheet.getVerticalPageBreaks().add(0, j);
                    }
                  }
                  paramzcjy.h();
                }
              }
              else {
                paramzcjy.a();
              }
            }
            paramzcjy.h();
          }
        }
        else if ("RowBreaks".equals(paramzcjy.q()))
        {
          if (paramzcjy.o())
          {
            paramzcjy.a();
          }
          else
          {
            paramzcjy.d();
            while (paramzcjy.s() != 4)
            {
              paramzcjy.k();
              if (paramzcjy.s() != 1) {
                paramzcjy.a();
              } else if ("RowBreak".equals(paramzcjy.q()))
              {
                if (paramzcjy.o())
                {
                  paramzcjy.a();
                }
                else
                {
                  paramzcjy.d();
                  j = -1;
                  k = -1;
                  m = -1;
                  while (paramzcjy.s() != 4)
                  {
                    paramzcjy.k();
                    if ((paramzcjy.s() != 1) || (paramzcjy.o())) {
                      paramzcjy.a();
                    } else if ("Row".equals(paramzcjy.q())) {
                      j = com.aspose.cells.b.a.zp.a(paramzcjy.j());
                    } else if ("ColStart".equals(paramzcjy.q())) {
                      k = com.aspose.cells.b.a.zp.a(paramzcjy.j());
                    } else if ("ColEnd".equals(paramzcjy.q())) {
                      m = com.aspose.cells.b.a.zp.a(paramzcjy.j());
                    } else {
                      paramzcjy.a();
                    }
                  }
                  if (j != -1) {
                    if ((k != -1) || (m != -1))
                    {
                      if (k == -1) {
                        k = 0;
                      }
                      if (m == -1) {
                        m = 255;
                      }
                      paramWorksheet.getHorizontalPageBreaks().add(j, k, m);
                    }
                    else
                    {
                      paramWorksheet.getHorizontalPageBreaks().add(j, 0);
                    }
                  }
                  paramzcjy.h();
                }
              }
              else {
                paramzcjy.a();
              }
            }
            paramzcjy.h();
          }
        }
        else {
          paramzcjy.a();
        }
      }
    }
    paramzcjy.h();
  }
  
  private void e(Worksheet paramWorksheet, zcjy paramzcjy)
    throws Exception
  {
    CellArea localCellArea = zbek.f(paramzcjy.a("Range", this.a));
    paramWorksheet.getAutoFilter().setRange(localCellArea.StartRow, localCellArea.StartColumn, localCellArea.EndColumn);
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    int j = -1;
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1) {
        paramzcjy.a();
      } else if ("AutoFilterColumn".equals(paramzcjy.q())) {
        j = a(paramzcjy, paramWorksheet.getAutoFilter(), j);
      }
    }
    paramWorksheet.getAutoFilter().b = false;
    paramzcjy.h();
  }
  
  private int a(zcjy paramzcjy, AutoFilter paramAutoFilter, int paramInt)
    throws Exception
  {
    int j = paramInt + 1;
    String str1 = paramzcjy.a("Index", this.a);
    if (str1 != null) {
      j = zauj.F(str1) - 1;
    }
    String str2 = paramzcjy.a("Type", this.a);
    if (str2 == null)
    {
      paramzcjy.a();
      return j;
    }
    String str3;
    int k;
    switch (i.a(str2))
    {
    case 119: 
    case 120: 
      if (paramzcjy.o())
      {
        paramzcjy.a();
        return j;
      }
      paramzcjy.d();
      while (paramzcjy.s() != 4)
      {
        paramzcjy.k();
        if (paramzcjy.s() != 1)
        {
          paramzcjy.a();
        }
        else
        {
          str3 = paramzcjy.q();
          switch (i.a(str3))
          {
          case 125: 
            Object[] arrayOfObject1 = k(paramzcjy);
            paramAutoFilter.custom(j, ((Integer)arrayOfObject1[0]).intValue(), arrayOfObject1[1]);
            break;
          case 126: 
          case 127: 
            boolean bool = "AutoFilterAnd".equals(str3);
            if (paramzcjy.o())
            {
              paramzcjy.a();
            }
            else
            {
              paramzcjy.d();
              Object[] arrayOfObject2 = null;
              Object[] arrayOfObject3 = null;
              while (paramzcjy.s() != 4)
              {
                paramzcjy.k();
                if (paramzcjy.s() != 1) {
                  paramzcjy.a();
                } else {
                  switch (i.a(paramzcjy.q()))
                  {
                  case 125: 
                    if (arrayOfObject2 == null) {
                      arrayOfObject2 = k(paramzcjy);
                    } else {
                      arrayOfObject3 = k(paramzcjy);
                    }
                    break;
                  }
                }
              }
              paramAutoFilter.custom(j, ((Integer)arrayOfObject2[0]).intValue(), arrayOfObject2[1], bool, ((Integer)arrayOfObject3[0]).intValue(), arrayOfObject3[1]);
              paramzcjy.h();
            }
            break;
          }
        }
      }
      paramzcjy.h();
      return j;
    case 26: 
      str3 = paramzcjy.a("Value", this.a);
      k = zauj.F(str3);
      paramAutoFilter.filterTop10(j, true, false, k);
      paramzcjy.a();
      return j;
    case 27: 
      str3 = paramzcjy.a("Value", this.a);
      k = zauj.F(str3);
      paramAutoFilter.filterTop10(j, false, false, k);
      paramzcjy.a();
      return j;
    case 121: 
      str3 = paramzcjy.a("Value", this.a);
      k = zauj.F(str3);
      paramAutoFilter.filterTop10(j, true, true, k);
      paramzcjy.a();
      return j;
    case 122: 
      str3 = paramzcjy.a("Value", this.a);
      k = zauj.F(str3);
      paramAutoFilter.filterTop10(j, false, true, k);
      paramzcjy.a();
      return j;
    case 123: 
      paramAutoFilter.matchBlanks(j);
      paramzcjy.a();
      return j;
    case 124: 
      paramAutoFilter.matchNonBlanks(j);
      paramzcjy.a();
      return j;
    }
    paramzcjy.a();
    return j;
  }
  
  private Object[] k(zcjy paramzcjy)
    throws Exception
  {
    String str1 = paramzcjy.a("Operator", this.a);
    String str2 = paramzcjy.a("Value", this.a);
    paramzcjy.a();
    int j = 2;
    Object[] arrayOfObject = new Object[2];
    switch (i.a(str1))
    {
    case 128: 
      j = 3;
      break;
    case 129: 
      j = 5;
      break;
    case 130: 
      j = 1;
      break;
    case 131: 
      j = 0;
      break;
    case 132: 
      j = 4;
      break;
    case 133: 
      j = 2;
      break;
    case 32: 
      j = 6;
      break;
    default: 
      j = 2;
    }
    arrayOfObject[0] = Integer.valueOf(j);
    if (str2 != null) {
      if (zarb.b(str2))
      {
        double d1 = zauj.C(str2);
        arrayOfObject[1] = Double.valueOf(d1);
      }
      else
      {
        arrayOfObject[1] = str2;
      }
    }
    return arrayOfObject;
  }
  
  private void f(Worksheet paramWorksheet, zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if ("NamedRange".equals(paramzcjy.q()))
      {
        String str1 = paramzcjy.a("Name", this.b);
        String str2 = str1;
        String str3 = paramzcjy.a("RefersTo", this.b);
        if ((str2 != null) && (str3 != null)) {
          try
          {
            int j = this.d.getWorksheets().getNames().a(paramWorksheet.getIndex(), str2);
            Name localName = this.d.getWorksheets().getNames().get(j);
            localName.f(str2.toUpperCase());
            localName.setRefersTo(zauw.b(str3, -1, -1));
          }
          catch (Exception localException) {}
        }
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void g(Worksheet paramWorksheet, zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else
      {
        String str1;
        if ("Layout".equals(paramzcjy.q()))
        {
          str1 = paramzcjy.a("Orientation", this.a);
          if (str1 != null) {
            if ("Landscape".equals(str1)) {
              paramWorksheet.getPageSetup().setOrientation(0);
            } else {
              paramWorksheet.getPageSetup().setOrientation(1);
            }
          }
          str1 = paramzcjy.a("CenterHorizontal", this.a);
          if (str1 != null) {
            if (("".equals(str1)) || ("0".equals(str1))) {
              paramWorksheet.getPageSetup().setCenterHorizontally(false);
            } else {
              paramWorksheet.getPageSetup().setCenterHorizontally(true);
            }
          }
          str1 = paramzcjy.a("CenterVertical", this.a);
          if (str1 != null) {
            if (("".equals(str1)) || ("0".equals(str1))) {
              paramWorksheet.getPageSetup().setCenterVertically(false);
            } else {
              paramWorksheet.getPageSetup().setCenterVertically(true);
            }
          }
          str1 = paramzcjy.a("StartPageNumber", this.a);
          if (str1 != null) {
            paramWorksheet.getPageSetup().setFirstPageNumber(com.aspose.cells.b.a.zp.a(str1));
          }
          paramzcjy.a();
        }
        else if ("PageMargins".equals(paramzcjy.q()))
        {
          str1 = paramzcjy.a("Bottom", this.a);
          if ((str1 != null) && (str1.length() > 0)) {
            paramWorksheet.getPageSetup().setBottomMargin(zauj.C(str1) * 2.54D);
          }
          str1 = paramzcjy.a("Left", this.a);
          if ((str1 != null) && (str1.length() > 0)) {
            paramWorksheet.getPageSetup().setLeftMargin(zauj.C(str1) * 2.54D);
          }
          str1 = paramzcjy.a("Right", this.a);
          if ((str1 != null) && (str1.length() > 0)) {
            paramWorksheet.getPageSetup().setRightMargin(zauj.C(str1) * 2.54D);
          }
          str1 = paramzcjy.a("Top", this.a);
          if ((str1 != null) && (str1.length() > 0)) {
            paramWorksheet.getPageSetup().setTopMargin(zauj.C(str1) * 2.54D);
          }
          paramzcjy.a();
        }
        else
        {
          int m;
          int n;
          int i1;
          if ("Header".equals(paramzcjy.q()))
          {
            str1 = paramzcjy.a("Data", this.a);
            if (str1 != null)
            {
              int j = 1;
              m = 0;
              for (n = 0; n < str1.length(); n++) {
                if ((str1.charAt(n) == '&') && (n + 1 < str1.length()))
                {
                  switch (str1.charAt(n + 1))
                  {
                  case 'L': 
                  case 'l': 
                    i1 = 0;
                    break;
                  case 'C': 
                  case 'c': 
                    i1 = 1;
                    break;
                  case 'R': 
                  case 'r': 
                    i1 = 2;
                    break;
                  }
                  if (n - m > 0) {
                    paramWorksheet.getPageSetup().setHeader(j, str1.substring(m, m + (n - m)));
                  }
                  j = i1;
                  m = n + 2;
                }
              }
              if (m < str1.length()) {
                paramWorksheet.getPageSetup().setHeader(j, str1.substring(m));
              }
            }
            String str2 = paramzcjy.a("Margin", this.a);
            if ((str2 != null) && (str2.length() > 0)) {
              paramWorksheet.getPageSetup().setHeaderMargin(zauj.C(str2) * 2.54D);
            }
            paramzcjy.a();
          }
          else if ("Footer".equals(paramzcjy.q()))
          {
            str1 = paramzcjy.a("Data", this.a);
            if (str1 != null)
            {
              int k = 1;
              m = 0;
              for (n = 0; n < str1.length(); n++) {
                if ((str1.charAt(n) == '&') && (n + 1 < str1.length()))
                {
                  switch (str1.charAt(n + 1))
                  {
                  case 'L': 
                  case 'l': 
                    i1 = 0;
                    break;
                  case 'C': 
                  case 'c': 
                    i1 = 1;
                    break;
                  case 'R': 
                  case 'r': 
                    i1 = 2;
                    break;
                  }
                  if (n - m > 0) {
                    paramWorksheet.getPageSetup().setFooter(k, str1.substring(m, m + (n - m)));
                  }
                  k = i1;
                  m = n + 2;
                }
              }
              if (m < str1.length()) {
                paramWorksheet.getPageSetup().setFooter(k, str1.substring(m));
              }
            }
            String str3 = paramzcjy.a("Margin", this.a);
            if ((str3 != null) && (str3.length() > 0)) {
              paramWorksheet.getPageSetup().setFooterMargin(zauj.C(str3) * 2.54D);
            }
            paramzcjy.a();
          }
          else
          {
            paramzcjy.a();
          }
        }
      }
    }
    paramzcjy.h();
  }
  
  private void h(Worksheet paramWorksheet, zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    int j = 0;
    int k = -1;
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else
      {
        String str;
        if ("FitWidth".equals(paramzcjy.q()))
        {
          str = paramzcjy.j();
          paramWorksheet.getPageSetup().setFitToPagesWide(com.aspose.cells.b.a.zp.a(str));
        }
        else if ("FitHeight".equals(paramzcjy.q()))
        {
          str = paramzcjy.j();
          paramWorksheet.getPageSetup().setFitToPagesTall(com.aspose.cells.b.a.zp.a(str));
        }
        else if ("LeftToRight".equals(paramzcjy.q()))
        {
          paramWorksheet.getPageSetup().setOrder(1);
          paramzcjy.a();
        }
        else if ("BlackAndWhite".equals(paramzcjy.q()))
        {
          paramWorksheet.getPageSetup().setBlackAndWhite(true);
          paramzcjy.a();
        }
        else if ("DraftQuality".equals(paramzcjy.q()))
        {
          paramWorksheet.getPageSetup().setPrintDraft(true);
          paramzcjy.a();
        }
        else if ("CommentsLayout".equals(paramzcjy.q()))
        {
          str = paramzcjy.j();
          if ("SheetEnd".equals(str)) {
            paramWorksheet.getPageSetup().setPrintComments(2);
          } else if ("InPlace".equals(str)) {
            paramWorksheet.getPageSetup().setPrintComments(0);
          } else {
            paramWorksheet.getPageSetup().setPrintComments(1);
          }
        }
        else if ("PrintErrors".equals(paramzcjy.q()))
        {
          str = paramzcjy.j();
          if ("NA".equals(str)) {
            paramWorksheet.getPageSetup().setPrintErrors(3);
          } else if ("Dash".equals(str)) {
            paramWorksheet.getPageSetup().setPrintErrors(1);
          } else if ("Blank".equals(str)) {
            paramWorksheet.getPageSetup().setPrintErrors(0);
          } else {
            paramWorksheet.getPageSetup().setPrintErrors(2);
          }
        }
        else if ("Scale".equals(paramzcjy.q()))
        {
          paramWorksheet.getPageSetup().setZoom(com.aspose.cells.b.a.zp.a(paramzcjy.j()));
        }
        else if ("ValidPrinterInfo".equals(paramzcjy.q()))
        {
          j = 1;
          paramzcjy.a();
        }
        else if ("PaperSizeIndex".equals(paramzcjy.q()))
        {
          k = com.aspose.cells.b.a.zp.a(paramzcjy.j());
        }
        else if ("HorizontalResolution".equals(paramzcjy.q()))
        {
          paramWorksheet.getPageSetup().setPrintQuality(com.aspose.cells.b.a.zp.a(paramzcjy.j()));
        }
        else if ("Gridlines".equals(paramzcjy.q()))
        {
          paramWorksheet.getPageSetup().setPrintGridlines(true);
          paramzcjy.a();
        }
        else if ("RowColHeadings".equals(paramzcjy.q()))
        {
          paramWorksheet.getPageSetup().setPrintHeadings(true);
          paramzcjy.a();
        }
        else
        {
          paramzcjy.a();
        }
      }
    }
    paramzcjy.h();
    if (j != 0) {
      switch (k)
      {
      case -1: 
      case 119: 
        paramWorksheet.getPageSetup().setPaperSize(1);
        break;
      default: 
        paramWorksheet.getPageSetup().setPaperSize(k);
      }
    }
  }
  
  private void a(zcjy paramzcjy, Worksheet paramWorksheet)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    Validation localValidation = paramWorksheet.getValidations().get(paramWorksheet.getValidations().add());
    String str2 = null;
    String str3 = null;
    while (zauz.a(paramzcjy))
    {
      Object localObject;
      if ("Range".equals(paramzcjy.q()))
      {
        localObject = paramzcjy.j();
        ArrayList localArrayList = new ArrayList();
        if ((localObject != null) && (((String)localObject).length() > 0)) {
          zbek.a((String)localObject, localArrayList);
        }
        for (int j = 0; j < localArrayList.size(); j++) {
          com.aspose.cells.b.a.a.zf.a(localValidation.getAreaList(), (CellArea)localArrayList.get(j));
        }
      }
      else
      {
        String str1;
        if ("Type".equals(paramzcjy.q()))
        {
          str1 = paramzcjy.j();
          switch (i.a(str1))
          {
          case 119: 
          case 120: 
            localValidation.setType(7);
            break;
          case 134: 
            localValidation.setType(4);
            break;
          case 135: 
            localValidation.setType(2);
            break;
          case 136: 
            localValidation.setType(3);
            break;
          case 137: 
            localValidation.setType(6);
            break;
          case 138: 
            localValidation.setType(5);
            break;
          case 139: 
            localValidation.setType(1);
            break;
          case 140: 
            localValidation.setType(0);
            break;
          }
        }
        else if ("CellRangeList".equals(paramzcjy.q()))
        {
          paramzcjy.a();
        }
        else if ("Qualifier".equals(paramzcjy.q()))
        {
          str1 = paramzcjy.j();
          switch (i.a(str1))
          {
          case 141: 
            localValidation.setOperator(0);
            break;
          case 142: 
            localValidation.setOperator(7);
            break;
          case 143: 
            localValidation.setOperator(1);
            break;
          case 144: 
            localValidation.setOperator(8);
            break;
          case 145: 
            localValidation.setOperator(2);
            break;
          case 146: 
            localValidation.setOperator(4);
            break;
          case 147: 
            localValidation.setOperator(3);
            break;
          case 148: 
            localValidation.setOperator(5);
          }
        }
        else if ("UseBlank".equals(paramzcjy.q()))
        {
          localValidation.setIgnoreBlank(false);
          paramzcjy.a();
        }
        else if ("Min".equals(paramzcjy.q()))
        {
          if (localValidation.getOperator() == 6) {
            localValidation.setOperator(0);
          }
          str1 = paramzcjy.j();
          if (localValidation.getAreaList().size() > 0)
          {
            localObject = (CellArea)localValidation.getAreaList().get(0);
            str2 = "=" + zauw.b(str1, ((CellArea)localObject).StartRow, ((CellArea)localObject).StartColumn);
          }
          else
          {
            str2 = "=" + zauw.b(str1, 0, 0);
          }
        }
        else if ("Max".equals(paramzcjy.q()))
        {
          if (localValidation.getOperator() == 6) {
            localValidation.setOperator(0);
          }
          str1 = paramzcjy.j();
          if (localValidation.getAreaList().size() > 0)
          {
            localObject = (CellArea)localValidation.getAreaList().get(0);
            str3 = "=" + zauw.b(str1, ((CellArea)localObject).StartRow, ((CellArea)localObject).StartColumn);
          }
          else
          {
            str3 = "=" + zauw.b(str1, 0, 0);
          }
        }
        else if ("Value".equals(paramzcjy.q()))
        {
          str1 = paramzcjy.j();
          if (localValidation.getAreaList().size() > 0)
          {
            localObject = (CellArea)localValidation.getAreaList().get(0);
            str2 = "=" + zauw.b(str1, ((CellArea)localObject).StartRow, ((CellArea)localObject).StartColumn);
          }
          else
          {
            str2 = "=" + zauw.b(str1, 0, 0);
          }
        }
        else if ("ComboHide".equals(paramzcjy.q()))
        {
          localValidation.setInCellDropDown(false);
          paramzcjy.a();
        }
        else if ("IMEMode".equals(paramzcjy.q()))
        {
          str1 = paramzcjy.j();
          switch (i.a(str1))
          {
          case 149: 
            localValidation.a(0);
            break;
          case 150: 
            localValidation.a(1);
            break;
          case 151: 
            localValidation.a(2);
          }
          paramzcjy.a();
        }
        else if ("InputHide".equals(paramzcjy.q()))
        {
          localValidation.setShowInput(false);
          paramzcjy.a();
        }
        else if ("InputTitle".equals(paramzcjy.q()))
        {
          localValidation.setInputTitle(paramzcjy.j());
        }
        else if ("InputMessage".equals(paramzcjy.q()))
        {
          localValidation.setInputMessage(paramzcjy.j());
        }
        else if ("ErrorHide".equals(paramzcjy.q()))
        {
          localValidation.setShowError(false);
          paramzcjy.a();
        }
        else if ("ErrorStyle".equals(paramzcjy.q()))
        {
          str1 = paramzcjy.j();
          switch (i.a(str1))
          {
          case 152: 
            localValidation.setAlertStyle(1);
            break;
          case 153: 
            localValidation.setAlertStyle(0);
            break;
          case 154: 
            localValidation.setAlertStyle(2);
          }
        }
        else if ("ErrorMessage".equals(paramzcjy.q()))
        {
          localValidation.setErrorMessage(paramzcjy.j());
        }
        else if ("ErrorTitle".equals(paramzcjy.q()))
        {
          localValidation.setErrorTitle(paramzcjy.j());
        }
        else
        {
          paramzcjy.a();
        }
      }
    }
    localValidation.a(str2, str3);
  }
  
  private Color a(Color paramColor)
  {
    if (this.d.isColorInPalette(paramColor)) {
      return paramColor;
    }
    if (this.e < 0) {
      this.e = 55;
    }
    this.d.changePalette(paramColor, this.e--);
    return paramColor;
  }
  
  private void a(Cell paramCell, ArrayList paramArrayList, WorksheetCollection paramWorksheetCollection)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    ArrayList localArrayList = new ArrayList();
    for (int j = 0; j < paramArrayList.size(); j++)
    {
      zbeh localzbeh = (zbeh)paramArrayList.get(j);
      if ((localzbeh.b != null) && (!"".equals(localzbeh.b)))
      {
        FontSetting localFontSetting = new FontSetting(localStringBuilder.length(), localzbeh.b.length(), paramWorksheetCollection);
        localStringBuilder.append(localzbeh.b);
        localFontSetting.a(localzbeh.a);
        com.aspose.cells.b.a.a.zf.a(localArrayList, localFontSetting);
      }
    }
    if (paramCell.g()) {
      paramCell.a(zs.a(localStringBuilder), (byte)0);
    } else {
      paramCell.a(zs.a(localStringBuilder), localArrayList);
    }
  }
  
  private void a(Comment paramComment, ArrayList paramArrayList, WorksheetCollection paramWorksheetCollection)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (int j = 0; j < paramArrayList.size(); j++)
    {
      zbeh localzbeh = (zbeh)paramArrayList.get(j);
      if ((localzbeh.b != null) && (!"".equals(localzbeh.b)))
      {
        FontSetting localFontSetting = paramComment.b().b(localStringBuilder.length(), localzbeh.b.length());
        localStringBuilder.append(localzbeh.b);
        localFontSetting.a(localzbeh.a);
      }
    }
    paramComment.b().c = zs.a(localStringBuilder);
  }
  
  private void a(zcjy paramzcjy, ArrayList paramArrayList, Font paramFont1, Font paramFont2, WorksheetCollection paramWorksheetCollection, boolean paramBoolean)
    throws Exception
  {
    if (!paramBoolean)
    {
      if (paramzcjy.o())
      {
        paramzcjy.a();
        return;
      }
      paramzcjy.d();
    }
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      Object localObject;
      if (paramzcjy.s() != 1)
      {
        if (paramzcjy.s() == 3)
        {
          localObject = new zbeh();
          ((zbeh)localObject).b = paramzcjy.t();
          if ("\n".equals(((zbeh)localObject).b)) {
            ((zbeh)localObject).b = " ";
          }
          ((zbeh)localObject).a = new Font(paramWorksheetCollection, null, false);
          ((zbeh)localObject).a.a(paramFont2, null);
          com.aspose.cells.b.a.a.zf.a(paramArrayList, localObject);
        }
        paramzcjy.a();
      }
      else
      {
        switch (i.a(paramzcjy.q()))
        {
        case 155: 
          paramFont2.setUnderline(1);
          localObject = paramzcjy.a("html:Style");
          if ((localObject != null) && (((String)localObject).length() > 14))
          {
            localObject = ((String)localObject).substring(15);
            if (localObject != null) {
              switch (i.a((String)localObject))
              {
              case 161: 
                paramFont2.setUnderline(2);
                break;
              case 162: 
                paramFont2.setUnderline(3);
                break;
              case 163: 
                paramFont2.setUnderline(4);
              }
            }
          }
          break;
        case 156: 
          paramFont2.setItalic(true);
          break;
        case 157: 
          paramFont2.setBold(true);
          break;
        case 158: 
          paramFont2.setStrikeout(true);
          break;
        case 159: 
          paramFont2.setSuperscript(true);
          break;
        case 160: 
          paramFont2.setSuperscript(true);
          break;
        case 13: 
          if (paramzcjy.n())
          {
            while (paramzcjy.m()) {
              switch (i.a(paramzcjy.q()))
              {
              case 164: 
                paramFont2.a(paramzcjy.t(), false, 0);
                break;
              case 165: 
                paramFont2.setColor(com.aspose.cells.b.a.b.zf.a(paramzcjy.t()));
                break;
              case 166: 
                paramFont2.setDoubleSize(zauj.C(paramzcjy.t()));
              }
            }
            paramzcjy.l();
          }
          break;
        }
        a(paramzcjy, paramArrayList, paramFont1, paramFont2, paramWorksheetCollection, false);
      }
    }
    switch (i.a(paramzcjy.q()))
    {
    case 155: 
      paramFont2.setUnderline(0);
      break;
    case 156: 
      paramFont2.setItalic(false);
      break;
    case 157: 
      paramFont2.setBold(false);
      break;
    case 158: 
      paramFont2.setStrikeout(false);
      break;
    case 159: 
      paramFont2.setSuperscript(false);
      break;
    case 160: 
      paramFont2.setSuperscript(false);
      break;
    case 13: 
      paramFont2.a(paramFont1.getName(), false, 0);
      paramFont2.setColor(paramFont1.getColor());
      paramFont2.setSize(paramFont1.getSize());
      break;
    }
    paramzcjy.h();
  }
  
  private void a(zcjy paramzcjy, StringBuilder paramStringBuilder, boolean paramBoolean)
    throws Exception
  {
    if (!paramBoolean)
    {
      if (paramzcjy.o())
      {
        paramzcjy.a();
        return;
      }
      paramzcjy.d();
    }
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramStringBuilder.append(paramzcjy.t());
        paramzcjy.a();
      }
      else
      {
        a(paramzcjy, paramStringBuilder, false);
      }
    }
    paramzcjy.h();
  }
  
  private String a(String paramString, int paramInt)
  {
    throw new CellsException(6, "Line " + paramInt + ": " + paramString + " in the SpreadsheetML file.");
  }
  
  private void a(int paramInt, String paramString)
  {
    throw new CellsException(6, "Line " + paramInt + ": Invalid tag \"" + paramString + "\" in the SpreadsheetML file.");
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbeg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */