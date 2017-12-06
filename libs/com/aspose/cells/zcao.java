package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcao
  extends zche
{
  zcao(zpf paramzpf)
    throws Exception
  {
    zqn localzqn = paramzpf.a;
    this.d = 644;
    int i = paramzpf.c.length();
    int j = localzqn.a.length();
    this.c = new byte[12 + i * 2 + j * 2];
    System.arraycopy(zc.a(zauj.F(localzqn.b)), 0, this.c, 0, 4);
    int k = 4;
    k = zcgj.a(this.c, k, paramzpf.c);
    k = zcgj.a(this.c, k, localzqn.a);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */