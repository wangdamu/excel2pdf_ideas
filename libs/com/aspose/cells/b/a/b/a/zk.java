package com.aspose.cells.b.a.b.a;

import com.aspose.cells.Color;
import com.aspose.cells.a.c.zb;
import com.aspose.cells.b.a.b.zq;
import java.awt.Paint;
import java.awt.geom.Rectangle2D;

public class zk
  extends com.aspose.cells.b.a.b.zc
{
  private ze a;
  private int b = 1;
  private Color c;
  private Color[] d;
  private zc e;
  
  private zk() {}
  
  public zk(ze paramze)
  {
    this.a = paramze;
  }
  
  public Paint g()
  {
    if (this.c != null) {
      return this.c.d();
    }
    if (this.e != null) {
      return this.e.b()[0].d();
    }
    throw new zb("");
  }
  
  public zk a()
  {
    zk localzk = new zk();
    if (this.c != null) {
      localzk.c = this.c.a();
    }
    if (this.e != null) {
      localzk.e = this.e.c();
    }
    localzk.a = this.a;
    localzk.b = this.b;
    return localzk;
  }
  
  public void f() {}
  
  public void h() {}
  
  public Color b()
  {
    return this.c;
  }
  
  public zc c()
  {
    return this.e;
  }
  
  public void a(zc paramzc)
  {
    this.e = paramzc;
  }
  
  public zq d()
  {
    Rectangle2D localRectangle2D = this.a.getBounds2D();
    return new zq(localRectangle2D);
  }
  
  public Color[] i()
  {
    return this.d;
  }
  
  public void a(Color paramColor)
  {
    this.c = paramColor.a();
  }
  
  public void a(Color[] paramArrayOfColor)
  {
    this.d = paramArrayOfColor;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/b/a/zk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */