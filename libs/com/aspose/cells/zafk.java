package com.aspose.cells;

import com.aspose.cells.a.d.zav;
import com.aspose.cells.a.d.zgs;
import com.aspose.cells.b.a.b.za;
import com.aspose.cells.b.a.b.ze;
import com.aspose.cells.b.a.b.zg;
import com.aspose.cells.b.a.b.zi;
import com.aspose.cells.b.a.b.zv;
import java.util.HashMap;

class zafk
{
  private zi a = null;
  private zg b = null;
  private int c = 96;
  private HashMap d = new HashMap();
  private HashMap e = new HashMap();
  
  zafk(Workbook paramWorkbook)
  {
    za localza = new za(10, 10);
    this.a = zi.a(localza);
    this.b = a(paramWorkbook.getWorksheets().T());
    this.c = zbxp.a();
  }
  
  int a(Style paramStyle, String paramString)
    throws Exception
  {
    Font localFont = null;
    if (paramStyle != null)
    {
      localFont = paramStyle.q();
      if ((localFont != null) && (localFont.m() == 0)) {
        localFont = null;
      }
    }
    return a(localFont, paramString);
  }
  
  int a(Font paramFont, String paramString)
    throws Exception
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return 0;
    }
    zbsx localzbsx = new zbsx(paramFont, paramString);
    Object localObject = this.d.get(localzbsx);
    if (localObject != null) {
      return ((Integer)localObject).intValue();
    }
    if (paramFont != null) {
      return zavt.a(paramString, paramFont, 1.0D, 0);
    }
    zg localzg = this.b;
    ze[] arrayOfze = { new ze(0, paramString.length()) };
    zv localzv = new zv();
    localzv.a(arrayOfze);
    zgs localzgs = zav.a().b(localzg.g(), localzg.k(), false);
    float f = localzgs.a(paramString, localzg.h());
    int i = zagn.a(this.c, f);
    return i;
  }
  
  int a(Style paramStyle, String paramString, int paramInt)
    throws Exception
  {
    Font localFont = null;
    if (paramStyle != null)
    {
      localFont = paramStyle.q();
      if ((localFont != null) && (localFont.m() == 0)) {
        localFont = null;
      }
    }
    return a(localFont, paramString, paramInt);
  }
  
  int a(Font paramFont, String paramString, int paramInt1, int paramInt2)
    throws Exception
  {
    String str = paramString.substring(0, 0 + paramInt2);
    int i = a(paramFont, str);
    int j = paramInt1 - i - 4;
    return j;
  }
  
  int a(Font paramFont, String paramString, int paramInt)
    throws Exception
  {
    zbsx localzbsx = new zbsx(paramFont, paramString, paramInt);
    Object localObject = this.e.get(localzbsx);
    if (localObject != null) {
      return ((Integer)localObject).intValue();
    }
    int j = a(paramFont, paramString);
    int i;
    if (j < paramInt)
    {
      i = -1;
    }
    else if (j == paramInt)
    {
      i = 0;
    }
    else
    {
      int k = paramString.length();
      float f = j / k;
      if (j > 1600) {
        f = a(paramFont, "A");
      }
      i = (int)(paramInt / f);
      if (i > k) {
        i = k;
      }
      int m = a(paramFont, paramString, paramInt, i);
      if (Math.abs(m) > f) {
        if (m > 0)
        {
          while (m > 0)
          {
            i++;
            m = a(paramFont, paramString, paramInt, i);
          }
          if (m <= 0) {
            i--;
          }
        }
        else
        {
          while (m < 0)
          {
            i--;
            m = a(paramFont, paramString, paramInt, i);
          }
        }
      }
    }
    this.e.put(localzbsx, Integer.valueOf(i));
    return i;
  }
  
  private zg a(Font paramFont)
  {
    String str = "Arial";
    int i = 10;
    int j = 0;
    if (paramFont != null)
    {
      str = paramFont.getName();
      i = paramFont.getSize();
      if (paramFont.isBold()) {
        j |= 0x1;
      }
      if (paramFont.isItalic()) {
        j |= 0x2;
      }
      if (paramFont.isStrikeout()) {
        j |= 0x8;
      }
      if (paramFont.getUnderline() != 0) {
        j |= 0x4;
      }
    }
    zg localzg = new zg(str, i, j, 3);
    return localzg;
  }
  
  int a(double paramDouble)
  {
    double d1 = paramDouble * this.c / 72.0D;
    return (int)d1;
  }
  
  double a(int paramInt)
  {
    return paramInt * 72.0D / this.c;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zafk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */