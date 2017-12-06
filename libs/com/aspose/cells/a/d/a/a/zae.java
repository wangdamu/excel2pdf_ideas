package com.aspose.cells.a.d.a.a;

import com.aspose.cells.a.d.a.zb;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.io.IOException;
import java.util.Map;

public class zae
{
  private zar a;
  private String b;
  private String c;
  private int d;
  private int e;
  private int f;
  private byte[] g;
  private int h;
  private zaw i;
  
  public zae(Font paramFont, Map<TextAttribute, ?> paramMap)
  {
    this.a = new zar(paramFont, paramMap);
    this.b = "";
    this.c = "";
    this.d = 0;
    this.e = 0;
    this.f = 0;
    this.g = new byte[] { 0, 0, 0, 0 };
    this.h = 0;
    this.i = new zaw();
  }
  
  public void a(zb paramzb)
    throws IOException
  {
    this.a.a(paramzb);
    paramzb.a(this.b, 64);
    paramzb.a(this.c, 32);
    paramzb.b(this.d);
    paramzb.b(this.e);
    paramzb.b(this.f);
    paramzb.b(0);
    paramzb.b(this.g);
    paramzb.b(this.h);
    this.i.a(paramzb);
    paramzb.c(0);
  }
  
  public int a()
  {
    return this.a.a();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/a/a/zae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */