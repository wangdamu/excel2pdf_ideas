package com.aspose.cells.a.d;

import com.aspose.cells.b.a.b.a.zi;
import java.awt.RenderingHints.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class zb
  extends zd
  implements zbv
{
  private zat a;
  private zi b;
  private zp c;
  private zk d;
  private Map<RenderingHints.Key, Object> e = new HashMap();
  private zdr f = null;
  
  public void a(zf paramzf)
    throws Exception
  {
    if (e() == null)
    {
      paramzf.a(this);
      super.a(paramzf);
      paramzf.b(this);
      return;
    }
    zat localzat = (zat)paramzf.b.get(Integer.valueOf(e().c));
    if ((localzat == null) || (e().a(localzat)))
    {
      paramzf.a(this);
      super.a(paramzf);
      paramzf.b(this);
      return;
    }
    if (e().c(localzat))
    {
      if (e().e == 0)
      {
        int i = e().b(localzat);
        if (i > 1)
        {
          e().e = i;
          e().f = 1;
          ArrayList localArrayList = (ArrayList)paramzf.a.get(Integer.valueOf(e().c));
          if (localArrayList != null) {
            com.aspose.cells.b.a.a.zf.a(localArrayList, this);
          }
        }
        else
        {
          e().e = 1;
          e().f = 1;
        }
      }
      paramzf.a(this);
      super.a(paramzf);
      paramzf.b(this);
    }
  }
  
  public zi a()
  {
    return this.b;
  }
  
  public void a(zi paramzi)
  {
    this.b = paramzi;
  }
  
  public zp b()
  {
    return this.c;
  }
  
  public void a(zp paramzp)
  {
    this.c = paramzp;
  }
  
  public boolean c()
  {
    return false;
  }
  
  public zk d()
  {
    return this.d;
  }
  
  public void a(zk paramzk)
  {
    this.d = paramzk;
  }
  
  public zat e()
  {
    return this.a;
  }
  
  public void a(zat paramzat)
  {
    this.a = paramzat;
  }
  
  public Map<RenderingHints.Key, Object> f()
  {
    return this.e;
  }
  
  public void a(RenderingHints.Key paramKey, Object paramObject)
  {
    this.e.put(paramKey, paramObject);
  }
  
  public zdr g()
  {
    return this.f;
  }
  
  public void a(zdr paramzdr)
  {
    this.f = paramzdr;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */