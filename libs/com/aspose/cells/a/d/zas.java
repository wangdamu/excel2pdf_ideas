package com.aspose.cells.a.d;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zp;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.d.za;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zm;
import java.util.ArrayList;

public class zas
{
  private int b;
  private zdg c;
  private zcz d;
  private zct e;
  private ArrayList f = new ArrayList();
  private zq g = new zq();
  
  public zas(byte[] paramArrayOfByte)
    throws Exception
  {
    b(paramArrayOfByte);
  }
  
  public boolean a()
  {
    return this.b == 2;
  }
  
  public boolean b()
  {
    return this.b == 3;
  }
  
  public boolean c()
  {
    return (b()) || (f());
  }
  
  public boolean d()
  {
    return this.b == 5;
  }
  
  public boolean e()
  {
    return this.b == 4;
  }
  
  public boolean f()
  {
    return (d()) || (e());
  }
  
  public float g()
  {
    switch (this.b)
    {
    case 1: 
    case 2: 
      return o();
    }
    return this.e.c();
  }
  
  public float h()
  {
    switch (this.b)
    {
    case 1: 
    case 2: 
      return o();
    }
    return this.e.d();
  }
  
  public zt i()
    throws Exception
  {
    return k().e();
  }
  
  public zo j()
    throws Exception
  {
    return k().d();
  }
  
  public zq k()
    throws Exception
  {
    switch (this.b)
    {
    case 1: 
      return p();
    case 2: 
      if (this.d.a()) {
        return new zq(this.d.b().c(), this.d.b().d(), this.d.b().e(), this.d.b().f());
      }
      return zbe.a();
    case 3: 
    case 4: 
    case 5: 
      return this.e.b();
    }
    throw new Exception("Unknown metafile image type");
  }
  
  public int l()
  {
    return this.f.size();
  }
  
  public int m()
  {
    if (c()) {
      return 0;
    }
    return this.c.a();
  }
  
  private static int a(byte[] paramArrayOfByte)
    throws Exception
  {
    if ((!a) && (paramArrayOfByte == null)) {
      throw new AssertionError();
    }
    if (zcc.j(paramArrayOfByte)) {
      return 1;
    }
    if (zcc.k(paramArrayOfByte)) {
      return 2;
    }
    return zcc.n(paramArrayOfByte);
  }
  
  private void b(byte[] paramArrayOfByte)
    throws Exception
  {
    this.b = a(paramArrayOfByte);
    if (this.b == 0) {
      throw new IllegalArgumentException("The specified stream does not contain a valid metafile.\\r\\nParameter name: \"stream");
    }
    zh localzh = new zh(paramArrayOfByte);
    try
    {
      za localza = new za(localzh);
      a(localza);
      b(localza);
    }
    finally
    {
      if (localzh != null) {
        localzh.a();
      }
    }
  }
  
  private void a(za paramza)
    throws Exception
  {
    if (c())
    {
      this.e = new zct();
      this.e.a(paramza);
    }
    else
    {
      if (a())
      {
        this.d = new zcz();
        this.d.a(paramza);
      }
      this.c = new zdg();
      this.c.a(paramza);
    }
  }
  
  private void b(za paramza)
    throws Exception
  {
    int i = 0;
    while (paramza.k().i() < paramza.k().h())
    {
      zda localzda = new zda();
      i++;
      switch (this.b)
      {
      case 1: 
      case 2: 
        localzda.a(paramza);
        break;
      case 3: 
      case 5: 
        localzda.b(paramza);
        if (!localzda.b()) {}
        break;
      case 4: 
        localzda.b(paramza);
        break;
      default: 
        throw new Exception("Unknown Metafile type is detected");
        if ((localzda.a()) || (localzda.d() == 14)) {
          return;
        }
        zf.a(this.f, localzda);
      }
    }
  }
  
  public zda a(int paramInt)
  {
    return (zda)this.f.get(paramInt);
  }
  
  private float o()
  {
    if (a()) {
      return this.d.c();
    }
    return 96.0F;
  }
  
  private zq p()
    throws Exception
  {
    if (this.g.n())
    {
      zcs localzcs = new zcs(this);
      zdf localzdf = new zdf(localzcs);
      zdc localzdc = new zdc(localzcs, localzdf);
      localzdc.a();
      this.g = localzdf.e().a();
    }
    return this.g;
  }
  
  public int n()
  {
    return this.b;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zas.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */