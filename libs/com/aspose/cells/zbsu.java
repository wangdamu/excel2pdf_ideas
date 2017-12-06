package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.HashMap;

class zbsu
  implements zajl
{
  private zang a;
  private zbst b;
  private int c;
  private boolean d;
  private HashMap e = new HashMap();
  private ArrayList f = new ArrayList();
  private long g = 0L;
  
  zbsu(zang paramzang)
  {
    this.a = paramzang;
    this.d = false;
    this.b = ((zbst)paramzang.a.f.getWorksheets().g);
    this.c = this.b.c();
  }
  
  boolean e()
  {
    return (this.g & 0xFFFFFFFF) > 0L;
  }
  
  public zbbj a(int paramInt)
  {
    if (paramInt < this.c) {
      return this.b.a(paramInt);
    }
    zbbj localzbbj = new zbbj((String)this.f.get(paramInt - this.c), 1);
    localzbbj.e = paramInt;
    return localzbbj;
  }
  
  public zbbj c(zbbj paramzbbj)
  {
    return a(paramzbbj.c);
  }
  
  public void a(zbbj paramzbbj) {}
  
  public void b(zbbj paramzbbj) {}
  
  public zbbj a(String paramString)
  {
    zbbj localzbbj = this.b.b(paramString);
    if (localzbbj != null)
    {
      this.g += 1L;
      return localzbbj;
    }
    Object localObject = this.e.get(paramString);
    int i;
    if (localObject != null)
    {
      this.g += 1L;
      i = ((Integer)localObject).intValue();
      localzbbj = new zbbj((String)this.f.get(i - this.c), 1);
      localzbbj.e = i;
      return localzbbj;
    }
    if (this.d)
    {
      this.g += 1L;
      i = this.c + this.f.size();
      zf.a(this.f, paramString);
      if (this.a.c.isGatherString()) {
        this.e.put(paramString, Integer.valueOf(i));
      }
    }
    else if (this.a.c.isGatherString())
    {
      this.g += 1L;
      i = this.c + this.f.size();
      zf.a(this.f, paramString);
      this.e.put(paramString, Integer.valueOf(i));
    }
    else
    {
      i = -1;
    }
    localzbbj = new zbbj(paramString, 1);
    localzbbj.e = i;
    return localzbbj;
  }
  
  public int a()
  {
    return this.c + this.f.size();
  }
  
  public long b()
  {
    return (this.b.b() & 0xFFFFFFFF) + (this.g & 0xFFFFFFFF);
  }
  
  public int c()
  {
    return this.c + this.f.size();
  }
  
  public boolean d()
  {
    return false;
  }
  
  public void d(zbbj paramzbbj)
  {
    if (paramzbbj.e < this.c) {
      this.b.d(paramzbbj);
    } else {
      this.g -= 1L;
    }
  }
  
  public void b(int paramInt)
  {
    if (paramInt < this.c) {
      this.b.b(paramInt);
    } else {
      this.g -= 1L;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbsu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */