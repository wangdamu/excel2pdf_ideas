package com.aspose.cells;

import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zn;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.ze;
import java.util.ArrayList;

class zbgl
  extends zco
{
  static zn[] i = { new zn(-2147483645, -2147483645), new zn(-2147483628, -2147483628), new zn(-2147483629, -2147483630), new zn(-2147483631, -2147483632), new zn(0, 0), new zn(21600, 21600), new zn(-2147483639, -2147483640), new zn(-2147483637, -2147483638), new zn(-2147483624, -2147483625), new zn(-2147483617, -2147483618), new zn(-2147483619, -2147483620) };
  static int[] j = { 41988, 42244, 3, 24576, 32768 };
  static zn[] k = { new zn(-2147483598, -2147483599), new zn(-2147483606, -2147483605), new zn(-2147483596, -2147483597), new zn(-2147483624, -2147483625), new zn(-2147483617, -2147483618), new zn(-2147483619, -2147483620) };
  static zbgf[] l = { new zbgf(8192, 327, 0, 0), new zbgf(8192, 328, 0, 0), new zbgf(8192, 329, 0, 0), new zbgf(32768, 10800, 0, 329), new zbgf(16393, 10800, 327, 0), new zbgf(16394, 10800, 327, 0), new zbgf(16393, 10800, 328, 0), new zbgf(16394, 10800, 328, 0), new zbgf(8192, 1028, 10800, 0), new zbgf(8192, 1029, 10800, 0), new zbgf(8192, 1030, 10800, 0), new zbgf(8192, 1031, 10800, 0), new zbgf(24585, 1026, 327, 0), new zbgf(24586, 1026, 327, 0), new zbgf(24585, 1026, 328, 0), new zbgf(24586, 1026, 328, 0), new zbgf(8192, 1036, 10800, 0), new zbgf(8192, 1037, 10800, 0), new zbgf(8192, 1038, 10800, 0), new zbgf(8192, 1039, 10800, 0), new zbgf(32768, 21600, 0, 1027), new zbgf(16393, 13500, 328, 0), new zbgf(16394, 13500, 328, 0), new zbgf(8192, 1045, 10800, 0), new zbgf(8192, 1046, 10800, 0), new zbgf(8192, 329, 0, 2700), new zbgf(24585, 1049, 328, 0), new zbgf(24586, 1049, 328, 0), new zbgf(8192, 1050, 10800, 0), new zbgf(8192, 1051, 10800, 0), new zbgf(24576, 1058, 1060, 0), new zbgf(24576, 1059, 1061, 0), new zbgf(24585, 1063, 328, 0), new zbgf(24586, 1063, 328, 0), new zbgf(8192, 1056, 10800, 0), new zbgf(8192, 1057, 10800, 0), new zbgf(24585, 1065, 1062, 0), new zbgf(24586, 1065, 1062, 0), new zbgf(8206, 328, 90, 0), new zbgf(32768, 10800, 0, 1064), new zbgf(8193, 1027, 1, 2), new zbgf(8192, 1064, 2700, 0), new zbgf(24578, 1041, 1033, 0), new zbgf(24578, 1040, 1032, 0), new zbgf(24578, 1024, 1080, 0), new zbgf(16393, 10800, 1068, 0), new zbgf(16394, 10800, 1068, 0), new zbgf(24585, 1026, 1068, 0), new zbgf(24586, 1026, 1068, 0), new zbgf(8192, 1069, 10800, 0), new zbgf(8192, 1070, 10800, 0), new zbgf(8192, 1071, 10800, 0), new zbgf(8192, 1072, 10800, 0), new zbgf(40960, 1025, 0, 1024), new zbgf(8206, 0, 360, 0), new zbgf(40966, 1077, 0, 1078), new zbgf(24576, 1025, 1079, 0) };
  private int[] n = { 11796480, 0, 5500 };
  static zbbi[] m = { new zbbi(3200, 3200, 18400, 18400) };
  
  zbgl(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbnh);
  }
  
  void a()
    throws Exception
  {
    int i1 = (int)this.e.h();
    int i2 = (int)this.e.i();
    int i3 = (int)this.e.f();
    int i4 = (int)this.e.g();
    zq localzq = new zq(i1, i2, i3, i4);
    zf localzf = this.a.d();
    this.a.a(4, true);
    int i5 = 0;
    int i6 = 0;
    int i7 = 0;
    if (this.e.l.a.size() > 0)
    {
      switch (this.e.l.a.size())
      {
      case 3: 
        i5 = ze.f(Integer.valueOf(((zar)this.e.l.a.get(0)).a()));
        i6 = ze.f(Integer.valueOf(((zar)this.e.l.a.get(1)).a()));
        i7 = ze.f(Integer.valueOf(((zar)this.e.l.a.get(2)).a()));
        break;
      case 2: 
        if ((((zar)this.e.l.a.get(0)).b() == 327) && (((zar)this.e.l.a.get(1)).b() == 328))
        {
          i5 = ze.f(Integer.valueOf(((zar)this.e.l.a.get(0)).a()));
          i6 = ze.f(Integer.valueOf(((zar)this.e.l.a.get(1)).a()));
          i7 = 5500;
        }
        else if ((((zar)this.e.l.a.get(0)).b() == 327) && (((zar)this.e.l.a.get(1)).b() == 329))
        {
          i5 = ze.f(Integer.valueOf(((zar)this.e.l.a.get(0)).a()));
          i6 = 0;
          i7 = ze.f(Integer.valueOf(((zar)this.e.l.a.get(1)).a()));
        }
        else if ((((zar)this.e.l.a.get(0)).b() == 328) && (((zar)this.e.l.a.get(1)).b() == 329))
        {
          i5 = 11796480;
          i6 = ze.f(Integer.valueOf(((zar)this.e.l.a.get(0)).a()));
          i7 = ze.f(Integer.valueOf(((zar)this.e.l.a.get(1)).a()));
        }
        break;
      case 1: 
        if (((zar)this.e.l.a.get(0)).b() == 327)
        {
          i5 = ze.f(Integer.valueOf(((zar)this.e.l.a.get(0)).a()));
          i6 = 0;
          i7 = 5500;
        }
        else if (((zar)this.e.l.a.get(0)).b() == 328)
        {
          i5 = 11796480;
          i6 = ze.f(Integer.valueOf(((zar)this.e.l.a.get(0)).a()));
          i7 = 5500;
        }
        else
        {
          i5 = 11796480;
          i6 = 0;
          i7 = ze.f(Integer.valueOf(((zar)this.e.l.a.get(0)).a()));
        }
        break;
      default: 
        i5 = 11796480;
        i6 = 0;
        i7 = 5500;
      }
      this.n = new int[] { i5, i6, i7 };
    }
    zbo localzbo = new zbo(i, j, l, this.n, m, 21600, 21600, Integer.MIN_VALUE, Integer.MIN_VALUE, k);
    if (this.e.m().d()) {
      this.e.m().a(Color.getWhite());
    }
    zbn localzbn = new zbn(99, i1, i2, i3, i4, this.e.n().c(), this.e.n().f(), this.e.m().b(), localzbo);
    localzbn.a(this.e.j());
    localzbn.a(this.a, this.e, localzq);
    super.b();
    this.a.a(localzf);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbgl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */