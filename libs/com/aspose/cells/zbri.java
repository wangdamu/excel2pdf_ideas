package com.aspose.cells;

class zbri
  extends zaet
{
  public zbri(zaeo paramzaeo)
  {
    this.a = paramzaeo;
  }
  
  public int a(String[] paramArrayOfString)
  {
    if (paramArrayOfString[0].length() == 0) {
      return -1;
    }
    switch (paramArrayOfString[0].charAt(0))
    {
    case '\n': 
    case '\r': 
      this.a.g = this.a.c;
      break;
    case '&': 
      this.a.g = this.a.f;
      break;
    default: 
      this.a.g = this.a.b;
    }
    return 1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbri.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */