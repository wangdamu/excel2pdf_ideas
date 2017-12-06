package com.aspose.cells;

import com.aspose.cells.a.c.zt;
import com.aspose.cells.a.d.zap;
import com.aspose.cells.a.d.zff;
import com.aspose.cells.b.a.b.zj;
import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.a.zs;
import java.io.InputStream;
import java.util.ArrayList;

public class CellsHelper
{
  private static int a = 17;
  private static String b = null;
  private static String c = null;
  private static String d = null;
  private static String e;
  
  public static int getSignificantDigits()
  {
    return a;
  }
  
  public static void setSignificantDigits(int value)
  {
    a = value;
  }
  
  public static double getDPI()
  {
    return zbxp.a();
  }
  
  public static void setDPI(double value)
  {
    zap.a((float)value);
  }
  
  public static String getVersion()
  {
    return zt.a();
  }
  
  /**
   * @deprecated
   */
  public static boolean isProtectedByRMS(String fileName)
    throws Exception
  {
    return FileFormatUtil.detectFileFormat(fileName).c;
  }
  
  /**
   * @deprecated
   */
  public static boolean isProtectedByRMS(InputStream stream)
    throws Exception
  {
    com.aspose.cells.b.a.d.zi localzi = new com.aspose.cells.b.a.d.zi(stream);
    return FileFormatUtil.detectFileFormat(stream).c;
  }
  
  public static int[] cellNameToIndex(String cellName)
  {
    int i = 0;
    int j = 0;
    if (cellName == null) {
      throw new CellsException(6, "Invalid cell name");
    }
    j = 0;
    int k = 0;
    int m;
    for (k = 0; k < cellName.length(); k++)
    {
      m = cellName.charAt(k) | 0x20;
      if ((m < 97) || (m > 122)) {
        break;
      }
      j = j * 26 + m - 97 + 1;
    }
    if ((k == 0) || (k == cellName.length())) {
      throw new CellsException(6, "Invalid cell name");
    }
    j--;
    i = 0;
    while (k < cellName.length())
    {
      m = cellName.charAt(k);
      if ((m < 48) || (m > 57)) {
        break;
      }
      i = i * 10 + cellName.charAt(k) - 48;
      k++;
    }
    if ((k != cellName.length()) || (i == 0)) {
      throw new CellsException(6, "Invalid cell name");
    }
    i--;
    if ((i > 1048575) || (j > 16383)) {
      throw new CellsException(6, "Invalid cell name");
    }
    return new int[] { i, j };
  }
  
  static void a(String paramString, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    if (paramString == null) {
      throw new CellsException(6, "Invalid cell name");
    }
    paramArrayOfInt2[0] = 0;
    int i = 0;
    int j;
    for (i = 0; i < paramString.length(); i++)
    {
      j = paramString.charAt(i) | 0x20;
      if ((j < 97) || (j > 122)) {
        break;
      }
      paramArrayOfInt2[0] = (paramArrayOfInt2[0] * 26 + j - 97 + 1);
    }
    if ((i == 0) || (i == paramString.length())) {
      throw new CellsException(6, "Invalid cell name");
    }
    paramArrayOfInt2[0] -= 1;
    paramArrayOfInt1[0] = 0;
    while (i < paramString.length())
    {
      j = paramString.charAt(i);
      if ((j < 48) || (j > 57)) {
        break;
      }
      paramArrayOfInt1[0] = (paramArrayOfInt1[0] * 10 + paramString.charAt(i) - 48);
      i++;
    }
    if ((i != paramString.length()) || (paramArrayOfInt1[0] == 0)) {
      throw new CellsException(6, "Invalid cell name");
    }
    paramArrayOfInt1[0] -= 1;
    if ((paramArrayOfInt1[0] > 1048575) || (paramArrayOfInt2[0] > 16383)) {
      throw new CellsException(6, "Invalid cell name");
    }
  }
  
  static int[] a(char[] paramArrayOfChar, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, int paramInt4)
  {
    int i = -1;
    int j = -1;
    int k = 0;
    int m = 0;
    for (int n = paramInt1; n <= paramInt2; n++) {
      switch (paramArrayOfChar[n])
      {
      case '$': 
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
        if (i != -1) {
          return null;
        }
        if ((n != paramInt1) && (paramArrayOfChar[(n - 1)] == '$')) {
          m = 1;
        }
        i = paramArrayOfChar[n] - '0';
        n++;
        while (n <= paramInt2)
        {
          if (Character.isDigit(paramArrayOfChar[n])) {
            i = i * 10 + paramArrayOfChar[n] - 48;
          } else {
            return null;
          }
          n++;
        }
        i--;
        if (i > paramInt3) {
          return null;
        }
        break;
      case 'A': 
      case 'B': 
      case 'C': 
      case 'D': 
      case 'E': 
      case 'F': 
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
      case 'a': 
      case 'b': 
      case 'c': 
      case 'd': 
      case 'e': 
      case 'f': 
      case 'g': 
      case 'h': 
      case 'i': 
      case 'j': 
      case 'k': 
      case 'l': 
      case 'm': 
      case 'n': 
      case 'o': 
      case 'p': 
      case 'q': 
      case 'r': 
      case 's': 
      case 't': 
      case 'u': 
      case 'v': 
      case 'w': 
      case 'x': 
      case 'y': 
      case 'z': 
        if ((j != -1) || (i != -1)) {
          return null;
        }
        int i1 = n;
        i1++;
        while ((i1 <= paramInt2) && (Character.isLetter(paramArrayOfChar[i1]))) {
          i1++;
        }
        if ((n != paramInt1) && (paramArrayOfChar[(n - 1)] == '$')) {
          k = 1;
        }
        if (i1 - n > 3) {
          return null;
        }
        j = (paramArrayOfChar[n] | 0x20) - 'a' + 1;
        n++;
        while (n < i1)
        {
          j = j * 26 + (paramArrayOfChar[n] | 0x20) - 97 + 1;
          n++;
        }
        n--;
        j--;
        if (j > paramInt4) {
          return null;
        }
        break;
      case '%': 
      case '&': 
      case '\'': 
      case '(': 
      case ')': 
      case '*': 
      case '+': 
      case ',': 
      case '-': 
      case '.': 
      case '/': 
      case ':': 
      case ';': 
      case '<': 
      case '=': 
      case '>': 
      case '?': 
      case '@': 
      case '[': 
      case '\\': 
      case ']': 
      case '^': 
      case '_': 
      case '`': 
      default: 
        return null;
      }
    }
    if ((i == -1) && (j == -1)) {
      return null;
    }
    if ((!paramBoolean) && ((i == -1) || (j == -1))) {
      return null;
    }
    int[] arrayOfInt = { i, j, m, k };
    return arrayOfInt;
  }
  
  public static String cellIndexToName(int row, int column)
  {
    zamm.a(row, column);
    StringBuilder localStringBuilder = new StringBuilder();
    row++;
    a(localStringBuilder, column);
    localStringBuilder.append(row);
    return zs.a(localStringBuilder);
  }
  
  static void a(StringBuilder paramStringBuilder, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a(new ziq(paramStringBuilder), paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  static void a(zahh paramzahh, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a(paramzahh, paramInt2);
    paramzahh.a(com.aspose.cells.a.c.zi.a(paramInt1 + 1));
    if ((paramInt1 != paramInt3) || (paramInt2 != paramInt4))
    {
      paramzahh.a(":");
      a(paramzahh, paramInt4);
      paramzahh.a(com.aspose.cells.a.c.zi.a(paramInt3 + 1));
    }
  }
  
  static String a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, paramInt2);
    localStringBuilder.append(paramInt1 + 1);
    if ((paramInt1 != paramInt3) || (paramInt2 != paramInt4))
    {
      localStringBuilder.append(":");
      a(localStringBuilder, paramInt4);
      localStringBuilder.append(paramInt3 + 1);
    }
    return zs.a(localStringBuilder);
  }
  
  static String a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if ((paramInt1 == 0) && (paramInt3 == paramInt5))
    {
      a(localStringBuilder, paramInt2);
      localStringBuilder.append(":");
      a(localStringBuilder, paramInt4);
      return zs.a(localStringBuilder);
    }
    if ((paramInt2 == 0) && (paramInt4 == paramInt6))
    {
      localStringBuilder.append(paramInt1 + 1);
      localStringBuilder.append(":");
      localStringBuilder.append(paramInt3 + 1);
      return zs.a(localStringBuilder);
    }
    a(localStringBuilder, paramInt2);
    localStringBuilder.append(paramInt1 + 1);
    if ((paramInt1 != paramInt3) || (paramInt2 != paramInt4))
    {
      localStringBuilder.append(":");
      a(localStringBuilder, paramInt4);
      localStringBuilder.append(paramInt3 + 1);
    }
    return zs.a(localStringBuilder);
  }
  
  static String a(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    paramInt1++;
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramBoolean2) {
      localStringBuilder.append('$');
    }
    a(localStringBuilder, paramInt2);
    if (paramBoolean1) {
      localStringBuilder.append('$');
    }
    localStringBuilder.append(paramInt1);
    return zs.a(localStringBuilder);
  }
  
  static void a(StringBuilder paramStringBuilder, int paramInt1, int paramInt2)
  {
    paramInt1++;
    a(paramStringBuilder, paramInt2);
    paramStringBuilder.append(paramInt1);
  }
  
  static void a(zahh paramzahh, int paramInt1, int paramInt2)
  {
    paramInt1++;
    a(paramzahh, paramInt2);
    paramzahh.a(com.aspose.cells.a.c.zi.a(paramInt1));
  }
  
  public static String columnIndexToName(int column)
  {
    if ((column < 0) || (column > 16383)) {
      throw new IllegalArgumentException();
    }
    if (column < 26) {
      return Character.toString((char)(column % 26 + 65));
    }
    zbpe localzbpe = new zbpe();
    a(localzbpe, column);
    return zs.a(localzbpe);
  }
  
  static void a(StringBuilder paramStringBuilder, int paramInt)
  {
    a(new ziq(paramStringBuilder), paramInt);
  }
  
  static void a(zahh paramzahh, int paramInt)
  {
    if (paramInt < 0) {
      throw new IllegalArgumentException();
    }
    if (paramInt < 26)
    {
      paramzahh.a((char)(paramInt + 65));
    }
    else
    {
      char c1;
      if (paramInt < 702)
      {
        c1 = (char)(paramInt % 26 + 65);
        paramInt = paramInt / 26 - 1;
        paramzahh.a((char)(paramInt + 65));
        paramzahh.a(c1);
      }
      else if (paramInt <= 16383)
      {
        c1 = (char)(paramInt % 26 + 65);
        paramInt = paramInt / 26 - 1;
        char c2 = (char)(paramInt % 26 + 65);
        paramInt = paramInt / 26 - 1;
        paramzahh.a((char)(paramInt + 65));
        paramzahh.a(c2);
        paramzahh.a(c1);
      }
      else
      {
        throw new IllegalArgumentException();
      }
    }
  }
  
  public static int columnNameToIndex(String columnName)
  {
    int i = 0;
    for (int j = 0; j < columnName.length(); j++) {
      if (Character.isLetter(columnName.charAt(j))) {
        i = i * 26 + (columnName.charAt(j) | 0x20) - 97 + 1;
      } else {
        throw new CellsException(6, "Invalid Column name.");
      }
    }
    if (i > 0) {
      i--;
    }
    if (i > 16383) {
      throw new CellsException(10, "Invalid Column name.");
    }
    return i;
  }
  
  public static String rowIndexToName(int row)
  {
    row++;
    return zp.a(row);
  }
  
  public static int rowNameToIndex(String rowName)
  {
    int i = zp.a(rowName);
    i--;
    return i;
  }
  
  public static String convertR1C1FormulaToA1(String r1c1Formula, int row, int column)
  {
    return zauw.b(r1c1Formula, row, column);
  }
  
  public static String convertA1FormulaToR1C1(String formula, int row, int column)
  {
    return zauw.a(formula, row, column);
  }
  
  public static DateTime getDateTimeFromDouble(double doubleValue, boolean date1904)
  {
    return zbxa.a(doubleValue, date1904);
  }
  
  public static double getDoubleFromDateTime(DateTime dateTime, boolean date1904)
  {
    return zbxa.a(dateTime, date1904);
  }
  
  /**
   * @deprecated
   */
  public static int detectLoadFormat(String fileName)
    throws Exception
  {
    return FileFormatUtil.detectFileFormat(fileName).getLoadFormat();
  }
  
  /**
   * @deprecated
   */
  public static int detectLoadFormat(InputStream stream)
    throws Exception
  {
    return FileFormatUtil.detectFileFormat(stream).getLoadFormat();
  }
  
  /**
   * @deprecated
   */
  public static int detectFileFormat(String fileName)
    throws Exception
  {
    return FileFormatUtil.detectFileFormat(fileName).getFileFormatType();
  }
  
  /**
   * @deprecated
   */
  public static int detectFileFormat(InputStream stream)
    throws Exception
  {
    return FileFormatUtil.detectFileFormat(stream).getFileFormatType();
  }
  
  /**
   * @deprecated
   */
  public static String getFontDir()
  {
    return FontConfigs.c();
  }
  
  /**
   * @deprecated
   */
  public static void setFontDir(String value)
  {
    FontConfigs.a(value);
  }
  
  /**
   * @deprecated
   */
  public static ArrayList getFontDirs()
  {
    return FontConfigs.d();
  }
  
  /**
   * @deprecated
   */
  public static void setFontDirs(ArrayList value)
  {
    FontConfigs.a(value);
  }
  
  /**
   * @deprecated
   */
  public static ArrayList getFontFiles()
  {
    return FontConfigs.e();
  }
  
  /**
   * @deprecated
   */
  public static void setFontFiles(ArrayList value)
  {
    FontConfigs.b(value);
  }
  
  public static String getStartupPath()
  {
    return b;
  }
  
  public static void setStartupPath(String value)
  {
    b = value;
  }
  
  public static String getAltStartPath()
  {
    return c;
  }
  
  public static void setAltStartPath(String value)
  {
    c = value;
  }
  
  public static String getLibraryPath()
  {
    return d;
  }
  
  public static void setLibraryPath(String value)
  {
    d = value;
  }
  
  public static Color[] getUsedColors(Workbook workbook)
  {
    return zavb.a(workbook);
  }
  
  public static CustomImplementationFactory getCustomImplementationFactory()
  {
    return CustomImplementationFactory.a;
  }
  
  public static void setCustomImplementationFactory(CustomImplementationFactory value)
  {
    CustomImplementationFactory.a = value;
  }
  
  public static void addAddInFunction(String function, int minCountOfParameters, int maxCountOfParameters, int[] paramersType, int functionValueType)
  {
    int[] arrayOfInt = new int[paramersType.length];
    for (int i = 0; i < arrayOfInt.length; i++) {
      switch (paramersType[i])
      {
      case 2: 
        arrayOfInt[i] = 96;
        break;
      case 0: 
        arrayOfInt[i] = 32;
        break;
      case 1: 
        arrayOfInt[i] = 64;
      }
    }
    i = 64;
    switch (functionValueType)
    {
    case 2: 
      i = 96;
      break;
    case 0: 
      i = 32;
    }
    zacn.a(function, minCountOfParameters, maxCountOfParameters, arrayOfInt, i);
  }
  
  public static void mergeFiles(String[] files, String cachedFile, String destFile)
    throws Exception
  {
    zape localzape = new zape();
    localzape.a(files, cachedFile, destFile);
  }
  
  static void a(String paramString)
  {
    e = paramString;
    zff.e(paramString);
  }
  
  static boolean a(zj paramzj)
  {
    return (paramzj.j() <= 0.0F) || (paramzj.k() <= 0.0F);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/CellsHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */