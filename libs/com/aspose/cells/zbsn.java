package com.aspose.cells;

import com.aspose.cells.b.a.d.za;
import com.aspose.cells.b.a.g.a.ze;
import com.aspose.cells.b.a.zs;

class zbsn
{
  static boolean a(String paramString)
  {
    return (paramString == null) || ("".equals(paramString));
  }
  
  static int a(char[] paramArrayOfChar1, char[] paramArrayOfChar2, int paramInt1, int paramInt2)
  {
    while ((paramInt1 < paramArrayOfChar1.length) && ((paramArrayOfChar1[paramInt1] == '*') || (paramArrayOfChar1[paramInt1] == '?'))) {
      paramInt1++;
    }
    if (paramInt1 >= paramArrayOfChar1.length) {
      return paramArrayOfChar2.length - 1;
    }
    while (paramInt2 < paramArrayOfChar2.length)
    {
      if (paramArrayOfChar1[paramInt1] == paramArrayOfChar2[paramInt2])
      {
        int i = 1;
        int j = paramInt2 + 1;
        int k = paramInt1 + 1;
        while (k < paramArrayOfChar1.length)
        {
          if (paramArrayOfChar1[k] == '*')
          {
            if (k + 1 == paramArrayOfChar1.length) {
              return paramArrayOfChar2.length - 1;
            }
            return a(paramArrayOfChar1, paramArrayOfChar2, k + 1, j);
          }
          if (j >= paramArrayOfChar2.length) {
            return j;
          }
          if (paramArrayOfChar1[k] != paramArrayOfChar2[j])
          {
            i = 0;
            break;
          }
          k++;
          j++;
        }
        if (i != 0) {
          return j - 1;
        }
      }
      paramInt2++;
    }
    return paramInt2;
  }
  
  public static int a(String paramString1, String paramString2, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      paramString1 = paramString1.toUpperCase();
      paramString2 = paramString2.toUpperCase();
    }
    char[] arrayOfChar1 = paramString1.toCharArray();
    char[] arrayOfChar2 = paramString2.toCharArray();
    int i = arrayOfChar1.length;
    int j = arrayOfChar2.length;
    int k = 0;
    for (int m = 0; k < i; m++)
    {
      if (m >= j)
      {
        if ((arrayOfChar1[k] == '*') && (k + 1 == i)) {
          return 0;
        }
        return 1;
      }
      switch (arrayOfChar1[k])
      {
      case '~': 
        if ((k + 1 < i) && ((arrayOfChar1[(k + 1)] == '*') || (arrayOfChar1[(k + 1)] == '?'))) {
          k++;
        }
        if (arrayOfChar1[k] > arrayOfChar2[m]) {
          return 1;
        }
        if (arrayOfChar1[k] < arrayOfChar2[m]) {
          return -1;
        }
        break;
      case '?': 
        break;
      case '*': 
        if (k + 1 == i) {
          return 0;
        }
        if (arrayOfChar1[(k + 1)] == '*')
        {
          m--;
        }
        else
        {
          m = a(arrayOfChar1, arrayOfChar2, k + 1, m);
          if (m >= j) {
            return 1;
          }
          if (m == j - 1) {
            return 0;
          }
          return -1;
        }
        break;
      default: 
        if (arrayOfChar1[k] > arrayOfChar2[m]) {
          return 1;
        }
        if (arrayOfChar1[k] < arrayOfChar2[m]) {
          return -1;
        }
        break;
      }
      k++;
    }
    if (m < j) {
      return -1;
    }
    return 0;
  }
  
  static String a(za paramza, int paramInt, boolean paramBoolean)
    throws Exception
  {
    if (paramBoolean)
    {
      arrayOfByte = paramza.f(paramInt * 2);
      return Encoding.getUnicode().a(arrayOfByte);
    }
    byte[] arrayOfByte = paramza.f(paramInt);
    return Encoding.getASCII().a(arrayOfByte);
  }
  
  private static boolean[] a(char[] paramArrayOfChar)
  {
    int i = 0;
    for (int j = 0; j < paramArrayOfChar.length; j++) {
      switch (paramArrayOfChar[j])
      {
      case '*': 
      case '?': 
        return new boolean[] { true, false };
      case '~': 
        if ((j + 1 < paramArrayOfChar.length) && ((paramArrayOfChar[(j + 1)] == '*') || (paramArrayOfChar[(j + 1)] == '?')))
        {
          i = 1;
          j++;
        }
        break;
      }
    }
    return new boolean[] { false, i };
  }
  
  public static Object a(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    char[] arrayOfChar = paramString.toCharArray();
    boolean[] arrayOfBoolean = a(arrayOfChar);
    int i = arrayOfBoolean[0];
    int j = arrayOfBoolean[1];
    StringBuilder localStringBuilder;
    int k;
    if (i != 0)
    {
      localStringBuilder = new StringBuilder(arrayOfChar.length + arrayOfChar.length / 2);
      if ((paramBoolean2) && (arrayOfChar[0] != '*')) {
        localStringBuilder.append('^');
      }
      for (k = 0; k < arrayOfChar.length; k++) {
        switch (arrayOfChar[k])
        {
        case '*': 
          if ((k == 0) || (arrayOfChar[(k - 1)] != '*'))
          {
            localStringBuilder.append('.');
            localStringBuilder.append(arrayOfChar[k]);
          }
          break;
        case '?': 
          localStringBuilder.append('.');
          break;
        case '$': 
        case '(': 
        case ')': 
        case '+': 
        case '.': 
        case '[': 
        case '\\': 
        case ']': 
        case '^': 
        case '{': 
        case '|': 
        case '}': 
          localStringBuilder.append('\\');
          localStringBuilder.append(arrayOfChar[k]);
          break;
        default: 
          localStringBuilder.append(arrayOfChar[k]);
        }
      }
      if ((paramBoolean2) && (arrayOfChar[(arrayOfChar.length - 1)] != '*')) {
        localStringBuilder.append('$');
      }
      return new ze(zs.a(localStringBuilder), paramBoolean1 ? 66 : 0);
    }
    if (j != 0)
    {
      localStringBuilder = new StringBuilder(arrayOfChar.length);
      for (k = 0; k < arrayOfChar.length; k++) {
        switch (arrayOfChar[k])
        {
        case '~': 
          if ((k + 1 < arrayOfChar.length) && ((arrayOfChar[(k + 1)] == '*') || (arrayOfChar[(k + 1)] == '?')))
          {
            k++;
            localStringBuilder.append(arrayOfChar[k]);
          }
          break;
        }
      }
      return zs.a(localStringBuilder);
    }
    return null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbsn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */