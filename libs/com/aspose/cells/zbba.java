package com.aspose.cells;

class zbba
  extends zcd
{
  zbba()
  {
    c(2136);
  }
  
  void a(String paramString)
    throws Exception
  {
    a((short)(8 + paramString.length() * 2));
    this.b = new byte[d()];
    this.b[0] = 88;
    this.b[1] = 8;
    this.b[2] = 18;
    this.b[6] = ((byte)paramString.length());
    this.b[7] = 1;
    byte[] arrayOfByte = Encoding.getUnicode().a(paramString);
    System.arraycopy(arrayOfByte, 0, this.b, 8, arrayOfByte.length);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */