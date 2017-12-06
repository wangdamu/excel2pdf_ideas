package com.aspose.cells;

import java.util.HashMap;

class zasi
{
  String a;
  String b;
  boolean c;
  boolean d;
  String[] e;
  String[] f;
  String[] g;
  String[] h;
  
  void a(PageSetup paramPageSetup, zasg paramzasg)
  {
    if (this.b == null) {
      this.b = "Default";
    }
    zask localzask = (zask)paramzasg.o.a.get(this.b);
    localzask.a(paramPageSetup);
    int i;
    if (this.e != null) {
      for (i = 0; i < this.e.length; i++) {
        if ((this.e[i] != null) && (this.e[i].length() != 0)) {
          paramPageSetup.setHeader(i, this.e[i]);
        }
      }
    }
    if (this.f != null) {
      for (i = 0; i < this.f.length; i++) {
        if ((this.f[i] != null) && (this.f[i].length() != 0)) {
          paramPageSetup.setFooter(i, this.f[i]);
        }
      }
    }
    if ((this.c) && (this.d))
    {
      paramPageSetup.setHFDiffOddEven(true);
      if (this.g != null) {
        for (i = 0; i < this.g.length; i++) {
          if ((this.g[i] != null) && (this.g[i].length() != 0)) {
            paramPageSetup.setEvenHeader(i, this.g[i]);
          }
        }
      }
      if (this.h != null) {
        for (i = 0; i < this.h.length; i++) {
          if ((this.h[i] != null) && (this.h[i].length() != 0)) {
            paramPageSetup.setEvenFooter(i, this.h[i]);
          }
        }
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zasi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */