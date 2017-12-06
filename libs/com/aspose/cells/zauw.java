package com.aspose.cells;

import com.aspose.cells.b.a.zn;
import com.aspose.cells.b.a.zs;
import java.util.ArrayList;

class zauw
{
  static String[] a(String paramString)
  {
    String[] arrayOfString = new String[3];
    int i = 1;
    int j = 0;
    for (int k = 0; k < paramString.length(); k++) {
      if ((paramString.charAt(k) == '&') && (k + 1 < paramString.length()))
      {
        int m;
        switch (paramString.charAt(k + 1))
        {
        case 'L': 
        case 'l': 
          m = 0;
          break;
        case 'C': 
        case 'c': 
          m = 1;
          break;
        case 'R': 
        case 'r': 
          m = 2;
          break;
        }
        if (k - j > 0) {
          arrayOfString[i] = paramString.substring(j, j + (k - j));
        }
        i = m;
        j = k + 2;
      }
    }
    if (j < paramString.length()) {
      arrayOfString[i] = paramString.substring(j);
    }
    return arrayOfString;
  }
  
  public static String a(Color paramColor)
  {
    StringBuilder localStringBuilder = new StringBuilder(8);
    localStringBuilder.append('#');
    localStringBuilder.append(com.aspose.cells.a.c.zp.b(paramColor.getR() & 0xFF));
    localStringBuilder.append(com.aspose.cells.a.c.zp.b(paramColor.getG() & 0xFF));
    localStringBuilder.append(com.aspose.cells.a.c.zp.b(paramColor.getB() & 0xFF));
    return zs.a(localStringBuilder);
  }
  
  public static String a(Cell paramCell)
  {
    zayh localzayh = new zayh(paramCell.d.p());
    return localzayh.a(paramCell);
  }
  
  public static String[] a(FormatCondition paramFormatCondition)
  {
    paramFormatCondition.f();
    zayh localzayh = new zayh(paramFormatCondition.a.a.a.c());
    int i = paramFormatCondition.a.getRangeCount();
    if (i == 0) {
      return null;
    }
    int[] arrayOfInt = paramFormatCondition.a.e();
    int j = arrayOfInt[0];
    int k = arrayOfInt[1];
    String[] arrayOfString = new String[2];
    byte[] arrayOfByte;
    if (paramFormatCondition.a() != null)
    {
      arrayOfByte = (byte[])paramFormatCondition.a();
      arrayOfString[0] = localzayh.a(-1, arrayOfByte, j, k, true);
    }
    if ((paramFormatCondition.c() != null) && ((paramFormatCondition.getOperator() == 0) || (paramFormatCondition.getOperator() == 7)))
    {
      arrayOfByte = (byte[])paramFormatCondition.c();
      arrayOfString[1] = localzayh.a(-1, arrayOfByte, j, k, true);
    }
    return arrayOfString;
  }
  
  public static String[] a(Validation paramValidation, Worksheet paramWorksheet)
  {
    zayh localzayh = new zayh(paramWorksheet.c());
    int i = paramValidation.getAreaList().size();
    if (i == 0) {
      return null;
    }
    int j = 0;
    int k = 0;
    int[] arrayOfInt = paramValidation.b();
    j = arrayOfInt[0];
    k = arrayOfInt[1];
    String[] arrayOfString = new String[2];
    byte[] arrayOfByte;
    if (paramValidation.c != null)
    {
      arrayOfByte = (byte[])paramValidation.c;
      arrayOfString[0] = localzayh.a(0, arrayOfByte, j, k, true);
    }
    if (paramValidation.d != null)
    {
      arrayOfByte = (byte[])paramValidation.d;
      arrayOfString[1] = localzayh.a(0, arrayOfByte, j, k, true);
    }
    return arrayOfString;
  }
  
  public static String a(String paramString, int paramInt1, int paramInt2)
  {
    if (paramString.startsWith("=#"))
    {
      if (paramString.startsWith("=#NULL!")) {
        return "=#NULL!";
      }
      if (paramString.startsWith("=#DIV/0!")) {
        return "=#DIV/0!";
      }
      if (paramString.startsWith("=#VALUE!")) {
        return "=#VALUE!";
      }
      if (paramString.startsWith("=#REF!")) {
        return "=#REF!";
      }
      if (paramString.startsWith("=#NAME?")) {
        return "=#NAME?";
      }
      if (paramString.startsWith("=#NUM!")) {
        return "=#NUM!";
      }
      if (paramString.startsWith("=#N/A")) {
        return "=#N/A";
      }
    }
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    int j = -1;
    for (int k = 0; k < paramString.length(); k++)
    {
      char c1 = paramString.charAt(k);
      if (c1 == '"')
      {
        k++;
        while ((k < paramString.length()) && (paramString.charAt(k) != '"')) {
          k++;
        }
      }
      if (Character.isDigit(c1))
      {
        int m = 0;
        int n = i;
        int i1 = paramString.length() - 1;
        for (int i2 = k + 1; i2 < paramString.length(); i2++)
        {
          char c2 = paramString.charAt(i2);
          if (!Character.isDigit(c2))
          {
            if (c2 == '!') {
              m = 1;
            }
            i1 = i2 - 1;
            break;
          }
        }
        if (m != 0)
        {
          localStringBuilder.append(paramString, i, i + (i1 - i + 2));
          i = i1 + 2;
          k = i1 + 1;
          j = k;
          m = 0;
        }
        else
        {
          for (i2 = k - 1; (i2 >= 0) && ((zn.a(paramString, i2)) || (paramString.charAt(i2) == '$')); i2--) {
            n = i2;
          }
          if (n != i) {
            a(localStringBuilder, paramString, i, n - 1);
          }
          if (((n > 0) && (paramString.charAt(n - 1) == '_')) || ((i1 < paramString.length() - 1) && (paramString.charAt(i1 + 1) == '_'))) {
            localStringBuilder.append(paramString, n, n + (i1 - n + 1));
          } else {
            a(localStringBuilder, paramString, n, i1, paramInt1, paramInt2);
          }
          k = i1;
          i = i1 + 1;
          j = i1;
        }
      }
    }
    k = paramString.length();
    if (j != paramString.length() - 1) {
      a(localStringBuilder, paramString, j + 1, paramString.length() - 1);
    }
    return zs.a(localStringBuilder);
  }
  
  private static void a(StringBuilder paramStringBuilder, String paramString, int paramInt1, int paramInt2)
  {
    for (int i = paramInt1; i <= paramInt2; i++) {
      if ((paramString.charAt(i) == '$') && (i != paramInt2) && (Character.isLetter(paramString.charAt(i + 1))))
      {
        int j = paramInt2;
        for (int k = i + 2; k <= paramInt2; k++) {
          if (!Character.isLetter(paramString.charAt(k)))
          {
            j = k - 1;
            break;
          }
        }
        k = c(paramString, i + 1, j);
        paramStringBuilder.append('C');
        paramStringBuilder.append(k + 1);
        i = j;
      }
      else
      {
        paramStringBuilder.append(paramString.charAt(i));
      }
    }
  }
  
  private static void a(StringBuilder paramStringBuilder, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = 0;
    int j = paramString.charAt(paramInt1) == '$' ? 1 : 0;
    if (j != 0) {
      paramInt1++;
    }
    if ((j != 0) && (Character.isDigit(paramString.charAt(paramInt1))))
    {
      paramStringBuilder.append('R');
      paramStringBuilder.append(paramString, paramInt1, paramInt1 + (paramInt2 - paramInt1 + 1));
      return;
    }
    if (!Character.isLetter(paramString.charAt(paramInt1)))
    {
      a(paramStringBuilder, paramString, paramInt1, paramInt2);
      return;
    }
    int k = -1;
    int m = -1;
    for (int n = paramInt1 + 1; n <= paramInt2; n++)
    {
      char c = paramString.charAt(n);
      if (Character.isDigit(c))
      {
        k = n - 1;
        m = n;
        break;
      }
      if (c == '$')
      {
        k = n - 1;
        i = 1;
        m = n + 1;
        break;
      }
    }
    if ((k == -1) || (m == -1) || (m > paramInt2) || (k - paramInt1 >= 3))
    {
      a(paramStringBuilder, paramString, paramInt1, paramInt2);
      return;
    }
    paramStringBuilder.append('R');
    n = com.aspose.cells.b.a.zp.a(paramString.substring(m, m + (paramInt2 - m + 1)));
    if ((i != 0) || (paramInt3 == -1))
    {
      paramStringBuilder.append(n);
    }
    else
    {
      paramStringBuilder.append('[');
      paramStringBuilder.append(n - paramInt3 - 1);
      paramStringBuilder.append(']');
    }
    paramStringBuilder.append('C');
    int i1 = c(paramString, paramInt1, k);
    if ((j != 0) || (paramInt4 == -1))
    {
      paramStringBuilder.append(i1 + 1);
    }
    else
    {
      paramStringBuilder.append('[');
      paramStringBuilder.append(i1 - paramInt4);
      paramStringBuilder.append(']');
    }
  }
  
  private static int c(String paramString, int paramInt1, int paramInt2)
  {
    if ((paramString == null) || (paramInt1 > paramInt2) || (paramInt2 - paramInt1 > 1))
    {
      if (!a) {
        throw new AssertionError("Invalid column: " + paramString.substring(paramInt1, paramInt1 + (paramInt2 - paramInt1 + 1)));
      }
      throw new IllegalStateException("Invalid column expression: " + paramString);
    }
    int i = paramInt1;
    int j = 0;
    while (i <= paramInt2)
    {
      int k = paramString.charAt(i);
      if ((k >= 65) && (k <= 90))
      {
        j = j * 26 + k - 65 + 1;
      }
      else if ((k >= 97) && (k <= 122))
      {
        j = j * 26 + k - 97 + 1;
      }
      else
      {
        if (!a) {
          throw new AssertionError("Invalid column: " + paramString.substring(paramInt1, paramInt1 + (paramInt2 - paramInt1 + 1)));
        }
        throw new IllegalStateException("Invalid column expression: " + paramString);
      }
      i++;
    }
    if (j > 0) {
      j--;
    }
    return j;
  }
  
  public static String b(String paramString, int paramInt1, int paramInt2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    int j = -1;
    for (int k = 0; k < paramString.length(); k++)
    {
      int m = paramString.charAt(k);
      switch (m)
      {
      case 34: 
        k++;
      case 39: 
      case 82: 
      case 114: 
      case 67: 
      case 99: 
        while (k < paramString.length())
        {
          m = paramString.charAt(k);
          if (m == 34)
          {
            if ((k + 1 < paramString.length()) && (paramString.charAt(k + 1) == '"')) {
              k++;
            }
          }
          else
          {
            k++;
            continue;
            k++;
            while (k < paramString.length())
            {
              m = paramString.charAt(k);
              if (m == 39)
              {
                if ((k + 1 < paramString.length()) && (paramString.charAt(k + 1) == '\'')) {
                  k++;
                }
              }
              else
              {
                k++;
                continue;
                if (k > 0)
                {
                  if (!Character.isLetter(paramString.charAt(k - 1))) {
                    switch (paramString.charAt(k - 1))
                    {
                    case '_': 
                      break;
                    }
                  }
                }
                else if ((k + 1 >= paramString.length()) || (!Character.isLetter(paramString.charAt(k + 1))) || (paramString.charAt(k + 1) == 'C') || (paramString.charAt(k + 1) == 'c'))
                {
                  if (k != i) {
                    localStringBuilder.append(paramString, i, i + (k - i));
                  }
                  int n = paramString.length() - 1;
                  boolean bool = false;
                  for (int i1 = k + 1; i1 < paramString.length(); i1++)
                  {
                    char c = paramString.charAt(i1);
                    if (c == '[')
                    {
                      bool = true;
                    }
                    else if (c == ']')
                    {
                      bool = false;
                    }
                    else if ((!bool) && (!Character.isLetterOrDigit(c)) && (c != '[') && (c != ']'))
                    {
                      n = i1 - 1;
                      break;
                    }
                  }
                  if (bool) {
                    d(paramString, paramInt1, paramInt2);
                  }
                  int[] arrayOfInt2 = { n };
                  b(localStringBuilder, paramString, k, arrayOfInt2, paramInt1, paramInt2);
                  n = arrayOfInt2[0];
                  k = n;
                  i = n + 1;
                  j = n;
                  break;
                  if ((k <= 0) || (!Character.isLetter(paramString.charAt(k - 1))))
                  {
                    int[] arrayOfInt1;
                    if ((k + 1 < paramString.length()) && ((Character.isDigit(paramString.charAt(k + 1))) || (paramString.charAt(k + 1) == '[')))
                    {
                      arrayOfInt1 = new int[] { k };
                      bool = a(localStringBuilder, paramString, i, arrayOfInt1, paramInt1, paramInt2);
                      k = arrayOfInt1[0];
                      if (bool)
                      {
                        i = k + 1;
                        j = k;
                      }
                    }
                    else if ((k + 2 < paramString.length()) && (paramString.charAt(k + 1) == ':') && (paramString.charAt(k + 2) == 'C'))
                    {
                      arrayOfInt1 = new int[] { k };
                      bool = a(localStringBuilder, paramString, i, arrayOfInt1, paramInt1, paramInt2);
                      k = arrayOfInt1[0];
                      if (bool)
                      {
                        i = k + 1;
                        j = k;
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    if (j != paramString.length() - 1) {
      localStringBuilder.append(paramString, j + 1, j + 1 + (paramString.length() - j - 1));
    }
    return zs.a(localStringBuilder);
  }
  
  private static boolean a(StringBuilder paramStringBuilder, String paramString, int paramInt1, int[] paramArrayOfInt, int paramInt2, int paramInt3)
  {
    int i = 0;
    int j = 0;
    int k = paramString.length() - 1;
    int m = paramString.length() - 1;
    int n = 0;
    for (int i1 = paramArrayOfInt[0] + 1; i1 < paramString.length(); i1++)
    {
      c = paramString.charAt(i1);
      if (c == '[')
      {
        i = 1;
        n = 1;
      }
      else if (c == ']')
      {
        i = 0;
      }
      else if (i == 0)
      {
        if ((c == ':') && (i1 + 1 < paramString.length()) && ((paramString.charAt(i1 + 1) == 'C') || (paramString.charAt(i1 + 1) == 'c')))
        {
          k = i1 - 1;
          i1++;
          j = 1;
        }
        else if ((!Character.isDigit(c)) && (c != '[') && (c != ']'))
        {
          m = i1 - 1;
          if (j != 0) {
            break;
          }
          k = i1 - 1;
          break;
        }
      }
    }
    if ((n == 0) && (j == 0) && (k + 1 < paramString.length())) {
      switch (paramString.charAt(k + 1))
      {
      case '.': 
        return false;
      }
    }
    if (paramInt1 != paramArrayOfInt[0]) {
      paramStringBuilder.append(paramString, paramInt1, paramInt1 + (paramArrayOfInt[0] - paramInt1));
    }
    i1 = j != 0 ? 2 : 1;
    char c = '\001';
    int i2 = 0;
    for (int i3 = 0; i3 < 2; i3++)
    {
      c = '\001';
      if (i3 == 1)
      {
        paramStringBuilder.append(':');
        if (j != 0)
        {
          paramArrayOfInt[0] = (k + 2);
          k = m;
        }
        else
        {
          CellsHelper.a(paramStringBuilder, i2);
          break;
        }
      }
      int i4 = paramArrayOfInt[0];
      if ((i4 != k) && (paramString.charAt(i4 + 1) == '[')) {
        c = '\000';
      }
      try
      {
        if ((c != 0) || (paramInt3 == -1))
        {
          if (i4 == k)
          {
            if (paramInt3 == -1) {
              paramStringBuilder.append('A');
            } else {
              CellsHelper.a(paramStringBuilder, paramInt3);
            }
          }
          else
          {
            paramStringBuilder.append('$');
            if (c != 0) {
              i2 = com.aspose.cells.b.a.zp.a(paramString.substring(i4 + 1, i4 + 1 + (k - i4))) - 1;
            } else {
              i2 = com.aspose.cells.b.a.zp.a(paramString.substring(i4 + 2, i4 + 2 + (k - i4 - 2))) - 1;
            }
            if ((i2 > 16383) || (i2 < 0)) {
              d(paramString, paramInt2, paramInt3);
            }
            CellsHelper.a(paramStringBuilder, i2);
          }
        }
        else
        {
          i2 = paramInt3 + com.aspose.cells.b.a.zp.a(paramString.substring(i4 + 2, i4 + 2 + (k - i4 - 2)));
          if ((i2 > 16383) || (i2 < 0)) {
            d(paramString, paramInt2, paramInt3);
          }
          CellsHelper.a(paramStringBuilder, i2);
        }
      }
      catch (Exception localException)
      {
        d(paramString, paramInt2, paramInt3);
      }
    }
    paramArrayOfInt[0] = m;
    return true;
  }
  
  private static void b(StringBuilder paramStringBuilder, String paramString, int paramInt1, int[] paramArrayOfInt, int paramInt2, int paramInt3)
  {
    int i = 1;
    int j = 1;
    int k = -1;
    for (int m = paramInt1; m <= paramArrayOfInt[0]; m++) {
      if ((paramString.charAt(m) == 'C') || (paramString.charAt(m) == 'c'))
      {
        k = m;
        break;
      }
    }
    m = paramInt1;
    int n;
    if (k == -1)
    {
      if ((paramArrayOfInt[0] + 1 == paramString.length()) || (paramString.charAt(paramArrayOfInt[0] + 1) != ':'))
      {
        if ((paramString.charAt(m + 1) == '[') || (m == paramArrayOfInt[0])) {
          i = 0;
        }
        n = 0;
        if ((i != 0) || (paramInt2 == -1))
        {
          paramStringBuilder.append('$');
          if (paramArrayOfInt[0] > m) {
            n = com.aspose.cells.b.a.zp.a(paramString.substring(m + 1, m + 1 + (paramArrayOfInt[0] - m)));
          }
          if ((n > 1048575) || (n < 1)) {
            d(paramString, paramInt2, paramInt3);
          }
          paramStringBuilder.append(n);
        }
        else
        {
          n = paramInt2 + 1;
          if (paramArrayOfInt[0] > m + 2) {
            n += com.aspose.cells.b.a.zp.a(paramString.substring(m + 2, m + 2 + (paramArrayOfInt[0] - m - 2)));
          }
          if ((n > 1048575) || (n < 1)) {
            d(paramString, paramInt2, paramInt3);
          }
          paramStringBuilder.append(n);
        }
        paramStringBuilder.append(':');
        if ((i != 0) || (paramInt2 == -1)) {
          paramStringBuilder.append('$');
        }
        paramStringBuilder.append(n);
      }
      else
      {
        for (n = 0; n < 2; n++)
        {
          int i1;
          if (n == 1)
          {
            paramStringBuilder.append(':');
            m = paramArrayOfInt[0] + 2;
            i1 = 0;
            for (int i2 = m + 1; i2 < paramString.length(); i2++)
            {
              char c = paramString.charAt(i2);
              if (c == '[')
              {
                i1 = 1;
              }
              else if (c == ']')
              {
                i1 = 0;
              }
              else if ((i1 == 0) && (!Character.isDigit(c)) && (c != '[') && (c != ']'))
              {
                paramArrayOfInt[0] = (i2 - 1);
                break;
              }
            }
            if (m > paramArrayOfInt[0]) {
              paramArrayOfInt[0] = (paramString.length() - 1);
            }
          }
          if ((paramString.charAt(m + 1) == '[') || (paramString.charAt(m + 1) == ':')) {
            i = 0;
          }
          if ((i != 0) || (paramInt2 == -1))
          {
            paramStringBuilder.append('$');
            i1 = 0;
            if (paramArrayOfInt[0] > m) {
              i1 = com.aspose.cells.b.a.zp.a(paramString.substring(m + 1, m + 1 + (paramArrayOfInt[0] - m)));
            }
            if ((i1 > 1048575) || (i1 < 1)) {
              d(paramString, paramInt2, paramInt3);
            }
            paramStringBuilder.append(i1);
          }
          else
          {
            i1 = paramInt2 + 1;
            if (paramArrayOfInt[0] > m + 2) {
              i1 += com.aspose.cells.b.a.zp.a(paramString.substring(m + 2, m + 2 + (paramArrayOfInt[0] - m - 2)));
            }
            if ((i1 > 1048575) || (i1 < 1)) {
              d(paramString, paramInt2, paramInt3);
            }
            paramStringBuilder.append(i1);
          }
        }
      }
      return;
    }
    if (paramString.charAt(m + 1) == '[') {
      i = 0;
    }
    if ((k != paramArrayOfInt[0]) && (paramString.charAt(k + 1) == '[')) {
      j = 0;
    }
    try
    {
      if (j != 0)
      {
        if (k == paramArrayOfInt[0])
        {
          if (paramInt3 == -1) {
            paramStringBuilder.append('A');
          } else {
            CellsHelper.a(paramStringBuilder, paramInt3);
          }
        }
        else
        {
          paramStringBuilder.append('$');
          n = com.aspose.cells.b.a.zp.a(paramString.substring(k + 1, k + 1 + (paramArrayOfInt[0] - k))) - 1;
          if ((n > 16383) || (n < 0)) {
            d(paramString, paramInt2, paramInt3);
          }
          CellsHelper.a(paramStringBuilder, n);
        }
      }
      else
      {
        n = paramInt3 + com.aspose.cells.b.a.zp.a(paramString.substring(k + 2, k + 2 + (paramArrayOfInt[0] - k - 2)));
        if ((n > 16383) || (n < 0)) {
          d(paramString, paramInt2, paramInt3);
        }
        CellsHelper.a(paramStringBuilder, n);
      }
      if (i != 0)
      {
        if (m + 1 == k)
        {
          if (paramInt2 == -1) {
            paramStringBuilder.append('1');
          } else {
            paramStringBuilder.append(paramInt2 + 1);
          }
        }
        else
        {
          paramStringBuilder.append('$');
          n = com.aspose.cells.b.a.zp.a(paramString.substring(m + 1, m + 1 + (k - m - 1)));
          if ((n > 1048576) || (n < 1)) {
            d(paramString, paramInt2, paramInt3);
          }
          paramStringBuilder.append(n);
        }
      }
      else
      {
        n = paramInt2 + com.aspose.cells.b.a.zp.a(paramString.substring(m + 2, m + 2 + (k - m - 3)));
        if ((n > 1048575) || (n < 0)) {
          d(paramString, paramInt2, paramInt3);
        }
        paramStringBuilder.append(n + 1);
      }
    }
    catch (Exception localException)
    {
      d(paramString, paramInt2, paramInt3);
    }
  }
  
  private static void d(String paramString, int paramInt1, int paramInt2)
  {
    throw new CellsException(5, "Invalid formula in cell " + CellsHelper.cellIndexToName(paramInt1, paramInt2) + ": " + paramString);
  }
  
  public static boolean b(String paramString)
  {
    return (paramString == null) || (paramString.length() == 0);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zauw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */