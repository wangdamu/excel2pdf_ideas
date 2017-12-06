package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zdz
  extends zche
{
  ExternalConnection a;
  
  zdz(ExternalConnection paramExternalConnection)
    throws Exception
  {
    this.d = 201;
    this.a = paramExternalConnection;
    int i = 23;
    int j = 0;
    if (paramExternalConnection.v != null)
    {
      i += 4 + paramExternalConnection.v.length() * 2;
      j = (byte)(j | 0x1);
    }
    if (paramExternalConnection.q != null)
    {
      i += 4 + paramExternalConnection.q.length() * 2;
      j = (byte)(j | 0x2);
    }
    if (paramExternalConnection.k != null)
    {
      i += 4 + paramExternalConnection.k.length() * 2;
      j = (byte)(j | 0x4);
    }
    if (paramExternalConnection.p != null)
    {
      i += 4 + paramExternalConnection.p.length() * 2;
      j = (byte)(j | 0x8);
    }
    if (paramExternalConnection.u != null)
    {
      i += 4 + paramExternalConnection.u.length() * 2;
      j = (byte)(j | 0x10);
    }
    this.c = new byte[i];
    int k = 0;
    this.c[k] = paramExternalConnection.s;
    k++;
    this.c[k] = paramExternalConnection.o;
    k++;
    this.c[k] = ((byte)(paramExternalConnection.t ? 1 : 2));
    k += 2;
    System.arraycopy(zc.a(paramExternalConnection.n), 0, this.c, k, 2);
    k += 2;
    System.arraycopy(zc.a(paramExternalConnection.m), 0, this.c, k, 2);
    k += 2;
    this.c[k] = j;
    k += 2;
    System.arraycopy(zc.a(paramExternalConnection.w), 0, this.c, k, 4);
    k += 4;
    switch (paramExternalConnection.r)
    {
    case 1: 
      this.c[k] = 1;
      break;
    case 2: 
      this.c[k] = 2;
      break;
    case 3: 
      this.c[k] = 3;
      break;
    default: 
      this.c[k] = 1;
    }
    k += 4;
    System.arraycopy(zc.a(paramExternalConnection.l), 0, this.c, k, 4);
    k += 4;
    switch (paramExternalConnection.j)
    {
    case 0: 
      this.c[k] = 0;
      break;
    case 1: 
      this.c[k] = 1;
      break;
    case 3: 
      this.c[k] = 2;
      break;
    }
    k++;
    if (paramExternalConnection.v != null) {
      k = zcgj.a(this.c, k, paramExternalConnection.v);
    }
    if (paramExternalConnection.q != null) {
      k = zcgj.a(this.c, k, paramExternalConnection.q);
    }
    if (paramExternalConnection.k != null) {
      k = zcgj.a(this.c, k, paramExternalConnection.k);
    }
    if (paramExternalConnection.p != null) {
      k = zcgj.a(this.c, k, paramExternalConnection.p);
    }
    if (paramExternalConnection.u != null) {
      k = zcgj.a(this.c, k, paramExternalConnection.u);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zdz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */