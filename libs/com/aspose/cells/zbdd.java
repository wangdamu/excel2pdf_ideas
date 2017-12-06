package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;

class zbdd
  extends zbbj
{
  byte[] f;
  ArrayList g;
  
  zbdd() {}
  
  zbdd(String paramString, byte[] paramArrayOfByte)
  {
    this.c = paramString;
    this.f = paramArrayOfByte;
  }
  
  zbdd(String paramString, byte[] paramArrayOfByte, int paramInt)
  {
    this.c = paramString;
    this.f = paramArrayOfByte;
    this.d = paramInt;
  }
  
  boolean e()
  {
    return false;
  }
  
  boolean f()
  {
    return true;
  }
  
  boolean g()
  {
    return false;
  }
  
  byte[] h()
  {
    return this.f;
  }
  
  void a(byte[] paramArrayOfByte)
  {
    this.f = paramArrayOfByte;
    this.g = null;
  }
  
  ArrayList i()
  {
    return this.g;
  }
  
  void a(ArrayList paramArrayList)
  {
    this.g = paramArrayList;
  }
  
  boolean j()
  {
    return this.f != null;
  }
  
  void a(Cells paramCells, Style paramStyle, StyleFlag paramStyleFlag)
  {
    int i;
    if ((this.g != null) && (this.g.size() > 0)) {
      for (i = 0; i < this.g.size(); i++)
      {
        FontSetting localFontSetting = (FontSetting)this.g.get(i);
        zbtc.a(paramStyle, localFontSetting.getFont(), paramStyleFlag);
      }
    }
    if ((this.f != null) && (this.f.length > 0)) {
      for (i = 0; i < this.f.length; i += 4)
      {
        int j = zc.e(this.f, i) & 0xFFFF;
        if (j >= this.c.length()) {
          return;
        }
        int k = zc.e(this.f, i + 2) & 0xFFFF;
        Font localFont = paramCells.p().i(k);
        zbtc.a(paramStyle, localFont, paramStyleFlag);
        k = paramCells.p().b(localFont);
        System.arraycopy(zc.a(k), 0, this.f, i + 2, 2);
      }
    }
  }
  
  void a(zbdd paramzbdd, Cell paramCell)
  {
    a(paramzbdd.f, paramCell);
  }
  
  void a(byte[] paramArrayOfByte, Cell paramCell)
  {
    this.f = null;
    if (paramArrayOfByte != null)
    {
      ArrayList localArrayList = new ArrayList();
      for (int i = 0; i < paramArrayOfByte.length; i += 4)
      {
        int j = zc.e(paramArrayOfByte, i) & 0xFFFF;
        if (j >= this.c.length())
        {
          a(localArrayList);
          return;
        }
        if ((i == 0) && (j != 0))
        {
          FontSetting localFontSetting1 = new FontSetting(0, j, paramCell.d.p());
          localFontSetting1.getFont().a(paramCell.p().getFont(), null);
          zf.a(localArrayList, localFontSetting1);
        }
        int k = zc.e(paramArrayOfByte, i + 2) & 0xFFFF;
        int m = 0;
        if (i + 4 >= paramArrayOfByte.length) {
          m = this.c.length() - j;
        } else {
          m = (zc.e(paramArrayOfByte, i + 4) & 0xFFFF) - j;
        }
        FontSetting localFontSetting2 = new FontSetting(j, m, paramCell.d.p());
        localFontSetting2.getFont().a(paramCell.d.p().i(k), null);
        zf.a(localArrayList, localFontSetting2);
      }
      this.g = localArrayList;
    }
    else
    {
      this.g = new ArrayList();
    }
  }
  
  void a(Cell paramCell)
  {
    a(this.f, paramCell);
    this.f = null;
  }
  
  void a(Cell paramCell1, zbdd paramzbdd, Cell paramCell2)
  {
    this.c = paramzbdd.c;
    this.g = new ArrayList();
    this.f = null;
    ArrayList localArrayList = paramzbdd.a(paramCell1.d.p(), paramCell1.k().length(), paramCell1.p().getFont());
    for (int i = 0; i < localArrayList.size(); i++)
    {
      FontSetting localFontSetting1 = (FontSetting)localArrayList.get(i);
      FontSetting localFontSetting2 = new FontSetting(localFontSetting1.getStartIndex(), localFontSetting1.getLength(), paramCell2.d.p());
      localFontSetting2.getFont().a(localFontSetting1.h(), null);
      zf.a(this.g, localFontSetting2);
    }
  }
  
  ArrayList a(WorksheetCollection paramWorksheetCollection, int paramInt, Font paramFont)
  {
    Object localObject1;
    Object localObject2;
    if ((this.g != null) && (this.g.size() != 0))
    {
      zbdf.a(this.g, paramInt, paramFont, false);
      localObject1 = (FontSetting)this.g.get(0);
      if (((FontSetting)localObject1).getStartIndex() != 0)
      {
        localObject2 = new FontSetting(0, ((FontSetting)localObject1).getStartIndex(), paramWorksheetCollection);
        ((FontSetting)localObject2).getFont().a(paramFont, null);
        this.g.add(0, localObject2);
      }
      return this.g;
    }
    if (this.f != null)
    {
      localObject1 = this.f;
      localObject2 = new ArrayList();
      for (int i = 0; i < localObject1.length; i += 4)
      {
        int j = zc.e((byte[])localObject1, i) & 0xFFFF;
        FontSetting localFontSetting1;
        if (j >= this.c.length())
        {
          if (i == 0)
          {
            localFontSetting1 = new FontSetting(0, this.c.length(), paramWorksheetCollection);
            localFontSetting1.getFont().a(paramFont, null);
            zf.a((ArrayList)localObject2, localFontSetting1);
          }
          return (ArrayList)localObject2;
        }
        if ((i == 0) && (j != 0))
        {
          localFontSetting1 = new FontSetting(0, j, paramWorksheetCollection);
          localFontSetting1.getFont().a(paramFont, null);
          zf.a((ArrayList)localObject2, localFontSetting1);
        }
        int k = zc.e((byte[])localObject1, i + 2) & 0xFFFF;
        int m = 0;
        if (i + 4 >= localObject1.length) {
          m = this.c.length() - j;
        } else {
          m = (zc.e((byte[])localObject1, i + 4) & 0xFFFF) - j;
        }
        if (j + m > this.c.length()) {
          m = this.c.length() - j;
        }
        if (m > 0)
        {
          Font localFont = null;
          if (k < 0)
          {
            localFont = null;
          }
          else
          {
            if (k > 4) {
              k--;
            }
            if (k >= paramWorksheetCollection.A().size()) {
              localFont = (Font)paramWorksheetCollection.A().get(0);
            } else {
              localFont = (Font)paramWorksheetCollection.A().get(k);
            }
          }
          FontSetting localFontSetting2 = new FontSetting(j, m, paramWorksheetCollection);
          if (localFont != null) {
            localFontSetting2.getFont().a(localFont, null);
          }
          zf.a((ArrayList)localObject2, localFontSetting2);
        }
      }
      return (ArrayList)localObject2;
    }
    return null;
  }
  
  boolean a(zbdd paramzbdd)
  {
    if (!zw.b(this.c, paramzbdd.c)) {
      return false;
    }
    int i;
    if ((this.g == null) && (paramzbdd.g == null))
    {
      if ((this.f != null) && (paramzbdd.f != null) && (this.f.length == paramzbdd.f.length)) {
        for (i = 0; i < this.f.length; i++) {
          if (this.f[i] != paramzbdd.f[i]) {
            return false;
          }
        }
      } else {
        return false;
      }
    }
    else if ((this.g != null) && (paramzbdd.g != null) && (this.g.size() == paramzbdd.g.size())) {
      for (i = 0; i < this.g.size(); i++)
      {
        FontSetting localFontSetting1 = (FontSetting)this.g.get(i);
        FontSetting localFontSetting2 = (FontSetting)paramzbdd.g.get(i);
        if ((localFontSetting1.getStartIndex() != localFontSetting2.getStartIndex()) || (!localFontSetting1.getFont().equals(localFontSetting2.getFont()))) {
          return false;
        }
      }
    } else {
      return false;
    }
    return true;
  }
  
  boolean a(String paramString, byte[] paramArrayOfByte)
  {
    if ((zw.b(this.c, paramString)) && (this.f != null))
    {
      byte[] arrayOfByte = this.f;
      if (arrayOfByte.length == paramArrayOfByte.length)
      {
        int i = 1;
        for (int j = 0; j < paramArrayOfByte.length; j++) {
          if (arrayOfByte[j] != paramArrayOfByte[j])
          {
            i = 0;
            break;
          }
        }
        if (i != 0) {
          return true;
        }
      }
    }
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbdd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */