package com.aspose.cells.b.a.b.a;

import com.aspose.cells.Color;

public class zc
{
  private float[] a = new float[1];
  private Color[] b = new Color[1];
  
  public float[] a()
  {
    return this.a;
  }
  
  public void a(float[] paramArrayOfFloat)
  {
    this.a = paramArrayOfFloat;
  }
  
  public Color[] b()
  {
    return this.b;
  }
  
  public void a(Color[] paramArrayOfColor)
  {
    this.b = paramArrayOfColor;
  }
  
  public zc c()
  {
    zc localzc = new zc();
    Object localObject;
    int i;
    if (this.b != null)
    {
      localObject = new Color[this.b.length];
      for (i = 0; i < this.b.length; i++) {
        localObject[i] = this.b[i].a();
      }
      localzc.b = ((Color[])localObject);
    }
    if (this.a != null)
    {
      localObject = new float[this.a.length];
      for (i = 0; i < this.a.length; i++) {
        localObject[i] = this.a[i];
      }
      localzc.a = this.a;
    }
    return localzc;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/b/a/zc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */