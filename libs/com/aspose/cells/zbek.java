package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;

class zbek
{
  public static String[] a = { "Title", "Subject", "Author", "Keywords", "Description", "LastAuthor", "Revision", "AppName", "TotalTime", "LastPrinted", "Created", "LastSaved", "Pages", "Words", "Characters", "Category", "PresentationFormat", "Manager", "Company", "Guid", "HyperlinkBase", "Bytes", "Lines", "Paragraphs", "CharactersWithSpaces", "Version" };
  public static String[] b = { "HideHorizontalScrollBar", "HideVerticalScrollBar", "HideWorkbookTabs", "ActiveSheet" };
  static int[] c = { 0, 16777215, 255, 65280, 16711680, 65535, 16711935, 16776960, 128, 32768, 8388608, 32896, 8388736, 8421376, 12632256, 8421504, 16751001, 6697881, 13434879, 16777164, 6684774, 8421631, 13395456, 16764108, 8388608, 16711935, 65535, 16776960, 8388736, 128, 8421376, 16711680, 16763904, 16777164, 13434828, 10092543, 16764057, 13408767, 16751052, 10079487, 16737843, 13421619, 52377, 52479, 39423, 26367, 10053222, 9868950, 6697728, 6723891, 13056, 13107, 13209, 6697881, 10040115, 3355443 };
  private static final za d = new za(new String[] { "Between", "Equal", "GreaterOrEqual", "Greater", "LessOrEqual", "Less", "NotBetween", "NotEqual", "single", "double", "none", ".5pt solid", "1.0pt solid", ".5pt dashed", ".5pt dotted", "1.5pt solid", "2.0pt double", ".5pt hairline", "1.0pt dashed", ".5pt dot-dash", "1.0pt dot-dash", ".5pt dot-dot-dash", "1.0pt dot-dot-dash", "1.0pt dot-dash-slanted", "gray-75", "gray-50", "gray-25", "gray-125", "gray-0625", "horz-stripe", "vert-stripe", "reverse-diag-stripe", "diag-stripe", "diag-cross", "thick-diag-cross", "thin-horz-stripe", "thin-vert-stripe", "thin-reverse-diag-stripe", "thin-diag-stripe", "thin-horz-cross", "thin-diag-cross" });
  
  static String a(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "Between";
    case 1: 
      return "Equal";
    case 3: 
      return "GreaterOrEqual";
    case 2: 
      return "Greater";
    case 5: 
      return "LessOrEqual";
    case 4: 
      return "Less";
    case 7: 
      return "NotBetween";
    case 8: 
      return "NotEqual";
    }
    throw new CellsException(6, "Invalid OperatorType val");
  }
  
  static int a(String paramString)
  {
    switch (d.a(paramString))
    {
    case 0: 
      return 0;
    case 1: 
      return 1;
    case 2: 
      return 3;
    case 3: 
      return 2;
    case 4: 
      return 5;
    case 5: 
      return 4;
    case 6: 
      return 7;
    case 7: 
      return 8;
    }
    throw new CellsException(6, "Invalid OperatorType string val");
  }
  
  static String b(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
    case 3: 
      return "single";
    case 2: 
    case 4: 
      return "double";
    }
    return "none";
  }
  
  static int b(String paramString)
  {
    switch (d.a(paramString))
    {
    case 8: 
      return 1;
    case 9: 
      return 2;
    }
    return 0;
  }
  
  public static String a(Style paramStyle)
  {
    StringBuilder localStringBuilder = new StringBuilder(30);
    String str;
    if (paramStyle.isModified(35)) {
      if (!paramStyle.a.b())
      {
        str = "#" + zauj.a(paramStyle.getBackgroundColor());
        localStringBuilder.append("background:" + str + ";");
      }
      else
      {
        localStringBuilder.append("mso-background-source:auto;");
      }
    }
    if ((paramStyle.isModified(33)) || (paramStyle.isModified(34)))
    {
      localStringBuilder.append("mso-pattern:");
      if (paramStyle.isModified(34))
      {
        str = "auto";
        if (!paramStyle.b.b()) {
          str = "#" + zauj.a(paramStyle.getForegroundColor());
        }
        localStringBuilder.append(str + " ");
      }
      str = ztt.b(paramStyle.getPattern());
      localStringBuilder.append(str + ";");
    }
    return zs.a(localStringBuilder);
  }
  
  public static String a(Style paramStyle, int paramInt)
  {
    Border localBorder = paramStyle.getBorders().getByBorderType(paramInt);
    int i = localBorder.getLineStyle();
    if (i == 0) {
      return "none";
    }
    StringBuilder localStringBuilder = new StringBuilder(ztt.a(i));
    if (!localBorder.a.b()) {
      localStringBuilder.append(" #" + zauj.a(localBorder.getColor()));
    } else {
      localStringBuilder.append(" windowtext");
    }
    return zs.a(localStringBuilder);
  }
  
  static Color c(String paramString)
  {
    int i = zp.a(paramString, 515);
    Color localColor = Color.fromArgb(i);
    return localColor;
  }
  
  static int d(String paramString)
  {
    switch (d.a(paramString))
    {
    case 10: 
      return 0;
    case 11: 
      return 1;
    case 12: 
      return 2;
    case 13: 
      return 3;
    case 14: 
      return 4;
    case 15: 
      return 5;
    case 16: 
      return 6;
    case 17: 
      return 7;
    case 18: 
      return 8;
    case 19: 
      return 9;
    case 20: 
      return 10;
    case 21: 
      return 11;
    case 22: 
      return 12;
    case 23: 
      return 13;
    }
    throw new CellsException(6, "Invalid BorderLineStyleString val: " + paramString);
  }
  
  static int e(String paramString)
  {
    switch (d.a(paramString))
    {
    case 10: 
      return 1;
    case 24: 
      return 3;
    case 25: 
      return 2;
    case 26: 
      return 4;
    case 27: 
      return 17;
    case 28: 
      return 18;
    case 29: 
      return 5;
    case 30: 
      return 6;
    case 31: 
      return 7;
    case 32: 
      return 8;
    case 33: 
      return 9;
    case 34: 
      return 10;
    case 35: 
      return 11;
    case 36: 
      return 12;
    case 37: 
      return 13;
    case 38: 
      return 14;
    case 39: 
      return 15;
    case 40: 
      return 16;
    }
    return 0;
  }
  
  static CellArea a(String paramString, int paramInt1, int paramInt2)
  {
    int i = 0;
    CellArea localCellArea = new CellArea();
    char[] arrayOfChar = paramString.toCharArray();
    int j = -1;
    int k = -1;
    int m = -1;
    int n = -1;
    int i1 = 0;
    int i2 = 0;
    for (int i3 = 0; i3 < arrayOfChar.length; i3++) {
      switch (arrayOfChar[i3])
      {
      case 'R': 
      case 'r': 
        if (i3 + 1 < arrayOfChar.length) {
          switch (arrayOfChar[(i3 + 1)])
          {
          case '[': 
            i2 = i3 + 2;
            i3 += 2;
            while ((i3 < arrayOfChar.length) && (arrayOfChar[i3] != ']')) {
              i3++;
            }
            i1 = zp.a(paramString.substring(i2, i2 + (i3 - i2))) + paramInt1;
            break;
          default: 
            i2 = i3 + 1;
            i3++;
            while ((i3 < arrayOfChar.length) && (arrayOfChar[i3] != ':') && (arrayOfChar[i3] != 'c') && (arrayOfChar[i3] != 'C')) {
              i3++;
            }
            if (i3 != i2) {
              i1 = zp.a(paramString.substring(i2, i2 + (i3 - i2))) + paramInt1;
            } else {
              i1 = paramInt1;
            }
            i3--;
            break;
          }
        } else {
          i1 = paramInt1;
        }
        if (i != 0) {
          m = i1;
        } else {
          j = i1;
        }
        break;
      case 'C': 
      case 'c': 
        if (i3 + 1 < arrayOfChar.length) {
          switch (arrayOfChar[(i3 + 1)])
          {
          case '[': 
            i2 = i3 + 2;
            i3 += 2;
            while ((i3 < arrayOfChar.length) && (arrayOfChar[i3] != ']')) {
              i3++;
            }
            i1 = zp.a(paramString.substring(i2, i2 + (i3 - i2))) + paramInt2;
            break;
          default: 
            i2 = i3 + 1;
            i3++;
            while ((i3 < arrayOfChar.length) && (arrayOfChar[i3] != ':')) {
              i3++;
            }
            if (i3 != i2) {
              i1 = zp.a(paramString.substring(i2, i2 + (i3 - i2))) + paramInt2;
            } else {
              i1 = paramInt2;
            }
            i3--;
            break;
          }
        } else {
          i1 = paramInt2;
        }
        if (i != 0) {
          n = i1;
        } else {
          k = i1;
        }
        break;
      case ':': 
        i = 1;
      }
    }
    if (i != 0)
    {
      if (j == -1) {
        localCellArea = CellArea.createCellArea(j, 0, m, 16383);
      } else if (k == -1) {
        localCellArea = CellArea.createCellArea(0, k, 1048575, n);
      } else {
        localCellArea = CellArea.createCellArea(j, k, m, n);
      }
    }
    else if (j == -1) {
      localCellArea = CellArea.createCellArea(j, 0, j, 16383);
    } else if (k == -1) {
      localCellArea = CellArea.createCellArea(0, k, 1048575, k);
    } else {
      localCellArea = CellArea.createCellArea(j, k, j, k);
    }
    return localCellArea;
  }
  
  static CellArea f(String paramString)
  {
    CellArea localCellArea = new CellArea();
    paramString = paramString.toLowerCase();
    int i = paramString.indexOf('r');
    int j = paramString.indexOf('c');
    if ((i == -1) || (j == -1))
    {
      localCellArea = g(paramString);
    }
    else
    {
      String[] arrayOfString = zw.d(paramString, ':');
      int m = 0;
      int n = 0;
      int[] arrayOfInt1 = { n };
      int[] arrayOfInt2 = { m };
      a(arrayOfString[0], arrayOfInt1, arrayOfInt2);
      n = arrayOfInt1[0];
      m = arrayOfInt2[0];
      localCellArea.StartRow = n;
      localCellArea.StartColumn = m;
      if (arrayOfString.length == 1)
      {
        localCellArea.EndRow = localCellArea.StartRow;
        localCellArea.EndColumn = localCellArea.StartColumn;
      }
      else
      {
        n = 0;
        arrayOfInt1 = new int[] { n };
        arrayOfInt2 = new int[] { m };
        a(arrayOfString[1], arrayOfInt1, arrayOfInt2);
        n = arrayOfInt1[0];
        m = arrayOfInt2[0];
        localCellArea.EndRow = n;
        localCellArea.EndColumn = m;
      }
    }
    int k;
    if (localCellArea.StartRow > localCellArea.EndRow)
    {
      k = localCellArea.StartRow;
      localCellArea.StartRow = localCellArea.EndRow;
      localCellArea.EndRow = k;
    }
    if (localCellArea.StartColumn > localCellArea.EndColumn)
    {
      k = localCellArea.StartColumn;
      localCellArea.StartColumn = localCellArea.EndColumn;
      localCellArea.EndColumn = k;
    }
    return localCellArea;
  }
  
  private static CellArea g(String paramString)
  {
    CellArea localCellArea = new CellArea();
    paramString = paramString.toLowerCase();
    int i = paramString.indexOf('r');
    int j = paramString.indexOf('c');
    String[] arrayOfString;
    if ((i != -1) && (j == -1))
    {
      arrayOfString = zw.d(paramString, ':');
      localCellArea.StartRow = (h(arrayOfString[0]) - 1);
      if (arrayOfString.length == 1) {
        localCellArea.EndRow = localCellArea.StartRow;
      } else {
        localCellArea.EndRow = (h(arrayOfString[1]) - 1);
      }
      localCellArea.StartColumn = 0;
      localCellArea.EndColumn = 255;
    }
    else if ((j != -1) && (i == -1))
    {
      arrayOfString = zw.d(paramString, ':');
      localCellArea.StartColumn = (h(arrayOfString[0]) - 1);
      if (arrayOfString.length == 1) {
        localCellArea.EndColumn = localCellArea.StartColumn;
      } else {
        localCellArea.EndColumn = (h(arrayOfString[1]) - 1);
      }
      localCellArea.StartRow = 0;
      localCellArea.EndRow = 65535;
    }
    return localCellArea;
  }
  
  static void a(String paramString, ArrayList paramArrayList)
  {
    String[] arrayOfString = zw.d(paramString, ',');
    for (int i = 0; i < arrayOfString.length; i++)
    {
      String str = arrayOfString[i].trim();
      if (str.length() > 0)
      {
        CellArea localCellArea = f(str);
        zf.a(paramArrayList, localCellArea);
      }
    }
  }
  
  private static int h(String paramString)
  {
    int i = 0;
    int j = 0;
    int k = paramString.length();
    for (int m = 0; m < paramString.length(); m++)
    {
      int n = paramString.charAt(m);
      if ((n >= 48) && (n <= 57))
      {
        if (i == 0)
        {
          i = 1;
          j = m;
        }
        k = m;
      }
      else
      {
        if (i != 0) {
          break;
        }
      }
    }
    m = 1;
    if (i != 0)
    {
      String str = paramString.substring(j, j + (k - j + 1));
      m = zp.a(str);
    }
    return m;
  }
  
  static void a(String paramString, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    paramArrayOfInt1[0] = 0;
    paramArrayOfInt2[0] = 0;
    int i = -1;
    int j = -1;
    int k = -1;
    for (int m = 0; m < paramString.length(); m++)
    {
      int n = paramString.charAt(m);
      if ((n == 82) || (n == 114)) {
        i = m;
      } else if ((n == 67) || (n == 99)) {
        j = m;
      } else if ((n > 57) || (n < 48)) {
        k = m;
      } else if (m == paramString.length() - 1) {
        k = m + 1;
      }
      if ((i != -1) && (j - i > 1) && (k - j > 1))
      {
        paramArrayOfInt1[0] = (zp.a(paramString.substring(i + 1, i + 1 + (j - i - 1))) - 1);
        paramArrayOfInt2[0] = (zp.a(paramString.substring(j + 1, j + 1 + (k - j - 1))) - 1);
      }
      if (k != -1) {
        i = k = j = -1;
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbek.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */