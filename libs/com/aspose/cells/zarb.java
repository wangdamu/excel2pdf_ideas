package com.aspose.cells;

import com.aspose.cells.a.c.zaa;
import com.aspose.cells.a.c.zp;
import com.aspose.cells.b.a.c.za;
import com.aspose.cells.b.a.c.zc;
import com.aspose.cells.b.a.g.a.ze;
import java.util.Calendar;
import java.util.Date;

class zarb
{
  static boolean a(String paramString)
  {
    String str = "(^\\d{0,4}[ -/.]\\d{1,2}([ -/.]\\d{0,4})?$)|(^\\d{1,2}/\\d{1,2}$)|(^[a-z]{1,9}\\s\\d{1,2},\\s*\\d{2,4}$)|(^(\\d{1,2}[ -/.]\\s)?[a-z]{1,9}[ -/.]\\d{2,4}$)|(^\\d{0,4}[ -/]\\d{1,2}[ -/]\\d{0,4},?\\s*\\d{1,2}:\\d{2}(AM|PM)?)|(^\\d{0,4}\\s*[a-z]{1,9}\\s*\\d{0,4},?\\s*\\d{1,2}:\\d{2}(AM|PM)?)";
    return ze.b(paramString, str, 66);
  }
  
  static boolean b(String paramString)
  {
    if ((paramString == null) || ("".equals(paramString))) {
      return false;
    }
    int i = 0;
    int j = 0;
    int k = -1;
    for (int m = 0; m < paramString.length(); m++) {
      switch (paramString.charAt(m))
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
        break;
      case ',': 
        if ((k != -1) && (m - k != 4)) {
          return false;
        }
        k = m;
        break;
      case '.': 
        i++;
        if (i > 1) {
          return false;
        }
        if (paramString.length() == 1) {
          return false;
        }
        if ((k != -1) && (m - k != 4)) {
          return false;
        }
        break;
      case 'E': 
      case 'e': 
        if (j > 0) {
          return false;
        }
        j++;
        if (m == 0) {
          return false;
        }
        if (m + 1 == paramString.length()) {
          return false;
        }
        if (m + 1 < paramString.length())
        {
          int n = paramString.charAt(m + 1);
          if ((n == 43) || (n == 45)) {
            m++;
          }
        }
        break;
      case '+': 
      case '-': 
        if ((m != 0) || (paramString.length() == 1)) {
          return false;
        }
        break;
      case '/': 
      case ':': 
      case ';': 
      case '<': 
      case '=': 
      case '>': 
      case '?': 
      case '@': 
      case 'A': 
      case 'B': 
      case 'C': 
      case 'D': 
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
      case '[': 
      case '\\': 
      case ']': 
      case '^': 
      case '_': 
      case '`': 
      case 'a': 
      case 'b': 
      case 'c': 
      case 'd': 
      default: 
        return false;
      }
    }
    return (k == -1) || (paramString.length() - k == 4);
  }
  
  public static boolean c(String paramString)
  {
    if ((paramString == null) || ("".equals(paramString))) {
      return false;
    }
    paramString = paramString.trim();
    if (paramString.length() == 0) {
      return false;
    }
    int i = 0;
    int j = 0;
    boolean bool = false;
    int k = zaa.a().d().c().charAt(0);
    for (int m = 0; m < paramString.length(); m++)
    {
      if ((paramString.charAt(m) < '0') || (paramString.charAt(m) > '9')) {
        if ((paramString.charAt(m) == k) || (paramString.charAt(m) == '.'))
        {
          i++;
          if ((i <= 1) && (paramString.length() != 1)) {
            continue;
          }
          return false;
        }
      }
      switch (paramString.charAt(m))
      {
      case '+': 
      case '-': 
        if ((m != 0) || (paramString.length() == 1)) {
          return false;
        }
        break;
      case 'E': 
      case 'e': 
        if ((paramString.length() == 1) || (m == 0) || (m + 1 >= paramString.length())) {
          return false;
        }
        switch (paramString.charAt(m + 1))
        {
        case '+': 
        case '-': 
          if (m + 2 >= paramString.length()) {
            return false;
          }
          if (!Character.isDigit(paramString.charAt(m + 2))) {
            return false;
          }
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
          break;
        case ',': 
        case '.': 
        case '/': 
        default: 
          return false;
        }
        j++;
        if (j > 1) {
          return false;
        }
        m++;
        break;
      default: 
        if (i != 0) {
          return false;
        }
        if (paramString.charAt(m) == za.a().d().b().charAt(0))
        {
          if (m + 3 >= paramString.length()) {
            return false;
          }
          for (int n = 0; n < 3; n++) {
            if (!Character.isDigit(paramString.charAt(m + 1 + n))) {
              return false;
            }
          }
          m += 3;
        }
        else
        {
          return false;
          bool = true;
        }
        break;
      }
    }
    return bool;
  }
  
  static boolean d(String paramString)
  {
    if ((paramString == null) || ("".equals(paramString))) {
      return false;
    }
    paramString = paramString.trim();
    if (paramString.length() == 0) {
      return false;
    }
    int i = 0;
    int j = 0;
    boolean bool = false;
    int k = zaa.a().d().c().charAt(0);
    int m = zaa.a().d().b().charAt(0);
    int n = -1;
    for (int i1 = 0; i1 < paramString.length(); i1++)
    {
      if ((paramString.charAt(i1) < '0') || (paramString.charAt(i1) > '9')) {
        if (paramString.charAt(i1) == k)
        {
          i++;
          if ((i <= 1) && (paramString.length() != 1)) {
            continue;
          }
          return false;
        }
      }
      switch (paramString.charAt(i1))
      {
      case '+': 
      case '-': 
        if ((i1 != 0) || (paramString.length() == 1)) {
          return false;
        }
        break;
      case 'E': 
        if ((paramString.length() == 1) || (i1 == 0) || (i1 > paramString.length() - 3)) {
          return false;
        }
        if ((paramString.charAt(i1 + 1) != '+') && (paramString.charAt(i1 + 1) != '-')) {
          return false;
        }
        j++;
        if (j > 1) {
          return false;
        }
        i1++;
        break;
      default: 
        if (paramString.charAt(i1) != m) {
          return false;
        }
        if ((n != -1) && (i1 - n != 4)) {
          return false;
        }
        n = i1;
        continue;
        bool = true;
      }
    }
    return bool;
  }
  
  static boolean a(char paramChar)
  {
    switch (paramChar)
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
      return true;
    }
    return false;
  }
  
  static int b(char paramChar)
  {
    switch (paramChar)
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
      return paramChar - '0';
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
      return (paramChar | 0x20) - 'a' + 10;
    }
    return -1;
  }
  
  static Object a(Object paramObject, boolean paramBoolean)
  {
    if ((paramObject instanceof Double)) {
      return (Double)paramObject;
    }
    if ((paramObject instanceof Integer)) {
      return Double.valueOf(((Integer)paramObject).intValue());
    }
    if ((paramObject instanceof DateTime)) {
      return Double.valueOf(CellsHelper.getDoubleFromDateTime((DateTime)paramObject, paramBoolean));
    }
    if ((paramObject instanceof Calendar)) {
      return Double.valueOf(CellsHelper.getDoubleFromDateTime(new DateTime((Calendar)paramObject), paramBoolean));
    }
    if ((paramObject instanceof Date)) {
      return Double.valueOf(CellsHelper.getDoubleFromDateTime(new DateTime((Date)paramObject), paramBoolean));
    }
    return null;
  }
  
  static String a(double paramDouble)
  {
    if (paramDouble == 0.0D) {
      return "0";
    }
    zbpe localzbpe = new zbpe(16);
    a(paramDouble, localzbpe);
    return localzbpe.c();
  }
  
  static void a(double paramDouble, zahh paramzahh)
  {
    if (paramDouble == 0.0D)
    {
      paramzahh.a('0');
      return;
    }
    int i;
    if (paramDouble < 0.0D)
    {
      i = 1;
      paramDouble = -paramDouble;
    }
    else
    {
      i = 0;
    }
    boolean bool = paramzahh.a();
    paramzahh.a(false);
    int j = (int)Math.floor(Math.log10(paramDouble));
    char[] arrayOfChar = zp.a(paramDouble * Math.pow(10.0D, -j)).toCharArray();
    int k;
    if (j < 0)
    {
      j = -j - 1;
      if (i != 0)
      {
        paramzahh.a(j + (arrayOfChar.length > 1 ? arrayOfChar.length + 2 : 4));
        paramzahh.a('-');
      }
      else
      {
        paramzahh.a(j + (arrayOfChar.length > 1 ? arrayOfChar.length + 1 : 3));
      }
      paramzahh.a('0');
      paramzahh.a('.');
      for (k = 0; k < j; k++) {
        paramzahh.a('0');
      }
      paramzahh.a(arrayOfChar[0]);
      if (arrayOfChar.length > 2) {
        paramzahh.a(arrayOfChar, 2, arrayOfChar.length - 2);
      }
      paramzahh.a(bool);
      return;
    }
    j += 2;
    if (j < arrayOfChar.length)
    {
      if (i != 0)
      {
        paramzahh.a(arrayOfChar.length + 1);
        paramzahh.a('-');
      }
      else
      {
        paramzahh.a(arrayOfChar.length);
      }
      paramzahh.a(arrayOfChar[0]);
      paramzahh.a(arrayOfChar, 2, j - 2);
      paramzahh.a('.');
      paramzahh.a(arrayOfChar, j, arrayOfChar.length - j);
      paramzahh.a(bool);
      return;
    }
    if (j == arrayOfChar.length)
    {
      if (i != 0)
      {
        paramzahh.a(arrayOfChar.length);
        paramzahh.a('-');
      }
      else
      {
        paramzahh.a(arrayOfChar.length - 1);
      }
      paramzahh.a(arrayOfChar[0]);
      paramzahh.a(arrayOfChar, 2, arrayOfChar.length - 2);
      paramzahh.a(bool);
      return;
    }
    if (i != 0)
    {
      paramzahh.a(j);
      paramzahh.a('-');
    }
    else
    {
      paramzahh.a(j - 1);
    }
    paramzahh.a(arrayOfChar[0]);
    if (arrayOfChar.length > 2)
    {
      paramzahh.a(arrayOfChar, 2, arrayOfChar.length - 2);
      for (k = arrayOfChar.length; k < j; k++) {
        paramzahh.a('0');
      }
    }
    else
    {
      for (k = 2; k < j; k++) {
        paramzahh.a('0');
      }
    }
    paramzahh.a(bool);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zarb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */