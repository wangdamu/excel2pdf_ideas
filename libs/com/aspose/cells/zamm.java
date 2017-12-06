package com.aspose.cells;

import com.aspose.cells.b.a.d.zk;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.d.zn;
import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.a.zw;
import java.util.HashMap;

class zamm
{
  private static zmw a;
  private static final com.aspose.cells.b.c.a.za b = new com.aspose.cells.b.c.a.za(new String[] { ".xls", ".xlsx", ".xlsm", ".xltx", ".xltm", ".xlam", ".xml", ".xlsb", ".txt", ".csv", ".ods", ".htm", ".html", ".mht", ".mhtml", ".numbers", ".ots", "From", "Message-ID", "Subject", "MIME-Version", "Content-Type" });
  
  static zmw a()
  {
    if (a == null) {
      a = new zmw();
    }
    return a;
  }
  
  static int a(String paramString, zm paramzm, boolean[] paramArrayOfBoolean, int[] paramArrayOfInt)
    throws Exception
  {
    paramArrayOfBoolean[0] = false;
    int i = 6;
    if (paramzm.h() < 8L)
    {
      paramArrayOfInt[0] = 0;
      localObject = zk.d(paramString);
      if (localObject != null) {
        switch (b.a(((String)localObject).toLowerCase()))
        {
        case 0: 
          paramArrayOfBoolean[0] = true;
          i = 5;
          break;
        case 1: 
        case 2: 
        case 3: 
        case 4: 
        case 5: 
          paramArrayOfBoolean[0] = true;
          i = 6;
          break;
        case 6: 
          paramArrayOfBoolean[0] = true;
          i = 15;
          break;
        case 7: 
          paramArrayOfBoolean[0] = true;
          i = 16;
          break;
        case 8: 
          paramArrayOfBoolean[0] = true;
          i = 11;
          break;
        case 9: 
          paramArrayOfBoolean[0] = true;
          i = 1;
          break;
        case 10: 
          paramArrayOfBoolean[0] = true;
          i = 14;
          break;
        case 11: 
        case 12: 
          paramArrayOfBoolean[0] = true;
          i = 12;
          break;
        case 13: 
        case 14: 
          paramArrayOfBoolean[0] = true;
          i = 13;
          break;
        case 15: 
          i = 56;
          break;
        }
      }
      return i;
    }
    Object localObject = new com.aspose.cells.b.a.d.za(paramzm);
    long l = ((com.aspose.cells.b.a.d.za)localObject).s();
    paramArrayOfInt[0] = ((int)(l & 0xFFFF));
    paramzm.a(-8L, 1);
    if (l == -2226271756974174256L)
    {
      paramArrayOfBoolean[0] = true;
      i = 5;
    }
    else if ((l & 0xFFFFFFFF) == 67324752L)
    {
      paramArrayOfBoolean[0] = true;
      i = 6;
      if (paramString != null)
      {
        String str1 = zk.d(paramString);
        if (str1 != null) {
          switch (b.a(str1.toLowerCase()))
          {
          case 1: 
          case 2: 
          case 3: 
          case 4: 
          case 5: 
            i = 6;
            break;
          case 7: 
            i = 16;
            break;
          case 10: 
          case 16: 
            i = 14;
            break;
          case 15: 
            i = 56;
            break;
          }
        }
      }
    }
    else
    {
      int j = a(paramzm, (com.aspose.cells.b.a.d.za)localObject, l);
      switch (j)
      {
      case 1: 
        paramArrayOfBoolean[0] = true;
        i = 15;
        break;
      case 2: 
        paramArrayOfBoolean[0] = true;
        i = 12;
        break;
      case 3: 
        paramArrayOfBoolean[0] = true;
        i = 13;
      }
    }
    if ((paramArrayOfBoolean[0] == 0) && (paramString != null))
    {
      String str2 = zk.d(paramString);
      if (str2 != null) {
        switch (b.a(str2.toLowerCase()))
        {
        case 9: 
          paramArrayOfBoolean[0] = true;
          return 1;
        case 8: 
          paramArrayOfBoolean[0] = true;
          return 11;
        case 13: 
        case 14: 
          paramArrayOfBoolean[0] = true;
          return 13;
        case 11: 
        case 12: 
          paramArrayOfBoolean[0] = true;
          return 12;
        }
      }
    }
    return i;
  }
  
  static int a(zm paramzm, com.aspose.cells.b.a.d.za paramza, long paramLong)
    throws Exception
  {
    int i = 0;
    if ((paramLong & 0xFFFFFF) == 12565487L)
    {
      paramzm.a(3L, 1);
      paramLong >>= 24;
    }
    else if (((paramLong & 0xFFFF) == 65279L) || ((paramLong & 0xFFFF) == 65534L))
    {
      paramza = new com.aspose.cells.b.a.d.za(paramzm, Encoding.getUnicode());
      paramzm.a(2L, 1);
      i = 1;
      paramLong >>= 16;
    }
    while (((paramLong & 0xFF) == 10L) || ((paramLong & 0xFF) == 13L) || ((paramLong & 0xFF) == 9L))
    {
      paramLong >>= 8;
      paramzm.a(1L, 1);
    }
    Object localObject;
    if ((paramLong & 0xFF) == 60L)
    {
      localObject = zbsn.a(paramza, 5, i > 0).toLowerCase();
      if (((String)localObject).equals("<?xml"))
      {
        paramzm.a(0L, 0);
        return 1;
      }
      if ((((String)localObject).equals("<html")) || (((String)localObject).equals("<tabl")))
      {
        paramzm.a(0L, 0);
        return 2;
      }
      if (((String)localObject).equals("<!doc"))
      {
        localObject = (String)localObject + zbsn.a(paramza, 9, i > 0).toLowerCase();
        if ("<!doctype html".equals(localObject))
        {
          paramzm.a(0L, 0);
          return 2;
        }
      }
    }
    if ((paramLong & 0xFF) == 77L)
    {
      localObject = zbsn.a(paramza, 4, i > 0).toLowerCase();
      if (((String)localObject).equals("mime"))
      {
        paramzm.a(0L, 0);
        return 3;
      }
    }
    else if ((paramLong & 0xFFFFFFFFFF) == 250944123462L)
    {
      localObject = new zn(paramzm);
      int j = 1;
      while ((j != 0) && (((zn)localObject).c() != -1))
      {
        String str1 = ((zn)localObject).f();
        int k = str1.indexOf(':');
        if (k != -1)
        {
          String str2 = str1.substring(0, 0 + k).trim();
          switch (b.a(str2))
          {
          case 17: 
          case 18: 
          case 19: 
          case 20: 
            break;
          case 21: 
            paramzm.a(0L, 0);
            if (str1.indexOf("multipart/") != -1) {
              return 3;
            }
            j = 0;
          }
        }
      }
    }
    paramzm.a(0L, 0);
    return -1;
  }
  
  public static boolean a(String paramString)
  {
    char[] arrayOfChar = paramString.toCharArray();
    for (int i = 0; i < arrayOfChar.length; i++)
    {
      if (i == 0)
      {
        if (Character.isDigit(arrayOfChar[i])) {
          return true;
        }
        switch (arrayOfChar[i])
        {
        case 'C': 
        case 'R': 
        case 'c': 
        case 'r': 
          if ((i + 1 < arrayOfChar.length) && (Character.isDigit(arrayOfChar[(i + 1)]))) {
            return true;
          }
          break;
        }
      }
      switch (arrayOfChar[i])
      {
      case ' ': 
      case '!': 
      case '"': 
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
      case '’': 
      case '”': 
      case '　': 
        return true;
      }
      if (arrayOfChar[i] > 65280) {
        return true;
      }
    }
    return c(paramString);
  }
  
  public static boolean b(String paramString)
  {
    char[] arrayOfChar = paramString.toCharArray();
    for (int i = 0; i < arrayOfChar.length; i++) {
      switch (arrayOfChar[i])
      {
      case '!': 
      case '+': 
      case '-': 
      case '[': 
      case ']': 
        return true;
      }
    }
    int[] arrayOfInt = CellsHelper.a(arrayOfChar, 0, arrayOfChar.length - 1, false, 1048575, 16383);
    if ((arrayOfInt == null) || (arrayOfInt[0] == -1)) {
      return false;
    }
    if (arrayOfInt[0] == -1) {
      return false;
    }
    return arrayOfInt[1] <= 16383;
  }
  
  public static boolean c(String paramString)
  {
    if ((paramString == null) || ("".equals(paramString))) {
      return false;
    }
    int[] arrayOfInt = CellsHelper.a(paramString.toCharArray(), 0, paramString.length() - 1, false, 1048575, 16383);
    if (arrayOfInt == null) {
      return false;
    }
    int i = arrayOfInt[0];
    int j = arrayOfInt[1];
    return (i >= 0) && (i <= 1048575) && (j >= 0) && (j <= 16383);
  }
  
  public static boolean a(char[] paramArrayOfChar)
  {
    if ((paramArrayOfChar == null) || (paramArrayOfChar.length == 0)) {
      return false;
    }
    int[] arrayOfInt = CellsHelper.a(paramArrayOfChar, 0, paramArrayOfChar.length - 1, false, 1048575, 16383);
    if (arrayOfInt == null) {
      return false;
    }
    int i = arrayOfInt[0];
    int j = arrayOfInt[1];
    return (i >= 0) && (i <= 1048575) && (j >= 0) && (j <= 16383);
  }
  
  static void a(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 1048575)) {
      throw new IllegalArgumentException("Invalid row index.");
    }
  }
  
  static void b(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 16383)) {
      throw new IllegalArgumentException("Invalid column index.");
    }
  }
  
  static void a(int paramInt1, int paramInt2)
  {
    if ((paramInt1 < 0) || (paramInt1 > 1048575)) {
      throw new IllegalArgumentException("Invalid row index.");
    }
    if ((paramInt2 < 0) || (paramInt2 > 16383)) {
      throw new IllegalArgumentException("Invalid column index.");
    }
  }
  
  static void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt1 < 0) || (paramInt1 > 1048575)) {
      throw new IllegalArgumentException("Invalid start row index.");
    }
    if ((paramInt2 < 0) || (paramInt2 > 16383)) {
      throw new IllegalArgumentException("Invalid start column index.");
    }
    if ((paramInt3 < 0) || (paramInt3 > 1048575) || (paramInt3 < paramInt1)) {
      throw new IllegalArgumentException("Invalid end row index.");
    }
    if ((paramInt4 < 0) || (paramInt4 > 16383) || (paramInt4 < paramInt2)) {
      throw new IllegalArgumentException("Invalid end column index.");
    }
  }
  
  static void b(int paramInt1, int paramInt2)
  {
    if ((paramInt1 < 0) || (paramInt1 > 1048575)) {
      throw new IllegalArgumentException("Invalid start row index.");
    }
    if ((paramInt2 < 0) || (paramInt2 > 1048575) || (paramInt2 < paramInt1)) {
      throw new IllegalArgumentException("Invalid end row index.");
    }
  }
  
  static void c(int paramInt1, int paramInt2)
  {
    if ((paramInt1 < 0) || (paramInt1 > 16383)) {
      throw new IllegalArgumentException("Invalid start column index.");
    }
    if ((paramInt2 < 0) || (paramInt2 > 16383) || (paramInt2 < paramInt1)) {
      throw new IllegalArgumentException("Invalid end column index.");
    }
  }
  
  static String a(WorksheetCollection paramWorksheetCollection)
  {
    String str = "Evaluation Warning";
    int i = 0;
    for (int j = 0; j < paramWorksheetCollection.getCount(); j++) {
      if (zw.b(paramWorksheetCollection.get(j).getName(), str))
      {
        i++;
        str = "Evaluation Warning (" + zp.a(i) + ")";
        j = 0;
      }
    }
    return str;
  }
  
  static String b(WorksheetCollection paramWorksheetCollection)
  {
    String str;
    for (;;)
    {
      paramWorksheetCollection.f += 1;
      str = "Sheet" + paramWorksheetCollection.f;
      if (paramWorksheetCollection.get(str) == null) {
        break;
      }
    }
    return str;
  }
  
  static String a(WorksheetCollection paramWorksheetCollection, String paramString)
  {
    int i = 2;
    if (paramString.charAt(paramString.length() - 1) == ')')
    {
      int j = paramString.lastIndexOf('(');
      k = 0;
      int m = 0;
      if (j != -1)
      {
        paramString = zw.a(paramString.substring(0, 0 + j));
        char[] arrayOfChar = paramString.toCharArray();
        j++;
        while (j < arrayOfChar.length - 1)
        {
          if (Character.isDigit(arrayOfChar[j]))
          {
            k = 1;
            m = m * 10 + (arrayOfChar[j] - '0');
          }
          else
          {
            k = 0;
            break;
          }
          j++;
        }
      }
      if (k != 0) {
        i = m + 1;
      }
    }
    HashMap localHashMap = new HashMap(paramWorksheetCollection.getCount());
    for (int k = 0; k < paramWorksheetCollection.getCount(); k++) {
      localHashMap.put(paramWorksheetCollection.get(k).getName().toUpperCase(), paramWorksheetCollection.get(k));
    }
    for (;;)
    {
      String str = paramString + " (" + i + ")";
      if (str.length() >= 32) {
        return b(paramWorksheetCollection);
      }
      if (localHashMap.get(str.toUpperCase()) == null) {
        return str;
      }
      i++;
    }
  }
  
  static int a(zuf paramzuf)
  {
    switch (zamn.a[paramzuf.ordinal()])
    {
    case 1: 
      return 1;
    case 2: 
      return 2;
    case 3: 
      return 3;
    case 4: 
      return 4;
    case 5: 
      return 5;
    case 6: 
      return 6;
    case 7: 
      return 7;
    }
    return 0;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zamm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */