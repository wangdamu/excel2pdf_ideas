package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

class zbsv
  implements zajl
{
  private ArrayList a = new ArrayList();
  
  public zbbj a(int paramInt)
  {
    return (zbbj)this.a.get(paramInt);
  }
  
  public void a(zbbj paramzbbj)
  {
    paramzbbj.d += 1;
    paramzbbj.e = this.a.size();
    zf.a(this.a, paramzbbj);
  }
  
  public void b(zbbj paramzbbj)
  {
    if (paramzbbj.e == this.a.size())
    {
      zf.a(this.a, paramzbbj);
    }
    else if (paramzbbj.e > this.a.size())
    {
      for (int i = paramzbbj.e - this.a.size(); i > 0; i--) {
        zf.a(this.a, null);
      }
      zf.a(this.a, paramzbbj);
    }
    else
    {
      this.a.set(paramzbbj.e, paramzbbj);
    }
  }
  
  public zbbj c(zbbj paramzbbj)
  {
    return a(paramzbbj.c);
  }
  
  public zbbj a(String paramString)
  {
    zbbj localzbbj = new zbbj(paramString, 1);
    localzbbj.e = this.a.size();
    zf.a(this.a, localzbbj);
    return localzbbj;
  }
  
  public void d(zbbj paramzbbj)
  {
    if (paramzbbj.e > -1) {
      this.a.remove(paramzbbj.e);
    }
  }
  
  public void b(int paramInt)
  {
    this.a.remove(paramInt);
  }
  
  public int a()
  {
    return this.a.size();
  }
  
  public long b()
  {
    return this.a.size();
  }
  
  public int c()
  {
    return this.a.size();
  }
  
  public boolean d()
  {
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbsv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */