package com.aspose.cells.a.d;

import com.aspose.cells.b.a.b.zp;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.d.za;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zr;

public class zct
{
  private zp a;
  private zq b;
  private int c;
  private int d;
  private int e;
  private int f;
  
  public void a(za paramza)
    throws Exception
  {
    paramza.r();
    long l = paramza.r();
    int i = paramza.q();
    int j = paramza.q();
    int k = paramza.q();
    int m = paramza.q();
    this.a = zp.a(i, j, k, m);
    i = paramza.q();
    j = paramza.q();
    k = paramza.q();
    m = paramza.q();
    this.b = zq.a(i, j, k, m);
    paramza.r();
    paramza.r();
    paramza.r();
    paramza.r();
    paramza.p();
    paramza.p();
    paramza.r();
    paramza.r();
    paramza.r();
    this.c = paramza.q();
    this.d = paramza.q();
    this.e = paramza.q();
    this.f = paramza.q();
    this.b = new zq(a(this.b.f(), this.e, this.c), a(this.b.g(), this.f, this.d), a(this.b.h(), this.e, this.c), a(this.b.i(), this.f, this.d));
    paramza.k().b(l);
  }
  
  private int a(float paramFloat, int paramInt1, int paramInt2)
  {
    return (int)zr.a(paramFloat * paramInt2 / (paramInt1 * 100.0F));
  }
  
  public zp a()
  {
    return this.a;
  }
  
  public zq b()
  {
    return this.b;
  }
  
  public float c()
  {
    return (float)(this.c / (this.e / 25.4D));
  }
  
  public float d()
  {
    return (float)(this.d / (this.f / 25.4D));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zct.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */