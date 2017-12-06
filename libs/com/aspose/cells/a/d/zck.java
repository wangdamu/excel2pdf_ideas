package com.aspose.cells.a.d;

import com.aspose.cells.Color;
import com.aspose.cells.b.a.b.a.zg;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zj;
import com.aspose.cells.b.a.b.zx;

public class zck
  implements zbw
{
  private int a = 0;
  private float b = 1.0F;
  private Color c = Color.getBlack();
  private long d;
  private int e = 0;
  private zj f;
  private int g = 1;
  
  public void a(zdd paramzdd)
    throws Exception
  {
    this.a = paramzdd.n();
    this.b = Math.max(paramzdd.n(), 1);
    paramzdd.n();
    this.c = paramzdd.e();
    c();
  }
  
  public void a(zcw paramzcw)
    throws Exception
  {
    this.d = paramzcw.r();
    this.a = paramzcw.q();
    this.b = Math.max(paramzcw.q(), 1);
    paramzcw.q();
    this.c = paramzcw.e();
    c();
  }
  
  public void b(zcw paramzcw)
    throws Exception
  {
    this.d = paramzcw.r();
    paramzcw.q();
    int i = paramzcw.q();
    paramzcw.q();
    int j = paramzcw.q();
    this.a = ((int)(paramzcw.r() & 0xFFFFFFFF));
    this.b = Math.max(paramzcw.q(), 1);
    int k = (int)(paramzcw.r() & 0xFFFFFFFF);
    if ((k == 0) || (k == 2)) {
      this.c = paramzcw.e();
    } else {
      paramzcw.q();
    }
    this.e = paramzcw.q();
    if ((k & 0x2) == 2) {
      this.g = 2;
    }
    paramzcw.a();
    if (k == 6)
    {
      this.g = 3;
      paramzcw.q();
      this.f = zcc.b(paramzcw, i, j);
    }
    c();
  }
  
  public zs a(Color paramColor)
    throws Exception
  {
    zs localzs = null;
    Object localObject;
    switch (this.g)
    {
    case 0: 
      return localzs;
    case 2: 
      localObject = new zg(this.e, this.c, paramColor);
      localzs = new zs((zc)localObject, this.b);
      break;
    case 3: 
      localObject = new zx(this.f);
      localzs = new zs((zc)localObject, this.b);
      break;
    case 1: 
    default: 
      localzs = new zs(this.c, this.b);
    }
    a(localzs, this.a & 0xF);
    b(localzs, this.a & 0xF00);
    c(localzs, this.a & 0xF000);
    return localzs;
  }
  
  private void c()
  {
    if ((this.a & 0xF) == 5) {
      this.g = 0;
    }
  }
  
  private static void a(zs paramzs, int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      paramzs.b(0);
      break;
    case 1: 
      paramzs.b(1);
      break;
    case 2: 
      paramzs.b(2);
      break;
    case 3: 
      paramzs.b(3);
      break;
    case 4: 
      paramzs.b(4);
      break;
    }
  }
  
  private static void b(zs paramzs, int paramInt)
    throws Exception
  {
    int i;
    switch (paramInt)
    {
    case 0: 
      i = 2;
      break;
    case 256: 
      i = 1;
      break;
    case 512: 
      i = 0;
      break;
    default: 
      throw new Exception("Unknown pen end cap style.");
    }
    paramzs.e(i);
    paramzs.c(i);
  }
  
  private static void c(zs paramzs, int paramInt)
    throws Exception
  {
    switch (paramInt)
    {
    case 0: 
      paramzs.d(2);
      break;
    case 4096: 
      paramzs.d(1);
      break;
    case 8192: 
      paramzs.d(0);
      break;
    default: 
      throw new Exception("Unknown pen join style.");
    }
  }
  
  public int a()
  {
    return 2;
  }
  
  public long b()
  {
    return this.d;
  }
  
  public void a(long paramLong)
  {
    this.d = paramLong;
  }
  
  public void a(int paramInt)
  {
    this.a = paramInt;
    c();
  }
  
  public void b(Color paramColor)
  {
    this.c = paramColor;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zck.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */