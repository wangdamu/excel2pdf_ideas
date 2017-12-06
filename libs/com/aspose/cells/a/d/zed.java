package com.aspose.cells.a.d;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.zs;

public class zed
  extends zeb
{
  private int a;
  private zo b;
  
  public zed(int paramInt, zo paramzo, zdz paramzdz)
  {
    super(paramzdz);
    this.a = paramInt;
    this.b = paramzo;
  }
  
  public String a()
  {
    StringBuilder localStringBuilder = new StringBuilder(32);
    localStringBuilder.append('[');
    localStringBuilder.append(this.e.d().a(b()));
    localStringBuilder.append(" /XYZ ");
    zgd.a(this.b, localStringBuilder);
    localStringBuilder.append(" 0]");
    return zs.a(localStringBuilder);
  }
  
  public int b()
  {
    return this.a;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zed.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */