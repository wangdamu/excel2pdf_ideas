package com.aspose.cells.a.d;

import com.aspose.cells.b.a.b.zp;
import com.aspose.cells.b.a.d.za;

public class zcz
{
  private long a;
  private int b;
  private short c;
  private short d;
  private short e;
  private short f;
  private int g;
  private long h;
  private int i;
  
  public void a(za paramza)
    throws Exception
  {
    this.a = paramza.r();
    this.b = paramza.p();
    this.c = paramza.n();
    this.d = paramza.n();
    this.e = paramza.n();
    this.f = paramza.n();
    this.g = paramza.p();
    this.h = paramza.r();
    this.i = paramza.p();
    d();
  }
  
  private void d()
    throws Exception
  {
    int j = 0;
    j ^= (int)(this.a & 0xFFFFFFFF & 0xFFFF);
    j ^= (int)((this.a & 0xFFFFFFFF & 0xFFFF0000) >> 16);
    j ^= this.b;
    j ^= this.c;
    j ^= this.d;
    j ^= this.e;
    j ^= this.f;
    j ^= this.g;
    j ^= (int)(this.h & 0xFFFFFFFF & 0xFFFF);
    j ^= (int)((this.h & 0xFFFFFFFF & 0xFFFF0000) >> 16);
    if ((j & 0xFFFF & 0xFFFF) != (this.i & 0xFFFF)) {
      throw new Exception("Metafile checksum is invalid.");
    }
  }
  
  public boolean a()
  {
    return (this.e - this.c > 0) && (this.f - this.d > 0);
  }
  
  public zp b()
  {
    return new zp(0, 0, this.e - this.c, this.f - this.d);
  }
  
  public int c()
  {
    return this.g;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zcz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */