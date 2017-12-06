package com.aspose.cells;

import com.aspose.cells.a.d.zap;
import com.aspose.cells.b.a.zo;
import com.aspose.cells.b.a.zr;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;

class zasp
{
  private static float a = ;
  private static final com.aspose.cells.b.c.a.za b = new com.aspose.cells.b.c.a.za(new String[] { "square", "circle", "diamond", "arrow-up", "arrow-down", "arrow-right", "arrow-left", "plus", "star", "hourglass", "bow-tie", "top", "bottom", "start", "end", "top-end", "chart:area", "chart:line", "chart:bar", "chart:circle", "chart:ring", "chart:scatter", "chart:radar", "chart:stock", "cylinder", "pyramid", "cone", "in", "px", "cm", "mm", "#ff0000", "#008000", "#0000ff", "Fine_20_Dotted", "Ultrafine_20_Dashed", "Ultrafine_20_2_20_Dots_20_3_20_Dashes", "_32__20_Dots_20_1_20_Dash", "_33__20_Dashes_20_3_20_Dots_20__28_var_29_", "middle", "justify", "right", "center", "left", "inside", "outside", "outside-start", "outside-end", "near-axis-other-side", "near-axis" });
  
  static int a(String paramString)
  {
    switch (b.a(paramString))
    {
    case 0: 
      return 7;
    case 1: 
      return 1;
    case 2: 
      return 3;
    case 3: 
      return 9;
    case 4: 
      return 4;
    case 5: 
      return 2;
    case 6: 
    case 7: 
      return 6;
    case 8: 
      return 8;
    case 9: 
    case 10: 
      return 10;
    }
    return 0;
  }
  
  static int b(String paramString)
  {
    switch (b.a(paramString))
    {
    case 11: 
      return 2;
    case 12: 
      return 0;
    case 13: 
      return 4;
    case 14: 
      return 3;
    case 15: 
      return 1;
    }
    return 3;
  }
  
  static int c(String paramString)
  {
    switch (b.a(paramString))
    {
    case 16: 
      return 0;
    case 17: 
      return 37;
    case 18: 
      return 14;
    case 19: 
      return 44;
    case 20: 
      return 35;
    case 21: 
      return 60;
    case 22: 
      return 57;
    case 23: 
      return 65;
    }
    return 14;
  }
  
  static int d(String paramString)
  {
    switch (b.a(paramString))
    {
    case 24: 
      return 3;
    case 25: 
      return 1;
    case 26: 
      return 4;
    }
    return 0;
  }
  
  static boolean e(String paramString)
  {
    return (paramString == null) || ("".equals(paramString));
  }
  
  static int a(double paramDouble, String paramString)
  {
    double d = d(paramDouble, paramString);
    return (int)(d * paramDouble / 72.0D + 0.5D);
  }
  
  static double b(double paramDouble, String paramString)
  {
    return d(paramDouble, paramString) / 72.0D * 2.54D;
  }
  
  static double c(double paramDouble, String paramString)
  {
    return d(paramDouble, paramString) / 72.0D;
  }
  
  static double d(double paramDouble, String paramString)
  {
    if ((paramString == null) || ("".equals(paramString))) {
      return 0.0D;
    }
    int i = paramString.charAt(paramString.length() - 1);
    if ((i < 48) || (i > 57))
    {
      String str = paramString.substring(paramString.length() - 2);
      paramString = paramString.substring(0, 0 + (paramString.length() - 2));
      double d = k(paramString);
      switch (b.a(str))
      {
      case 27: 
        d *= 72.0D;
        break;
      case 28: 
        d = d * 72.0D / paramDouble;
        break;
      case 29: 
        d = d * 72.0D / 2.54D;
        break;
      case 30: 
        d = d * 72.0D / 25.4D;
        break;
      }
      return d;
    }
    return k(paramString);
  }
  
  static String f(String paramString)
  {
    if (paramString.charAt(0) == '[') {
      paramString = paramString.substring(1, 1 + (paramString.length() - 2));
    }
    int i = paramString.indexOf(':');
    if (i != -1)
    {
      arrayOfString = zw.d(paramString, ':');
      StringBuilder localStringBuilder = new StringBuilder();
      for (int j = 0; j < arrayOfString.length; j++)
      {
        if (arrayOfString[j].charAt(0) == '$') {
          arrayOfString[j] = arrayOfString[j].substring(1);
        }
        i = arrayOfString[j].indexOf('.');
        if (i == 0) {
          arrayOfString[j] = arrayOfString[j].substring(1);
        } else {
          arrayOfString[j] = arrayOfString[j].replace('.', '!');
        }
        localStringBuilder.append(arrayOfString[j]);
        if (j != arrayOfString.length - 1) {
          localStringBuilder.append(':');
        }
      }
      return zs.a(localStringBuilder);
    }
    String[] arrayOfString = zw.d(paramString, '.');
    if (arrayOfString[0].charAt(0) == '$') {
      arrayOfString[0] = arrayOfString[0].substring(1);
    }
    return arrayOfString[0] + "!" + arrayOfString[1];
  }
  
  static int[] a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = paramInt1 < paramInt3 ? paramInt3 : paramInt1;
    int j = paramInt2 > paramInt4 ? paramInt4 : paramInt2;
    if (i > j) {
      return null;
    }
    return new int[] { i, j };
  }
  
  static int[] a(Worksheet paramWorksheet)
  {
    Range[] arrayOfRange = paramWorksheet.getPageSetup().b(true);
    int[] arrayOfInt = { -1, -1, -1, -1 };
    if (arrayOfRange == null) {
      return arrayOfInt;
    }
    if (arrayOfRange[0] != null)
    {
      arrayOfInt[0] = Math.min(arrayOfRange[0].a().StartRow, arrayOfRange[0].a().EndRow);
      arrayOfInt[1] = Math.max(arrayOfRange[0].a().StartRow, arrayOfRange[0].a().EndRow);
    }
    if (arrayOfRange[1] != null)
    {
      arrayOfInt[2] = Math.min(arrayOfRange[1].a().StartColumn, arrayOfRange[1].a().EndColumn);
      arrayOfInt[3] = Math.max(arrayOfRange[1].a().StartColumn, arrayOfRange[1].a().EndColumn);
    }
    return arrayOfInt;
  }
  
  static String a(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || ("".equals(paramString1))) {
      return paramString1;
    }
    if (paramString1.charAt(0) == '=') {
      paramString1 = paramString1.substring(1);
    }
    if (paramString1.charAt(0) == '(') {
      paramString1 = paramString1.substring(1, 1 + (paramString1.length() - 2));
    }
    String[] arrayOfString = zw.d(paramString1, ',');
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < arrayOfString.length; i++)
    {
      a(localStringBuilder, arrayOfString[i], paramString2);
      if (i != arrayOfString.length - 1) {
        localStringBuilder.append(' ');
      }
    }
    return zs.a(localStringBuilder);
  }
  
  static void a(StringBuilder paramStringBuilder, String paramString1, String paramString2)
  {
    if ((paramString1 == null) || ("".equals(paramString1))) {
      return;
    }
    if (paramString1.charAt(0) == '=') {
      paramString1 = paramString1.substring(1);
    }
    String[] arrayOfString = zw.d(paramString1, ':');
    if (arrayOfString[0].indexOf('!') != -1)
    {
      paramStringBuilder.append(arrayOfString[0].replace('!', '.'));
    }
    else
    {
      paramStringBuilder.append(paramString2);
      paramStringBuilder.append('.');
      paramStringBuilder.append(arrayOfString[0]);
    }
    if (arrayOfString.length > 1)
    {
      paramStringBuilder.append(':');
      if (arrayOfString[1].indexOf('.') != -1)
      {
        paramStringBuilder.append(arrayOfString[1].replace('!', '.'));
      }
      else
      {
        paramStringBuilder.append(paramString2);
        paramStringBuilder.append('.');
        paramStringBuilder.append(arrayOfString[1]);
      }
    }
  }
  
  static String a(Color paramColor)
  {
    String str = "K" + com.aspose.cells.a.c.zp.b(paramColor.getR() & 0xFF) + com.aspose.cells.a.c.zp.b(paramColor.getG() & 0xFF) + com.aspose.cells.a.c.zp.b(paramColor.getB() & 0xFF);
    return str;
  }
  
  static String b(Color paramColor)
  {
    String str = "#" + com.aspose.cells.a.c.zp.b(paramColor.getR() & 0xFF) + com.aspose.cells.a.c.zp.b(paramColor.getG() & 0xFF) + com.aspose.cells.a.c.zp.b(paramColor.getB() & 0xFF);
    return str;
  }
  
  static String g(String paramString)
  {
    switch (b.a(paramString.toLowerCase()))
    {
    case 31: 
      return "RED";
    case 32: 
      return "GREEN";
    case 33: 
      return "BLUE";
    }
    return null;
  }
  
  static Color h(String paramString)
  {
    if (paramString == null) {
      return Color.getEmpty();
    }
    if (paramString.startsWith("#")) {
      return com.aspose.cells.b.a.b.zf.a(paramString);
    }
    int m;
    if (paramString.startsWith("rgb"))
    {
      String str = paramString.substring(4);
      localObject = str.substring(0, 0 + (str.length() - 1));
      String[] arrayOfString = zw.d(((String)localObject).trim(), ',');
      k = zauj.F(arrayOfString[0].trim());
      m = zauj.F(arrayOfString[1].trim());
      int n = zauj.F(arrayOfString[2].trim());
      return Color.fromArgb(k, m, n);
    }
    int i = 0;
    Object localObject = paramString.toCharArray();
    int j = 1;
    for (int k = 0; k < localObject.length; k++)
    {
      m = -1;
      switch (localObject[k])
      {
      case '0': 
      case '1': 
      case '2': 
      case '3': 
      case '4': 
      case '5': 
      case '6': 
      case '7': 
      case '8': 
      case '9': 
        m = localObject[k] - '0';
        break;
      case 'A': 
      case 'B': 
      case 'C': 
      case 'D': 
      case 'E': 
      case 'F': 
      case 'a': 
      case 'b': 
      case 'c': 
      case 'd': 
      case 'e': 
      case 'f': 
        m = (localObject[k] | 0x20) - 'a' + 10;
        break;
      case ':': 
      case ';': 
      case '<': 
      case '=': 
      case '>': 
      case '?': 
      case '@': 
      case 'G': 
      case 'H': 
      case 'I': 
      case 'J': 
      case 'K': 
      case 'L': 
      case 'M': 
      case 'N': 
      case 'O': 
      case 'P': 
      case 'Q': 
      case 'R': 
      case 'S': 
      case 'T': 
      case 'U': 
      case 'V': 
      case 'W': 
      case 'X': 
      case 'Y': 
      case 'Z': 
      case '[': 
      case '\\': 
      case ']': 
      case '^': 
      case '_': 
      case '`': 
      default: 
        m = -1;
      }
      if (m == -1)
      {
        j = 0;
        break;
      }
      i = i << 4 | m;
    }
    if (j != 0) {
      return Color.fromArgb(i);
    }
    return Color.a(paramString);
  }
  
  static int i(String paramString)
  {
    int i = com.aspose.cells.b.a.zp.a(paramString);
    if ((i > 90) && (i < 270)) {
      return 180 - i;
    }
    if (i >= 270) {
      return 360 - i;
    }
    return i;
  }
  
  static int j(String paramString)
  {
    switch (b.a(paramString))
    {
    case 34: 
      return 1;
    case 35: 
      return 0;
    case 36: 
      return 3;
    case 37: 
      return 2;
    case 38: 
      return 4;
    }
    return 6;
  }
  
  static String a(double paramDouble)
  {
    return com.aspose.cells.a.c.zp.b(paramDouble);
  }
  
  static String a(int paramInt)
  {
    return com.aspose.cells.a.c.zp.a(paramInt);
  }
  
  static String a(short paramShort)
  {
    return com.aspose.cells.a.c.zp.a(paramShort);
  }
  
  static String b(double paramDouble)
  {
    return com.aspose.cells.a.c.zp.b(paramDouble);
  }
  
  static double k(String paramString)
  {
    return zo.a(paramString, com.aspose.cells.b.a.c.za.b());
  }
  
  static String b(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return null;
    case 7: 
      return "0.05pt solid ";
    case 4: 
      return "thin dotted ";
    case 1: 
    case 3: 
    case 9: 
    case 11: 
      return "1.0pt solid ";
    case 6: 
      return "3.0pt double ";
    case 2: 
    case 8: 
    case 10: 
    case 12: 
    case 13: 
      return "2.5pt solid ";
    case 5: 
      return "4.0pt solid ";
    }
    return "1.0pt solid ";
  }
  
  static String a(boolean paramBoolean)
  {
    if (paramBoolean) {
      return "true";
    }
    return "false";
  }
  
  static String[] l(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    for (int j = 0; j < paramString.length(); j++)
    {
      k = paramString.charAt(j);
      switch (k)
      {
      case 34: 
        if (j != paramString.length() - 1) {
          j++;
        }
        break;
      case 91: 
      case 59: 
        while ((j < paramString.length()) && (paramString.charAt(j) != '"'))
        {
          j++;
          continue;
          if (j != paramString.length() - 1)
          {
            j++;
            while ((j < paramString.length()) && (paramString.charAt(j) != ']'))
            {
              j++;
              continue;
              if (j - i > 1) {
                com.aspose.cells.b.a.a.zf.a(localArrayList, paramString.substring(i, i + (j - i)));
              } else {
                com.aspose.cells.b.a.a.zf.a(localArrayList, "");
              }
              i = j + 1;
            }
          }
        }
      }
    }
    if (i < paramString.length()) {
      com.aspose.cells.b.a.a.zf.a(localArrayList, paramString.substring(i));
    }
    String[] arrayOfString = new String[localArrayList.size()];
    for (int k = 0; k < localArrayList.size(); k++) {
      arrayOfString[k] = ((String)localArrayList.get(k));
    }
    return arrayOfString;
  }
  
  static boolean m(String paramString)
  {
    return "true".equals(paramString);
  }
  
  static double n(String paramString)
  {
    return zo.a(paramString, com.aspose.cells.b.a.c.za.b());
  }
  
  static int o(String paramString)
  {
    return com.aspose.cells.b.a.zp.a(paramString, com.aspose.cells.b.a.c.za.b());
  }
  
  static DateTime p(String paramString)
  {
    int[] arrayOfInt = new int[7];
    int i = 0;
    for (int j = 0; j < paramString.length(); j++) {
      if (Character.isDigit(paramString.charAt(j))) {
        while (j < paramString.length())
        {
          if (Character.isDigit(paramString.charAt(j)))
          {
            arrayOfInt[i] = (arrayOfInt[i] * 10 + paramString.charAt(j) - 48);
          }
          else
          {
            i++;
            if (i >= 7)
            {
              j = paramString.length();
              break;
            }
            j--;
            break;
          }
          j++;
        }
      }
    }
    return new DateTime(arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], arrayOfInt[3], arrayOfInt[4], arrayOfInt[5], arrayOfInt[6] > 1000 ? 0 : arrayOfInt[6]);
  }
  
  static double q(String paramString)
  {
    double d = 0.0D;
    int i = 0;
    for (int j = 0; j < paramString.length(); j++) {
      switch (paramString.charAt(j))
      {
      case 'H': 
        d += i / 24.0F;
        i = 0;
        break;
      case 'M': 
        d += i / 1440.0F;
        i = 0;
        break;
      case 'S': 
        d += i / 86400.0F;
        i = 0;
        break;
      case '0': 
      case '1': 
      case '2': 
      case '3': 
      case '4': 
      case '5': 
      case '6': 
      case '7': 
      case '8': 
      case '9': 
        i = i * 10 + paramString.charAt(j) - 48;
      }
    }
    return d;
  }
  
  static String c(double paramDouble)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramDouble != 0.0D)
    {
      String str = null;
      if (paramDouble > 0.0D)
      {
        str = "PT";
      }
      else
      {
        str = "-PT";
        paramDouble = -paramDouble;
      }
      localStringBuilder.append(str);
      paramDouble *= 24.0D;
      double d1 = Math.floor(paramDouble);
      double d2 = paramDouble - d1;
      if (10.0D - d1 > 0.0D) {
        localStringBuilder.append(0);
      }
      localStringBuilder.append((int)d1);
      if (d2 == 0.0D)
      {
        localStringBuilder.append("H00M00S");
        return zs.a(localStringBuilder);
      }
      d2 *= 60.0D;
      double d3 = Math.floor(d2);
      double d4 = d2 - d3;
      localStringBuilder.append("H");
      if (10.0D - d3 > 0.0D) {
        localStringBuilder.append(0);
      }
      localStringBuilder.append((int)d3);
      if (d4 == 0.0D)
      {
        localStringBuilder.append("M00S");
        return zs.a(localStringBuilder);
      }
      d4 *= 60.0D;
      double d5 = Math.floor(d4);
      localStringBuilder.append("M");
      if (10.0D - d5 > 0.0D) {
        localStringBuilder.append(0);
      }
      localStringBuilder.append((int)d5);
      localStringBuilder.append("S");
      return zs.a(localStringBuilder);
    }
    return "PT00H00M00S";
  }
  
  static String c(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "bottom";
    case 1: 
      return "middle";
    case 6: 
      return "justify";
    case 9: 
      return "top";
    }
    throw new CellsException(6, "Invalid TextAlignmentType val");
  }
  
  static int r(String paramString)
  {
    switch (b.a(paramString))
    {
    case 12: 
      return 0;
    case 39: 
      return 1;
    case 40: 
      return 6;
    case 11: 
      return 9;
    }
    throw new CellsException(6, "Invalid ShapeTextAnchor string val");
  }
  
  static String d(int paramInt)
  {
    switch (paramInt)
    {
    case 8: 
      return "right";
    case 1: 
      return "center";
    case 6: 
      return "justify";
    case 7: 
      return "left";
    }
    throw new CellsException(6, "Invalid TextAlignmentType val");
  }
  
  static int s(String paramString)
  {
    switch (b.a(paramString))
    {
    case 41: 
      return 8;
    case 42: 
      return 1;
    case 40: 
      return 6;
    case 43: 
      return 7;
    }
    throw new CellsException(6, "Invalid ShapeTextAlignType string val");
  }
  
  static double t(String paramString)
  {
    return com.aspose.cells.b.a.zp.a(paramString.substring(0, 0 + (paramString.length() - 1))) / 100.0D;
  }
  
  static String d(double paramDouble)
  {
    return zo.b(paramDouble * 100.0D) + "%";
  }
  
  static boolean u(String paramString)
  {
    return !"no-wrap".equals(paramString);
  }
  
  static String b(boolean paramBoolean)
  {
    if (paramBoolean) {
      return "wrap";
    }
    return "no-wrap";
  }
  
  static String v(String paramString)
  {
    int i = paramString.indexOf("./");
    if (i == 0) {
      return paramString.substring(2);
    }
    return paramString;
  }
  
  public static Object[] a(Workbook paramWorkbook, SaveOptions paramSaveOptions)
  {
    paramWorkbook.getWorksheets().a(paramSaveOptions);
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = paramWorkbook.getWorksheets().A();
    zajm localzajm = paramWorkbook.getWorksheets().C();
    arrayOfObject[1] = localzajm;
    int i = 0;
    String str = null;
    ArrayList localArrayList = new ArrayList();
    arrayOfObject[2] = localArrayList;
    int j = localzajm.b();
    for (int k = 0; k < j; k++)
    {
      Style localStyle = localzajm.a(k);
      int[] arrayOfInt = { i };
      String[] arrayOfString = { str };
      localStyle.a(arrayOfInt, arrayOfString);
      i = arrayOfInt[0];
      str = arrayOfString[0];
      if (i > 0)
      {
        int m = 0;
        zasx localzasx;
        for (int n = 0; n < localArrayList.size(); n++)
        {
          localzasx = (zasx)localArrayList.get(n);
          if (localzasx.a == i) {
            m = 1;
          } else {
            if (localzasx.a > i) {
              break;
            }
          }
        }
        if (m == 0)
        {
          localzasx = new zasx();
          localzasx.a = i;
          localzasx.b = str;
          if (n >= localArrayList.size()) {
            com.aspose.cells.b.a.a.zf.a(localArrayList, localzasx);
          } else {
            localArrayList.add(n, localzasx);
          }
        }
      }
    }
    return arrayOfObject;
  }
  
  public static String a(WorksheetCollection paramWorksheetCollection, Name paramName)
  {
    if ((paramName.b() != null) && (paramName.b().length > 2))
    {
      zaso localzaso = new zaso(paramWorksheetCollection);
      byte[] arrayOfByte = paramName.b();
      return localzaso.a(-1, arrayOfByte, 0, 0, false);
    }
    return null;
  }
  
  public static String e(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
    case 1: 
    case 2: 
    case 3: 
    case 4: 
    case 5: 
      return "chart:area";
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
    case 11: 
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
    case 31: 
    case 32: 
    case 33: 
    case 34: 
    case 50: 
    case 51: 
    case 52: 
    case 53: 
    case 54: 
    case 55: 
    case 56: 
      return "chart:bar";
    case 37: 
    case 38: 
    case 39: 
    case 40: 
    case 41: 
    case 42: 
    case 43: 
      return "chart:line";
    case 44: 
    case 45: 
    case 46: 
    case 47: 
    case 48: 
    case 49: 
      return "chart:circle";
    case 35: 
    case 36: 
      return "chart:ring";
    case 60: 
    case 61: 
    case 62: 
    case 63: 
    case 64: 
      return "chart:scatter";
    case 57: 
    case 58: 
    case 59: 
      return "chart:radar";
    case 69: 
    case 70: 
    case 71: 
    case 72: 
      return "chart:bar";
    case 12: 
    case 13: 
      return "chart:scatter";
    case 65: 
    case 66: 
    case 67: 
    case 68: 
      return "chart:stock";
    }
    return "chart:bar";
  }
  
  public static boolean f(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
    case 2: 
    case 4: 
    case 5: 
    case 7: 
    case 8: 
    case 10: 
    case 11: 
    case 15: 
    case 16: 
    case 19: 
    case 23: 
    case 25: 
    case 26: 
    case 29: 
    case 30: 
    case 32: 
    case 33: 
    case 38: 
    case 39: 
    case 41: 
    case 42: 
    case 51: 
    case 52: 
    case 54: 
    case 55: 
      return true;
    }
    return false;
  }
  
  public static boolean g(int paramInt)
  {
    switch (paramInt)
    {
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
    case 11: 
    case 24: 
    case 25: 
    case 26: 
    case 31: 
    case 32: 
    case 33: 
    case 53: 
    case 54: 
    case 55: 
      return true;
    }
    return false;
  }
  
  public static boolean h(int paramInt)
  {
    switch (paramInt)
    {
    case 2: 
    case 5: 
    case 8: 
    case 11: 
    case 16: 
    case 20: 
    case 23: 
    case 26: 
    case 30: 
    case 33: 
    case 39: 
    case 42: 
    case 52: 
    case 55: 
      return true;
    }
    return false;
  }
  
  public static boolean i(int paramInt)
  {
    switch (paramInt)
    {
    case 44: 
    case 45: 
    case 46: 
    case 47: 
    case 48: 
    case 49: 
      return true;
    }
    return false;
  }
  
  public static boolean j(int paramInt)
  {
    switch (paramInt)
    {
    case 28: 
    case 29: 
    case 30: 
    case 31: 
    case 32: 
    case 33: 
    case 34: 
      return true;
    }
    return false;
  }
  
  public static boolean k(int paramInt)
  {
    switch (paramInt)
    {
    case 61: 
    case 62: 
      return true;
    }
    return false;
  }
  
  public static String a(int paramInt1, int paramInt2)
  {
    switch (paramInt1)
    {
    case 0: 
      return "automatic";
    case 5: 
      return "none";
    case 7: 
      return "square";
    case 1: 
      return "arrow-right";
    case 3: 
      return "diamond";
    case 9: 
      return "arrow-up";
    case 2: 
      return "arrow-right";
    case 4: 
      return "arrow-down";
    case 6: 
      return "arrow-left";
    case 8: 
      return "hourglass";
    case 10: 
      return "bow-tie";
    }
    return "automatic";
  }
  
  public static double e(double paramDouble)
  {
    return paramDouble / a * 2.54D;
  }
  
  static String a(double paramDouble, int paramInt)
  {
    return a(zr.b(paramInt / paramDouble, 4)) + "in";
  }
  
  public static double a(WorksheetCollection paramWorksheetCollection, double paramDouble)
  {
    double d = paramDouble / 72.0D;
    return d * 2.54D;
  }
  
  public static double b(WorksheetCollection paramWorksheetCollection, double paramDouble)
  {
    int i = (int)(paramDouble * zbxp.a() / 2.54D);
    return i;
  }
  
  public static double f(double paramDouble)
  {
    return paramDouble * 2.54D;
  }
  
  public static String g(double paramDouble)
  {
    return zo.b((int)((paramDouble + 0.005D) * 100.0D) / 100.0D);
  }
  
  public static String a(ChartShape paramChartShape)
  {
    return com.aspose.cells.b.a.zp.a(paramChartShape.Q().getIndex()) + "-" + com.aspose.cells.b.a.zp.a(paramChartShape.w());
  }
  
  public static String l(int paramInt)
  {
    switch (paramInt)
    {
    case 4: 
      return "bool";
    case 0: 
      return "currency";
    case 2: 
      return "date";
    case 1: 
      return "number";
    case 6: 
      return "percentage";
    case 5: 
      return "text";
    case 3: 
      return "time";
    }
    return "unknown";
  }
  
  public static String m(int paramInt)
  {
    switch (paramInt)
    {
    case 12: 
      return "ampm";
    case 3: 
      return "currencysymbo";
    case 8: 
      return "day";
    case 15: 
      return "dayofweek";
    case 13: 
      return "fraction";
    case 9: 
      return "hours";
    case 5: 
      return "map";
    case 10: 
      return "minutes";
    case 7: 
      return "month";
    case 4: 
      return "number";
    case 14: 
      return "scientificnumber";
    case 11: 
      return "seconds";
    case 0: 
      return "text";
    case 1: 
      return "textcontent";
    case 2: 
      return "textproperties";
    case 6: 
      return "year";
    }
    return "unknown";
  }
  
  public static int w(String paramString)
  {
    switch (b.a(paramString))
    {
    case 44: 
      return 2;
    case 45: 
      return 3;
    case 42: 
      return 0;
    }
    return 3;
  }
  
  static int x(String paramString)
  {
    switch (b.a(paramString))
    {
    case 46: 
      return 0;
    case 47: 
      return 1;
    case 48: 
    case 49: 
      return 2;
    }
    return 3;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zasp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */