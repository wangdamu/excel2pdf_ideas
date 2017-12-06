package com.aspose.cells;

import com.aspose.cells.b.a.ze;
import com.aspose.cells.b.c.a.za;

class zpw
{
  boolean a = false;
  zpy b = new zpy();
  private String c;
  private boolean d = false;
  private boolean e = false;
  private int f = 0;
  private String g = null;
  private int h = 0;
  private String i = null;
  private int j = -1;
  private String k = null;
  private zaml l = new zaml(false);
  private int m = -1;
  private int n = -1;
  private boolean o = false;
  private boolean p = false;
  private boolean q = false;
  private boolean r = false;
  private boolean s = false;
  private boolean t = false;
  private boolean u = false;
  private int v = -1;
  private static final za w = new za(new String[] { "(Ê¹ÓÃÖÐÎÄ×ÖÌå)", "Berlin Sans FB Demi", "Aharoni", "Brush Script MT", "Monotype Corsiva" });
  
  String a()
  {
    return this.c;
  }
  
  void a(String paramString)
  {
    this.c = paramString;
    this.b.b(4096L);
  }
  
  boolean b()
  {
    return this.d;
  }
  
  void a(boolean paramBoolean)
  {
    this.d = paramBoolean;
    this.b.b(1L);
  }
  
  boolean c()
  {
    return this.e;
  }
  
  void b(boolean paramBoolean)
  {
    this.e = paramBoolean;
    this.b.b(2L);
  }
  
  int d()
  {
    return this.f;
  }
  
  void a(int paramInt)
  {
    this.f = paramInt;
    this.b.b(4L);
  }
  
  void b(String paramString)
  {
    this.g = paramString;
  }
  
  int e()
  {
    return this.h;
  }
  
  void b(int paramInt)
  {
    this.h = paramInt;
    this.b.b(8192L);
  }
  
  void c(String paramString)
  {
    this.i = paramString;
  }
  
  double f()
  {
    if (this.v == -1) {
      return -1.0D;
    }
    return this.v / 20.0F;
  }
  
  void a(double paramDouble)
  {
    f((int)(paramDouble * 20.0D));
    this.b.b(8L);
  }
  
  int g()
  {
    return this.j;
  }
  
  void c(int paramInt)
  {
    this.j = paramInt;
    this.b.b(16L);
  }
  
  String h()
  {
    return this.k;
  }
  
  void d(String paramString)
  {
    switch (w.a(paramString))
    {
    case 0: 
      return;
    }
    this.k = paramString;
    this.b.b(32L);
  }
  
  zaml i()
  {
    return this.l;
  }
  
  void a(zaml paramzaml)
  {
    this.l = paramzaml;
    this.b.b(64L);
  }
  
  int j()
  {
    return this.m;
  }
  
  void d(int paramInt)
  {
    this.m = paramInt;
  }
  
  int k()
  {
    return this.n;
  }
  
  void e(int paramInt)
  {
    this.n = paramInt;
  }
  
  boolean l()
  {
    return this.o;
  }
  
  void c(boolean paramBoolean)
  {
    this.o = paramBoolean;
    if (this.o) {
      this.p = false;
    }
    this.b.b(256L);
  }
  
  boolean m()
  {
    return this.p;
  }
  
  void d(boolean paramBoolean)
  {
    this.p = paramBoolean;
    if (this.p) {
      this.o = false;
    }
    this.b.b(256L);
  }
  
  boolean n()
  {
    return this.q;
  }
  
  void e(boolean paramBoolean)
  {
    this.q = paramBoolean;
    if (this.q) {
      this.r = false;
    }
    this.b.b(512L);
  }
  
  boolean o()
  {
    return this.r;
  }
  
  void f(boolean paramBoolean)
  {
    this.r = paramBoolean;
    if (this.r) {
      this.q = false;
    }
    this.b.b(1024L);
  }
  
  public boolean p()
  {
    return this.s;
  }
  
  public void g(boolean paramBoolean)
  {
    this.s = paramBoolean;
    this.b.b(16384L);
  }
  
  boolean q()
  {
    return this.t;
  }
  
  void h(boolean paramBoolean)
  {
    this.t = paramBoolean;
    if (this.t) {
      this.u = false;
    }
    this.b.b(32768L);
  }
  
  boolean r()
  {
    return this.u;
  }
  
  void i(boolean paramBoolean)
  {
    this.u = paramBoolean;
    if (this.u) {
      this.t = false;
    }
    this.b.b(32768L);
  }
  
  int s()
  {
    return this.v;
  }
  
  void f(int paramInt)
  {
    this.v = paramInt;
    this.b.b(8L);
    this.b.b(2048L);
  }
  
  void a(zpw paramzpw, double paramDouble)
  {
    if (paramzpw == null) {
      return;
    }
    if (i().a()) {
      return;
    }
    if ((paramzpw.b.a(8192L)) && (!this.b.a(8192L))) {
      b(paramzpw.e());
    }
    if ((paramzpw.b.a(64L)) && (!this.b.a(64L)))
    {
      i().f(paramzpw.i());
      this.b.b(64L);
    }
    if ((paramzpw.b.a(16L)) && (!this.b.a(16L))) {
      c(paramzpw.g());
    }
    if ((paramzpw.b.a(2L)) && (!this.b.a(2L))) {
      b(paramzpw.c());
    }
    if ((paramzpw.b.a(1L)) && (!this.b.a(1L))) {
      a(paramzpw.b());
    }
    if ((paramzpw.b.a(4L)) && (!this.b.a(4L))) {
      a(paramzpw.d());
    }
    if ((paramzpw.b.a(256L)) && (!this.b.a(256L))) {
      c(paramzpw.l());
    }
    if ((paramzpw.b.a(256L)) && (!this.b.a(256L))) {
      c(paramzpw.l());
    }
    if ((paramzpw.b.a(512L)) && (!this.b.a(512L))) {
      e(paramzpw.n());
    }
    if ((paramzpw.b.a(1024L)) && (!this.b.a(1024L))) {
      f(paramzpw.o());
    }
    if (paramzpw.b.a(16384L)) {
      g(paramzpw.p());
    }
    if (paramzpw.b.a(32768L))
    {
      h(paramzpw.q());
      i(paramzpw.r());
    }
    if ((paramzpw.b.a(32L)) && (!this.b.a(32L))) {
      d(paramzpw.h());
    }
    if ((paramzpw.b.a(2048L)) && (!this.b.a(2048L))) {
      f((int)(paramzpw.s() * paramDouble));
    }
    if ((paramzpw.b.a(4096L)) && (!this.b.a(4096L))) {
      a(paramzpw.a());
    }
  }
  
  void a(Style paramStyle)
  {
    Font localFont = paramStyle.getFont();
    if (localFont == null) {
      return;
    }
    a(localFont);
  }
  
  void a(Font paramFont)
  {
    if (paramFont == null) {
      return;
    }
    if ((this.b.a(64L)) && (!paramFont.f(16)))
    {
      paramFont.b(i());
      paramFont.g(16);
    }
    if (i().a()) {
      paramFont.b().a(i().a());
    }
    if ((g() != -1) && (this.b.a(16L)) && (!paramFont.f(14))) {
      paramFont.a(ze.a(g()));
    }
    if ((this.b.a(2L)) && (!paramFont.f(17))) {
      paramFont.setBold(c());
    }
    if ((this.b.a(1L)) && (!paramFont.f(18))) {
      paramFont.setItalic(b());
    }
    if ((this.b.a(4L)) && (!paramFont.f(19))) {
      paramFont.setUnderline(d());
    }
    if ((this.b.a(256L)) && (!paramFont.f(20))) {
      if (m()) {
        paramFont.setStrikeType(1);
      } else if (l()) {
        paramFont.setStrikeout(l());
      } else {
        paramFont.setStrikeType(2);
      }
    }
    if ((this.b.a(512L)) && (!paramFont.f(23))) {
      paramFont.setSubscript(n());
    }
    if ((this.b.a(1024L)) && (!paramFont.f(23))) {
      paramFont.setSuperscript(o());
    }
    if ((h() != null) && (this.b.a(32L)) && (!paramFont.f(13)))
    {
      if (-1 == h().indexOf("+mn-")) {
        paramFont.a(h(), false, 0);
      }
      switch (w.a(h()))
      {
      case 1: 
      case 2: 
        paramFont.setBold(true);
        break;
      case 3: 
      case 4: 
        paramFont.setItalic(true);
      }
    }
    if ((k() != -1) && (!paramFont.f(15))) {
      paramFont.setCharset(k());
    }
    if ((s() != -1) && (this.b.a(2048L)) && (!paramFont.f(17))) {
      paramFont.c(s());
    }
    if ((f() != -1.0D) && (this.b.a(8L)) && (!paramFont.f(12))) {
      paramFont.a(f());
    }
    if (a() != null) {
      paramFont.a(a());
    }
    if ((s() != -1) && (this.b.a(8192L)) && (!paramFont.f(23))) {
      paramFont.a(e());
    }
    if (this.b.a(16384L)) {
      paramFont.setNormalizeHeights(p());
    }
    if (this.b.a(32768L)) {
      if (r()) {
        paramFont.setCapsType(1);
      } else if (q()) {
        paramFont.setCapsType(2);
      } else {
        paramFont.setCapsType(0);
      }
    }
  }
  
  void b(Font paramFont)
  {
    if (paramFont == null) {
      return;
    }
    if (this.b.a(64L))
    {
      paramFont.b(i());
      paramFont.g(16);
    }
    if ((g() != -1) && (this.b.a(16L))) {
      paramFont.a(ze.a(g()));
    }
    if (this.b.a(2L)) {
      paramFont.setBold(c());
    }
    if (this.b.a(1L)) {
      paramFont.setItalic(b());
    }
    if (this.b.a(4L)) {
      paramFont.setUnderline(d());
    }
    if (this.b.a(256L)) {
      paramFont.setStrikeout(l());
    }
    if ((this.b.a(256L)) && (m())) {
      paramFont.setStrikeType(1);
    }
    if (this.b.a(512L)) {
      paramFont.setSubscript(n());
    }
    if (this.b.a(1024L)) {
      paramFont.setSuperscript(o());
    }
    if ((h() != null) && (this.b.a(32L)))
    {
      paramFont.a(h(), false, 0);
      switch (w.a(h()))
      {
      case 1: 
      case 2: 
        paramFont.setBold(true);
        break;
      case 3: 
      case 4: 
        paramFont.setItalic(true);
      }
    }
    if ((s() != -1) && (this.b.a(2048L))) {
      paramFont.c(s());
    }
    if ((f() != -1.0D) && (this.b.a(8L))) {
      paramFont.setDoubleSize(f());
    }
    if (a() != null) {
      paramFont.a(a());
    }
    if ((e() != 0) && (this.b.a(8192L))) {
      paramFont.a(e());
    }
    if (this.b.a(16384L)) {
      paramFont.setNormalizeHeights(p());
    }
    if (this.b.a(32768L)) {
      if (r()) {
        paramFont.setCapsType(1);
      } else if (q()) {
        paramFont.setCapsType(2);
      } else {
        paramFont.setCapsType(0);
      }
    }
  }
  
  boolean t()
  {
    return !this.b.a(65535L);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zpw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */