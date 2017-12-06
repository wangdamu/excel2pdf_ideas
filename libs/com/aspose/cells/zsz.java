package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zsz
  extends zcd
{
  private Style c;
  private long d;
  private int e;
  byte[] a = null;
  private boolean f;
  private int g;
  
  zsz(zbcp paramzbcp)
  {
    this.f = true;
    this.e = 2;
    if (paramzbcp.b) {
      this.e |= 0x4;
    }
    this.c = paramzbcp.c;
    b(6);
    a();
    k();
  }
  
  zsz(Style paramStyle)
  {
    this.c = paramStyle;
    b(6);
    a();
    k();
  }
  
  private void a()
  {
    this.d = 4194303L;
    int i = 0;
    if (this.c != null)
    {
      if (this.c.isModified(24))
      {
        i = 1;
        b();
      }
      if (this.c.isModified(11))
      {
        i = 1;
        c();
        b(d() + 118);
      }
      if ((this.f) && (this.c.isModified(38)))
      {
        i = 1;
        g();
        b(d() + 8);
      }
      if (this.c.isModified(1))
      {
        i = 1;
        h();
        b(d() + 8);
      }
      if (this.c.isModified(32))
      {
        i = 1;
        i();
        b(d() + 4);
      }
      if ((this.f) && (this.c.isModified(39)))
      {
        i = 1;
        j();
        b(d() + 2);
      }
    }
    if (i == 0) {
      this.d = 0L;
    }
  }
  
  private void b()
  {
    this.d |= 0x2000000;
    this.d &= 0xFFFFFFFFFFF7FFFF;
    String str = this.c.t();
    if ((str != null) && (!"".equals(str)))
    {
      this.a = zct.c(str);
      this.e |= 0x1;
      b(d() + (short)(5 + this.a.length));
    }
    else
    {
      b(d() + 2);
    }
  }
  
  private void c()
  {
    this.d |= 0x4000000;
  }
  
  private void g()
  {
    this.d |= 0x8000000;
    if (this.c.isModified(25)) {
      this.d &= 0xFFFFFFFFFFFFFFFE;
    }
    if (this.c.isModified(26)) {
      this.d &= 0xFFFFFFFFFFFFFFFD;
    }
    if (this.c.isModified(29)) {
      this.d &= 0xFFFFFFFFFFFFFFFB;
    }
    if (this.c.isModified(28)) {
      this.d &= 0xFFFFFFFFFFFFFFF7;
    }
    if (this.c.isJustifyDistributed()) {
      this.d &= 0xFFFFFFFFFFFFFFEF;
    }
    if (this.c.isModified(27)) {
      this.d &= 0xFFFFFFFFFFFFFFDF;
    }
    if (this.c.isModified(30)) {
      this.d &= 0xFFFFFFFFFFFFFFBF;
    }
    if (this.c.v()) {
      this.d &= 0xFFFFFFFFFFFFFF7F;
    }
    if (this.c.isModified(31)) {
      this.d &= 0xFFFFFFFF7FFFFFFF;
    }
  }
  
  private void h()
  {
    this.d |= 0x10000000;
    if (this.c.isModified(2)) {
      this.d &= 0xFFFFFFFFFFFFFBFF;
    }
    if (this.c.isModified(3)) {
      this.d &= 0xFFFFFFFFFFFFF7FF;
    }
    if (this.c.isModified(4)) {
      this.d &= 0xFFFFFFFFFFFFEFFF;
    }
    if (this.c.isModified(5)) {
      this.d &= 0xFFFFFFFFFFFFDFFF;
    }
  }
  
  private void i()
  {
    this.d |= 0x20000000;
    if (this.c.isModified(33)) {
      this.d &= 0xFFFFFFFFFFFEFFFF;
    }
    if (this.c.isModified(34)) {
      this.d &= 0xFFFFFFFFFFFDFFFF;
    }
    if (this.c.isModified(35)) {
      this.d &= 0xFFFFFFFFFFFBFFFF;
    }
  }
  
  private void j()
  {
    this.d |= 0x40000000;
    if (this.c.isModified(36)) {
      this.d &= 0xFFFFFFFFFFFFFEFF;
    }
    if (this.c.isModified(37)) {
      this.d &= 0xFFFFFFFFFFFFFDFF;
    }
  }
  
  private void k()
  {
    this.b = new byte[d()];
    System.arraycopy(zc.a(this.d), 0, this.b, 0, 4);
    System.arraycopy(zc.a(this.e), 0, this.b, 4, 2);
    if ((this.c == null) || ((this.d & 0xFFFFFFFF) == 0L)) {
      return;
    }
    this.g = 6;
    if (this.c.isModified(24)) {
      l();
    }
    if (this.c.isModified(11)) {
      m();
    }
    if ((this.f) && (this.c.isModified(38))) {
      n();
    }
    if (this.c.isModified(1)) {
      o();
    }
    if (this.c.isModified(32)) {
      p();
    }
    if ((this.f) && (this.c.isModified(39))) {
      q();
    }
  }
  
  private void l()
  {
    if (this.a != null)
    {
      String str = this.c.t();
      System.arraycopy(zc.a(5 + this.a.length), 0, this.b, this.g, 2);
      this.g += 2;
      System.arraycopy(zc.a(str.length()), 0, this.b, this.g, 2);
      if (str.length() != this.a.length) {
        this.b[(this.g + 2)] = 1;
      }
      this.g += 3;
      System.arraycopy(this.a, 0, this.b, this.g, this.a.length);
      this.g += this.a.length;
    }
    else
    {
      this.b[(this.g + 1)] = ((byte)(this.c.r() == -1 ? 0 : this.c.r()));
      this.g += 2;
    }
  }
  
  private void m()
  {
    for (int i = 0; i < 64; i++) {
      this.b[(this.g + i)] = 0;
    }
    if (this.c.isModified(12))
    {
      System.arraycopy(zc.a(this.c.getFont().getSize() * 20), 0, this.b, this.g + 64, 4);
    }
    else
    {
      this.b[(this.g + 64)] = -1;
      this.b[(this.g + 65)] = -1;
      this.b[(this.g + 66)] = -1;
      this.b[(this.g + 67)] = -1;
    }
    int tmp136_135 = (this.g + 68);
    byte[] tmp136_126 = this.b;
    tmp136_126[tmp136_135] = ((byte)(tmp136_126[tmp136_135] | (byte)(this.c.getFont().isItalic() ? 2 : 0)));
    int tmp171_170 = (this.g + 68);
    byte[] tmp171_161 = this.b;
    tmp171_161[tmp171_170] = ((byte)(tmp171_161[tmp171_170] | (byte)(this.c.getFont().isStrikeout() ? '' : 0)));
    if (this.c.isModified(17))
    {
      i = this.c.getFont().isBold() ? 700 : 400;
      System.arraycopy(zc.a((short)i), 0, this.b, this.g + 72, 2);
    }
    else
    {
      this.b[(this.g + 72)] = -1;
      this.b[(this.g + 73)] = -1;
    }
    i = -1;
    if (this.c.isModified(23)) {
      if (this.c.getFont().isSubscript()) {
        i = 2;
      } else if (this.c.getFont().isSuperscript()) {
        i = 1;
      }
    }
    System.arraycopy(zc.a(i), 0, this.b, this.g + 74, 2);
    int j = -1;
    if (this.c.isModified(19)) {
      switch (this.c.getFont().getUnderline())
      {
      case 1: 
        j = 1;
        break;
      case 2: 
        j = 2;
        break;
      case 3: 
        j = 33;
        break;
      case 4: 
        j = 34;
      }
    }
    this.b[(this.g + 76)] = j;
    for (int k = 0; k < 3; k++) {
      this.b[(this.g + 77 + k)] = 0;
    }
    k = -1;
    if (this.c.isModified(16)) {
      k = this.c.a(this.c.getFont().b(), 32767);
    }
    System.arraycopy(zc.a(k), 0, this.b, this.g + 80, 4);
    for (int m = 0; m < 4; m++) {
      this.b[(this.g + 84 + m)] = 0;
    }
    m = (this.c.isModified(17)) || (this.c.isModified(18)) ? 152 : 154;
    if (this.c.isModified(20)) {
      m &= 0xFF7F;
    }
    System.arraycopy(zc.a(m), 0, this.b, this.g + 88, 4);
    System.arraycopy(zc.a(this.c.isModified(23) ? 0 : 1), 0, this.b, this.g + 92, 4);
    System.arraycopy(zc.a(this.c.isModified(19) ? 0 : 1), 0, this.b, this.g + 96, 4);
    if (!this.c.isModified(17))
    {
      this.b[(this.g + 100)] = 1;
      this.b[(this.g + 101)] = 0;
      this.b[(this.g + 102)] = 0;
      this.b[(this.g + 103)] = 0;
    }
    else
    {
      this.b[(this.g + 100)] = 0;
      this.b[(this.g + 101)] = 0;
      this.b[(this.g + 102)] = 0;
      this.b[(this.g + 103)] = 0;
    }
    for (int n = 0; n < 12; n++) {
      this.b[(this.g + 104 + n)] = 0;
    }
    System.arraycopy(zc.a((short)1), 0, this.b, this.g + 116, 2);
    this.g += 118;
  }
  
  private void n()
  {
    int i = 0;
    if (this.c.isModified(25)) {
      switch (this.c.getHorizontalAlignment())
      {
      case 7: 
        i = 1;
        break;
      case 8: 
        i = 3;
        break;
      case 5: 
        i = 0;
        break;
      case 2: 
        i = 6;
        break;
      case 1: 
        i = 2;
        break;
      case 3: 
        i = 7;
        break;
      case 6: 
        i = 5;
        break;
      case 4: 
        i = 4;
        break;
      }
    }
    this.b[this.g] = i;
    if ((this.c.isModified(29)) && (this.c.isTextWrapped()))
    {
      int tmp150_147 = this.g;
      byte[] tmp150_143 = this.b;
      tmp150_143[tmp150_147] = ((byte)(tmp150_143[tmp150_147] | 0x8));
    }
    int j = 2;
    if (this.c.isModified(26)) {
      switch (this.c.getVerticalAlignment())
      {
      case 9: 
        j = 0;
        break;
      case 1: 
        j = 1;
        break;
      case 0: 
        j = 2;
        break;
      case 6: 
        j = 3;
        break;
      case 3: 
        j = 4;
        break;
      }
    }
    int tmp265_262 = this.g;
    byte[] tmp265_258 = this.b;
    tmp265_258[tmp265_262] = ((byte)(tmp265_258[tmp265_262] | (byte)(j << 4)));
    if (this.c.isJustifyDistributed())
    {
      int tmp292_289 = this.g;
      byte[] tmp292_285 = this.b;
      tmp292_285[tmp292_289] = ((byte)(tmp292_285[tmp292_289] | 0x80));
    }
    int k;
    if (this.c.isModified(28))
    {
      k = this.c.getRotationAngle();
      if (k < 0) {
        k += 270;
      }
      this.b[(this.g + 1)] = ((byte)k);
    }
    if (this.c.getIndentLevel() <= 15) {
      this.b[(this.g + 2)] = ((byte)this.c.getIndentLevel());
    } else {
      this.b[(this.g + 2)] = 15;
    }
    if (this.c.getShrinkToFit())
    {
      int tmp410_409 = (this.g + 2);
      byte[] tmp410_401 = this.b;
      tmp410_401[tmp410_409] = ((byte)(tmp410_401[tmp410_409] | 0x10));
    }
    if (this.c.v())
    {
      int tmp437_436 = (this.g + 2);
      byte[] tmp437_428 = this.b;
      tmp437_428[tmp437_436] = ((byte)(tmp437_428[tmp437_436] | 0x20));
    }
    if (this.c.isModified(31))
    {
      k = 0;
      switch (this.c.getTextDirection())
      {
      case 0: 
        k = 0;
        break;
      case 1: 
        k = 1;
        break;
      case 2: 
        k = 2;
        break;
      }
      int tmp517_516 = (this.g + 2);
      byte[] tmp517_508 = this.b;
      tmp517_508[tmp517_516] = ((byte)(tmp517_508[tmp517_516] | (byte)(k << 2)));
    }
    System.arraycopy(zc.a(this.c.getIndentLevel()), 0, this.b, this.g + 4, 4);
    this.g += 8;
  }
  
  private void o()
  {
    int i = 0;
    int j = 0;
    int k = 64;
    if (this.c.isModified(2))
    {
      i |= this.c.getBorders().getByBorderType(1).getLineStyle();
      k = this.c.a(this.c.getBorders().getByBorderType(1).a, 64);
      j |= k;
    }
    if (this.c.isModified(3))
    {
      i |= this.c.getBorders().getByBorderType(2).getLineStyle() << 4;
      k = this.c.a(this.c.getBorders().getByBorderType(2).a, 64);
      j |= k << 7;
    }
    if (this.c.isModified(4))
    {
      i |= this.c.getBorders().getByBorderType(4).getLineStyle() << 8;
      k = this.c.a(this.c.getBorders().getByBorderType(4).a, 64);
      j |= k << 16;
    }
    if (this.c.isModified(5))
    {
      i |= this.c.getBorders().getByBorderType(8).getLineStyle() << 12;
      k = this.c.a(this.c.getBorders().getByBorderType(8).a, 64);
      j |= k << 23;
    }
    System.arraycopy(zc.a((short)i), 0, this.b, this.g, 2);
    System.arraycopy(zc.a(j), 0, this.b, this.g + 2, 4);
    this.b[(this.g + 6)] = 0;
    this.b[(this.g + 7)] = 0;
    this.g += 8;
  }
  
  private void p()
  {
    int i = 0;
    int j = 0;
    if (this.c.isModified(33)) {
      i |= this.c.getPattern() << 10;
    }
    System.arraycopy(zc.a((short)i), 0, this.b, this.g, 2);
    int k = 0;
    boolean[] arrayOfBoolean = { k };
    int m = this.c.b.a(this.c.e(), 64, true, arrayOfBoolean);
    k = arrayOfBoolean[0];
    j |= m;
    k = 0;
    arrayOfBoolean = new boolean[] { k };
    m = this.c.a.a(this.c.e(), 65, true, arrayOfBoolean);
    k = arrayOfBoolean[0];
    j |= m << 7;
    System.arraycopy(zc.a((short)j), 0, this.b, this.g + 2, 2);
    this.g += 4;
  }
  
  private void q()
  {
    if (this.c.isLocked())
    {
      int tmp15_14 = 0;
      byte[] tmp15_11 = this.b;
      tmp15_11[tmp15_14] = ((byte)(tmp15_11[tmp15_14] | 0x1));
    }
    if (this.c.isFormulaHidden())
    {
      int tmp36_35 = 0;
      byte[] tmp36_32 = this.b;
      tmp36_32[tmp36_35] = ((byte)(tmp36_32[tmp36_35] | 0x2));
    }
    this.g += 2;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zsz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */