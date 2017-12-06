package com.aspose.cells;

import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zakv
{
  private zarf a = null;
  private ArrayList b;
  private ArrayList c;
  private String d = null;
  private String e = null;
  private String f = null;
  private Worksheet g = null;
  private Row h = null;
  private int i = 0;
  private static final za j = new za(new String[] { "workspace", "rows", "tabular-model", "columns", "datasource", "cell-style", "layoutstyle", "paragraphstyle", "vector-style", "vertical-gridline-styles", "horizontal-gridline-styles", "stylesheet", "document", "workspace-array", "page-info", "layers", "layer", "drawables", "tabular-info", "grid", "styles", "anon-styles", "ID", "miter-limit", "width", "cap", "join", "color", "pattern", "type", "phase", "property-map", "SFTStrokeProperty", "stroke", "IDREF", "start-index", "stop-index", "SFTCellStylePropertyParagraphStyle", "SFTCellStylePropertyNumberFormat", "SFTCellStylePropertyDateTimeFormat", "SFTCellStylePropertyLayoutStyle", "SFTCellStylePropertyDurationFormat", "layoutParagraphStyle", "SFTCellTextWrapProperty", "fill", "bold", "italic", "fontName", "fontColor", "fontSize", "alignment", "verticalAlignment", "date-format", "date-format-ref", "number-format", "duration-format", "paragraphstyle-ref", "opacity", "1", "2", "3", "4", "fmt", "hhhh mmmm ssss", "format-type", "format-decimal-places", "format-string", "format-show-thousands-separator", "format-currency-code", "format-negative-style", "format-base-places", "format-use-accounting-style", "format-fraction-accuracy", "0", "number", "r", "g", "b", "a", "s", "v", "cell-date", "du", "ct", "t", "n", "d", "f", "cf", "fo", "hiding-state", "height" });
  
  zakv(zarf paramzarf)
  {
    this.a = paramzarf;
  }
  
  void a(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    if (paramzcjy.d()) {
      while (zauz.a(paramzcjy)) {
        switch (j.a(paramzcjy.q()))
        {
        case 0: 
          l(paramzcjy);
          break;
        case 1: 
          n(paramzcjy);
          break;
        case 2: 
          o(paramzcjy);
          break;
        case 3: 
          m(paramzcjy);
          break;
        case 4: 
          i(paramzcjy);
          break;
        case 5: 
        case 6: 
        case 7: 
          a(paramzcjy, null);
          break;
        case 8: 
          a(paramzcjy, null);
          break;
        case 9: 
          a(paramzcjy, true);
          break;
        case 10: 
          a(paramzcjy, false);
          break;
        case 11: 
        case 12: 
        case 13: 
        case 14: 
        case 15: 
        case 16: 
        case 17: 
        case 18: 
        case 19: 
        case 20: 
        case 21: 
          a(paramzcjy);
          break;
        default: 
          paramzcjy.a();
        }
      }
    }
  }
  
  private zarl a(zcjy paramzcjy, zarl paramzarl)
    throws Exception
  {
    String str = paramzcjy.a("ID");
    if (paramzarl == null) {
      paramzarl = new zarl();
    }
    if (str != null) {
      this.a.a(str, paramzarl);
    }
    c(paramzcjy, paramzarl);
    return paramzarl;
  }
  
  private void b(zcjy paramzcjy, zarl paramzarl)
    throws Exception
  {
    zari localzari = new zari();
    String str = null;
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (j.a(paramzcjy.q()))
        {
        case 22: 
          str = paramzcjy.t();
          break;
        case 23: 
          localzari.b = paramzcjy.t();
          break;
        case 24: 
          localzari.c = com.aspose.cells.a.c.zp.a(paramzcjy.t());
          break;
        case 25: 
          localzari.d = paramzcjy.t();
          break;
        case 26: 
          localzari.e = paramzcjy.t();
        }
      }
      paramzcjy.l();
    }
    if (str != null) {
      this.a.h.put(str, localzari);
    }
    paramzarl.a = localzari;
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (j.a(paramzcjy.q()))
      {
      case 27: 
        localzari.a(c(paramzcjy, false));
        break;
      case 28: 
        localzari.f = b(paramzcjy);
        break;
      default: 
        paramzcjy.a();
      }
    }
  }
  
  private zarh b(zcjy paramzcjy)
    throws Exception
  {
    zarh localzarh = new zarh();
    String str = null;
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (j.a(paramzcjy.q()))
        {
        case 22: 
          str = paramzcjy.t();
          break;
        case 29: 
          localzarh.b = paramzcjy.t();
          break;
        case 30: 
          localzarh.a = paramzcjy.t();
        }
      }
      paramzcjy.l();
    }
    if (str != null) {
      this.a.i.put(str, localzarh);
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return localzarh;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("pattern".equals(paramzcjy.q())) {
        a(paramzcjy, localzarh);
      } else {
        paramzcjy.a();
      }
    }
    return localzarh;
  }
  
  private void a(zcjy paramzcjy, zarh paramzarh)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy))
    {
      if ("element".equals(paramzcjy.q()))
      {
        String str = paramzcjy.a("val");
        if (str != null)
        {
          if (paramzarh.c == null) {
            paramzarh.c = new ArrayList();
          }
          paramzarh.c.add(Double.valueOf(com.aspose.cells.a.c.zp.a(str)));
        }
      }
      paramzcjy.a();
    }
  }
  
  private void c(zcjy paramzcjy, zarl paramzarl)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (j.a(paramzcjy.q()))
      {
      case 31: 
      case 32: 
        c(paramzcjy, paramzarl);
        break;
      case 33: 
        b(paramzcjy, paramzarl);
        break;
      default: 
        paramzcjy.a();
      }
    }
  }
  
  private void a(zcjy paramzcjy, boolean paramBoolean)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    ArrayList localArrayList = null;
    if (paramBoolean)
    {
      if (this.c == null) {
        this.c = new ArrayList();
      }
      localArrayList = this.c;
    }
    else
    {
      if (this.b == null) {
        this.b = new ArrayList();
      }
      localArrayList = this.b;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("style-run".equals(paramzcjy.q())) {
        a(paramzcjy, localArrayList);
      } else {
        paramzcjy.a();
      }
    }
  }
  
  private void a(zcjy paramzcjy, ArrayList paramArrayList)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    String str = paramzcjy.a("gridline-index");
    if (str == null) {
      return;
    }
    int k = com.aspose.cells.b.a.zp.a(str);
    paramzcjy.d();
    while (zauz.a(paramzcjy))
    {
      if (("vector-style-ref".equals(paramzcjy.q())) && (paramzcjy.n()))
      {
        zarg localzarg = new zarg();
        localzarg.a = k;
        paramArrayList.add(localzarg);
        while (paramzcjy.m()) {
          switch (j.a(paramzcjy.q()))
          {
          case 34: 
            localzarg.b = paramzcjy.t();
            break;
          case 35: 
            localzarg.c = com.aspose.cells.b.a.zp.a(paramzcjy.t());
            break;
          case 36: 
            localzarg.d = com.aspose.cells.b.a.zp.a(paramzcjy.t());
          }
        }
        paramzcjy.l();
      }
      paramzcjy.a();
    }
  }
  
  private zarj a(zcjy paramzcjy, zarj paramzarj)
    throws Exception
  {
    String str = paramzcjy.a("ID");
    if (paramzarj == null)
    {
      paramzarj = new zarj();
      paramzarj.a = this.a.b.getWorksheets().p().createStyle();
    }
    if (str != null) {
      this.a.a(str, paramzarj);
    }
    b(paramzcjy, paramzarj);
    return paramzarj;
  }
  
  private void b(zcjy paramzcjy, zarj paramzarj)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy))
    {
      String str;
      switch (j.a(paramzcjy.q()))
      {
      case 31: 
      case 37: 
      case 38: 
      case 39: 
      case 40: 
      case 41: 
      case 42: 
        b(paramzcjy, paramzarj);
        break;
      case 6: 
      case 7: 
        a(paramzcjy, paramzarj);
        break;
      case 43: 
        h(paramzcjy);
        if ((this.d != null) && ("1".equals(this.d))) {
          paramzarj.a.setTextWrapped(true);
        }
        break;
      case 44: 
        c(paramzcjy, paramzarj);
        break;
      case 45: 
        h(paramzcjy);
        paramzarj.a.getFont().setBold(zauj.b(this.d, false));
        break;
      case 46: 
        h(paramzcjy);
        paramzarj.a.getFont().setItalic(zauj.b(this.d, false));
        break;
      case 47: 
        str = d(paramzcjy);
        if (str != null) {
          paramzarj.a.getFont().setName(a(str));
        }
        break;
      case 48: 
        paramzarj.a.getFont().setColor(b(paramzcjy, false));
        break;
      case 49: 
        h(paramzcjy);
        if (this.d != null) {
          paramzarj.a.getFont().setDoubleSize(zauj.C(this.d));
        }
        break;
      case 50: 
        h(paramzcjy);
        if (this.d != null) {
          switch (j.a(this.d))
          {
          case 58: 
            paramzarj.a.setHorizontalAlignment(8);
            break;
          case 59: 
            paramzarj.a.setHorizontalAlignment(1);
            break;
          case 60: 
            paramzarj.a.setHorizontalAlignment(6);
            break;
          case 61: 
            paramzarj.a.setVerticalAlignment(9);
            break;
          }
        } else {
          paramzarj.a.setHorizontalAlignment(7);
        }
        break;
      case 51: 
        h(paramzcjy);
        if (this.d != null) {
          switch (j.a(this.d))
          {
          case 59: 
            paramzarj.a.setVerticalAlignment(0);
            break;
          case 58: 
            paramzarj.a.setHorizontalAlignment(1);
            break;
          }
        } else {
          paramzarj.a.setHorizontalAlignment(9);
        }
        break;
      case 52: 
        paramzarj.c = g(paramzcjy);
        break;
      case 53: 
        paramzarj.c = f(paramzcjy);
        break;
      case 54: 
        paramzarj.b = e(paramzcjy);
        break;
      case 55: 
        paramzarj.d = c(paramzcjy);
        break;
      case 56: 
        str = paramzcjy.a("IDREF");
        Style localStyle = this.a.a(str, null);
        if (localStyle != null)
        {
          paramzarj.a.getFont().a(localStyle.getFont(), this.a.g);
          paramzarj.a.setHorizontalAlignment(localStyle.getHorizontalAlignment());
          paramzarj.a.setVerticalAlignment(localStyle.getVerticalAlignment());
          paramzarj.a.setTextWrapped(localStyle.isTextWrapped());
        }
        paramzcjy.a();
        break;
      case 8: 
      case 9: 
      case 10: 
      case 11: 
      case 12: 
      case 13: 
      case 14: 
      case 15: 
      case 16: 
      case 17: 
      case 18: 
      case 19: 
      case 20: 
      case 21: 
      case 22: 
      case 23: 
      case 24: 
      case 25: 
      case 26: 
      case 27: 
      case 28: 
      case 29: 
      case 30: 
      case 32: 
      case 33: 
      case 34: 
      case 35: 
      case 36: 
      case 57: 
      default: 
        paramzcjy.a();
      }
    }
  }
  
  private String c(zcjy paramzcjy)
    throws Exception
  {
    String str1 = null;
    String str2 = null;
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (j.a(paramzcjy.q()))
        {
        case 22: 
          str1 = paramzcjy.t();
          break;
        case 62: 
          str2 = paramzcjy.t();
        }
      }
      paramzcjy.l();
    }
    paramzcjy.a();
    switch (j.a(str2))
    {
    case 63: 
      str2 = "[h]\" hours\" m\" minutes\" s\" seconds\"";
      break;
    default: 
      str2 = "h:mm:ss";
    }
    this.a.e.put(str1, str2);
    return str2;
  }
  
  private static String a(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    char[] arrayOfChar = paramString.toCharArray();
    for (int k = 0; k < arrayOfChar.length; k++)
    {
      if (arrayOfChar[k] == '-') {
        return zs.a(localStringBuilder);
      }
      if ((arrayOfChar[k] >= 'A') && (arrayOfChar[k] <= 'Z')) {
        localStringBuilder.append(' ');
      }
      localStringBuilder.append(arrayOfChar[k]);
    }
    return zs.a(localStringBuilder);
  }
  
  private String d(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return null;
    }
    paramzcjy.d();
    String str = null;
    while (zauz.a(paramzcjy))
    {
      if ("string".equals(paramzcjy.q())) {
        str = paramzcjy.a("string");
      }
      paramzcjy.a();
    }
    return str;
  }
  
  private String e(zcjy paramzcjy)
    throws Exception
  {
    String str1 = null;
    String str2 = null;
    int k = 0;
    String str3 = null;
    boolean bool1 = false;
    String str4 = null;
    String str5 = null;
    String str6 = null;
    boolean bool2 = false;
    int m = 0;
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (j.a(paramzcjy.q()))
        {
        case 64: 
          str2 = paramzcjy.t();
          break;
        case 22: 
          str1 = paramzcjy.t();
          break;
        case 65: 
          k = com.aspose.cells.a.c.zp.b(paramzcjy.t());
          break;
        case 66: 
          str3 = paramzcjy.t();
          break;
        case 67: 
          bool1 = zauj.aB(paramzcjy.t());
          break;
        case 68: 
          str4 = paramzcjy.t();
          break;
        case 69: 
          str5 = paramzcjy.t();
          break;
        case 70: 
          str6 = paramzcjy.t();
          break;
        case 71: 
          bool2 = zauj.aB(paramzcjy.t());
          break;
        case 72: 
          m = com.aspose.cells.a.c.zp.b(paramzcjy.t());
        }
      }
      paramzcjy.l();
    }
    String str7 = str3;
    StringBuilder localStringBuilder;
    int n;
    switch (j.a(str2))
    {
    case 58: 
    case 59: 
    case 73: 
      localStringBuilder = new StringBuilder();
      if ("1".equals(str2))
      {
        localStringBuilder.append(zark.a(str4));
        if (bool2) {
          localStringBuilder.append("* ");
        }
      }
      if (bool1) {
        localStringBuilder.append("#,##");
      }
      localStringBuilder.append("0");
      if (k != 0)
      {
        localStringBuilder.append('.');
        for (n = 0; n < k; n++) {
          localStringBuilder.append('0');
        }
      }
      if ("2".equals(str2)) {
        localStringBuilder.append("%");
      }
      str7 = zs.a(localStringBuilder);
      switch (j.a(str5))
      {
      case 73: 
        break;
      case 58: 
        localStringBuilder.append(";[Red]");
        localStringBuilder.append(str7);
        break;
      case 59: 
        localStringBuilder.append("_);(");
        localStringBuilder.append(str7);
        localStringBuilder.append(")");
        break;
      case 60: 
        localStringBuilder.append("_);[Red](");
        localStringBuilder.append(str7);
        localStringBuilder.append(")");
      }
      str7 = zs.a(localStringBuilder);
      break;
    case 61: 
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("#");
      if (m != 0)
      {
        localStringBuilder.append(" ");
        if (m > 0)
        {
          n = (int)Math.ceil(Math.log10(m));
          for (int i1 = 0; i1 < n; i1++) {
            localStringBuilder.append("#");
          }
          localStringBuilder.append("/");
          localStringBuilder.append(m);
        }
        else
        {
          m = -m;
          for (n = 0; n < m; n++) {
            localStringBuilder.append("#");
          }
          localStringBuilder.append("/");
          for (n = 0; n < m; n++) {
            localStringBuilder.append("#");
          }
        }
      }
      str7 = zs.a(localStringBuilder);
      break;
    }
    this.a.c.put(str1, str7);
    paramzcjy.a();
    return str7;
  }
  
  private String f(zcjy paramzcjy)
    throws Exception
  {
    String str1 = paramzcjy.a("IDREF");
    String str2 = (String)this.a.d.get(str1);
    paramzcjy.a();
    return str2;
  }
  
  private String g(zcjy paramzcjy)
    throws Exception
  {
    String str1 = null;
    String str2 = null;
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (j.a(paramzcjy.q()))
        {
        case 22: 
          str1 = paramzcjy.t();
          break;
        case 62: 
          str2 = paramzcjy.t();
        }
      }
      paramzcjy.l();
    }
    str2 = b(str2);
    this.a.d.put(str1, str2);
    paramzcjy.a();
    return str2;
  }
  
  private static String b(String paramString)
  {
    char[] arrayOfChar = paramString.toCharArray();
    StringBuilder localStringBuilder = new StringBuilder();
    for (int k = 0; k < arrayOfChar.length; k++) {
      switch (arrayOfChar[k])
      {
      case '"': 
      case '\'': 
        int m = zaap.a(arrayOfChar, arrayOfChar[k], arrayOfChar[k], k);
        if (m == -1)
        {
          localStringBuilder.append(arrayOfChar[k]);
        }
        else
        {
          while (k <= m)
          {
            localStringBuilder.append(arrayOfChar[k]);
            k++;
          }
          k--;
        }
        break;
      case 'y': 
        if ((k + 1 == arrayOfChar.length) || (arrayOfChar[(k + 1)] != 'y')) {
          localStringBuilder.append("yyyy");
        } else {
          localStringBuilder.append(arrayOfChar[k]);
        }
        break;
      case 'a': 
        if ((k + 1 == arrayOfChar.length) && (k > 0) && (arrayOfChar[(k - 1)] != 'a')) {
          localStringBuilder.append("am/pm");
        }
        break;
      default: 
        localStringBuilder.append(arrayOfChar[k]);
      }
    }
    return zs.a(localStringBuilder);
  }
  
  private void h(zcjy paramzcjy)
    throws Exception
  {
    this.d = (this.e = null);
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy))
    {
      if (("number".equals(paramzcjy.q())) && (paramzcjy.n()))
      {
        while (paramzcjy.m()) {
          switch (j.a(paramzcjy.q()))
          {
          case 74: 
            this.d = paramzcjy.t();
            break;
          case 29: 
            this.e = paramzcjy.t();
          }
        }
        paramzcjy.l();
      }
      paramzcjy.a();
    }
  }
  
  private void c(zcjy paramzcjy, zarj paramzarj)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    if (paramzcjy.d()) {
      while (zauz.a(paramzcjy)) {
        if ("color".equals(paramzcjy.q()))
        {
          paramzarj.a.setPattern(1);
          paramzarj.a.setForegroundColor(c(paramzcjy, false));
        }
        else
        {
          paramzcjy.a();
        }
      }
    }
  }
  
  private Color b(zcjy paramzcjy, boolean paramBoolean)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return Color.getEmpty();
    }
    Color localColor = Color.getEmpty();
    if (paramzcjy.d()) {
      while (zauz.a(paramzcjy)) {
        if ("color".equals(paramzcjy.q())) {
          localColor = c(paramzcjy, paramBoolean);
        } else {
          paramzcjy.a();
        }
      }
    }
    return localColor;
  }
  
  private Color c(zcjy paramzcjy, boolean paramBoolean)
    throws Exception
  {
    String str = paramzcjy.a("type");
    Color localColor = Color.getEmpty();
    if ("sfa:calibrated-rgb-color-type".equals(str))
    {
      int k = 255;
      int m = 255;
      int n = 255;
      int i1 = 255;
      if (paramzcjy.n())
      {
        while (paramzcjy.m()) {
          switch (j.a(paramzcjy.q()))
          {
          case 75: 
            k = (int)(zauj.C(paramzcjy.t()) * 255.0D + 0.5D);
            break;
          case 76: 
            m = (int)(zauj.C(paramzcjy.t()) * 255.0D + 0.5D);
            break;
          case 77: 
            n = (int)(zauj.C(paramzcjy.t()) * 255.0D + 0.5D);
            break;
          case 78: 
            i1 = (int)(zauj.C(paramzcjy.t()) * 255.0D + 0.5D);
          }
        }
        paramzcjy.l();
        localColor = Color.fromArgb(i1, k, m, n);
      }
    }
    paramzcjy.a();
    return localColor;
  }
  
  private void i(zcjy paramzcjy)
    throws Exception
  {
    this.h = null;
    this.i = 0;
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      j(paramzcjy);
    }
    a();
  }
  
  private void a()
  {
    Cells localCells = this.g.getCells();
    Iterator localIterator;
    zarg localzarg;
    HashMap localHashMap;
    Border localBorder;
    int k;
    int m;
    Cell localCell;
    if (this.b != null)
    {
      localIterator = this.b.iterator();
      while (localIterator.hasNext())
      {
        localzarg = (zarg)localIterator.next();
        if (localzarg.b != null)
        {
          localHashMap = new HashMap();
          localBorder = this.a.a(localzarg.b);
          if ((localBorder != null) && (localBorder.getLineStyle() != 0))
          {
            k = localzarg.a;
            for (m = localzarg.c; m < localzarg.d; m++)
            {
              localCell = localCells.get(k, m);
              a(localHashMap, localBorder, localCell, 4);
            }
          }
        }
      }
    }
    if (this.c != null)
    {
      localIterator = this.c.iterator();
      while (localIterator.hasNext())
      {
        localzarg = (zarg)localIterator.next();
        if (localzarg.b != null)
        {
          localHashMap = new HashMap();
          localBorder = this.a.a(localzarg.b);
          if ((localBorder != null) && (localBorder.getLineStyle() != 0))
          {
            k = localzarg.a;
            for (m = localzarg.c; m < localzarg.d; m++)
            {
              localCell = localCells.get(m, k);
              a(localHashMap, localBorder, localCell, 1);
            }
          }
        }
      }
    }
    this.b = null;
    this.c = null;
  }
  
  private void a(HashMap paramHashMap, Border paramBorder, Cell paramCell, int paramInt)
  {
    int k = paramCell.s();
    Object localObject = paramHashMap.get(Integer.valueOf(k));
    if (localObject != null)
    {
      paramCell.b(((Integer)localObject).intValue());
      return;
    }
    Style localStyle = paramCell.o();
    Border localBorder = localStyle.getBorders().getByBorderType(paramInt);
    localBorder.setLineStyle(paramBorder.getLineStyle());
    if (!paramBorder.a.b()) {
      localBorder.a.a(paramBorder.a.c(), paramBorder.a.e());
    }
    paramCell.setStyle(localStyle);
    paramHashMap.put(Integer.valueOf(k), Integer.valueOf(paramCell.s()));
  }
  
  private void j(zcjy paramzcjy)
    throws Exception
  {
    String str1 = null;
    String str2 = null;
    String str3 = null;
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (j.a(paramzcjy.q()))
        {
        case 79: 
          str1 = paramzcjy.t();
          break;
        case 80: 
        case 81: 
        case 82: 
          str2 = paramzcjy.t();
          break;
        case 83: 
          str3 = paramzcjy.t();
        }
      }
      paramzcjy.l();
    }
    int k = 1;
    if (str3 != null) {
      k = com.aspose.cells.a.c.zp.b(str3);
    }
    int m = this.i + k;
    int n = m / 256;
    if (n > 0)
    {
      this.h = this.g.getCells().getRows().get((this.h == null ? 0 : this.h.getIndex()) + n);
      this.i = (m % 256);
    }
    else
    {
      this.i = m;
      if (this.h == null) {
        this.h = this.g.getCells().getRows().get(0);
      }
    }
    Cell localCell = this.h.get(this.i);
    String str4 = paramzcjy.q();
    int i1 = this.a.b(str1, str4);
    if (i1 != -1) {
      localCell.b(i1);
    }
    int i2 = 6;
    Object localObject;
    switch (j.a(str4))
    {
    case 76: 
      i2 = 3;
      break;
    case 84: 
      i2 = 5;
      break;
    case 85: 
      i2 = 4;
      localCell.putValue(zauj.C(str2));
      break;
    case 82: 
      i2 = 1;
      double d1 = zauj.C(str2);
      localCell.putValue(d1 / 86400.0D);
      break;
    case 86: 
      i2 = 1;
      localObject = new DateTime(2001, 1, 1);
      localObject = ((DateTime)localObject).addSeconds(zauj.C(str2));
      localCell.putValue((DateTime)localObject);
      break;
    case 77: 
      i2 = 0;
      localCell.putValue(zauj.aB(str2));
      break;
    case 87: 
      break;
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (j.a(paramzcjy.q()))
      {
      case 83: 
        str2 = k(paramzcjy);
        break;
      case 88: 
        a(paramzcjy, localCell);
        break;
      case 89: 
        localObject = paramzcjy.a("fs");
        a(localCell, (String)localObject);
        paramzcjy.a();
        break;
      default: 
        paramzcjy.a();
      }
    }
    if (!localCell.isFormula()) {
      switch (i2)
      {
      case 3: 
        localCell.f();
        break;
      case 5: 
        localCell.putValue(str2);
        break;
      case 4: 
        localCell.putValue(zauj.C(str2));
        break;
      case 1: 
        localObject = new DateTime(2001, 1, 1);
        localObject = ((DateTime)localObject).addSeconds(zauj.C(str2));
        localCell.putValue((DateTime)localObject);
        Style localStyle = localCell.getStyle();
        if (!localStyle.isDateTime()) {
          localStyle.setNumber(14);
        }
        break;
      case 0: 
        localCell.putValue(zauj.aB(str2));
        break;
      }
    }
  }
  
  private String k(zcjy paramzcjy)
    throws Exception
  {
    String str = paramzcjy.a("s");
    paramzcjy.a();
    return str;
  }
  
  private void a(Cell paramCell, String paramString)
  {
    Iterator localIterator = this.a.f.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      paramString = zw.a(paramString, str, (String)this.a.f.get(str));
    }
    paramCell.setFormula(paramString);
  }
  
  private void a(zcjy paramzcjy, Cell paramCell)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    Style localStyle = null;
    while (zauz.a(paramzcjy)) {
      switch (j.a(paramzcjy.q()))
      {
      case 52: 
        if (localStyle == null) {
          localStyle = paramCell.getStyle();
        }
        localStyle.setCustom(g(paramzcjy));
        break;
      default: 
        paramzcjy.a();
      }
    }
    if (localStyle != null) {
      paramCell.setStyle(localStyle);
    }
  }
  
  private void l(zcjy paramzcjy)
    throws Exception
  {
    this.f = paramzcjy.a("workspace-name");
    a(paramzcjy);
  }
  
  private void m(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    int k = 0;
    while (zauz.a(paramzcjy)) {
      if ("grid-column".equals(paramzcjy.q()))
      {
        a(paramzcjy, k);
        k++;
      }
      else
      {
        paramzcjy.a();
      }
    }
  }
  
  private void a(zcjy paramzcjy, int paramInt)
    throws Exception
  {
    Column localColumn = this.g.getCells().getColumns().get(paramInt);
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (j.a(paramzcjy.q()))
        {
        case 24: 
          localColumn.b(zbxp.a(zauj.C(paramzcjy.t()), CellsHelper.getDPI()) - 15);
          break;
        case 90: 
          localColumn.setHidden("1".equals(paramzcjy.t()));
        }
      }
      paramzcjy.l();
    }
    paramzcjy.a();
  }
  
  private void n(zcjy paramzcjy)
    throws Exception
  {
    String str = paramzcjy.a("count");
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    int k = 0;
    while (zauz.a(paramzcjy)) {
      if ("grid-row".equals(paramzcjy.q()))
      {
        b(paramzcjy, k);
        k++;
      }
      else
      {
        paramzcjy.a();
      }
    }
  }
  
  private void b(zcjy paramzcjy, int paramInt)
    throws Exception
  {
    Row localRow = this.g.getCells().getRows().get(paramInt);
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (j.a(paramzcjy.q()))
        {
        case 91: 
          localRow.setHeight(com.aspose.cells.a.c.zp.a(paramzcjy.t()));
          break;
        case 90: 
          localRow.setHidden("1".equals(paramzcjy.t()));
        }
      }
      paramzcjy.l();
    }
    paramzcjy.a();
  }
  
  private void o(zcjy paramzcjy)
    throws Exception
  {
    String str1 = paramzcjy.a("name");
    String str2 = paramzcjy.a("id");
    this.g = this.a.b.getWorksheets().get(this.f + " " + str1);
    a(paramzcjy);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zakv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */