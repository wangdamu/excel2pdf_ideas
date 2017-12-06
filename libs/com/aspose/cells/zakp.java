package com.aspose.cells;

import com.aspose.cells.a.c.zu;
import com.aspose.cells.a.f.zh;
import com.aspose.cells.a.f.zi;
import com.aspose.cells.b.a.a.zc;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.a.zg;
import com.aspose.cells.b.a.d.zk;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zq;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zakp
{
  private zcjy c = null;
  private HashMap d = null;
  private boolean e = false;
  private ArrayList f;
  private int g;
  private zqi h = null;
  private Chart i = null;
  private zi j = null;
  private Workbook k = null;
  private ArrayList l = new ArrayList();
  ArrayList a = new ArrayList();
  ShapeCollection b = null;
  private String m = null;
  private zakl n;
  private boolean o;
  private boolean p;
  private static final com.aspose.cells.b.c.a.za q = new com.aspose.cells.b.c.a.za(new String[] { "http://schemas.openxmlformats.org/officeDocument/2006/relationships/themeOverride", "http://schemas.microsoft.com/office/2011/relationships/chartStyle", "http://schemas.microsoft.com/office/2011/relationships/chartColorStyle", "l", "b", "r", "t", "clrChange", "lum", "grayscl", "grpSpPr", "cxnSp", "graphicFrame", "grpSp", "pic", "sp", "style", "spPr", "txBody", "txXfrm", "absoluteAnchor", "oneCellAnchor", "freeFloating", "relSizeAnchor", "twoCellAnchor", "absSizeAnchor", "from", "to", "ext", "pos", "nvPicPr", "nvGrpSpPr", "nvGraphicFramePr", "nvSpPr", "nvCxnSpPr", "blipFill", "xfrm", "graphic", "prstGeom", "custGeom", "clientData", "cNvPr", "cNvSpPr", "cNvCxnSpPr", "cNvGrpSpPr", "cNvPicPr", "cNvGraphicFramePr", "cameraTool", "compatExt", "cellRange", "spid", "embed", "link", "compatSp", "chart", "slicer", "timeslicer", "relIds", "off", "chOff", "chExt", "anchor", "flipV", "flipH", "rot", "fPublished", "macro", "textlink", "fLocksText", "id", "descr", "name", "title", "hidden", "hlinkClick", "hlinkHover", "cxnSpLocks", "graphicFrameLocks", "grpSpLocks", "picLocks", "spLocks", "stCxn", "endCxn", "extLst", "noAdjustHandles", "noChangeArrowheads", "noChangeAspect", "noChangeShapeType", "noEditPoints", "noGrp", "noMove", "noResize", "noRot", "noSelect", "noTextEdit", "noCrop", "idx", "fPrintsWithSheet", "fLocksWithSheet", "tooltip" });
  
  zakp(zqi paramzqi, HashMap paramHashMap, zi paramzi, String paramString)
    throws Exception
  {
    this.d = paramHashMap;
    this.e = false;
    this.h = paramzqi;
    this.b = this.h.d.getShapes();
    this.j = paramzi;
    this.k = paramzqi.d.d();
    this.g = zbxp.a();
    this.f = new ArrayList();
    this.c = zauy.a(this.j, paramString, true);
    this.m = zw.a(zu.d(paramString), "\\", "/");
  }
  
  zakp(zqi paramzqi, Chart paramChart, HashMap paramHashMap, zi paramzi, String paramString)
    throws Exception
  {
    this.h = paramzqi;
    this.d = paramHashMap;
    this.e = true;
    this.i = paramChart;
    this.b = this.i.getShapes();
    this.j = paramzi;
    this.k = paramChart.n().p();
    this.g = zbxp.a();
    this.f = new ArrayList();
    this.c = zauy.a(this.j, paramString, true);
  }
  
  void a(boolean paramBoolean)
    throws Exception
  {
    int i1 = 0;
    this.c.k();
    if (!this.c.d())
    {
      this.c.c();
      return;
    }
    zsv localzsv = new zsv();
    while (this.c.s() != 4) {
      if (this.c.s() != 1)
      {
        this.c.a();
      }
      else
      {
        zcjs localzcjs = this.c.a(localzsv, false);
        if ((localzcjs instanceof zcjn)) {
          a((zcjn)localzcjs, i1, paramBoolean);
        }
        i1++;
        localzcjs.h();
      }
    }
    this.c.h();
    this.c.c();
    b();
  }
  
  private void a(zqf paramzqf, String paramString)
    throws Exception
  {
    OleObject localOleObject = paramzqf.n;
    byte[] arrayOfByte = null;
    String str = null;
    Object localObject1;
    Object localObject2;
    if (paramString != null)
    {
      str = "xl" + paramString.substring(2);
      localObject1 = this.j.a(str);
      localObject2 = this.j.a((zh)localObject1);
      arrayOfByte = new byte[(int)((zh)localObject1).a()];
      ((zm)localObject2).a(arrayOfByte, 0, (int)((zh)localObject1).a());
      ((zm)localObject2).a();
      int i1 = this.k.getWorksheets().L().a(arrayOfByte);
      localOleObject.a(i1);
    }
    if (paramzqf.c != null)
    {
      localObject1 = paramzqf.c;
      localObject1 = "xl" + ((String)localObject1).substring(2);
      localObject2 = zalq.a(this.j, (String)localObject1);
      localOleObject.a((byte[])localObject2);
      if (!localOleObject.k()) {
        localOleObject.b(zk.b((String)localObject1));
      }
    }
    if (paramzqf.h != null)
    {
      localOleObject.c(paramzqf.h);
      localOleObject.setAutoUpdate(paramzqf.i);
    }
    else if (paramzqf.m != null)
    {
      localOleObject.b(paramzqf.m);
    }
    if (paramzqf.g != null) {
      localOleObject.setProgID(paramzqf.g);
    }
    localOleObject.setDisplayAsIcon(paramzqf.j);
    localOleObject.setAutoLoad(paramzqf.k);
  }
  
  private void b()
    throws Exception
  {
    for (int i1 = 0; i1 < this.l.size(); i1++)
    {
      zqg localzqg = (zqg)this.l.get(i1);
      if (localzqg.Q.getMsoDrawingType() == 5) {
        a(localzqg.J, ((ChartShape)localzqg.Q).a(), localzqg.a);
      } else if (localzqg.Q.getMsoDrawingType() == 24) {
        a((zqf)localzqg.p, ((zqf)localzqg.p).d);
      }
    }
    if (this.a.size() > 0)
    {
      HashMap localHashMap = new HashMap();
      for (int i2 = 0; i2 < this.b.getCount(); i2++) {
        localHashMap.put(Integer.valueOf(this.b.get(i2).O()), Integer.valueOf(i2));
      }
      Iterator localIterator = this.a.iterator();
      while (localIterator.hasNext())
      {
        znn localznn = (znn)localIterator.next();
        Object localObject;
        if (localznn.a != -1)
        {
          localObject = localHashMap.get(Integer.valueOf(localznn.a));
          if (localObject == null) {
            localznn.a = -1;
          } else {
            localznn.a = ((Integer)localObject).intValue();
          }
        }
        if (localznn.c != -1)
        {
          localObject = localHashMap.get(Integer.valueOf(localznn.c));
          if (localObject == null) {
            localznn.c = -1;
          } else {
            localznn.c = ((Integer)localObject).intValue();
          }
        }
      }
    }
  }
  
  void a(GroupShape paramGroupShape, Shape[] paramArrayOfShape)
  {
    for (int i1 = 0; i1 < paramArrayOfShape.length; i1++) {
      paramArrayOfShape[i1].R().j().b(true);
    }
    i1 = paramGroupShape.a().a;
    int i2 = paramGroupShape.a().c;
    int i3 = paramGroupShape.a().b;
    int i4 = paramGroupShape.a().d;
    for (int i5 = 0; i5 < paramArrayOfShape.length; i5++)
    {
      int[] arrayOfInt = paramArrayOfShape[i5].K();
      paramArrayOfShape[i5].a(0, false, (int)((arrayOfInt[0] - i1) * 4000.0F / i3 + 0.5D), (int)((arrayOfInt[1] - i2) * 4000.0F / i4 + 0.5D), (int)(arrayOfInt[2] * 4000.0F / i3 + 0.5D), (int)(arrayOfInt[3] * 4000.0F / i4 + 0.5D));
      paramGroupShape.a(paramArrayOfShape[i5]);
    }
  }
  
  Shape a(Shape paramShape, zakl paramzakl)
    throws Exception
  {
    this.n = paramzakl;
    GroupShape localGroupShape = (GroupShape)this.b.a(0, 4095);
    localGroupShape.p = new zsw(localGroupShape);
    localGroupShape.R().a(paramShape.R().i());
    localGroupShape.a().a = ((int)(paramShape.getLeftToCorner() / zbxp.a() * 72.0D * znq.j));
    localGroupShape.a().c = ((int)(paramShape.getTopToCorner() / zbxp.a() * 72.0D * znq.j));
    localGroupShape.a().b = ((int)(paramShape.getWidth() / zbxp.a() * 72.0D * znq.j));
    localGroupShape.a().d = ((int)(paramShape.getHeight() / zbxp.a() * 72.0D * znq.j));
    ArrayList localArrayList = new ArrayList();
    int i1 = 0;
    this.c.k();
    zsv localzsv = new zsv();
    this.c.d();
    this.c.d();
    Object localObject1;
    Object localObject2;
    while (this.c.s() != 4) {
      if (this.c.s() != 1)
      {
        this.c.a();
      }
      else
      {
        zcjs localzcjs = this.c.a(localzsv, false);
        localObject1 = (zcjn)localzcjs;
        String str = ((zcjn)localObject1).g;
        if ("nvGrpSpPr".equals(str))
        {
          localzcjs.h();
        }
        else if ("grpSpPr".equals(str))
        {
          localzcjs.h();
        }
        else
        {
          localObject2 = a((zcjn)localObject1, i1++, true);
          localzcjs.h();
          if (((zqg)localObject2).Q != null) {
            zf.a(localArrayList, ((zqg)localObject2).Q);
          }
        }
      }
    }
    int i2 = localArrayList.size();
    if (i2 > 0)
    {
      localObject1 = new Shape[i2];
      int i3 = 0;
      localObject2 = localArrayList.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        Object localObject3 = ((Iterator)localObject2).next();
        localObject1[(i3++)] = ((Shape)localObject3);
        Shape localShape = (Shape)localObject3;
      }
      this.b.a(localGroupShape, (Shape[])localObject1);
    }
    b();
    return localGroupShape;
  }
  
  private void a(zcjn paramzcjn, zqg paramzqg)
    throws Exception
  {
    String str = zauj.a(paramzcjn, "rot");
    if ((str != null) && (str.length() > 0)) {
      paramzqg.Q.getTextBody().getTextAlignment().c = ((int)zauj.C(str));
    }
  }
  
  private void b(zcjn paramzcjn, zqg paramzqg)
    throws Exception
  {
    if (paramzqg.Q.p == null) {
      paramzqg.Q.p = new zsw(paramzqg.Q);
    }
    zsw localzsw = paramzqg.Q.p;
    zcju localzcju = paramzcjn.l();
    for (int i1 = 0; i1 < localzcju.a(); i1++) {
      if ((localzcju.a(i1) instanceof zcjn))
      {
        zcjn localzcjn = (zcjn)localzcju.a(i1);
        String str = localzcjn.g;
        zcjy localzcjy;
        Object localObject;
        if ("lnRef".equals(str))
        {
          localzcjy = a(localzcjn);
          localzsw.a.a = localzcjy.a("idx");
          localObject = zakf.a(localzcjy);
          localzsw.a.b = ((zaml)localObject);
        }
        else if ("fillRef".equals(str))
        {
          localzcjy = a(localzcjn);
          localzsw.d.a = localzcjy.a("idx");
          if (!localzcjy.o())
          {
            localObject = zakf.a(localzcjy);
            localzsw.d.b = ((zaml)localObject);
          }
        }
        else if ("fontRef".equals(str))
        {
          localzcjy = a(localzcjn);
          localObject = localzcjy.a("idx");
          localzsw.b.a = ((String)localObject);
          if (!localzcjy.o())
          {
            zaml localzaml = zakf.a(localzcjy);
            localzsw.b.b = localzaml;
          }
        }
        else if ("effectRef".equals(str))
        {
          localzcjy = a(localzcjn);
          localzsw.e.a = localzcjy.a("idx");
          if (!localzcjy.o()) {
            localzsw.e.b = zakf.a(localzcjy);
          }
        }
      }
    }
  }
  
  private void a(String paramString1, Chart paramChart, String paramString2)
    throws Exception
  {
    zrl localzrl1 = (zrl)this.d.get(paramString1);
    zcjy localzcjy = null;
    String str1 = null;
    if (localzrl1.d.startsWith("/")) {
      str1 = localzrl1.d.substring(1);
    } else {
      str1 = "xl/charts/" + zk.b(localzrl1.d);
    }
    String str2 = "xl/charts/";
    paramChart.a = new zqm();
    paramChart.a.c = str1;
    HashMap localHashMap = null;
    String str3 = "xl/charts/_rels/" + zk.b(str1) + ".rels";
    Object localObject1;
    if (this.j.a(str3, true) != -1)
    {
      localObject1 = zauy.a(this.j, str3, true);
      localHashMap = zalb.a((zcjy)localObject1, this.h.m, this.k, this.j, str2);
      ((zcjy)localObject1).c();
      Iterator localIterator = localHashMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str4 = (String)localIterator.next();
        zrl localzrl2 = (zrl)localHashMap.get(str4);
        Object localObject2;
        Object localObject3;
        Object localObject4;
        Object localObject5;
        Object localObject6;
        switch (q.a(localzrl2.c))
        {
        case 0: 
          String str5 = zauj.aH(localzrl2.d);
          paramChart.a.a = zalq.a(this.j, str5);
          if (this.j.a(str5, true) != -1)
          {
            localObject2 = this.j.a(str5);
            localObject3 = this.j.a((zh)localObject2);
            localObject4 = zauz.a((zm)localObject3, null, true);
            ((zm)localObject3).a();
            paramChart.a(new zrs(false));
            localObject5 = new zaln(paramChart);
            ((zaln)localObject5).a((zcjm)localObject4, true);
          }
          break;
        case 1: 
          localObject2 = zauj.a("xl/charts", localzrl2.d, false);
          paramChart.c = zalq.a(this.j, localObject2[0]);
          localObject2 = zauj.aH("charts/" + localzrl2.d);
          if (this.j.a((String)localObject2, true) != -1)
          {
            localObject3 = this.j.a((String)localObject2);
            localObject4 = this.j.a((zh)localObject3);
            localObject5 = zauz.a((zm)localObject4, null, false);
            ((zm)localObject4).a();
            localObject6 = new zake(paramChart, this.h, localHashMap);
            ((zake)localObject6).a((zcjm)localObject5, true);
          }
          break;
        case 2: 
          localObject3 = zauj.a("xl/charts", localzrl2.d, false);
          paramChart.d = zalq.a(this.j, localObject3[0]);
          localObject3 = zauj.aH("charts/" + localzrl2.d);
          if (this.j.a((String)localObject3, true) != -1)
          {
            localObject4 = this.j.a((String)localObject3);
            localObject5 = this.j.a((zh)localObject4);
            localObject6 = zauz.a((zm)localObject5, null, false);
            ((zm)localObject5).a();
            zakb localzakb = new zakb(paramChart);
            localzakb.a((zcjm)localObject6, true);
          }
          break;
        }
      }
    }
    if (("http://schemas.microsoft.com/office/2014/relationships/chartEx".equals(localzrl1.c)) || ("http://schemas.microsoft.com/office/drawing/2014/chartex".equals(paramString2)))
    {
      localObject1 = new zakc(this.h.m, this.h, paramChart, localHashMap);
      localzcjy = zauy.a(this.j, str1, true);
      ((zakc)localObject1).a(localzcjy);
      localzcjy.c();
      if ((paramChart.c == null) || (paramChart.d == null)) {
        paramChart.a("395.xml", "c_10.xml");
      }
    }
    else
    {
      localObject1 = new zaka(this.h.m, this.h, paramChart, localHashMap);
      localzcjy = zauy.a(this.j, str1, true);
      ((zaka)localObject1).a(localzcjy);
      localzcjy.c();
      localzcjy = zauy.a(this.j, str1, true);
      ((zaka)localObject1).b(localzcjy);
      localzcjy.c();
    }
    if (paramChart.a.b != null) {
      a(paramChart, str1);
    }
  }
  
  private void a(Chart paramChart, String paramString)
    throws Exception
  {
    String str1 = zk.b(paramString);
    String str2 = paramString.substring(0, 0 + (paramString.length() - str1.length()));
    String str3 = str2 + "_rels/" + str1 + ".rels";
    String str4 = str2.substring(0, 0 + (str2.length() - 1));
    zcjy localzcjy = zauy.a(this.j, str3, true);
    HashMap localHashMap1 = zalb.b(localzcjy);
    localzcjy.c();
    String str5 = paramChart.a.b;
    if ((localHashMap1 == null) || (localHashMap1.size() == 0)) {
      throw new CellsException(6, str3 + " does not exist or is empty");
    }
    if (!localHashMap1.containsKey(str5)) {
      throw new CellsException(6, str3 + " does not contains relId " + str5);
    }
    zrl localzrl = (zrl)localHashMap1.get(str5);
    String str6 = zauj.b(paramString, localzrl.d);
    String str7 = zk.b(str6);
    str2 = str6.substring(0, 0 + (str6.length() - str7.length()));
    String str8 = str2 + "_rels/" + zk.b(str6) + ".rels";
    paramChart.a.d = str6;
    HashMap localHashMap2 = null;
    if (this.j.a(str8, true) != -1)
    {
      localzcjy = zauy.a(this.j, str8, true);
      localHashMap2 = zalb.a(localzcjy, this.h.m, this.k, this.j, str4);
      localzcjy.c();
    }
    zakp localzakp = new zakp(this.h, paramChart, localHashMap2, this.j, str6);
    localzakp.a(false);
    if (localzakp.f.size() > 0) {
      paramChart.p().a(localzakp.f);
    }
    this.k.a.a(str6);
  }
  
  private void c(zcjn paramzcjn, zqg paramzqg)
    throws Exception
  {
    boolean bool = true;
    for (zcjs localzcjs = paramzcjn.m(); localzcjs != null; localzcjs = localzcjs.n()) {
      if (localzcjs.e == 1)
      {
        zcjn localzcjn = (zcjn)localzcjs;
        String str = localzcjn.g;
        if ("srcRect".equals(str)) {
          d(localzcjn, paramzqg);
        } else if ("blip".equals(str)) {
          e(localzcjn, paramzqg);
        } else if ("stretch".equals(str)) {
          bool = false;
        }
      }
    }
    if (bool) {
      paramzqg.Q.f(bool);
    }
  }
  
  private void d(zcjn paramzcjn, zqg paramzqg)
  {
    if (!paramzcjn.g()) {
      return;
    }
    MsoFormatPicture localMsoFormatPicture = paramzqg.Q.getFormatPicture();
    double d1 = 0.0D;
    Iterator localIterator = paramzcjn.e().iterator();
    while (localIterator.hasNext())
    {
      zcjg localzcjg = (zcjg)localIterator.next();
      String str = localzcjg.h;
      switch (q.a(localzcjg.g))
      {
      case 3: 
        d1 = zauj.C(str);
        localMsoFormatPicture.setLeftCrop(zbxp.k(d1));
        break;
      case 4: 
        d1 = zauj.C(str);
        localMsoFormatPicture.setBottomCrop(zbxp.k(d1));
        break;
      case 5: 
        d1 = zauj.C(str);
        localMsoFormatPicture.setRightCrop(zbxp.k(d1));
        break;
      case 6: 
        d1 = zauj.C(str);
        localMsoFormatPicture.setTopCrop(zbxp.k(d1));
      }
    }
  }
  
  private void e(zcjn paramzcjn, zqg paramzqg)
    throws Exception
  {
    for (zcjs localzcjs = paramzcjn.m(); localzcjs != null; localzcjs = localzcjs.n()) {
      if (localzcjs.e == 1)
      {
        zcjn localzcjn = (zcjn)localzcjs;
        switch (q.a(localzcjn.g))
        {
        case 7: 
          f(localzcjn, paramzqg);
          break;
        case 8: 
          String str = localzcjn.a("bright");
          if (!zw.b(str)) {
            paramzqg.Q.getFormatPicture().setBrightness(zauj.F(str) / znq.l * 100.0D);
          }
          str = localzcjn.a("contrast");
          if (!zw.b(str)) {
            paramzqg.Q.getFormatPicture().setContrast(zauj.F(str) / znq.l * 100.0D);
          }
          break;
        case 9: 
          paramzqg.Q.getFormatPicture().setGray(true);
          break;
        default: 
          if (paramzqg.Q.getFormatPicture().b == null) {
            paramzqg.Q.getFormatPicture().b = new ArrayList();
          }
          zf.a(paramzqg.Q.getFormatPicture().b, zauz.a(localzcjn, true));
        }
      }
    }
  }
  
  private void f(zcjn paramzcjn, zqg paramzqg)
    throws Exception
  {
    zle localzle = new zle();
    for (zcjs localzcjs = paramzcjn.m(); localzcjs != null; localzcjs = localzcjs.n()) {
      if (localzcjs.e == 1)
      {
        zcjn localzcjn = (zcjn)localzcjs;
        String str = localzcjn.g;
        zcjy localzcjy;
        if ("clrFrom".equals(str))
        {
          localzcjy = a(localzcjn);
          localzle.a = zakf.a(localzcjy);
        }
        else if ("clrTo".equals(str))
        {
          localzcjy = a(localzcjn);
          localzle.b = zakf.a(localzcjy);
        }
      }
    }
    if ((localzle.a != null) && (localzle.b != null)) {
      paramzqg.Q.getFormatPicture().a = localzle;
    }
  }
  
  private void g(zcjn paramzcjn, zqg paramzqg)
    throws Exception
  {
    LineFormat localLineFormat = paramzqg.Q.B().getLine();
    zcjy localzcjy = a(paramzcjn);
    zalf.a(localzcjy, localLineFormat);
  }
  
  private FillFormat a(zqg paramzqg)
  {
    Shape localShape = paramzqg.Q;
    return localShape.a(0, false);
  }
  
  private void h(zcjn paramzcjn, zqg paramzqg)
    throws Exception
  {
    boolean bool = false;
    zcju localzcju = paramzcjn.l();
    paramzqg.Q.A = paramzcjn.a("bwMode");
    for (Object localObject1 = paramzcjn.m(); localObject1 != null; localObject1 = ((zcjs)localObject1).n()) {
      if (((zcjs)localObject1).e == 1)
      {
        zcjn localzcjn = (zcjn)localObject1;
        String str = localzcjn.g;
        if ("custGeom".equals(str))
        {
          i(localzcjn, paramzqg);
        }
        else if ("prstGeom".equals(str))
        {
          j(localzcjn, paramzqg);
        }
        else
        {
          FillFormat localFillFormat;
          if ("noFill".equals(str))
          {
            localFillFormat = a(paramzqg);
            localFillFormat.setFillType(1);
            bool = true;
          }
          else
          {
            Object localObject2;
            if ("solidFill".equals(str))
            {
              if (!zauz.a(localzcjn))
              {
                localFillFormat = a(paramzqg);
                localObject2 = zakf.a(a(localzcjn));
                localFillFormat.setFillType(2);
                localFillFormat.getSolidFill().a = ((zaml)localObject2);
                bool = true;
              }
            }
            else if ("gradFill".equals(str))
            {
              localFillFormat = a(paramzqg);
              localFillFormat.setFillType(3);
              localObject2 = localFillFormat.getGradientFill();
              zakq localzakq = new zakq(this.h, this.d);
              localzakq.a(a(localzcjn), (GradientFill)localObject2);
              bool = true;
            }
            else if ("pattFill".equals(str))
            {
              localFillFormat = a(paramzqg);
              localObject2 = new zakq(this.h, this.d);
              ((zakq)localObject2).b(a(localzcjn), localFillFormat);
              bool = true;
            }
            else if ("blipFill".equals(str))
            {
              localFillFormat = a(paramzqg);
              localObject2 = new zakq(this.h, this.d);
              ((zakq)localObject2).a(a(localzcjn), localFillFormat);
              bool = true;
            }
            else if ("grpFill".equals(str))
            {
              localFillFormat = a(paramzqg);
              localFillFormat.setFillType(6);
              bool = true;
            }
            else if ("scene3d".equals(str))
            {
              paramzqg.Q.B().c().j = zauz.a(localzcjn, true);
            }
            else if ("effectDag".equals(str))
            {
              paramzqg.Q.B().e = zauz.a(localzcjn, true);
            }
            else if ("effectLst".equals(str))
            {
              paramzqg.Q.B().f().a = zauz.a(localzcjn, true);
            }
            else if ("sp3d".equals(str))
            {
              paramzqg.Q.B().c().a = zauz.a(localzcjn, true);
            }
            else if ("ln".equals(str))
            {
              g(localzcjn, paramzqg);
            }
            else if ("extLst".equals(str))
            {
              paramzqg.Q.B().h = zauz.a(localzcjn, true);
            }
          }
        }
      }
    }
    if (bool)
    {
      localObject1 = a(paramzqg);
      ((FillFormat)localObject1).b.a(0, localObject1);
    }
    this.o = bool;
  }
  
  private void i(zcjn paramzcjn, zqg paramzqg)
    throws Exception
  {
    CustomGeometry localCustomGeometry = new CustomGeometry(paramzqg.Q);
    paramzqg.Q.a(localCustomGeometry);
    Iterator localIterator = paramzcjn.iterator();
    while (localIterator.hasNext())
    {
      zcjs localzcjs = (zcjs)localIterator.next();
      Object localObject1;
      Object localObject2;
      Object localObject3;
      if ("gdLst".equals(localzcjs.g))
      {
        localObject1 = localzcjs.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (zcjn)((Iterator)localObject1).next();
          String str1 = ((zcjn)localObject2).a("name");
          localObject3 = ((zcjn)localObject2).a("fmla");
          localCustomGeometry.e().a(new ShapeGuide(str1, (String)localObject3));
        }
      }
      else if ("avLst".equals(localzcjs.g))
      {
        a((zcjn)localzcjs, localCustomGeometry);
      }
      else if ("rect".equals(localzcjs.g))
      {
        localCustomGeometry.a(localzcjs.c());
      }
      else if ("pathLst".equals(localzcjs.g))
      {
        localObject1 = localzcjs.l();
        localObject2 = localCustomGeometry.getPaths();
        for (int i1 = 0; i1 < ((zcju)localObject1).a(); i1++) {
          if ((((zcju)localObject1).a(i1) instanceof zcjn))
          {
            localObject3 = (zcjn)((zcju)localObject1).a(i1);
            String str2 = ((zcjn)localObject3).g;
            if ("path".equals(str2))
            {
              ShapePath localShapePath = new ShapePath();
              String str3 = zauj.a((zcjs)localObject3, "extrusionOk");
              if ((str3 != null) && ("1".equals(str3))) {
                localShapePath.a = true;
              }
              str3 = zauj.a((zcjs)localObject3, "fill");
              if (str3 != null) {
                localShapePath.b = ztr.f(str3);
              }
              str3 = zauj.a((zcjs)localObject3, "stroke");
              if ((str3 != null) && ("0".equals(str3))) {
                localShapePath.c = false;
              }
              str3 = zauj.a((zcjs)localObject3, "h");
              if (str3 != null) {
                localShapePath.d = zq.a(str3, com.aspose.cells.b.a.c.za.b());
              } else {
                localShapePath.d = paramzqg.I;
              }
              str3 = zauj.a((zcjs)localObject3, "w");
              if (str3 != null) {
                localShapePath.e = zq.a(str3, com.aspose.cells.b.a.c.za.b());
              } else {
                localShapePath.e = paramzqg.H;
              }
              zcju localzcju = ((zcjn)localObject3).l();
              ShapePathPoint localShapePathPoint = new ShapePathPoint();
              for (int i2 = 0; i2 < localzcju.a(); i2++) {
                if ((localzcju.a(i2) instanceof zcjn))
                {
                  zcjn localzcjn = (zcjn)localzcju.a(i2);
                  if ("moveTo".equals(localzcjn.g))
                  {
                    if (localzcjn.l().a() == 1)
                    {
                      localShapeSegmentPath = new ShapeSegmentPath(2);
                      localShapePathPoint = a((zcjn)localzcjn.l().a(0), "x", "y");
                      localShapeSegmentPath.getPoints().a(localShapePathPoint);
                      localShapePath.a(localShapeSegmentPath);
                    }
                  }
                  else if ("cubicBezTo".equals(localzcjn.g))
                  {
                    if (localzcjn.l().a() == 3)
                    {
                      localShapeSegmentPath = new ShapeSegmentPath(1);
                      localShapeSegmentPath.getPoints().a(localShapePathPoint);
                      localShapeSegmentPath.getPoints().a(a((zcjn)localzcjn.l().a(0), "x", "y"));
                      localShapeSegmentPath.getPoints().a(a((zcjn)localzcjn.l().a(1), "x", "y"));
                      localShapePathPoint = a((zcjn)localzcjn.l().a(2), "x", "y");
                      localShapeSegmentPath.getPoints().a(localShapePathPoint);
                      localShapePath.a(localShapeSegmentPath);
                    }
                  }
                  else if ("arcTo".equals(localzcjn.g))
                  {
                    localShapeSegmentPath = new ShapeSegmentPath(6);
                    localShapeSegmentPath.getPoints().a(new ShapePathPoint(Integer.valueOf(paramzqg.F), Integer.valueOf(paramzqg.G)));
                    localShapeSegmentPath.getPoints().a(a(localzcjn, "wR", "hR"));
                    localShapeSegmentPath.getPoints().a(a(localzcjn, "stAng", "swAng"));
                    localShapePath.a(localShapeSegmentPath);
                  }
                  else if ("lnTo".equals(localzcjn.g))
                  {
                    if (localzcjn.l().a() == 1)
                    {
                      localShapeSegmentPath = new ShapeSegmentPath(0);
                      localShapeSegmentPath.getPoints().a(localShapePathPoint);
                      localShapePathPoint = a((zcjn)localzcjn.l().a(0), "x", "y");
                      localShapeSegmentPath.getPoints().a(localShapePathPoint);
                      localShapePath.a(localShapeSegmentPath);
                    }
                  }
                  else if ("close".equals(localzcjn.g))
                  {
                    localShapeSegmentPath = new ShapeSegmentPath(3);
                    localShapePath.a(localShapeSegmentPath);
                  }
                }
              }
              ShapeSegmentPath localShapeSegmentPath = new ShapeSegmentPath(4);
              localShapePath.a(localShapeSegmentPath);
              ((ShapePathCollection)localObject2).a(localShapePath);
            }
          }
        }
      }
    }
  }
  
  private ShapePathPoint a(zcjn paramzcjn, String paramString1, String paramString2)
  {
    String str1 = zauj.a(paramzcjn, paramString1);
    String str2 = zauj.a(paramzcjn, paramString2);
    int i1 = 0;
    int i2 = 0;
    if (zarb.b(str1))
    {
      i1 = zauj.F(str1);
      str1 = null;
    }
    if (zarb.b(str2))
    {
      i2 = zauj.F(str2);
      str2 = null;
    }
    if (str1 == null)
    {
      if (str2 == null) {
        return new ShapePathPoint(Integer.valueOf(i1), Integer.valueOf(i2));
      }
      return new ShapePathPoint(Integer.valueOf(i1), str2);
    }
    if (str2 == null) {
      return new ShapePathPoint(str1, Integer.valueOf(i2));
    }
    return new ShapePathPoint(str1, str2);
  }
  
  private void j(zcjn paramzcjn, zqg paramzqg)
  {
    String str = zauj.a(paramzcjn, "prst");
    if (str != null)
    {
      int i1 = zauj.aR(str);
      switch (paramzqg.Q.getMsoDrawingType())
      {
      }
      paramzqg.Q.R().j().a((short)zauj.aI(i1));
    }
    zcjn localzcjn = zauj.b(paramzcjn, "avLst");
    if (localzcjn != null) {
      a(localzcjn, paramzqg.Q.getGeometry());
    }
  }
  
  private void a(zcjn paramzcjn, Geometry paramGeometry)
  {
    if (paramzcjn != null)
    {
      zcju localzcju = paramzcjn.l();
      for (int i1 = 0; i1 < localzcju.a(); i1++) {
        if ((localzcju.a(i1) instanceof zcjn))
        {
          zcjn localzcjn = (zcjn)localzcju.a(i1);
          if ("gd".equals(localzcjn.g))
          {
            String str1 = localzcjn.a("name");
            String str2 = localzcjn.a("fmla");
            ShapeGuide localShapeGuide = new ShapeGuide(str1, str2);
            paramGeometry.getShapeAdjustValues().a(localShapeGuide);
          }
        }
      }
    }
  }
  
  private zcjy a(zcjn paramzcjn)
    throws Exception
  {
    String str = zauz.a(paramzcjn, true);
    zcjy localzcjy = zauy.a(str, false);
    localzcjy.a(0);
    localzcjy.d();
    return localzcjy;
  }
  
  private void a(String paramString)
  {
    if (this.d != null)
    {
      zc localzc = zg.a(this.d);
      while (localzc.c())
      {
        String str = (String)localzc.a();
        if ((paramString.indexOf(str) != -1) && (!this.f.contains(localzc.b()))) {
          zf.a(this.f, localzc.b());
        }
      }
    }
  }
  
  private void b(String paramString)
  {
    if (this.d != null)
    {
      Object localObject = this.d.get(paramString);
      if (localObject == null) {
        return;
      }
      if (!this.f.contains(localObject)) {
        zf.a(this.f, localObject);
      }
    }
  }
  
  private void a(zcjn paramzcjn, String paramString)
  {
    if (this.d != null)
    {
      b(zauj.a(paramzcjn, "dm"));
      b(zauj.a(paramzcjn, "lo"));
      b(zauj.a(paramzcjn, "qs"));
      b(zauj.a(paramzcjn, "cs"));
      zc localzc = zg.a(this.d);
      while (localzc.c())
      {
        zrl localzrl = (zrl)localzc.b();
        if (("http://schemas.microsoft.com/office/2007/relationships/diagramDrawing".equals(localzrl.c)) && (localzrl.d.endsWith(paramString)))
        {
          if (this.f.contains(localzc.b())) {
            break;
          }
          zf.a(this.f, localzc.b());
          break;
        }
      }
    }
  }
  
  private boolean c(String paramString)
  {
    if ((paramString != null) && (this.d != null)) {
      return this.d.containsKey(paramString);
    }
    return false;
  }
  
  ArrayList a()
  {
    return this.f;
  }
  
  private zqg a(zcjn paramzcjn, int paramInt, boolean paramBoolean)
    throws Exception
  {
    this.p = false;
    zqg localzqg = b(paramzcjn, paramInt, paramBoolean);
    Shape localShape = localzqg.Q;
    if (localShape == null) {
      return localzqg;
    }
    if ((this.n != null) && (localzqg.h != null))
    {
      String str = localzqg.h.a("modelId");
      if (str != null) {
        this.n.a(str, localzqg.Q);
      }
    }
    switch (localzqg.c())
    {
    case 8: 
      m(localzqg.h, localzqg);
      break;
    case 5: 
      zf.a(this.l, localzqg);
      break;
    case 6: 
      l(localzqg.h, localzqg);
      if (localzqg.g.indexOf("<m:oMath") != -1) {
        localShape.h.h = localzqg.g;
      }
      break;
    case 1: 
      l(localzqg.h, localzqg);
      break;
    case 0: 
      k(localzqg.h, localzqg);
      localShape.p = new zsw(localShape);
      break;
    case 31: 
      a(localzqg.g);
      localShape.h.h = localzqg.g;
      break;
    default: 
      if (localzqg.b())
      {
        l(localzqg.h, localzqg);
      }
      else
      {
        a(localzqg.g);
        localShape.h.h = localzqg.g;
      }
      break;
    }
    return localzqg;
  }
  
  private void k(zcjn paramzcjn, zqg paramzqg)
    throws Exception
  {
    ArrayList localArrayList = new ArrayList();
    int i1 = 0;
    Object localObject1;
    for (zcjs localzcjs = paramzcjn.m(); localzcjs != null; localzcjs = localzcjs.n()) {
      if ((localzcjs instanceof zcjn))
      {
        localObject1 = (zcjn)localzcjs;
        switch (q.a(((zcjn)localObject1).g))
        {
        case 10: 
          h((zcjn)localObject1, paramzqg);
          break;
        case 11: 
        case 12: 
        case 13: 
        case 14: 
        case 15: 
          zqg localzqg = a((zcjn)localObject1, i1++, true);
          if (localzqg.Q != null) {
            zf.a(localArrayList, localzqg.Q);
          }
          break;
        }
      }
    }
    int i2 = localArrayList.size();
    if (i2 > 0)
    {
      localObject1 = new Shape[i2];
      int i3 = 0;
      Object localObject2 = localArrayList.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        Object localObject3 = ((Iterator)localObject2).next();
        localObject1[(i3++)] = ((Shape)localObject3);
        Shape localShape = (Shape)localObject3;
      }
      localObject2 = (GroupShape)paramzqg.Q;
      a((GroupShape)paramzqg.Q, (Shape[])localObject1);
    }
  }
  
  private void l(zcjn paramzcjn, zqg paramzqg)
    throws Exception
  {
    String str1 = paramzcjn.g;
    paramzqg.Q.h.a = "cxnSp".equals(str1);
    int i1 = 0;
    zcjn localzcjn;
    for (zcjs localzcjs = paramzcjn.m(); localzcjs != null; localzcjs = localzcjs.n()) {
      if (localzcjs.e == 1)
      {
        localzcjn = (zcjn)localzcjs;
        switch (q.a(localzcjn.g))
        {
        case 16: 
          b(localzcjn, paramzqg);
          i1 = 1;
        }
      }
    }
    for (localzcjs = paramzcjn.m(); localzcjs != null; localzcjs = localzcjs.n()) {
      if (localzcjs.e == 1)
      {
        localzcjn = (zcjn)localzcjs;
        switch (q.a(localzcjn.g))
        {
        case 17: 
          h(localzcjn, paramzqg);
          break;
        case 18: 
          String str2 = zauz.a(localzcjn, true);
          zcjy localzcjy = new zcjy(str2, false);
          localzcjy.k();
          zalg localzalg = new zalg(this.b.j(), localzcjy, paramzqg.Q, paramzqg.Q.getTextBody(), this.d);
          localzalg.a();
          break;
        case 19: 
          a(localzcjn, paramzqg);
        }
      }
    }
    if (i1 == 0) {
      paramzqg.Q.p = null;
    }
  }
  
  private void m(zcjn paramzcjn, zqg paramzqg)
    throws Exception
  {
    Shape localShape = paramzqg.Q;
    if ((paramzqg.J != null) && (this.d != null))
    {
      localObject = (zrl)this.d.get(paramzqg.J);
      ((Picture)localShape).a(((zrl)localObject).a(true) + 1);
    }
    if (paramzqg.K != null)
    {
      localObject = (zrl)this.d.get(paramzqg.K);
      ((Picture)localShape).a(zbxt.c(((zrl)localObject).d));
    }
    for (Object localObject = paramzcjn.m(); localObject != null; localObject = ((zcjs)localObject).n()) {
      if (((zcjs)localObject).e == 1)
      {
        zcjn localzcjn = (zcjn)localObject;
        String str = localzcjn.g;
        if ("spPr".equals(str)) {
          h(localzcjn, paramzqg);
        } else if ("blipFill".equals(str)) {
          c(localzcjn, paramzqg);
        }
      }
    }
  }
  
  private void a(zcjs paramzcjs)
  {
    Object localObject1 = paramzcjs.d;
    for (Object localObject2 = paramzcjs.m(); localObject2 != null; localObject2 = ((zcjs)localObject2).n()) {
      if (((zcjs)localObject2).e != 1)
      {
        localObject1 = localObject2;
      }
      else
      {
        if ("AlternateContent".equals(((zcjs)localObject2).g))
        {
          zcjs localzcjs1 = ((zcjs)localObject2).m();
          zcjs localzcjs2 = localzcjs1.d;
          zcjs localzcjs3 = localzcjs2.c;
          for (zcjs localzcjs4 = localzcjs3;; localzcjs4 = localzcjs4.c)
          {
            localzcjs4.b = paramzcjs;
            if (localzcjs4 == localzcjs2) {
              break;
            }
          }
          if (localObject2 == paramzcjs.d)
          {
            if (localObject1 != localObject2)
            {
              ((zcjs)localObject1).c = localzcjs3;
              localzcjs2.c = ((zcjs)localObject2).c;
            }
            paramzcjs.d = localzcjs2;
          }
          else
          {
            ((zcjs)localObject1).c = localzcjs3;
            localzcjs2.c = ((zcjs)localObject2).c;
          }
          localObject2 = localzcjs3;
        }
        else
        {
          a((zcjs)localObject2);
        }
        localObject1 = localObject2;
      }
    }
  }
  
  private zqg b(zcjn paramzcjn, int paramInt, boolean paramBoolean)
    throws Exception
  {
    zqg localzqg = new zqg();
    zcju localzcju = zauz.a(paramzcjn, "slicer", "http://schemas.microsoft.com/office/drawing/2010/slicer");
    if (localzcju.a() > 0) {
      localzqg.g = zauz.a(paramzcjn, false);
    } else {
      localzqg.g = zauz.a(paramzcjn, true);
    }
    localzqg.L = paramBoolean;
    if ("AlternateContent".equals(paramzcjn.g))
    {
      localzqg.f = true;
      zcjs localzcjs = paramzcjn.m();
      paramzcjn = (zcjn)localzcjs.m();
    }
    if (paramzcjn != null)
    {
      a(paramzcjn);
      if (paramBoolean) {
        localzqg.o = "freeFloating";
      }
      n(paramzcjn, localzqg);
    }
    if (localzqg.c() == 5)
    {
      if ((this.h.m.k & 0x100) == 0) {
        return localzqg;
      }
    }
    else if ((this.h.m.k & 0x200) == 0) {
      return localzqg;
    }
    a(localzqg, paramInt);
    return localzqg;
  }
  
  private void n(zcjn paramzcjn, zqg paramzqg)
  {
    int i1 = 0;
    Object localObject;
    switch (q.a(paramzcjn.g))
    {
    case 20: 
    case 21: 
    case 22: 
    case 23: 
    case 24: 
    case 25: 
      paramzqg.q = zauj.a(paramzcjn, "editAs");
      paramzqg.o = paramzcjn.g;
      i1 = 1;
      break;
    case 26: 
      b(paramzcjn, paramzqg, true);
      return;
    case 27: 
      b(paramzcjn, paramzqg, false);
      return;
    case 28: 
      t(paramzcjn, paramzqg);
      return;
    case 29: 
      if (paramzqg.F == 0) {
        s(paramzcjn, paramzqg);
      }
      return;
    case 14: 
      paramzqg.h = paramzcjn;
      paramzqg.a(8);
      i1 = 1;
      break;
    case 13: 
      paramzqg.h = paramzcjn;
      paramzqg.a(0);
      i1 = 1;
      break;
    case 11: 
    case 12: 
    case 15: 
      paramzqg.h = paramzcjn;
      i1 = 1;
      break;
    case 30: 
    case 31: 
    case 32: 
    case 33: 
    case 34: 
      o(paramzcjn, paramzqg);
      return;
    case 10: 
    case 17: 
      i1 = 1;
      break;
    case 35: 
      if (paramzqg.c() == 8) {
        q(paramzcjn, paramzqg);
      }
      return;
    case 36: 
      a(paramzcjn, paramzqg, paramzqg.L);
      return;
    case 37: 
      r(paramzcjn, paramzqg);
      return;
    case 38: 
      localObject = zauj.a(paramzcjn, "prst");
      if (localObject != null) {
        paramzqg.O = zauj.aR((String)localObject);
      }
      return;
    case 39: 
      paramzqg.P = 0;
      return;
    case 40: 
      paramzqg.l = paramzcjn;
      return;
    }
    if (i1 != 0) {
      for (localObject = paramzcjn.m(); localObject != null; localObject = ((zcjs)localObject).n())
      {
        n((zcjn)localObject, paramzqg);
        if ("grpSpPr".equals(((zcjs)localObject).g)) {
          break;
        }
      }
    }
  }
  
  private void o(zcjn paramzcjn, zqg paramzqg)
  {
    Object localObject2;
    for (Object localObject1 = paramzcjn.m(); localObject1 != null; localObject1 = ((zcjs)localObject1).n()) {
      if (((zcjs)localObject1).e == 1) {
        switch (q.a(((zcjs)localObject1).g))
        {
        case 41: 
          paramzqg.i = ((zcjn)localObject1);
          break;
        case 42: 
          paramzqg.j = ((zcjn)localObject1);
          localObject2 = paramzqg.j.a("txBox", null);
          if (zauj.b((String)localObject2, false)) {
            paramzqg.a(6);
          }
          break;
        case 43: 
        case 44: 
        case 45: 
        case 46: 
          paramzqg.j = ((zcjn)localObject1);
        }
      }
    }
    if (paramzqg.i != null)
    {
      paramzqg.c = paramzqg.i.a("id", null);
      localObject1 = paramzqg.i.c("a:ext");
      if ((localObject1 != null) && (((zcju)localObject1).a() > 0))
      {
        localObject2 = (zcjn)((zcju)localObject1).a(0);
        p((zcjn)localObject2, paramzqg);
      }
    }
    if (paramzqg.j != null)
    {
      localObject1 = paramzqg.j.c("a:ext");
      if ((localObject1 != null) && (((zcju)localObject1).a() > 0))
      {
        localObject2 = (zcjn)((zcju)localObject1).a(0);
        p((zcjn)localObject2, paramzqg);
      }
    }
  }
  
  private void p(zcjn paramzcjn, zqg paramzqg)
  {
    for (zcjs localzcjs = paramzcjn.m(); localzcjs != null; localzcjs = localzcjs.n())
    {
      zcjn localzcjn = (zcjn)localzcjs;
      switch (q.a(localzcjn.g))
      {
      case 47: 
      case 48: 
        if (localzcjn.g())
        {
          Iterator localIterator = localzcjn.e().iterator();
          while (localIterator.hasNext())
          {
            zcjg localzcjg = (zcjg)localIterator.next();
            switch (q.a(localzcjg.g))
            {
            case 49: 
              paramzqg.e = localzcjg.h;
              break;
            case 50: 
              paramzqg.d = localzcjg.h;
            }
          }
        }
        break;
      }
    }
  }
  
  private void q(zcjn paramzcjn, zqg paramzqg)
  {
    zcjn localzcjn = zauj.b(paramzcjn, "blip");
    if (localzcjn != null)
    {
      Iterator localIterator = localzcjn.e().iterator();
      while (localIterator.hasNext())
      {
        zcjg localzcjg = (zcjg)localIterator.next();
        switch (q.a(localzcjg.g))
        {
        case 51: 
          paramzqg.J = localzcjg.h;
          break;
        case 52: 
          paramzqg.K = localzcjg.h;
        }
      }
    }
  }
  
  private void r(zcjn paramzcjn, zqg paramzqg)
  {
    for (zcjs localzcjs1 = paramzcjn.m(); localzcjs1 != null; localzcjs1 = localzcjs1.n()) {
      if ("graphicData".equals(localzcjs1.g))
      {
        String str1 = ((zcjn)localzcjs1).a("uri", null);
        paramzqg.a = str1;
        for (zcjs localzcjs2 = localzcjs1.m(); localzcjs2 != null; localzcjs2 = localzcjs2.n()) {
          if ((localzcjs2 instanceof zcjn))
          {
            zcjn localzcjn = (zcjn)localzcjs2;
            switch (q.a(localzcjn.g))
            {
            case 53: 
              String str2 = zauj.a(localzcjn, "spid");
              if (str2 != null)
              {
                zqe localzqe = (zqe)this.h.p.get(str2);
                if (localzqe != null) {
                  paramzqg.d = str2;
                }
              }
              break;
            case 54: 
              paramzqg.J = zauj.a(localzcjn, "id");
              if (c(paramzqg.J)) {
                paramzqg.a(5);
              }
              break;
            case 55: 
            case 56: 
              paramzqg.a(31);
              paramzqg.k = localzcjn;
              break;
            case 57: 
              paramzqg.M = true;
              paramzqg.k = localzcjn;
            }
          }
        }
        break;
      }
    }
  }
  
  private void a(zcjn paramzcjn, zqg paramzqg, boolean paramBoolean)
  {
    paramzqg.m = paramzcjn;
    for (zcjs localzcjs = paramzcjn.m(); localzcjs != null; localzcjs = localzcjs.n()) {
      if (localzcjs.e == 1) {
        switch (q.a(localzcjs.g))
        {
        case 58: 
          if (paramBoolean) {
            b((zcjn)localzcjs, true, paramzqg);
          }
          break;
        case 28: 
          if (paramBoolean) {
            b((zcjn)localzcjs, false, paramzqg);
          }
          break;
        case 59: 
          a((zcjn)localzcjs, true, paramzqg);
          break;
        case 60: 
          a((zcjn)localzcjs, false, paramzqg);
        }
      }
    }
  }
  
  private void a(zcjn paramzcjn, boolean paramBoolean, zqg paramzqg)
  {
    int[] arrayOfInt = b(paramzcjn);
    if (arrayOfInt != null)
    {
      if (paramBoolean) {
        paramzqg.a().a = arrayOfInt[0];
      } else {
        paramzqg.a().b = arrayOfInt[0];
      }
      if (paramBoolean) {
        paramzqg.a().c = arrayOfInt[1];
      } else {
        paramzqg.a().d = arrayOfInt[1];
      }
    }
  }
  
  private void b(zcjn paramzcjn, boolean paramBoolean, zqg paramzqg)
  {
    int[] arrayOfInt = b(paramzcjn);
    if (arrayOfInt != null)
    {
      if (paramBoolean) {
        paramzqg.F = arrayOfInt[0];
      } else {
        paramzqg.H = arrayOfInt[0];
      }
      if (paramBoolean) {
        paramzqg.G = arrayOfInt[1];
      } else {
        paramzqg.I = arrayOfInt[1];
      }
    }
  }
  
  private void s(zcjn paramzcjn, zqg paramzqg)
  {
    int[] arrayOfInt = b(paramzcjn);
    if (arrayOfInt == null) {
      return;
    }
    if (arrayOfInt[0] >= 0) {
      paramzqg.F = zauj.a(arrayOfInt[0], this.g);
    }
    if (arrayOfInt[1] >= 0) {
      paramzqg.G = zauj.a(arrayOfInt[1], this.g);
    }
  }
  
  private void t(zcjn paramzcjn, zqg paramzqg)
  {
    int[] arrayOfInt = b(paramzcjn);
    if (arrayOfInt == null) {
      return;
    }
    if (arrayOfInt[0] >= 0) {
      paramzqg.D = zauj.a(arrayOfInt[0], this.g);
    }
    if (arrayOfInt[1] >= 0) {
      paramzqg.E = zauj.a(arrayOfInt[1], this.g);
    }
  }
  
  private int[] b(zcjn paramzcjn)
  {
    if (!paramzcjn.g()) {
      return null;
    }
    int[] arrayOfInt = { -1, -1 };
    Iterator localIterator = paramzcjn.e().iterator();
    while (localIterator.hasNext())
    {
      zcjg localzcjg = (zcjg)localIterator.next();
      double d1 = zauj.C(localzcjg.h);
      int i1 = -1;
      if (d1 < 2.147483647E9D) {
        i1 = (int)d1;
      } else {
        i1 = Integer.MAX_VALUE;
      }
      int i2 = localzcjg.g.charAt(localzcjg.g.length() - 1);
      if (i2 == 120) {
        arrayOfInt[0] = i1;
      } else if (i2 == 121) {
        arrayOfInt[1] = i1;
      }
    }
    return arrayOfInt;
  }
  
  private void b(zcjn paramzcjn, zqg paramzqg, boolean paramBoolean)
  {
    for (zcjs localzcjs = paramzcjn.m(); localzcjs != null; localzcjs = localzcjs.n()) {
      if (localzcjs.e == 1)
      {
        zcjn localzcjn = (zcjn)localzcjs;
        String str1 = localzcjn.g;
        String str2 = zauz.a(localzcjn);
        try
        {
          if ("col".equals(str1))
          {
            int i1 = zauj.F(str2);
            if (paramBoolean) {
              paramzqg.r = i1;
            } else {
              paramzqg.v = i1;
            }
          }
          else if ("colOff".equals(str1))
          {
            double d1 = zauj.b(zauj.F(str2), this.g);
            if (paramBoolean) {
              paramzqg.s = d1;
            } else {
              paramzqg.w = d1;
            }
          }
          else if ("row".equals(str1))
          {
            int i2 = zauj.F(str2);
            if (paramBoolean) {
              paramzqg.t = i2;
            } else {
              paramzqg.x = i2;
            }
          }
          else
          {
            double d2;
            if ("rowOff".equals(str1))
            {
              d2 = zauj.b(zauj.F(str2), this.g);
              if (paramBoolean) {
                paramzqg.u = d2;
              } else {
                paramzqg.y = d2;
              }
            }
            else if ("x".equals(str1))
            {
              d2 = zauj.C(str2);
              if (paramBoolean) {
                paramzqg.z = d2;
              } else {
                paramzqg.B = d2;
              }
            }
            else if ("y".equals(str1))
            {
              d2 = zauj.C(str2);
              if (paramBoolean) {
                paramzqg.A = d2;
              } else {
                paramzqg.C = d2;
              }
            }
          }
        }
        catch (Exception localException) {}
      }
    }
  }
  
  private void a(zcjs paramzcjs, zqg paramzqg)
  {
    for (zcjs localzcjs = paramzcjs.m(); localzcjs != null; localzcjs = localzcjs.n()) {
      if (localzcjs.e == 1)
      {
        zcjn localzcjn = (zcjn)localzcjs;
        String str = localzcjn.g;
        switch (q.a(str))
        {
        case 61: 
          b(localzcjn, paramzqg);
        }
      }
    }
  }
  
  private void b(zcjs paramzcjs, zqg paramzqg)
  {
    zcjg localzcjg = paramzcjs.e().a("moveWithCells");
    boolean bool = false;
    if (localzcjg != null) {
      bool = zauj.b(localzcjg.h, false);
    }
    int i1 = 0;
    for (zcjs localzcjs = paramzcjs.m(); localzcjs != null; localzcjs = localzcjs.n()) {
      if (localzcjs.e == 1)
      {
        zcjn localzcjn = (zcjn)localzcjs;
        String str = localzcjn.g;
        switch (q.a(str))
        {
        case 26: 
          i1++;
          b(localzcjn, paramzqg, true);
          break;
        case 27: 
          i1++;
          b(localzcjn, paramzqg, false);
        }
      }
    }
    if (i1 == 2)
    {
      paramzqg.o = "twoCellAnchor";
      if (bool) {
        paramzqg.q = "oneCell";
      } else {
        paramzqg.q = "absolute";
      }
    }
  }
  
  private void a(zqg paramzqg, int paramInt)
    throws Exception
  {
    Object localObject1 = null;
    Object localObject2;
    Object localObject3;
    if ((paramzqg.d != null) && ((paramzqg.f) || (paramzqg.L) || ((this.e) && (paramzqg.g.indexOf("AlternateContent") != -1))))
    {
      paramzqg.b = this.b.getCount();
      if (paramzqg.e != null)
      {
        localObject1 = this.b.a(paramzqg.c(), paramzqg.d());
        ((Shape)localObject1).e(paramzqg.e);
        zf.a(this.h.n, paramzqg);
      }
      else
      {
        localObject2 = "\000s" + paramzqg.c;
        localObject3 = (zqe)this.h.p.get(localObject2);
        if (localObject3 != null)
        {
          if ((((zqe)localObject3).e != null) && (!paramzqg.L)) {
            a(((zqe)localObject3).e, paramzqg);
          }
          if ((((zqe)localObject3).f) || (!this.h.m.p))
          {
            if ((localObject3 instanceof zqf))
            {
              localObject1 = this.b.a(24, 4095);
              ((zqf)localObject3).n = ((OleObject)localObject1);
              if (this.h.m.p) {
                zf.a(this.l, paramzqg);
              }
            }
            paramzqg.p = ((zqe)localObject3);
            zf.a(this.h.n, paramzqg);
          }
        }
        if (localObject1 == null) {
          localObject1 = this.b.a(29, 4095);
        }
        paramzqg.Q = ((Shape)localObject1);
      }
    }
    else if (paramzqg.M)
    {
      localObject1 = this.b.a(29, 4095);
      paramzqg.Q = ((Shape)localObject1);
      localObject2 = paramzqg.k;
      localObject3 = zauj.a((zcjs)localObject2, "dm");
      zrl localzrl = (zrl)this.d.get(localObject3);
      String str = zw.a(zu.b(localzrl.d), "data", "drawing");
      String[] arrayOfString = zauj.a(this.m, zw.a(zu.d(localzrl.d), "\\", "/") + "/" + str, false);
      paramzqg.Q.o = arrayOfString[0];
      a((zcjn)localObject2, str);
    }
    else if (paramzqg.c() == 31)
    {
      localObject2 = paramzqg.k.a("name", null);
      if (this.h.o.get(localObject2) != null) {
        localObject1 = (Shape)this.h.o.get(localObject2);
      } else {
        localObject1 = new zbpw(this.b, null);
      }
      this.b.c((Shape)localObject1);
    }
    else if (paramzqg.c() == 5)
    {
      localObject2 = null;
      localObject3 = this.h.d;
      if (this.e)
      {
        localObject2 = new Chart((Worksheet)localObject3, this.i.getShapes());
        this.i.getShapes().c(((Chart)localObject2).getChartObject());
      }
      else
      {
        if (((Worksheet)localObject3).getType() == 2)
        {
          localObject2 = ((Worksheet)localObject3).getCharts().get(0);
        }
        else
        {
          localObject2 = new Chart((Worksheet)localObject3);
          ((Worksheet)localObject3).getCharts().a((Chart)localObject2);
        }
        ((Worksheet)localObject3).getShapes().c(((Chart)localObject2).getChartObject());
      }
      localObject1 = ((Chart)localObject2).getChartObject();
    }
    else
    {
      localObject1 = this.b.a(paramzqg.c(), paramzqg.d());
      if (paramzqg.c() == 0) {
        ((GroupShape)localObject1).a(paramzqg.a());
      }
    }
    paramzqg.Q = ((Shape)localObject1);
    paramzqg.e();
    ((Shape)localObject1).h = new zqu(true);
    ((Shape)localObject1).h.g = paramzqg.o;
    ((Shape)localObject1).h.n = paramzqg.f;
    ((Shape)localObject1).h.f = paramInt;
    if (paramzqg.c() == 6) {
      ((TextBox)localObject1).getTextBody().getTextAlignment().c(true);
    }
    if ((paramzqg.m != null) && (paramzqg.m.g()))
    {
      localObject2 = paramzqg.m.e().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (zcjg)((Iterator)localObject2).next();
        switch (q.a(((zcjg)localObject3).g))
        {
        case 62: 
          ((Shape)localObject1).R().j().e(zauj.aB(((zcjg)localObject3).h));
          break;
        case 63: 
          ((Shape)localObject1).R().j().f(zauj.aB(((zcjg)localObject3).h));
          break;
        case 64: 
          double d1 = zbxp.d((int)zauj.C(((zcjg)localObject3).h));
          paramzqg.Q.a(d1);
        }
      }
    }
    if ((paramzqg.h != null) && (paramzqg.h.g()))
    {
      localObject2 = paramzqg.h.e().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (zcjg)((Iterator)localObject2).next();
        switch (q.a(((zcjg)localObject3).g))
        {
        case 65: 
          ((Shape)localObject1).g(zauj.aB(((zcjg)localObject3).h));
          break;
        case 66: 
          ((Shape)localObject1).setMacroName(((zcjg)localObject3).h);
          break;
        case 67: 
          ((Shape)localObject1).setLinkedCell(((zcjg)localObject3).h);
          break;
        case 68: 
          ((Shape)localObject1).getTextBody().getTextAlignment().c(zauj.aB(((zcjg)localObject3).h));
        }
      }
    }
    a(paramzqg.i, (Shape)localObject1);
    b(paramzqg.j, (Shape)localObject1);
    e(paramzqg.l, (Shape)localObject1);
  }
  
  private void a(zcjn paramzcjn, Shape paramShape)
  {
    if (paramzcjn == null) {
      return;
    }
    boolean bool = false;
    Object localObject1 = paramzcjn.e().iterator();
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (zcjg)((Iterator)localObject1).next();
      switch (q.a(((zcjg)localObject2).g))
      {
      case 69: 
        paramShape.m = zauj.F(((zcjg)localObject2).h);
        if (paramShape.m > this.b.f()) {
          this.b.b(paramShape.m);
        }
        break;
      case 70: 
        paramShape.setAlternativeText(((zcjg)localObject2).h);
        break;
      case 71: 
        paramShape.setName(((zcjg)localObject2).h);
        break;
      case 72: 
        paramShape.setTitle(((zcjg)localObject2).h);
        break;
      case 73: 
        bool = zauj.aB(((zcjg)localObject2).h);
        if (bool) {
          paramShape.setHidden(bool);
        }
        break;
      }
    }
    for (localObject1 = paramzcjn.m(); localObject1 != null; localObject1 = ((zcjs)localObject1).n()) {
      if (((zcjs)localObject1).e == 1)
      {
        localObject2 = (zcjn)localObject1;
        switch (q.a(((zcjs)localObject1).g))
        {
        case 74: 
          a((zcjn)localObject2, paramShape, this.d);
        }
      }
    }
  }
  
  private void b(zcjn paramzcjn, Shape paramShape)
  {
    if (paramzcjn == null) {
      return;
    }
    for (zcjs localzcjs = paramzcjn.m(); localzcjs != null; localzcjs = localzcjs.n()) {
      if (localzcjs.e == 1)
      {
        zcjn localzcjn = (zcjn)localzcjs;
        switch (q.a(localzcjs.g))
        {
        case 76: 
        case 77: 
        case 78: 
        case 79: 
        case 80: 
          c(localzcjn, paramShape);
          break;
        case 81: 
        case 82: 
          d(localzcjn, paramShape);
        }
      }
    }
  }
  
  private void c(zcjn paramzcjn, Shape paramShape)
  {
    if (!paramzcjn.g()) {
      return;
    }
    Iterator localIterator = paramzcjn.e().iterator();
    while (localIterator.hasNext())
    {
      zcjg localzcjg = (zcjg)localIterator.next();
      boolean bool = false;
      if (localzcjg.h != null) {
        bool = zauj.aB(localzcjg.h);
      }
      switch (q.a(localzcjg.g))
      {
      case 84: 
        paramShape.setLockedProperty(1, bool);
        break;
      case 85: 
        paramShape.setLockedProperty(12, bool);
        break;
      case 86: 
        paramShape.setLockedProperty(7, bool);
        break;
      case 87: 
        paramShape.setLockedProperty(11, bool);
        break;
      case 88: 
        paramShape.setLockedProperty(3, bool);
        break;
      case 89: 
        paramShape.setLockedProperty(0, bool);
        break;
      case 90: 
        paramShape.setLockedProperty(6, bool);
        break;
      case 91: 
        paramShape.setLockedProperty(10, bool);
        break;
      case 92: 
        paramShape.setLockedProperty(8, bool);
        break;
      case 93: 
        paramShape.setLockedProperty(5, bool);
        break;
      case 94: 
        paramShape.setLockedProperty(2, bool);
        break;
      case 95: 
        paramShape.setLockedProperty(4, bool);
      }
    }
  }
  
  private void d(zcjn paramzcjn, Shape paramShape)
  {
    int i1 = 0;
    int i2 = 0;
    Object localObject = paramzcjn.e().iterator();
    while (((Iterator)localObject).hasNext())
    {
      zcjg localzcjg = (zcjg)((Iterator)localObject).next();
      switch (q.a(localzcjg.g))
      {
      case 69: 
        i1 = zauj.F(localzcjg.h);
        break;
      case 96: 
        i2 = zauj.F(localzcjg.h);
      }
    }
    localObject = paramShape.g;
    if (localObject == null)
    {
      localObject = paramShape.g = new znn();
      zf.a(this.a, localObject);
    }
    if ("stCxn".equals(paramzcjn.g))
    {
      ((znn)localObject).a = i1;
      ((znn)localObject).b = i2;
    }
    else
    {
      ((znn)localObject).c = i1;
      ((znn)localObject).d = i2;
    }
  }
  
  private void e(zcjn paramzcjn, Shape paramShape)
  {
    if (paramzcjn == null) {
      return;
    }
    Iterator localIterator = paramzcjn.e().iterator();
    while (localIterator.hasNext())
    {
      zcjg localzcjg = (zcjg)localIterator.next();
      switch (q.a(localzcjg.g))
      {
      case 97: 
        paramShape.setPrintable(zauj.aB(localzcjg.h));
        break;
      case 98: 
        paramShape.setLocked(zauj.aB(localzcjg.h));
      }
    }
  }
  
  static void a(zcjn paramzcjn, Shape paramShape, HashMap paramHashMap)
  {
    String str1 = null;
    String str2 = null;
    Object localObject1 = paramzcjn.e().iterator();
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (zcjg)((Iterator)localObject1).next();
      switch (q.a(((zcjg)localObject2).g))
      {
      case 69: 
        str1 = ((zcjg)localObject2).h;
        break;
      case 99: 
        str2 = ((zcjg)localObject2).h;
      }
    }
    if ((str1 != null) && (!"".equals(str1)))
    {
      localObject1 = paramHashMap.get(str1);
      if (localObject1 == null) {
        return;
      }
      localObject2 = (zrl)localObject1;
      if (zw.b(((zrl)localObject2).d)) {
        return;
      }
      String str3 = ((zrl)localObject2).d;
      if (str3.charAt(0) == '#') {
        str3 = str3.substring(1);
      }
      if ((str3 != null) && (str3.startsWith("file:///"))) {
        str3 = str3.substring("file:///".length());
      }
      Hyperlink localHyperlink = paramShape.addHyperlink(str3);
      if (str2 != null) {
        localHyperlink.setScreenTip(str2);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zakp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */