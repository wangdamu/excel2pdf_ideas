package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zzw
  extends zcd
{
  private String a;
  private int c = -1;
  
  zzw()
  {
    c(1054);
  }
  
  void a(String paramString, int paramInt)
  {
    this.a = paramString;
    this.c = (paramInt & 0xFFFF);
    a((short)(this.a.length() * 2 + 5));
    this.b = new byte[d()];
    System.arraycopy(zc.a(paramInt), 0, this.b, 0, 2);
    System.arraycopy(zc.a(this.a.length()), 0, this.b, 2, 2);
    this.b[4] = 1;
    System.arraycopy(Encoding.getUnicode().a(this.a), 0, this.b, 5, d() - 5);
  }
  
  String a()
  {
    if ((this.a != null) && (!"".equals(this.a))) {
      return this.a;
    }
    if ((this.b != null) && (this.b.length > 0))
    {
      if (this.b[4] == 0)
      {
        byte[] arrayOfByte = new byte[2 * this.b.length - 10];
        for (int i = 0; i < this.b.length - 5; i++) {
          arrayOfByte[(2 * i)] = this.b[(i + 5)];
        }
        this.a = Encoding.getUnicode().a(arrayOfByte);
      }
      else
      {
        this.a = Encoding.getUnicode().a(this.b, 5, this.b.length - 5);
      }
      return this.a;
    }
    return "";
  }
  
  int b()
  {
    if (this.c < 0)
    {
      if ((this.b != null) && (this.b.length > 0))
      {
        this.c = (zc.e(this.b, 0) & 0xFFFF);
        return this.c;
      }
      return 0;
    }
    return this.c;
  }
  
  void a(zzw paramzzw)
  {
    super.a(paramzzw);
    this.a = paramzzw.a;
    this.c = paramzzw.c;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zzw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */