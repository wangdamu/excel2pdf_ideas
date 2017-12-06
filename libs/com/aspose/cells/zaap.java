package com.aspose.cells;

import com.aspose.cells.a.c.zu;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zo;
import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.HashMap;

class zaap
{
  private static final com.aspose.cells.b.c.a.za a = new com.aspose.cells.b.c.a.za(new String[] { "#REF", "#REF!" });
  
  static void a(StringBuilder paramStringBuilder, String paramString1, String paramString2)
  {
    boolean bool = a(paramStringBuilder, paramString1, false);
    if (paramString2 != null)
    {
      paramStringBuilder.append(":");
      bool = a(paramStringBuilder, paramString2, bool);
    }
    if (bool)
    {
      paramStringBuilder.insert(0, '\'');
      paramStringBuilder.append('\'');
    }
  }
  
  private static boolean a(StringBuilder paramStringBuilder, String paramString, boolean paramBoolean)
  {
    char[] arrayOfChar = paramString.toCharArray();
    boolean bool = paramBoolean;
    for (int i = 0; i < arrayOfChar.length; i++)
    {
      paramStringBuilder.append(arrayOfChar[i]);
      switch (arrayOfChar[i])
      {
      case '\'': 
      case '’': 
        bool = true;
        paramStringBuilder.append(arrayOfChar[i]);
        break;
      case ' ': 
      case '!': 
      case '"': 
      case '#': 
      case '$': 
      case '%': 
      case '&': 
      case '(': 
      case ')': 
      case '+': 
      case ',': 
      case '-': 
      case '.': 
      case '<': 
      case '=': 
      case '>': 
      case '@': 
      case '\\': 
      case '{': 
      case '|': 
      case '}': 
      case '~': 
      case ' ': 
      case '”': 
      case '　': 
        bool = true;
        break;
      default: 
        if (arrayOfChar[i] > 65280) {
          bool = true;
        }
        break;
      }
    }
    if ((!bool) && (arrayOfChar.length > 0)) {
      switch (arrayOfChar[0])
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
        bool = true;
        break;
      case 'C': 
      case 'R': 
      case 'c': 
      case 'r': 
        if ((arrayOfChar.length > 1) && (Character.isDigit(arrayOfChar[1]))) {
          return true;
        }
        break;
      }
    }
    if (!bool) {
      bool = zamm.a(arrayOfChar);
    }
    return bool;
  }
  
  static String a(int paramInt1, WorksheetCollection paramWorksheetCollection, int paramInt2, HashMap paramHashMap)
  {
    zwp localzwp = paramWorksheetCollection.r().b(paramInt1);
    int i = localzwp.a & 0xFFFF;
    int j = localzwp.b & 0xFFFF;
    int k = localzwp.c & 0xFFFF;
    if (i == paramWorksheetCollection.v())
    {
      if ((j < 0) || (j >= paramWorksheetCollection.getCount())) {
        return "#REF";
      }
      StringBuilder localStringBuilder1 = new StringBuilder();
      a(localStringBuilder1, paramWorksheetCollection.get(j).getName(), j == k ? null : paramWorksheetCollection.get(k).getName());
      return zs.a(localStringBuilder1);
    }
    int m = (paramInt2 & 0x100) != 0 ? 1 : 0;
    StringBuilder localStringBuilder2 = new StringBuilder();
    zbti localzbti = paramWorksheetCollection.w().a(i);
    if (localzbti.a() == 5) {
      return "";
    }
    String str1 = null;
    if (j != 65534)
    {
      if ((localzbti.c() == null) || (j < 0) || (j >= localzbti.c().length)) {
        return "#REF";
      }
      str1 = localzbti.c()[j];
    }
    int n = 1;
    localStringBuilder2.append('\'');
    switch (paramInt2 & 0xFF)
    {
    case 1: 
      if (paramHashMap.get(Integer.valueOf(i)) != null)
      {
        localStringBuilder2.append('[');
        localStringBuilder2.append(zs.a(paramHashMap.get(Integer.valueOf(i))));
      }
      else
      {
        return "";
      }
      break;
    default: 
      Object localObject = localzbti.a(paramWorksheetCollection.p());
      if ((localObject == null) || ("".equals(localObject))) {
        return "";
      }
      if ((m != 0) || (str1 == null))
      {
        n = 0;
        localStringBuilder2.append((String)localObject);
      }
      else
      {
        if ((paramInt2 == 2) && (paramWorksheetCollection.p().e() != null) && (((String)localObject).startsWith(paramWorksheetCollection.p().e())))
        {
          String str2 = ((String)localObject).substring(paramWorksheetCollection.p().e().length());
          if (zw.b(str2, str1)) {
            n = 0;
          }
          localObject = str2;
        }
        if (n != 0)
        {
          localObject = ((String)localObject).replace('/', '\\');
          localObject = zw.a((String)localObject, "'", "''");
          int i1 = ((String)localObject).lastIndexOf('\\');
          if (i1 != -1)
          {
            localStringBuilder2.append(((String)localObject).substring(0, 0 + (i1 + 1)));
            localStringBuilder2.append('[');
            localStringBuilder2.append(((String)localObject).substring(i1 + 1));
          }
          else if ((((String)localObject).length() > 2) && (((String)localObject).charAt(1) == ':'))
          {
            localStringBuilder2.append(((String)localObject).substring(0, 3));
            localStringBuilder2.append('[');
            localStringBuilder2.append(((String)localObject).substring(3));
          }
          else
          {
            localStringBuilder2.append('[');
            localStringBuilder2.append((String)localObject);
          }
        }
      }
      break;
    }
    if (n != 0) {
      localStringBuilder2.append(']');
    }
    if ((m == 0) && (str1 != null))
    {
      a(localStringBuilder2, str1, true);
      if (j != k)
      {
        localStringBuilder2.append(':');
        str1 = localzbti.c()[k];
        a(localStringBuilder2, str1, true);
      }
    }
    localStringBuilder2.append('\'');
    return zs.a(localStringBuilder2);
  }
  
  static int a(char[] paramArrayOfChar, char paramChar1, char paramChar2, int paramInt)
  {
    int i = 1;
    paramInt++;
    while (paramInt < paramArrayOfChar.length)
    {
      if ((paramArrayOfChar[paramInt] == '\'') && (paramChar1 == '['))
      {
        paramInt++;
      }
      else if (paramArrayOfChar[paramInt] == paramChar2)
      {
        i--;
        if (i == 0) {
          return paramInt;
        }
      }
      else if (paramArrayOfChar[paramInt] == paramChar1)
      {
        i++;
      }
      paramInt++;
    }
    return paramArrayOfChar.length;
  }
  
  static int a(char[] paramArrayOfChar, char paramChar, int paramInt)
  {
    
    while (paramInt < paramArrayOfChar.length)
    {
      if (paramArrayOfChar[paramInt] == paramChar) {
        return paramInt;
      }
      switch (paramArrayOfChar[paramInt])
      {
      case '"': 
      case '\'': 
        paramInt = a(paramArrayOfChar, paramArrayOfChar[paramInt], paramArrayOfChar[paramInt], paramInt);
        break;
      case '[': 
        paramInt = a(paramArrayOfChar, paramArrayOfChar[paramInt], ']', paramInt);
        break;
      }
      paramInt++;
    }
    return -1;
  }
  
  static int a(String paramString, char paramChar)
  {
    char[] arrayOfChar = paramString.toCharArray();
    return a(arrayOfChar, paramChar, -1);
  }
  
  static int b(String paramString, char paramChar)
  {
    if (paramString.indexOf('\'') != -1)
    {
      char[] arrayOfChar = paramString.toCharArray();
      for (int i = 0; i < arrayOfChar.length; i++)
      {
        if (arrayOfChar[i] == paramChar) {
          return i;
        }
        if (arrayOfChar[i] == '\'')
        {
          i++;
          while ((i < arrayOfChar.length) && (arrayOfChar[i] != '\'')) {
            i++;
          }
        }
      }
      return -1;
    }
    return paramString.indexOf(paramChar);
  }
  
  static int c(String paramString, char paramChar)
  {
    for (int i = paramString.length() - 1; i >= 0; i--)
    {
      int j;
      switch (paramString.charAt(i))
      {
      case '"': 
      case '\'': 
        j = paramString.charAt(i);
        i--;
      }
      while ((i >= 0) && (paramString.charAt(i) != j))
      {
        i--;
        continue;
        if (paramString.charAt(i) == paramChar) {
          return i;
        }
      }
    }
    return -1;
  }
  
  static String a(String paramString)
  {
    String str = paramString;
    if ((str.charAt(0) == '\'') && (str.charAt(str.length() - 1) == '\''))
    {
      str = str.substring(1, 1 + (str.length() - 2));
      str = zw.a(str, "''", "'");
    }
    return str;
  }
  
  private static String d(String paramString)
  {
    String str = paramString;
    if ((str.charAt(0) == '\'') && (str.charAt(str.length() - 1) == '\'')) {
      str = str.substring(1, 1 + (str.length() - 2));
    }
    return str;
  }
  
  static String[] a(String paramString, boolean paramBoolean)
  {
    int i = paramString.lastIndexOf('!');
    if (i == -1) {
      return null;
    }
    String str1 = a(paramString.substring(0, 0 + i));
    int j = str1.lastIndexOf('[');
    if (j != -1)
    {
      int k = str1.lastIndexOf(']');
      String str2 = null;
      if (j != 0) {
        str2 = str1.substring(0, 0 + j) + str1.substring(j + 1, j + 1 + (k - j - 1));
      } else {
        str2 = str1.substring(1, 1 + (k - 1));
      }
      String str3 = paramString.substring(i + 1);
      String str4 = paramString;
      if (paramBoolean)
      {
        if (str3.indexOf(':') != -1)
        {
          localObject = CellArea.a(str3);
          str3 = ((CellArea)localObject).a(1048575, 16383, true);
        }
        str4 = paramString.substring(0, 0 + (i + 1)) + str3;
      }
      Object localObject = { str2, str1.substring(k + 1), str3, str4 };
      return (String[])localObject;
    }
    return null;
  }
  
  static int[] a(WorksheetCollection paramWorksheetCollection, String paramString, boolean paramBoolean)
  {
    if (paramString.length() == 0) {
      return paramWorksheetCollection.w().a(paramWorksheetCollection);
    }
    paramString = d(paramString);
    int i = -1;
    int j = -1;
    int k = paramWorksheetCollection.v();
    int m = -1;
    String str1 = paramString.toUpperCase();
    switch (a.a(paramString))
    {
    case 0: 
    case 1: 
      i = j = -1;
      m = paramWorksheetCollection.r().f(k, 65535, 65535);
      if (m == -1) {
        m = paramWorksheetCollection.r().b(k & 0xFFFF, 65535, 65535);
      }
      break;
    default: 
      Object localObject1 = paramWorksheetCollection.f().get(str1);
      if (localObject1 != null)
      {
        int[] arrayOfInt1 = (int[])localObject1;
        i = j = arrayOfInt1[0];
        m = arrayOfInt1[1];
      }
      else
      {
        int n = paramString.lastIndexOf('[');
        int i2;
        if (n != -1)
        {
          String str2 = null;
          i2 = paramString.lastIndexOf(']');
          if (n != 0) {
            str2 = paramString.substring(0, 0 + n) + paramString.substring(n + 1, n + 1 + (i2 - n - 1));
          } else {
            str2 = paramString.substring(1, 1 + (i2 - 1));
          }
          paramString = paramString.substring(i2 + 1);
          int[] arrayOfInt2 = a(paramWorksheetCollection, str2, paramString, true, true, paramBoolean);
          k = arrayOfInt2[0];
          m = arrayOfInt2[1];
        }
        else
        {
          int i1 = paramString.indexOf(":");
          i = j = -1;
          i2 = 0;
          int i3 = -1;
          Object localObject2;
          if ((i1 != -1) && (i1 + 1 < paramString.length()) && (paramString.charAt(i1 + 1) != '\\') && (paramString.charAt(i1 + 1) != '/'))
          {
            localObject2 = zw.d(str1, ':');
            if (localObject2.length != 2) {
              throw new CellsException(5, "Invalid formula.");
            }
            int i4 = 0;
            for (i3 = 0; i3 < paramWorksheetCollection.getCount(); i3++)
            {
              String str3 = paramWorksheetCollection.get(i3).getName().toUpperCase();
              if (zw.b(str3, localObject2[0]))
              {
                i2 = 1;
                i = i3;
              }
              else if (zw.b(str3, localObject2[1]))
              {
                i4 = 1;
                j = i3;
                break;
              }
            }
            if ((i2 == 0) || (i4 == 0) || (j < i)) {
              throw new CellsException(5, "Invalid formula.");
            }
            m = paramWorksheetCollection.r().f(k, i, j);
            if (m == -1) {
              m = paramWorksheetCollection.r().b(k & 0xFFFF, i & 0xFFFF, j & 0xFFFF);
            }
          }
          else
          {
            localObject2 = a(paramWorksheetCollection, paramString, null, false, false, paramBoolean);
            k = localObject2[0];
            m = localObject2[1];
          }
        }
      }
      break;
    }
    return new int[] { m, k, i, j };
  }
  
  private static int[] a(WorksheetCollection paramWorksheetCollection, String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if ((paramString1 != null) && ((paramString1.startsWith("file:///")) || (paramString1.startsWith("file:\\\\\\")))) {
      paramString1 = paramString1.substring(8);
    }
    int i = 0;
    int j = 0;
    String str1 = zu.b(paramString1);
    zbth localzbth = paramWorksheetCollection.w();
    String str2 = str1;
    if (str2 != null) {
      str2 = str2.toUpperCase();
    }
    if ((paramWorksheetCollection.p().getFileName() != null) && (paramWorksheetCollection.p().getFileName().toUpperCase().endsWith(str2)))
    {
      i = paramWorksheetCollection.v();
      j = paramWorksheetCollection.r().a(i, 65534, 65534, true);
      return new int[] { i, j };
    }
    String str3 = paramString1;
    paramString1 = zbti.a(paramString1, 0);
    int k = 0;
    int m;
    int n;
    zbti localzbti;
    if (localzbth != null) {
      if ((paramBoolean2) && (zarb.c(paramString1)))
      {
        i = zp.a(paramString1);
        if (paramWorksheetCollection.p().getFileFormat() == 16) {
          i--;
        }
        m = 0;
        n = 0;
        if (i < localzbth.getCount())
        {
          localzbti = localzbth.a(i);
          int[] arrayOfInt1 = a(paramWorksheetCollection, i, localzbti.i(), null, paramString2, true);
          k = arrayOfInt1 != null ? 1 : 0;
          if (k != 0)
          {
            m = arrayOfInt1[0];
            n = arrayOfInt1[1];
            j = paramWorksheetCollection.r().a(i, m, n, true);
          }
        }
        else
        {
          i = paramWorksheetCollection.v();
          j = paramWorksheetCollection.r().a(i, true);
          return new int[] { i, j };
        }
      }
      else
      {
        for (m = 0; m < localzbth.getCount(); m++)
        {
          localzbti = localzbth.a(m);
          if (localzbti.h())
          {
            n = 0;
            int i1 = 0;
            int[] arrayOfInt2 = a(paramWorksheetCollection, m, paramString1, str3, paramString2, false);
            k = arrayOfInt2 != null ? 1 : 0;
            if (k != 0)
            {
              n = arrayOfInt2[0];
              i1 = arrayOfInt2[1];
              i = m;
              j = paramWorksheetCollection.r().a(m, n, i1, true);
              break;
            }
          }
        }
      }
    }
    if (k == 0) {
      if (paramWorksheetCollection.b)
      {
        i = paramWorksheetCollection.v();
        j = paramWorksheetCollection.r().f(i, 65535, 65535);
        if (j == -1) {
          j = paramWorksheetCollection.r().b(i & 0xFFFF, 65535, 65535);
        }
      }
      else
      {
        if (paramWorksheetCollection.w() == null)
        {
          paramWorksheetCollection.a(new zbth());
          localzbti = new zbti();
          localzbti.a(1);
          paramWorksheetCollection.w().a(localzbti);
        }
        localzbti = new zbti();
        localzbti.a(0);
        localzbti.c(paramString1);
        i = paramWorksheetCollection.w().getCount();
        paramWorksheetCollection.w().a(localzbti);
        m = 0;
        if ((paramString2 == null) || ("".equals(paramString2)))
        {
          paramString2 = str1;
          if (paramString2 != null)
          {
            n = paramString2.indexOf(".");
            if (n != -1) {
              paramString2 = paramString2.substring(0, 0 + n);
            }
            if (paramString2.length() >= 32) {
              paramString2 = "Sheet1";
            }
          }
          localzbti.a(new String[] { paramString2 });
          if (paramBoolean3) {
            m = 65534;
          }
        }
        else
        {
          localzbti.a(new String[] { paramString2 });
        }
        j = paramWorksheetCollection.r().b(paramWorksheetCollection.w().getCount() - 1 & 0xFFFF, m, m);
      }
    }
    return new int[] { i, j };
  }
  
  private static int[] a(WorksheetCollection paramWorksheetCollection, int paramInt, String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    zbti localzbti = paramWorksheetCollection.w().a(paramInt);
    int i = 0;
    int j = 0;
    if ((paramBoolean) || (zw.a(localzbti.i(), paramString1, true) == 0) || (zw.a(localzbti.l(), paramString2, true) == 0))
    {
      int k = 0;
      int m;
      if ((paramString3 == null) || ("".equals(paramString3)))
      {
        m = paramWorksheetCollection.r().b(paramInt & 0xFFFF, 65534);
        if (m == -1) {
          paramWorksheetCollection.r().b(paramInt & 0xFFFF, 65534, 65534);
        }
        i = j = 65534;
      }
      else
      {
        m = paramString3.indexOf(':');
        if (m != -1)
        {
          String[] arrayOfString = zw.d(paramString3, ':');
          for (int i1 = 0; i1 < localzbti.c().length; i1++)
          {
            if (zw.a(localzbti.c()[i1], arrayOfString[0], true) == 0)
            {
              i = i1;
              k = 1;
            }
            if (zw.a(localzbti.c()[i1], arrayOfString[1], true) == 0)
            {
              j = i1;
              k = 1;
            }
          }
        }
        else
        {
          for (int n = 0; n < localzbti.c().length; n++) {
            if (zw.a(localzbti.c()[n], paramString3, true) == 0)
            {
              i = j = n;
              k = 1;
              break;
            }
          }
        }
        if (k == 0)
        {
          localzbti.a(paramString3);
          i = j = localzbti.c().length - 1;
          paramWorksheetCollection.r().b(paramInt & 0xFFFF, i & 0xFFFF, j & 0xFFFF);
        }
      }
      return new int[] { i, j };
    }
    return null;
  }
  
  public static boolean b(String paramString)
  {
    int i = 0;
    for (int j = 0; j < paramString.length(); j++) {
      switch (paramString.charAt(j))
      {
      case ' ': 
      case '!': 
      case '#': 
      case '$': 
      case '%': 
      case '&': 
      case '\'': 
      case '(': 
      case ')': 
      case '+': 
      case ',': 
      case '-': 
      case '/': 
      case '<': 
      case '=': 
      case '>': 
      case '@': 
      case '\\': 
      case '{': 
      case '|': 
      case '}': 
      case '~': 
      case '（': 
      case '）': 
        return true;
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
        if (j == 0) {
          return true;
        }
        i++;
      }
    }
    return i == paramString.length();
  }
  
  static String[] c(String paramString)
  {
    if (paramString.indexOf('\'') == -1) {
      return zw.d(paramString, ',');
    }
    ArrayList localArrayList = new ArrayList();
    char[] arrayOfChar = paramString.toCharArray();
    int i = 0;
    int j = 0;
    for (int k = 0; k < arrayOfChar.length; k++)
    {
      m = arrayOfChar[k];
      if (m == 39)
      {
        if ((i == 0) || (k + 1 >= arrayOfChar.length) || (arrayOfChar[(k + 1)] != '\'')) {
          i = i == 0 ? 1 : 0;
        }
      }
      else if ((i == 0) && (m == 44))
      {
        zf.a(localArrayList, new String(arrayOfChar, j, k - j));
        j = k + 1;
      }
    }
    if (localArrayList.size() == 0) {
      return null;
    }
    zf.a(localArrayList, new String(arrayOfChar, j, arrayOfChar.length - j));
    String[] arrayOfString = new String[localArrayList.size()];
    for (int m = 0; m < localArrayList.size(); m++) {
      arrayOfString[m] = ((String)localArrayList.get(m));
    }
    return arrayOfString;
  }
  
  static boolean a(Object[] paramArrayOfObject1, Object[] paramArrayOfObject2)
  {
    if (paramArrayOfObject1.length != 1) {
      return false;
    }
    Object[] arrayOfObject = (Object[])com.aspose.cells.b.a.za.a(paramArrayOfObject1, 0);
    if (arrayOfObject.length != 1) {
      return false;
    }
    paramArrayOfObject2[0] = com.aspose.cells.b.a.za.a(arrayOfObject, 0);
    return true;
  }
  
  static int a(int paramInt1, int paramInt2)
  {
    switch (paramInt1)
    {
    case 1: 
      return 32;
    case 252: 
      return 96;
    }
    return 64;
  }
  
  static int[] a(int paramInt1, int paramInt2, zacf paramzacf)
  {
    switch (paramInt1)
    {
    case 0: 
    case 4: 
    case 5: 
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 12: 
    case 36: 
    case 37: 
    case 40: 
    case 41: 
    case 42: 
    case 43: 
    case 44: 
    case 45: 
    case 46: 
    case 47: 
    case 75: 
    case 76: 
    case 77: 
    case 105: 
    case 130: 
    case 131: 
    case 169: 
    case 183: 
    case 191: 
    case 193: 
    case 194: 
    case 195: 
    case 196: 
    case 199: 
    case 227: 
    case 235: 
    case 269: 
    case 318: 
    case 319: 
    case 320: 
    case 321: 
    case 322: 
    case 323: 
    case 347: 
    case 360: 
    case 361: 
    case 362: 
    case 363: 
    case 364: 
    case 365: 
    case 366: 
    case 367: 
      return zacn.h;
    case 2: 
    case 3: 
    case 13: 
    case 14: 
    case 15: 
    case 16: 
    case 17: 
    case 18: 
    case 20: 
    case 21: 
    case 22: 
    case 23: 
    case 24: 
    case 25: 
    case 26: 
    case 27: 
    case 30: 
    case 31: 
    case 32: 
    case 33: 
    case 38: 
    case 39: 
    case 48: 
    case 56: 
    case 57: 
    case 58: 
    case 59: 
    case 60: 
    case 65: 
    case 66: 
    case 67: 
    case 68: 
    case 69: 
    case 70: 
    case 71: 
    case 72: 
    case 73: 
    case 82: 
    case 86: 
    case 97: 
    case 98: 
    case 99: 
    case 109: 
    case 111: 
    case 112: 
    case 113: 
    case 114: 
    case 115: 
    case 116: 
    case 117: 
    case 118: 
    case 119: 
    case 120: 
    case 121: 
    case 124: 
    case 126: 
    case 127: 
    case 128: 
    case 129: 
    case 140: 
    case 141: 
    case 142: 
    case 143: 
    case 144: 
    case 148: 
    case 162: 
    case 167: 
    case 168: 
    case 184: 
    case 192: 
    case 197: 
    case 198: 
    case 204: 
    case 205: 
    case 206: 
    case 207: 
    case 208: 
    case 209: 
    case 210: 
    case 211: 
    case 212: 
    case 213: 
    case 214: 
    case 215: 
    case 219: 
    case 220: 
    case 222: 
    case 229: 
    case 230: 
    case 231: 
    case 232: 
    case 233: 
    case 234: 
    case 244: 
    case 247: 
    case 261: 
    case 270: 
    case 271: 
    case 272: 
    case 273: 
    case 274: 
    case 275: 
    case 276: 
    case 277: 
    case 278: 
    case 279: 
    case 280: 
    case 281: 
    case 282: 
    case 283: 
    case 284: 
    case 285: 
    case 286: 
    case 287: 
    case 288: 
    case 289: 
    case 290: 
    case 291: 
    case 292: 
    case 293: 
    case 294: 
    case 295: 
    case 296: 
    case 297: 
    case 298: 
    case 299: 
    case 300: 
    case 301: 
    case 302: 
    case 332: 
    case 336: 
    case 337: 
    case 342: 
    case 343: 
    case 350: 
    case 351: 
    case 352: 
    case 353: 
    case 354: 
    case 359: 
      return zacn.g;
    case 1: 
      switch (paramInt2)
      {
      case 1: 
        return new int[] { 96, 32 };
      }
      return zacn.n;
    case 11: 
    case 64: 
    case 100: 
    case 125: 
    case 344: 
      return zacn.n;
    case 28: 
      return zacn.r;
    case 29: 
      if ((paramzacf.c() != null) && (paramzacf.c().size() >= 2) && (((zacf)paramzacf.c().get(0)).g() == 2)) {
        return zacn.j;
      }
      return zacn.l;
    case 61: 
    case 62: 
    case 78: 
    case 324: 
    case 325: 
    case 326: 
    case 327: 
    case 328: 
    case 329: 
    case 331: 
    case 346: 
      return zacn.l;
    case 216: 
      return new int[] { 64, 32, 64 };
    case 345: 
      return new int[] { 32, 64, 32 };
    case 101: 
    case 102: 
      return new int[] { 64, 32, 32, 64 };
    case 49: 
    case 51: 
      return new int[] { 32, 32, 64 };
    case 50: 
    case 52: 
      return new int[] { 32, 32, 32, 64 };
    case 83: 
    case 163: 
    case 164: 
    case 165: 
    case 228: 
    case 252: 
    case 303: 
    case 304: 
    case 305: 
    case 306: 
    case 307: 
    case 308: 
    case 310: 
    case 311: 
    case 312: 
    case 313: 
    case 314: 
    case 315: 
    case 330: 
      return zacn.i;
    case 309: 
      return new int[] { 64, 96 };
    case 316: 
    case 317: 
      return new int[] { 96, 96, 64 };
    }
    return null;
  }
  
  static Object a(Object paramObject, WorkbookSettings paramWorkbookSettings)
  {
    return a(paramObject, paramWorkbookSettings, false);
  }
  
  static Object a(Object paramObject, WorkbookSettings paramWorkbookSettings, boolean paramBoolean)
  {
    if (paramObject == null) {
      return Double.valueOf(0.0D);
    }
    if ((paramObject instanceof zuf)) {
      return paramObject;
    }
    switch (zaoj.a(paramObject.getClass()))
    {
    case 3: 
      if (((Boolean)paramObject).booleanValue()) {
        return znq.h;
      }
      return znq.g;
    case 14: 
      return (Double)paramObject;
    case 9: 
      return Double.valueOf(((Integer)paramObject).intValue());
    case 7: 
      return Double.valueOf(((Short)paramObject).shortValue());
    case 18: 
      if (paramBoolean) {
        return znq.g;
      }
      String str = (String)paramObject;
      zavp localzavp = zaac.a(str, paramWorkbookSettings.f());
      if (localzavp == null) {
        return zuf.i;
      }
      switch (localzavp.a())
      {
      case 1: 
        return Double.valueOf(CellsHelper.getDoubleFromDateTime((DateTime)localzavp.d(), paramWorkbookSettings.getDate1904()));
      case 4: 
        return (Double)localzavp.d();
      }
      return zuf.i;
    case 16: 
      return Double.valueOf(CellsHelper.getDoubleFromDateTime((DateTime)paramObject, paramWorkbookSettings.getDate1904()));
    }
    double[][] arrayOfDouble;
    if ((paramObject instanceof double[][]))
    {
      arrayOfDouble = (double[][])paramObject;
      if ((arrayOfDouble.length != 1) || (arrayOfDouble[0].length != 1)) {
        return zuf.i;
      }
      return Double.valueOf(arrayOfDouble[0][0]);
    }
    if ((paramObject instanceof Object[]))
    {
      arrayOfDouble = null;
      Object[] arrayOfObject = { arrayOfDouble };
      boolean bool = a((Object[])paramObject, arrayOfObject);
      arrayOfDouble = arrayOfObject[0];
      if (bool) {
        return a(arrayOfDouble, paramWorkbookSettings.getDate1904());
      }
    }
    return zuf.i;
  }
  
  static Object a(Object paramObject, boolean paramBoolean)
  {
    if (paramObject == null) {
      return Double.valueOf(0.0D);
    }
    if ((paramObject instanceof zuf)) {
      return paramObject;
    }
    switch (zaoj.a(paramObject.getClass()))
    {
    case 3: 
      if (((Boolean)paramObject).booleanValue()) {
        return Double.valueOf(1.0D);
      }
      return Double.valueOf(0.0D);
    case 14: 
      return (Double)paramObject;
    case 9: 
      return Double.valueOf(((Integer)paramObject).intValue());
    case 7: 
      return Double.valueOf(((Short)paramObject).shortValue());
    case 18: 
      String str = (String)paramObject;
      double d = 1.0D;
      if ((str.length() > 0) && (str.charAt(str.length() - 1) == '%'))
      {
        str = str.substring(0, 0 + (str.length() - 1)).trim();
        d = 0.01D;
      }
      if (str.length() > 0) {
        switch (str.charAt(0))
        {
        case '$': 
        case '€': 
        case '￡': 
        case '￥': 
          str = str.substring(1).trim();
        }
      }
      if (zarb.d(str)) {
        return Double.valueOf(zo.a(str) * d);
      }
      if (zarb.a(str.trim())) {
        try
        {
          DateTime localDateTime = DateTime.a(str);
          return Double.valueOf(CellsHelper.getDoubleFromDateTime(localDateTime, paramBoolean) * d);
        }
        catch (Exception localException) {}
      }
      return zuf.i;
    case 16: 
      return Double.valueOf(CellsHelper.getDoubleFromDateTime((DateTime)paramObject, paramBoolean));
    }
    double[][] arrayOfDouble;
    if ((paramObject instanceof double[][]))
    {
      arrayOfDouble = (double[][])paramObject;
      if ((arrayOfDouble.length != 1) || (arrayOfDouble[0].length != 1)) {
        return zuf.i;
      }
      return Double.valueOf(arrayOfDouble[0][0]);
    }
    if ((paramObject instanceof Object[]))
    {
      arrayOfDouble = null;
      Object[] arrayOfObject = { arrayOfDouble };
      boolean bool = a((Object[])paramObject, arrayOfObject);
      arrayOfDouble = arrayOfObject[0];
      if (bool) {
        return a(arrayOfDouble, paramBoolean);
      }
    }
    return zuf.i;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */