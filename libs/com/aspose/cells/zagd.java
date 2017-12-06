package com.aspose.cells;

import com.aspose.cells.b.a.a.zc;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.a.zg;
import com.aspose.cells.b.a.d.zd;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zk;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class zagd
{
  private static char[] b = { ' ', '\n', '\r' };
  private Workbook c;
  private WorksheetCollection d;
  private Worksheet e;
  private Cells f;
  private HashMap g;
  private HashMap h;
  private HashMap i;
  private Style j;
  private Style k;
  private Style l;
  private Style m;
  private int n = 0;
  private ArrayList o;
  private HashMap p;
  private int q = 0;
  private ArrayList r;
  private zagm s;
  private String t = "#A0A0A0";
  private String u = "15.0pt";
  private HTMLLoadOptions v = new HTMLLoadOptions();
  private int w;
  private int x;
  private int y;
  private int z;
  private int A;
  private int B;
  private int C;
  private int D;
  private boolean E;
  private boolean F;
  private boolean G;
  private boolean H;
  private boolean I;
  private boolean J;
  private boolean K;
  private boolean L;
  private boolean M;
  private boolean N;
  private boolean O;
  private boolean P;
  private boolean Q;
  boolean a;
  private boolean R;
  private Style S;
  private HashMap T;
  private ICustomParser U;
  private ICustomParser V;
  private String W;
  private zage X;
  private boolean Y;
  private String Z = "";
  private zafk aa = null;
  private com.aspose.cells.b.a.g.a.ze ab = null;
  private static final za ac = new za(new String[] { "mso-xlrowspan", "mso-outline-level", "height", "display", "font-weight", "color", "background-color", "font-size", "font-family", "border", "border-color", "mso-ignore", "background", "word-wrap", "mso-pattern", "white-space", "vertical-align", "text-align", "padding-right", "padding-left", "mso-char-indent-count", "width", "min-width", "mso-diagonal-down", "mso-diagonal-up", "border-top", "border-top-color", "border-left", "border-left-color", "border-right", "border-right-color", "border-bottom", "border-bottom-color", "border-bottom-style", "border-bottom-width", "text-decoration", "ltr", "rtl", "left", "right", "center", "justify", "middle", "top", "bottom", "font-style", "position", "z-index", "margin-left", "margin-top" });
  
  zage a()
  {
    return this.X;
  }
  
  boolean b()
  {
    return this.Y;
  }
  
  void a(boolean paramBoolean)
  {
    this.Y = paramBoolean;
  }
  
  String c()
  {
    return this.Z;
  }
  
  void a(String paramString)
  {
    this.Z = paramString;
  }
  
  int d()
  {
    return this.w;
  }
  
  void a(int paramInt)
  {
    this.w = paramInt;
  }
  
  int e()
  {
    return this.x;
  }
  
  void b(int paramInt)
  {
    this.x = paramInt;
  }
  
  zafk f()
  {
    return this.aa;
  }
  
  zagd(Workbook paramWorkbook, zage paramzage)
  {
    this.c = paramWorkbook;
    this.d = paramWorkbook.getWorksheets();
    this.aa = new zafk(this.c);
    this.w = -1;
    this.x = -1;
    this.y = 0;
    this.E = false;
    this.K = false;
    this.z = 0;
    this.A = 0;
    this.g = new HashMap();
    this.h = new HashMap();
    this.o = new ArrayList();
    this.p = new HashMap();
    this.r = new ArrayList();
    this.T = new HashMap();
    this.U = this.c.getSettings().f().i();
    this.V = this.c.getSettings().f().h();
    this.W = "";
    this.X = paramzage;
  }
  
  void g() {}
  
  void h() {}
  
  void i()
  {
    if (a().c > a().e) {
      a().e = a().c;
    }
    this.l = null;
  }
  
  void j()
  {
    if (this.o != null) {
      for (int i1 = 0; i1 < this.o.size(); i1++)
      {
        CellArea localCellArea = (CellArea)this.o.get(i1);
        if (localCellArea.EndRow < a().b())
        {
          this.o.remove(i1);
          i1--;
        }
      }
    }
  }
  
  void a(HashMap paramHashMap)
    throws Exception
  {
    j();
    if ((a().b.getSupportDivTag()) && (a().e > 0))
    {
      this.w += a().e;
      a().e = 0;
    }
    else if ((this.x >= 0) && (this.w >= 0) && (!com.aspose.cells.b.a.zw.b(this.W.trim())))
    {
      L();
      this.w += 1;
    }
    else if ((com.aspose.cells.b.a.zw.b(this.W.trim())) && ((!a().p()) || (this.w == -1)))
    {
      this.w += 1;
    }
    this.x = -1;
    if (paramHashMap == null) {
      return;
    }
    Object localObject = paramHashMap.get("class");
    String str = (String)localObject;
    if (str != null)
    {
      int i1 = 15;
      if (this.g.containsKey(str))
      {
        i1 = ((Integer)this.g.get(str)).intValue();
        this.l = ac().C().a(i1);
      }
    }
    if (this.l == null) {
      this.l = new Style(ac());
    }
    if (paramHashMap.size() > 0) {
      a(paramHashMap, false);
    }
  }
  
  void k()
    throws Exception
  {
    if ((this.w == -1) && (this.W != null) && (!"".equals(this.W.trim())))
    {
      if (aa() == null) {
        a(this.d.get(0));
      }
      this.w = 0;
      this.x = 0;
      L();
    }
  }
  
  void l()
  {
    if ((this.w == -1) && (this.W != null) && (!"".equals(this.W.trim()))) {
      this.w += 1;
    }
  }
  
  void b(HashMap paramHashMap)
    throws Exception
  {
    k();
    if (this.w >= 0) {
      if (a().c == a().d + 1)
      {
        if ((a().e == 0) || (a().c > 1)) {
          this.w += 1;
        }
      }
      else {
        a().c -= 1;
      }
    }
    if ((!a().b.getSupportDivTag()) || (this.x == -1) || ((!a().q()) && (!a().p()) && (!a().a()))) {
      this.x = 0;
    }
    if ((paramHashMap != null) && (paramHashMap.size() > 0)) {
      a(paramHashMap, true);
    }
  }
  
  void c(HashMap paramHashMap)
    throws Exception
  {
    k();
    this.w += 1;
    if ((!a().p()) || (this.x < 0)) {
      this.x = 0;
    }
    if ((paramHashMap != null) && (paramHashMap.size() > 0)) {
      a(paramHashMap, false);
    }
  }
  
  void d(HashMap paramHashMap)
    throws Exception
  {
    c(paramHashMap);
    if (this.X.r() > 0)
    {
      Cell localCell = o();
      if (localCell != null)
      {
        Style localStyle = localCell.getStyle();
        localStyle.setHorizontalAlignment(7);
        localStyle.setIndentLevel(this.X.r());
        localCell.a(localStyle);
      }
    }
  }
  
  private void a(HashMap paramHashMap, boolean paramBoolean)
  {
    String str1 = (String)paramHashMap.get("height");
    if (str1 == null) {
      str1 = this.u;
    }
    int i1 = (int)zbxp.a(str1);
    String str2 = (String)paramHashMap.get("style");
    if (str2 != null) {
      a(str2, i1, paramBoolean);
    }
    if ((i1 > 0) && (this.w != -1) && (!com.aspose.cells.b.a.zw.b(str1, this.u)) && ((str2 == null) || (str2.indexOf("mso-xlrowspan") == -1))) {
      this.f.setRowHeightPixel(this.w, i1);
    }
    Object localObject = paramHashMap.get("bgcolor");
    if ((null != localObject) && (this.l != null))
    {
      this.l.setForegroundColor(zafz.g(zs.a(localObject)));
      this.l.setPattern(1);
    }
  }
  
  private void a(String paramString, int paramInt, boolean paramBoolean)
  {
    if (aa() == null) {
      a(this.d.get(0));
    }
    int i1 = 0;
    int i2 = 0;
    zagi localzagi = new zagi();
    localzagi.b(paramString);
    ArrayList localArrayList = localzagi.e();
    Iterator localIterator = localArrayList.iterator();
    while (localIterator.hasNext())
    {
      zafw localzafw = (zafw)localIterator.next();
      switch (ac.a(localzafw.a().toLowerCase()))
      {
      case 0: 
        i1 = 1;
        int i3 = zauj.F(localzafw.b());
        for (int i4 = 0; i4 < i3; i4++) {
          this.f.setRowHeightPixel(this.w + i4, paramInt / i3);
        }
        this.w += i3 - 1;
        break;
      case 1: 
        break;
      case 2: 
        if (this.f == null) {
          this.c.getWorksheets().get(0).getCells().setRowHeightPixel(this.w, paramInt);
        }
        break;
      case 3: 
        if ((!paramBoolean) && (localzafw.b().toLowerCase().equals("none")))
        {
          if (this.w == -1) {
            this.w += 1;
          }
          i2 = 1;
          this.f.getRows().get(this.w).setHidden(true);
        }
        break;
      case 4: 
        if (this.l != null) {
          if ("bold".equals(localzafw.b().toLowerCase())) {
            this.l.getFont().setBold(true);
          } else if ("normal".equals(localzafw.b().toLowerCase())) {
            this.l.getFont().b(400);
          } else {
            this.l.getFont().b((int)zbxp.a(localzafw.b(), "pt", zbxp.a()));
          }
        }
        break;
      case 5: 
        if (this.l != null) {
          this.l.getFont().setColor(zafz.g(localzafw.b()));
        }
        break;
      case 6: 
        if (this.l != null)
        {
          this.l.setForegroundColor(zafz.g(localzafw.b()));
          this.l.setPattern(1);
        }
        break;
      }
    }
    if ((i1 == 0) && (this.f != null) && (i2 == 0) && (this.w != -1)) {
      this.f.setRowHeightPixel(this.w, paramInt);
    }
  }
  
  void e(HashMap paramHashMap)
  {
    if (this.f == null) {
      this.f = ac().get(0).getCells();
    }
    this.x += 1;
    int i1 = -1;
    Object localObject = paramHashMap.get("width");
    if (null != localObject) {
      i1 = (int)zbxp.a((String)localObject);
    }
    int i2 = -1;
    localObject = paramHashMap.get("mso-width");
    if (null != localObject) {
      i2 = (int)zbxp.a((String)localObject);
    }
    int i3 = 0;
    localObject = paramHashMap.get("span");
    if (null != localObject) {
      i3 = zauj.F((String)localObject);
    }
    if (i3 > 0) {
      this.x += i3 - 1;
    }
    if (i1 != -1)
    {
      int i4;
      if ((i1 == 0) || (i2 == 0))
      {
        if (i3 > 0)
        {
          for (i4 = 0; i4 < i3; i4++)
          {
            this.f.hideColumn(this.y);
            this.y += 1;
          }
        }
        else
        {
          this.f.hideColumn(this.y);
          this.y += 1;
        }
      }
      else if (i3 > 0)
      {
        for (i4 = 0; i4 < i3; i4++) {
          if (this.f != null)
          {
            this.f.setColumnWidthPixel(this.y, i1);
            this.y += 1;
          }
        }
      }
      else
      {
        this.f.getColumns().get(this.y).b(i1);
        this.y += 1;
      }
    }
  }
  
  private String f(String paramString)
  {
    if ((paramString.startsWith("'")) && (paramString.endsWith("'"))) {
      return com.aspose.cells.b.a.zw.a(paramString, "'", "");
    }
    return paramString;
  }
  
  private void a(Style paramStyle1, Style paramStyle2)
  {
    if (paramStyle2.isModified(11))
    {
      if (paramStyle2.isModified(13)) {
        paramStyle1.getFont().a(paramStyle2.getFont().getName(), true, paramStyle2.getFont().n());
      }
      if (paramStyle2.isModified(12)) {
        paramStyle1.getFont().setSize(paramStyle2.getFont().getSize());
      }
      if (paramStyle2.isModified(16))
      {
        paramStyle1.getFont().e(paramStyle2.getFont());
        paramStyle1.b(16);
      }
      if (paramStyle2.isModified(18)) {
        paramStyle1.getFont().setItalic(paramStyle2.getFont().isItalic());
      }
      if (paramStyle2.isModified(17)) {
        paramStyle1.getFont().setBold(paramStyle2.getFont().isBold());
      }
      if (paramStyle2.isModified(19)) {
        paramStyle1.getFont().setUnderline(paramStyle2.getFont().getUnderline());
      }
      if (paramStyle2.isModified(23)) {
        paramStyle1.getFont().a(paramStyle2.getFont().f());
      }
      if (paramStyle2.isModified(20)) {
        paramStyle1.getFont().setStrikeout(paramStyle2.getFont().isStrikeout());
      }
    }
    if (paramStyle2.isModified(1))
    {
      if ((paramStyle2.isModified(2)) && (paramStyle2.getBorders().getByBorderType(1).getLineStyle() != 0))
      {
        paramStyle1.getBorders().getByBorderType(1).a(paramStyle2.getBorders().getByBorderType(1));
        paramStyle1.b(2);
      }
      if ((paramStyle2.isModified(3)) && (paramStyle2.getBorders().getByBorderType(2).getLineStyle() != 0))
      {
        paramStyle1.getBorders().getByBorderType(2).a(paramStyle2.getBorders().getByBorderType(2));
        paramStyle1.b(3);
      }
      if ((paramStyle2.isModified(4)) && (paramStyle2.getBorders().getByBorderType(4).getLineStyle() != 0))
      {
        paramStyle1.getBorders().getByBorderType(4).a(paramStyle2.getBorders().getByBorderType(4));
        paramStyle1.b(4);
      }
      if ((paramStyle2.isModified(5)) && (paramStyle2.getBorders().getByBorderType(8).getLineStyle() != 0))
      {
        paramStyle1.getBorders().getByBorderType(8).a(paramStyle2.getBorders().getByBorderType(8));
        paramStyle1.b(5);
      }
      if ((paramStyle2.isModified(10)) && (paramStyle2.getBorders().getByBorderType(32).getLineStyle() != 0))
      {
        paramStyle1.getBorders().getByBorderType(32).a(paramStyle2.getBorders().getByBorderType(32));
        paramStyle1.b(10);
      }
      if ((paramStyle2.isModified(9)) && (paramStyle2.getBorders().getByBorderType(16).getLineStyle() != 0))
      {
        paramStyle1.getBorders().getByBorderType(16).a(paramStyle2.getBorders().getByBorderType(16));
        paramStyle1.b(9);
      }
    }
    if (paramStyle2.isModified(32))
    {
      if (paramStyle1.isGradient()) {
        paramStyle1.setGradient(false);
      }
      if (paramStyle2.isModified(33)) {
        paramStyle1.setPattern(paramStyle2.getPattern());
      }
      if (paramStyle2.isModified(34))
      {
        paramStyle1.b.f(paramStyle2.b);
        paramStyle1.b(34);
        if ((paramStyle1.getPattern() == 0) && (!paramStyle2.isModified(35))) {
          paramStyle1.setPattern(1);
        }
      }
      if (paramStyle2.isModified(35)) {
        if ((paramStyle1.getPattern() == 0) || (paramStyle1.getPattern() == 1))
        {
          paramStyle1.setGradient(false);
          paramStyle1.setPattern(1);
          paramStyle1.b.f(paramStyle2.a);
          paramStyle1.b(34);
        }
        else
        {
          paramStyle1.a.f(paramStyle2.a);
          paramStyle1.b(35);
        }
      }
    }
    if (paramStyle2.isGradient())
    {
      paramStyle1.setGradient(true);
      paramStyle1.h(paramStyle2.z());
      paramStyle1.g(paramStyle2.y());
      paramStyle1.setForegroundColor(paramStyle2.getForegroundColor());
      paramStyle1.b(34);
      paramStyle1.setBackgroundColor(paramStyle2.getBackgroundColor());
      paramStyle1.b(35);
    }
    if (paramStyle2.isModified(25)) {
      paramStyle1.setHorizontalAlignment(paramStyle2.getHorizontalAlignment());
    }
    if (paramStyle2.isModified(26)) {
      paramStyle1.setVerticalAlignment(paramStyle2.getVerticalAlignment());
    }
    if (paramStyle2.isModified(28)) {
      paramStyle1.setRotationAngle(paramStyle2.getRotationAngle());
    }
    if ((paramStyle2.isModified(27)) && (paramStyle2.getIndentLevel() != 0)) {
      paramStyle1.setIndentLevel(paramStyle2.getIndentLevel());
    }
    if (paramStyle2.isModified(24))
    {
      paramStyle1.b(paramStyle2.s());
      paramStyle1.f(paramStyle2.getNumber());
    }
    if (paramStyle2.isModified(29)) {
      paramStyle1.setTextWrapped(paramStyle2.isTextWrapped());
    }
    if (paramStyle2.isModified(30)) {
      paramStyle1.setShrinkToFit(paramStyle2.getShrinkToFit());
    }
    if (paramStyle2.isModified(31)) {
      paramStyle1.setTextDirection(paramStyle2.getTextDirection());
    }
  }
  
  void a(HashMap paramHashMap, String paramString)
    throws Exception
  {
    if ((this.x >= 0) && (this.w >= 0) && (!com.aspose.cells.b.a.zw.b(this.W.trim())))
    {
      L();
      this.x += 1;
    }
    else if ((com.aspose.cells.b.a.zw.b(this.W.trim())) && ((!a().p()) || (this.x == -1)))
    {
      this.x += 1;
    }
    this.E = true;
    if ((a().b.getSupportDivTag()) && (this.w > 0) && (a().c > 1) && (this.w > a().c))
    {
      this.w -= a().c;
      if (a().c > a().e) {
        a().e = a().c;
      }
      a().c = 0;
      a().d = 0;
    }
    if ((this.o.size() > 0) && (("td".equals(paramString)) || ("th".equals(paramString)))) {
      am();
    }
    Object localObject1 = paramHashMap.get("colspan");
    if (localObject1 != null) {
      this.A = zauj.F(f((String)localObject1));
    } else {
      this.A = 0;
    }
    localObject1 = paramHashMap.get("rowspan");
    if (localObject1 != null) {
      this.z = zauj.F(f((String)localObject1));
    } else {
      this.z = 0;
    }
    Object localObject2 = paramHashMap.get("class");
    if (localObject2 == null) {
      localObject2 = paramHashMap.get("CLASS");
    }
    int i1 = 15;
    if (localObject2 != null)
    {
      if (this.g.containsKey((String)localObject2)) {
        i1 = ((Integer)this.g.get((String)localObject2)).intValue();
      } else if (this.g.containsKey(paramString + "." + (String)localObject2)) {
        i1 = ((Integer)this.g.get(paramString + "." + (String)localObject2)).intValue();
      }
    }
    else if (this.g.containsKey(paramString)) {
      i1 = ((Integer)this.g.get(paramString)).intValue();
    } else if ((a().a()) && (this.g.containsKey("tr#" + paramString))) {
      i1 = ((Integer)this.g.get("tr#" + paramString)).intValue();
    } else if ((a().g != null) && (a().q()) && (this.g.containsKey((String)a().g + "#" + paramString))) {
      i1 = ((Integer)this.g.get((String)a().g + "#" + paramString)).intValue();
    }
    this.j = ac().C().a(i1);
    if (this.j == null) {
      this.j = new Style();
    }
    Cell localCell = o();
    if (localCell == null) {
      return;
    }
    if (i1 != 15) {
      localCell.b(i1);
    }
    if ((i1 == 15) && (this.k != null) && (this.g.get("td") == null)) {
      this.k.setTextWrapped(true);
    }
    if ((i1 == 15) && ("th".equals(paramString)))
    {
      localObject3 = localCell.getStyle();
      ((Style)localObject3).setHorizontalAlignment(1);
      ((Style)localObject3).getFont().setBold(true);
      localCell.a((Style)localObject3);
    }
    else if ((i1 != 15) && ("th".equals(paramString)))
    {
      localObject3 = localCell.getStyle();
      if (!((Style)localObject3).isModified(25)) {
        ((Style)localObject3).setHorizontalAlignment(1);
      }
      if (!((Style)localObject3).isModified(17)) {
        ((Style)localObject3).getFont().setBold(true);
      }
      localCell.a((Style)localObject3);
    }
    Object localObject3 = paramHashMap.get("width");
    String str;
    Object localObject5;
    int i4;
    if ((localObject3 == null) && (localObject2 != null) && (this.h.containsKey((String)localObject2)))
    {
      str = (String)this.h.get((String)localObject2);
      localObject5 = com.aspose.cells.b.a.zw.d(str, new char[] { ';' });
      if (!"".equals(localObject5[0])) {
        localObject3 = localObject5[0];
      }
      if (!"".equals(localObject5[1]))
      {
        i4 = (int)zbxp.a(localObject5[1]);
        this.f.setRowHeightPixel(this.w, i4);
      }
    }
    localObject1 = paramHashMap.get("style");
    int i5;
    Object localObject9;
    if (localObject1 != null)
    {
      str = zs.a(localObject1).toLowerCase();
      if (g(str))
      {
        localObject5 = a(str, localCell.getStyle(), localCell);
        if (((this.A != 0) || (this.z != 0)) && (this.D == 1))
        {
          i4 = this.z == 0 ? 1 : this.z;
          i5 = this.A == 0 ? 1 : this.A;
          localObject8 = new Range(this.w, this.x, i4, 1, this.f);
          localObject9 = new StyleFlag();
          ((StyleFlag)localObject9).setAll(true);
          ((Range)localObject8).applyStyle(this.j, (StyleFlag)localObject9);
          if (i5 > 1)
          {
            if (i5 > 2) {
              localObject8 = new Range(this.w, this.x + 1, i4, i5 - 2, this.f);
            } else {
              localObject8 = new Range(this.w, this.x + 1, i4, i5 - 1, this.f);
            }
            Style localStyle2 = new Style(ac());
            localStyle2.copy(this.j);
            localStyle2.getBorders().getByBorderType(1).setLineStyle(0);
            ((Range)localObject8).applyStyle(localStyle2, (StyleFlag)localObject9);
            if ((i5 > 2) && (localObject5 != null))
            {
              localObject8 = new Range(this.w, this.x + i5 - 1, i4, 1, this.f);
              localStyle2.getBorders().getByBorderType(2).setLineStyle(((Style)localObject5).getBorders().getByBorderType(2).getLineStyle());
              localStyle2.getBorders().getByBorderType(2).setColor(((Style)localObject5).getBorders().getByBorderType(2).getColor());
              ((Range)localObject8).applyStyle(localStyle2, (StyleFlag)localObject9);
            }
          }
        }
      }
    }
    else if ((localObject3 != null) && (zs.a(localObject3).indexOf("*") == -1) && (zs.a(localObject3).indexOf("%") == -1))
    {
      int i2 = (int)zbxp.a(zs.a(localObject3));
      int i3 = this.x;
      i4 = i2;
      if (this.A <= 1)
      {
        i3 = this.x + 1;
      }
      else
      {
        i3 = this.x + this.A;
        i4 = i2 / this.A;
      }
      for (i5 = this.x; i5 < i3; i5++)
      {
        localObject8 = this.T.get(Integer.valueOf(i5));
        if (localObject8 == null)
        {
          this.T.put(Integer.valueOf(i5), Integer.valueOf(i4));
          this.f.setColumnWidthPixel(i5, i4);
        }
        else if (((Integer)localObject8).intValue() < i4)
        {
          this.T.put(Integer.valueOf(i5), Integer.valueOf(i4));
          this.f.setColumnWidthPixel(i5, i4);
        }
      }
    }
    Object localObject4 = paramHashMap.get("align");
    Object localObject6 = paramHashMap.get("valign");
    Style localStyle1 = localCell.getStyle();
    if ((localObject4 != null) && ((!"left".equals((String)localObject4)) || ("th".equals(paramString)))) {
      localStyle1.setHorizontalAlignment(j(zs.a(localObject4)));
    }
    if ((localObject6 != null) && (!"top".equals((String)localObject6))) {
      localStyle1.setVerticalAlignment(j(zs.a(localObject6)));
    }
    Object localObject7 = paramHashMap.get("dir");
    if (null != localObject7) {
      localStyle1.setTextDirection(i(zs.a(localObject7)));
    }
    Object localObject8 = paramHashMap.get("bgcolor");
    if (null != localObject8)
    {
      localStyle1.setForegroundColor(zafz.g(zs.a(localObject8)));
      localStyle1.setPattern(1);
    }
    localCell.a(localStyle1);
    a(localObject2, localCell);
    if (this.v.getLoadFormulas())
    {
      localObject1 = paramHashMap.get("x:fmla");
      a(localObject1, localCell, paramHashMap);
    }
    localObject1 = paramHashMap.get("x:num");
    b(localObject1, localCell);
    localObject1 = paramHashMap.get("x:bool");
    localObject1 = paramHashMap.get("x:str");
    localObject1 = paramHashMap.get("x:err");
    if (this.k != null)
    {
      localObject9 = new Style();
      ((Style)localObject9).copy(this.k);
      a((Style)localObject9, localCell.getStyle());
      localCell.a((Style)localObject9);
    }
    if (this.l != null)
    {
      localObject9 = new Style();
      ((Style)localObject9).copy(this.l);
      a((Style)localObject9, localCell.getStyle());
      localCell.a((Style)localObject9);
    }
    a(localObject2, localCell.getStyle());
    this.m = localCell.getStyle();
    if ((a().d() != null) && (a().d().size() > 0)) {
      a().a(this.x);
    }
  }
  
  private boolean g(String paramString)
  {
    String[] arrayOfString1 = com.aspose.cells.b.a.zw.d(paramString, new char[] { ';' });
    if (arrayOfString1.length > 2) {
      return true;
    }
    String[] arrayOfString2 = null;
    for (int i1 = 0; i1 < arrayOfString1.length; i1++) {
      if (arrayOfString1[i1].trim().length() > 2)
      {
        arrayOfString2 = com.aspose.cells.b.a.zw.d(arrayOfString1[i1], new char[] { ':' });
        if ((!arrayOfString2[0].toLowerCase().equals("width")) || (!arrayOfString2[0].toLowerCase().equals("height"))) {
          return true;
        }
      }
    }
    return false;
  }
  
  void m()
  {
    this.k = null;
  }
  
  void f(HashMap paramHashMap)
  {
    String str1 = (String)paramHashMap.get("style");
    if ((this.g == null) && (str1 == null)) {
      return;
    }
    Object localObject1 = paramHashMap.get("class");
    String str2 = (String)localObject1;
    if (str2 != null)
    {
      int i1 = 15;
      if (this.g.containsKey(str2))
      {
        i1 = ((Integer)this.g.get(str2)).intValue();
        this.k = ac().C().a(i1);
      }
      if (this.g.containsKey("table." + str2))
      {
        i1 = ((Integer)this.g.get("table." + str2)).intValue();
        this.k = ac().C().a(i1);
      }
    }
    Object localObject2;
    if (str1 != null)
    {
      if (this.k == null)
      {
        this.k = new Style();
        this.k.copy(ac().C().a(15));
      }
      localObject2 = new zagi();
      ((zagi)localObject2).b(str1);
      ArrayList localArrayList = ((zagi)localObject2).e();
      Iterator localIterator = localArrayList.iterator();
      while (localIterator.hasNext())
      {
        zafw localzafw = (zafw)localIterator.next();
        switch (ac.a(localzafw.a().toLowerCase()))
        {
        case 7: 
          zagc.a(this.k.getFont(), localzafw.b().trim().toLowerCase());
          break;
        case 8: 
          zagc.a(localzafw.b(), this.k.getFont());
          break;
        case 4: 
          if ("bold".equals(localzafw.b().toLowerCase())) {
            this.k.getFont().setBold(true);
          } else if ("normal".equals(localzafw.b().toLowerCase())) {
            this.k.getFont().b(400);
          } else {
            this.k.getFont().b((int)zbxp.a(localzafw.b(), "pt", zbxp.a()));
          }
          break;
        case 5: 
          this.k.getFont().setColor(zafz.g(localzafw.b()));
          break;
        case 9: 
          h(localzafw.b());
          aj();
          break;
        case 10: 
          Color localColor = zafz.g(this.t);
          this.k.getBorders().getByBorderType(8).setColor(localColor);
          this.k.getBorders().getByBorderType(4).setColor(localColor);
          this.k.getBorders().getByBorderType(1).setColor(localColor);
          this.k.getBorders().getByBorderType(2).setColor(localColor);
        }
      }
    }
    if (paramHashMap.get("border") != null)
    {
      if (this.k == null)
      {
        this.k = new Style();
        this.k.copy(ac().C().a(15));
      }
      localObject2 = (String)paramHashMap.get("border");
      h((String)localObject2);
    }
  }
  
  private void aj()
  {
    Border localBorder;
    if (this.k.getBorders().getByBorderType(1).getLineStyle() != 0)
    {
      localBorder = new Border(this.k.getBorders());
      localBorder.a(this.k.getBorders().getByBorderType(1));
      a().d().put(Integer.valueOf(1), localBorder);
    }
    if (this.k.getBorders().getByBorderType(2).getLineStyle() != 0)
    {
      localBorder = new Border(this.k.getBorders());
      localBorder.a(this.k.getBorders().getByBorderType(2));
      a().d().put(Integer.valueOf(2), localBorder);
    }
    if (this.k.getBorders().getByBorderType(4).getLineStyle() != 0)
    {
      localBorder = new Border(this.k.getBorders());
      localBorder.a(this.k.getBorders().getByBorderType(4));
      a().d().put(Integer.valueOf(4), localBorder);
    }
    if (this.k.getBorders().getByBorderType(8).getLineStyle() != 0)
    {
      localBorder = new Border(this.k.getBorders());
      localBorder.a(this.k.getBorders().getByBorderType(8));
      a().d().put(Integer.valueOf(8), localBorder);
    }
  }
  
  private void h(String paramString)
  {
    String[] arrayOfString = com.aspose.cells.b.a.zw.d(paramString, ' ');
    int i1;
    String str;
    Color localColor;
    if ((arrayOfString.length > 3) && (paramString.toLowerCase().indexOf("rgb") != -1))
    {
      i1 = zafy.a(arrayOfString[0] + " " + arrayOfString[1]);
      this.k.getBorders().getByBorderType(8).setLineStyle(i1);
      this.k.getBorders().getByBorderType(4).setLineStyle(i1);
      this.k.getBorders().getByBorderType(1).setLineStyle(i1);
      this.k.getBorders().getByBorderType(2).setLineStyle(i1);
      str = "";
      for (int i2 = 2; i2 < arrayOfString.length; i2++) {
        str = str + arrayOfString[i2];
      }
      if ("windowtext".equals(str))
      {
        localColor = zafz.g(this.t);
        this.k.getBorders().getByBorderType(8).setColor(localColor);
        this.k.getBorders().getByBorderType(4).setColor(localColor);
        this.k.getBorders().getByBorderType(1).setColor(localColor);
        this.k.getBorders().getByBorderType(2).setColor(localColor);
      }
      else
      {
        localColor = zafz.g(str);
        this.k.getBorders().getByBorderType(8).setColor(localColor);
        this.k.getBorders().getByBorderType(4).setColor(localColor);
        this.k.getBorders().getByBorderType(1).setColor(localColor);
        this.k.getBorders().getByBorderType(2).setColor(localColor);
      }
    }
    else if (arrayOfString.length == 3)
    {
      i1 = zafy.a(arrayOfString[0] + " " + arrayOfString[1]);
      this.k.getBorders().getByBorderType(8).setLineStyle(i1);
      this.k.getBorders().getByBorderType(4).setLineStyle(i1);
      this.k.getBorders().getByBorderType(1).setLineStyle(i1);
      this.k.getBorders().getByBorderType(2).setLineStyle(i1);
      str = arrayOfString[2];
      if ("windowtext".equals(str))
      {
        localColor = zafz.g(this.t);
        this.k.getBorders().getByBorderType(8).setColor(localColor);
        this.k.getBorders().getByBorderType(4).setColor(localColor);
        this.k.getBorders().getByBorderType(1).setColor(localColor);
        this.k.getBorders().getByBorderType(2).setColor(localColor);
      }
      else
      {
        localColor = zafz.g(str);
        this.k.getBorders().getByBorderType(8).setColor(localColor);
        this.k.getBorders().getByBorderType(4).setColor(localColor);
        this.k.getBorders().getByBorderType(1).setColor(localColor);
        this.k.getBorders().getByBorderType(2).setColor(localColor);
      }
    }
    else if (arrayOfString.length == 2)
    {
      i1 = zafy.a(paramString);
      this.k.getBorders().getByBorderType(8).setLineStyle(i1);
      this.k.getBorders().getByBorderType(4).setLineStyle(i1);
      this.k.getBorders().getByBorderType(1).setLineStyle(i1);
      this.k.getBorders().getByBorderType(2).setLineStyle(i1);
    }
    else if ((arrayOfString.length == 1) && (zarb.c(paramString)) && (!"0".equals(paramString)))
    {
      double d1 = com.aspose.cells.a.c.zp.a(paramString);
      if (d1 < 1.0D) {
        i1 = 0;
      } else {
        i1 = zafy.a(paramString + "px solid");
      }
      this.k.getBorders().getByBorderType(8).setLineStyle(i1);
      this.k.getBorders().getByBorderType(4).setLineStyle(i1);
      this.k.getBorders().getByBorderType(1).setLineStyle(i1);
      this.k.getBorders().getByBorderType(2).setLineStyle(i1);
    }
    else
    {
      this.k.getBorders().getByBorderType(8).setLineStyle(0);
      this.k.getBorders().getByBorderType(4).setLineStyle(0);
      this.k.getBorders().getByBorderType(1).setLineStyle(0);
      this.k.getBorders().getByBorderType(2).setLineStyle(0);
    }
  }
  
  private Style a(String paramString, Style paramStyle, Cell paramCell)
    throws Exception
  {
    Style localStyle = new Style(this.d);
    if (paramStyle != null) {
      localStyle.copy(paramStyle);
    }
    zagi localzagi = new zagi();
    localzagi.b(paramString);
    ArrayList localArrayList = localzagi.e();
    String str1 = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    Object localObject1 = localArrayList.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      zafw localzafw = (zafw)((Iterator)localObject1).next();
      Object localObject2;
      Object localObject3;
      Object localObject5;
      Object localObject7;
      Object localObject8;
      int i17;
      Object localObject9;
      Object localObject10;
      int i20;
      Object localObject11;
      Object localObject12;
      int i28;
      switch (ac.a(localzafw.a().toLowerCase()))
      {
      case 11: 
        if (localzafw.b().equals("colspan")) {
          this.D = 1;
        } else if (localzafw.b().equals("colspan-rowspan")) {
          this.D = 2;
        } else {
          this.D = 0;
        }
        break;
      case 12: 
        if (!"auto".equals(localzafw.b())) {
          str1 = localzafw.b();
        }
        break;
      case 13: 
        if ("break-word".equals(localzafw.b().toLowerCase())) {
          localStyle.setTextWrapped(true);
        }
        break;
      case 14: 
        str3 = localzafw.b();
        break;
      case 15: 
        break;
      case 16: 
        localStyle.setVerticalAlignment(zagn.f(localzafw.b().toLowerCase()));
        break;
      case 17: 
        localStyle.setHorizontalAlignment(zagn.e(localzafw.b().toLowerCase()));
        if ((localStyle.getHorizontalAlignment() != 7) && (localStyle.getHorizontalAlignment() != 8) && (localStyle.getIndentLevel() != 0)) {
          localStyle.setIndentLevel(0);
        }
        break;
      case 18: 
        String str6 = localzafw.b().toLowerCase();
        int i1 = this.aa.a(localStyle, "0");
        int i2 = 0;
        if ((str6.endsWith("pt")) || (str6.endsWith("px")) || (str6.endsWith("in")))
        {
          i2 = (int)zbxp.a(str6);
        }
        else if (str6.endsWith("em"))
        {
          str6 = str6.substring(0, 0 + (str6.length() - 2));
          i2 = (int)(i1 * com.aspose.cells.a.c.zp.a(str6));
        }
        localStyle.setIndentLevel(i2 / i1 + (i2 % i1 == 0 ? 0 : 1));
        localStyle.setHorizontalAlignment(8);
        break;
      case 19: 
        String str7 = localzafw.b().toLowerCase();
        int i3 = this.aa.a(localStyle, "0");
        int i4 = 0;
        if ((str7.endsWith("pt")) || (str7.endsWith("px")) || (str7.endsWith("in")))
        {
          i4 = (int)zbxp.a(str7);
        }
        else if (str7.endsWith("em"))
        {
          str7 = str7.substring(0, 0 + (str7.length() - 2));
          i4 = (int)(i3 * com.aspose.cells.a.c.zp.a(str7));
        }
        localStyle.setIndentLevel(i4 / i3 + (i4 % i3 == 0 ? 0 : 1));
        localStyle.setHorizontalAlignment(7);
        break;
      case 20: 
        localStyle.setIndentLevel(zauj.F(localzafw.b()));
        break;
      case 7: 
        zagc.a(localStyle.getFont(), localzafw.b().trim().toLowerCase());
        break;
      case 8: 
        zagc.a(localzafw.b(), localStyle.getFont());
        break;
      case 4: 
        if ("bold".equals(localzafw.b().toLowerCase())) {
          localStyle.getFont().setBold(true);
        } else if ("plain".equals(localzafw.b().toLowerCase())) {
          localStyle.getFont().setBold(false);
        } else if ("normal".equals(localzafw.b().toLowerCase())) {
          localStyle.getFont().b(400);
        } else {
          try
          {
            localStyle.getFont().b((int)zbxp.a(localzafw.b(), "pt", zbxp.a()));
          }
          catch (Exception localException)
          {
            localStyle.getFont().setBold(false);
          }
        }
        break;
      case 5: 
        localStyle.getFont().setColor(zafz.g(localzafw.b()));
        break;
      case 6: 
        if (!"auto".equals(localzafw.b())) {
          str2 = localzafw.b();
        }
        break;
      case 21: 
      case 22: 
        if (localzafw.b().indexOf("%") == -1)
        {
          int i5 = (int)zbxp.a(localzafw.b());
          localObject2 = this.T.get(Integer.valueOf(this.x));
          if (this.A <= 1) {
            if (localObject2 == null) {
              this.T.put(Integer.valueOf(this.x), Integer.valueOf(i5));
            } else if (((Integer)localObject2).intValue() < i5) {
              this.T.put(Integer.valueOf(this.x), Integer.valueOf(i5));
            }
          }
        }
        break;
      case 23: 
        String[] arrayOfString1 = com.aspose.cells.b.a.zw.d(localzafw.b(), ' ');
        localObject2 = localStyle.getBorders().getByBorderType(16);
        Object localObject4;
        if ((arrayOfString1.length > 3) && (localzafw.b().toLowerCase().indexOf("rgb") != -1))
        {
          int i6 = zafy.a(arrayOfString1[0] + " " + arrayOfString1[1]);
          ((Border)localObject2).setLineStyle(i6);
          localObject3 = "";
          for (int i8 = 2; i8 < arrayOfString1.length; i8++) {
            localObject3 = (String)localObject3 + arrayOfString1[i8];
          }
          if ("windowtext".equals(localObject3))
          {
            localObject4 = zafz.g(this.t);
            ((Border)localObject2).setColor((Color)localObject4);
          }
          else
          {
            localObject4 = zafz.g((String)localObject3);
            ((Border)localObject2).setColor((Color)localObject4);
          }
        }
        else if (arrayOfString1.length == 3)
        {
          String str8 = arrayOfString1[0];
          localObject3 = arrayOfString1[1];
          localObject4 = arrayOfString1[2];
          ((Border)localObject2).setColor(zafz.g((String)localObject4));
          int i11 = zafy.a(str8 + " " + (String)localObject3);
          ((Border)localObject2).setLineStyle(i11);
        }
        else if (arrayOfString1.length == 2)
        {
          int i7 = zafy.a(localzafw.b());
          ((Border)localObject2).setLineStyle(i7);
        }
        else
        {
          ((Border)localObject2).setLineStyle(0);
        }
        break;
      case 24: 
        String[] arrayOfString2 = com.aspose.cells.b.a.zw.d(localzafw.b(), ' ');
        localObject3 = localStyle.getBorders().getByBorderType(32);
        Object localObject6;
        if ((arrayOfString2.length > 3) && (localzafw.b().toLowerCase().indexOf("rgb") != -1))
        {
          int i9 = zafy.a(arrayOfString2[0] + " " + arrayOfString2[1]);
          ((Border)localObject3).setLineStyle(i9);
          localObject5 = "";
          for (int i12 = 2; i12 < arrayOfString2.length; i12++) {
            localObject5 = (String)localObject5 + arrayOfString2[i12];
          }
          if ("windowtext".equals(localObject5))
          {
            localObject6 = zafz.g(this.t);
            ((Border)localObject3).setColor((Color)localObject6);
          }
          else
          {
            localObject6 = zafz.g((String)localObject5);
            ((Border)localObject3).setColor((Color)localObject6);
          }
        }
        else if (arrayOfString2.length == 3)
        {
          String str9 = arrayOfString2[0];
          localObject5 = arrayOfString2[1];
          localObject6 = arrayOfString2[2];
          ((Border)localObject3).setColor(zafz.g((String)localObject6));
          int i15 = zafy.a(str9 + " " + (String)localObject5);
          ((Border)localObject3).setLineStyle(i15);
        }
        else if (arrayOfString2.length == 2)
        {
          int i10 = zafy.a(localzafw.b());
          ((Border)localObject3).setLineStyle(i10);
        }
        else
        {
          ((Border)localObject3).setLineStyle(0);
        }
        break;
      case 25: 
        String[] arrayOfString3 = com.aspose.cells.b.a.zw.d(localzafw.b(), ' ');
        localObject5 = localStyle.getBorders().getByBorderType(4);
        if ((arrayOfString3.length > 3) && (localzafw.b().toLowerCase().indexOf("rgb") != -1))
        {
          int i13 = zafy.a(arrayOfString3[0] + " " + arrayOfString3[1]);
          ((Border)localObject5).setLineStyle(i13);
          localObject7 = "";
          for (int i16 = 2; i16 < arrayOfString3.length; i16++) {
            localObject7 = (String)localObject7 + arrayOfString3[i16];
          }
          if ("windowtext".equals(localObject7))
          {
            localObject8 = zafz.g(this.t);
            ((Border)localObject5).setColor((Color)localObject8);
          }
          else
          {
            localObject8 = zafz.g((String)localObject7);
            ((Border)localObject5).setColor((Color)localObject8);
          }
        }
        else if (arrayOfString3.length == 3)
        {
          String str10 = arrayOfString3[0];
          localObject7 = arrayOfString3[1];
          localObject8 = arrayOfString3[2];
          ((Border)localObject5).setColor(zafz.g((String)localObject8));
          i17 = zafy.a(str10 + " " + (String)localObject7);
          ((Border)localObject5).setLineStyle(i17);
        }
        else if (arrayOfString3.length == 2)
        {
          int i14 = zafy.a(localzafw.b());
          ((Border)localObject5).setLineStyle(i14);
        }
        else
        {
          ((Border)localObject5).setLineStyle(0);
        }
        break;
      case 26: 
        Border localBorder1 = localStyle.getBorders().getByBorderType(4);
        localBorder1.setColor(zafz.g(localzafw.b()));
        break;
      case 27: 
        localObject7 = com.aspose.cells.b.a.zw.d(localzafw.b(), ' ');
        localObject8 = localStyle.getBorders().getByBorderType(1);
        if ((localObject7.length > 3) && (localzafw.b().toLowerCase().indexOf("rgb") != -1))
        {
          i17 = zafy.a(localObject7[0] + " " + localObject7[1]);
          ((Border)localObject8).setLineStyle(i17);
          localObject9 = "";
          for (int i19 = 2; i19 < localObject7.length; i19++) {
            localObject9 = (String)localObject9 + localObject7[i19];
          }
          if ("windowtext".equals(localObject9))
          {
            localObject10 = zafz.g(this.t);
            ((Border)localObject8).setColor((Color)localObject10);
          }
          else
          {
            localObject10 = zafz.g((String)localObject9);
            ((Border)localObject8).setColor((Color)localObject10);
          }
        }
        else if (localObject7.length == 3)
        {
          String str11 = localObject7[0];
          localObject9 = localObject7[1];
          localObject10 = localObject7[2];
          ((Border)localObject8).setColor(zafz.g((String)localObject10));
          i20 = zafy.a(str11 + " " + (String)localObject9);
          ((Border)localObject8).setLineStyle(i20);
        }
        else if (localObject7.length == 2)
        {
          int i18 = zafy.a(localzafw.b());
          ((Border)localObject8).setLineStyle(i18);
        }
        else
        {
          ((Border)localObject8).setLineStyle(0);
        }
        break;
      case 28: 
        Border localBorder2 = localStyle.getBorders().getByBorderType(1);
        localBorder2.setColor(zafz.g(localzafw.b()));
        break;
      case 29: 
        localObject9 = com.aspose.cells.b.a.zw.d(localzafw.b(), ' ');
        localObject10 = localStyle.getBorders().getByBorderType(2);
        Color localColor1;
        if ((localObject9.length > 3) && (localzafw.b().toLowerCase().indexOf("rgb") != -1))
        {
          i20 = zafy.a(localObject9[0] + " " + localObject9[1]);
          ((Border)localObject10).setLineStyle(i20);
          localObject11 = "";
          for (int i22 = 2; i22 < localObject9.length; i22++) {
            localObject11 = (String)localObject11 + localObject9[i22];
          }
          if ("windowtext".equals(localObject11))
          {
            localColor1 = zafz.g(this.t);
            ((Border)localObject10).setColor(localColor1);
          }
          else
          {
            localColor1 = zafz.g((String)localObject11);
            ((Border)localObject10).setColor(localColor1);
          }
        }
        else if (localObject9.length == 3)
        {
          String str12 = localObject9[0];
          localObject11 = localObject9[1];
          localColor1 = localObject9[2];
          ((Border)localObject10).setColor(zafz.g(localColor1));
          int i25 = zafy.a(str12 + " " + (String)localObject11);
          ((Border)localObject10).setLineStyle(i25);
        }
        else if (localObject9.length == 2)
        {
          int i21 = zafy.a(localzafw.b());
          ((Border)localObject10).setLineStyle(i21);
        }
        else
        {
          ((Border)localObject10).setLineStyle(0);
        }
        break;
      case 30: 
        localStyle.getBorders().getByBorderType(2).setColor(zafz.g(localzafw.b()));
        break;
      case 31: 
        String[] arrayOfString4 = com.aspose.cells.b.a.zw.d(localzafw.b(), ' ');
        localObject11 = localStyle.getBorders().getByBorderType(8);
        String str14;
        if ((arrayOfString4.length > 3) && (localzafw.b().toLowerCase().indexOf("rgb") != -1))
        {
          int i23 = zafy.a(arrayOfString4[0] + " " + arrayOfString4[1]);
          ((Border)localObject11).setLineStyle(i23);
          str14 = "";
          for (int i27 = 2; i27 < arrayOfString4.length; i27++) {
            str14 = str14 + arrayOfString4[i27];
          }
          if ("windowtext".equals(str14))
          {
            localObject12 = zafz.g(this.t);
            ((Border)localObject11).setColor((Color)localObject12);
          }
          else
          {
            localObject12 = zafz.g(str14);
            ((Border)localObject11).setColor((Color)localObject12);
          }
        }
        else if (arrayOfString4.length == 3)
        {
          String str13 = arrayOfString4[0];
          str14 = arrayOfString4[1];
          localObject12 = arrayOfString4[2];
          ((Border)localObject11).setColor(zafz.g((String)localObject12));
          i28 = zafy.a(str13 + " " + str14);
          ((Border)localObject11).setLineStyle(i28);
        }
        else if (arrayOfString4.length == 2)
        {
          int i24 = zafy.a(localzafw.b());
          ((Border)localObject11).setLineStyle(i24);
        }
        else
        {
          ((Border)localObject11).setLineStyle(0);
        }
        break;
      case 32: 
        localStyle.getBorders().getByBorderType(8).setColor(zafz.g(localzafw.b()));
        break;
      case 33: 
        str4 = localzafw.b();
        break;
      case 34: 
        str5 = localzafw.b();
        break;
      case 9: 
        String[] arrayOfString5 = com.aspose.cells.b.a.zw.d(localzafw.b(), ' ');
        int i26;
        Color localColor2;
        if ((arrayOfString5.length > 3) && (localzafw.b().toLowerCase().indexOf("rgb") != -1))
        {
          i26 = zafy.a(arrayOfString5[0] + " " + arrayOfString5[1]);
          localStyle.getBorders().getByBorderType(8).setLineStyle(i26);
          localStyle.getBorders().getByBorderType(4).setLineStyle(i26);
          localStyle.getBorders().getByBorderType(1).setLineStyle(i26);
          localStyle.getBorders().getByBorderType(2).setLineStyle(i26);
          localObject12 = "";
          for (i28 = 2; i28 < arrayOfString5.length; i28++) {
            localObject12 = (String)localObject12 + arrayOfString5[i28];
          }
          if ("windowtext".equals(localObject12))
          {
            localColor2 = zafz.g(this.t);
            localStyle.getBorders().getByBorderType(8).setColor(localColor2);
            localStyle.getBorders().getByBorderType(4).setColor(localColor2);
            localStyle.getBorders().getByBorderType(1).setColor(localColor2);
            localStyle.getBorders().getByBorderType(2).setColor(localColor2);
          }
          else
          {
            localColor2 = zafz.g((String)localObject12);
            localStyle.getBorders().getByBorderType(8).setColor(localColor2);
            localStyle.getBorders().getByBorderType(4).setColor(localColor2);
            localStyle.getBorders().getByBorderType(1).setColor(localColor2);
            localStyle.getBorders().getByBorderType(2).setColor(localColor2);
          }
        }
        else if (arrayOfString5.length == 3)
        {
          i26 = zafy.a(arrayOfString5[0] + " " + arrayOfString5[1]);
          localStyle.getBorders().getByBorderType(8).setLineStyle(i26);
          localStyle.getBorders().getByBorderType(4).setLineStyle(i26);
          localStyle.getBorders().getByBorderType(1).setLineStyle(i26);
          localStyle.getBorders().getByBorderType(2).setLineStyle(i26);
          localObject12 = arrayOfString5[2];
          if ("windowtext".equals(localObject12))
          {
            localColor2 = zafz.g(this.t);
            localStyle.getBorders().getByBorderType(8).setColor(localColor2);
            localStyle.getBorders().getByBorderType(4).setColor(localColor2);
            localStyle.getBorders().getByBorderType(1).setColor(localColor2);
            localStyle.getBorders().getByBorderType(2).setColor(localColor2);
          }
          else
          {
            localColor2 = zafz.g((String)localObject12);
            localStyle.getBorders().getByBorderType(8).setColor(localColor2);
            localStyle.getBorders().getByBorderType(4).setColor(localColor2);
            localStyle.getBorders().getByBorderType(1).setColor(localColor2);
            localStyle.getBorders().getByBorderType(2).setColor(localColor2);
          }
        }
        else if (arrayOfString5.length == 2)
        {
          i26 = zafy.a(localzafw.b());
          localStyle.getBorders().getByBorderType(8).setLineStyle(i26);
          localStyle.getBorders().getByBorderType(4).setLineStyle(i26);
          localStyle.getBorders().getByBorderType(1).setLineStyle(i26);
          localStyle.getBorders().getByBorderType(2).setLineStyle(i26);
        }
        else
        {
          localStyle.getBorders().getByBorderType(8).setLineStyle(0);
          localStyle.getBorders().getByBorderType(4).setLineStyle(0);
          localStyle.getBorders().getByBorderType(1).setLineStyle(0);
          localStyle.getBorders().getByBorderType(2).setLineStyle(0);
        }
        break;
      case 10: 
        break;
      case 35: 
        if ("underline".equals(localzafw.b().trim())) {
          localStyle.getFont().setUnderline(zafz.f(localzafw.b()));
        } else if ("line-through".equals(localzafw.b().trim())) {
          localStyle.getFont().setStrikeout(true);
        }
        break;
      }
    }
    if ((str4 != null) && (str5 != null)) {
      localStyle.getBorders().getByBorderType(8).setLineStyle(zafy.a(str5 + " " + str4));
    }
    if (((str1 != null) || (str2 != null)) && (str3 == null))
    {
      localStyle.setPattern(1);
      localStyle.setForegroundColor(zafz.g(str1 == null ? str2 : str1));
    }
    if ((str1 == null) && (str2 == null) && (str3 != null)) {
      zafz.a(str3, localStyle);
    }
    if (((str1 != null) || (str2 != null)) && (str3 != null))
    {
      localObject1 = zafz.g(str1 == null ? str2 : str1);
      zafz.a(str3, localStyle, (Color)localObject1);
    }
    paramCell.a(localStyle);
    return localStyle;
  }
  
  private int i(String paramString)
  {
    switch (ac.a(paramString.toLowerCase()))
    {
    case 36: 
      return 1;
    case 37: 
      return 2;
    }
    return 0;
  }
  
  private int j(String paramString)
  {
    switch (ac.a(paramString.toLowerCase()))
    {
    case 38: 
      return 7;
    case 39: 
      return 8;
    case 40: 
      return 1;
    case 41: 
      return 6;
    case 42: 
      return 1;
    case 43: 
      return 9;
    case 44: 
      return 0;
    }
    return 8;
  }
  
  void n()
  {
    if (this.f == null)
    {
      ac().get(0).setDisplayRightToLeft(true);
      return;
    }
    this.f.g().setDisplayRightToLeft(true);
  }
  
  Cell o()
  {
    if (this.f == null) {
      a(ac().get(0));
    }
    if ((this.f != null) && (this.w != -1) && (this.x != -1)) {
      return this.f.get(this.w, this.x);
    }
    return null;
  }
  
  Cell a(int paramInt1, int paramInt2)
  {
    if (this.f == null) {
      a(ac().get(0));
    }
    if ((this.f != null) && (paramInt1 != -1) && (paramInt2 != -1)) {
      return this.f.get(paramInt1, paramInt2);
    }
    return null;
  }
  
  boolean a(CellArea paramCellArea)
  {
    if (this.o == null) {
      return false;
    }
    for (int i1 = 0; i1 < this.o.size(); i1++)
    {
      CellArea localCellArea = (CellArea)this.o.get(i1);
      if ((localCellArea.StartRow <= paramCellArea.StartRow) && (localCellArea.EndRow >= paramCellArea.StartRow) && (localCellArea.StartColumn <= paramCellArea.StartColumn) && (localCellArea.EndColumn >= paramCellArea.StartColumn)) {
        return true;
      }
      if ((localCellArea.StartRow <= paramCellArea.EndRow) && (localCellArea.EndRow >= paramCellArea.EndRow) && (localCellArea.StartColumn <= paramCellArea.EndColumn) && (localCellArea.EndColumn >= paramCellArea.EndColumn)) {
        return true;
      }
      if ((paramCellArea.StartRow <= localCellArea.StartRow) && (paramCellArea.EndRow >= localCellArea.EndRow) && (paramCellArea.StartColumn <= localCellArea.StartColumn) && (paramCellArea.EndColumn >= localCellArea.EndColumn)) {
        return true;
      }
    }
    return false;
  }
  
  private void a(Object paramObject, Style paramStyle)
  {
    if ((this.D == 0) && ((this.z > 1) || (this.A > 1)))
    {
      StyleFlag localStyleFlag = new StyleFlag();
      localStyleFlag.setAll(true);
      Object localObject;
      if (paramObject != null) {
        if (this.z == 0)
        {
          localObject = this.f.createRange(this.w, this.x, 1, this.A);
          ((Range)localObject).applyStyle(paramStyle, localStyleFlag);
        }
        else if (this.A == 0)
        {
          localObject = this.f.createRange(this.w, this.x, this.z, 1);
          ((Range)localObject).applyStyle(paramStyle, localStyleFlag);
        }
        else
        {
          localObject = this.f.createRange(this.w, this.x, this.z, this.A);
          ((Range)localObject).applyStyle(paramStyle, localStyleFlag);
        }
      }
      Range localRange;
      if (this.A == 0)
      {
        localObject = CellArea.createCellArea(this.w, this.x, this.w + this.z - 1, this.x);
        localRange = this.f.createRange(((CellArea)localObject).StartRow, ((CellArea)localObject).StartColumn, ((CellArea)localObject).EndRow - ((CellArea)localObject).StartRow + 1, 1);
        localRange.applyStyle(paramStyle, localStyleFlag);
        if ((!a((CellArea)localObject)) && (!this.p.containsKey(((CellArea)localObject).a())))
        {
          this.f.o().a((CellArea)localObject);
          zf.a(this.o, localObject);
        }
      }
      else if (this.z == 0)
      {
        localObject = CellArea.createCellArea(this.w, this.x, this.w, this.x + this.A - 1);
        localRange = this.f.createRange(((CellArea)localObject).StartRow, ((CellArea)localObject).StartColumn, 1, ((CellArea)localObject).EndColumn - ((CellArea)localObject).StartColumn + 1);
        localRange.applyStyle(paramStyle, localStyleFlag);
        if ((!a((CellArea)localObject)) && (!this.p.containsKey(((CellArea)localObject).a())))
        {
          this.f.o().a((CellArea)localObject);
          zf.a(this.o, localObject);
        }
      }
      else
      {
        localObject = CellArea.createCellArea(this.w, this.x, this.w + this.z - 1, this.x + this.A - 1);
        localRange = this.f.createRange(((CellArea)localObject).StartRow, ((CellArea)localObject).StartColumn, ((CellArea)localObject).EndRow - ((CellArea)localObject).StartRow + 1, ((CellArea)localObject).EndColumn - ((CellArea)localObject).StartColumn + 1);
        localRange.applyStyle(paramStyle, localStyleFlag);
        if ((!a((CellArea)localObject)) && (!this.p.containsKey(((CellArea)localObject).a())))
        {
          this.f.o().a((CellArea)localObject);
          zf.a(this.o, localObject);
        }
      }
    }
  }
  
  void g(HashMap paramHashMap) {}
  
  void p() {}
  
  void h(HashMap paramHashMap)
  {
    if ((a().b.getSupportDivTag()) && (this.w > 0) && (a().c > 0) && (this.w > a().c))
    {
      this.w -= a().c;
      if (a().c > a().e) {
        a().e = a().c;
      }
      a().c = 0;
      a().d = 0;
    }
    Object localObject1 = paramHashMap.get("colspan");
    Object localObject2 = paramHashMap.get("rowspan");
    if (localObject1 != null) {
      this.C = (com.aspose.cells.b.a.zp.a((String)localObject1) - 1);
    }
    if (localObject2 != null) {
      this.B = com.aspose.cells.b.a.zp.a((String)localObject2);
    }
    v(paramHashMap);
  }
  
  private void v(HashMap paramHashMap)
  {
    Object localObject1 = paramHashMap.get("class");
    if (localObject1 == null) {
      localObject1 = paramHashMap.get("CLASS");
    }
    int i1 = 15;
    if (localObject1 != null)
    {
      if (this.g.containsKey((String)localObject1)) {
        i1 = ((Integer)this.g.get((String)localObject1)).intValue();
      }
    }
    else if (this.g.containsKey("td")) {
      i1 = ((Integer)this.g.get("td")).intValue();
    }
    this.j = ac().C().a(i1);
    if (this.j == null) {
      this.j = new Style();
    }
    Cell localCell = o();
    if (localCell == null) {
      return;
    }
    BorderCollection localBorderCollection = localCell.getStyle().getBorders();
    if (this.k != null) {
      localCell.a(this.k);
    }
    if (i1 != 15) {
      localCell.b(i1);
    }
    Style localStyle1 = localCell.getStyle();
    localStyle1.getBorders().a(localBorderCollection, null);
    localCell.a(localStyle1);
    Object localObject2 = paramHashMap.get("align");
    if (localObject2 != null)
    {
      localObject3 = localCell.getStyle();
      ((Style)localObject3).setHorizontalAlignment(j(zs.a(localObject2)));
      localCell.a((Style)localObject3);
    }
    Object localObject3 = paramHashMap.get("valign");
    if (localObject3 != null)
    {
      localObject4 = localCell.getStyle();
      ((Style)localObject4).setVerticalAlignment(j(zs.a(localObject3)));
      localCell.a((Style)localObject4);
    }
    if (this.v.getLoadFormulas())
    {
      localObject4 = paramHashMap.get("x:fmla");
      a(localObject4, localCell, paramHashMap);
    }
    Object localObject4 = paramHashMap.get("x:num");
    b(localObject4, localCell);
    if (this.l != null)
    {
      Style localStyle2 = new Style();
      localStyle2.copy(this.l);
      a(localStyle2, localCell.getStyle());
      localCell.a(localStyle2);
    }
  }
  
  void q()
  {
    this.C = 0;
    this.B = 0;
  }
  
  void i(HashMap paramHashMap)
  {
    if (null == this.e) {
      this.e = ad().getWorksheets().get(0);
    }
    if (paramHashMap.get("href") != null) {
      a(b((String)paramHashMap.get("href")));
    }
    if ((paramHashMap.get("href") != null) && (this.w > -1) && (this.x > -1))
    {
      this.e.getHyperlinks().add(this.w, this.x, 1, 1, b((String)paramHashMap.get("href")));
      this.H = true;
    }
    if ((paramHashMap.get("name") != null) && (this.w > 0) && (this.x > 0) && (this.X.q()) && (!"currNameDef".equals((String)paramHashMap.get("title"))))
    {
      int i1 = this.d.getNames().add((String)paramHashMap.get("name"));
      Name localName = this.d.getNames().get(i1);
      CellArea localCellArea = new CellArea();
      localCellArea.StartColumn = this.x;
      localCellArea.EndColumn = this.x;
      localCellArea.StartRow = this.w;
      localCellArea.EndRow = this.w;
      localName.a(this.e.getIndex(), localCellArea);
    }
  }
  
  void b(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
  
  String b(String paramString)
  {
    if (("../#".equals(paramString)) || ("#".equals(paramString))) {
      return paramString;
    }
    if (paramString.indexOf("&#") > 0) {
      paramString = com.aspose.cells.b.a.zw.a(com.aspose.cells.b.a.zw.a(com.aspose.cells.b.a.zw.a(com.aspose.cells.b.a.zw.a(paramString, "&#47;", "/"), "&#58;", ":"), "&#61;", "="), "&#63;", "?");
    }
    if (paramString.indexOf("../") > -1) {
      return paramString.substring(3);
    }
    if ((paramString.startsWith("http://")) || (paramString.startsWith("https://")) || (paramString.startsWith("www."))) {
      return paramString;
    }
    if (paramString.indexOf("#") > -1)
    {
      if ((paramString.startsWith("#")) || (paramString.startsWith("null#")))
      {
        arrayOfString1 = com.aspose.cells.b.a.zw.d(paramString, '!');
        if (arrayOfString1.length < 2) {
          return paramString;
        }
        if ("#RANGE".equals(arrayOfString1[0])) {
          return "#" + arrayOfString1[1];
        }
        return arrayOfString1[1];
      }
      String[] arrayOfString1 = com.aspose.cells.b.a.zw.d(paramString, '#');
      if (arrayOfString1.length < 2) {
        return paramString;
      }
      if ((a().f.get(arrayOfString1[1]) != null) && (!"".equals((String)a().f.get(arrayOfString1[1])))) {
        return (String)a().f.get(arrayOfString1[1]);
      }
      if ((paramString.indexOf("!") == -1) && (arrayOfString1[1].indexOf("!") == -1)) {
        return "#" + arrayOfString1[1];
      }
      String[] arrayOfString2 = com.aspose.cells.b.a.zw.d(arrayOfString1[0], '.');
      String[] arrayOfString3 = com.aspose.cells.b.a.zw.d(arrayOfString2[0], 't');
      if (arrayOfString3.length < 2) {
        return paramString;
      }
      String[] arrayOfString4 = com.aspose.cells.b.a.zw.d(arrayOfString1[1], '!');
      if (arrayOfString4.length < 2) {
        return paramString;
      }
      int i1 = com.aspose.cells.b.a.zp.a(arrayOfString3[1]) - 1;
      return "'" + this.d.get(i1).getName() + "'!" + arrayOfString4[1];
    }
    return paramString + "!A1";
  }
  
  void j(HashMap paramHashMap)
    throws Exception
  {
    if (this.w < 0) {
      this.w = 0;
    }
    if (this.x < 0) {
      this.x = 0;
    }
    String str1 = (String)paramHashMap.get("width");
    String str2 = (String)paramHashMap.get("height");
    int i1 = -1;
    if (str1 != null) {
      i1 = (int)zbxp.a(str1);
    }
    int i2 = -1;
    if (str2 != null) {
      i2 = (int)zbxp.a(str2);
    }
    String str3 = (String)paramHashMap.get("v:shapes");
    String str4 = null;
    Object localObject1 = paramHashMap.keySet().iterator();
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = ((Iterator)localObject1).next();
      if ("src".equals(((String)localObject2).toLowerCase()))
      {
        str4 = (String)localObject2;
        break;
      }
    }
    localObject1 = null;
    if (str4 != null) {
      localObject1 = (String)paramHashMap.get(str4);
    }
    if (null == localObject1) {
      return;
    }
    if ((((String)localObject1).startsWith("file:///")) && (((String)localObject1).indexOf("\\") > -1)) {
      localObject1 = com.aspose.cells.b.a.zw.a((String)localObject1, "\\", "/");
    }
    int i10;
    Object localObject7;
    int i13;
    Object localObject3;
    if (str3 == null)
    {
      localObject2 = (zagf)this.i.get("SavedByAspose");
      Object localObject4;
      int i6;
      if (localObject2 != null)
      {
        int i3 = -1;
        if (((zagf)localObject2).b() == null)
        {
          localObject4 = null;
          Object localObject5;
          if (k((String)localObject1))
          {
            localObject5 = com.aspose.cells.b.a.ze.b(((String)localObject1).substring(((String)localObject1).indexOf(',') + 1));
            localObject4 = new zh((byte[])localObject5);
            i3 = this.e.getPictures().a(this.w, this.x, (zm)localObject4);
          }
          else
          {
            localObject5 = new StreamProviderOptions();
            ((StreamProviderOptions)localObject5).a = ((String)localObject1);
            ((StreamProviderOptions)localObject5).b = (((zagf)localObject2).d() + (String)localObject1);
            a().c().initStream((StreamProviderOptions)localObject5);
            localObject4 = ((StreamProviderOptions)localObject5).c;
            i3 = this.e.getPictures().a(this.w, this.x, (zm)localObject4);
          }
        }
        else
        {
          i3 = this.e.getPictures().a(this.w, this.x, ((zagf)localObject2).b());
        }
        localObject4 = this.e.getPictures().get(i3);
        i6 = ((zagf)localObject2).g();
        int i8 = ((zagf)localObject2).h();
        int i9 = ((zagf)localObject2).f();
        i10 = ((zagf)localObject2).e();
        localObject7 = aa().getCells();
        int i11 = this.x;
        for (i13 = ((Cells)localObject7).getColumnWidthPixel(i11); i10 > i13; i13 = ((Cells)localObject7).getColumnWidthPixel(i11))
        {
          i11++;
          i10 -= i13;
        }
        ((Picture)localObject4).a(this.w, i9, i11, i10, i8, i6);
        if ((b()) && (!"".equals(c())))
        {
          ((Picture)localObject4).addHyperlink(c());
          a("");
        }
        this.i.remove("SavedByAspose");
      }
      else
      {
        if (this.e == null) {
          a(this.d.get(0));
        }
        if (((String)localObject1).startsWith("http"))
        {
          try
          {
            a((String)localObject1, i1, i2);
          }
          catch (Exception localException1) {}
        }
        else if (zk.f((String)localObject1))
        {
          if (!zd.c((String)localObject1)) {
            return;
          }
          int i4 = this.e.getPictures().add(this.w, this.x, (String)localObject1);
          if ((b()) && (!"".equals(c())))
          {
            this.e.getPictures().get(i4).addHyperlink(c());
            a("");
          }
        }
        else
        {
          localObject3 = this.v.getAttachedFilesDirectory();
          if (localObject3 != null) {
            com.aspose.cells.b.a.zw.a((String)localObject3, "\\", "/");
          }
          if ((localObject3 != null) && (!((String)localObject3).endsWith("/")) && (!((String)localObject3).endsWith("\\"))) {
            localObject3 = (String)localObject3 + "/";
          }
          if (localObject3 == null) {
            localObject3 = "";
          }
          localObject4 = (String)localObject3 + (String)localObject1;
          if (zd.c((String)localObject4))
          {
            i6 = this.e.getPictures().add(this.w, this.x, (String)localObject3 + (String)localObject1);
            if ((b()) && (!"".equals(c())))
            {
              this.e.getPictures().get(i6).addHyperlink(c());
              a("");
            }
          }
          else
          {
            try
            {
              a((String)localObject4, i1, i2);
            }
            catch (Exception localException2) {}
          }
        }
      }
    }
    else
    {
      localObject2 = com.aspose.cells.b.a.zw.d(str3, ' ');
      for (Object localObject6 : localObject2)
      {
        zagf localzagf = null;
        localzagf = (zagf)this.i.get(localObject6);
        if (localzagf != null) {
          try
          {
            i10 = -1;
            if (localzagf.b() == null)
            {
              localObject7 = new StreamProviderOptions();
              ((StreamProviderOptions)localObject7).a = ((String)localObject1);
              ((StreamProviderOptions)localObject7).b = (localzagf.d() + (String)localObject1);
              a().c().initStream((StreamProviderOptions)localObject7);
              zm localzm = ((StreamProviderOptions)localObject7).c;
              if (null == localzm) {
                return;
              }
              i10 = this.e.getPictures().a(this.w, this.x, localzm);
            }
            else
            {
              i10 = this.e.getPictures().a(this.w, this.x, localzagf.b());
            }
            localObject7 = this.e.getPictures().get(i10);
            int i12 = localzagf.g();
            i13 = localzagf.h();
            int i14 = localzagf.f();
            int i15 = localzagf.e();
            ((Picture)localObject7).a(this.w, i14, this.x, i15, i13, i12);
            ((Picture)localObject7).setPrintable(localzagf.k());
            ((Picture)localObject7).setLocked(localzagf.j());
            if ((b()) && (!"".equals(c())))
            {
              ((Picture)localObject7).addHyperlink(c());
              a("");
            }
          }
          catch (Exception localException3) {}finally
          {
            if (localzagf.b() != null) {
              localzagf.b().a();
            }
          }
        }
      }
    }
  }
  
  private void a(String paramString, int paramInt1, int paramInt2)
    throws Exception
  {
    int i1 = -1;
    Object localObject2;
    Object localObject3;
    if (k(paramString))
    {
      localObject1 = com.aspose.cells.b.a.ze.b(paramString.substring(paramString.indexOf(',') + 1));
      localObject2 = new zh((byte[])localObject1);
      i1 = this.e.getPictures().a(this.w, this.x, (zm)localObject2);
      if ((paramInt1 > 0) && (paramInt2 > 0))
      {
        localObject3 = this.e.getPictures().get(i1);
        ((Picture)localObject3).setWidth(paramInt1);
        ((Picture)localObject3).setHeight(paramInt2);
      }
    }
    if (zbxt.a(paramString))
    {
      localObject1 = a().c();
      localObject2 = null;
      if (localObject1 != null)
      {
        localObject3 = new StreamProviderOptions();
        ((StreamProviderOptions)localObject3).a = paramString;
        ((StreamProviderOptions)localObject3).b = paramString;
        ((IStreamProvider)localObject1).initStream((StreamProviderOptions)localObject3);
        localObject2 = ((StreamProviderOptions)localObject3).c;
        if ((localObject2 != null) && (((zm)localObject2).h() < 1L)) {
          return;
        }
      }
      if (localObject2 == null)
      {
        localObject2 = com.aspose.cells.a.c.zw.d(paramString);
        if (localObject2 == null) {
          return;
        }
      }
      i1 = this.e.getPictures().a(this.w, this.x, (zm)localObject2);
      if ((paramInt1 > 0) && (paramInt2 > 0))
      {
        localObject3 = this.e.getPictures().get(i1);
        ((Picture)localObject3).setWidth(paramInt1);
        ((Picture)localObject3).setHeight(paramInt2);
      }
    }
    if (-1 != i1)
    {
      if ((b()) && (!"".equals(c())))
      {
        this.e.getPictures().get(i1).addHyperlink(c());
        a("");
      }
      return;
    }
    if (a().c() != null)
    {
      localObject1 = new StreamProviderOptions();
      ((StreamProviderOptions)localObject1).a = paramString;
      ((StreamProviderOptions)localObject1).b = paramString;
      a().c().initStream((StreamProviderOptions)localObject1);
      localObject2 = ((StreamProviderOptions)localObject1).c;
      if (localObject2 != null)
      {
        i1 = this.e.getPictures().a(this.w, this.x, (zm)localObject2);
        return;
      }
    }
    Object localObject1 = new Picture(this.e.getShapes());
    ((Picture)localObject1).R().i().b(this.w);
    ((Picture)localObject1).R().i().d(this.x);
    this.e.getShapes().c((Shape)localObject1);
    ((Picture)localObject1).setWidth(195);
    ((Picture)localObject1).setHeight(293);
  }
  
  private boolean k(String paramString)
  {
    return (paramString.startsWith("data:image")) && (paramString.indexOf("base64") > -1);
  }
  
  void k(HashMap paramHashMap)
  {
    this.P = true;
    this.Q = true;
  }
  
  void l(HashMap paramHashMap)
    throws Exception
  {
    Object localObject = paramHashMap.get("style");
    if (localObject == null) {
      return;
    }
    Cell localCell = o();
    if (localCell == null) {
      return;
    }
    Style localStyle = new Style(this.d);
    if (localCell.getStyle() != null) {
      localStyle.copy(localCell.getStyle());
    }
    a(zs.a(localObject).toLowerCase(), localStyle, localCell);
  }
  
  void r()
  {
    Cell localCell = o();
    a(localCell);
  }
  
  void s()
  {
    Cell localCell = o();
    if ((localCell != null) && (!com.aspose.cells.b.a.zw.b(localCell.getStringValue())))
    {
      this.w += 1;
      a(localCell);
    }
  }
  
  private void a(Cell paramCell)
  {
    int i1 = this.f.o().getCount();
    if (i1 == 0) {
      return;
    }
    CellArea localCellArea1 = this.f.o().a(i1 - 1);
    if ((localCellArea1.StartRow == this.w - 1) && (localCellArea1.StartRow == localCellArea1.EndRow))
    {
      CellArea localCellArea2 = CellArea.createCellArea(this.w, localCellArea1.StartColumn, this.w, localCellArea1.EndColumn);
      if ((!a(localCellArea2)) && (!this.p.containsKey(localCellArea2.a())))
      {
        if ((this.S != null) && (this.m != null)) {
          this.f.get(this.w, localCellArea1.StartColumn).setStyle(this.m);
        } else {
          this.f.get(this.w, localCellArea1.StartColumn).setStyle(paramCell.getStyle());
        }
        this.f.o().a(localCellArea2);
        zf.a(this.o, localCellArea2);
      }
    }
  }
  
  void m(HashMap paramHashMap)
    throws Exception
  {
    Object localObject = paramHashMap.get("style");
    if (localObject == null) {
      return;
    }
    Cell localCell = o();
    if (localCell == null) {
      return;
    }
    a((String)localObject, localCell.getStyle(), localCell);
  }
  
  void n(HashMap paramHashMap)
    throws Exception
  {
    Object localObject = paramHashMap.get("style");
    if (localObject == null) {
      return;
    }
    Cell localCell = o();
    if (localCell == null) {
      return;
    }
    Style localStyle = new Style(this.d);
    if (localCell.getStyle() != null) {
      localStyle.copy(localCell.getStyle());
    }
    a(zs.a(localObject).toLowerCase(), localStyle, localCell);
  }
  
  void o(HashMap paramHashMap)
  {
    this.R = true;
    this.x = 0;
    Object localObject = paramHashMap.get("style");
    if (localObject == null) {
      return;
    }
    this.S = new Style(this.d);
    if (this.j != null) {
      this.S.copy(this.j);
    }
    zagi localzagi = new zagi();
    localzagi.b((String)localObject);
    ArrayList localArrayList = localzagi.e();
    Iterator localIterator = localArrayList.iterator();
    while (localIterator.hasNext())
    {
      zafw localzafw = (zafw)localIterator.next();
      switch (ac.a(localzafw.a().toLowerCase()))
      {
      case 5: 
        this.S.getFont().setColor(zafz.g(localzafw.b()));
        break;
      case 7: 
        zagc.a(this.S.getFont(), localzafw.b().trim().toLowerCase());
        break;
      case 4: 
        if ("bold".equals(localzafw.b().toLowerCase())) {
          this.S.getFont().setBold(true);
        }
        break;
      case 8: 
        zagc.a(localzafw.b(), this.S.getFont());
        break;
      case 45: 
        break;
      case 35: 
        if ("underline".equals(localzafw.b().trim())) {
          this.S.getFont().setUnderline(zafz.f(localzafw.b()));
        } else if ("line-through".equals(localzafw.b().trim())) {
          this.S.getFont().setStrikeout(true);
        }
        break;
      case 16: 
        if ("super".equals(localzafw.b())) {
          this.S.getFont().setSuperscript(true);
        }
        if ("sub".equals(localzafw.b())) {
          this.S.getFont().setSubscript(true);
        }
        break;
      }
    }
    if (a().e()) {
      this.S.getFont().setBold(true);
    }
  }
  
  void p(HashMap paramHashMap)
  {
    this.R = true;
    Object localObject = paramHashMap.get("style");
    if (localObject == null) {
      return;
    }
    this.S = new Style(this.d);
    if (this.j != null) {
      this.S.copy(this.j);
    }
  }
  
  void b(HashMap paramHashMap, String paramString)
  {
    String str1 = (String)paramHashMap.get("style");
    if ((str1.indexOf("z-index") > -1) && (this.i.size() == 0))
    {
      String[] arrayOfString1 = com.aspose.cells.b.a.zw.d(str1, ';');
      zagf localzagf = new zagf();
      localzagf.a("SavedByAspose");
      localzagf.c(paramString);
      for (int i1 = 0; i1 < arrayOfString1.length; i1++)
      {
        String[] arrayOfString2 = com.aspose.cells.b.a.zw.d(arrayOfString1[i1], ':');
        String str2 = arrayOfString2[0].trim();
        String str3 = arrayOfString2[1].trim();
        switch (ac.a(str2.toLowerCase()))
        {
        case 11: 
          break;
        case 46: 
          break;
        case 47: 
          break;
        case 48: 
          localzagf.a((int)zbxp.a(str3));
          break;
        case 49: 
          localzagf.b((int)zbxp.a(str3));
          break;
        case 21: 
          localzagf.c((int)zbxp.a(str3));
          break;
        case 2: 
          localzagf.d((int)zbxp.a(str3));
        }
      }
      this.i.put(localzagf.a(), localzagf);
    }
  }
  
  void t()
  {
    this.P = false;
    this.R = false;
  }
  
  void u()
  {
    this.R = false;
  }
  
  void c(int paramInt)
  {
    if (this.e == null) {
      return;
    }
    Picture localPicture = new Picture(this.e.getShapes());
    int[] arrayOfInt = localPicture.b(this.x, 0, paramInt);
    this.x = arrayOfInt[0];
  }
  
  void v()
  {
    this.F = true;
  }
  
  void w()
  {
    this.F = false;
  }
  
  void x()
  {
    this.G = true;
  }
  
  void y()
  {
    this.G = false;
  }
  
  void z()
  {
    this.w += 1;
  }
  
  void A()
  {
    zapd localzapd = this.f.o();
    int i1 = localzapd.getCount();
    for (int i2 = 0; i2 < i1; i2++)
    {
      CellArea localCellArea = localzapd.a(i2);
      if ((localCellArea.StartRow + 1 == this.w) && (localCellArea.StartColumn == this.x) && (localCellArea.EndRow != this.w))
      {
        this.f.merge(this.w, this.x, localCellArea.EndRow - localCellArea.StartRow + 1, localCellArea.EndColumn - localCellArea.StartColumn + 1);
        break;
      }
    }
  }
  
  boolean B()
  {
    if (this.f == null) {
      return false;
    }
    zapd localzapd = this.f.o();
    int i1 = localzapd.getCount();
    for (int i2 = 0; i2 < i1; i2++)
    {
      CellArea localCellArea = localzapd.a(i2);
      if ((localCellArea.StartRow == this.w) && (localCellArea.StartColumn == this.x) && (localCellArea.EndRow >= this.w + 1)) {
        return true;
      }
    }
    return false;
  }
  
  boolean C()
  {
    if (this.f == null) {
      return false;
    }
    zapd localzapd = this.f.o();
    int i1 = localzapd.getCount();
    for (int i2 = 0; i2 < i1; i2++)
    {
      CellArea localCellArea = localzapd.a(i2);
      if ((localCellArea.StartRow == this.w) && (localCellArea.StartColumn == this.x)) {
        return true;
      }
    }
    return false;
  }
  
  void c(String paramString)
  {
    this.W = (paramString + this.W);
  }
  
  void D()
  {
    this.W += "\r\n";
  }
  
  void E()
  {
    this.m = null;
  }
  
  void F()
    throws Exception
  {
    if (this.x == -1) {
      this.w += 1;
    }
    L();
    zapd localzapd = this.f.o();
    int i1 = localzapd.getCount();
    for (int i2 = 0; i2 < i1; i2++)
    {
      CellArea localCellArea = localzapd.a(i2);
      if ((localCellArea.StartRow == this.w) && (localCellArea.StartColumn == this.x))
      {
        Cell localCell = o();
        Range localRange = this.f.createRange(localCellArea.StartRow, localCellArea.StartColumn, localCellArea.EndRow - localCellArea.StartRow + 1, localCellArea.EndColumn - localCellArea.StartColumn + 1);
        StyleFlag localStyleFlag = new StyleFlag();
        localStyleFlag.setAll(true);
        Style localStyle = new Style();
        localStyle.copy(localCell.getStyle());
        localStyle.getBorders().getByBorderType(8).setLineStyle(0);
        localRange.applyStyle(localStyle, localStyleFlag);
        break;
      }
    }
    ak();
  }
  
  private void ak()
  {
    if (this.f == null) {
      return;
    }
    zapd localzapd = this.f.o();
    int i1 = localzapd.getCount();
    for (int i2 = 0; i2 < i1; i2++)
    {
      CellArea localCellArea = localzapd.a(i2);
      if ((localCellArea.StartRow == this.w) && (localCellArea.EndRow == this.w) && (localCellArea.StartColumn == this.x))
      {
        this.w += 1;
        if (this.m != null)
        {
          localObject = o();
          if (localObject != null) {
            ((Cell)localObject).a(this.m);
          }
        }
        Object localObject = CellArea.createCellArea(this.w, localCellArea.StartColumn, this.w, localCellArea.EndColumn);
        if (!this.p.containsKey(((CellArea)localObject).a()))
        {
          this.p.put(((CellArea)localObject).a(), Integer.valueOf(1));
          this.f.o().a((CellArea)localObject);
        }
        Range localRange = this.f.createRange(((CellArea)localObject).StartRow, ((CellArea)localObject).StartColumn, ((CellArea)localObject).EndRow - ((CellArea)localObject).StartRow + 1, ((CellArea)localObject).EndColumn - ((CellArea)localObject).StartColumn + 1);
        StyleFlag localStyleFlag = new StyleFlag();
        localStyleFlag.setAll(true);
        Style localStyle = new Style();
        if (this.m != null) {
          localStyle.copy(this.m);
        }
        localStyle.getBorders().getByBorderType(8).setLineStyle(0);
        localStyle.getBorders().getByBorderType(4).setLineStyle(0);
        localRange.applyStyle(localStyle, localStyleFlag);
        return;
      }
    }
  }
  
  private String l(String paramString)
  {
    int i1;
    StringBuilder localStringBuilder1;
    int i3;
    char c1;
    if ((paramString.length() > 0) && ("".equals(paramString.trim())))
    {
      i1 = paramString.length();
      localStringBuilder1 = new StringBuilder();
      StringBuilder localStringBuilder2 = new StringBuilder();
      for (i3 = 0; i3 < i1; i3++)
      {
        c1 = paramString.charAt(i3);
        if (c1 == ' ') {
          localStringBuilder2.append(c1);
        } else {
          localStringBuilder1.append(c1);
        }
      }
      if (localStringBuilder2.length() > 1) {
        localStringBuilder1.append(" ");
      }
    }
    if (paramString.indexOf('\r') > -1)
    {
      i1 = paramString.length();
      localStringBuilder1 = new StringBuilder();
      for (int i2 = 0; i2 < i1; i2++)
      {
        i3 = paramString.charAt(i2);
        if ((i3 == 13) && (i2 + 1 < i1))
        {
          c1 = paramString.charAt(++i2);
          if (c1 == '\n')
          {
            StringBuilder localStringBuilder3 = new StringBuilder();
            while ((a(paramString, ++i2) > 0) && (a(paramString, i2) == ' ')) {
              localStringBuilder3.append(' ');
            }
            if (localStringBuilder3.length() > 0) {
              localStringBuilder1.append(' ');
            }
            if (a(paramString, i2) != 0) {
              localStringBuilder1.append(a(paramString, i2));
            }
          }
          else
          {
            localStringBuilder1.append(c1);
          }
        }
        else
        {
          localStringBuilder1.append(i3);
        }
      }
      if (this.X.b.getDeleteRedundantSpaces()) {
        return zs.a(localStringBuilder1).trim();
      }
      return zs.a(localStringBuilder1);
    }
    if (this.X.b.getDeleteRedundantSpaces()) {
      return paramString.trim();
    }
    return com.aspose.cells.b.a.zw.c(paramString, new char[] { '\t' });
  }
  
  private static char a(String paramString, int paramInt)
  {
    char c1;
    if (paramInt < paramString.length()) {
      c1 = paramString.charAt(paramInt);
    } else {
      c1 = '\000';
    }
    return c1;
  }
  
  void G()
  {
    this.W = "";
  }
  
  boolean H()
  {
    return !com.aspose.cells.b.a.zw.b(this.W);
  }
  
  void d(String paramString)
    throws Exception
  {
    paramString = l(paramString);
    if (this.G)
    {
      this.X.c(paramString);
      return;
    }
    if (this.F)
    {
      e(paramString);
      this.F = false;
      return;
    }
    if (this.R)
    {
      this.s = new zagm();
      if ("".equals(this.W))
      {
        this.s.a(0);
        this.s.b(paramString.length());
      }
      else
      {
        this.s.a(m(com.aspose.cells.b.a.zw.c(this.W)).length());
        this.s.b(paramString.length());
      }
      if (this.S != null)
      {
        Font localFont = this.S.getFont();
        this.s.a(localFont);
      }
      zf.a(this.r, this.s);
      this.W += paramString;
      this.R = false;
      return;
    }
    if (this.E)
    {
      if (this.K)
      {
        this.s = new zagm();
        if (!"".equals(this.W))
        {
          this.s.a(this.W.length());
          this.s.b(paramString.length());
        }
        this.W += paramString;
        return;
      }
      if (this.P)
      {
        this.W += paramString;
        return;
      }
      if (this.H)
      {
        if (this.W != null) {
          this.W = com.aspose.cells.b.a.zw.c(this.W);
        }
        this.W += paramString;
        this.H = false;
        return;
      }
      this.W += paramString;
    }
    else if ((!paramString.trim().equals("")) && (!al()))
    {
      this.W += paramString;
    }
  }
  
  private boolean al()
  {
    Iterator localIterator = this.X.l().values().iterator();
    while (localIterator.hasNext())
    {
      zm localzm = (zm)localIterator.next();
      if (localzm != null) {
        return true;
      }
    }
    return false;
  }
  
  void I()
  {
    if ((this.f != null) && (this.f.g().getHyperlinks().getCount() > 0))
    {
      HyperlinkCollection localHyperlinkCollection = this.f.g().getHyperlinks();
      String str1 = localHyperlinkCollection.get(localHyperlinkCollection.getCount() - 1).getAddress();
      String str2 = localHyperlinkCollection.get(localHyperlinkCollection.getCount() - 1).b;
      if (((str1 != null) && (str1.equals(str2))) || (str1.equals("http://" + str2))) {
        localHyperlinkCollection.get(localHyperlinkCollection.getCount() - 1).setTextToDisplay(m(this.W));
      } else {
        localHyperlinkCollection.get(localHyperlinkCollection.getCount() - 1).setTextToDisplay(str2 + m(this.W));
      }
      this.W = "";
    }
  }
  
  void J()
  {
    if ((this.w != -1) && (this.x != -1))
    {
      if (this.f == null) {
        this.f = ac().get(0).getCells();
      }
      for (int i1 = 0; i1 <= this.x; i1++) {
        this.f.get(this.w, this.x).b(15);
      }
    }
  }
  
  private boolean b(Cell paramCell)
  {
    if ((paramCell == null) || ("".equals(this.W))) {
      return true;
    }
    if (paramCell.getValue() != null)
    {
      HyperlinkCollection localHyperlinkCollection = aa().getHyperlinks();
      int i1 = localHyperlinkCollection.getCount() - 1;
      if ((i1 >= 0) && (localHyperlinkCollection.get(i1).getTextToDisplay().equals(paramCell.getValue())))
      {
        this.W = (paramCell.getValue() + this.W);
        return false;
      }
      return true;
    }
    return false;
  }
  
  boolean K()
  {
    return zarb.c(this.W);
  }
  
  void L()
    throws Exception
  {
    Cell localCell = o();
    if (b(localCell))
    {
      this.W = "";
      return;
    }
    Object localObject3;
    if (ag().getConvertFormulasData())
    {
      str = this.W.trim();
      if ((str.startsWith("=")) && (this.ab.d(str)))
      {
        localCell.setFormula(str);
        localObject1 = localCell.getPrecedents();
        Object localObject2 = ((ReferredAreaCollection)localObject1).getCount() > 0 ? ((ReferredAreaCollection)localObject1).get(0) : null;
        if (null != localObject2)
        {
          if (this.f == null) {
            this.f = ac().get(0).getCells();
          }
          if ((this.f != null) && (((ReferredArea)localObject2).getStartRow() != -1) && (((ReferredArea)localObject2).getStartColumn() != -1))
          {
            localObject3 = this.f.get(((ReferredArea)localObject2).getStartRow(), ((ReferredArea)localObject2).getStartColumn());
            Style localStyle1 = new Style(this.d);
            localStyle1.copy(this.d.C().a(localCell.s()));
            localStyle1.setCultureCustom(((Cell)localObject3).getStyle().getCultureCustom());
            localCell.b(this.d.C().a(localStyle1));
          }
        }
        this.W = "";
        return;
      }
    }
    if (this.W.toLowerCase().equals("true"))
    {
      localCell.putValue(true);
      this.W = "";
      return;
    }
    if ((this.W.toLowerCase().equals("false")) && (!localCell.g()))
    {
      localCell.putValue(false);
      this.W = "";
      return;
    }
    String str = null;
    Object localObject1 = null;
    boolean bool = true;
    if (" ".equals(this.W))
    {
      localObject1 = this.W;
    }
    else if ((this.W.endsWith(" ")) && (this.Q))
    {
      localObject1 = m(this.W);
      this.Q = false;
    }
    else
    {
      str = com.aspose.cells.b.a.zw.c(this.W, b);
      if (this.W.startsWith(" ")) {
        str = " " + str;
      }
      if (this.W.endsWith(" ")) {
        str = str + " ";
      }
      localObject1 = m(str);
      bool = com.aspose.cells.b.a.zw.b(str, (String)localObject1);
    }
    this.W = "";
    if ("".equals(localObject1)) {
      return;
    }
    try
    {
      localObject3 = null;
      if (((this.v.getConvertNumericData()) || (this.v.getConvertDateTimeData())) && (bool)) {
        localObject3 = ((String)localObject1).trim();
      }
      Object localObject4;
      if ((this.v.getConvertNumericData()) && (bool))
      {
        int i1 = 1;
        if ((this.v.b) && (((String)localObject3).length() > 15))
        {
          localObject4 = ((String)localObject3).toCharArray();
          int i2 = 0;
          int i3 = 0;
          for (int i4 = 0; i4 < localObject4.length; i4++)
          {
            switch (localObject4[i4])
            {
            case '%': 
            case '+': 
            case ',': 
            case '-': 
            case '.': 
            case 'E': 
            case 'e': 
              break;
            case '0': 
              if (i2 != 0) {
                i3++;
              }
              break;
            case '1': 
            case '2': 
            case '3': 
            case '4': 
            case '5': 
            case '6': 
            case '7': 
            case '8': 
            case '9': 
              i2 = 1;
              i3++;
              break;
            case '&': 
            case '\'': 
            case '(': 
            case ')': 
            case '*': 
            case '/': 
            case ':': 
            case ';': 
            case '<': 
            case '=': 
            case '>': 
            case '?': 
            case '@': 
            case 'A': 
            case 'B': 
            case 'C': 
            case 'D': 
            case 'F': 
            case 'G': 
            case 'H': 
            case 'I': 
            case 'J': 
            case 'K': 
            case 'L': 
            case 'M': 
            case 'N': 
            case 'O': 
            case 'P': 
            case 'Q': 
            case 'R': 
            case 'S': 
            case 'T': 
            case 'U': 
            case 'V': 
            case 'W': 
            case 'X': 
            case 'Y': 
            case 'Z': 
            case '[': 
            case '\\': 
            case ']': 
            case '^': 
            case '_': 
            case '`': 
            case 'a': 
            case 'b': 
            case 'c': 
            case 'd': 
            default: 
              i1 = 0;
            }
            if ((i3 > 15) || (i1 == 0))
            {
              i1 = 0;
              break;
            }
          }
        }
        if (i1 != 0)
        {
          localObject4 = this.V.parseObject((String)localObject3);
          if (localObject4 != null)
          {
            a(localCell, localObject4);
            Style localStyle3 = localCell.getStyle();
            if ((localStyle3.getNumber() == 0) && (com.aspose.cells.b.a.zw.b(localStyle3.s())) && (this.v.getLoadStyleStrategy() == 2))
            {
              localStyle3.b(this.V.getFormat());
              localCell.a(localStyle3);
            }
            return;
          }
        }
      }
      if ((this.v.getConvertDateTimeData()) && (bool))
      {
        Style localStyle2 = localCell.getStyle();
        if ("General".equals(localStyle2.s()))
        {
          a(localCell, localObject1);
          return;
        }
        localObject4 = this.U.parseObject((String)localObject3);
        if ((localObject4 != null) && (CellsHelper.getDoubleFromDateTime((DateTime)localObject4, this.c.getSettings().getDate1904()) >= 0.0D) && (this.v.getLoadStyleStrategy() == 2))
        {
          a(localCell, localObject4);
          localStyle2.b(this.U.getFormat());
          localCell.a(localStyle2);
          return;
        }
      }
      a(localCell, localObject1);
    }
    catch (Exception localException)
    {
      localCell.putValue((String)localObject1);
    }
    e(localCell);
  }
  
  private void a(Cell paramCell, Object paramObject)
  {
    if (paramCell.g())
    {
      ((zaai)paramCell.c.d).a(paramCell, paramObject);
    }
    else
    {
      if (((paramObject instanceof String)) && (((String)paramObject).indexOf("\r\n") != -1))
      {
        Style localStyle = paramCell.getStyle();
        localStyle.setTextWrapped(true);
        paramCell.setStyle(localStyle);
        int i1 = this.o.size();
        for (int i2 = 0; i2 < i1; i2++)
        {
          CellArea localCellArea = (CellArea)this.o.get(i2);
          if ((this.w >= localCellArea.StartRow) && (this.w <= localCellArea.EndRow) && (this.x >= localCellArea.StartColumn) && (this.x <= localCellArea.EndColumn))
          {
            Range localRange = new Range(localCellArea, paramCell.d);
            StyleFlag localStyleFlag = new StyleFlag();
            localStyleFlag.setAll(true);
            localRange.applyStyle(paramCell.getStyle(), localStyleFlag);
          }
        }
      }
      paramCell.putValue(paramObject);
    }
  }
  
  void M()
    throws Exception
  {
    if ("".equals(this.W)) {
      return;
    }
    Cell localCell = o();
    if (localCell == null) {
      return;
    }
    String str1 = null;
    String str2 = null;
    if (" ".equals(this.W))
    {
      str2 = this.W;
    }
    else if ((this.W.endsWith(" ")) && (this.Q))
    {
      str2 = this.W;
      this.Q = false;
    }
    else
    {
      str1 = com.aspose.cells.b.a.zw.c(this.W, b);
      if (this.W.startsWith(" ")) {
        str1 = " " + str1;
      }
      if (this.W.endsWith(" ")) {
        str1 = str1 + " ";
      }
      str2 = str1;
    }
    localCell.putValue(m(str2));
    this.W = "";
    e(localCell);
  }
  
  void q(HashMap paramHashMap)
  {
    if (this.s == null) {
      S();
    }
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if (paramHashMap.get("class") != null)
    {
      localObject1 = (String)paramHashMap.get("class");
      if (this.g.get(localObject1) == null) {
        return;
      }
      localObject2 = this.d.C().a(((Integer)this.g.get(localObject1)).intValue());
      localObject3 = new Font(this.d, null, false);
      ((Font)localObject3).a(((Style)localObject2).getFont(), null);
      if (this.N)
      {
        ((Font)localObject3).setStrikeout(true);
        this.N = false;
      }
      if (paramHashMap.get("sup") != null) {
        ((Font)localObject3).setSuperscript(true);
      }
      if (paramHashMap.get("sub") != null) {
        ((Font)localObject3).setSubscript(true);
      }
      if (paramHashMap.get("s") != null) {
        ((Font)localObject3).setStrikeout(true);
      }
      if (this.s.c() > 0)
      {
        this.s.a((Font)localObject3);
        zf.a(this.r, this.s);
      }
    }
    if (paramHashMap.get("style") != null)
    {
      localObject1 = new Style(this.d);
      localObject2 = (String)paramHashMap.get("style");
      localObject3 = com.aspose.cells.b.a.zw.d((String)localObject2, ';');
      double d1 = -1.0D;
      for (int i1 = 0; i1 < localObject3.length; i1++)
      {
        Object localObject4 = localObject3[i1];
        if ((null != localObject4) && (!"".equals(localObject4)))
        {
          String[] arrayOfString = com.aspose.cells.b.a.zw.d((String)localObject4, ':');
          String str1 = arrayOfString[0].trim();
          String str2 = arrayOfString[1].trim().toLowerCase();
          switch (ac.a(str1.toLowerCase()))
          {
          case 5: 
            ((Style)localObject1).getFont().setColor(zafz.g(str2));
            break;
          case 8: 
            zagc.a(str2, ((Style)localObject1).getFont());
            break;
          case 7: 
            if ((str2.endsWith("pt")) || (str2.endsWith("px")) || (str2.endsWith("in")))
            {
              double d2 = zbxp.a(str2, "pt", zbxp.a());
              if ((d2 > 0.0D) && (d2 < 1.0D)) {
                d2 = 1.0D;
              }
              d1 = d2;
            }
            else if (str2.endsWith("%"))
            {
              str2 = str2.substring(0, 0 + (str2.length() - 1));
              d1 *= com.aspose.cells.a.c.zp.a(str2) / 100.0D;
            }
            else if (str2.endsWith("em"))
            {
              str2 = str2.substring(0, 0 + (str2.length() - 2));
              d1 *= com.aspose.cells.a.c.zp.a(str2);
            }
            else if (zagc.c(str2))
            {
              d1 *= zagc.d(str2);
            }
            else if (zagc.a(str2))
            {
              d1 = zagc.b(str2);
            }
            else
            {
              if (str2.indexOf("!important") != -1) {
                str2 = str2.substring(0, 0 + (str2.indexOf("!") - 1)).trim();
              }
              d1 = zbxp.a(str2, "pt", zbxp.a());
            }
            break;
          case 4: 
            if ("bold".equals(str2.toLowerCase())) {
              this.S.getFont().setBold(true);
            }
            break;
          case 45: 
            break;
          case 35: 
            if ("underline".equals(str2)) {
              this.S.getFont().setUnderline(zafz.f(str2));
            } else if ("line-through".equals(str2)) {
              this.S.getFont().setStrikeout(true);
            }
            break;
          case 16: 
            if ("super".equals(str2)) {
              ((Style)localObject1).getFont().setSuperscript(true);
            }
            if ("sub".equals(str2)) {
              ((Style)localObject1).getFont().setSubscript(true);
            }
            break;
          }
        }
      }
      if ((!((Style)localObject1).getFont().isSubscript()) && (!((Style)localObject1).getFont().isSuperscript()) && (d1 > -1.0D)) {
        ((Style)localObject1).getFont().setDoubleSize(d1);
      }
      if (this.s.c() > 0)
      {
        this.s.a(((Style)localObject1).getFont());
        zf.a(this.r, this.s);
      }
    }
    if (this.s.c() == 0)
    {
      localObject1 = o();
      if (localObject1 == null) {
        return;
      }
      localObject2 = paramHashMap.get("size");
      localObject3 = paramHashMap.get("color");
      if ((null != localObject2) || (null != localObject3))
      {
        Style localStyle = ((Cell)localObject1).getStyle();
        if (null != localObject2) {
          zagc.a(localStyle.getFont(), ((String)localObject2).trim().toLowerCase());
        }
        if (null != localObject3) {
          localStyle.getFont().setColor(zafz.g((String)localObject3));
        }
        ((Cell)localObject1).a(localStyle);
      }
    }
    else
    {
      localObject1 = paramHashMap.get("color");
      if (localObject1 != null) {
        this.s.a().setColor(zafz.g((String)localObject1));
      }
    }
  }
  
  void N()
  {
    Cell localCell = o();
    if (localCell == null) {
      return;
    }
    Style localStyle = localCell.getStyle();
    localStyle.getFont().setSuperscript(true);
    localCell.a(localStyle);
  }
  
  void O()
  {
    Cell localCell = o();
    if (localCell == null) {
      return;
    }
    Style localStyle = localCell.getStyle();
    localStyle.getFont().setSubscript(true);
    localCell.a(localStyle);
  }
  
  void P()
  {
    Cell localCell = o();
    if (localCell == null) {
      return;
    }
    Style localStyle = localCell.getStyle();
    localStyle.getFont().setUnderline(1);
    localCell.a(localStyle);
  }
  
  void r(HashMap paramHashMap)
  {
    Cell localCell = o();
    if (localCell == null) {
      return;
    }
    Style localStyle = new Style();
    localStyle.copy(localCell.getStyle());
    localStyle.getFont().setBold(true);
    if (paramHashMap.get("style") != null)
    {
      zagi localzagi = new zagi();
      localzagi.b((String)paramHashMap.get("style"));
      ArrayList localArrayList = localzagi.e();
      Iterator localIterator = localArrayList.iterator();
      while (localIterator.hasNext())
      {
        zafw localzafw = (zafw)localIterator.next();
        switch (ac.a(localzafw.a().toLowerCase()))
        {
        case 7: 
          zagc.a(localStyle.getFont(), localzafw.b().trim().toLowerCase());
          break;
        case 8: 
          zagc.a(localzafw.b(), localStyle.getFont());
          break;
        case 5: 
          localStyle.getFont().setColor(zafz.g(localzafw.b()));
        }
      }
    }
    this.R = true;
    this.S = localStyle;
  }
  
  void Q()
  {
    Cell localCell = o();
    if (localCell == null) {
      return;
    }
    Style localStyle = new Style();
    localStyle.copy(localCell.getStyle());
    localStyle.getFont().setItalic(true);
    this.R = true;
    this.S = localStyle;
  }
  
  void R()
  {
    Cell localCell = o();
    if (localCell == null) {
      return;
    }
    Style localStyle = localCell.getStyle();
    localStyle.getFont().setStrikeout(true);
    localCell.a(localStyle);
  }
  
  void c(boolean paramBoolean)
  {
    this.L = paramBoolean;
  }
  
  void d(boolean paramBoolean)
  {
    this.M = paramBoolean;
  }
  
  void e(boolean paramBoolean)
  {
    this.O = paramBoolean;
  }
  
  void f(boolean paramBoolean)
  {
    this.J = paramBoolean;
  }
  
  void g(boolean paramBoolean)
  {
    this.K = paramBoolean;
  }
  
  void S()
  {
    this.s = new zagm();
  }
  
  private String m(String paramString)
  {
    if (paramString.indexOf("&") > -1) {
      paramString = zafa.a(paramString);
    }
    return paramString;
  }
  
  void e(String paramString)
  {
    BuiltInDocumentPropertyCollection localBuiltInDocumentPropertyCollection = this.d.getBuiltInDocumentProperties();
    try
    {
      localBuiltInDocumentPropertyCollection.setTitle(paramString);
    }
    catch (Exception localException) {}
  }
  
  private void a(Object paramObject, Cell paramCell) {}
  
  void T()
  {
    if ((this.A > 0) && (this.z == 0))
    {
      this.x += this.A - 1;
      this.A = 0;
    }
  }
  
  private void am()
  {
    if (this.o.size() > this.q)
    {
      zagg localzagg = new zagg();
      Collections.sort(this.o, localzagg);
      this.q = this.o.size();
    }
    for (int i1 = 0; i1 < this.o.size(); i1++)
    {
      CellArea localCellArea = (CellArea)this.o.get(i1);
      if ((this.w >= localCellArea.StartRow) && (this.w <= localCellArea.EndRow)) {
        if (this.x == localCellArea.StartColumn)
        {
          if (localCellArea.StartRow == localCellArea.EndRow)
          {
            this.o.remove(i1);
            b(localCellArea);
          }
          else
          {
            this.x += localCellArea.EndColumn - localCellArea.StartColumn + 1;
          }
        }
        else if ((this.x >= localCellArea.StartColumn) && (this.x <= localCellArea.EndColumn)) {
          this.x += localCellArea.EndColumn - localCellArea.StartColumn;
        }
      }
    }
  }
  
  private void b(CellArea paramCellArea)
  {
    int i1 = this.f.o().getCount();
    for (int i2 = 0; i2 < i1; i2++)
    {
      CellArea localCellArea = this.f.o().a(i2);
      if (paramCellArea.a(localCellArea))
      {
        this.f.o().a(paramCellArea.StartRow, paramCellArea.StartColumn, paramCellArea.EndRow - paramCellArea.StartRow + 1, paramCellArea.EndColumn - paramCellArea.StartColumn + 1);
        c(paramCellArea);
        break;
      }
    }
  }
  
  private void c(CellArea paramCellArea)
  {
    Cell localCell = null;
    Style localStyle = null;
    for (int i1 = paramCellArea.StartRow; i1 <= paramCellArea.EndRow; i1++) {
      for (int i2 = paramCellArea.StartColumn; i2 <= paramCellArea.EndColumn; i2++)
      {
        localCell = this.f.get(i1, i2);
        localStyle = localCell.getStyle();
        if (i2 < paramCellArea.EndColumn) {
          localStyle.getBorders().getByBorderType(2).setLineStyle(0);
        }
        if (i2 > paramCellArea.StartColumn) {
          localStyle.getBorders().getByBorderType(1).setLineStyle(0);
        }
        if (i1 < paramCellArea.EndRow) {
          localStyle.getBorders().getByBorderType(8).setLineStyle(0);
        }
        if (i1 > paramCellArea.StartRow) {
          localStyle.getBorders().getByBorderType(4).setLineStyle(0);
        }
        localCell.setStyle(localStyle);
      }
    }
  }
  
  private void a(Object paramObject, Cell paramCell, HashMap paramHashMap)
  {
    if (paramObject != null)
    {
      String str1 = (String)paramObject;
      str1 = m(str1);
      this.I = true;
      String str2 = (String)paramHashMap.get("x:arrayrange");
      try
      {
        if (str2 != null) {
          a(str2, str1, paramCell);
        } else {
          paramCell.setFormula(str1);
        }
      }
      catch (Exception localException) {}
    }
    else
    {
      this.I = paramCell.g();
    }
  }
  
  private void a(String paramString1, String paramString2, Cell paramCell)
  {
    String[] arrayOfString = com.aspose.cells.b.a.zw.d(paramString1, ':');
    if (arrayOfString.length > 1)
    {
      int i1 = zagh.a(arrayOfString[1]) - zagh.a(arrayOfString[0]) + 1;
      int i2 = zagh.b(arrayOfString[1]) - zagh.b(arrayOfString[0]) + 1;
      paramCell.a(m(paramString2), i1, i2);
    }
    else
    {
      paramCell.a(m(paramString2), 1, 1);
    }
  }
  
  private void b(Object paramObject, Cell paramCell)
  {
    if (null == paramObject) {
      return;
    }
    String str = (String)paramObject;
    if (str.length() == 0) {
      return;
    }
    if (zafz.a(str) == zafz.a)
    {
      if (this.I) {
        paramCell.a(Double.valueOf(zagn.i(str)), (byte)2);
      } else {
        paramCell.putValue(zagn.i(str));
      }
    }
    else if (this.I) {
      paramCell.a(Integer.valueOf(zauj.F(str)), (byte)2);
    } else {
      paramCell.putValue(zauj.F(str));
    }
  }
  
  void U()
  {
    zc localzc = zg.a(this.T);
    while (localzc.c()) {
      this.f.setColumnWidthPixel(((Integer)localzc.a()).intValue(), ((Integer)localzc.b()).intValue());
    }
    this.T.clear();
  }
  
  void V()
  {
    this.x = -1;
    this.w = -1;
    this.y = 0;
    Z();
    this.r.clear();
    this.T.clear();
  }
  
  void W()
  {
    this.r.clear();
    this.s.b(0);
  }
  
  int X()
  {
    return this.r.size();
  }
  
  void Y()
  {
    Cell localCell = o();
    if (localCell == null) {
      return;
    }
    if (localCell.getType() != 5)
    {
      if ((this.r.size() == 1) && (this.S != null))
      {
        Style localStyle = new Style();
        localStyle.copy(localCell.getStyle());
        a(localStyle, this.S);
        localCell.a(localStyle);
      }
      return;
    }
    int i1 = this.r.size();
    Object localObject;
    if ((i1 == 1) && ((localCell.getStringValue().length() == ((zagm)this.r.get(0)).c()) || ((a().g()) && (localCell.getStringValue().length() - a().h() == ((zagm)this.r.get(0)).c()))))
    {
      Font localFont = ((zagm)this.r.get(0)).a();
      localObject = localCell.getStyle();
      if ((localFont.isBold()) && (!((Style)localObject).getFont().isBold())) {
        ((Style)localObject).getFont().setBold(true);
      }
      if (!localFont.getColor().equals(Color.fromArgb(255, 0, 0, 0))) {
        ((Style)localObject).getFont().setColor(localFont.getColor());
      }
      localCell.a((Style)localObject);
      return;
    }
    if (i1 == 1)
    {
      i2 = localCell.getWorksheet().getHyperlinks().getCount();
      if (i2 > 0)
      {
        localObject = localCell.getWorksheet().getHyperlinks().get(i2 - 1).getArea();
        int i3 = 0;
        int i4 = 0;
        int[] arrayOfInt1 = { i3 };
        int[] arrayOfInt2 = { i4 };
        CellsHelper.a(localCell.getName(), arrayOfInt1, arrayOfInt2);
        i3 = arrayOfInt1[0];
        i4 = arrayOfInt2[0];
        if ((((CellArea)localObject).StartRow == i3) && (((CellArea)localObject).EndRow == i3) && (((CellArea)localObject).StartColumn == i4) && (((CellArea)localObject).EndColumn == i4)) {
          return;
        }
      }
    }
    for (int i2 = 0; i2 < i1; i2++)
    {
      localObject = (zagm)this.r.get(i2);
      if ((((zagm)localObject).c() != this.W.length()) || (localCell.getType() != 4))
      {
        FontSetting localFontSetting = localCell.characters(((zagm)localObject).b(), ((zagm)localObject).c());
        localFontSetting.a(((zagm)localObject).a());
      }
    }
  }
  
  void Z()
  {
    this.o.clear();
  }
  
  void h(boolean paramBoolean)
  {
    this.E = paramBoolean;
  }
  
  Worksheet aa()
  {
    return this.e;
  }
  
  void a(Worksheet paramWorksheet)
  {
    this.e = paramWorksheet;
    this.f = this.e.getCells();
  }
  
  Cells ab()
  {
    return this.f;
  }
  
  void a(Cells paramCells)
  {
    this.f = paramCells;
  }
  
  WorksheetCollection ac()
  {
    return this.d;
  }
  
  Workbook ad()
  {
    return this.c;
  }
  
  HashMap ae()
  {
    return this.h;
  }
  
  HashMap af()
  {
    return this.g;
  }
  
  void s(HashMap paramHashMap)
  {
    this.g = paramHashMap;
  }
  
  void d(int paramInt)
  {
    this.D = paramInt;
  }
  
  void t(HashMap paramHashMap)
  {
    this.i = paramHashMap;
  }
  
  HTMLLoadOptions ag()
  {
    return this.v;
  }
  
  void a(HTMLLoadOptions paramHTMLLoadOptions)
  {
    this.v = paramHTMLLoadOptions;
    if (this.v.getConvertFormulasData()) {
      this.ab = new com.aspose.cells.b.a.g.a.ze("^\\=\\S+\\(\\S+\\)$");
    }
  }
  
  void u(HashMap paramHashMap)
  {
    Object localObject = paramHashMap.get("class");
    if (localObject == null) {
      localObject = paramHashMap.get("CLASS");
    }
    int i1 = 15;
    if ((localObject != null) && (this.g.containsKey((String)localObject))) {
      i1 = ((Integer)this.g.get((String)localObject)).intValue();
    }
    Style localStyle1 = null;
    if (i1 != 15) {
      localStyle1 = ac().C().a(i1);
    }
    Cell localCell = o();
    if ((localCell == null) || (localStyle1 == null)) {
      return;
    }
    Style localStyle2;
    if (localCell.s() == 15)
    {
      localCell.b(i1);
    }
    else
    {
      localStyle2 = new Style();
      localStyle2.copy(localCell.getStyle());
      a(localStyle2, localStyle1);
      localCell.a(localStyle2);
    }
    localStyle1 = localCell.getStyle();
    if (this.l != null)
    {
      localStyle2 = new Style();
      localStyle2.copy(this.l);
      a(localStyle2, localStyle1);
      localCell.a(localStyle2);
    }
    this.R = true;
    this.S = localCell.getStyle();
    if (a().e()) {
      this.S.getFont().setBold(true);
    }
  }
  
  void ah()
  {
    if (this.f == null) {
      this.f = ac().get(0).getCells();
    }
    if ((this.f != null) && (this.w != -1)) {
      this.f.merge(this.w, 0, 1, 18);
    }
  }
  
  void ai()
    throws Exception
  {
    if (!this.v.getAutoFitColsAndRows()) {
      return;
    }
    if (aa() != null)
    {
      aa().autoFitColumns();
      ColumnCollection localColumnCollection = aa().getCells().getColumns();
      int i1 = localColumnCollection.getCount();
      Column localColumn = null;
      for (int i2 = 0; i2 < i1; i2++)
      {
        localColumn = localColumnCollection.get(i2);
        if (localColumn.a() > 256) {
          localColumn.b(256);
        }
      }
    }
  }
  
  private int c(Cell paramCell)
    throws Exception
  {
    int i1 = 0;
    String[] arrayOfString = com.aspose.cells.b.a.zw.d(paramCell.getStringValue(), new char[] { '\r' });
    int i2 = arrayOfString.length;
    int i3 = 1280;
    for (int i4 = 0; i4 < i2; i4++)
    {
      int i5 = this.aa.a(paramCell.getStyle(), arrayOfString[i4]);
      if (i5 <= i3) {
        i1++;
      } else {
        i1 += i5 / i3 + (i5 % i3 > 0 ? 1 : 0);
      }
    }
    return i1;
  }
  
  private boolean d(Cell paramCell)
  {
    zapd localzapd = ab().o();
    int i1 = localzapd.getCount();
    for (int i2 = 0; i2 < i1; i2++)
    {
      CellArea localCellArea = localzapd.a(i2);
      if ((localCellArea.StartRow == paramCell.getRow()) && (localCellArea.StartColumn == paramCell.getColumn())) {
        return true;
      }
    }
    return false;
  }
  
  private void e(Cell paramCell)
    throws Exception
  {
    if ((!this.v.getAutoFitColsAndRows()) || (!paramCell.getStyle().isTextWrapped()))
    {
      int i2;
      if ((this.v.getAutoFitColsAndRows()) && (!a().q()) && (a().f()))
      {
        Style localStyle1 = paramCell.getStyle();
        localStyle1.setTextWrapped(true);
        paramCell.a(localStyle1);
        Row localRow = paramCell.b;
        localRow.setHeight(localRow.getHeight() * c(paramCell));
        i2 = 0;
        int i3 = 0;
        int[] arrayOfInt1 = { i2 };
        int[] arrayOfInt2 = { i3 };
        CellsHelper.a(paramCell.getName(), arrayOfInt1, arrayOfInt2);
        i2 = arrayOfInt1[0];
        i3 = arrayOfInt2[0];
        paramCell.d.merge(i2, i3, 1, 20);
      }
      else if (this.v.getAutoFitColsAndRows())
      {
        boolean bool = d(paramCell);
        int i1 = 0;
        if (!bool)
        {
          i2 = this.aa.a(paramCell.getStyle(), paramCell.getStringValue());
          if (i2 > 256)
          {
            i2 = 256;
            i1 = (a().q()) && (a().a()) ? 1 : 0;
          }
          aa().getCells().getColumns().get(paramCell.getColumn()).b(i2);
        }
        if ((bool) || (i1 != 0))
        {
          f(paramCell);
          Style localStyle2 = paramCell.getStyle();
          localStyle2.setTextWrapped(true);
          paramCell.a(localStyle2);
        }
      }
      return;
    }
    f(paramCell);
  }
  
  private void f(Cell paramCell)
    throws Exception
  {
    int i1 = this.aa.a(paramCell.getStyle(), paramCell.getStringValue());
    if (i1 < 256) {
      return;
    }
    Row localRow = paramCell.b;
    double d1 = localRow.getHeight();
    int i2 = g(paramCell);
    int i3 = i1 / i2 + (i1 % i2 > 1 ? 1 : 0);
    if (paramCell.getStringValue().indexOf("\r\n") != -1)
    {
      String[] arrayOfString = com.aspose.cells.b.a.zw.d(paramCell.getStringValue(), '\n');
      int i4 = arrayOfString.length;
      int i5 = 0;
      int i6 = 0;
      for (int i7 = 0; i7 < i4; i7++)
      {
        i6 = this.aa.a(paramCell.getStyle(), arrayOfString[i7]);
        i5 += i6 / i2 + (i6 % i2 > 1 ? 1 : 0);
      }
      i3 = Math.max(i3, i5);
    }
    double d2 = 15 * i3;
    if (d2 > d1) {
      localRow.setHeight(d2);
    }
  }
  
  private int g(Cell paramCell)
  {
    zapd localzapd = ab().o();
    int i1 = localzapd.getCount();
    for (int i2 = 0; i2 < i1; i2++)
    {
      CellArea localCellArea = localzapd.a(i2);
      if ((localCellArea.StartRow == paramCell.getRow()) && (localCellArea.StartColumn == paramCell.getColumn()))
      {
        int i3 = 0;
        for (int i4 = localCellArea.StartColumn; i4 <= localCellArea.EndColumn; i4++) {
          i3 += e(i4);
        }
        return i3;
      }
    }
    return 256;
  }
  
  private int e(int paramInt)
  {
    if (paramInt < this.T.size()) {
      return Math.max(ab().getColumns().get(paramInt).a(), ((Integer)this.T.get(Integer.valueOf(paramInt))).intValue());
    }
    return ab().getColumns().get(paramInt).a();
  }
  
  void a(HashMap paramHashMap, int paramInt)
  {
    if ((paramInt > -1) && (paramHashMap != null) && (paramHashMap.get(Integer.valueOf(8)) != null) && (this.x >= 0) && (this.w >= 0))
    {
      Cell localCell = null;
      for (int i1 = 0; i1 <= this.x; i1++)
      {
        localCell = a(this.w, i1);
        Border localBorder = (Border)paramHashMap.get(Integer.valueOf(8));
        Style localStyle = localCell.getStyle();
        localStyle.getBorders().getByBorderType(8).setLineStyle(localBorder.getLineStyle());
        localStyle.getBorders().getByBorderType(8).setColor(localBorder.getColor());
        localCell.a(localStyle);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zagd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */