package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import java.util.HashMap;

class zxb
  extends zcd
{
  private int c = 0;
  HashMap a;
  
  zxb()
  {
    c(2162);
  }
  
  int a(int paramInt, ListObject paramListObject)
    throws Exception
  {
    int i = 101 + a(paramListObject.b()) + a(com.aspose.cells.b.a.zp.a(paramListObject.a()));
    for (int j = 0; j < paramListObject.getListColumns().getCount(); j++) {
      i += a(paramListObject.getListColumns().get(j), j);
    }
    return i;
  }
  
  int a(String paramString)
  {
    return 2 + zct.a(paramString);
  }
  
  void b(int paramInt, ListObject paramListObject)
    throws Exception
  {
    if (paramListObject.d != null)
    {
      this.c = paramListObject.d.length;
      this.b = paramListObject.d;
      return;
    }
    this.a = new HashMap();
    this.c = a(paramInt, paramListObject);
    this.b = new byte[this.c];
    int i = 0;
    this.b[(i++)] = 114;
    this.b[(i++)] = 8;
    this.b[(i++)] = 1;
    i++;
    System.arraycopy(zc.a(paramListObject.getStartRow()), 0, this.b, i, 2);
    System.arraycopy(zc.a(paramListObject.getEndRow()), 0, this.b, i + 2, 2);
    System.arraycopy(zc.a(paramListObject.getStartColumn()), 0, this.b, i + 4, 2);
    System.arraycopy(zc.a(paramListObject.getEndColumn()), 0, this.b, i + 6, 2);
    i += 8;
    this.b[i] = 5;
    this.b[(i + 7)] = 1;
    i += 15;
    System.arraycopy(zc.a(paramListObject.getStartRow()), 0, this.b, i, 2);
    System.arraycopy(zc.a(paramListObject.getEndRow()), 0, this.b, i + 2, 2);
    System.arraycopy(zc.a(paramListObject.getStartColumn()), 0, this.b, i + 4, 2);
    System.arraycopy(zc.a(paramListObject.getEndColumn()), 0, this.b, i + 6, 2);
    i += 8;
    i += 4;
    this.b[i] = ((byte)paramListObject.a());
    i += 4;
    this.b[i] = ((byte)(paramListObject.getShowHeaderRow() ? 1 : 0));
    i += 4;
    this.b[i] = ((byte)(paramListObject.getShowTotals() ? 1 : 0));
    i += 4;
    this.b[i] = 0;
    i += 4;
    this.b[i] = 64;
    i += 4;
    this.b[i] = 102;
    this.b[(i + 1)] = 50;
    i += 4;
    int j = paramListObject.d();
    if (paramListObject.A()) {
      j |= 0x806;
    } else {
      j &= 0xF7F9;
    }
    System.arraycopy(zc.a(j), 0, this.b, i, 4);
    i += 4;
    i += 32;
    i = a(paramListObject.b(), i);
    System.arraycopy(zc.a(paramListObject.getEndColumn() - paramListObject.getStartColumn() + 1), 0, this.b, i, 2);
    i += 2;
    i = a(com.aspose.cells.b.a.zp.a(paramListObject.a()), i);
    for (int k = 0; k < paramListObject.getListColumns().getCount(); k++) {
      i = a(paramListObject.getListColumns().get(k), k, i);
    }
  }
  
  static int a(zsz paramzsz, zbzi paramzbzi)
  {
    int i = 0;
    if (paramzsz != null) {
      i += paramzsz.d();
    }
    if (paramzbzi != null) {
      i += 8 + zbzh.a(paramzbzi);
    }
    return i;
  }
  
  int a(ListColumn paramListColumn, int paramInt)
    throws Exception
  {
    String str = com.aspose.cells.a.c.zp.a(paramListColumn.n);
    int i = 36 + a(str) + a(paramListColumn.getName());
    Style localStyle = paramListColumn.o();
    Object localObject;
    if (localStyle != null)
    {
      localObject = new zsz(localStyle);
      i += a((zsz)localObject, paramListColumn.a(localStyle));
    }
    localStyle = paramListColumn.m();
    if (localStyle != null)
    {
      localObject = new zsz(localStyle);
      i += a((zsz)localObject, paramListColumn.a(localStyle));
    }
    if (paramListColumn.c())
    {
      i += 6;
      localObject = paramListColumn.b();
      if (localObject != null)
      {
        zbk localzbk = new zbk();
        localzbk.a((FilterColumn)localObject);
        this.a.put(paramListColumn, localzbk);
        i += localzbk.d();
      }
    }
    if (paramListColumn.f != null) {
      i += paramListColumn.f.length;
    }
    return i;
  }
  
  static int a(zsz paramzsz, zbzi paramzbzi, byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramInt;
    if (paramzsz != null)
    {
      System.arraycopy(paramzsz.e(), 0, paramArrayOfByte, paramInt, paramzsz.d());
      paramInt += paramzsz.d();
    }
    if (paramzbzi != null)
    {
      paramInt += 6;
      System.arraycopy(zc.a(paramzbzi.getCount()), 0, paramArrayOfByte, paramInt, 2);
      paramInt += 2;
      paramInt = zbzh.a(paramzbzi, paramArrayOfByte, paramInt);
    }
    return paramInt;
  }
  
  int a(ListColumn paramListColumn, int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, 1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1 };
    arrayOfByte[0] = ((byte)paramListColumn.n);
    arrayOfByte[12] = ((byte)paramListColumn.getTotalsCalculation());
    zsz localzsz1 = null;
    zsz localzsz2 = null;
    zbzi localzbzi1 = null;
    zbzi localzbzi2 = null;
    Style localStyle = paramListColumn.o();
    if (localStyle != null)
    {
      localzsz1 = new zsz(localStyle);
      localzbzi1 = paramListColumn.a(localStyle);
      System.arraycopy(zc.a(a(localzsz1, localzbzi1)), 0, arrayOfByte, 16, 4);
    }
    localStyle = paramListColumn.m();
    if (localStyle != null)
    {
      localzsz2 = new zsz(localStyle);
      localzbzi2 = paramListColumn.a(localStyle);
      System.arraycopy(zc.a(a(localzsz2, localzbzi2)), 0, arrayOfByte, 28, 4);
    }
    if (!paramListColumn.c()) {
      arrayOfByte[24] = 0;
    }
    if (paramListColumn.f != null)
    {
      byte[] tmp333_329 = arrayOfByte;
      tmp333_329[24] = ((byte)(tmp333_329[24] | 0x80));
      if (paramListColumn.f())
      {
        byte[] tmp352_348 = arrayOfByte;
        tmp352_348[25] = ((byte)(tmp352_348[25] | 0x1));
      }
    }
    System.arraycopy(arrayOfByte, 0, this.b, paramInt2, arrayOfByte.length);
    paramInt2 += arrayOfByte.length;
    String str = com.aspose.cells.a.c.zp.a(paramListColumn.n);
    paramInt2 = a(str, paramInt2);
    str = paramListColumn.getName();
    paramInt2 = a(str, paramInt2);
    if (localzsz1 != null) {
      paramInt2 = a(localzsz1, localzbzi1, this.b, paramInt2);
    }
    if (localzsz2 != null) {
      paramInt2 = a(localzsz2, localzbzi2, this.b, paramInt2);
    }
    if (paramListColumn.c())
    {
      zbk localzbk = (zbk)this.a.get(paramListColumn);
      if (localzbk != null) {
        System.arraycopy(zc.a(localzbk.d()), 0, this.b, paramInt2, 2);
      }
      paramInt2 += 4;
      this.b[paramInt2] = -1;
      this.b[(paramInt2 + 1)] = -1;
      paramInt2 += 2;
      if (localzbk != null)
      {
        System.arraycopy(localzbk.e(), 0, this.b, paramInt2, localzbk.d());
        paramInt2 += localzbk.d();
      }
    }
    if (paramListColumn.f != null)
    {
      System.arraycopy(paramListColumn.f, 0, this.b, paramInt2, paramListColumn.f.length);
      paramInt2 += paramListColumn.f.length;
    }
    return paramInt2;
  }
  
  private int a(String paramString, int paramInt)
  {
    System.arraycopy(zc.a(paramString.length()), 0, this.b, paramInt, 2);
    paramInt += 2;
    byte[] arrayOfByte = zct.c(paramString);
    this.b[(paramInt++)] = ((byte)(arrayOfByte.length == paramString.length() ? 0 : 1));
    System.arraycopy(arrayOfByte, 0, this.b, paramInt, arrayOfByte.length);
    paramInt += arrayOfByte.length;
    return paramInt;
  }
  
  void a(zrg paramzrg)
    throws Exception
  {
    byte[] arrayOfByte = null;
    if (this.c > 8224)
    {
      arrayOfByte = new byte[4];
      System.arraycopy(zc.a(f()), 0, arrayOfByte, 0, 2);
      System.arraycopy(zc.a((short)8224), 0, arrayOfByte, 2, 2);
      paramzrg.a(arrayOfByte);
      paramzrg.a(this.b, 0, 8224);
      arrayOfByte = new byte[16];
      arrayOfByte[0] = (arrayOfByte[4] = 117);
      arrayOfByte[1] = (arrayOfByte[5] = 8);
      int i = 8224;
      for (;;)
      {
        int j = this.b.length - i;
        if (j > 8212)
        {
          System.arraycopy(zc.a((short)8224), 0, arrayOfByte, 2, 2);
          paramzrg.a(arrayOfByte);
          paramzrg.a(this.b, i, 8212);
          i += 8212;
        }
        else
        {
          System.arraycopy(zc.a(j + 12), 0, arrayOfByte, 2, 2);
          paramzrg.a(arrayOfByte);
          paramzrg.a(this.b, i, j);
          break;
        }
      }
    }
    else
    {
      arrayOfByte = new byte[4];
      System.arraycopy(zc.a(f()), 0, arrayOfByte, 0, 2);
      System.arraycopy(zc.a(this.c), 0, arrayOfByte, 2, 2);
      paramzrg.a(arrayOfByte);
      paramzrg.a(this.b);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zxb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */