package com.aspose.cells.a.d.a.a;

import com.aspose.cells.a.d.a.zb;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.io.IOException;
import java.util.Map;

public class zar
{
  private int a;
  private int b;
  private int c;
  private int d;
  private int e;
  private boolean f;
  private boolean g;
  private boolean h;
  private int i;
  private int j;
  private int k;
  private int l;
  private int m;
  private String n;
  
  public zar(Font paramFont, Map<TextAttribute, ?> paramMap)
  {
    this.a = (-paramFont.getSize());
    this.b = 0;
    this.c = 0;
    this.d = 0;
    this.e = (paramFont.isBold() ? 700 : 400);
    this.f = paramFont.isItalic();
    if (paramFont.getAttributes().containsKey(TextAttribute.UNDERLINE)) {
      if (paramFont.getAttributes().get(TextAttribute.UNDERLINE) == TextAttribute.UNDERLINE_ON) {
        this.g = true;
      } else {
        this.g = false;
      }
    }
    if ((paramMap != null) && (paramMap.containsKey(TextAttribute.UNDERLINE)) && (paramMap.get(TextAttribute.UNDERLINE) == TextAttribute.UNDERLINE_ON)) {
      this.g = true;
    }
    this.h = false;
    this.i = 0;
    this.j = 0;
    this.k = 0;
    this.l = 0;
    this.m = 0;
    this.n = paramFont.getFamily();
  }
  
  public int a()
  {
    int i1 = 0;
    if (this.e == 700) {
      i1 |= 0x1;
    }
    if (this.f) {
      i1 |= 0x2;
    }
    if (this.g) {
      i1 |= 0x4;
    }
    if (this.h) {
      i1 |= 0x8;
    }
    return i1;
  }
  
  public void a(zb paramzb)
    throws IOException
  {
    paramzb.f(this.a);
    paramzb.f(this.b);
    paramzb.f(this.c);
    paramzb.f(this.d);
    paramzb.f(this.e);
    paramzb.b(this.f);
    paramzb.b(this.g);
    paramzb.b(this.h);
    paramzb.g(this.i);
    paramzb.g(this.j);
    paramzb.g(this.k);
    paramzb.g(this.l);
    paramzb.g(this.m);
    paramzb.a(this.n, 32);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/a/a/zar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */