package com.aspose.cells;

import com.aspose.cells.b.a.d.zm;
import java.util.Iterator;

public class zcjm
  extends zcjs
{
  public zcjv a;
  
  public zcjm(zcjv paramzcjv)
  {
    super(null, 5);
    this.a = paramzcjv;
  }
  
  public zcjm()
  {
    super(null, 5);
  }
  
  public void a(zm paramzm, boolean paramBoolean1, boolean paramBoolean2)
    throws Exception
  {
    Object localObject = null;
    if ((this.a instanceof zbys)) {
      localObject = new zbyt(paramzm);
    } else {
      localObject = new zcjy(paramzm);
    }
    ((zcjy)localObject).g = paramBoolean2;
    ((zcjy)localObject).b(paramBoolean1);
    ((zcjy)localObject).c = this;
    ((zcjy)localObject).a(this.a, true);
  }
  
  public void a(zm paramzm)
    throws Exception
  {
    Object localObject = null;
    if ((this.a instanceof zbys)) {
      localObject = new zbyt(paramzm);
    } else {
      localObject = new zcjy(paramzm);
    }
    ((zcjy)localObject).c = this;
    ((zcjy)localObject).a(this.a, true);
  }
  
  public void a(String paramString, boolean paramBoolean1, boolean paramBoolean2)
    throws Exception
  {
    Object localObject = null;
    if ((this.a instanceof zbys)) {
      localObject = new zbyt(paramString, paramBoolean2);
    } else {
      localObject = new zcjy(paramString, paramBoolean2);
    }
    ((zcjy)localObject).b(paramBoolean1);
    ((zcjy)localObject).c = this;
    ((zcjy)localObject).a(this.a, true);
  }
  
  public zcjn d_()
  {
    return (zcjn)this.d;
  }
  
  public zcjn f()
  {
    return (zcjn)this.d;
  }
  
  public zcjg a(String paramString)
  {
    zcjg localzcjg = new zcjg(null);
    localzcjg.d(paramString);
    return localzcjg;
  }
  
  public zcjn a(String paramString1, String paramString2, String paramString3)
  {
    zcjn localzcjn = new zcjn(null);
    localzcjn.f = paramString1;
    localzcjn.g = paramString2;
    return localzcjn;
  }
  
  public void b(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b(true);
    c(paramzcjz);
    paramzcjz.d();
    paramzcjz.e();
  }
  
  public void c(zcjz paramzcjz)
    throws Exception
  {
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      zcjs localzcjs = (zcjs)localIterator.next();
      localzcjs.a(paramzcjz);
    }
  }
  
  public void a(zcjz paramzcjz)
    throws Exception
  {
    c(paramzcjz);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcjm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */