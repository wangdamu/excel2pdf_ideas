package com.aspose.cells;

class zbfk
  extends zcd
{
  zbfk(String paramString)
  {
    c(4109);
    if ((paramString == null) || ("".equals(paramString)))
    {
      b(4);
      this.b = new byte[4];
    }
    else
    {
      if (paramString.length() > 255) {
        throw new CellsException(6, "Series name is too long.");
      }
      byte[] arrayOfByte = Encoding.getUnicode().a(paramString);
      a((short)(4 + arrayOfByte.length));
      this.b = new byte[d()];
      this.b[2] = ((byte)paramString.length());
      this.b[3] = 1;
      System.arraycopy(arrayOfByte, 0, this.b, 4, arrayOfByte.length);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbfk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */