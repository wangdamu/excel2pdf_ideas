package com.aspose.cells.a.d;

import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;

public class zcr
{
  private zcs a;
  private float b = Float.MAX_VALUE;
  private float c = Float.MAX_VALUE;
  private float d = -3.4028235E38F;
  private float e = -3.4028235E38F;
  
  public zcr(zcs paramzcs)
  {
    this.a = paramzcs;
  }
  
  public void a(zo paramzo, float paramFloat)
  {
    zo[] arrayOfzo = { paramzo };
    this.a.d().p().a(arrayOfzo);
    paramzo = arrayOfzo[0];
    b(paramzo, paramFloat);
  }
  
  public void a(zo[] paramArrayOfzo, float paramFloat)
  {
    this.a.d().p().a(paramArrayOfzo);
    for (int i = 0; i < paramArrayOfzo.length; i++) {
      b(paramArrayOfzo[i], paramFloat);
    }
  }
  
  public void a(zo[][] paramArrayOfzo, float paramFloat)
  {
    for (int i = 0; i < paramArrayOfzo.length; i++) {
      a(paramArrayOfzo[i], paramFloat);
    }
  }
  
  public void b(zo[] paramArrayOfzo, float paramFloat)
  {
    for (int i = 0; i < paramArrayOfzo.length; i++) {
      b(paramArrayOfzo[i], paramFloat);
    }
  }
  
  private void b(zo paramzo, float paramFloat)
  {
    this.b = Math.min(this.b, paramzo.d() - paramFloat);
    this.c = Math.min(this.c, paramzo.e() - paramFloat);
    this.d = Math.max(this.d, paramzo.d() + paramFloat);
    this.e = Math.max(this.e, paramzo.e() + paramFloat);
  }
  
  public zq a()
  {
    return zq.a(this.b, this.c, this.d, this.e);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zcr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */