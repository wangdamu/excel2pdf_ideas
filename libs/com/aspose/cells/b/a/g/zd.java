package com.aspose.cells.b.a.g;

import com.aspose.cells.Encoding;

public class zd
  extends Encoding
{
  boolean b = true;
  
  public zd()
  {
    super(65001, "UTF-8", "utf-8");
  }
  
  public zd(boolean paramBoolean)
  {
    super(65001, "UTF-8", "utf-8");
    this.b = paramBoolean;
  }
  
  public byte[] g()
  {
    if (this.b) {
      return new byte[] { -17, -69, -65 };
    }
    return new byte[0];
  }
  
  public boolean equals(Encoding other)
  {
    if (!super.equals(other)) {
      return false;
    }
    if ((other instanceof zd)) {
      return this.b == ((zd)other).b;
    }
    return this.b;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/g/zd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */