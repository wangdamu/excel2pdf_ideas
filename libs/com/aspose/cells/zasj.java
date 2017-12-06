package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;

class zasj
{
  String a;
  boolean b;
  int c;
  int d = 7;
  ArrayList e = new ArrayList();
  ArrayList f = new ArrayList();
  static String[] g = { "style", "long" };
  boolean h;
  private static final za i = new za(new String[] { "black", "whiter", "red", "orange", "yellow", "green", "blue", "pink", "purple", "gold" });
  
  static int a(char[] paramArrayOfChar, char paramChar, int paramInt)
  {
    
    while (paramInt < paramArrayOfChar.length)
    {
      char c1 = paramArrayOfChar[paramInt];
      if (c1 == paramChar) {
        return paramInt;
      }
      paramInt++;
    }
    return paramInt;
  }
  
  static int b(char[] paramArrayOfChar, char paramChar, int paramInt)
  {
    
    while (paramInt < paramArrayOfChar.length)
    {
      char c1 = paramArrayOfChar[paramInt];
      if (c1 != paramChar) {
        return paramInt;
      }
      paramInt++;
    }
    return paramInt;
  }
  
  static int c(char[] paramArrayOfChar, char paramChar, int paramInt)
  {
    
    while (paramInt < paramArrayOfChar.length)
    {
      char c1 = paramArrayOfChar[paramInt];
      if ((c1 != paramChar) && (c1 + ' ' != paramChar)) {
        return paramInt;
      }
      paramInt++;
    }
    return paramInt;
  }
  
  static int a(char[] paramArrayOfChar, int paramInt, boolean[] paramArrayOfBoolean1, boolean[] paramArrayOfBoolean2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    while (paramInt < paramArrayOfChar.length)
    {
      int j = paramArrayOfChar[paramInt];
      switch (j)
      {
      case 35: 
        paramArrayOfInt2[0] += 1;
        break;
      case 48: 
        paramArrayOfInt1[0] += 1;
        paramArrayOfInt2[0] += 1;
        break;
      case 44: 
        paramArrayOfBoolean1[0] = true;
        break;
      case 46: 
        paramArrayOfBoolean2[0] = true;
        return paramInt;
      default: 
        return paramInt;
      }
      paramInt++;
    }
    return paramInt;
  }
  
  static int a(char[] paramArrayOfChar, int paramInt, int[] paramArrayOfInt, boolean[] paramArrayOfBoolean)
  {
    while (paramInt < paramArrayOfChar.length)
    {
      int j = paramArrayOfChar[paramInt];
      switch (j)
      {
      case 35: 
        paramArrayOfInt[0] += 1;
        break;
      case 48: 
        paramArrayOfInt[0] += 1;
        paramArrayOfBoolean[0] = false;
        break;
      default: 
        return paramInt;
      }
      paramInt++;
    }
    return paramInt;
  }
  
  static int a(char[] paramArrayOfChar, int paramInt, int[] paramArrayOfInt)
  {
    while (paramInt < paramArrayOfChar.length)
    {
      int j = paramArrayOfChar[paramInt];
      switch (j)
      {
      case 35: 
      case 48: 
        paramArrayOfInt[0] += 1;
        break;
      case 43: 
      case 45: 
        break;
      default: 
        return paramInt;
      }
      paramInt++;
    }
    return paramInt;
  }
  
  void a(String paramString1, int paramInt, String paramString2)
  {
    this.f = new ArrayList();
    this.a = paramString1;
    this.c = paramInt;
    char[] arrayOfChar = paramString2.toCharArray();
    zasy localzasy = null;
    int j = -1;
    String str = null;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    for (int i3 = 0; i3 < arrayOfChar.length; i3++)
    {
      char c1 = arrayOfChar[i3];
      int i5;
      Object localObject;
      switch (c1)
      {
      case '"': 
        j = a(arrayOfChar, c1, i3);
        localzasy = new zasy(0, paramString2.substring(i3 + 1, i3 + 1 + (j - i3 - 1)));
        zf.a(this.f, localzasy);
        i3 = j;
        break;
      case '$': 
      case '€': 
      case '￡': 
      case '￥': 
        localzasy = new zasy(3, Character.toString(c1));
        zf.a(this.f, localzasy);
        this.d = 0;
        break;
      case '?': 
        j = a(arrayOfChar, '/', i3);
        if (j < arrayOfChar.length)
        {
          this.d = 1;
          localzasy = new zasy(13, null);
          zf.a(localzasy.b, new String[] { "min-numerator-digits", zasp.a(j - i3) });
          i3 = j;
          j = b(arrayOfChar, '?', j);
          zf.a(localzasy.b, new String[] { "min-denominator-digits", zasp.a(j - i3) });
          zf.a(this.f, localzasy);
          i3 = j - 1;
        }
        break;
      case '%': 
        this.d = 6;
        localzasy = new zasy(0, "%");
        zf.a(this.f, localzasy);
        break;
      case '[': 
        j = a(arrayOfChar, ']', i3);
        str = paramString2.substring(i3 + 1, i3 + 1 + (j - i3 - 1));
        if ((str.length() == 1) && ((str.charAt(0) == 'H') || (str.charAt(0) == 'h')))
        {
          zf.a(this.e, new String[] { "number:truncate-on-overflow", "false" });
          localzasy = new zasy(9, null);
          zf.a(this.f, localzasy);
        }
        else if (str.charAt(0) != '$')
        {
          switch (i.a(str.toLowerCase()))
          {
          case 0: 
          case 1: 
          case 2: 
          case 3: 
          case 4: 
          case 5: 
          case 6: 
          case 7: 
          case 8: 
          case 9: 
            Color localColor = Color.a(str);
            if (!localColor.isEmpty())
            {
              localzasy = new zasy(2, null);
              zf.a(localzasy.b, new String[] { "color", zasp.b(localColor) });
              zf.a(this.f, localzasy);
            }
            break;
          }
        }
        i3 = j;
        break;
      case 'Y': 
      case 'y': 
        j = c(arrayOfChar, 'y', i3);
        this.d = 2;
        localzasy = new zasy(6, null);
        if (j - i3 > 2) {
          zf.a(localzasy.b, g);
        }
        zf.a(this.f, localzasy);
        i3 = j - 1;
        break;
      case 'M': 
      case 'm': 
        j = c(arrayOfChar, 'm', i3);
        if (((j < arrayOfChar.length) && (arrayOfChar[j] == ':')) || ((i3 != 0) && (arrayOfChar[(i3 - 1)] == ':')) || (this.d == 3))
        {
          if (this.d == 7) {
            this.d = 3;
          }
          localzasy = new zasy(10, null);
          if (j - i3 >= 2) {
            zf.a(localzasy.b, g);
          }
          zf.a(this.f, localzasy);
        }
        else
        {
          this.d = 2;
          localzasy = new zasy(7, null);
          switch (j - i3)
          {
          case 1: 
            break;
          case 2: 
            zf.a(localzasy.b, g);
            break;
          case 3: 
            zf.a(localzasy.b, new String[] { "textual", "true" });
            break;
          case 5: 
            zf.a(localzasy.b, new String[] { "textual", "true" });
            break;
          case 4: 
          default: 
            zf.a(localzasy.b, new String[] { "textual", "true" });
            zf.a(localzasy.b, g);
          }
          zf.a(this.f, localzasy);
        }
        i3 = j - 1;
        break;
      case 'D': 
      case 'd': 
        j = c(arrayOfChar, 'd', i3);
        this.d = 2;
        int i4 = j - i3;
        switch (i4)
        {
        case 4: 
          localzasy = new zasy(15, null);
          break;
        default: 
          localzasy = new zasy(8, null);
        }
        if (j - i3 >= 2) {
          zf.a(localzasy.b, g);
        }
        zf.a(this.f, localzasy);
        i3 = j - 1;
        break;
      case 'H': 
      case 'h': 
        j = c(arrayOfChar, 'h', i3);
        localzasy = new zasy(9, null);
        if (this.d == 7) {
          this.d = 3;
        }
        if (j - i3 >= 2) {
          zf.a(localzasy.b, g);
        }
        zf.a(this.f, localzasy);
        i3 = j - 1;
        break;
      case 'S': 
      case 's': 
        j = c(arrayOfChar, 's', i3);
        localzasy = new zasy(11, null);
        if (this.d == 7) {
          this.d = 3;
        }
        if (j - i3 >= 2) {
          zf.a(localzasy.b, g);
        }
        i3 = j;
        if ((j != arrayOfChar.length) && (arrayOfChar[j] == '.'))
        {
          j = b(arrayOfChar, '0', i3);
          zf.a(localzasy.b, new String[] { "decimal-places", zasp.a(j - i3 - 1) });
        }
        zf.a(this.f, localzasy);
        i3 = j - 1;
        break;
      case 'A': 
      case 'a': 
        if ((i3 != arrayOfChar.length - 1) && ((arrayOfChar[(i3 + 1)] == 'M') || (arrayOfChar[(i3 + 1)] == 'm')))
        {
          localzasy = new zasy(12, null);
          zf.a(this.f, localzasy);
          i3 += 4;
        }
        else
        {
          localzasy = new zasy(0, Character.toString(c1));
          zf.a(this.f, localzasy);
        }
        break;
      case 'E': 
      case 'e': 
        if (localzasy == null)
        {
          localzasy = new zasy(0, Character.toString(c1));
          zf.a(this.f, localzasy);
        }
        else
        {
          localzasy.a = 14;
          i5 = 0;
          localObject = new int[] { i5 };
          j = a(arrayOfChar, i3 + 1, (int[])localObject);
          i5 = localObject[0];
          zf.a(localzasy.b, new String[] { "min-exponent-digits", zasp.a(i5) });
        }
        if (n != m) {
          for (i5 = 0; i5 < localzasy.b.size(); i5++)
          {
            localObject = (String[])localzasy.b.get(i5);
            if ("min-integer-digits".equals(localObject[0]))
            {
              localzasy.b.remove(i5);
              zf.a(localzasy.b, new String[] { "min-integer-digits", zasp.a(n) });
              break;
            }
          }
        }
        i3 = j - 1;
        break;
      case '@': 
        if (this.d == 7) {
          this.d = 5;
        }
        localzasy = new zasy(1, null);
        zf.a(this.f, localzasy);
        break;
      case '#': 
      case '0': 
        i5 = 0;
        if (this.d == 7) {
          this.d = 1;
        }
        localObject = new boolean[] { i1 };
        boolean[] arrayOfBoolean1 = { i5 };
        int[] arrayOfInt1 = { m };
        int[] arrayOfInt2 = { n };
        j = a(arrayOfChar, i3, (boolean[])localObject, arrayOfBoolean1, arrayOfInt1, arrayOfInt2);
        i1 = localObject[0];
        i5 = arrayOfBoolean1[0];
        m = arrayOfInt1[0];
        n = arrayOfInt2[0];
        localzasy = new zasy(4, null);
        zf.a(this.f, localzasy);
        zf.a(localzasy.b, new String[] { "min-integer-digits", zasp.a(m) });
        if (i1 != 0) {
          zf.a(localzasy.b, new String[] { "grouping", "true" });
        }
        if (i5 == 0) {
          localzasy.b.add(0, new String[] { "decimal-places", "0" });
        }
        i3 = j - 1;
        break;
      case '.': 
        if (this.d == 7) {
          this.d = 1;
        }
        if ((this.d == 2) || (this.d == 3))
        {
          localzasy = new zasy(0, ".");
          zf.a(this.f, localzasy);
        }
        else
        {
          int[] arrayOfInt3 = { k };
          boolean[] arrayOfBoolean2 = { i2 };
          j = a(arrayOfChar, i3 + 1, arrayOfInt3, arrayOfBoolean2);
          k = arrayOfInt3[0];
          i2 = arrayOfBoolean2[0];
          if (localzasy == null)
          {
            localzasy = new zasy(4, null);
            zf.a(this.f, localzasy);
            zf.a(localzasy.b, new String[] { "min-integer-digits", "0" });
          }
          zf.a(localzasy.b, new String[] { "decimal-places", zasp.a(k) });
          if (i2 != 0) {
            zf.a(localzasy.b, new String[] { "decimal-replacement", "" });
          }
          i3 = j - 1;
        }
        break;
      case '_': 
        i3++;
        if ((localzasy != null) && (localzasy.a == 0))
        {
          localzasy.c += " ";
        }
        else
        {
          localzasy = new zasy(0, " ");
          zf.a(this.f, localzasy);
        }
        break;
      case '*': 
        break;
      case '\\': 
        i3++;
        if (i3 < paramString2.length())
        {
          localzasy = new zasy(0, "" + paramString2.charAt(i3));
          zf.a(this.f, localzasy);
        }
        break;
      default: 
        if ((localzasy != null) && (localzasy.a == 0))
        {
          localzasy.c += c1;
        }
        else
        {
          localzasy = new zasy(0, Character.toString(c1));
          zf.a(this.f, localzasy);
        }
        break;
      }
    }
  }
  
  void a(int paramInt)
  {
    this.b = true;
    this.c = paramInt;
    this.a = ("N" + paramInt);
  }
  
  void b(int paramInt)
  {
    this.h = true;
    zasy localzasy = null;
    String str1 = "condition";
    String str2 = "apply-style-name";
    switch (paramInt)
    {
    case 2: 
      localzasy = new zasy(5, null);
      zf.a(localzasy.b, new String[] { str1, "value()>=0" });
      zf.a(localzasy.b, new String[] { str2, "N" + this.c + "P" + 0 });
      zf.a(this.f, localzasy);
      break;
    case 3: 
    case 4: 
      localzasy = new zasy(5, null);
      zf.a(localzasy.b, new String[] { str1, "value()>0" });
      zf.a(localzasy.b, new String[] { str2, "N" + this.c + "P" + 0 });
      zf.a(this.f, localzasy);
      localzasy = new zasy(5, null);
      zf.a(localzasy.b, new String[] { str1, "value()<0" });
      zf.a(localzasy.b, new String[] { str2, "N" + this.c + "P" + 1 });
      zf.a(this.f, localzasy);
      if (paramInt == 4)
      {
        localzasy = new zasy(5, null);
        zf.a(localzasy.b, new String[] { str1, "value()=0" });
        zf.a(localzasy.b, new String[] { str2, "N" + this.c + "P" + 2 });
        zf.a(this.f, localzasy);
      }
      break;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zasj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */