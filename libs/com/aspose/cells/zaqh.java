package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zaqh
  extends zcd
{
  zaqh(Name paramName)
  {
    c(24);
    String str = paramName.getText();
    b(14);
    if (paramName.b() != null) {
      b(d() + (short)(paramName.b().length - 2));
    }
    if (paramName.r() == 0) {
      b(d() + 2);
    } else {
      b(d() + (short)(zct.b(paramName.getText()) ? 1 + paramName.getText().length() : 1 + paramName.getText().length() * 2));
    }
    if (paramName.c() != null) {
      b(d() + (short)(zct.b(paramName.c()) ? 1 + paramName.c().length() : 1 + paramName.c().length() * 2));
    }
    if (paramName.d() != null) {
      b(d() + (short)(zct.b(paramName.d()) ? 1 + paramName.d().length() : 1 + paramName.d().length() * 2));
    }
    if (paramName.e() != null) {
      b(d() + (short)(zct.b(paramName.e()) ? 1 + paramName.e().length() : 1 + paramName.e().length() * 2));
    }
    if (paramName.f() != null) {
      b(d() + (short)(zct.b(paramName.f()) ? 1 + paramName.f().length() : 1 + paramName.f().length() * 2));
    }
    this.b = new byte[d()];
    System.arraycopy(zc.a(paramName.a()), 0, this.b, 0, 2);
    this.b[2] = paramName.g();
    if (paramName.r() == 0) {
      this.b[3] = 1;
    } else {
      this.b[3] = ((byte)paramName.getText().length());
    }
    if (paramName.b() != null) {
      System.arraycopy(paramName.b(), 0, this.b, 4, 2);
    }
    System.arraycopy(zc.a(paramName.getSheetIndex()), 0, this.b, 8, 2);
    this.b[10] = ((byte)(paramName.c() != null ? paramName.c().length() : 0));
    this.b[11] = ((byte)(paramName.d() != null ? paramName.d().length() : 0));
    this.b[12] = ((byte)(paramName.e() != null ? paramName.e().length() : 0));
    this.b[13] = ((byte)(paramName.f() != null ? paramName.f().length() : 0));
    int i = 14;
    byte[] arrayOfByte;
    if (paramName.r() == 0)
    {
      this.b[15] = paramName.t();
      i = 16;
    }
    else
    {
      str = paramName.getText();
      if (!"".equals(str))
      {
        arrayOfByte = zct.c(str);
        this.b[(i++)] = ((byte)(arrayOfByte.length == str.length() ? 0 : 1));
        System.arraycopy(arrayOfByte, 0, this.b, i, arrayOfByte.length);
        i += arrayOfByte.length;
      }
      else
      {
        this.b[(i++)] = 0;
      }
    }
    if (paramName.b() != null)
    {
      System.arraycopy(paramName.b(), 2, this.b, i, paramName.b().length - 2);
      i += paramName.b().length - 2;
    }
    if (paramName.c() != null)
    {
      str = paramName.c();
      arrayOfByte = zct.c(str);
      this.b[(i++)] = ((byte)(arrayOfByte.length == str.length() ? 0 : 1));
      System.arraycopy(arrayOfByte, 0, this.b, i, arrayOfByte.length);
      i += arrayOfByte.length;
    }
    if (paramName.d() != null)
    {
      str = paramName.d();
      arrayOfByte = zct.c(str);
      this.b[(i++)] = ((byte)(arrayOfByte.length == str.length() ? 0 : 1));
      System.arraycopy(arrayOfByte, 0, this.b, i, arrayOfByte.length);
      i += arrayOfByte.length;
    }
    if (paramName.e() != null)
    {
      str = paramName.e();
      arrayOfByte = zct.c(str);
      this.b[(i++)] = ((byte)(arrayOfByte.length == str.length() ? 0 : 1));
      System.arraycopy(arrayOfByte, 0, this.b, i, arrayOfByte.length);
      i += arrayOfByte.length;
    }
    if (paramName.f() != null)
    {
      str = paramName.f();
      arrayOfByte = zct.c(str);
      this.b[(i++)] = ((byte)(arrayOfByte.length == str.length() ? 0 : 1));
      System.arraycopy(arrayOfByte, 0, this.b, i, arrayOfByte.length);
      i += arrayOfByte.length;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaqh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */