package com.aspose.cells;

import com.aspose.cells.a.c.zp;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.g.a.ze;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;
import java.util.HashMap;

class zatm
{
  private zcjy a;
  private zasg b;
  private WorksheetCollection c;
  private zava d;
  private String e;
  private String f;
  private String g;
  private String h;
  private String i;
  private boolean j;
  private ze k = new ze("(\\d|[a-z|A-Z])+");
  private boolean l = false;
  private boolean m = false;
  private static final za n = new za(new String[] { "text-style", "number-style", "currency-style", "date-style", "time-style", "percentage-style", "default-style", "style", "fill-image", "name", "truncate-on-overflow", "text", "text-properties", "number", "fraction", "scientific-number", "text-content", "hours", "minutes", "seconds", "month", "year", "day", "day-of-week", "am-pm", "currency-symbol", "map", "condition", "apply-style-name", "textual", "color", "min-integer-digits", "decimal-places", "min-exponent-digits", "min-numerator-digits", "min-denominator-digits", "grouping", "family", "parent-style-name", "master-page-name", "data-style-name", "table-column", "table-row", "table", "table-cell", "paragraph", "graphic", "href", "show", "actuate", "table-properties", "display", "writing-mode", "table-cell-properties", "paragraph-properties", "table-column-properties", "column-width", "table-row-properties", "row-height", "use-optimal-row-height", "break-before", "auto", "column", "page", "graphic-properties", "wrap-option", "padding-top", "padding-bottom", "padding-left", "padding-right", "textarea-vertical-align", "textarea-horizontal-align", "fill", "fill-color", "opacity", "fill-image-name", "repeat", "stroke", "stroke-width", "stroke-color", "stroke-opacity", "auto-grow-width", "auto-grow-height", "text-align", "margin-left", "start", "end", "center", "justify", "use-window-font-color", "font-name", "font-weight", "font-style", "text-line-through-style", "font-size", "text-underline-style", "text-underline-type", "text-position", "border", "border-left", "border-right", "border-top", "border-bottom", "diagonal-bl-tr", "diagonal-tl-br", "rotation-angle", "direction", "shrink-to-fit", "vertical-align", "repeat-content", "background-color", "cell-protect", "top", "automatic", "bottom", "baseline", "middle", "transparent", "#transparent", "protected formula-hidden", "formula-hidden protected", "none", "formula-hidden", "protected", "double", "dotted", "thin", "thick", "medium", "hair" });
  
  zatm(zasg paramzasg, boolean paramBoolean)
  {
    this.b = paramzasg;
    this.d = paramzasg.b.getWorksheets().o();
    this.j = paramBoolean;
    this.c = paramzasg.b.getWorksheets();
  }
  
  void a(zcjy paramzcjy)
    throws Exception
  {
    this.a = paramzcjy;
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (n.a(paramzcjy.q().toLowerCase()))
      {
      case 0: 
      case 1: 
      case 2: 
      case 3: 
      case 4: 
      case 5: 
        a();
        break;
      default: 
        paramzcjy.a();
      }
    }
  }
  
  void b(zcjy paramzcjy)
    throws Exception
  {
    this.a = paramzcjy;
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (n.a(paramzcjy.q().toLowerCase()))
      {
      case 6: 
        b();
        break;
      case 7: 
        c();
        break;
      case 8: 
        d();
        break;
      default: 
        paramzcjy.a();
      }
    }
  }
  
  void c(zcjy paramzcjy)
    throws Exception
  {
    this.a = paramzcjy;
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (n.a(paramzcjy.q().toLowerCase()))
      {
      case 6: 
        b();
        break;
      case 0: 
      case 1: 
      case 2: 
      case 3: 
      case 4: 
      case 5: 
        a();
        break;
      case 7: 
        c();
        break;
      case 8: 
        d();
        break;
      default: 
        paramzcjy.a();
      }
    }
  }
  
  private void a()
    throws Exception
  {
    String str1 = null;
    int i1 = 1;
    if (this.a.n())
    {
      while (this.a.m()) {
        switch (n.a(this.a.q().toLowerCase()))
        {
        case 9: 
          str1 = this.a.t();
          break;
        case 10: 
          i1 = "true".equals(this.a.t().toLowerCase()) ? 1 : 0;
        }
      }
      this.a.l();
    }
    if (this.a.o())
    {
      this.b.a(str1, "", null);
      this.a.a();
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    this.l = false;
    ArrayList localArrayList = new ArrayList();
    this.a.d();
    while (zauz.a(this.a)) {
      switch (n.a(this.a.q().toLowerCase()))
      {
      case 11: 
        this.a.a(1);
        String str2 = this.a.j();
        this.a.a(0);
        if (str2 != null) {
          if (this.k.d(str2))
          {
            localStringBuilder.append('"');
            localStringBuilder.append(str2);
            localStringBuilder.append('"');
          }
          else
          {
            localStringBuilder.append(str2);
          }
        }
        break;
      case 12: 
        a(localStringBuilder);
        break;
      case 13: 
      case 14: 
        b(localStringBuilder);
        break;
      case 15: 
        b(localStringBuilder);
        break;
      case 16: 
        localStringBuilder.append('@');
        this.a.a();
        break;
      case 17: 
        if (i1 == 0)
        {
          localStringBuilder.append("[h]");
          this.a.a();
        }
        else
        {
          a("h", localStringBuilder);
        }
        break;
      case 18: 
        a("m", localStringBuilder);
        break;
      case 19: 
        a("s", localStringBuilder);
        break;
      case 20: 
        a("m", localStringBuilder);
        break;
      case 21: 
        a("yy", localStringBuilder);
        break;
      case 22: 
        a("d", localStringBuilder);
        break;
      case 23: 
        a("ddd", "d", localStringBuilder);
        break;
      case 24: 
        localStringBuilder.append("AM/PM");
        this.a.a();
        break;
      case 25: 
        if (this.a.o())
        {
          localStringBuilder.append('$');
          this.a.a();
        }
        else
        {
          localStringBuilder.append('"');
          localStringBuilder.append(this.a.j());
          localStringBuilder.append('"');
        }
        break;
      case 26: 
        a(localArrayList);
        break;
      default: 
        this.a.a();
      }
    }
    if ((localStringBuilder.length() != 1) || (localStringBuilder.charAt(0) != '0') || (this.l)) {
      this.b.a(str1, zs.a(localStringBuilder), localArrayList);
    }
  }
  
  private void a(ArrayList paramArrayList)
    throws Exception
  {
    zatl localzatl = new zatl();
    if (this.a.n())
    {
      while (this.a.m()) {
        switch (n.a(this.a.q().toLowerCase()))
        {
        case 27: 
          localzatl.a = this.a.t();
          break;
        case 28: 
          localzatl.b = this.a.t();
        }
      }
      this.a.l();
    }
    if (localzatl.a != null) {
      zf.a(paramArrayList, localzatl);
    }
    this.a.a();
  }
  
  private void a(String paramString, StringBuilder paramStringBuilder)
    throws Exception
  {
    paramStringBuilder.append(paramString);
    if (this.a.n())
    {
      while (this.a.m()) {
        switch (n.a(this.a.q().toLowerCase()))
        {
        case 7: 
          if ("long".equals(this.a.t().toLowerCase())) {
            paramStringBuilder.append(paramString);
          }
          break;
        case 29: 
          paramStringBuilder.append(paramString);
          paramStringBuilder.append(paramString);
        }
      }
      this.a.l();
    }
    this.a.a();
  }
  
  private void a(String paramString1, String paramString2, StringBuilder paramStringBuilder)
    throws Exception
  {
    paramStringBuilder.append(paramString1);
    if (this.a.n())
    {
      while (this.a.m()) {
        if (("style".equals(this.a.q().toLowerCase())) && ("long".equals(this.a.t().toLowerCase()))) {
          paramStringBuilder.append(paramString2);
        }
      }
      this.a.l();
    }
    this.a.a();
  }
  
  private void a(StringBuilder paramStringBuilder)
    throws Exception
  {
    if (this.a.n())
    {
      while (this.a.m()) {
        switch (n.a(this.a.q().toLowerCase()))
        {
        case 30: 
          String str = zasp.g(this.a.t());
          if (str != null)
          {
            paramStringBuilder.append('[');
            paramStringBuilder.append(str);
            paramStringBuilder.append(']');
          }
          break;
        }
      }
      this.a.l();
    }
    this.a.a();
  }
  
  private void b(StringBuilder paramStringBuilder)
    throws Exception
  {
    int i1 = 0;
    int i2 = -1;
    int i3 = 0;
    int i4 = -1;
    int i5 = -1;
    int i6 = -1;
    if (this.a.n())
    {
      while (this.a.m()) {
        switch (n.a(this.a.q().toLowerCase()))
        {
        case 31: 
          i2 = (int)zasp.k(this.a.t());
          break;
        case 32: 
          this.l = true;
          i3 = (int)zasp.k(this.a.t());
          break;
        case 33: 
          i4 = (int)zasp.k(this.a.t());
          break;
        case 34: 
          i5 = (int)zasp.k(this.a.t());
          break;
        case 35: 
          i6 = (int)zasp.k(this.a.t());
          break;
        case 36: 
          i1 = "true".equals(this.a.t().toLowerCase()) ? 1 : 0;
        }
      }
      this.a.l();
    }
    this.a.a();
    int i7;
    if (i1 != 0)
    {
      paramStringBuilder.append("#,");
      if (i2 < 3) {
        for (i7 = 0; i7 < 3 - i2; i7++) {
          paramStringBuilder.append('#');
        }
      }
    }
    if (i2 == 0)
    {
      if (i1 == 0) {
        paramStringBuilder.append('#');
      }
    }
    else {
      for (i7 = 0; i7 < i2; i7++) {
        paramStringBuilder.append('0');
      }
    }
    if (i3 != 0)
    {
      if ((i1 == 0) && (i2 == -1)) {
        paramStringBuilder.append('0');
      }
      paramStringBuilder.append('.');
      for (i7 = 0; i7 < i3; i7++) {
        paramStringBuilder.append('0');
      }
    }
    if ((i5 != -1) && (i6 != -1))
    {
      for (i7 = 0; i7 < i5; i7++) {
        paramStringBuilder.append('?');
      }
      paramStringBuilder.append('/');
      for (i7 = 0; i7 < i6; i7++) {
        paramStringBuilder.append('?');
      }
    }
    if (i4 != -1)
    {
      paramStringBuilder.append("E+");
      for (i7 = 0; i7 < i4; i7++) {
        paramStringBuilder.append('0');
      }
    }
  }
  
  private void b()
    throws Exception
  {
    this.a.a();
  }
  
  private void c()
    throws Exception
  {
    this.e = (this.f = this.g = this.h = this.i = null);
    if (this.a.n())
    {
      while (this.a.m()) {
        switch (n.a(this.a.q().toLowerCase()))
        {
        case 9: 
          this.f = this.a.t();
          break;
        case 37: 
          this.e = this.a.t();
          break;
        case 38: 
          this.h = this.a.t();
          break;
        case 39: 
          this.g = this.a.t();
          break;
        case 40: 
          this.i = this.a.t();
        }
      }
      this.a.l();
    }
    switch (n.a(this.e))
    {
    case 41: 
      g();
      break;
    case 42: 
      h();
      break;
    case 43: 
      e();
      break;
    case 44: 
      f();
      break;
    case 11: 
      i();
      break;
    case 45: 
      j();
      break;
    case 46: 
      k();
      break;
    default: 
      this.a.a();
    }
  }
  
  private void d()
    throws Exception
  {
    zasd localzasd = new zasd();
    if (this.a.n())
    {
      while (this.a.m()) {
        switch (n.a(this.a.q().toLowerCase()))
        {
        case 9: 
          localzasd.a(this.a.t());
          break;
        case 47: 
          localzasd.c(this.a.t());
          break;
        case 48: 
          localzasd.a(zasn.b(this.a.t()));
          break;
        case 49: 
          localzasd.b(zasn.c(this.a.t()));
        }
      }
      this.a.l();
    }
    if ((localzasd.a() != null) && (this.b.j.get(localzasd.a()) == null)) {
      this.b.j.put(localzasd.a(), localzasd);
    }
    this.a.a();
  }
  
  private void e()
    throws Exception
  {
    zasm localzasm = new zasm();
    localzasm.a(this.f);
    localzasm.b(this.g);
    this.b.m.put(this.f, localzasm);
    if (this.a.o())
    {
      this.a.a();
      return;
    }
    this.a.d();
    while (zauz.a(this.a)) {
      switch (n.a(this.a.q().toLowerCase()))
      {
      case 50: 
        if (this.a.n()) {
          while (this.a.m()) {
            switch (n.a(this.a.q().toLowerCase()))
            {
            case 51: 
              localzasm.a("true".equals(this.a.t()));
              break;
            case 52: 
              localzasm.a(zasn.a(this.a.t()));
            }
          }
        }
        this.a.a();
        break;
      default: 
        this.a.a();
      }
    }
  }
  
  private void f()
    throws Exception
  {
    Style localStyle = null;
    int i1 = 0;
    this.m = false;
    if ("default".equals(this.f.toLowerCase()))
    {
      localStyle = this.b.b.getWorksheets().Q();
      this.b.p = this.f;
    }
    else
    {
      localStyle = new Style(this.b.b.getWorksheets());
      localStyle.copy(this.b.b.getWorksheets().Q());
      if (this.j)
      {
        localStyle.a(this.f);
        localStyle.a((byte)0);
        localStyle.a(false);
      }
    }
    Object localObject;
    if ((this.h != null) && (this.b.c.get(this.h) != null))
    {
      i1 = ((Integer)this.b.c.get(this.h)).intValue();
      if (i1 < this.c.C().b())
      {
        localObject = this.c.C().a(i1);
        localStyle.copy((Style)localObject);
        localStyle.a((byte)0);
        if (!this.j)
        {
          localStyle.a(true);
          localStyle.a(i1);
        }
      }
    }
    if ((this.i != null) && (!"".equals(this.i)))
    {
      localObject = this.b.a(this.i);
      localStyle.b((String)localObject);
    }
    if (!this.a.o())
    {
      this.a.d();
      while (zauz.a(this.a)) {
        switch (n.a(this.a.q().toLowerCase()))
        {
        case 53: 
          a(localStyle);
          break;
        case 12: 
          a(localStyle.getFont());
          break;
        case 54: 
          localObject = new zata();
          ((zata)localObject).a = 5;
          a((zata)localObject);
          localStyle.setHorizontalAlignment(((zata)localObject).a);
          if ((localStyle.getHorizontalAlignment() == 7) || (localStyle.getVerticalAlignment() == 8)) {
            localStyle.setIndentLevel(((zata)localObject).b);
          }
          break;
        default: 
          this.a.a();
        }
      }
    }
    this.a.a();
    int i2 = 0;
    if ("default".equals(this.f.toLowerCase()))
    {
      this.c.b(localStyle);
    }
    else
    {
      zbzv localzbzv = (zbzv)this.c.C();
      if (this.j)
      {
        if (localStyle.getName() != null)
        {
          i2 = localzbzv.d(localStyle);
        }
        else
        {
          localzbzv.c(localStyle);
          i2 = localzbzv.getCount() - 1;
        }
      }
      else {
        i2 = localzbzv.a(localStyle, i1);
      }
    }
    if (this.b.c.get(this.f) != null) {
      this.b.c.put(this.f, Integer.valueOf(i2));
    } else {
      this.b.c.put(this.f, Integer.valueOf(i2));
    }
    this.m = false;
  }
  
  private void g()
    throws Exception
  {
    zasa localzasa = new zasa();
    this.b.f.put(this.f, localzasa);
    if (this.a.o())
    {
      this.a.a();
      return;
    }
    this.a.d();
    while (zauz.a(this.a)) {
      switch (n.a(this.a.q().toLowerCase()))
      {
      case 55: 
        if (this.a.n()) {
          while (this.a.m()) {
            switch (n.a(this.a.q().toLowerCase()))
            {
            case 56: 
              localzasa.a(zasp.d(this.b.a, this.a.t()));
            }
          }
        }
        this.a.a();
        break;
      default: 
        this.a.a();
      }
    }
  }
  
  private void h()
    throws Exception
  {
    zasl localzasl = new zasl();
    this.b.d.put(this.f, localzasl);
    if (this.a.o())
    {
      this.a.a();
      return;
    }
    this.a.d();
    while (zauz.a(this.a)) {
      switch (n.a(this.a.q().toLowerCase()))
      {
      case 57: 
        if (this.a.n()) {
          while (this.a.m()) {
            switch (n.a(this.a.q().toLowerCase()))
            {
            case 58: 
              localzasl.a((int)(zasp.d(this.b.a, this.a.t()) * 20.0D));
              break;
            case 59: 
              localzasl.a("true".equals(this.a.t()));
              break;
            case 60: 
              switch (n.a(this.a.t()))
              {
              case 61: 
                localzasl.b(0);
                break;
              case 62: 
                localzasl.b(1);
                break;
              case 63: 
                localzasl.b(2);
              }
              break;
            }
          }
        }
        this.a.a();
        break;
      default: 
        this.a.a();
      }
    }
  }
  
  private void i()
    throws Exception
  {
    Font localFont = new Font(this.b.b.getWorksheets(), null, false);
    this.b.g.put(this.f, localFont);
    if (this.a.o())
    {
      this.a.a();
      return;
    }
    this.a.d();
    while (zauz.a(this.a)) {
      switch (n.a(this.a.q().toLowerCase()))
      {
      case 12: 
        a(localFont);
        break;
      default: 
        this.a.a();
      }
    }
  }
  
  private void j()
    throws Exception
  {
    zata localzata = new zata();
    zatb localzatb = new zatb();
    localzatb.a = localzata;
    this.b.h.put(this.f, localzatb);
    if (this.a.o())
    {
      this.a.a();
      return;
    }
    this.a.d();
    while (zauz.a(this.a)) {
      switch (n.a(this.a.q().toLowerCase()))
      {
      case 12: 
        localzatb.b = new Font(this.b.b.getWorksheets(), null, false);
        a(localzatb.b);
        break;
      case 54: 
        a(localzata);
        break;
      default: 
        this.a.a();
      }
    }
  }
  
  private void k()
    throws Exception
  {
    zath localzath = new zath();
    zata localzata = new zata();
    zati localzati = new zati();
    localzati.a = localzath;
    localzati.b = localzata;
    if (this.b.i.get(this.f) == null) {
      this.b.i.put(this.f, localzati);
    }
    if (this.a.o())
    {
      this.a.a();
      return;
    }
    this.a.d();
    while (zauz.a(this.a)) {
      switch (n.a(this.a.q().toLowerCase()))
      {
      case 64: 
        a(localzath);
        break;
      case 54: 
        a(localzata);
        break;
      default: 
        this.a.a();
      }
    }
  }
  
  private void a(zath paramzath)
    throws Exception
  {
    if (this.a.n())
    {
      while (this.a.m()) {
        switch (n.a(this.a.q().toLowerCase()))
        {
        case 65: 
          paramzath.a = this.a.t();
          break;
        case 66: 
          paramzath.b = this.a.t();
          break;
        case 67: 
          paramzath.c = this.a.t();
          break;
        case 68: 
          paramzath.d = this.a.t();
          break;
        case 69: 
          paramzath.e = this.a.t();
          break;
        case 70: 
          paramzath.f = this.a.t();
          break;
        case 71: 
          paramzath.g = this.a.t();
          break;
        case 72: 
          paramzath.h = this.a.t();
          break;
        case 73: 
          paramzath.i = zasp.h(this.a.t());
          break;
        case 74: 
          paramzath.o = (zp.a(this.a.t().substring(0, 0 + (this.a.t().length() - 1))) / 100.0D);
          break;
        case 75: 
          paramzath.j = this.a.t();
          break;
        case 76: 
          paramzath.k = this.a.t();
          break;
        case 77: 
          paramzath.l = this.a.t();
          break;
        case 78: 
          paramzath.m = this.a.t();
          break;
        case 79: 
          paramzath.n = zasp.h(this.a.t());
          break;
        case 80: 
          paramzath.p = this.a.t();
          break;
        case 81: 
          paramzath.q = this.a.t();
          break;
        case 82: 
          paramzath.r = this.a.t();
        }
      }
      this.a.l();
    }
    this.a.a();
  }
  
  private void a(zata paramzata)
    throws Exception
  {
    if (this.a.n())
    {
      while (this.a.m()) {
        switch (n.a(this.a.q().toLowerCase()))
        {
        case 83: 
          switch (n.a(this.a.t()))
          {
          case 85: 
            if (this.m) {
              paramzata.a = 4;
            } else {
              paramzata.a = 7;
            }
            break;
          case 86: 
            paramzata.a = 8;
            break;
          case 87: 
            paramzata.a = 1;
            break;
          case 88: 
            paramzata.a = 6;
          }
          break;
        case 84: 
          paramzata.b = ((int)(zasp.d(this.b.a, this.a.t()) * 2.54D / 25.415999999999997D));
        }
      }
      this.a.l();
    }
    this.a.a();
  }
  
  private void a(Font paramFont)
    throws Exception
  {
    if (this.a.n())
    {
      String str1 = null;
      String str2 = null;
      while (this.a.m())
      {
        switch (n.a(this.a.q().toLowerCase()))
        {
        case 89: 
          paramFont.setColor(Color.getEmpty());
          break;
        case 90: 
          if (this.b.q.get(this.a.t()) != null) {
            paramFont.a((String)this.b.q.get(this.a.t()), false, 0);
          } else {
            paramFont.a(this.a.t(), false, 0);
          }
          break;
        case 91: 
          paramFont.setBold("bold".equals(this.a.t().toLowerCase()));
          break;
        case 92: 
          paramFont.setItalic("italic".equals(this.a.t().toLowerCase()));
          break;
        case 93: 
          paramFont.setStrikeout("solid".equals(this.a.t().toLowerCase()));
          break;
        case 94: 
          paramFont.setDoubleSize(zasp.d(this.b.a, this.a.t()));
          break;
        case 30: 
          paramFont.setColor(zasp.h(this.a.t()));
          break;
        case 95: 
          str1 = this.a.t();
          break;
        case 96: 
          str2 = this.a.t();
          break;
        case 97: 
          String str3 = this.a.t();
          int i1 = str3.indexOf(' ');
          if (i1 != -1)
          {
            if (!str3.equals("0% 100%"))
            {
              String[] arrayOfString = zw.d(this.a.t(), ' ');
              if (arrayOfString.length >= 2)
              {
                int i3 = arrayOfString[0].charAt(0) == '-' ? 1 : 0;
                if (i3 != 0) {
                  paramFont.setSubscript(true);
                } else {
                  paramFont.setSuperscript(true);
                }
              }
            }
          }
          else if ((!zw.b(str3)) && (!"0%".equals(str3)))
          {
            int i2 = str3.charAt(0) == '-' ? 1 : 0;
            if (i2 != 0) {
              paramFont.setSubscript(true);
            } else {
              paramFont.setSuperscript(true);
            }
          }
          break;
        }
        if ((str1 != null) && ("solid".equals(str1)))
        {
          paramFont.setUnderline(1);
          if ("double".equals(str2)) {
            paramFont.setUnderline(2);
          }
        }
      }
      this.a.l();
    }
    this.a.a();
  }
  
  private void a(Style paramStyle)
    throws Exception
  {
    if (this.a.n())
    {
      double d1 = 0.0D;
      int i1 = 0;
      int i2 = 0;
      while (this.a.m()) {
        switch (n.a(this.a.q().toLowerCase()))
        {
        case 98: 
          if ("none".equals(this.a.t()))
          {
            if (paramStyle.f())
            {
              paramStyle.getBorders().getByBorderType(1).setLineStyle(0);
              paramStyle.getBorders().getByBorderType(4).setLineStyle(0);
              paramStyle.getBorders().getByBorderType(2).setLineStyle(0);
              paramStyle.getBorders().getByBorderType(8).setLineStyle(0);
            }
          }
          else
          {
            a(paramStyle.getBorders().getByBorderType(1), this.a.t());
            paramStyle.getBorders().getByBorderType(4).a(paramStyle.getBorders().getByBorderType(1));
            paramStyle.getBorders().getByBorderType(2).a(paramStyle.getBorders().getByBorderType(1));
            paramStyle.getBorders().getByBorderType(8).a(paramStyle.getBorders().getByBorderType(1));
          }
          break;
        case 99: 
          if (!"none".equals(this.a.t())) {
            a(paramStyle.getBorders().getByBorderType(1), this.a.t());
          } else if (paramStyle.f()) {
            paramStyle.getBorders().getByBorderType(1).setLineStyle(0);
          }
          break;
        case 100: 
          if (!"none".equals(this.a.t())) {
            a(paramStyle.getBorders().getByBorderType(2), this.a.t());
          } else if (paramStyle.f()) {
            paramStyle.getBorders().getByBorderType(2).setLineStyle(0);
          }
          break;
        case 101: 
          if (!"none".equals(this.a.t())) {
            a(paramStyle.getBorders().getByBorderType(4), this.a.t());
          } else if (paramStyle.f()) {
            paramStyle.getBorders().getByBorderType(4).setLineStyle(0);
          }
          break;
        case 102: 
          if (!"none".equals(this.a.t())) {
            a(paramStyle.getBorders().getByBorderType(8), this.a.t());
          } else if (paramStyle.f()) {
            paramStyle.getBorders().getByBorderType(8).setLineStyle(0);
          }
          break;
        case 103: 
          if (!"none".equals(this.a.t())) {
            a(paramStyle.getBorders().getByBorderType(32), this.a.t());
          } else if (paramStyle.f()) {
            paramStyle.getBorders().getByBorderType(32).setLineStyle(0);
          }
          break;
        case 104: 
          if (!"none".equals(this.a.t())) {
            a(paramStyle.getBorders().getByBorderType(16), this.a.t());
          } else if (paramStyle.f()) {
            paramStyle.getBorders().getByBorderType(16).setLineStyle(0);
          }
          break;
        case 105: 
          i1 = 1;
          d1 = zasp.k(this.a.t());
          if (d1 > 90.0D) {
            d1 -= 360.0D;
          }
          break;
        case 106: 
          if ("ttb".equals(this.a.t())) {
            i2 = 1;
          }
          break;
        case 107: 
          paramStyle.setShrinkToFit("true".equals(this.a.t()));
          break;
        case 65: 
          paramStyle.setTextWrapped("wrap".equals(this.a.t()));
          break;
        case 108: 
          switch (n.a(this.a.t()))
          {
          case 112: 
            paramStyle.setVerticalAlignment(9);
            break;
          case 113: 
          case 114: 
            paramStyle.setVerticalAlignment(0);
            break;
          case 87: 
          case 115: 
          case 116: 
            paramStyle.setVerticalAlignment(1);
          }
          break;
        case 109: 
          this.m = "true".equals(this.a.t());
          break;
        case 110: 
          switch (n.a(this.a.t()))
          {
          case 117: 
          case 118: 
            paramStyle.setPattern(0);
            break;
          default: 
            if (this.a.t().charAt(0) == '#')
            {
              paramStyle.setForegroundColor(zasp.h(this.a.t()));
              paramStyle.setPattern(1);
            }
            break;
          }
          break;
        case 111: 
          switch (n.a(this.a.t()))
          {
          case 119: 
          case 120: 
            paramStyle.setFormulaHidden(true);
            paramStyle.setLocked(true);
            break;
          case 121: 
            paramStyle.setLocked(false);
            paramStyle.setFormulaHidden(false);
            break;
          case 122: 
            paramStyle.setLocked(false);
            paramStyle.setFormulaHidden(true);
            break;
          case 123: 
            paramStyle.setLocked(true);
            paramStyle.setFormulaHidden(false);
          }
          break;
        }
      }
      if (i2 != 0) {
        paramStyle.setRotationAngle(255);
      } else if (i1 != 0) {
        paramStyle.setRotationAngle((int)d1);
      }
    }
    this.a.a();
  }
  
  private void a(Border paramBorder, String paramString)
  {
    int i1 = paramString.indexOf('#');
    if (i1 != -1)
    {
      str = paramString.substring(i1);
      paramBorder.setColor(zasp.h(str));
      paramString = paramString.substring(0, 0 + i1).trim();
    }
    i1 = paramString.indexOf(' ');
    String str = paramString;
    if (i1 != -1)
    {
      str = paramString.substring(i1 + 1).trim();
      paramString = paramString.substring(0, 0 + i1);
    }
    switch (n.a(str))
    {
    case 121: 
      paramBorder.setLineStyle(0);
      return;
    case 124: 
      paramBorder.setLineStyle(6);
      return;
    case 125: 
      paramBorder.setLineStyle(4);
      return;
    }
    paramBorder.setLineStyle(1);
    if ((paramString != null) && (!"".equals(paramString))) {
      switch (n.a(paramString))
      {
      case 126: 
        paramBorder.setLineStyle(1);
        break;
      case 127: 
        paramBorder.setLineStyle(5);
        break;
      case 128: 
        paramBorder.setLineStyle(2);
        break;
      case 129: 
        paramBorder.setLineStyle(7);
        break;
      default: 
        double d1 = zasp.d(this.b.a, paramString);
        if (d1 <= 0.05D) {
          paramBorder.setLineStyle(7);
        } else if (d1 <= 1.0D) {
          paramBorder.setLineStyle(1);
        } else if (d1 <= 2.5D) {
          paramBorder.setLineStyle(2);
        } else if (d1 <= 4.0D) {
          paramBorder.setLineStyle(5);
        }
        break;
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zatm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */