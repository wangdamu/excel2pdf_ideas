package com.aspose.cells;

import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zn;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.ze;
import java.util.ArrayList;

class zbky
  extends zco
{
  static zn[] i = { new zn(0, 0), new zn(21600, 21600), new zn(Integer.MIN_VALUE, Integer.MIN_VALUE), new zn(-2147483647, -2147483647), new zn(-2147483639, -2147483638), new zn(-2147483637, -2147483636), new zn(Integer.MIN_VALUE, Integer.MIN_VALUE), new zn(-2147483647, -2147483647), new zn(-2147483635, -2147483634), new zn(-2147483633, -2147483632) };
  static int[] j = { 41730, 41988, 24576, 41988, 24576, 32768 };
  static zn[] k = { new zn(10800, 0), new zn(3160, 3160), new zn(0, 10800), new zn(3160, 18440), new zn(10800, 21600), new zn(18440, 18440), new zn(21600, 10800), new zn(18440, 3160) };
  static zbgf[] l = { new zbgf(8192, 327, 0, 0), new zbgf(32768, 21600, 0, 327), new zbgf(32768, 10800, 0, 327), new zbgf(8193, 327, 1, 2), new zbgf(41088, 1027, 0, 1026), new zbgf(32768, 10800, 0, 1027), new zbgf(16384, 10800, 1027, 0), new zbgf(32768, 10800, 0, 1028), new zbgf(16384, 10800, 1028, 0), new zbgf(24705, 1029, 1031, 450), new zbgf(24706, 1029, 1031, 450), new zbgf(24705, 1029, 1032, 450), new zbgf(24706, 1029, 1032, 450), new zbgf(24705, 1030, 1032, 450), new zbgf(24706, 1030, 1032, 450), new zbgf(24705, 1030, 1031, 450), new zbgf(24706, 1030, 1031, 450) };
  private int[] n = { 2700 };
  static zbbi[] m = { new zbbi(3200, 3200, 18400, 18400) };
  
  zbky(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
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
    if (this.e.l.a.size() > 0)
    {
      i5 = ze.f(Integer.valueOf(((zar)this.e.l.a.get(0)).a()));
      this.n = new int[] { i5 };
    }
    else
    {
      this.n = new int[] { 2700 };
    }
    zbo localzbo = new zbo(i, j, l, this.n, m, 21600, 21600, Integer.MIN_VALUE, Integer.MIN_VALUE, k);
    if (this.e.m().d()) {
      this.e.m().a(Color.getWhite());
    }
    zbn localzbn = new zbn(57, i1, i2, i3, i4, this.e.n().c(), this.e.n().f(), this.e.m().b(), localzbo);
    localzbn.a(this.e.j());
    localzbn.b(this.e.F());
    localzbn.a(this.e.E());
    localzbn.a(this.a, this.e, localzq);
    super.b();
    this.a.a(localzf);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbky.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */