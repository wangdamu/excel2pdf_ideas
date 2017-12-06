package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import com.aspose.cells.b.c.a.za;
import java.util.HashMap;

class zbvl
{
  private static final za a = new za(new String[] { "DATA", "ALL", "HEADERS", "DATA2", "DATAHEADERS", "TOTALS", "DATATOTALS", "CURRENT", "THIS ROW" });
  
  private static String a(String paramString1, String paramString2, byte paramByte, boolean paramBoolean1, int paramInt1, String paramString3, String paramString4, int paramInt2, boolean paramBoolean2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramString1 != null)
    {
      localStringBuilder.append(paramString1);
      localStringBuilder.append('!');
    }
    String str = null;
    switch (paramByte)
    {
    case 16: 
      str = "#This Row";
      if (paramInt2 != 1)
      {
        if ((!paramBoolean1) || (paramInt1 != 1)) {
          localStringBuilder.append(paramString2);
        }
        localStringBuilder.append('[');
        localStringBuilder.append('@');
        if (paramInt1 != 0) {
          if (paramInt1 == 1)
          {
            a(localStringBuilder, paramString3, 2);
          }
          else
          {
            localStringBuilder.append('[');
            a(localStringBuilder, paramString3, 0);
            localStringBuilder.append(']');
            localStringBuilder.append(':');
            localStringBuilder.append('[');
            a(localStringBuilder, paramString4, 0);
            localStringBuilder.append(']');
          }
        }
        localStringBuilder.append(']');
        return zs.a(localStringBuilder);
      }
      break;
    case 1: 
      if (!paramBoolean2) {
        str = "#All";
      }
      break;
    case 2: 
      str = "#Headers";
      break;
    case 4: 
      str = "#Data";
      break;
    case 6: 
      str = "#Headers],[#Data";
      break;
    case 8: 
      str = "#Totals";
      break;
    case 12: 
      str = "#DataTotals";
      break;
    }
    if (str != null)
    {
      if (paramInt1 == 0)
      {
        localStringBuilder.append(paramString2);
        localStringBuilder.append('[');
        localStringBuilder.append(str);
        localStringBuilder.append("]");
        return zs.a(localStringBuilder);
      }
      localStringBuilder.append(paramString2);
      localStringBuilder.append('[');
      localStringBuilder.append('[');
      localStringBuilder.append(str);
      localStringBuilder.append("],[");
      a(localStringBuilder, paramString3, 0);
      localStringBuilder.append("]");
      if (paramInt1 != 1)
      {
        localStringBuilder.append(":[");
        a(localStringBuilder, paramString4, 0);
        localStringBuilder.append("]");
      }
      localStringBuilder.append("]");
      return zs.a(localStringBuilder);
    }
    if (paramInt1 == 0)
    {
      localStringBuilder.append(paramString2);
      if (paramInt2 == 1) {
        localStringBuilder.append("[]");
      }
      return zs.a(localStringBuilder);
    }
    if ((!paramBoolean1) || (paramInt1 != 1)) {
      localStringBuilder.append(paramString2);
    }
    localStringBuilder.append('[');
    if (paramInt1 == 1)
    {
      a(localStringBuilder, paramString3, 1);
    }
    else
    {
      localStringBuilder.append('[');
      a(localStringBuilder, paramString3, 0);
      localStringBuilder.append("]:[");
      a(localStringBuilder, paramString4, 0);
      localStringBuilder.append(']');
    }
    localStringBuilder.append(']');
    return zs.a(localStringBuilder);
  }
  
  static int a(WorksheetCollection paramWorksheetCollection, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = zc.e(paramArrayOfByte, paramInt1 + 2) & 0xFFFF;
    if (i == 65535) {
      return 0;
    }
    int j = paramInt2;
    int k = zc.e(paramArrayOfByte, paramInt1 + 4);
    int m = zc.a(paramArrayOfByte, paramInt1 + 6);
    int n = paramWorksheetCollection.r().c(i);
    if (n != paramWorksheetCollection.v())
    {
      int i1 = paramArrayOfByte[j] != 0 ? 1 : 0;
      int i2 = (byte)(paramArrayOfByte[(j + 1)] & 0xFF & 0x1F);
      j += 3;
      int i3 = (zc.e(paramArrayOfByte, j) & 0xFFFF) << 1;
      j += 2;
      j += i3;
      if (i1 != 0)
      {
        j += 2;
        int i4 = paramArrayOfByte[j] & 0xFF;
        j++;
        j += 3;
        i3 = (zc.e(paramArrayOfByte, j) & 0xFFFF) << 1;
        j += 2;
        j += i3;
        if (i4 == 2)
        {
          j += 3;
          i3 = (zc.e(paramArrayOfByte, j) & 0xFFFF) << 1;
          j += 2;
          j += i3;
        }
      }
    }
    return j - paramInt2;
  }
  
  static boolean a(byte[] paramArrayOfByte, int paramInt1, WorksheetCollection paramWorksheetCollection, int paramInt2, int paramInt3)
  {
    int i = zc.e(paramArrayOfByte, paramInt1 + 2) & 0xFFFF;
    zwp localzwp = paramWorksheetCollection.r().b(i);
    if (localzwp == null) {
      return false;
    }
    int j = zc.a(paramArrayOfByte, paramInt1 + 6);
    return ((localzwp.a & 0xFFFF) == paramWorksheetCollection.v()) && ((localzwp.b & 0xFFFF) == paramInt2) && (j == paramInt3);
  }
  
  static String a(WorksheetCollection paramWorksheetCollection, Cell paramCell, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, HashMap paramHashMap, int[] paramArrayOfInt)
  {
    int i = zc.e(paramArrayOfByte, paramInt1 + 2) & 0xFFFF;
    zwp localzwp = paramWorksheetCollection.r().b(i);
    if (localzwp == null) {
      return "#REF!";
    }
    int j = zc.e(paramArrayOfByte, paramInt1 + 4);
    int k = zc.a(paramArrayOfByte, paramInt1 + 6);
    int m = localzwp.a & 0xFFFF;
    int n = localzwp.b & 0xFFFF;
    String str1 = null;
    int i1 = 0;
    String str2 = null;
    byte b = 0;
    String str3 = null;
    String str4 = null;
    boolean bool = true;
    int i3;
    if (m != paramWorksheetCollection.v())
    {
      bool = false;
      str1 = zaap.a(i, paramWorksheetCollection, paramInt4 | 0x100, paramHashMap);
      if (("#REF!".equals(str1)) || (paramArrayOfInt[0] >= paramArrayOfByte.length)) {
        return "#REF!";
      }
      int i2 = paramArrayOfByte[paramArrayOfInt[0]] != 0 ? 1 : 0;
      b = (byte)(paramArrayOfByte[(paramArrayOfInt[0] + 1)] & 0xFF & 0x1F);
      paramArrayOfInt[0] += 3;
      i3 = (zc.e(paramArrayOfByte, paramArrayOfInt[0]) & 0xFFFF) << 1;
      paramArrayOfInt[0] += 2;
      str2 = Encoding.getUnicode().a(paramArrayOfByte, paramArrayOfInt[0], i3);
      paramArrayOfInt[0] += i3;
      if (i2 != 0)
      {
        paramArrayOfInt[0] += 2;
        i1 = paramArrayOfByte[paramArrayOfInt[0]] & 0xFF;
        paramArrayOfInt[0] += 1;
        paramArrayOfInt[0] += 3;
        i3 = (zc.e(paramArrayOfByte, paramArrayOfInt[0]) & 0xFFFF) << 1;
        paramArrayOfInt[0] += 2;
        str3 = Encoding.getUnicode().a(paramArrayOfByte, paramArrayOfInt[0], i3);
        paramArrayOfInt[0] += i3;
        if (i1 == 2)
        {
          paramArrayOfInt[0] += 3;
          i3 = (zc.e(paramArrayOfByte, paramArrayOfInt[0]) & 0xFFFF) << 1;
          paramArrayOfInt[0] += 2;
          str4 = Encoding.getUnicode().a(paramArrayOfByte, paramArrayOfInt[0], i3);
          paramArrayOfInt[0] += i3;
        }
      }
    }
    else
    {
      if ((n < 0) || (n > paramWorksheetCollection.getCount()))
      {
        paramInt1 += 14;
        return "#REF!";
      }
      ListObject localListObject = paramWorksheetCollection.get(n).getListObjects().a(k);
      if ((localListObject == null) || ((paramArrayOfByte[(paramInt1 + 5)] & 0xFF & 0x20) != 0))
      {
        paramInt1 += 14;
        return "#REF!";
      }
      i3 = zc.e(paramArrayOfByte, paramInt1 + 10) & 0xFFFF;
      int i4 = zc.e(paramArrayOfByte, paramInt1 + 12) & 0xFFFF;
      str2 = localListObject.getDisplayName();
      i1 = j & 0xFFFF & 0x3;
      b = (byte)((j & 0xFFFF) >> 2 & 0x1F);
      int i5 = (paramCell != null) && (paramCell.d.g().getIndex() == n) ? 1 : 0;
      if ((i5 == 0) || (paramInt2 < localListObject.getStartRow()) || (paramInt2 > localListObject.getEndRow()) || (paramInt3 < localListObject.getStartColumn()) || (paramInt3 > localListObject.getEndColumn())) {
        bool = false;
      }
      switch (i1)
      {
      case 0: 
        break;
      case 1: 
        if (i3 >= localListObject.getListColumns().getCount())
        {
          paramInt1 += 14;
          return "#REF!";
        }
        str3 = str4 = localListObject.getListColumns().get(i3).getName();
        break;
      case 2: 
        if (i3 >= localListObject.getListColumns().getCount())
        {
          paramInt1 += 14;
          return "#REF!";
        }
        if (i4 >= localListObject.getListColumns().getCount()) {
          i4 = i3;
        }
        str3 = localListObject.getListColumns().get(i3).getName();
        str4 = localListObject.getListColumns().get(i4).getName();
        break;
      }
    }
    return a(str1, str2, b, bool, i1, str3, str4, paramInt4, paramBoolean);
  }
  
  static int[] a(WorksheetCollection paramWorksheetCollection, int paramInt1, int paramInt2, int paramInt3, String paramString, boolean paramBoolean)
  {
    int i = 0;
    byte[] arrayOfByte = new byte[14];
    boolean[] arrayOfBoolean = { i };
    a(arrayOfByte, paramWorksheetCollection, paramInt1, paramInt2, paramInt3, paramString, 32, arrayOfBoolean);
    i = arrayOfBoolean[0];
    if (i != 0) {
      return null;
    }
    return a(paramWorksheetCollection, arrayOfByte, 0, paramInt2, paramInt3, paramBoolean);
  }
  
  static int[] a(WorksheetCollection paramWorksheetCollection, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    int i = zc.e(paramArrayOfByte, paramInt1 + 2) & 0xFFFF;
    int j = zc.e(paramArrayOfByte, paramInt1 + 4) & 0xFFFF;
    int k = zc.a(paramArrayOfByte, paramInt1 + 6);
    zwp localzwp = paramWorksheetCollection.r().b(i);
    int m = localzwp.a & 0xFFFF;
    int n = localzwp.b & 0xFFFF;
    if ((localzwp == null) || (m != paramWorksheetCollection.v())) {
      return null;
    }
    if ((n < 0) || (n > paramWorksheetCollection.getCount())) {
      return null;
    }
    ListObject localListObject = paramWorksheetCollection.get(n).getListObjects().a(k);
    if ((localListObject == null) || ((paramArrayOfByte[(paramInt1 + 5)] & 0xFF & 0x30) != 0)) {
      return null;
    }
    int i1 = zc.e(paramArrayOfByte, paramInt1 + 10) & 0xFFFF;
    int i2 = zc.e(paramArrayOfByte, paramInt1 + 12) & 0xFFFF;
    if (i1 >= localListObject.getListColumns().getCount()) {
      return null;
    }
    i1 = localListObject.getStartColumn() + i1;
    i2 = localListObject.getStartColumn() + i2;
    int i3 = localListObject.getStartRow();
    int i4 = localListObject.getEndRow();
    int i5 = j & 0x3;
    switch (j >> 2 & 0x1F)
    {
    case 1: 
      if (i5 == 0)
      {
        i1 = localListObject.getStartColumn();
        i2 = localListObject.getEndColumn();
      }
      break;
    case 2: 
      i3 = i4 = localListObject.getStartRow();
      if (i5 == 0)
      {
        i1 = localListObject.getStartColumn();
        i2 = localListObject.getEndColumn();
      }
      break;
    case 16: 
      i3 = i4 = paramInt2;
      break;
    case 8: 
      if (!localListObject.f()) {
        return null;
      }
      i3 = i4 = localListObject.getEndRow();
      break;
    default: 
      if ((localListObject.getShowHeaderRow()) && (!paramBoolean)) {
        i3++;
      }
      if (localListObject.getShowTotals()) {
        i4--;
      }
      if (i5 == 0)
      {
        i1 = localListObject.getStartColumn();
        i2 = localListObject.getEndColumn();
      }
      break;
    }
    int[] arrayOfInt = new int[6];
    arrayOfInt[0] = i;
    arrayOfInt[1] = i3;
    arrayOfInt[2] = i1;
    arrayOfInt[3] = i4;
    arrayOfInt[4] = i2;
    arrayOfInt[5] = j;
    return arrayOfInt;
  }
  
  static byte[] a(WorksheetCollection paramWorksheetCollection, String paramString, int paramInt)
  {
    ListObject localListObject = (ListObject)paramWorksheetCollection.i.get(paramString.toUpperCase());
    if (localListObject == null) {
      return null;
    }
    int i = localListObject.a();
    if (i == -1) {
      return null;
    }
    byte[] arrayOfByte = new byte[14];
    arrayOfByte[0] = 24;
    arrayOfByte[1] = 25;
    int j = 0;
    j = paramWorksheetCollection.r().b(paramWorksheetCollection.v(), localListObject.c().d().getIndex());
    System.arraycopy(zc.a(j), 0, arrayOfByte, 2, 2);
    int k = 0;
    switch (paramInt)
    {
    case 32: 
      break;
    case 64: 
      k |= 0x400;
      break;
    case 96: 
      k |= 0x800;
      break;
    }
    System.arraycopy(zc.a(i), 0, arrayOfByte, 6, 4);
    System.arraycopy(zc.a(k), 0, arrayOfByte, 4, 2);
    return arrayOfByte;
  }
  
  static ListObject a(WorksheetCollection paramWorksheetCollection, String paramString)
  {
    for (int i = 0; i < paramWorksheetCollection.getCount(); i++)
    {
      ListObjectCollection localListObjectCollection = paramWorksheetCollection.get(i).getListObjects();
      for (int j = 0; j < localListObjectCollection.getCount(); j++)
      {
        ListObject localListObject = localListObjectCollection.get(j);
        if (zw.a(localListObject.o(), paramString, true) == 0) {
          return localListObject;
        }
      }
    }
    return null;
  }
  
  private static int a(String paramString)
  {
    if (paramString == null) {
      return 0;
    }
    int i = 0;
    switch (a.a(paramString))
    {
    case 0: 
      i = 4;
      break;
    case 1: 
      i = 1;
      break;
    case 2: 
      i = 2;
      break;
    case 3: 
      i = 4;
      break;
    case 4: 
      i = 6;
      break;
    case 5: 
      i = 8;
      break;
    case 6: 
      i = 12;
      break;
    case 7: 
    case 8: 
      i = 16;
      break;
    }
    return i;
  }
  
  private static int a(char[] paramArrayOfChar, int paramInt)
  {
    paramInt += 1;
    while (paramInt < paramArrayOfChar.length)
    {
      if (paramArrayOfChar[paramInt] == '\'')
      {
        if ((paramInt + 1 == paramArrayOfChar.length) || (paramArrayOfChar[(paramInt + 1)] != '\'')) {
          break;
        }
        paramInt++;
      }
      paramInt++;
    }
    return paramInt;
  }
  
  private static int b(char[] paramArrayOfChar, int paramInt)
  {
    int i = 1;
    paramInt++;
    while (paramInt < paramArrayOfChar.length)
    {
      switch (paramArrayOfChar[paramInt])
      {
      case ']': 
        i--;
        if (i == 0) {
          return paramInt;
        }
        break;
      case '[': 
        i++;
        break;
      case '\'': 
        if ((paramInt + 1 < paramArrayOfChar.length) && (paramArrayOfChar[(paramInt + 1)] == '#')) {
          paramInt++;
        } else {
          paramInt = a(paramArrayOfChar, paramInt);
        }
        break;
      }
      paramInt++;
    }
    return paramInt;
  }
  
  static int a(String paramString, char paramChar)
  {
    char[] arrayOfChar = paramString.toCharArray();
    for (int i = 0; i < arrayOfChar.length; i++) {
      if (arrayOfChar[i] == '[')
      {
        i = b(arrayOfChar, i);
      }
      else
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
    }
    return -1;
  }
  
  private static void a(StringBuilder paramStringBuilder, String paramString, int paramInt)
  {
    char[] arrayOfChar = paramString.toCharArray();
    int i = paramStringBuilder.length();
    int j = 0;
    int k = 0;
    int m = 0;
    for (int n = 0; n < arrayOfChar.length; n++) {
      switch (arrayOfChar[n])
      {
      case '#': 
      case '\'': 
      case '@': 
      case '[': 
      case ']': 
        k = 1;
        paramStringBuilder.append('\'');
        paramStringBuilder.append(arrayOfChar[n]);
        m = 1;
        break;
      case '!': 
      case '"': 
      case '$': 
      case '%': 
      case '&': 
      case '(': 
      case ')': 
      case '+': 
      case ',': 
      case '-': 
      case '.': 
      case '/': 
      case ';': 
      case '<': 
      case '=': 
      case '>': 
      case '\\': 
      case '{': 
      case '|': 
      case '}': 
      case '~': 
        k = 1;
        m = 1;
        paramStringBuilder.append(arrayOfChar[n]);
        break;
      case ' ': 
      case '　': 
        m = 1;
        paramStringBuilder.append(arrayOfChar[n]);
        break;
      default: 
        paramStringBuilder.append(arrayOfChar[n]);
      }
    }
    switch (paramInt)
    {
    case 1: 
      if (k == 0) {
        j = (arrayOfChar[0] == ' ') || (arrayOfChar[(arrayOfChar.length - 1)] == ' ') ? 1 : 0;
      }
      if (j != 0)
      {
        paramStringBuilder.insert(i, '[');
        paramStringBuilder.append(']');
      }
      break;
    case 2: 
      if (m != 0)
      {
        paramStringBuilder.insert(i, '[');
        paramStringBuilder.append(']');
      }
      break;
    }
  }
  
  private static String b(String paramString)
  {
    char[] arrayOfChar = paramString.toCharArray();
    int i = 0;
    int j = arrayOfChar.length;
    if ((arrayOfChar.length > 3) && (arrayOfChar[0] == '[') && (arrayOfChar[(arrayOfChar.length - 1)] == ']') && (arrayOfChar[(arrayOfChar.length - 2)] != '\''))
    {
      i++;
      j--;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    for (int k = i; k < j; k++) {
      if (arrayOfChar[k] == '\'')
      {
        if (k + 1 < arrayOfChar.length) {
          switch (arrayOfChar[(k + 1)])
          {
          case '#': 
          case '\'': 
          case '[': 
          case ']': 
            localStringBuilder.append(arrayOfChar[(k + 1)]);
            k++;
            break;
          default: 
            localStringBuilder.append(arrayOfChar[k]);
            break;
          }
        }
      }
      else if (arrayOfChar[k] == '[') {
        localStringBuilder.delete(0, 0 + localStringBuilder.length());
      } else if (arrayOfChar[k] != ']') {
        localStringBuilder.append(arrayOfChar[k]);
      }
    }
    return zs.a(localStringBuilder);
  }
  
  static byte[] a(byte[] paramArrayOfByte, WorksheetCollection paramWorksheetCollection, int paramInt1, int paramInt2, int paramInt3, String paramString, int paramInt4, boolean[] paramArrayOfBoolean)
  {
    paramArrayOfByte[0] = 24;
    paramArrayOfByte[1] = 25;
    int i = a(paramString, '!');
    int j = 0;
    int k = 0;
    int m = 0;
    if (i != -1)
    {
      k = 1;
      str1 = paramString.substring(0, 0 + i);
      paramString = paramString.substring(i + 1).trim();
      str1 = zaap.a(str1);
      int[] arrayOfInt = zaap.a(paramWorksheetCollection, str1, false);
      j = arrayOfInt[0];
      int n = arrayOfInt[1];
      m = n != paramWorksheetCollection.v() ? 1 : 0;
      int i1 = arrayOfInt[2];
      int i2 = arrayOfInt[3];
      paramInt1 = i1;
    }
    else
    {
      j = paramWorksheetCollection.r().b(paramWorksheetCollection.v(), paramInt1);
    }
    System.arraycopy(zc.a(j), 0, paramArrayOfByte, 2, 2);
    String str1 = null;
    if (paramString.charAt(0) != '[')
    {
      i = paramString.indexOf('[');
      if (i == -1)
      {
        str1 = paramString;
        paramString = null;
      }
      else
      {
        str1 = paramString.substring(0, 0 + i);
        paramString = paramString.substring(i).trim();
      }
    }
    String str2 = null;
    Object localObject1 = null;
    String str3 = null;
    if (paramString != null) {
      if (paramString.indexOf("],") != -1)
      {
        i = paramString.indexOf("],");
        str2 = paramString.substring(3, 3 + (i - 3)).toUpperCase();
        int i3 = paramString.indexOf("],", i + 3);
        if (i3 != -1)
        {
          i = i3;
          str2 = "DATAHEADERS";
        }
        str5 = paramString.substring(i + 2, i + 2 + (paramString.length() - (i + 3))).toUpperCase();
        i = str5.indexOf("]:[");
        if (i != -1)
        {
          localObject1 = str5.substring(1, 1 + (i - 1));
          str3 = str5.substring(i + 3, i + 3 + (str5.length() - (i + 4)));
        }
        else
        {
          str5 = str5.substring(1, 1 + (str5.length() - 2));
          localObject1 = str5;
        }
      }
      else
      {
        paramString = paramString.substring(1, 1 + (paramString.length() - 2)).toUpperCase();
        if ((paramString != null) && (!"".equals(paramString)))
        {
          if ("[#ALL]".equals(paramString)) {
            paramString = paramString.substring(1, 1 + (paramString.length() - 2)).trim();
          }
          if ((paramString.length() > 0) && (paramString.charAt(0) == '@'))
          {
            paramString = paramString.substring(1);
            str2 = "THIS ROW";
            if ((paramString.length() > 0) && (paramString.charAt(0) == '[')) {
              paramString = paramString.substring(1, 1 + (paramString.length() - 2));
            }
          }
          if ((paramString.charAt(0) == '#') && (paramString.length() > 1))
          {
            str2 = paramString.substring(1);
          }
          else
          {
            i = paramString.indexOf("]:");
            if (i != -1)
            {
              String[] arrayOfString = zw.d(paramString, ':');
              localObject1 = arrayOfString[0];
              str3 = arrayOfString[1];
            }
            else
            {
              localObject1 = paramString;
            }
          }
        }
      }
    }
    String str4 = 0;
    if ((localObject1 == null) || ("".equals(localObject1)))
    {
      localObject1 = null;
    }
    else
    {
      localObject1 = b((String)localObject1);
      str4++;
    }
    if ((str3 == null) || ("".equals(str3)))
    {
      str3 = null;
    }
    else
    {
      str4++;
      str3 = b(str3);
    }
    String str5 = str4;
    int i4;
    int i5;
    switch (paramInt4)
    {
    case 32: 
      break;
    case 64: 
      str5 |= 0x400;
      break;
    case 96: 
      i4 |= 0x800;
      break;
    }
    i5 |= a(str2) << 2;
    if (m != 0)
    {
      i5 |= 0x2000;
      paramArrayOfBoolean[0] = false;
      System.arraycopy(zc.a(i5), 0, paramArrayOfByte, 4, 2);
      localObject2 = new zcy(16);
      ((zcy)localObject2).a((byte)(str4 != 0 ? 1 : 0));
      ((zcy)localObject2).a((byte)a(str2));
      ((zcy)localObject2).a((byte)0);
      ((zcy)localObject2).a(zc.a(str1.length()), 0, 2);
      ((zcy)localObject2).a(Encoding.getUnicode().a(str1), 0, str1.length() << 1);
      if (str4 > 0)
      {
        ((zcy)localObject2).a(2);
        ((zcy)localObject2).a((byte)str4);
        ((zcy)localObject2).a((byte)(str4 > 1 ? 0 : 1));
        ((zcy)localObject2).a((byte)2);
        ((zcy)localObject2).a(1);
        localObject3 = localObject1;
        ((zcy)localObject2).a(zc.a(((String)localObject3).length()), 0, 2);
        ((zcy)localObject2).a(Encoding.getUnicode().a((String)localObject3), 0, ((String)localObject3).length() << 1);
        if (str4 > 1)
        {
          ((zcy)localObject2).a((byte)0);
          ((zcy)localObject2).a((byte)2);
          ((zcy)localObject2).a(1);
          localObject3 = str3;
          ((zcy)localObject2).a(zc.a(((String)localObject3).length()), 0, 2);
          ((zcy)localObject2).a(Encoding.getUnicode().a((String)localObject3), 0, ((String)localObject3).length() << 1);
        }
      }
      return ((zcy)localObject2).a();
    }
    Object localObject2 = null;
    Object localObject3 = null;
    int i6 = -1;
    int i7;
    int i8;
    ListObject localListObject2;
    if (str1 == null)
    {
      localObject2 = paramWorksheetCollection.get(paramInt1).getListObjects();
      for (i7 = 0; i7 < ((ListObjectCollection)localObject2).getCount(); i7++)
      {
        ListObject localListObject1 = ((ListObjectCollection)localObject2).get(i7);
        if ((localListObject1.getStartRow() <= paramInt2) && (localListObject1.getStartColumn() <= paramInt3) && (localListObject1.getEndRow() >= paramInt2) && (localListObject1.getEndColumn() >= paramInt3))
        {
          localObject3 = localListObject1;
          i6 = ((ListObject)localObject3).a();
          break;
        }
      }
    }
    else
    {
      for (i7 = 0; i7 < paramWorksheetCollection.getCount(); i7++)
      {
        localObject2 = paramWorksheetCollection.get(i7).getListObjects();
        i8 = 0;
        for (int i9 = 0; i9 < ((ListObjectCollection)localObject2).getCount(); i9++)
        {
          localListObject2 = ((ListObjectCollection)localObject2).get(i9);
          if (zw.a(localListObject2.o(), str1, true) == 0)
          {
            localObject3 = localListObject2;
            i6 = ((ListObject)localObject3).a();
            if ((k == 0) && (paramInt1 != i7))
            {
              j = paramWorksheetCollection.r().b(paramWorksheetCollection.v(), i7);
              System.arraycopy(zc.a(j), 0, paramArrayOfByte, 2, 2);
            }
            i8 = 1;
            break;
          }
        }
        if (i8 != 0) {
          break;
        }
      }
    }
    paramArrayOfBoolean[0] = false;
    if (localObject3 == null)
    {
      paramArrayOfByte[5] = 48;
      paramArrayOfByte[6] = -1;
      paramArrayOfByte[7] = -1;
      paramArrayOfByte[8] = -1;
      paramArrayOfByte[9] = -1;
      paramArrayOfBoolean[0] = true;
      return null;
    }
    System.arraycopy(zc.a(i6), 0, paramArrayOfByte, 6, 4);
    System.arraycopy(zc.a(i5), 0, paramArrayOfByte, 4, 2);
    if (str4 > 0)
    {
      i7 = -1;
      i8 = -1;
      String str6 = localObject1 != null ? ((String)localObject1).toUpperCase() : null;
      localListObject2 = str3 != null ? str3.toUpperCase() : null;
      for (int i10 = 0; i10 < ((ListObject)localObject3).getListColumns().getCount(); i10++)
      {
        ListColumn localListColumn = ((ListObject)localObject3).getListColumns().get(i10);
        if (zw.b(localListColumn.getName().toUpperCase(), str6))
        {
          i7 = i10;
          if (i8 == -1) {
            i8 = i10;
          }
        }
        else if (zw.b(localListColumn.getName().toUpperCase(), localListObject2))
        {
          i8 = i10;
        }
      }
      if (i7 != -1)
      {
        System.arraycopy(zc.a(i7), 0, paramArrayOfByte, 10, 2);
        System.arraycopy(zc.a(i8), 0, paramArrayOfByte, 12, 2);
      }
      else
      {
        paramArrayOfByte[5] = 48;
        paramArrayOfByte[6] = -1;
        paramArrayOfByte[7] = -1;
        paramArrayOfByte[8] = -1;
        paramArrayOfByte[9] = -1;
      }
    }
    return null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbvl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */