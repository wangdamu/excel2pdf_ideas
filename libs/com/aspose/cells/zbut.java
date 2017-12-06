package com.aspose.cells;

class zbut
{
  String a;
  byte[] b;
  int c;
  
  zbut(String paramString)
  {
    this.a = paramString;
    this.c = 0;
    this.b = new byte[] { 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 2, 0, 16, 0 };
  }
  
  boolean a()
  {
    return (this.c & 0xFFFF) == 0;
  }
  
  void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.c = 0;
    } else {
      this.c = 1;
    }
  }
  
  zbut()
  {
    this.a = "";
    this.c = 0;
    this.b = new byte[] { 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 2, 0, 16, 0 };
  }
  
  void a(zbut paramzbut)
  {
    this.a = paramzbut.a;
    if (paramzbut.b != null)
    {
      this.b = new byte[paramzbut.b.length];
      System.arraycopy(paramzbut.b, 0, this.b, 0, this.b.length);
    }
    this.c = paramzbut.c;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbut.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */