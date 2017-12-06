package com.aspose.cells;

import com.aspose.cells.b.a.g.a.zc;
import com.aspose.cells.b.a.zs;

class zgd
{
  static int a(char[] paramArrayOfChar)
  {
    int i = 0;
    for (int j = 0; j < paramArrayOfChar.length; j++) {
      i += a(paramArrayOfChar[j]);
    }
    return i;
  }
  
  static int a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    int i = 0;
    while (paramInt1 < paramInt2)
    {
      i += a(paramArrayOfChar[paramInt1]);
      paramInt1++;
    }
    return i;
  }
  
  static String a(String paramString, int paramInt1, int paramInt2)
  {
    if ((paramString.length() < 1) || (paramInt2 < 1)) {
      return "";
    }
    return b(paramString.toCharArray(), paramInt1, paramInt2);
  }
  
  static String b(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if ((paramArrayOfChar.length < 1) || (paramInt2 < 1)) {
      return "";
    }
    paramInt1--;
    for (int j = 0; j < paramArrayOfChar.length; j++)
    {
      int i = a(paramArrayOfChar[j]);
      paramInt1 -= i;
      if (paramInt1 < 0)
      {
        char c = paramArrayOfChar[j];
        if (i == 1)
        {
          if (paramInt2 < 2) {
            return Character.toString(paramArrayOfChar[j]);
          }
          paramInt2--;
        }
        else
        {
          if (paramInt2 < 2) {
            return " ";
          }
          if (paramInt1 == -2)
          {
            if (paramInt2 < 3) {
              return Character.toString(paramArrayOfChar[j]);
            }
            paramInt2 -= 2;
          }
          else
          {
            c = ' ';
            paramInt2--;
          }
        }
        StringBuilder localStringBuilder = new StringBuilder(paramInt2);
        localStringBuilder.append(c);
        j++;
        while (j < paramArrayOfChar.length)
        {
          paramInt2 -= a(paramArrayOfChar[j]);
          if (paramInt2 < 0)
          {
            localStringBuilder.append(' ');
            return zs.a(localStringBuilder);
          }
          localStringBuilder.append(paramArrayOfChar[j]);
          if (paramInt2 == 0) {
            return zs.a(localStringBuilder);
          }
          j++;
        }
        return zs.a(localStringBuilder);
      }
    }
    return "";
  }
  
  static String a(String paramString, int paramInt)
  {
    char[] arrayOfChar = paramString.toCharArray();
    int i = a(arrayOfChar);
    if (i < paramInt) {
      return paramString;
    }
    return a(paramString, i - paramInt + 1, paramInt);
  }
  
  static String a(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    StringBuilder localStringBuilder = new StringBuilder(paramString1.length() + paramString2.length());
    char[] arrayOfChar = paramString1.toCharArray();
    paramInt1--;
    for (int j = 0; j < arrayOfChar.length; j++)
    {
      int i = a(arrayOfChar[j]);
      paramInt1 -= i;
      if (paramInt1 < 0)
      {
        if (i == 1)
        {
          paramInt2--;
        }
        else if (paramInt1 == -2)
        {
          paramInt2 -= 2;
        }
        else
        {
          localStringBuilder.append(' ');
          paramInt2--;
        }
        if (paramInt2 <= 0)
        {
          if (paramInt2 < 0) {
            localStringBuilder.append(' ');
          }
          localStringBuilder.append(paramString2);
          localStringBuilder.append(arrayOfChar, j + 1, arrayOfChar.length - j - 1);
          return zs.a(localStringBuilder);
        }
        j++;
        while (j < arrayOfChar.length)
        {
          paramInt2 -= a(arrayOfChar[j]);
          if (paramInt2 <= 0)
          {
            if (paramInt2 < 0) {
              localStringBuilder.append(' ');
            }
            localStringBuilder.append(paramString2);
            localStringBuilder.append(arrayOfChar, j + 1, arrayOfChar.length - j - 1);
            return zs.a(localStringBuilder);
          }
          j++;
        }
      }
      localStringBuilder.append(arrayOfChar[j]);
    }
    localStringBuilder.append(paramString2);
    return zs.a(localStringBuilder);
  }
  
  static zaie a(String paramString1, String paramString2, int paramInt)
  {
    if (paramInt >= paramString2.length()) {
      return zabc.f;
    }
    Object localObject = zbsn.a(paramString1, true, false);
    if (localObject != null)
    {
      if ((localObject instanceof com.aspose.cells.b.a.g.a.ze))
      {
        zc localzc = ((com.aspose.cells.b.a.g.a.ze)localObject).a(paramString2);
        if (localzc.c()) {
          return new zabb(localzc.d() + 1.0D);
        }
        return zabc.f;
      }
      paramString1 = (String)localObject;
    }
    int i = paramString2.toUpperCase().indexOf(paramString1.toUpperCase(), paramInt);
    if (i > -1) {
      return new zabb(i + 1.0D);
    }
    return zabc.f;
  }
  
  static zaie b(String paramString1, String paramString2, int paramInt)
  {
    char[] arrayOfChar1 = paramString1.toCharArray();
    char[] arrayOfChar2 = paramString2.toCharArray();
    if (paramInt + a(arrayOfChar1) - 1 > a(arrayOfChar2)) {
      return zabc.f;
    }
    if (arrayOfChar1.length == 0) {
      return new zabb(paramInt);
    }
    int i = arrayOfChar2.length;
    int j = arrayOfChar1.length;
    int[] arrayOfInt = new int[j];
    j--;
    int k = 0;
    int m = -1;
    arrayOfInt[0] = -1;
    while (k < j) {
      if ((m == -1) || (arrayOfChar1[m] == '?') || (arrayOfChar1[k] == arrayOfChar1[m]))
      {
        k++;
        m++;
        arrayOfInt[k] = m;
      }
      else
      {
        m = arrayOfInt[m];
      }
    }
    j++;
    k = paramInt - 1;
    m = 0;
    while ((k < i) && (m < j)) {
      if ((m == -1) || (arrayOfChar1[m] == '?') || (arrayOfChar2[k] == arrayOfChar1[m]))
      {
        k++;
        m++;
      }
      else
      {
        m = arrayOfInt[m];
      }
    }
    if (m >= j) {
      return new zabb(a(arrayOfChar2, 0, k - j) + 1);
    }
    return zabc.f;
  }
  
  static String a(String paramString)
  {
    char[] arrayOfChar = paramString.toCharArray();
    int i = 0;
    for (int j = 0; j < arrayOfChar.length; j++)
    {
      char c = arrayOfChar[j];
      if (Character.isLetter(c))
      {
        if (Character.isUpperCase(c))
        {
          if (i != 0) {
            arrayOfChar[j] = Character.toLowerCase(c);
          } else {
            arrayOfChar[j] = c;
          }
        }
        else if (Character.isLowerCase(c)) {
          if (i != 0) {
            arrayOfChar[j] = c;
          } else {
            arrayOfChar[j] = Character.toUpperCase(c);
          }
        }
        i = 1;
      }
      else
      {
        i = 0;
      }
    }
    return new String(arrayOfChar);
  }
  
  static String b(String paramString)
  {
    if (paramString.equals("")) {
      return paramString;
    }
    char[] arrayOfChar;
    int i;
    int j;
    label65:
    int k;
    if (paramString.charAt(0) == ' ')
    {
      arrayOfChar = paramString.toCharArray();
      for (i = 1; i < arrayOfChar.length; i++) {
        if (arrayOfChar[i] != ' ')
        {
          arrayOfChar[0] = arrayOfChar[i];
          j = 1;
          i++;
          break label65;
        }
      }
      return "";
      k = 0;
    }
    else if (paramString.charAt(paramString.length() - 1) == ' ')
    {
      arrayOfChar = paramString.toCharArray();
      while (arrayOfChar[(i++)] != ' ') {}
      j = i - 1;
      k = 1;
    }
    else
    {
      j = paramString.indexOf("  ");
      if (j < 0) {
        return paramString;
      }
      i = j + 2;
      k = 1;
      arrayOfChar = paramString.toCharArray();
    }
    while (i < arrayOfChar.length)
    {
      if (arrayOfChar[i] == ' ')
      {
        k = 1;
      }
      else
      {
        if (k != 0)
        {
          arrayOfChar[(j++)] = ' ';
          k = 0;
        }
        arrayOfChar[(j++)] = arrayOfChar[i];
      }
      i++;
    }
    if (j == arrayOfChar.length) {
      return paramString;
    }
    return new String(arrayOfChar, 0, j);
  }
  
  static String c(String paramString)
  {
    char[] arrayOfChar = paramString.toCharArray();
    int i = 0;
    int j = 0;
    for (int k = 0; k < arrayOfChar.length; k++) {
      if (arrayOfChar[k] > '\037') {
        switch (arrayOfChar[k])
        {
        case '': 
        case '': 
        case '': 
        case '': 
        case '': 
        case '': 
          j = 1;
          break;
        default: 
          if (j != 0) {
            arrayOfChar[i] = arrayOfChar[k];
          }
          i++;
          break;
        }
      } else {
        j = 1;
      }
    }
    if (j != 0) {
      return new String(arrayOfChar, 0, i);
    }
    return paramString;
  }
  
  static String a(int paramInt1, int paramInt2)
  {
    char[] arrayOfChar1 = { 'M', 'D', 'C', 'L', 'X', 'V', 'I' };
    int i = 1000;
    char[] arrayOfChar2 = new char['Ā'];
    int m = i;
    int k;
    int j = k = 0;
    while (m > 1)
    {
      for (;;)
      {
        if (paramInt1 >= m)
        {
          arrayOfChar2[(j++)] = arrayOfChar1[k];
          paramInt1 -= m;
        }
        else if (paramInt1 >= m - m / 10)
        {
          arrayOfChar2[(j++)] = arrayOfChar1[(k + 2)];
          arrayOfChar2[(j++)] = arrayOfChar1[k];
          paramInt1 -= m - m / 10;
        }
        else if (paramInt1 >= m / 2)
        {
          arrayOfChar2[(j++)] = arrayOfChar1[(k + 1)];
          paramInt1 -= m / 2;
        }
        else if (paramInt1 >= m / 2 - m / 10)
        {
          arrayOfChar2[(j++)] = arrayOfChar1[(k + 2)];
          arrayOfChar2[(j++)] = arrayOfChar1[(k + 1)];
          paramInt1 -= m / 2 - m / 10;
        }
        else
        {
          if (m != 10) {
            break;
          }
          arrayOfChar2[(j++)] = arrayOfChar1[(k + 2)];
          paramInt1--;
        }
        if (paramInt1 <= 0) {
          break;
        }
      }
      if (paramInt1 <= 0) {
        break;
      }
      m /= 10;
      k += 2;
    }
    StringBuilder localStringBuilder = new StringBuilder(j);
    localStringBuilder.append(arrayOfChar2, 0, j);
    if (paramInt2 > 0)
    {
      com.aspose.cells.b.a.g.ze.a(localStringBuilder, "XLV", "VL");
      com.aspose.cells.b.a.g.ze.a(localStringBuilder, "XCV", "VC");
      com.aspose.cells.b.a.g.ze.a(localStringBuilder, "CDL", "LD");
      com.aspose.cells.b.a.g.ze.a(localStringBuilder, "CML", "LM");
      com.aspose.cells.b.a.g.ze.a(localStringBuilder, "CMVC", "LMVL");
    }
    if (paramInt2 == 1)
    {
      com.aspose.cells.b.a.g.ze.a(localStringBuilder, "CDXC", "LDXL");
      com.aspose.cells.b.a.g.ze.a(localStringBuilder, "CDVC", "LDVL");
      com.aspose.cells.b.a.g.ze.a(localStringBuilder, "CMXC", "LMXL");
      com.aspose.cells.b.a.g.ze.a(localStringBuilder, "XCIX", "VCIV");
      com.aspose.cells.b.a.g.ze.a(localStringBuilder, "XLIX", "VLIV");
    }
    if (paramInt2 > 1)
    {
      com.aspose.cells.b.a.g.ze.a(localStringBuilder, "XLIX", "IL");
      com.aspose.cells.b.a.g.ze.a(localStringBuilder, "XCIX", "IC");
      com.aspose.cells.b.a.g.ze.a(localStringBuilder, "CDXC", "XD");
      com.aspose.cells.b.a.g.ze.a(localStringBuilder, "CDVC", "XDV");
      com.aspose.cells.b.a.g.ze.a(localStringBuilder, "CDIC", "XDIX");
      com.aspose.cells.b.a.g.ze.a(localStringBuilder, "LMVL", "XMV");
      com.aspose.cells.b.a.g.ze.a(localStringBuilder, "CMIC", "XMIX");
      com.aspose.cells.b.a.g.ze.a(localStringBuilder, "CMXC", "XM");
    }
    if (paramInt2 > 2)
    {
      com.aspose.cells.b.a.g.ze.a(localStringBuilder, "XDV", "VD");
      com.aspose.cells.b.a.g.ze.a(localStringBuilder, "XDIX", "VDIV");
      com.aspose.cells.b.a.g.ze.a(localStringBuilder, "XMV", "VM");
      com.aspose.cells.b.a.g.ze.a(localStringBuilder, "XMIX", "VMIV");
    }
    if (paramInt2 == 4)
    {
      com.aspose.cells.b.a.g.ze.a(localStringBuilder, "VDIV", "ID");
      com.aspose.cells.b.a.g.ze.a(localStringBuilder, "VMIV", "IM");
    }
    return zs.a(localStringBuilder);
  }
  
  private static int a(char paramChar)
  {
    if (paramChar > '') {
      return 2;
    }
    return 1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zgd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */