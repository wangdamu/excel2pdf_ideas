package com.aspose.cells.a.d;

import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.zs;
import java.util.ArrayList;
import java.util.Iterator;

public class zhp
  extends zf
{
  private zo f;
  private StringBuilder g;
  private boolean h;
  private zi i = null;
  private boolean j = false;
  private boolean k = false;
  
  public zhp(zhb paramzhb)
  {
    super(paramzhb);
  }
  
  public zhp(zhb paramzhb, boolean paramBoolean)
  {
    super(paramzhb);
    this.k = paramBoolean;
  }
  
  public boolean d()
  {
    return this.k;
  }
  
  public String a(zp paramzp, boolean paramBoolean)
    throws Exception
  {
    this.g = new StringBuilder();
    this.j = paramBoolean;
    this.i = paramzp.a();
    paramzp.a(this);
    return zs.a(this.g);
  }
  
  public void a(zq paramzq)
  {
    a(paramzq.a());
    this.f = paramzq.a();
    this.h = true;
  }
  
  public void b(zq paramzq)
  {
    if (paramzq.b()) {
      this.g.append("Z ");
    }
  }
  
  public void a(za paramza)
  {
    zy[] arrayOfzy = paramza.b();
    zy localzy = arrayOfzy[0];
    if (arrayOfzy.length <= 0) {
      return;
    }
    if (this.h)
    {
      a(localzy.a());
      this.h = false;
    }
    else
    {
      b(localzy.a());
    }
    zo[] arrayOfzo = new zo[3];
    for (int m = 0; m < arrayOfzy.length; m++)
    {
      localzy = arrayOfzy[m];
      arrayOfzo[0] = localzy.b();
      arrayOfzo[1] = localzy.c();
      arrayOfzo[2] = localzy.d();
      a(arrayOfzo);
      this.f = localzy.d();
    }
  }
  
  public void a(zu paramzu)
  {
    if (paramzu.a().size() <= 0) {
      return;
    }
    if (this.h) {
      this.h = false;
    }
    for (int m = 0; m < paramzu.a().size(); m++)
    {
      zo localzo = (zo)paramzu.a().get(m);
      if ((localzo.d() != this.f.d()) || (localzo.e() != this.f.e()))
      {
        b(localzo);
        this.f = localzo;
      }
    }
  }
  
  public void a(zt paramzt)
  {
    zy localzy1 = (zy)paramzt.a().get(0);
    if (this.h) {
      this.h = false;
    } else {
      b(localzy1.a());
    }
    Iterator localIterator = paramzt.a().iterator();
    while (localIterator.hasNext())
    {
      zy localzy2 = (zy)localIterator.next();
      zo[] arrayOfzo = new zo[3];
      arrayOfzo[0] = localzy2.b();
      arrayOfzo[1] = localzy2.c();
      arrayOfzo[2] = localzy2.d();
      a(arrayOfzo);
      this.f = localzy2.d();
    }
  }
  
  private void a(zo paramzo)
  {
    if ((this.i != null) && (this.j))
    {
      zo[] arrayOfzo = { new zo(paramzo.d(), paramzo.e()) };
      this.i.a(arrayOfzo);
      this.g.append('M');
      this.g.append(zhj.a(arrayOfzo[0]));
      this.g.append(' ');
    }
    else
    {
      this.g.append('M');
      this.g.append(zhj.a(paramzo));
      this.g.append(' ');
    }
  }
  
  private void b(zo paramzo)
  {
    if ((this.i != null) && (this.j))
    {
      zo[] arrayOfzo = { new zo(paramzo.d(), paramzo.e()) };
      this.i.a(arrayOfzo);
      this.g.append('L');
      this.g.append(zhj.a(arrayOfzo[0]));
      this.g.append(' ');
    }
    else
    {
      this.g.append('L');
      this.g.append(zhj.a(paramzo));
      this.g.append(' ');
    }
  }
  
  private void a(zo[] paramArrayOfzo)
  {
    this.g.append("C");
    if ((this.i != null) && (this.j))
    {
      zo[] arrayOfzo = new zo[paramArrayOfzo.length];
      for (int n = 0; n < arrayOfzo.length; n++) {
        arrayOfzo[n] = new zo(paramArrayOfzo[n].d(), paramArrayOfzo[n].e());
      }
      this.i.a(arrayOfzo);
      for (n = 0; n < paramArrayOfzo.length; n++)
      {
        this.g.append(zhj.a(arrayOfzo[n]));
        this.g.append(" ");
      }
    }
    else
    {
      for (int m = 0; m < paramArrayOfzo.length; m++)
      {
        this.g.append(zhj.a(paramArrayOfzo[m]));
        this.g.append(" ");
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zhp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */