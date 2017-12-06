package com.aspose.cells.a.d;

import com.aspose.cells.Color;
import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.a.zk;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.zaee;
import java.awt.Paint;

public class zr
  extends com.aspose.cells.b.a.b.zc
  implements zbu
{
  private zk a;
  private int b;
  private ze c;
  
  private zr() {}
  
  public zr(ze paramze, int paramInt)
  {
    this.c = paramze;
    this.a = new zk(paramze);
    this.b = paramInt;
  }
  
  public Color a()
  {
    return this.a.b();
  }
  
  public void a(Color paramColor)
  {
    this.a.a(paramColor);
  }
  
  public com.aspose.cells.b.a.b.a.zc b()
  {
    return this.a.c();
  }
  
  public void a(com.aspose.cells.b.a.b.a.zc paramzc)
  {
    this.a.a(paramzc);
  }
  
  public zq c()
  {
    return this.a.d();
  }
  
  public Color[] d()
  {
    return this.a.i();
  }
  
  public void a(Color[] paramArrayOfColor)
  {
    this.a.a(paramArrayOfColor);
  }
  
  public int i()
  {
    return this.b;
  }
  
  public Object e()
  {
    zr localzr = new zr();
    localzr.a = this.a.a();
    localzr.c = this.c.f();
    localzr.b = this.b;
    return localzr;
  }
  
  protected void a(boolean paramBoolean)
  {
    this.a.h();
  }
  
  public com.aspose.cells.b.a.b.zc j()
  {
    return this.a;
  }
  
  public zp k()
  {
    zp localzp = zaee.a(this.c);
    return localzp;
  }
  
  public void f()
  {
    h();
  }
  
  public void h()
  {
    a(true);
  }
  
  public Paint g()
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */