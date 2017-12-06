package com.aspose.cells.a.d;

import com.aspose.cells.b.a.d.za;
import com.aspose.cells.b.a.d.zb;

public class zae
{
  public long a = 40L;
  public int b;
  public int c;
  public int d;
  public int e;
  public long f;
  public long g;
  public int h;
  public int i;
  public long j;
  public long k;
  
  public void a(za paramza)
    throws Exception
  {
    this.a = paramza.r();
    this.b = paramza.q();
    this.c = paramza.q();
    this.d = paramza.p();
    this.e = paramza.p();
    this.f = paramza.r();
    this.g = paramza.r();
    this.h = paramza.q();
    this.i = paramza.q();
    this.j = paramza.r();
    this.k = paramza.r();
  }
  
  public void a(zb paramzb)
    throws Exception
  {
    paramzb.a(this.a);
    paramzb.b(this.b);
    paramzb.b(this.c);
    paramzb.a(this.d);
    paramzb.a(this.e);
    paramzb.a(this.f);
    paramzb.a(this.g);
    paramzb.b(this.h);
    paramzb.b(this.i);
    paramzb.a(this.j);
    paramzb.a(this.k);
  }
  
  public int a()
  {
    if ((this.e & 0xFFFF) == 32)
    {
      if ((this.f & 0xFFFFFFFF) == 3L) {
        return 12;
      }
      return 0;
    }
    if ((this.e & 0xFFFF) == 24) {
      return 0;
    }
    int m = (this.j & 0xFFFFFFFF) != 0L ? (int)(this.j & 0xFFFFFFFF) : 1 << (this.e & 0xFFFF);
    int n = 4;
    return m * n;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */