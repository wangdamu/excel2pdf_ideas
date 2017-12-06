package com.aspose.cells.b.a.b;

import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.e.za;
import java.awt.Rectangle;
import java.awt.geom.Area;

public class zr
  extends za
  implements Cloneable
{
  private static final zr a = new zr(-4194304, -4194304, 8388608, 8388608);
  
  public zr()
  {
    this((Area)a.a().clone());
  }
  
  public zr(Area paramArea)
  {
    super(paramArea);
  }
  
  public zr(zq paramzq)
  {
    this(new Area(paramzq.b()));
  }
  
  public zr(ze paramze)
  {
    this(new Area(paramze.a()));
  }
  
  public zr(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this(new Area(new Rectangle(paramInt1, paramInt2, paramInt3, paramInt4)));
  }
  
  public zr(zp paramzp)
  {
    this(new Area(paramzp.l()));
  }
  
  public Area a()
  {
    return (Area)super.l();
  }
  
  public void b()
  {
    c();
  }
  
  public void c() {}
  
  public zr d()
  {
    return new zr((Area)((Area)super.l()).clone());
  }
  
  public void a(ze paramze)
  {
    if (paramze == null) {
      throw new IllegalArgumentException("path");
    }
    a().intersect(new Area(paramze.a()));
  }
  
  public void a(zq paramzq)
  {
    a().intersect(new Area(paramzq.b()));
  }
  
  public void b(ze paramze)
  {
    if (paramze == null) {
      throw new IllegalArgumentException("path");
    }
    a().exclusiveOr(new Area(paramze.a()));
  }
  
  public zq a(zi paramzi)
  {
    if (paramzi == null) {
      throw new IllegalArgumentException("graphics");
    }
    return new zq(a().getBounds2D());
  }
  
  public boolean b(zi paramzi)
  {
    if (paramzi == null) {
      throw new IllegalArgumentException("graphics");
    }
    return a().isEmpty();
  }
  
  public zr e()
  {
    return new zr((Area)a().clone());
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/b/zr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */