package com.aspose.cells;

import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.zi;
import com.aspose.cells.b.a.zm;
import com.aspose.cells.b.a.zs;

class zaxl
  implements zi
{
  private float a;
  private float b;
  private zbqw c;
  private int d = 0;
  private zq e;
  
  private zaxl() {}
  
  public zaxl(int paramInt, zbqw paramzbqw)
  {
    this.a = 0.0F;
    this.b = 0.0F;
    this.d = paramInt;
    this.c = paramzbqw;
  }
  
  public float a()
  {
    return this.a;
  }
  
  public void a(float paramFloat)
  {
    this.a = paramFloat;
  }
  
  public float b()
  {
    return this.b;
  }
  
  public void b(float paramFloat)
  {
    this.b = paramFloat;
  }
  
  public boolean c()
  {
    return (this.c != null) && (this.c.b == 2) && ("#N/A".equals(zs.a(this.c.a)));
  }
  
  public Object d()
  {
    Object localObject = null;
    if (this.c != null) {
      if (this.c.b == 5) {
        localObject = Double.valueOf(0.0D);
      } else if (this.c.b == 2)
      {
        if ("#N/A".equals(zs.a(this.c.a))) {
          localObject = null;
        } else {
          localObject = Double.valueOf(0.0D);
        }
      }
      else if (this.c.b == 3)
      {
        if (this.d == 1) {
          localObject = Double.valueOf(0.0D);
        } else {
          localObject = null;
        }
      }
      else {
        localObject = this.c.a;
      }
    }
    return localObject;
  }
  
  public zq e()
  {
    return this.e;
  }
  
  public void a(zq paramzq)
  {
    this.e = paramzq;
  }
  
  public int compareTo(Object obj)
  {
    zaxl localzaxl = (zaxl)zm.a(obj, zaxl.class);
    int i = 0;
    if (b() > localzaxl.b()) {
      i = 1;
    }
    if (b() == localzaxl.b()) {
      i = 0;
    }
    if (b() < localzaxl.b()) {
      i = -1;
    }
    return i;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaxl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */