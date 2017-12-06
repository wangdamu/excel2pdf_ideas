package com.aspose.cells.a.d;

import com.aspose.cells.a.c.ze;
import com.aspose.cells.a.c.zx;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.d.zm;

public class zl
  extends zn
{
  private long b;
  private zo c;
  private zt d;
  private zbx e;
  private zk f;
  private long g = 13369376L;
  public zp a = null;
  
  public zl(zo paramzo, zt paramzt, byte[] paramArrayOfByte)
  {
    this.c = paramzo;
    this.d = paramzt;
    this.e = com.aspose.cells.a.c.zn.a(null);
    this.e.a(paramArrayOfByte);
    ze localze = new ze();
    localze.a(paramArrayOfByte);
    this.b = localze.a();
    localze = null;
  }
  
  public static zl a(zo paramzo, zt paramzt, zm paramzm)
  {
    byte[] arrayOfByte = zx.a(paramzm, false);
    return new zl(paramzo, paramzt, arrayOfByte);
  }
  
  public void a(zf paramzf)
    throws Exception
  {
    paramzf.a(this);
  }
  
  public long a()
  {
    return this.b;
  }
  
  public zo b()
  {
    return this.c;
  }
  
  public zt c()
  {
    return this.d;
  }
  
  public void a(zt paramzt)
  {
    this.d = paramzt;
  }
  
  public byte[] d()
  {
    return this.e.a();
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    this.e.a(paramArrayOfByte);
  }
  
  public int e()
    throws Exception
  {
    return zcc.a(this.e.b());
  }
  
  public zcb f()
    throws Exception
  {
    return zcc.b(this.e.a());
  }
  
  public zk g()
  {
    return this.f;
  }
  
  public void a(long paramLong)
  {
    this.g = paramLong;
  }
  
  public zq h()
  {
    return new zq(b(), this.d);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */