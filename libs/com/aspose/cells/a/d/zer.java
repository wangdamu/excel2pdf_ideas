package com.aspose.cells.a.d;

import com.aspose.cells.Color;
import com.aspose.cells.b.a.zs;

public class zer
  extends zey
{
  private Color a;
  private Color b;
  
  public zer(zdz paramzdz, Color paramColor1, Color paramColor2)
  {
    super(paramzdz);
    this.a = paramColor1;
    this.b = paramColor2;
  }
  
  public void a(zez paramzez)
    throws Exception
  {
    paramzez.a(this);
    paramzez.g();
    paramzez.a("/FunctionType", 2);
    paramzez.a("/Domain", "[0 1]");
    StringBuilder localStringBuilder = new StringBuilder(64);
    localStringBuilder.append('[');
    zgd.a(this.a, localStringBuilder);
    localStringBuilder.append(']');
    paramzez.a("/C0", zs.a(localStringBuilder));
    localStringBuilder.setLength(0);
    localStringBuilder.append('[');
    zgd.a(this.b, localStringBuilder);
    localStringBuilder.append(']');
    paramzez.a("/C1", zs.a(localStringBuilder));
    paramzez.a("/N", "1");
    paramzez.h();
    paramzez.b();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */