package com.aspose.cells;

import com.aspose.cells.a.c.zu;
import com.aspose.cells.a.d.zcc;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zph
{
  String a;
  String b;
  zbbs c = new zbbs();
  HashMap d = new HashMap();
  ArrayList e = new ArrayList();
  zpu f = null;
  Chart g = null;
  zpi[] h;
  
  zpt a()
  {
    return this.f.e;
  }
  
  zph(zpt paramzpt, Shape paramShape)
    throws Exception
  {
    this.f = new zpu(paramzpt, paramShape.Q());
    zpi localzpi = a(paramShape, paramShape.w());
    if (localzpi == null) {
      return;
    }
    this.h = new zpi[] { localzpi };
    this.b = "shapexml.xml";
    zuv localzuv = new zuv(this);
    a().a("drs/" + this.b, localzuv);
    zbbr localzbbr = new zbbr(this.c);
    a().a("drs/_rels/" + this.b + ".rels", localzbbr);
    String[] arrayOfString = localzpi.a();
    a().b("/drs/" + this.b, arrayOfString[0]);
    a().a(arrayOfString[1], "drs/" + this.b, null);
    zsu localzsu = new zsu(localzpi);
    a().a("drs/downrev.xml", localzsu);
    a().b("/drs/downrev.xml", "application/vnd.ms-office.DrsDownRev+xml");
    a().a("http://schemas.microsoft.com/office/2006/relationships/downRev", "drs/downrev.xml", null);
  }
  
  zph(zpe paramzpe)
    throws Exception
  {
    this.f = paramzpe.e;
    this.g = paramzpe.a;
    a(this.g.p());
    this.h = b(b());
    if ((this.h != null) && (this.h.length > 0))
    {
      this.b = ("drawing" + zauj.z(a().b()) + ".xml");
      a(true);
    }
  }
  
  zph(zpu paramzpu)
    throws Exception
  {
    this.f = paramzpu;
    Worksheet localWorksheet = paramzpu.a;
    if (localWorksheet.getType() == 2)
    {
      Chart localChart = localWorksheet.getCharts().get(0);
      a(localChart);
      this.b = ("drawing" + zauj.z(a().b()) + ".xml");
    }
    else
    {
      a(localWorksheet.w());
      this.h = b(b());
      if ((this.h != null) && (this.h.length > 0)) {
        this.b = ("drawing" + zauj.z(a().b()) + ".xml");
      }
    }
    a(false);
  }
  
  private void a(boolean paramBoolean)
  {
    if (zw.b(this.b)) {
      return;
    }
    String str1 = "xl/drawings/" + this.b;
    Object localObject = new zuv(this);
    a().a(str1, (zp)localObject);
    String str2 = "xl/drawings/_rels/" + this.b + ".rels";
    localObject = new zbbr(this.c);
    a().a(str2, (zp)localObject);
    a().b("/" + str1, paramBoolean ? "application/vnd.openxmlformats-officedocument.drawingml.chartshapes+xml" : "application/vnd.openxmlformats-officedocument.drawing+xml");
  }
  
  private void a(ShapeCollection paramShapeCollection)
  {
    if (paramShapeCollection != null)
    {
      ArrayList localArrayList = paramShapeCollection.a();
      if ((localArrayList != null) && (localArrayList.size() > 0)) {
        this.c.a(localArrayList);
      }
    }
  }
  
  String a(TextureFill paramTextureFill)
    throws Exception
  {
    int i = paramTextureFill.c + 1;
    if (i > 0)
    {
      localObject = (String)this.d.get(Integer.valueOf(i));
      if (localObject != null) {
        return (String)localObject;
      }
    }
    Object localObject = paramTextureFill.getImageData();
    if ((localObject == null) || (localObject.length == 0)) {
      return null;
    }
    zp localzp = a().a((byte[])localObject, zcc.b(zcc.a((byte[])localObject)));
    String str = a("http://schemas.openxmlformats.org/officeDocument/2006/relationships/image", a().C + localzp.c(), null);
    if (i > 0) {
      this.d.put(Integer.valueOf(i), str);
    }
    return str;
  }
  
  private ShapeCollection b()
  {
    if (this.g != null) {
      return this.g.p();
    }
    return this.f.a.w();
  }
  
  private zpi[] b(ShapeCollection paramShapeCollection)
    throws Exception
  {
    if ((paramShapeCollection == null) || (paramShapeCollection.getCount() == 0)) {
      return null;
    }
    int i = paramShapeCollection.getCount();
    zpi[] arrayOfzpi = new zpi[i];
    int j = 0;
    int k = -1;
    Object localObject = paramShapeCollection.iterator();
    while (((Iterator)localObject).hasNext())
    {
      Shape localShape = (Shape)((Iterator)localObject).next();
      k++;
      zpi localzpi = a(localShape, k);
      if ((localzpi != null) && (!localShape.W())) {
        arrayOfzpi[(j++)] = localzpi;
      }
    }
    localObject = new zpi[j];
    System.arraycopy(arrayOfzpi, 0, localObject, 0, j);
    return (zpi[])localObject;
  }
  
  private zpi a(Shape paramShape, int paramInt)
    throws Exception
  {
    boolean bool = paramShape.am();
    if ((bool) && (paramShape.z == null) && (paramShape.getMsoDrawingType() != 24) && ((paramShape.getMsoDrawingType() != 8) || (((Picture)paramShape).aj() == null))) {
      return null;
    }
    if ((paramShape.getMsoDrawingType() == 8) && (paramShape.z == null))
    {
      a((Picture)paramShape);
    }
    else if (paramShape.getMsoDrawingType() == 5)
    {
      localObject = ((ChartShape)paramShape).getChart();
      a((Chart)localObject);
    }
    Object localObject = new zpi(this, paramShape, bool);
    if ((((zpi)localObject).b) && (bool) && (this.f != null) && (this.g == null)) {
      this.f.r.put(Integer.valueOf(paramInt), localObject);
    }
    return (zpi)localObject;
  }
  
  private void a(Picture paramPicture)
    throws Exception
  {
    int i = 0;
    Object localObject1;
    if (paramPicture.d())
    {
      i = 1;
      if (!this.d.containsKey(paramPicture.getSourceFullName()))
      {
        localObject1 = a("http://schemas.openxmlformats.org/officeDocument/2006/relationships/image", zbxt.b(paramPicture.getSourceFullName()), "External");
        this.d.put(paramPicture.getSourceFullName(), localObject1);
      }
    }
    Object localObject2;
    if (paramPicture.b() == 0)
    {
      if ((i == 0) && (!this.d.containsKey(Integer.valueOf(paramPicture.b()))))
      {
        localObject1 = "NULL";
        localObject2 = a("http://schemas.openxmlformats.org/officeDocument/2006/relationships/image", (String)localObject1, null);
        this.d.put(Integer.valueOf(paramPicture.b()), localObject2);
      }
    }
    else
    {
      if (!a().f.containsKey(Integer.valueOf(paramPicture.b())))
      {
        localObject1 = paramPicture.getData();
        localObject2 = a().a((byte[])localObject1, zcc.b(zcc.a((byte[])localObject1)));
        a().f.put(Integer.valueOf(paramPicture.b()), zu.b(((zp)localObject2).a));
      }
      if (!this.d.containsKey(Integer.valueOf(paramPicture.b())))
      {
        localObject1 = a().C + (String)a().f.get(Integer.valueOf(paramPicture.b()));
        localObject2 = a("http://schemas.openxmlformats.org/officeDocument/2006/relationships/image", (String)localObject1, null);
        this.d.put(Integer.valueOf(paramPicture.b()), localObject2);
      }
    }
  }
  
  private void a(Chart paramChart)
    throws Exception
  {
    a().l += 1;
    String str1 = zauj.z(a().l);
    zpe localzpe = new zpe(this.f, paramChart);
    String str2 = "../charts/chart" + str1 + ".xml";
    String str3 = "/xl/charts/chart" + str1 + ".xml";
    boolean bool = zum.a(paramChart.getType());
    a().b(str3, bool ? "application/vnd.ms-office.chartex+xml" : "application/vnd.openxmlformats-officedocument.drawingml.chart+xml");
    Object localObject = null;
    if (bool) {
      localObject = new zum(localzpe);
    } else {
      localObject = new zul(localzpe);
    }
    a().a("xl/charts/chart" + str1 + ".xml", (zp)localObject);
    localObject = new zbbr(localzpe.b);
    String str4 = "xl/charts/_rels/chart" + str1 + ".xml.rels";
    a().a(str4, (zp)localObject);
    localzpe.c = a(bool ? "http://schemas.microsoft.com/office/2014/relationships/chartEx" : "http://schemas.openxmlformats.org/officeDocument/2006/relationships/chart", str2, null);
    zf.a(this.e, localzpe);
    localzpe.a(str1);
  }
  
  String a(String paramString1, String paramString2, String paramString3)
  {
    return this.c.b(paramString1, paramString2, paramString3).b;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zph.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */