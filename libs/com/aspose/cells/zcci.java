package com.aspose.cells;

class zcci
  extends zche
{
  zcci(zpg paramzpg)
    throws Exception
  {
    this.d = 187;
    int i = 3;
    if (paramzpg.a != null) {
      i += 4 + paramzpg.a.length() * 2;
    }
    if (paramzpg.b != null) {
      i += 4 + paramzpg.b.length() * 2;
    }
    if (paramzpg.c) {
      i += 16;
    } else {
      i += 4 + paramzpg.e.length() * 2;
    }
    this.c = new byte[i];
    int j = 3;
    if (paramzpg.a != null)
    {
      int tmp103_102 = 2;
      byte[] tmp103_99 = this.c;
      tmp103_99[tmp103_102] = ((byte)(tmp103_99[tmp103_102] | 0x2));
      j = zcgj.a(this.c, j, paramzpg.a);
    }
    if (paramzpg.b != null)
    {
      int tmp134_133 = 2;
      byte[] tmp134_130 = this.c;
      tmp134_130[tmp134_133] = ((byte)(tmp134_130[tmp134_133] | 0x1));
      j = zcgj.a(this.c, j, paramzpg.b);
    }
    if (paramzpg.c)
    {
      zcgj.a(paramzpg.f, this.c, j);
    }
    else
    {
      this.c[0] = 1;
      if (paramzpg.d) {
        this.c[1] = 1;
      }
      j = zcgj.a(this.c, j, paramzpg.e);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcci.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */