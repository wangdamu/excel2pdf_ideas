package com.aspose.cells;

class zaxx
{
  int a;
  int b;
  String c;
  int d;
  
  zaxx(int paramInt1, int paramInt2, String paramString, int paramInt3)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramString;
    this.d = paramInt3;
  }
  
  Object a()
  {
    switch (this.d)
    {
    case 4: 
      return "";
    case 3: 
      return Integer.valueOf(0);
    case 2: 
      return Double.valueOf(0.0D);
    case 0: 
      return Boolean.valueOf(false);
    case 1: 
      return DateTime.a;
    case 5: 
      return null;
    }
    throw new CellsException(6, "Unknown property type.");
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaxx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */