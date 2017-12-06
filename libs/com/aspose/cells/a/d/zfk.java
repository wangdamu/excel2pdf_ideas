package com.aspose.cells.a.d;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.zs;
import java.util.ArrayList;
import java.util.Iterator;

public class zfk
  extends zf
{
  private zfu f;
  private boolean g;
  
  public zfk(zhb paramzhb, zfu paramzfu)
  {
    super(paramzhb);
    this.f = paramzfu;
  }
  
  public void a(zq paramzq)
    throws Exception
  {
    a(paramzq.a());
    this.g = true;
  }
  
  public void b(zq paramzq) {}
  
  public void a(zu paramzu)
    throws Exception
  {
    if (this.g) {
      this.g = false;
    }
    for (int i = 0; i < paramzu.a().size(); i++)
    {
      zo localzo = (zo)paramzu.a().get(i);
      b(localzo);
    }
  }
  
  public void a(za paramza)
    throws Exception
  {
    zy[] arrayOfzy = paramza.b();
    if (arrayOfzy.length <= 0) {
      return;
    }
    zy localzy = arrayOfzy[0];
    if (this.g)
    {
      a(localzy.a());
      this.g = false;
    }
    else
    {
      b(localzy.a());
    }
    for (int i = 0; i < arrayOfzy.length; i++)
    {
      zo[] arrayOfzo = new zo[3];
      arrayOfzo[0] = arrayOfzy[i].b();
      arrayOfzo[1] = arrayOfzy[i].c();
      arrayOfzo[2] = arrayOfzy[i].d();
      a(arrayOfzo);
    }
  }
  
  public void a(zt paramzt)
    throws Exception
  {
    if (paramzt.a().size() <= 0) {
      return;
    }
    zy localzy1 = (zy)paramzt.a().get(0);
    if (this.g) {
      this.g = false;
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
    }
  }
  
  private void a(zo paramzo)
    throws Exception
  {
    StringBuilder localStringBuilder = new StringBuilder(16);
    zgd.a(paramzo, localStringBuilder);
    localStringBuilder.append(" m");
    this.f.c(zs.a(localStringBuilder));
  }
  
  private void b(zo paramzo)
    throws Exception
  {
    StringBuilder localStringBuilder = new StringBuilder(16);
    zgd.a(paramzo, localStringBuilder);
    localStringBuilder.append(" l");
    this.f.c(zs.a(localStringBuilder));
  }
  
  private void a(zo[] paramArrayOfzo)
    throws Exception
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    zgd.a(paramArrayOfzo, localStringBuilder);
    localStringBuilder.append(" c");
    this.f.c(zs.a(localStringBuilder));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zfk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */