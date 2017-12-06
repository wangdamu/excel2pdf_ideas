package com.aspose.cells.b.a.b.a.a;

import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;

public class zb
  implements PathIterator, Cloneable
{
  private int a = 0;
  private int b = 0;
  private za c;
  private AffineTransform d;
  private static final int[] e = { 2, 2, 4, 6, 0 };
  
  public zb(za paramza, AffineTransform paramAffineTransform)
  {
    this.c = paramza;
    this.d = paramAffineTransform;
  }
  
  public int getWindingRule()
  {
    return this.c.i();
  }
  
  public boolean isDone()
  {
    return this.a >= this.c.c();
  }
  
  public void next()
  {
    int i = this.c.a()[(this.a++)] & 0x7;
    this.b += e[i];
  }
  
  public int currentSegment(float[] coords)
  {
    int i = this.c.a()[this.a] & 0x7;
    int j = e[i];
    if ((j > 0) && (this.d != null)) {
      this.d.transform(this.c.b(), this.b, coords, 0, j / 2);
    } else {
      System.arraycopy(this.c.b(), this.b, coords, 0, j);
    }
    return i;
  }
  
  public int currentSegment(double[] coords)
  {
    int i = this.c.a()[this.a] & 0x7;
    int j = e[i];
    if ((j > 0) && (this.d != null)) {
      this.d.transform(this.c.b(), this.b, coords, 0, j / 2);
    } else {
      for (int k = 0; k < j; k++) {
        coords[k] = this.c.b()[(this.b + k)];
      }
    }
    return i;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/b/a/a/zb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */