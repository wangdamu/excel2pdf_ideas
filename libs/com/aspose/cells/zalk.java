package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.ze;
import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.HashMap;

class zalk
{
  private zqh a = null;
  private WorksheetCollection b;
  private ArrayList c;
  private ArrayList d;
  private ArrayList e;
  private ArrayList f;
  private ArrayList g;
  private ArrayList h;
  private static final com.aspose.cells.b.c.a.za i = new com.aspose.cells.b.c.a.za(new String[] { "Normal", "Default", "xf", "AlternateContent", "font", "numFmtId", "fontId", "fillId", "borderId", "xfId", "applyNumberFormat", "applyFont", "applyFill", "applyBorder", "applyAlignment", "applyProtection", "quotePrefix", "alignment", "protection", "left", "start", "right", "end", "top", "bottom", "diagonal", "horizontal", "vertical", "indexed", "rgb", "theme", "tint" });
  
  zalk(zqh paramzqh)
  {
    this.a = paramzqh;
    this.b = this.a.a.getWorksheets();
  }
  
  void a(zcjy paramzcjy)
    throws Exception
  {
    A(paramzcjy);
    if (paramzcjy.o()) {
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("colors".equals(paramzcjy.q())) {
        n(paramzcjy);
      } else {
        paramzcjy.a();
      }
    }
  }
  
  void b(zcjy paramzcjy)
    throws Exception
  {
    A(paramzcjy);
    if (paramzcjy.o()) {
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("numFmts".equals(paramzcjy.q())) {
        o(paramzcjy);
      } else if ("fonts".equals(paramzcjy.q())) {
        z(paramzcjy);
      } else if ("fills".equals(paramzcjy.q())) {
        w(paramzcjy);
      } else if ("borders".equals(paramzcjy.q())) {
        v(paramzcjy);
      } else if ("cellStyleXfs".equals(paramzcjy.q())) {
        u(paramzcjy);
      } else if ("cellXfs".equals(paramzcjy.q())) {
        r(paramzcjy);
      } else if ("cellStyles".equals(paramzcjy.q())) {
        p(paramzcjy);
      } else if ("dxfs".equals(paramzcjy.q())) {
        B(paramzcjy);
      } else if ("tableStyles".equals(paramzcjy.q())) {
        k(paramzcjy);
      } else if ("extLst".equals(paramzcjy.q())) {
        h(paramzcjy);
      } else {
        paramzcjy.a();
      }
    }
    c();
    a();
  }
  
  private void h(zcjy paramzcjy)
    throws Exception
  {
    zcjs localzcjs = paramzcjy.a(null, false);
    this.a.a.a.j.a(5, localzcjs.c());
    if ((localzcjs instanceof zcjn))
    {
      zcjn localzcjn = null;
      zcjy localzcjy = null;
      zcju localzcju1 = zauz.a((zcjn)localzcjs, "dxf", "http://schemas.microsoft.com/office/spreadsheetml/2009/9/main");
      for (int j = 0; j < localzcju1.a(); j++) {
        if ((localzcju1.a(j) instanceof zcjn))
        {
          localzcjn = (zcjn)localzcju1.a(j);
          localzcjy = zcjy.a(localzcjn.b() + "</dxf>", false);
          zpc localzpc = a(this.b, localzcjy);
          Style localStyle = new Style(this.b);
          zalu.a(localStyle, localzpc);
          this.b.Y().b(localStyle);
        }
      }
      zcju localzcju2 = zauz.a((zcjn)localzcjs, "slicerStyles", "http://schemas.microsoft.com/offiice/spreadsheetml/2009/9/main");
      if (localzcju2.a() > 0)
      {
        localzcjn = (zcjn)localzcju2.a(0);
        localzcjy = zcjy.a(localzcjn.b() + "</slicerStyles>", false);
        i(localzcjy);
      }
    }
  }
  
  private void i(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("slicerStyle".equals(paramzcjy.q())) {
        j(paramzcjy);
      } else {
        paramzcjy.a();
      }
    }
  }
  
  private void j(zcjy paramzcjy)
    throws Exception
  {
    String str = paramzcjy.a("name");
    zbpx localzbpx = new zbpx(str, this.b.K());
    this.b.K().a(localzbpx);
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("slicerStyleElements".equals(paramzcjy.q())) {
        a(paramzcjy, localzbpx.a());
      } else {
        paramzcjy.a();
      }
    }
  }
  
  private void a(zcjy paramzcjy, zbqa paramzbqa)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("slicerStyleElement".equals(paramzcjy.q())) {
        b(paramzcjy, paramzbqa);
      } else {
        paramzcjy.a();
      }
    }
  }
  
  private void b(zcjy paramzcjy, zbqa paramzbqa)
    throws Exception
  {
    String str = null;
    int j = -1;
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        if ("type".equals(paramzcjy.q())) {
          str = paramzcjy.t();
        } else if ("dxfId".equals(paramzcjy.q())) {
          j = zauj.F(paramzcjy.t());
        }
      }
      paramzcjy.l();
    }
    zbpz localzbpz = new zbpz(paramzbqa, zbqb.a(str));
    if (j != -1)
    {
      localzbpz.a = j;
      localzbpz.b = this.b.Y().get(j);
    }
    paramzbqa.a(localzbpz);
    paramzcjy.a();
  }
  
  private void k(zcjy paramzcjy)
    throws Exception
  {
    TableStyleCollection localTableStyleCollection = this.b.getTableStyles();
    localTableStyleCollection.a(paramzcjy.a("defaultTableStyle"));
    localTableStyleCollection.b(paramzcjy.a("defaultPivotStyle"));
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("tableStyle".equals(paramzcjy.q())) {
        l(paramzcjy);
      } else {
        paramzcjy.a();
      }
    }
  }
  
  private void l(zcjy paramzcjy)
    throws Exception
  {
    TableStyle localTableStyle = null;
    String str1 = null;
    String str2 = null;
    String str3 = null;
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        if ("name".equals(paramzcjy.q())) {
          str1 = paramzcjy.t();
        } else if ("pivot".equals(paramzcjy.q())) {
          str2 = paramzcjy.t();
        } else if ("table".equals(paramzcjy.q())) {
          str3 = paramzcjy.t();
        }
      }
      paramzcjy.l();
    }
    if (str1 != null)
    {
      int j = this.b.getTableStyles().c(str1);
      localTableStyle = this.b.getTableStyles().get(j);
      if (str2 != null) {
        localTableStyle.a("1".equals(str2));
      }
      if (str3 != null) {
        localTableStyle.b("1".equals(str3));
      }
    }
    if ((str1 == null) || (paramzcjy.o()))
    {
      paramzcjy.a();
      return;
    }
    localTableStyle.a(new TableStyleElementCollection(localTableStyle));
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("tableStyleElement".equals(paramzcjy.q())) {
        a(paramzcjy, localTableStyle);
      } else {
        paramzcjy.a();
      }
    }
  }
  
  private void a(zcjy paramzcjy, TableStyle paramTableStyle)
    throws Exception
  {
    String str1 = null;
    String str2 = null;
    String str3 = null;
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        if ("type".equals(paramzcjy.q())) {
          str1 = paramzcjy.t();
        } else if ("dxfId".equals(paramzcjy.q())) {
          str2 = paramzcjy.t();
        } else if ("size".equals(paramzcjy.q())) {
          str3 = paramzcjy.t();
        }
      }
      paramzcjy.l();
    }
    if (str1 != null) {
      try
      {
        int j = zauj.aG(str1);
        if (paramTableStyle.c()) {
          if (j == 7) {
            j = 28;
          } else if (j == 10) {
            j = 29;
          }
        }
        TableStyleElement localTableStyleElement = new TableStyleElement(paramTableStyle.getTableStyleElements(), j);
        if (str3 != null) {
          localTableStyleElement.setSize(zauj.F(str3));
        }
        if (str2 != null) {
          localTableStyleElement.a = zauj.F(str2);
        }
        paramTableStyle.getTableStyleElements().a(localTableStyleElement);
      }
      catch (Exception localException) {}
    }
    paramzcjy.a();
  }
  
  private void a()
  {
    WorksheetCollection localWorksheetCollection = this.a.a.getWorksheets();
    localWorksheetCollection.V();
    int j = ((localWorksheetCollection.U() * 8 + zlp.a) / 8 + 1) * 8;
    double d1 = (j - zlp.a) / localWorksheetCollection.U();
    for (int k = 0; k < localWorksheetCollection.getCount(); k++)
    {
      Cells localCells = localWorksheetCollection.get(k).getCells();
      localCells.getColumns().d = d1;
    }
  }
  
  private HashMap b()
  {
    zajm localzajm = this.b.C();
    int j = localzajm.b();
    HashMap localHashMap = new HashMap();
    for (int k = 0; k < j; k++)
    {
      Style localStyle = localzajm.a(k);
      if (localStyle.c() != null) {
        localHashMap.put(localStyle.c(), Integer.valueOf(k));
      }
    }
    return localHashMap;
  }
  
  private void c()
  {
    d();
    HashMap localHashMap1 = b();
    int j = this.h == null ? 0 : this.h.size();
    int k = this.f == null ? 0 : this.f.size();
    zrv localzrv1;
    for (int m = 0; m < j; m++)
    {
      localObject1 = (zoz)this.h.get(m);
      if (((zoz)localObject1).b < k)
      {
        localzrv1 = (zrv)this.f.get(((zoz)localObject1).b);
        localzrv1.s = ((zoz)localObject1);
        localzrv1.t = true;
      }
    }
    if (this.g == null) {
      return;
    }
    for (m = 0; m < this.g.size(); m++)
    {
      localObject1 = (zrv)this.g.get(m);
      if ((((zrv)localObject1).i >= 0) && (((zrv)localObject1).i < k))
      {
        localzrv1 = (zrv)this.f.get(((zrv)localObject1).i);
        ((zrv)localObject1).t = true;
      }
    }
    HashMap localHashMap2 = new HashMap(k);
    Object localObject1 = (zbzv)this.b.C();
    Object localObject2;
    Object localObject3;
    for (int n = 0; n < k; n++)
    {
      zrv localzrv2 = (zrv)this.f.get(n);
      if ((n == 0) || (localzrv2.t))
      {
        localObject2 = new Style(this.b);
        a(localzrv2, (Style)localObject2, false);
        ((Style)localObject2).a(false);
        ((Style)localObject2).a(-1);
        String str = null;
        if (n == 0)
        {
          str = "Normal";
        }
        else if (localzrv2.s != null)
        {
          str = localzrv2.s.a;
          if (str.equals("Default")) {
            str = "Normal";
          }
          if (localzrv2.s.d) {
            ((Style)localObject2).i(true);
          }
        }
        if (str != null)
        {
          ((Style)localObject2).a(str);
          if (str.equals("Normal"))
          {
            ((zbzv)localObject1).a(0, (Style)localObject2);
            localHashMap2.put(Integer.valueOf(n), Integer.valueOf(0));
            if (!((Style)localObject2).k())
            {
              ((Style)localObject2).getFont().a((Font)this.b.A().get(0), null);
              ((Style)localObject2).d(true);
            }
          }
          else
          {
            localObject3 = localHashMap1.get(str);
            if (localObject3 != null)
            {
              localHashMap2.put(Integer.valueOf(n), localObject3);
              ((zbzv)localObject1).a(((Integer)localObject3).intValue(), (Style)localObject2);
              this.b.s().a((Style)localObject2, false);
            }
            else
            {
              localHashMap2.put(Integer.valueOf(n), Integer.valueOf(((zbzv)localObject1).d((Style)localObject2)));
              this.b.s().a((Style)localObject2, true);
            }
          }
        }
        else
        {
          localHashMap2.put(Integer.valueOf(n), Integer.valueOf(this.b.a((Style)localObject2)));
        }
      }
    }
    if (j == 0)
    {
      Style localStyle = new Style(this.b);
      localStyle.a(true);
      localStyle.a(0);
      ((zbzv)localObject1).a(15, localStyle);
    }
    this.a.d = new HashMap(this.g.size());
    this.a.e = new HashMap(this.g.size());
    int i1 = -1;
    for (int i2 = 0; i2 < this.g.size(); i2++)
    {
      localObject2 = (zrv)this.g.get(i2);
      int i3 = 0;
      if (((zrv)localObject2).i > 0)
      {
        localObject3 = localHashMap2.get(Integer.valueOf(((zrv)localObject2).i));
        if (localObject3 != null) {
          i3 = ((Integer)localObject3).intValue();
        }
      }
      localObject3 = new Style(this.b);
      ((Style)localObject3).a(true);
      ((Style)localObject3).a(i3);
      a((zrv)localObject2, (Style)localObject3, true);
      if ((i2 == 0) && (k > 0) && (j > 0))
      {
        i1 = 0;
        ((zbzv)localObject1).a(15, (Style)localObject3);
        ((Style)localObject3).a(0);
        this.a.d.put(Integer.valueOf(0), Integer.valueOf(15));
      }
      else
      {
        int i4 = ((zbzv)localObject1).c((Style)localObject3);
        this.a.d.put(Integer.valueOf(i2), Integer.valueOf(i4));
        if ((i1 != -1) && (((zrv)localObject2).a((zrv)this.g.get(i1)))) {
          this.a.e.put(Integer.valueOf(i2), Boolean.valueOf(true));
        }
      }
    }
  }
  
  private Style a(zrv paramzrv, Style paramStyle, boolean paramBoolean)
  {
    Object localObject;
    if ((paramzrv.f != -1) && (paramzrv.f < this.c.size()))
    {
      localObject = (zpw)this.c.get(paramzrv.f);
      paramStyle.getFont().a((Font)this.b.A().get(((zpw)localObject).j()), null);
    }
    if ((paramzrv.e != -1) && ((paramzrv.l) || (paramBoolean)))
    {
      localObject = this.b.h(paramzrv.e);
      if (localObject != null) {
        paramStyle.b(paramzrv.e, ((zzw)localObject).a());
      } else {
        paramStyle.b(paramzrv.e, "");
      }
    }
    if (paramzrv.h > 0) {
      b(paramzrv, paramStyle);
    }
    if (paramzrv.g > 0) {
      a(paramzrv, paramStyle);
    }
    paramStyle.setVerticalAlignment(0);
    if ((paramzrv.c != null) && ((paramzrv.p) || (paramBoolean))) {
      paramzrv.c.a(paramStyle, false);
    }
    if (paramzrv.d != null) {
      paramzrv.d.a(paramStyle);
    }
    paramStyle.e((paramzrv.p) || (paramzrv.c != null));
    paramStyle.f(paramzrv.o);
    paramStyle.d(paramzrv.m);
    paramStyle.c(paramzrv.l);
    paramStyle.g(paramzrv.n);
    paramStyle.h((paramzrv.q) || (paramzrv.d != null));
    paramStyle.k(paramzrv.k);
    return paramStyle;
  }
  
  private void a(zrv paramzrv, Style paramStyle)
  {
    if (paramzrv.g == -1) {
      return;
    }
    if (this.d.size() <= paramzrv.g) {
      return;
    }
    zpv localzpv = (zpv)this.d.get(paramzrv.g);
    if (localzpv != null) {
      if (localzpv.c != null) {
        zoy.a(localzpv.c, paramStyle);
      } else if (localzpv.b != null) {
        localzpv.b.b(paramStyle);
      }
    }
  }
  
  private void b(zrv paramzrv, Style paramStyle)
  {
    if (paramzrv.h == -1) {
      return;
    }
    if ((this.e == null) || (this.e.size() == 0) || (this.e.size() <= paramzrv.h)) {
      return;
    }
    zow localzow = (zow)this.e.get(paramzrv.h);
    localzow.a(paramStyle);
  }
  
  private void d()
  {
    if (this.c == null) {
      return;
    }
    for (int j = 0; j < this.c.size(); j++)
    {
      zpw localzpw = (zpw)this.c.get(j);
      a(this.b, localzpw, j == 0);
      this.a.c().put(Integer.valueOf(j), Integer.valueOf(localzpw.j()));
    }
  }
  
  private static void a(WorksheetCollection paramWorksheetCollection, zpw paramzpw, boolean paramBoolean)
  {
    if (paramzpw.a)
    {
      paramzpw.d(0);
      return;
    }
    Font localFont = new Font(paramWorksheetCollection, null, false, true);
    paramzpw.a(localFont);
    if (paramBoolean)
    {
      localFont.d(0);
      paramzpw.d(0);
      paramWorksheetCollection.A().set(0, localFont);
    }
    else
    {
      if (paramWorksheetCollection.A().size() > 3) {
        localFont.d(paramWorksheetCollection.A().size() + 1);
      } else {
        localFont.d(paramWorksheetCollection.A().size());
      }
      paramzpw.d(paramWorksheetCollection.A().size());
      zf.a(paramWorksheetCollection.A(), localFont);
    }
  }
  
  private void m(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o()) {
      throw new CellsException(6, "Invalid indexedColors element");
    }
    paramzcjy.d();
    int j = 0;
    while (zauz.a(paramzcjy)) {
      if ("rgbColor".equals(paramzcjy.q()))
      {
        if ((j < 8) || (j >= 64))
        {
          j++;
          paramzcjy.a();
        }
        else
        {
          String str = paramzcjy.a("rgb", "");
          if (str != null)
          {
            int k = zp.a(str, 515, com.aspose.cells.b.a.c.za.b());
            this.a.a.changePalette(Color.fromArgb(k), j - 8);
          }
          j++;
        }
      }
      else {
        paramzcjy.a();
      }
    }
  }
  
  private void n(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if (("indexedColors".equals(paramzcjy.q())) && (!paramzcjy.o())) {
        m(paramzcjy);
      } else {
        paramzcjy.a();
      }
    }
  }
  
  private void o(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    int j = zauj.a(paramzcjy);
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("numFmt".equals(paramzcjy.q()))
      {
        zzw localzzw = c(paramzcjy);
        if (localzzw.e() != null) {
          zf.a(this.b.B(), localzzw);
        }
        if (localzzw.b() > (this.b.x() & 0xFFFF)) {
          this.b.d(localzzw.b());
        }
      }
      else
      {
        paramzcjy.a();
      }
    }
  }
  
  static zzw c(zcjy paramzcjy)
    throws Exception
  {
    zzw localzzw = new zzw();
    if (paramzcjy.n())
    {
      int j = 0;
      String str = null;
      while (paramzcjy.m()) {
        if ("numFmtId".equals(paramzcjy.q())) {
          j = zp.a(paramzcjy.t(), com.aspose.cells.b.a.c.za.b());
        } else if ("formatCode".equals(paramzcjy.q())) {
          str = zauj.b(paramzcjy.t());
        }
      }
      if (str != null) {
        localzzw.a(str, j);
      }
      paramzcjy.l();
    }
    paramzcjy.a();
    return localzzw;
  }
  
  private void p(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    int j = zauj.a(paramzcjy);
    this.h = new ArrayList(j);
    int k = 0;
    int m = 0;
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("cellStyle".equals(paramzcjy.q()))
      {
        zoz localzoz = q(paramzcjy);
        int n = 0;
        switch (i.a(localzoz.a))
        {
        case 0: 
        case 1: 
          n = 1;
          break;
        }
        if ((n != 0) || (localzoz.c == 0))
        {
          if (m != 0)
          {
            if (k == 0) {
              this.h.set(0, localzoz);
            }
          }
          else {
            this.h.add(0, localzoz);
          }
          k = localzoz.c == 0 ? 1 : 0;
          m = 1;
        }
        else
        {
          zf.a(this.h, localzoz);
        }
      }
      else
      {
        paramzcjy.a();
      }
    }
  }
  
  private zoz q(zcjy paramzcjy)
    throws Exception
  {
    zoz localzoz = new zoz();
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        if ("name".equals(paramzcjy.q())) {
          localzoz.a = paramzcjy.t();
        } else if ("xfId".equals(paramzcjy.q())) {
          localzoz.b = zauj.F(paramzcjy.t());
        } else if ("builtinId".equals(paramzcjy.q())) {
          localzoz.c = zauj.F(paramzcjy.t());
        } else if ("hidden".equals(paramzcjy.q())) {
          localzoz.d = zauj.b(paramzcjy.t(), false);
        }
      }
      paramzcjy.l();
    }
    paramzcjy.a();
    return localzoz;
  }
  
  private void r(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    int j = zauj.a(paramzcjy);
    this.g = new ArrayList(j);
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (i.a(paramzcjy.q()))
      {
      case 2: 
        zrv localzrv = c(paramzcjy, false);
        localzrv.b = false;
        zf.a(this.g, localzrv);
        break;
      case 3: 
        s(paramzcjy);
        break;
      default: 
        paramzcjy.a();
      }
    }
  }
  
  private void s(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("Choice".equals(paramzcjy.q())) {
        t(paramzcjy);
      } else {
        paramzcjy.a();
      }
    }
  }
  
  private void t(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy))
    {
      Object localObject;
      switch (i.a(paramzcjy.q()))
      {
      case 2: 
        localObject = c(paramzcjy, false);
        ((zrv)localObject).b = false;
        zf.a(this.g, localObject);
        break;
      case 4: 
        localObject = a(paramzcjy, this.a.a.getWorksheets(), "name");
        zf.a(this.c, localObject);
        break;
      default: 
        paramzcjy.a();
      }
    }
  }
  
  private void u(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    int j = zauj.a(paramzcjy);
    this.f = new ArrayList(j);
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("xf".equals(paramzcjy.q()))
      {
        zrv localzrv = c(paramzcjy, true);
        localzrv.b = false;
        zf.a(this.f, localzrv);
      }
      else
      {
        paramzcjy.a();
      }
    }
  }
  
  private zrv c(zcjy paramzcjy, boolean paramBoolean)
    throws Exception
  {
    zrv localzrv = new zrv();
    if (paramBoolean)
    {
      localzrv.l = true;
      localzrv.m = true;
      localzrv.n = true;
      localzrv.o = true;
      localzrv.p = true;
      localzrv.q = true;
    }
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (i.a(paramzcjy.q()))
        {
        case 5: 
          localzrv.e = zauj.F(paramzcjy.t());
          break;
        case 6: 
          localzrv.f = zauj.F(paramzcjy.t());
          break;
        case 7: 
          localzrv.g = zauj.F(paramzcjy.t());
          break;
        case 8: 
          localzrv.h = zauj.F(paramzcjy.t());
          break;
        case 9: 
          localzrv.i = zauj.F(paramzcjy.t());
          break;
        case 10: 
          localzrv.l = zauj.aB(paramzcjy.t());
          break;
        case 11: 
          localzrv.m = zauj.aB(paramzcjy.t());
          break;
        case 12: 
          localzrv.n = zauj.aB(paramzcjy.t());
          break;
        case 13: 
          localzrv.o = zauj.aB(paramzcjy.t());
          break;
        case 14: 
          localzrv.p = zauj.aB(paramzcjy.t());
          break;
        case 15: 
          localzrv.q = zauj.aB(paramzcjy.t());
          break;
        case 16: 
          localzrv.k = zauj.aB(paramzcjy.t());
        }
      }
      paramzcjy.l();
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return localzrv;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (i.a(paramzcjy.q()))
      {
      case 17: 
        localzrv.c = d(paramzcjy);
        break;
      case 18: 
        localzrv.d = e(paramzcjy);
        break;
      default: 
        paramzcjy.a();
      }
    }
    return localzrv;
  }
  
  static zot d(zcjy paramzcjy)
    throws Exception
  {
    if (!paramzcjy.n())
    {
      paramzcjy.a();
      return null;
    }
    zot localzot = new zot();
    while (paramzcjy.m()) {
      if ("horizontal".equals(paramzcjy.q()))
      {
        localzot.b = paramzcjy.t();
      }
      else if ("vertical".equals(paramzcjy.q()))
      {
        localzot.d = paramzcjy.t();
      }
      else if ("textRotation".equals(paramzcjy.q()))
      {
        localzot.a(zauj.F(paramzcjy.t()));
        if ((localzot.a() != 255) && ((localzot.a() < 0) || (localzot.a() > 180))) {
          throw new CellsException(6, "style textRotation must between 0 and 180");
        }
      }
      else if ("wrapText".equals(paramzcjy.q()))
      {
        localzot.a(zauj.aB(paramzcjy.t()));
      }
      else if ("indent".equals(paramzcjy.q()))
      {
        localzot.b(zauj.F(paramzcjy.t()));
      }
      else if ("relativeIndent".equals(paramzcjy.q()))
      {
        localzot.a = zauj.F(paramzcjy.t());
      }
      else if ("shrinkToFit".equals(paramzcjy.q()))
      {
        localzot.b(zauj.aB(paramzcjy.t()));
      }
      else if ("readingOrder".equals(paramzcjy.q()))
      {
        localzot.c(zauj.x(paramzcjy.t()));
      }
      else if ("justifyLastLine".equals(paramzcjy.q()))
      {
        localzot.c = zauj.aB(paramzcjy.t());
      }
    }
    paramzcjy.l();
    paramzcjy.a();
    return localzot;
  }
  
  static zrk e(zcjy paramzcjy)
    throws Exception
  {
    if (!paramzcjy.n())
    {
      paramzcjy.a();
      return null;
    }
    zrk localzrk = new zrk();
    while (paramzcjy.m()) {
      if ("hidden".equals(paramzcjy.q())) {
        localzrk.b = zauj.aB(paramzcjy.t());
      } else if ("locked".equals(paramzcjy.q())) {
        localzrk.a = zauj.aB(paramzcjy.t());
      }
    }
    paramzcjy.l();
    paramzcjy.a();
    return localzrk;
  }
  
  private void v(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    int j = zauj.a(paramzcjy);
    this.e = new ArrayList(j);
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("border".equals(paramzcjy.q()))
      {
        zow localzow = null;
        if (!paramzcjy.o())
        {
          localzow = a(paramzcjy, false);
        }
        else
        {
          localzow = new zow();
          paramzcjy.a();
        }
        zf.a(this.e, localzow);
      }
      else
      {
        paramzcjy.a();
      }
    }
  }
  
  static zow a(zcjy paramzcjy, boolean paramBoolean)
    throws Exception
  {
    zow localzow = new zow();
    String str1 = paramzcjy.a("diagonalDown");
    String str2 = paramzcjy.a("diagonalUp");
    if (str1 != null) {
      localzow.i = zauj.aB(str1);
    }
    if (str2 != null) {
      localzow.j = zauj.aB(str2);
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return null;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      a(paramzcjy, localzow, paramBoolean);
    }
    return localzow;
  }
  
  private static void a(zcjy paramzcjy, zow paramzow, boolean paramBoolean)
    throws Exception
  {
    zox localzox = new zox();
    String str = paramzcjy.a("style", "");
    int j = (str == null) && (paramzcjy.o()) ? 1 : 0;
    switch (i.a(paramzcjy.q()))
    {
    case 19: 
    case 20: 
      paramzow.c = localzox;
      break;
    case 21: 
    case 22: 
      paramzow.e = localzox;
      break;
    case 23: 
      paramzow.b = localzox;
      break;
    case 24: 
      paramzow.d = localzox;
      break;
    case 25: 
      paramzow.f = localzox;
      break;
    case 26: 
      if (j == 0) {
        paramzow.g = localzox;
      }
      break;
    case 27: 
      if (j == 0) {
        paramzow.h = localzox;
      }
      break;
    default: 
      paramzcjy.a();
      return;
    }
    if (str != null) {
      localzox.a = str;
    } else if (paramBoolean) {
      localzox.a = "none";
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("color".equals(paramzcjy.q()))
      {
        localzox.b = b(paramzcjy, true);
        if ((localzox.b.c() == 3) && (localzox.b.e() == 65)) {
          localzox.a = "none";
        }
      }
      else
      {
        paramzcjy.a();
      }
    }
  }
  
  private void w(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    int j = zauj.a(paramzcjy);
    this.d = new ArrayList(j);
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if (("fill".equals(paramzcjy.q())) && (!paramzcjy.o()))
      {
        zpv localzpv = f(paramzcjy);
        zf.a(this.d, localzpv);
      }
      else
      {
        paramzcjy.a();
      }
    }
  }
  
  static zpv f(zcjy paramzcjy)
    throws Exception
  {
    zpv localzpv = new zpv();
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("patternFill".equals(paramzcjy.q())) {
        localzpv.b = y(paramzcjy);
      } else if ("gradientFill".equals(paramzcjy.q())) {
        localzpv.c = x(paramzcjy);
      } else {
        paramzcjy.a();
      }
    }
    if ((localzpv.b == null) && (localzpv.c == null)) {
      return null;
    }
    return localzpv;
  }
  
  private static zoy x(zcjy paramzcjy)
    throws Exception
  {
    zoy localzoy = new zoy();
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        if ("bottom".equals(paramzcjy.q())) {
          localzoy.d = zauj.C(paramzcjy.t());
        } else if ("degree".equals(paramzcjy.q())) {
          localzoy.f = zauj.F(paramzcjy.t());
        } else if ("left".equals(paramzcjy.q())) {
          localzoy.a = zauj.C(paramzcjy.t());
        } else if ("right".equals(paramzcjy.q())) {
          localzoy.b = zauj.C(paramzcjy.t());
        } else if ("top".equals(paramzcjy.q())) {
          localzoy.c = zauj.C(paramzcjy.t());
        } else if ("type".equals(paramzcjy.q())) {
          localzoy.e = paramzcjy.t();
        }
      }
      paramzcjy.l();
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return localzoy;
    }
    ArrayList localArrayList1 = new ArrayList(4);
    ArrayList localArrayList2 = new ArrayList(4);
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if (("stop".equals(paramzcjy.q())) && (!paramzcjy.o()))
      {
        double d1 = 0.0D;
        String str = paramzcjy.a("position");
        if (str != null) {
          d1 = zauj.C(str);
        }
        if (paramzcjy.o()) {
          paramzcjy.a();
        }
        paramzcjy.d();
        while (zauz.a(paramzcjy)) {
          if ("color".equals(paramzcjy.q()))
          {
            zaml localzaml = g(paramzcjy);
            if (localzaml.b()) {
              localzaml.a(2, Color.getWhite().toArgb());
            }
            zf.a(localArrayList1, Double.valueOf(d1));
            zf.a(localArrayList2, localzaml);
          }
          else
          {
            paramzcjy.a();
          }
        }
      }
      else
      {
        paramzcjy.a();
      }
    }
    int j = localArrayList1.size();
    localzoy.g = new double[j];
    localzoy.h = new zaml[j];
    for (int k = 0; k < j; k++)
    {
      localzoy.g[k] = ((Double)localArrayList1.get(k)).doubleValue();
      localzoy.h[k] = ((zaml)localArrayList2.get(k));
    }
    return localzoy;
  }
  
  private static zrh y(zcjy paramzcjy)
    throws Exception
  {
    zrh localzrh = new zrh();
    String str = paramzcjy.a("patternType", "");
    if (str != null)
    {
      zauj.i(str);
      localzrh.a = str;
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return localzrh;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("fgColor".equals(paramzcjy.q())) {
        localzrh.b = g(paramzcjy);
      } else if ("bgColor".equals(paramzcjy.q())) {
        localzrh.c = g(paramzcjy);
      } else {
        paramzcjy.a();
      }
    }
    return localzrh;
  }
  
  private void z(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    int j = zauj.a(paramzcjy);
    this.c = new ArrayList(j);
    this.a.i = this.c;
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (i.a(paramzcjy.q()))
      {
      case 4: 
        zpw localzpw = a(paramzcjy, this.a.a.getWorksheets(), "name");
        zf.a(this.c, localzpw);
        break;
      case 3: 
        s(paramzcjy);
        break;
      default: 
        paramzcjy.a();
      }
    }
  }
  
  static zpw a(zcjy paramzcjy, WorksheetCollection paramWorksheetCollection, String paramString)
    throws Exception
  {
    if (paramzcjy.o())
    {
      localzpw = new zpw();
      localzpw.a = true;
      paramzcjy.a();
      return localzpw;
    }
    paramzcjy.d();
    zpw localzpw = new zpw();
    while (zauz.a(paramzcjy))
    {
      Object localObject;
      if ("sz".equals(paramzcjy.q()))
      {
        localObject = paramzcjy.a("val", "");
        if (localObject != null) {
          localzpw.a(zauj.C((String)localObject));
        }
        paramzcjy.a();
      }
      else if (zw.b(paramzcjy.q(), paramString))
      {
        localObject = paramzcjy.a("val", "");
        if (localObject != null) {
          localzpw.d(zauj.b((String)localObject));
        }
        paramzcjy.a();
      }
      else if ("family".equals(paramzcjy.q()))
      {
        localObject = paramzcjy.a("val", "");
        if (localObject != null) {
          localzpw.c(zauj.F((String)localObject));
        }
        paramzcjy.a();
      }
      else if ("b".equals(paramzcjy.q()))
      {
        localObject = paramzcjy.a("val", "");
        localzpw.b(zauj.b((String)localObject, true));
        paramzcjy.a();
      }
      else if ("i".equals(paramzcjy.q()))
      {
        localObject = paramzcjy.a("val", "");
        localzpw.a(zauj.b((String)localObject, true));
        paramzcjy.a();
      }
      else if ("u".equals(paramzcjy.q()))
      {
        localObject = paramzcjy.a("val", "");
        if (localObject != null) {
          localzpw.a(zauj.B((String)localObject));
        } else {
          localzpw.a(1);
        }
        paramzcjy.a();
      }
      else if ("color".equals(paramzcjy.q()))
      {
        localzpw.a(g(paramzcjy));
      }
      else if ("charset".equals(paramzcjy.q()))
      {
        localObject = paramzcjy.a("val", "");
        if (localObject != null) {
          localzpw.e(ze.d(localObject));
        }
        paramzcjy.a();
      }
      else if ("strike".equals(paramzcjy.q()))
      {
        localObject = paramzcjy.a("val", "");
        localzpw.c(zauj.b((String)localObject, true));
        paramzcjy.a();
      }
      else if ("vertAlign".equals(paramzcjy.q()))
      {
        localObject = paramzcjy.a("val", "");
        if ("subscript".equals(localObject)) {
          localzpw.e(true);
        } else if ("superscript".equals(localObject)) {
          localzpw.f(true);
        }
        paramzcjy.a();
      }
      else if ("scheme".equals(paramzcjy.q()))
      {
        localzpw.a(paramzcjy.a("val", ""));
        paramzcjy.a();
        localObject = paramWorksheetCollection.p();
        if (((Workbook)localObject).getSettings().getRegion() != 0)
        {
          boolean bool = true;
          if ("minor".equals(localzpw.a().toLowerCase())) {
            bool = false;
          }
          String str = ((Workbook)localObject).d().f.a(((Workbook)localObject).getSettings().getRegion(), bool);
          if (str != null) {
            localzpw.d(str);
          }
        }
      }
      else
      {
        paramzcjy.a();
      }
    }
    return localzpw;
  }
  
  static zaml b(zcjy paramzcjy, boolean paramBoolean)
    throws Exception
  {
    zaml localzaml = new zaml(false);
    String str1 = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (i.a(paramzcjy.q()))
        {
        case 28: 
          str1 = paramzcjy.t();
          break;
        case 29: 
          str2 = paramzcjy.t();
          break;
        case 30: 
          str3 = paramzcjy.t();
          break;
        case 31: 
          str4 = paramzcjy.t();
        }
      }
      paramzcjy.l();
    }
    paramzcjy.a();
    if (str1 != null)
    {
      int j = zauj.F(str1);
      if ((j >= 0) && (j < 64)) {
        localzaml.a(3, j);
      } else if (j == 64) {
        localzaml.b(true);
      } else if (j == 65)
      {
        if (paramBoolean) {
          localzaml.a(3, 65);
        } else {
          localzaml.b(true);
        }
      }
      else {
        localzaml.b(true);
      }
    }
    else if (str2 != null)
    {
      if (!"".equals(str2))
      {
        Color localColor = zauj.s(str2);
        localzaml.a(2, localColor.toArgb());
      }
    }
    else if (str3 != null)
    {
      int k = zauj.F(str3);
      localzaml.a(4, k);
    }
    else
    {
      localzaml.b(true);
    }
    if (str4 != null) {
      localzaml.a(zauj.C(str4));
    }
    return localzaml;
  }
  
  static zaml g(zcjy paramzcjy)
    throws Exception
  {
    return b(paramzcjy, false);
  }
  
  private void A(zcjy paramzcjy)
    throws Exception
  {
    paramzcjy.a(0);
    paramzcjy.k();
    if ((paramzcjy.s() != 1) || (!"styleSheet".equals(paramzcjy.q()))) {
      throw new CellsException(6, "styleSheet root element eror");
    }
    if (paramzcjy.n())
    {
      ArrayList localArrayList = new ArrayList();
      while (paramzcjy.m()) {
        if ((!"xmlns".equals(paramzcjy.p())) && (!"xmlns:r".equals(paramzcjy.p()))) {
          zf.a(localArrayList, new zou(paramzcjy.p(), paramzcjy.t()));
        }
      }
      paramzcjy.l();
      if (localArrayList.size() > 0) {
        this.a.a.a.j.a(4, localArrayList);
      }
    }
  }
  
  private void B(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    int j = zauj.a(paramzcjy);
    int k = 0;
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("dxf".equals(paramzcjy.q()))
      {
        k++;
        zpc localzpc = a(this.b, paramzcjy);
        Style localStyle = new Style(this.b);
        zalu.a(localStyle, localzpc);
        this.b.getDxfs().b(localStyle);
      }
      else
      {
        paramzcjy.a();
      }
    }
  }
  
  static zpc a(WorksheetCollection paramWorksheetCollection, zcjy paramzcjy)
    throws Exception
  {
    zpc localzpc = new zpc();
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return localzpc;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("font".equals(paramzcjy.q())) {
        localzpc.a = a(paramzcjy, paramWorksheetCollection, "name");
      } else if ("fill".equals(paramzcjy.q())) {
        localzpc.b = f(paramzcjy);
      } else if ("border".equals(paramzcjy.q())) {
        localzpc.c = a(paramzcjy, true);
      } else if ("numFmt".equals(paramzcjy.q())) {
        localzpc.d = c(paramzcjy);
      } else if ("alignment".equals(paramzcjy.q())) {
        localzpc.e = d(paramzcjy);
      } else if ("protection".equals(paramzcjy.q())) {
        localzpc.f = e(paramzcjy);
      } else {
        paramzcjy.a();
      }
    }
    return localzpc;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zalk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */