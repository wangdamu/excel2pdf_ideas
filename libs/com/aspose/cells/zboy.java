package com.aspose.cells;

import com.aspose.cells.a.c.zu;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.HashMap;

class zboy
  extends zawr
{
  zawp a;
  String b;
  byte[] c;
  Range d = null;
  Range e;
  
  void a()
  {
    if (this.c == null) {
      return;
    }
    this.e = this.d;
    Worksheet localWorksheet = this.a.e.a.get(0);
    this.d = ((Range)zabx.a(localWorksheet, 10, this, f(), 0, -1, 0, 0, true));
  }
  
  void a(zawr paramzawr, CopyOptions paramCopyOptions)
  {
    zboy localzboy = (zboy)paramzawr;
    WorksheetCollection localWorksheetCollection1 = localzboy.a.e.a;
    WorksheetCollection localWorksheetCollection2 = this.a.e.a;
    if (localzboy.c != null)
    {
      byte[] arrayOfByte = zaam.a(localzboy.f(), -1, 0, 0, paramCopyOptions);
      a(arrayOfByte);
    }
    this.e = paramCopyOptions.a(localzboy.e);
    this.d = paramCopyOptions.a(localzboy.d);
    this.b = localzboy.b;
  }
  
  void a(int paramInt1, int paramInt2, Worksheet paramWorksheet)
  {
    this.e = this.d;
    this.d = null;
    if (this.c != null) {
      a(zaaq.a(paramWorksheet, false, paramInt1, 0, true, paramInt2, true, 16383, -1, -1, f()));
    }
  }
  
  void b(int paramInt1, int paramInt2, Worksheet paramWorksheet)
  {
    this.e = this.d;
    this.d = null;
    if (this.c != null)
    {
      byte[] arrayOfByte = f();
      zaaq.a(paramWorksheet, false, paramInt1, paramInt2, 0, 0, -1, -1, arrayOfByte);
      a(arrayOfByte);
    }
  }
  
  void a(boolean paramBoolean, zcw paramzcw)
  {
    if (f() != null) {
      if (paramBoolean) {
        a(zcv.a(f(), -1, 0, 0, false, null));
      } else {
        a(paramzcw.a(f(), -1));
      }
    }
  }
  
  byte c()
  {
    return 1;
  }
  
  void b()
  {
    if (this.b != null) {
      a(this.b, null);
    }
    a();
  }
  
  byte[] f()
  {
    return this.c;
  }
  
  void a(byte[] paramArrayOfByte)
  {
    this.c = paramArrayOfByte;
  }
  
  Range g()
  {
    if (this.d == null) {
      a();
    }
    return this.d;
  }
  
  zboy(zawp paramzawp)
  {
    this.a = paramzawp;
  }
  
  String[] d()
  {
    return new String[] { h() };
  }
  
  void a(String[] paramArrayOfString, Worksheet paramWorksheet)
  {
    a(paramArrayOfString[0], paramWorksheet);
  }
  
  String h()
  {
    if (f() == null) {
      return this.b;
    }
    zaaf localzaaf = this.a.e.a.d();
    int i = localzaaf.b();
    localzaaf.a(2);
    String str = localzaaf.a(-1, -1, f(), 0, 0, false, true);
    localzaaf.a(i);
    if ((str == null) || ("".equals(str)) || (str.indexOf("#REF!") != -1)) {
      return this.b;
    }
    return str.substring(1);
  }
  
  static String a(HashMap paramHashMap, String paramString1, String paramString2, String paramString3)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if ((paramString1 != null) || (paramString2 != null))
    {
      localStringBuilder.append('\'');
      if (paramString1 != null)
      {
        String str = ((zrl)paramHashMap.get(paramString1)).d;
        char[] arrayOfChar = str.toCharArray();
        int i = localStringBuilder.length();
        for (int j = 0; j < arrayOfChar.length; j++) {
          switch (arrayOfChar[j])
          {
          case ':': 
            localStringBuilder.append(arrayOfChar[j]);
            if (j == 1) {
              i = localStringBuilder.length();
            }
            break;
          case '%': 
            if (j + 2 < arrayOfChar.length)
            {
              int k = (zarb.b(arrayOfChar[(j + 1)]) << 4) + zarb.b(arrayOfChar[(j + 2)]);
              if (k > 127)
              {
                localStringBuilder.append(arrayOfChar[j]);
              }
              else
              {
                localStringBuilder.append((char)k);
                j += 2;
              }
            }
            else
            {
              localStringBuilder.append(arrayOfChar[j]);
            }
            break;
          case '/': 
          case '\\': 
            localStringBuilder.append('\\');
            i = localStringBuilder.length();
            break;
          case '\'': 
            localStringBuilder.append(arrayOfChar[j]);
            localStringBuilder.append(arrayOfChar[j]);
            break;
          default: 
            localStringBuilder.append(arrayOfChar[j]);
          }
        }
        localStringBuilder.insert(i, '[');
        localStringBuilder.append(']');
      }
      if (paramString2 != null) {
        localStringBuilder.append(paramString2);
      }
      localStringBuilder.append('\'');
      localStringBuilder.append('!');
    }
    localStringBuilder.append(paramString3);
    return zs.a(localStringBuilder);
  }
  
  void a(String paramString, Worksheet paramWorksheet)
  {
    WorksheetCollection localWorksheetCollection = this.a.e.a;
    this.b = paramString;
    this.e = this.d;
    this.d = null;
    zacf localzacf = localWorksheetCollection.y().a(paramString);
    if ((localzacf.c() == null) || (localzacf.c().size() == 0))
    {
      String[] arrayOfString = zaap.a(paramString, true);
      if (arrayOfString != null)
      {
        int j = 1;
        if (zarb.c(arrayOfString[0]))
        {
          j = 0;
        }
        else
        {
          String str1 = zu.b(arrayOfString[0]);
          zbth localzbth = localWorksheetCollection.w();
          String str2 = str1;
          if (str2 != null) {
            str2 = str2.toUpperCase();
          }
          if ((localWorksheetCollection.p().getFileName() != null) && (localWorksheetCollection.p().getFileName().toUpperCase().endsWith(str2))) {
            j = 0;
          }
        }
        if (j != 0)
        {
          this.b = zw.a(zw.a(arrayOfString[3], "file:///", ""), "file:\\\\\\", "");
          return;
        }
      }
    }
    int i = -1;
    if (paramWorksheet != null) {
      i = paramWorksheet.getIndex();
    }
    this.c = localWorksheetCollection.y().a.a(localzacf, localWorksheetCollection, i, 0, 0, zacg.a(false, true, true), 32, 0, true);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zboy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */