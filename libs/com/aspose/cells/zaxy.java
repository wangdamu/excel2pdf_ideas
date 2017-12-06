package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.d.za;
import com.aspose.cells.b.a.d.zb;
import com.aspose.cells.b.a.d.zm;

class zaxy
{
  private com.aspose.cells.b.a.zh a = com.aspose.cells.b.a.zh.a;
  private zaya b = new zaya();
  
  zaxy() {}
  
  zaxy(zm paramzm)
    throws Exception
  {
    paramzm.b(0L);
    za localza = new za(paramzm, Encoding.getUnicode());
    localza.p();
    int i = localza.p();
    if ((i & 0xFFFF) != 0) {
      throw new UnsupportedOperationException("Cannot read property set in this format.");
    }
    localza.r();
    this.a = new com.aspose.cells.b.a.zh(localza.f(16));
    int j = localza.q();
    com.aspose.cells.b.a.zh[] arrayOfzh = new com.aspose.cells.b.a.zh[j];
    int[] arrayOfInt = new int[j];
    for (int k = 0; k < j; k++)
    {
      arrayOfzh[k] = new com.aspose.cells.b.a.zh(localza.f(16));
      arrayOfInt[k] = localza.q();
    }
    for (k = 0; k < j; k++)
    {
      localza.k().b(arrayOfInt[k]);
      zf.a(this.b, new zaxz(arrayOfzh[k], localza));
    }
  }
  
  void a(zm paramzm)
    throws Exception
  {
    zb localzb = new zb(paramzm, Encoding.getUnicode());
    localzb.a(65534);
    localzb.a(0);
    localzb.a(131333L);
    localzb.a(this.a.a());
    localzb.b(this.b.size());
    int i = (int)paramzm.i() + 20 * this.b.size();
    com.aspose.cells.b.a.d.zh localzh = new com.aspose.cells.b.a.d.zh();
    for (int j = 0; j < this.b.size(); j++)
    {
      localzb.a(this.b.a(j).c().a());
      int k = i + (int)localzh.h();
      localzb.b(k);
      byte[] arrayOfByte = this.b.a(j).a();
      localzh.b(arrayOfByte, 0, arrayOfByte.length);
    }
    paramzm.b(localzh.m(), 0, (int)localzh.h());
  }
  
  zaya a()
  {
    return this.b;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */