package com.aspose.cells;

import com.aspose.cells.a.c.zv;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zo;
import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class zbqd
{
  private static final za a = new za(new String[] { "px", "in", "cm" });
  
  static boolean a(Object paramObject)
  {
    if (paramObject == null) {
      return true;
    }
    if ((paramObject instanceof String)) {
      return "".equals((String)paramObject);
    }
    return false;
  }
  
  static String[] a(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    char[] arrayOfChar = paramString.toCharArray();
    StringBuilder localStringBuilder = new StringBuilder(arrayOfChar.length);
    int i = 0;
    int j = 0;
    for (int k = 0; k < arrayOfChar.length; k++)
    {
      switch (arrayOfChar[k])
      {
      case '"': 
        localStringBuilder.append(arrayOfChar[k]);
        k++;
      }
      while (k < arrayOfChar.length)
      {
        if (arrayOfChar[k] == '"')
        {
          localStringBuilder.append(arrayOfChar[k]);
          if ((k + 1 >= arrayOfChar.length) || (arrayOfChar[(k + 1)] != '"')) {
            break;
          }
          localStringBuilder.append(arrayOfChar[(k++)]);
        }
        else
        {
          localStringBuilder.append(arrayOfChar[k]);
        }
        k++;
        continue;
        localStringBuilder.append(arrayOfChar[k]);
        i = 1;
        k++;
        while (k < arrayOfChar.length)
        {
          localStringBuilder.append(arrayOfChar[k]);
          if (arrayOfChar[k] == ']')
          {
            i--;
            if (i == 0) {
              break;
            }
          }
          else if (arrayOfChar[k] == '[')
          {
            i++;
          }
          k++;
          continue;
          j++;
          if (j == 1)
          {
            zf.a(localArrayList, zs.a(localStringBuilder));
            localStringBuilder = new StringBuilder(arrayOfChar.length);
          }
          else
          {
            localStringBuilder.append(arrayOfChar[k]);
            k++;
            while (k < arrayOfChar.length)
            {
              localStringBuilder.append(arrayOfChar[k]);
              if (arrayOfChar[k] == ')')
              {
                i--;
                if (i == 1) {
                  break;
                }
              }
              else if (arrayOfChar[k] == '(')
              {
                i++;
              }
              k++;
              continue;
              zf.a(localArrayList, zs.a(localStringBuilder));
              localStringBuilder = new StringBuilder(arrayOfChar.length);
              break;
              zf.a(localArrayList, zs.a(localStringBuilder));
              localStringBuilder = new StringBuilder(arrayOfChar.length);
              break;
              localStringBuilder.append(arrayOfChar[k]);
            }
          }
        }
      }
    }
    if (localStringBuilder.length() != 0) {
      zf.a(localArrayList, zs.a(localStringBuilder));
    }
    String[] arrayOfString = new String[localArrayList.size()];
    for (int m = 0; m < arrayOfString.length; m++) {
      arrayOfString[m] = ((String)localArrayList.get(m));
    }
    return arrayOfString;
  }
  
  static int a(String[] paramArrayOfString, String paramString)
  {
    for (int i = 0; i < paramArrayOfString.length; i++) {
      if (zw.a(paramArrayOfString[i], paramString, true) == 0) {
        return i;
      }
    }
    return -1;
  }
  
  static String b(String paramString)
  {
    if ((paramString != null) && (paramString.length() > 2) && (paramString.charAt(0) == '[') && (paramString.charAt(paramString.length() - 1) == ']'))
    {
      paramString = paramString.substring(1, 1 + (paramString.length() - 2));
      if ((paramString == null) || ("".equals(paramString))) {
        return null;
      }
    }
    return paramString;
  }
  
  static int a(String paramString, int paramInt)
  {
    int i = -1;
    for (int j = paramString.length() - 1; j >= 0; j--) {
      if (!Character.isLetter(paramString.charAt(j)))
      {
        i = j + 1;
        break;
      }
    }
    if (i == -1) {
      return 0;
    }
    double d = 0.0D;
    String str = "pt";
    if (i == paramString.length())
    {
      d = zo.a(paramString);
    }
    else
    {
      d = zo.a(paramString.substring(0, 0 + i));
      str = paramString.substring(i);
    }
    switch (a.a(str.trim().toLowerCase()))
    {
    case 0: 
      return (int)d;
    case 1: 
      return (int)(d * paramInt + 0.5D);
    case 2: 
      return (int)(d * paramInt / 2.54D + 0.5D);
    }
    return (int)(d * paramInt / 72.0D + 0.5D);
  }
  
  static int a(ICellsDataTable paramICellsDataTable, zbqc paramzbqc, String[] paramArrayOfString)
  {
    int i = 0;
    Object localObject;
    if (paramArrayOfString.length == 1)
    {
      paramICellsDataTable.beforeFirst();
      while (paramICellsDataTable.next())
      {
        localObject = paramICellsDataTable.get(paramzbqc.t);
        if ((localObject instanceof Collection)) {
          i += ((Collection)localObject).size();
        }
      }
    }
    paramICellsDataTable.beforeFirst();
    while (paramICellsDataTable.next())
    {
      localObject = paramICellsDataTable.get(paramzbqc.t);
      i += zv.a(paramArrayOfString, localObject).size();
    }
    return i == 0 ? 1 : i;
  }
  
  static ICellsDataTable a(Collection paramCollection)
  {
    Iterator localIterator = paramCollection.iterator();
    if (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      Class localClass = localObject.getClass();
      return new zhv(paramCollection, localClass.getMethods());
    }
    return null;
  }
  
  static String a(String paramString, int paramInt1, int paramInt2)
  {
    StringBuilder localStringBuilder = new StringBuilder(paramString);
    for (int i = 0; i < localStringBuilder.length(); i++) {
      if (localStringBuilder.charAt(i) == '{') {
        if (((localStringBuilder.charAt(i + 1) == 'R') || (localStringBuilder.charAt(i + 1) == 'r')) && (localStringBuilder.charAt(i + 2) == '}'))
        {
          localStringBuilder.delete(i, i + 3);
          String str1 = zp.a(paramInt1 + 1);
          localStringBuilder.insert(i, str1);
        }
        else if (((localStringBuilder.charAt(i + 1) == 'C') || (localStringBuilder.charAt(i + 1) == 'c')) && (localStringBuilder.charAt(i + 2) == '}'))
        {
          localStringBuilder.delete(i, i + 3);
          localStringBuilder.insert(i, CellsHelper.columnIndexToName(paramInt2));
        }
        else
        {
          for (int j = i + 1; j < localStringBuilder.length(); j++) {
            if (((localStringBuilder.charAt(j) < '0') || (localStringBuilder.charAt(j) > '9')) && (localStringBuilder.charAt(j) != '+') && (localStringBuilder.charAt(j) != '-'))
            {
              if (localStringBuilder.charAt(j) != '}') {
                break;
              }
              int k;
              try
              {
                k = zp.a(localStringBuilder.substring(i + 1, i + 1 + (j - i - 1)));
              }
              catch (Exception localException)
              {
                break;
              }
              int m = 0;
              if (j + 1 < localStringBuilder.length()) {
                switch (localStringBuilder.charAt(j + 1))
                {
                case '$': 
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
                case '{': 
                  m = 1;
                }
              }
              if (m != 0)
              {
                str2 = CellsHelper.columnIndexToName(paramInt2 + k);
                localStringBuilder.delete(i, i + (j - i + 1));
                localStringBuilder.insert(i, str2);
                break;
              }
              String str2 = zp.a(paramInt1 + 1 + k);
              localStringBuilder.delete(i, i + (j - i + 1));
              localStringBuilder.insert(i, str2);
              break;
            }
          }
        }
      }
    }
    return zs.a(localStringBuilder);
  }
  
  static String a(String paramString, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    char[] arrayOfChar = paramString.toCharArray();
    if (paramBoolean)
    {
      paramInt1++;
      paramInt3++;
    }
    StringBuilder localStringBuilder = new StringBuilder(arrayOfChar.length);
    for (int i = 0; i < arrayOfChar.length; i++)
    {
      char c = arrayOfChar[i];
      if (c == '{')
      {
        int j = i;
        int k = -1;
        int m = 0;
        i++;
        while (i < arrayOfChar.length)
        {
          c = arrayOfChar[i];
          if (c == '}') {
            break;
          }
          if (c == ':') {
            k = i;
          } else if (Character.isDigit(c)) {
            m = 1;
          }
          i++;
        }
        if (i == arrayOfChar.length) {
          return null;
        }
        if (paramBoolean) {
          if (m != 0)
          {
            int n;
            int i1;
            if (k != -1)
            {
              n = zp.a(paramString.substring(j + 1, j + 1 + (k - j - 1)));
              i1 = paramInt2 + n;
              CellsHelper.a(localStringBuilder, i1);
              localStringBuilder.append(paramInt1);
              localStringBuilder.append(':');
              n = zp.a(paramString.substring(k + 1, k + 1 + (i - k - 1)));
              i1 = paramInt2 + n;
              CellsHelper.a(localStringBuilder, i1);
              localStringBuilder.append(paramInt3);
            }
            else
            {
              n = zp.a(paramString.substring(j + 1, j + 1 + (i - j - 1)));
              i1 = paramInt2 + n;
              CellsHelper.a(localStringBuilder, i1);
              localStringBuilder.append(paramInt1);
              localStringBuilder.append(':');
              CellsHelper.a(localStringBuilder, i1);
              localStringBuilder.append(paramInt3);
            }
          }
          else if (k != -1)
          {
            localStringBuilder.append(arrayOfChar, j + 1, k - j - 1);
            localStringBuilder.append(paramInt1);
            localStringBuilder.append(':');
            localStringBuilder.append(arrayOfChar, k + 1, i - k - 1);
            localStringBuilder.append(paramInt3);
          }
          else
          {
            localStringBuilder.append(arrayOfChar, j + 1, i - j - 1);
            localStringBuilder.append(paramInt1);
            localStringBuilder.append(':');
            localStringBuilder.append(arrayOfChar, j + 1, i - j - 1);
            localStringBuilder.append(paramInt3);
          }
        }
      }
      else
      {
        localStringBuilder.append(c);
      }
    }
    return zs.a(localStringBuilder);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbqd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */