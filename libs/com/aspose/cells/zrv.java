package com.aspose.cells;

class zrv
{
  int a = -1;
  boolean b = false;
  zot c = null;
  zrk d = null;
  int e = 0;
  int f = 0;
  int g = 0;
  int h = 0;
  int i = 0;
  int j = -1;
  boolean k;
  boolean l = false;
  boolean m = false;
  boolean n = false;
  boolean o = false;
  boolean p = false;
  boolean q = false;
  Style r = null;
  zoz s = null;
  boolean t = false;
  
  boolean a(zrv paramzrv)
  {
    if ((this.e == paramzrv.e) && (this.f == paramzrv.f) && (this.g == paramzrv.g) && (this.h == paramzrv.h) && (this.i == paramzrv.i))
    {
      if (this.c == null)
      {
        if (paramzrv.c != null) {
          return false;
        }
      }
      else
      {
        if (paramzrv.c == null) {
          return false;
        }
        if (!paramzrv.c.a(paramzrv.c)) {
          return false;
        }
      }
      if (this.d == null)
      {
        if (paramzrv.d != null) {
          return false;
        }
      }
      else
      {
        if (paramzrv.d == null) {
          return false;
        }
        if (!this.d.a(paramzrv.d)) {
          return false;
        }
      }
      return true;
    }
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zrv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */