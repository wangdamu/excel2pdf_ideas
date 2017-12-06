package com.aspose.cells.a.d;

import com.aspose.cells.Color;
import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;

public class zdf
  extends zdb
{
  private zcr b;
  
  public zdf(zcs paramzcs)
  {
    super(paramzcs);
    this.b = new zcr(paramzcs);
  }
  
  public void a(zo paramzo, String paramString)
    throws Exception
  {
    b(paramzo, paramString);
  }
  
  public void a(zo paramzo, Color paramColor)
    throws Exception
  {
    this.b.a(paramzo, f());
  }
  
  public void a(zo paramzo)
    throws Exception
  {
    float f = f();
    this.b.a(new zo[] { c(), paramzo }, f);
  }
  
  public void a(zq paramzq)
    throws Exception
  {
    d(paramzq);
  }
  
  public void b(zq paramzq)
    throws Exception
  {
    d(paramzq);
  }
  
  public void a(zo[] paramArrayOfzo)
    throws Exception
  {
    this.b.a(paramArrayOfzo, f());
  }
  
  public void b(zo[] paramArrayOfzo)
    throws Exception
  {
    this.b.a(paramArrayOfzo, f());
  }
  
  public void a(zo[][] paramArrayOfzo)
    throws Exception
  {
    this.b.a(paramArrayOfzo, f());
  }
  
  public void a(zq paramzq, zo paramzo1, zo paramzo2)
    throws Exception
  {
    d(paramzq, paramzo1, paramzo2);
  }
  
  public void c(zq paramzq)
    throws Exception
  {
    d(paramzq);
  }
  
  public void b(zq paramzq, zo paramzo1, zo paramzo2)
    throws Exception
  {
    d(paramzq, paramzo1, paramzo2);
  }
  
  public void c(zq paramzq, zo paramzo1, zo paramzo2)
    throws Exception
  {
    d(paramzq, paramzo1, paramzo2);
  }
  
  public void a(zq paramzq, zt paramzt)
    throws Exception
  {
    d(paramzq);
  }
  
  public void a(zq paramzq1, zq paramzq2, byte[] paramArrayOfByte)
    throws Exception
  {
    d(paramzq2);
  }
  
  private void b(zo paramzo, String paramString)
    throws Exception
  {
    zq localzq = new zq(paramzo, zbj.b(paramString, a().e()));
    localzq.c(localzq.h() + a().l() * paramString.length());
    zo[] arrayOfzo1 = { paramzo };
    zi localzi = a().a(arrayOfzo1, localzq.e(), a().e());
    paramzo = arrayOfzo1[0];
    localzq.a(paramzo);
    zo[] arrayOfzo2 = { new zo(localzq.f(), localzq.g()), new zo(localzq.f() + localzq.h(), localzq.g()), new zo(localzq.f(), localzq.g() + localzq.i()), new zo(localzq.f() + localzq.h(), localzq.g() + localzq.i()) };
    localzi.a(arrayOfzo2);
    this.b.b(arrayOfzo2, 0.0F);
  }
  
  private void d(zq paramzq)
    throws Exception
  {
    float f = f();
    this.b.a(new zo[] { new zo(paramzq.f(), paramzq.g()), new zo(paramzq.f() + paramzq.h(), paramzq.g() + paramzq.i()) }, f);
  }
  
  private void d(zq paramzq, zo paramzo1, zo paramzo2)
    throws Exception
  {
    float f = f();
    this.b.a(new zo[] { paramzo1, paramzo2 }, f);
    zo localzo1 = new zo(paramzq.f(), paramzq.g());
    zo localzo2 = new zo(paramzq.f() + paramzq.h(), paramzq.g() + paramzq.i());
    zo localzo3 = new zo((localzo1.d() + localzo2.d()) / 2.0F, (localzo1.e() + localzo2.e()) / 2.0F);
    paramzo1.a(paramzo1.d() - localzo3.d());
    paramzo1.b(paramzo1.e() - localzo3.e());
    paramzo2.a(paramzo2.d() - localzo3.d());
    paramzo2.b(paramzo2.e() - localzo3.e());
    int i = c(paramzo1);
    int j = c(paramzo2);
    switch (i)
    {
    case 1: 
      switch (j)
      {
      case 1: 
        if ((paramzo2.d() >= paramzo1.d()) || (paramzo2.e() >= paramzo1.e()))
        {
          this.b.a(new zo(localzo2.d(), localzo3.e()), f);
          this.b.a(new zo(localzo3.d(), localzo2.e()), f);
          this.b.a(new zo(localzo1.d(), localzo3.e()), f);
          this.b.a(new zo(localzo3.d(), localzo1.e()), f);
        }
        break;
      case 4: 
        this.b.a(new zo(localzo3.d(), localzo2.e()), f);
        this.b.a(new zo(localzo1.d(), localzo3.e()), f);
        this.b.a(new zo(localzo3.d(), localzo1.e()), f);
        break;
      case 3: 
        this.b.a(new zo(localzo1.d(), localzo3.e()), f);
        this.b.a(new zo(localzo3.d(), localzo1.e()), f);
        break;
      case 2: 
        this.b.a(new zo(localzo3.d(), localzo1.e()), f);
        break;
      default: 
        throw new IllegalStateException("Unknown quarter.");
      }
      break;
    case 2: 
      switch (j)
      {
      case 2: 
        if ((paramzo2.d() >= paramzo1.d()) || (paramzo2.e() <= paramzo1.e()))
        {
          this.b.a(new zo(localzo3.d(), localzo1.e()), f);
          this.b.a(new zo(localzo2.d(), localzo3.e()), f);
          this.b.a(new zo(localzo3.d(), localzo2.e()), f);
          this.b.a(new zo(localzo1.d(), localzo3.e()), f);
        }
        break;
      case 1: 
        this.b.a(new zo(localzo2.d(), localzo3.e()), f);
        this.b.a(new zo(localzo3.d(), localzo2.e()), f);
        this.b.a(new zo(localzo1.d(), localzo3.e()), f);
        break;
      case 4: 
        this.b.a(new zo(localzo3.d(), localzo2.e()), f);
        this.b.a(new zo(localzo1.d(), localzo3.e()), f);
        break;
      case 3: 
        this.b.a(new zo(localzo1.d(), localzo3.e()), f);
        break;
      default: 
        throw new IllegalStateException("Unknown quarter.");
      }
      break;
    case 3: 
      switch (j)
      {
      case 3: 
        if ((paramzo2.d() <= paramzo1.d()) || (paramzo2.e() <= paramzo1.e()))
        {
          this.b.a(new zo(localzo1.d(), localzo3.e()), f);
          this.b.a(new zo(localzo3.d(), localzo1.e()), f);
          this.b.a(new zo(localzo2.d(), localzo3.e()), f);
          this.b.a(new zo(localzo3.d(), localzo2.e()), f);
        }
        break;
      case 2: 
        this.b.a(new zo(localzo3.d(), localzo1.e()), f);
        this.b.a(new zo(localzo2.d(), localzo3.e()), f);
        this.b.a(new zo(localzo3.d(), localzo2.e()), f);
        break;
      case 1: 
        this.b.a(new zo(localzo2.d(), localzo3.e()), f);
        this.b.a(new zo(localzo3.d(), localzo2.e()), f);
        break;
      case 4: 
        this.b.a(new zo(localzo3.d(), localzo2.e()), f);
        break;
      default: 
        throw new IllegalStateException("Unknown quarter.");
      }
      break;
    case 4: 
      switch (j)
      {
      case 4: 
        if ((paramzo2.d() <= paramzo1.d()) || (paramzo2.e() >= paramzo1.e()))
        {
          this.b.a(new zo(localzo3.d(), localzo2.e()), f);
          this.b.a(new zo(localzo1.d(), localzo3.e()), f);
          this.b.a(new zo(localzo3.d(), localzo1.e()), f);
          this.b.a(new zo(localzo2.d(), localzo3.e()), f);
        }
        break;
      case 3: 
        this.b.a(new zo(localzo1.d(), localzo3.e()), f);
        this.b.a(new zo(localzo3.d(), localzo1.e()), f);
        this.b.a(new zo(localzo2.d(), localzo3.e()), f);
        break;
      case 2: 
        this.b.a(new zo(localzo3.d(), localzo1.e()), f);
        this.b.a(new zo(localzo2.d(), localzo3.e()), f);
        break;
      case 1: 
        this.b.a(new zo(localzo2.d(), localzo3.e()), f);
        break;
      default: 
        throw new IllegalStateException("Unknown quarter.");
      }
      break;
    default: 
      throw new IllegalStateException("Unknown quarter.");
    }
  }
  
  private static int c(zo paramzo)
  {
    if ((paramzo.d() > 0.0F) && (paramzo.e() >= 0.0F)) {
      return 1;
    }
    if ((paramzo.d() <= 0.0F) && (paramzo.e() > 0.0F)) {
      return 2;
    }
    if ((paramzo.d() < 0.0F) && (paramzo.e() <= 0.0F)) {
      return 3;
    }
    return 4;
  }
  
  private float f()
    throws Exception
  {
    return a().c() != null ? a().c().p() / 2.0F : 0.0F;
  }
  
  public zcr e()
  {
    return this.b;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zdf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */