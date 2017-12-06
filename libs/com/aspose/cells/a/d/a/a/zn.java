package com.aspose.cells.a.d.a.a;

import com.aspose.cells.a.d.a.za;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class zn
{
  private int a;
  private int b;
  private int c;
  private int d;
  private int e;
  private int f;
  private int g;
  private int h;
  private int i;
  private int j;
  
  public zn(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = 1;
    this.d = paramInt3;
    this.e = paramInt4;
    this.f = paramInt5;
    this.g = paramInt6;
    this.h = paramInt7;
    this.i = paramInt8;
    this.j = paramInt9;
  }
  
  public byte[] a()
    throws IOException
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    za localza = new za(localByteArrayOutputStream, true);
    localza.b(40);
    localza.f(this.a);
    localza.f(this.b);
    localza.c(this.c);
    localza.c(this.d);
    localza.b(this.e);
    localza.b(this.f);
    localza.f(this.g);
    localza.f(this.h);
    localza.b(this.i);
    localza.b(this.j);
    return localByteArrayOutputStream.toByteArray();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/a/a/zn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */