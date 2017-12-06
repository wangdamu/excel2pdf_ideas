package com.aspose.cells;

import com.aspose.cells.b.a.zm;

class zbsx
{
  Font a;
  String b;
  int c = 0;
  
  zbsx(Font paramFont, String paramString)
  {
    this.a = paramFont;
    this.b = paramString;
  }
  
  zbsx(Font paramFont, String paramString, int paramInt)
  {
    this.a = paramFont;
    this.b = paramString;
    this.c = paramInt;
  }
  
  public boolean equals(Object obj)
  {
    if (obj == null) {
      return false;
    }
    zbsx localzbsx = (zbsx)zm.a(obj, zbsx.class);
    if (localzbsx == null) {
      return false;
    }
    return a(localzbsx);
  }
  
  private boolean a(zbsx paramzbsx)
  {
    if (paramzbsx == null) {
      return false;
    }
    int i = 0;
    if ((this.a == null) && (paramzbsx.a == null)) {
      i = 1;
    } else if ((this.a != null) && (paramzbsx.a != null) && (this.a.equals(paramzbsx.a))) {
      i = 1;
    }
    if (i == 0) {
      return false;
    }
    return (this.b.equals(paramzbsx.b)) && (this.c == paramzbsx.c);
  }
  
  public int hashCode()
  {
    int i = this.a == null ? 0 : this.a.hashCode();
    int j = this.b == null ? 0 : this.b.hashCode();
    return i + j + this.c;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbsx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */