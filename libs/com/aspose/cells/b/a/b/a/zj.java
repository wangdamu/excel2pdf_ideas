package com.aspose.cells.b.a.b.a;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.za;

public class zj
  implements Cloneable
{
  private zo[] a = null;
  private byte[] b = null;
  
  public zo[] a()
  {
    return this.a;
  }
  
  public final void a(zo[] paramArrayOfzo)
  {
    this.a = paramArrayOfzo;
  }
  
  public byte[] b()
  {
    return this.b;
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    this.b = paramArrayOfByte;
  }
  
  public Object clone()
    throws CloneNotSupportedException
  {
    zj localzj = (zj)super.clone();
    localzj.b = za.a(this.b);
    localzj.a = za.a(this.a);
    return localzj;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/b/a/zj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */