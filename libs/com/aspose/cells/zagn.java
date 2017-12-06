package com.aspose.cells;

import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import com.aspose.cells.b.c.a.za;
import java.util.HashMap;

class zagn
{
  private static char[] a = { '\'', '=' };
  private static final za b = new za(new String[] { "center", "distributed", "justify", "left", "right", "center-across", "fill", "middle", "top" });
  
  static boolean a(Style paramStyle1, Style paramStyle2)
  {
    if (paramStyle1 == null) {
      return false;
    }
    int i = ((paramStyle1.getForegroundColor().getR() & 0xFF) != 255) || ((paramStyle1.getForegroundColor().getG() & 0xFF) != 255) || ((paramStyle1.getForegroundColor().getB() & 0xFF) != 255) ? 1 : 0;
    int j = ((paramStyle1.getForegroundColor().toArgb() & 0xFFFFFF) != (paramStyle2.getForegroundColor().toArgb() & 0xFFFFFF)) || (paramStyle1.getPattern() != 0) ? 1 : 0;
    if ((i != 0) && (j != 0)) {
      return true;
    }
    if (paramStyle1.d() != null) {
      return (paramStyle1.getBorders().getByBorderType(4).getLineStyle() != 0) || (paramStyle1.getBorders().getByBorderType(8).getLineStyle() != 0) || (paramStyle1.getBorders().getByBorderType(1).getLineStyle() != 0) || (paramStyle1.getBorders().getByBorderType(2).getLineStyle() != 0);
    }
    return false;
  }
  
  static String a(int paramInt1, int paramInt2)
  {
    StringBuilder localStringBuilder = new StringBuilder(paramInt2);
    String str = zp.a(paramInt1);
    localStringBuilder.append(str);
    for (int i = 0; i < paramInt2 - str.length(); i++) {
      localStringBuilder.insert(0, '0');
    }
    return zs.a(localStringBuilder);
  }
  
  static String a(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    if (paramString.length() == 0) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder(paramString.length());
    for (int i = 0; i < paramString.length(); i++)
    {
      char c = paramString.charAt(i);
      String str = a(c);
      if (str != null) {
        localStringBuilder.append(str);
      } else {
        localStringBuilder.append(c);
      }
    }
    return zs.a(localStringBuilder);
  }
  
  private static String a(char paramChar)
  {
    switch (paramChar)
    {
    case '&': 
      return "&amp;";
    case '\n': 
      return "&#10;";
    case '\r': 
      return "&#13;";
    case '"': 
      return "&quot;";
    case '<': 
      return "&lt;";
    case '>': 
      return "&gt;";
    }
    return null;
  }
  
  private static String b(char paramChar)
  {
    switch (paramChar)
    {
    case '&': 
      return "&amp;";
    case '\n': 
      return "&#10;";
    case '\r': 
      return "&#13;";
    case '"': 
      return "&quot;";
    case '<': 
      return "&lt;";
    case '>': 
      return "&gt;";
    case ' ': 
      return "&nbsp;";
    }
    return null;
  }
  
  static String b(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    if (paramString.length() == 0) {
      return "";
    }
    return zw.a(zw.a(zw.a(zw.a(zw.a(zw.a(zw.a(paramString, "&amp;", "&"), "&#10;", "\n"), "&#13;", "\r"), "&quot;", "\""), "&lt;", "<"), "&gt;", ">"), "&nbsp;", " ");
  }
  
  private static String c(char paramChar)
  {
    switch (paramChar)
    {
    case ' ': 
    case '#': 
    case '%': 
    case '&': 
    case '+': 
    case '/': 
    case '=': 
    case '?': 
      return "_";
    }
    return null;
  }
  
  static String c(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    if (paramString.length() == 0) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder(paramString.length());
    for (int i = 0; i < paramString.length(); i++)
    {
      char c = paramString.charAt(i);
      String str = b(c);
      if (str != null) {
        localStringBuilder.append(str);
      } else {
        localStringBuilder.append(c);
      }
    }
    return zs.a(localStringBuilder);
  }
  
  static String d(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    if (paramString.length() == 0) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder(paramString.length());
    for (int i = 0; i < paramString.length(); i++)
    {
      char c = paramString.charAt(i);
      String str = c(c);
      if (str != null) {
        localStringBuilder.append(str);
      } else {
        localStringBuilder.append(c);
      }
    }
    return zs.a(localStringBuilder);
  }
  
  static String[] a(Cell paramCell)
  {
    int i = paramCell.c.c;
    if (i == 5) {
      i = ((zaai)paramCell.c.d).c;
    }
    if (i == 0) {
      return null;
    }
    String[] arrayOfString = new String[3];
    switch (i)
    {
    case 1: 
    case 6: 
      arrayOfString[0] = "num";
      arrayOfString[1] = paramCell.k();
      Style localStyle = paramCell.p();
      if ((localStyle.r() != 0) || ((localStyle.t() != null) && (!"".equals(localStyle.t())))) {
        arrayOfString[2] = paramCell.c.a(true, paramCell.d.p().p().getSettings());
      }
      break;
    case 2: 
      arrayOfString[0] = "bool";
      arrayOfString[1] = (paramCell.getBoolValue() ? "TRUE" : "FALSE");
      arrayOfString[2] = arrayOfString[1];
      break;
    case 3: 
      arrayOfString[0] = "err";
      arrayOfString[1] = "#VALUE!";
      if (paramCell.getValue() != null) {
        arrayOfString[1] = paramCell.c.g();
      }
      arrayOfString[2] = arrayOfString[1];
      break;
    case 4: 
    case 5: 
    default: 
      arrayOfString[0] = "str";
      arrayOfString[1] = paramCell.k();
      arrayOfString[2] = arrayOfString[1];
    }
    return arrayOfString;
  }
  
  static String a(int paramInt)
  {
    switch (paramInt)
    {
    case 2: 
      return "text-decoration:underline; mso-text-underline:double;";
    case 4: 
      return "text-decoration:underline; mso-text-underline:double-accounting;";
    case 1: 
      return "text-decoration:underline;";
    case 3: 
      return "text-decoration:underline; ms-text-underline:single-accounting;";
    case 0: 
      return "";
    }
    return "";
  }
  
  static String b(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      return "text-align:center";
    case 3: 
      return "text-align:distributed";
    case 6: 
      return "text-align:justify";
    case 7: 
      return "text-align:left";
    case 8: 
      return "text-align:right";
    case 2: 
      return "text-align:center-across";
    case 4: 
      return "text-align:fill";
    case 5: 
      return "text-align:general";
    }
    return null;
  }
  
  static int e(String paramString)
  {
    switch (b.a(paramString))
    {
    case 0: 
      return 1;
    case 1: 
      return 3;
    case 2: 
      return 6;
    case 3: 
      return 7;
    case 4: 
      return 8;
    case 5: 
      return 2;
    case 6: 
      return 4;
    }
    return 5;
  }
  
  static int f(String paramString)
  {
    switch (b.a(paramString))
    {
    case 7: 
      return 1;
    case 1: 
      return 3;
    case 2: 
      return 6;
    case 8: 
      return 9;
    }
    return 0;
  }
  
  static String c(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "vertical-align:bottom";
    case 1: 
      return "vertical-align:middle";
    case 3: 
      return "vertical-align:distributed";
    case 6: 
      return "vertical-align:justify";
    case 9: 
      return "vertical-align:top";
    }
    return "";
  }
  
  static long d(int paramInt)
  {
    return paramInt * 32;
  }
  
  static boolean a(WorksheetCollection paramWorksheetCollection, Hyperlink paramHyperlink, String[] paramArrayOfString, CellArea[] paramArrayOfCellArea)
  {
    if (paramHyperlink.a(paramWorksheetCollection) == 2) {
      try
      {
        String str1 = paramHyperlink.getAddress();
        if (str1.indexOf('!') == -1) {
          for (int i = 0; i < paramWorksheetCollection.getNames().getCount(); i++)
          {
            Name localName = paramWorksheetCollection.getNames().get(i);
            str1 = localName.getText();
            if (localName.getText().equals(paramHyperlink.getAddress()))
            {
              str1 = localName.getRefersTo();
              break;
            }
          }
        }
        if (str1 == null)
        {
          paramArrayOfString[0] = null;
          paramArrayOfCellArea[0] = CellArea.a;
          return false;
        }
        String[] arrayOfString = zw.d(str1, '!');
        if ((arrayOfString.length == 2) && (arrayOfString[0] != null) && (!"".equals(arrayOfString[0])) && (arrayOfString[1] != null) && (!"".equals(arrayOfString[1])))
        {
          boolean bool = false;
          int j = arrayOfString[1].indexOf(":");
          if (j != -1)
          {
            String str2 = arrayOfString[1].substring(0, 0 + j);
            String str3 = arrayOfString[1].substring(j + 1);
            bool = (zamm.c(str2)) && (zamm.c(str3));
          }
          else
          {
            bool = zamm.c(arrayOfString[1]);
          }
          if (bool)
          {
            paramArrayOfString[0] = arrayOfString[0];
            paramArrayOfString[0] = zw.c(paramArrayOfString[0], a);
            paramArrayOfCellArea[0] = ((CellArea)CellArea.a(arrayOfString[1], true));
            return true;
          }
        }
      }
      catch (Exception localException) {}
    }
    paramArrayOfString[0] = null;
    paramArrayOfCellArea[0] = new CellArea();
    return false;
  }
  
  static String a(CellArea paramCellArea)
  {
    return "#RANGE!" + zauj.a(paramCellArea);
  }
  
  static String g(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder(paramString.length());
    for (int i = 0; i < paramString.length(); i++)
    {
      char c = paramString.charAt(i);
      localStringBuilder.append(d(c));
    }
    return zs.a(localStringBuilder);
  }
  
  private static String d(char paramChar)
  {
    if (paramChar == '"') {
      return "\\0022";
    }
    if (e(paramChar)) {
      return "\\" + paramChar;
    }
    return Character.toString(paramChar);
  }
  
  private static boolean e(char paramChar)
  {
    switch (paramChar)
    {
    case '#': 
    case '(': 
    case ')': 
    case ',': 
    case '.': 
    case '/': 
    case ':': 
    case ';': 
    case '@': 
    case '[': 
    case '\\': 
    case ']': 
      return true;
    }
    return false;
  }
  
  static String a(FormatCondition paramFormatCondition)
  {
    Style localStyle = paramFormatCondition.getStyle();
    String str1 = a(localStyle);
    String str2 = b(localStyle);
    String str3 = c(localStyle);
    String str4 = str1 + str2 + str3;
    if (str4.endsWith(";")) {
      str4 = str4.substring(0, 0 + (str4.length() - 1));
    }
    return str4;
  }
  
  static String a(Style paramStyle)
  {
    if (!paramStyle.isModified(11)) {
      return "";
    }
    Font localFont = paramStyle.getFont();
    StringBuilder localStringBuilder = new StringBuilder(100);
    if (paramStyle.isModified(16)) {
      if (localFont.k()) {
        localStringBuilder.append("color:windowtext;");
      } else {
        localStringBuilder.append("color:#" + zauj.a(localFont.getColor()) + ";");
      }
    }
    if (localFont.isItalic()) {
      localStringBuilder.append("font-style:italic;");
    }
    if (paramStyle.isModified(17)) {
      if (localFont.isBold()) {
        localStringBuilder.append("font-weight:700;");
      } else {
        localStringBuilder.append("font-weight:400;");
      }
    }
    if (paramStyle.isModified(19))
    {
      String str = zbek.b(localFont.getUnderline());
      localStringBuilder.append("text-underline-style:" + str + ";");
    }
    if (paramStyle.isModified(20)) {
      if (localFont.isStrikeout()) {
        localStringBuilder.append("text-line-through:single;");
      } else {
        localStringBuilder.append("text-line-through:none;");
      }
    }
    return zs.a(localStringBuilder);
  }
  
  static String b(Style paramStyle)
  {
    if (!paramStyle.isModified(1)) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder(100);
    if (paramStyle.f())
    {
      localStringBuilder.append("border-top:" + zbek.a(paramStyle, 4) + ";");
      localStringBuilder.append("border-right:" + zbek.a(paramStyle, 2) + ";");
      localStringBuilder.append("border-bottom:" + zbek.a(paramStyle, 8) + ";");
      localStringBuilder.append("border-left:" + zbek.a(paramStyle, 1) + ";");
    }
    else
    {
      localStringBuilder.append("border:none;");
    }
    return zs.a(localStringBuilder);
  }
  
  static String c(Style paramStyle)
  {
    if ((paramStyle.isModified(33)) || (paramStyle.isModified(35)) || (paramStyle.isModified(34))) {
      return zbek.a(paramStyle);
    }
    return "";
  }
  
  static String h(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return "";
    }
    if (paramString.charAt(0) == '=') {
      return c(paramString.substring(1));
    }
    if (zarb.c(paramString)) {
      return paramString;
    }
    return "\"" + paramString + "\"";
  }
  
  static String b(FormatCondition paramFormatCondition)
  {
    String str = null;
    if ((paramFormatCondition.getType() == 0) && (paramFormatCondition.b != 6)) {
      str = zbek.a(paramFormatCondition.b);
    } else if (paramFormatCondition.getType() == 8) {
      str = "containsText";
    } else if (paramFormatCondition.getType() == 9) {
      str = "notContains";
    } else if (paramFormatCondition.getType() == 10) {
      str = "beginsWith";
    } else if (paramFormatCondition.getType() == 11) {
      str = "endsWith";
    }
    return str;
  }
  
  static String a(String paramString, boolean paramBoolean1, HashMap paramHashMap, Font paramFont, boolean paramBoolean2)
    throws Exception
  {
    if (paramString == null) {
      return null;
    }
    if (paramString.length() == 0) {
      return paramString;
    }
    Object localObject = paramHashMap.get(paramString);
    if (localObject != null) {
      return (String)localObject;
    }
    int i = paramString.length();
    StringBuilder localStringBuilder1 = new StringBuilder(i);
    char c;
    for (int j = 0; j < i; j++)
    {
      c = paramString.charAt(j);
      switch (c)
      {
      case '&': 
        if ((j < i - 1) && (paramString.charAt(j + 1) == '#')) {
          localStringBuilder1.append(c);
        } else {
          localStringBuilder1.append("&amp;");
        }
        break;
      case '<': 
        if (paramBoolean1) {
          localStringBuilder1.append("&lt;");
        } else {
          localStringBuilder1.append(c);
        }
        break;
      case '>': 
        if (paramBoolean1) {
          localStringBuilder1.append("&gt;");
        } else {
          localStringBuilder1.append(c);
        }
        break;
      case '\n': 
        localStringBuilder1.append("<br>");
        break;
      case '\r': 
        if ((j + 1 >= i) || (paramString.charAt(j + 1) != '\n')) {
          localStringBuilder1.append("</br>");
        }
        break;
      default: 
        localStringBuilder1.append(c);
      }
    }
    i = localStringBuilder1.length();
    StringBuilder localStringBuilder2 = new StringBuilder(i);
    int k = 1;
    for (int m = 0; m < i - 1; m++)
    {
      c = localStringBuilder1.charAt(m);
      if ((c == ' ') && (localStringBuilder1.charAt(m + 1) == ' '))
      {
        if (k != 0)
        {
          if (zs.a(localStringBuilder2).equals(zw.a(zs.a(localStringBuilder1)))) {
            localStringBuilder2.append("<span style='mso-spacerun:yes;white-space:nowrap;");
          } else {
            localStringBuilder2.append("<span style='mso-spacerun:yes;");
          }
          if (paramBoolean2) {
            localStringBuilder2.append("font-family:\"Times New Roman\";");
          }
          localStringBuilder2.append("'>&nbsp;");
          k = 0;
        }
        else
        {
          localStringBuilder2.append("&nbsp;");
        }
      }
      else if ((c == ' ') && (k == 0))
      {
        localStringBuilder2.append(" </span>");
        k = 1;
      }
      else
      {
        localStringBuilder2.append(c);
      }
    }
    if (i > 0)
    {
      c = localStringBuilder1.charAt(i - 1);
      if (k == 0) {
        localStringBuilder2.append(" </span>");
      } else {
        localStringBuilder2.append(c);
      }
    }
    String str = zs.a(localStringBuilder2);
    if ((paramBoolean2) && (str.indexOf("&nbsp;") > -1)) {
      str = a(str, paramFont);
    }
    paramHashMap.put(paramString, str);
    return str;
  }
  
  private static String a(String paramString, Font paramFont)
    throws Exception
  {
    String str = paramFont.getName();
    int i = zavt.a(" ", paramFont, 1.0D, 0);
    paramFont.setName("Arial");
    int j = zavt.a(" ", paramFont, 1.0D, 0);
    paramFont.setName(str);
    if (i / j == 2) {
      return zw.a(paramString, "&nbsp;", "&nbsp;&nbsp;");
    }
    return paramString;
  }
  
  public static double b(int paramInt1, int paramInt2)
  {
    return paramInt2 * 72.0F / paramInt1;
  }
  
  public static int a(int paramInt, double paramDouble)
  {
    return (int)(paramDouble * paramInt / 72.0D + 0.5D);
  }
  
  public static String e(int paramInt)
  {
    switch (paramInt)
    {
    case 4: 
      return "arc_";
    case 7: 
      return "button_";
    case 30: 
      return "cellsDrawing_";
    case 5: 
      return "chart_";
    case 11: 
      return "checkBox_";
    case 20: 
      return "comboBox_";
    case 25: 
      return "comment_";
    case 15: 
      return "dialogBox_";
    case 0: 
      return "group_";
    case 19: 
      return "groupBox_";
    case 14: 
      return "label_";
    case 1: 
      return "line_";
    case 18: 
      return "listBox_";
    case 24: 
      return "oleObject_";
    case 8: 
      return "picture_";
    case 3: 
      return "oval_";
    case 9: 
      return "polygon_";
    case 12: 
      return "radioButton_";
    case 2: 
      return "rectangle_";
    case 17: 
      return "scrollBar_";
    case 16: 
      return "spinner_";
    case 6: 
      return "textBox_";
    }
    return "image_";
  }
  
  public static String f(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "none";
    case 1: 
      return "1px solid";
    case 2: 
      return "2px solid";
    case 3: 
      return "1px dashed";
    case 4: 
      return "1px dotted";
    case 5: 
      return "3px solid";
    case 6: 
      return "4px double";
    case 7: 
      return "1px dotted";
    case 8: 
      return "2px dashed";
    case 9: 
      return "1px dot-dash";
    case 10: 
      return "2px dot-dash";
    case 11: 
      return "1px dot-dot-dash";
    case 12: 
      return "2px dot-dot-dash";
    case 13: 
      return "2px dot-dash-slanted";
    }
    throw new CellsException(6, "Invalid BorderLineStyle int val: " + paramInt);
  }
  
  public static String a(Style paramStyle, int paramInt, boolean paramBoolean)
  {
    Border localBorder = paramStyle.getBorders().getByBorderType(paramInt);
    int i = localBorder.getLineStyle();
    if (i == 0) {
      return "none";
    }
    StringBuilder localStringBuilder = null;
    if (paramBoolean) {
      localStringBuilder = new StringBuilder(f(i));
    } else {
      localStringBuilder = new StringBuilder(ztt.a(i));
    }
    if (!localBorder.a.b()) {
      localStringBuilder.append(" #" + zauj.a(localBorder.getColor()));
    } else {
      localStringBuilder.append(" windowtext");
    }
    return zs.a(localStringBuilder);
  }
  
  public static boolean b(Style paramStyle1, Style paramStyle2)
  {
    if ((null == paramStyle1) && (null == paramStyle2)) {
      return true;
    }
    if ((null == paramStyle1) && (null != paramStyle2)) {
      return false;
    }
    if ((null != paramStyle1) && (null == paramStyle2)) {
      return false;
    }
    if (paramStyle1.getClass() != paramStyle2.getClass()) {
      return false;
    }
    if ((!paramStyle1.getBackgroundColor().isEmpty()) && (!paramStyle2.getBackgroundColor().isEmpty()) && ((paramStyle1.getBackgroundColor().toArgb() & 0xFFFFFF) != (paramStyle2.getBackgroundColor().toArgb() & 0xFFFFFF))) {
      return false;
    }
    if ((null != paramStyle1.getBackgroundThemeColor()) && (null != paramStyle2.getBackgroundThemeColor()) && (paramStyle1.getBackgroundThemeColor().getColorType() != paramStyle2.getBackgroundThemeColor().getColorType())) {
      return false;
    }
    if ((null != paramStyle1.a) && (null != paramStyle2.a) && (!paramStyle1.a.a(paramStyle2.a))) {
      return false;
    }
    if ((!paramStyle1.getForegroundColor().isEmpty()) && (!paramStyle2.getForegroundColor().isEmpty()) && ((paramStyle1.getForegroundColor().toArgb() & 0xFFFFFF) != (paramStyle2.getForegroundColor().toArgb() & 0xFFFFFF))) {
      return false;
    }
    if ((null != paramStyle1.getForegroundThemeColor()) && (null != paramStyle2.getForegroundThemeColor()) && (paramStyle1.getForegroundThemeColor().getColorType() != paramStyle2.getForegroundThemeColor().getColorType())) {
      return false;
    }
    if ((null != paramStyle1.b) && (null != paramStyle2.b) && (!paramStyle1.b.a(paramStyle2.b))) {
      return false;
    }
    return paramStyle1.getPattern() == paramStyle2.getPattern();
  }
  
  public static boolean a(Picture paramPicture)
  {
    MsoFormatPicture localMsoFormatPicture = paramPicture.getFormatPicture();
    return (localMsoFormatPicture != null) && ((localMsoFormatPicture.getLeftCrop() != 0.0D) || (localMsoFormatPicture.getRightCrop() != 0.0D) || (localMsoFormatPicture.getTopCrop() != 0.0D) || (localMsoFormatPicture.getBottomCrop() != 0.0D));
  }
  
  public static int g(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return 0;
    case 1: 
      return 1;
    case 2: 
      return 2;
    case 3: 
      return 1;
    case 4: 
      return 1;
    case 5: 
      return 3;
    case 6: 
      return 4;
    case 7: 
      return 1;
    case 8: 
      return 2;
    case 9: 
      return 1;
    case 10: 
      return 2;
    case 11: 
      return 1;
    case 12: 
      return 2;
    case 13: 
      return 2;
    }
    throw new CellsException(6, "Invalid BorderLineStyle int val: " + paramInt);
  }
  
  public static String h(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "_blank";
    case 1: 
      return "_parent";
    case 2: 
      return "_self";
    case 3: 
      return "_top";
    }
    return "_self";
  }
  
  public static double i(String paramString)
  {
    if (paramString == null) {
      return 0.0D;
    }
    return Double.parseDouble(paramString);
  }
  
  public static boolean d(Style paramStyle)
  {
    if ((paramStyle == null) || (paramStyle.d() == null)) {
      return false;
    }
    return (paramStyle.getBorders().getByBorderType(4).getLineStyle() != 0) || (paramStyle.getBorders().getByBorderType(2).getLineStyle() != 0) || (paramStyle.getBorders().getByBorderType(8).getLineStyle() != 0) || (paramStyle.getBorders().getByBorderType(1).getLineStyle() != 0) || (paramStyle.getBorders().getByBorderType(16).getLineStyle() != 0) || (paramStyle.getBorders().getByBorderType(32).getLineStyle() != 0);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zagn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */