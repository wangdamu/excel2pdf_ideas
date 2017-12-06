package com.aspose.cells;

import com.aspose.cells.a.c.zl;
import com.aspose.cells.a.d.zbh;
import com.aspose.cells.a.d.zcc;
import com.aspose.cells.a.d.zdt;
import com.aspose.cells.a.d.zdu;
import com.aspose.cells.a.d.zeb;
import com.aspose.cells.a.d.zec;
import com.aspose.cells.a.d.zed;
import com.aspose.cells.a.d.zfb;
import com.aspose.cells.a.d.zfc;
import com.aspose.cells.a.d.zfd;
import com.aspose.cells.a.d.zff;
import com.aspose.cells.a.d.zfg;
import com.aspose.cells.a.d.zfn;
import com.aspose.cells.a.d.zfq;
import com.aspose.cells.a.d.zgr;
import com.aspose.cells.a.d.zhb;
import com.aspose.cells.a.d.zht;
import com.aspose.cells.a.d.zn;
import com.aspose.cells.b.a.b.zi;
import com.aspose.cells.b.a.b.zj;
import com.aspose.cells.b.a.b.zs;
import com.aspose.cells.b.a.d.ze;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zg;
import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class zbyr
{
  private Workbook i;
  private WorksheetCollection j;
  private Worksheet k;
  private HashMap l;
  private zm m = null;
  private double[] n;
  private Style o;
  private HashMap p;
  private HashMap q;
  private HashMap r;
  private HashMap s;
  private HashMap t;
  com.aspose.cells.a.d.zf a = null;
  zff b = null;
  private zavu u;
  private ArrayList v;
  ArrayList c;
  HashMap d = new HashMap();
  private zahb[] w;
  private zahp[] x;
  private zahq[] y;
  private zajb[] z;
  HashMap[] e;
  private long A = 100000000L;
  boolean f = false;
  HashMap g;
  String h = null;
  private zgr B = null;
  private static final com.aspose.cells.b.c.a.za C = new com.aspose.cells.b.c.a.za(new String[] { ".bmp", ".emf", ".jpg", ".jpeg", ".png", ".gif", ".tif", ".tiff" });
  
  zbyr(Workbook paramWorkbook)
  {
    this.i = paramWorkbook;
    this.j = paramWorkbook.getWorksheets();
    this.n = new double[] { 1.0D, 1.0D };
    this.o = paramWorkbook.getWorksheets().Q();
    this.l = new HashMap();
    this.v = new ArrayList();
    this.c = new ArrayList();
    this.s = new HashMap();
    this.r = new HashMap();
    this.t = new HashMap();
    this.q = new HashMap();
    this.w = new zahb[paramWorkbook.getWorksheets().getCount()];
    this.x = new zahp[this.w.length];
    this.y = new zahq[this.w.length];
    this.z = new zajb[this.w.length];
    this.e = new HashMap[this.w.length];
    this.g = new HashMap();
  }
  
  private ImageFormat a(String paramString, ImageOrPrintOptions paramImageOrPrintOptions)
    throws Exception
  {
    if (paramString == null) {
      return paramImageOrPrintOptions.getImageFormat();
    }
    String str = com.aspose.cells.b.a.d.zk.d(paramString);
    switch (C.a(str.toLowerCase()))
    {
    case 0: 
      return ImageFormat.getBmp();
    case 1: 
      return ImageFormat.getEmf();
    case 2: 
    case 3: 
      return ImageFormat.getJpeg();
    case 4: 
      return ImageFormat.getPng();
    case 5: 
      return ImageFormat.getGif();
    case 6: 
    case 7: 
      return ImageFormat.getTiff();
    }
    return paramImageOrPrintOptions.getImageFormat();
  }
  
  void a(int paramInt, zm paramzm, ImageOrPrintOptions paramImageOrPrintOptions)
    throws Exception
  {
    try
    {
      if (paramInt >= this.c.size()) {
        return;
      }
      if ((paramInt >= 0) && (paramInt < this.c.size())) {
        paramImageOrPrintOptions.a(true);
      }
      if (paramInt < 0) {
        paramImageOrPrintOptions.a(false);
      }
      b();
      zat localzat = (zat)this.c.get(paramInt);
      zau.a(localzat, paramzm, this.a, paramImageOrPrintOptions);
    }
    catch (CellsException localCellsException)
    {
      zl.b(localCellsException);
      throw localCellsException;
    }
    catch (Exception localException)
    {
      zl.b(localException);
      throw new CellsException(4, localException.getMessage());
    }
    finally
    {
      c();
    }
  }
  
  void a(int paramInt, ImageOrPrintOptions paramImageOrPrintOptions, zm paramzm)
    throws Exception
  {
    Object localObject1;
    Object localObject2;
    if (paramImageOrPrintOptions.getSaveFormat() == 0)
    {
      localObject1 = paramImageOrPrintOptions.getImageFormat();
      if (localObject1 == ImageFormat.getEmf())
      {
        a(paramInt, paramzm, paramImageOrPrintOptions);
        paramzm.b(0L);
        return;
      }
      if (localObject1 == ImageFormat.getJpeg())
      {
        localObject2 = a(paramInt, paramImageOrPrintOptions);
        if (localObject2 == null) {
          return;
        }
        zcc.a((zj)localObject2, paramzm, paramImageOrPrintOptions.getQuality());
        ((com.aspose.cells.b.a.b.za)localObject2).d();
        localObject2 = null;
        return;
      }
      if ((localObject1 == ImageFormat.getBmp()) || (localObject1 == ImageFormat.getPng()) || (localObject1 == ImageFormat.getGif()))
      {
        localObject2 = a(paramInt, paramImageOrPrintOptions);
        if (localObject2 == null) {
          return;
        }
        ((com.aspose.cells.b.a.b.za)localObject2).a(paramzm, (ImageFormat)localObject1);
        paramzm.b(0L);
        ((com.aspose.cells.b.a.b.za)localObject2).d();
        localObject2 = null;
        return;
      }
      if (localObject1 == ImageFormat.getTiff())
      {
        b(paramInt, paramImageOrPrintOptions, paramzm);
        return;
      }
    }
    else
    {
      localObject1 = new zis(paramImageOrPrintOptions.getCheckWorkbookDefaultFont() ? this.i.getWorksheets().T().getName() : null, paramImageOrPrintOptions.getDefaultFont());
      if (paramImageOrPrintOptions.getSaveFormat() == 20)
      {
        localObject2 = new zht((zhb)localObject1, paramzm);
        ((zht)localObject2).e = paramImageOrPrintOptions.getChartImageType();
        zat localzat = (zat)this.c.get(paramInt);
        ((zht)localObject2).a(localzat);
        ((zht)localObject2).a();
        paramzm.b(0L);
        return;
      }
      if (paramImageOrPrintOptions.getSaveFormat() == 22)
      {
        if (this.B == null)
        {
          this.B = new zgr((zhb)localObject1, paramImageOrPrintOptions.getSVGFitToViewPort());
          this.B.e = paramImageOrPrintOptions.getChartImageType();
        }
        localObject2 = (zat)this.c.get(paramInt);
        this.B.a((zn)localObject2, paramzm, paramImageOrPrintOptions.getEmbededImageNameInSvg());
        this.B.a();
        paramzm.b(0L);
        return;
      }
      if (paramImageOrPrintOptions.getSaveFormat() == 21)
      {
        b(paramInt, paramImageOrPrintOptions, paramzm);
        return;
      }
    }
  }
  
  private void b(int paramInt, ImageOrPrintOptions paramImageOrPrintOptions, zm paramzm)
    throws Exception
  {
    znv localznv = new znv();
    localznv.a(paramzm, paramImageOrPrintOptions, paramInt, this);
  }
  
  void a(int paramInt, String paramString, ImageOrPrintOptions paramImageOrPrintOptions)
    throws Exception
  {
    ze localze = new ze(paramString, 2);
    a(paramInt, paramImageOrPrintOptions, localze);
    localze.b();
    localze.a();
  }
  
  boolean a(int paramInt, ImageOrPrintOptions paramImageOrPrintOptions, zi paramzi)
    throws Exception
  {
    zat localzat = null;
    try
    {
      if (paramInt >= this.c.size())
      {
        boolean bool = false;
        return bool;
      }
      if ((paramInt >= 0) && (paramInt < this.c.size())) {
        paramImageOrPrintOptions.a(true);
      }
      if (paramInt < 0) {
        paramImageOrPrintOptions.a(false);
      }
      b();
      localzat = (zat)this.c.get(paramInt);
      paramzi.a(2);
      paramzi.a(Color.getWhite());
      paramzi.a(paramImageOrPrintOptions.getHorizontalResolution() / zbxp.a(), paramImageOrPrintOptions.getVerticalResolution() / zbxp.a());
      zbh localzbh = (zbh)this.a;
      localzbh.a(localzat, paramzi);
      localzbh.a();
      paramzi.g();
    }
    catch (CellsException localCellsException)
    {
      zl.b(localCellsException);
      throw localCellsException;
    }
    catch (Exception localException)
    {
      zl.b(localException);
      throw new CellsException(4, localException.getMessage());
    }
    finally
    {
      c();
    }
    return true;
  }
  
  com.aspose.cells.b.a.b.za a(int paramInt, ImageOrPrintOptions paramImageOrPrintOptions)
    throws Exception
  {
    int[] arrayOfInt = { 1, 1 };
    com.aspose.cells.b.a.b.za localza1 = null;
    zat localzat = null;
    try
    {
      if (paramInt >= this.c.size())
      {
        com.aspose.cells.b.a.b.za localza2 = null;
        return localza2;
      }
      if ((paramInt >= 0) && (paramInt < this.c.size())) {
        paramImageOrPrintOptions.a(true);
      }
      if (paramInt < 0) {
        paramImageOrPrintOptions.a(false);
      }
      b();
      localzat = (zat)this.c.get(paramInt);
      float f1;
      float f2;
      if ((paramImageOrPrintOptions.j > 0) && (paramImageOrPrintOptions.k > 0))
      {
        localza1 = zcc.a(paramImageOrPrintOptions.j, paramImageOrPrintOptions.k, paramImageOrPrintOptions.b());
        f1 = (float)(paramImageOrPrintOptions.j / (localzat.g * zbxp.a()));
        f2 = (float)(paramImageOrPrintOptions.k / (localzat.h * zbxp.a()));
      }
      else
      {
        localza1 = zcc.a((int)Math.ceil(localzat.g * paramImageOrPrintOptions.getHorizontalResolution()), (int)Math.ceil(localzat.h * paramImageOrPrintOptions.getVerticalResolution()), paramImageOrPrintOptions.b());
        if (!CellsHelper.a(localza1))
        {
          f1 = paramImageOrPrintOptions.getHorizontalResolution() / localza1.j();
          f2 = paramImageOrPrintOptions.getVerticalResolution() / localza1.k();
        }
        else
        {
          f1 = paramImageOrPrintOptions.getHorizontalResolution() / zbxp.a();
          f2 = paramImageOrPrintOptions.getVerticalResolution() / zbxp.a();
        }
      }
      arrayOfInt[0] = localza1.m().b();
      arrayOfInt[1] = localza1.m().c();
      zi localzi = zi.a(localza1);
      localzi.a(2);
      localzi.a(paramImageOrPrintOptions.h);
      if (paramImageOrPrintOptions.getTransparent()) {
        localzi.a(Color.getEmpty());
      } else {
        localzi.a(Color.getWhite());
      }
      localzi.a(f1, f2);
      zbh localzbh = (zbh)this.a;
      localzbh.e = paramImageOrPrintOptions.getChartImageType();
      localzbh.a(localzat, localzi);
      localza1.a(paramImageOrPrintOptions.getHorizontalResolution(), paramImageOrPrintOptions.getVerticalResolution());
      localzbh.a();
      localzi.e();
    }
    catch (CellsException localCellsException)
    {
      zl.b(localCellsException);
      throw localCellsException;
    }
    catch (Exception localException)
    {
      zl.b(localException);
      throw new CellsException(4, localException.getMessage());
    }
    finally
    {
      c();
    }
    return localza1;
  }
  
  boolean a(zm paramzm, ImageOrPrintOptions paramImageOrPrintOptions)
    throws Exception
  {
    paramImageOrPrintOptions.a(false);
    ImageFormat localImageFormat = a(null, paramImageOrPrintOptions);
    try
    {
      b();
      Object localObject1;
      if ((localImageFormat == ImageFormat.getTiff()) || (paramImageOrPrintOptions.getSaveFormat() == 21))
      {
        localObject1 = new znv();
        ((znv)localObject1).a(paramzm, paramImageOrPrintOptions, this.c, this);
        boolean bool2 = true;
        return bool2;
      }
      if (paramImageOrPrintOptions.getSaveFormat() == 20)
      {
        localObject1 = new zis(paramImageOrPrintOptions.getCheckWorkbookDefaultFont() ? this.i.getWorksheets().T().getName() : null, paramImageOrPrintOptions.getDefaultFont());
        zht localzht = new zht((zhb)localObject1, paramzm, paramImageOrPrintOptions.e());
        localzht.e = paramImageOrPrintOptions.getChartImageType();
        int i1 = -1;
        for (int i2 = 0; (i2 < this.c.size()) && (i2 - paramImageOrPrintOptions.e() < paramImageOrPrintOptions.f()); i2++)
        {
          zat localzat = (zat)this.c.get(i2);
          if ((localzat.b.getIndex() != i1) && (i1 != -1)) {
            localzht.c();
          }
          if ((i2 % 50 == 0) && (i2 != 0))
          {
            zg.a();
            zg.b();
          }
          try
          {
            localzht.a(localzat);
          }
          catch (Exception localException)
          {
            zl.b(localException);
          }
          i1 = localzat.b.getIndex();
          this.i.i();
        }
        if (this.c.size() == 0)
        {
          com.aspose.cells.a.d.zo localzo = null;
          double d1 = 595.2755905511812D;
          double d2 = 841.8897637795276D;
          if ((this.i != null) && (this.i.getWorksheets().getCount() > 0))
          {
            PageSetup localPageSetup = this.i.getWorksheets().get(0).getPageSetup();
            double[] arrayOfDouble1 = { d1 };
            double[] arrayOfDouble2 = { d2 };
            zauu.a(localPageSetup, arrayOfDouble1, arrayOfDouble2);
            d1 = arrayOfDouble1[0];
            d2 = arrayOfDouble2[0];
            d1 *= 72.0D;
            d2 *= 72.0D;
          }
          localzo = new com.aspose.cells.a.d.zo((float)d1, (float)d2);
          localzht.a(localzo);
        }
        localzht.a();
        paramzm.b(0L);
        boolean bool3 = true;
        return bool3;
      }
      if (paramzm == null)
      {
        boolean bool1 = false;
        return bool1;
      }
    }
    finally
    {
      c();
    }
    return false;
  }
  
  private void a()
  {
    for (int i1 = 0; i1 < this.w.length; i1++)
    {
      Worksheet localWorksheet = this.i.getWorksheets().get(i1);
      if (localWorksheet.isVisible())
      {
        a(localWorksheet, i1);
      }
      else
      {
        Cells localCells = localWorksheet.getCells();
        localCells.getRows().a(16);
        this.w[i1] = localCells.getRows().a;
      }
    }
  }
  
  private void a(Worksheet paramWorksheet, int paramInt)
  {
    Cells localCells = paramWorksheet.getCells();
    localCells.getRows().a(17);
    this.w[paramInt] = localCells.getRows().a;
    localCells.getRows().a(2, true);
    this.z[paramWorksheet.getIndex()] = localCells.getRows().b;
    this.y[paramInt] = new zlw(localCells, 16383);
    localCells.b = this.y[paramInt];
    this.x[paramInt] = new zlt(localCells, 16383);
    localCells.c = this.x[paramInt];
    ListObjectCollection localListObjectCollection = paramWorksheet.k();
    if ((localListObjectCollection != null) && (localListObjectCollection.getCount() > 0))
    {
      this.e[paramInt] = new HashMap();
      localListObjectCollection.a();
    }
  }
  
  private void b()
  {
    for (int i1 = 0; i1 < this.w.length; i1++)
    {
      Worksheet localWorksheet = this.i.getWorksheets().get(i1);
      Cells localCells = localWorksheet.getCells();
      localCells.getRows().a = this.w[i1];
      if (this.z[i1] != null)
      {
        localCells.getRows().b = this.z[i1];
        localCells.b = this.y[i1];
        localCells.c = this.x[i1];
      }
      ListObjectCollection localListObjectCollection = localWorksheet.k();
      if ((localListObjectCollection != null) && (localListObjectCollection.getCount() > 0)) {
        localListObjectCollection.b();
      }
    }
  }
  
  private void c()
  {
    for (int i1 = 0; i1 < this.w.length; i1++)
    {
      Cells localCells = this.i.getWorksheets().get(i1).getCells();
      localCells.getRows().a();
      if (this.z[i1] != null)
      {
        localCells.getRows().b();
        localCells.l();
        localCells.k();
      }
    }
  }
  
  void a(ImageOrPrintOptions paramImageOrPrintOptions)
    throws Exception
  {
    this.h = paramImageOrPrintOptions.getDefaultFont();
    d();
    HashMap localHashMap = new HashMap();
    this.o = this.i.getDefaultStyle();
    a();
    zuj localzuj = new zuj(this.i, this);
    localzuj.e = this.a;
    for (int i1 = 0; i1 < this.w.length; i1++) {
      localzuj.a(this.i.getWorksheets().get(i1), paramImageOrPrintOptions);
    }
    zaca localzaca = zla.a(this.i);
    zzu localzzu = new zzu();
    localzzu.a(this.i.getSettings().getGlobalizationSettings());
    zia localzia = new zia(this.i, true, true);
    localzzu.a(localzia);
    this.c = new ArrayList();
    int i2 = -1;
    int i3 = 1;
    for (int i4 = 0; i4 < localzuj.f.size(); i4++)
    {
      zaus localzaus = (zaus)localzuj.f.get(i4);
      Worksheet localWorksheet = this.i.getWorksheets().get(localzaus.a);
      if ((localWorksheet.getIndex() != i2) && (!localWorksheet.getPageSetup().isAutoFirstPageNumber())) {
        i3 = localWorksheet.getPageSetup().getFirstPageNumber();
      }
      zbox localzbox = (zbox)this.g.get(Integer.valueOf(localzaus.a));
      localzia.a(localzbox.a());
      zat localzat = new zat(localWorksheet, localzaus, i3, localzuj.f.size(), localzuj.f, paramImageOrPrintOptions, this, i4, localzaca, localzzu);
      i3++;
      i2 = localWorksheet.getIndex();
      com.aspose.cells.b.a.a.zf.a(this.c, localzat);
    }
    c();
  }
  
  void a(Worksheet paramWorksheet, ImageOrPrintOptions paramImageOrPrintOptions)
    throws Exception
  {
    this.h = paramImageOrPrintOptions.getDefaultFont();
    d();
    HashMap localHashMap = new HashMap();
    this.o = this.i.getDefaultStyle();
    this.k = paramWorksheet;
    a(paramWorksheet, paramWorksheet.getIndex());
    for (int i1 = 0; i1 < this.w.length; i1++) {
      if (i1 != paramWorksheet.getIndex())
      {
        localObject = this.i.getWorksheets().get(i1).getCells();
        ((Cells)localObject).getRows().a(16);
        this.w[i1] = ((Cells)localObject).getRows().a;
      }
    }
    zuj localzuj = new zuj(this.i, this);
    localzuj.e = this.a;
    localzuj.a(paramWorksheet, paramImageOrPrintOptions);
    Object localObject = zla.a(paramWorksheet);
    zzu localzzu = new zzu();
    localzzu.a(this.i.getSettings().getGlobalizationSettings());
    zia localzia = new zia(this.i, true, true);
    localzzu.a(localzia);
    this.c = new ArrayList();
    int i2 = -1;
    int i3 = 1;
    for (int i4 = 0; i4 < localzuj.f.size(); i4++)
    {
      zaus localzaus = (zaus)localzuj.f.get(i4);
      Worksheet localWorksheet = this.i.getWorksheets().get(localzaus.a);
      if ((localWorksheet.getIndex() != i2) && (!localWorksheet.getPageSetup().isAutoFirstPageNumber())) {
        i3 = localWorksheet.getPageSetup().getFirstPageNumber();
      }
      zbox localzbox = (zbox)this.g.get(Integer.valueOf(localzaus.a));
      localzia.a(localzbox.a());
      zat localzat2 = new zat(localWorksheet, localzaus, i3, localzuj.f.size(), localzuj.f, paramImageOrPrintOptions, this, i4, (zaca)localObject, localzzu);
      i3++;
      i2 = localWorksheet.getIndex();
      com.aspose.cells.b.a.a.zf.a(this.c, localzat2);
    }
    if ((localzuj.f.size() == 0) && (paramImageOrPrintOptions.getOutputBlankPageWhenNothingToPrint()))
    {
      zat localzat1 = e();
      com.aspose.cells.b.a.a.zf.a(this.c, localzat1);
    }
    c();
  }
  
  void a(zm paramzm, SaveOptions paramSaveOptions)
    throws Exception
  {
    PdfSaveOptions localPdfSaveOptions = null;
    if ((paramSaveOptions instanceof PdfSaveOptions)) {
      localPdfSaveOptions = (PdfSaveOptions)paramSaveOptions;
    } else {
      localPdfSaveOptions = new PdfSaveOptions(paramSaveOptions);
    }
    a(paramzm, localPdfSaveOptions);
  }
  
  void a(zm paramzm, PdfSaveOptions paramPdfSaveOptions)
    throws Exception
  {
    try
    {
      this.m = paramzm;
      a(paramPdfSaveOptions);
      if (this.m.e()) {
        this.m.a(0L, 0);
      }
      this.c = null;
    }
    catch (CellsException localCellsException)
    {
      zl.b(localCellsException);
      throw localCellsException;
    }
    catch (Exception localException)
    {
      zl.b(localException);
      throw new CellsException(4, localException.getMessage());
    }
    finally
    {
      c();
    }
  }
  
  private void d()
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator1 = this.i.getWorksheets().getNames().iterator();
    Object localObject1;
    while (localIterator1.hasNext())
    {
      localObject1 = (Name)localIterator1.next();
      localHashMap.put(((Name)localObject1).getText(), localObject1);
    }
    this.p = new HashMap();
    for (int i1 = 0; i1 < this.i.getWorksheets().getCount(); i1++)
    {
      localObject1 = this.i.getWorksheets().get(i1);
      if ((((Worksheet)localObject1).getType() == 1) && (((Worksheet)localObject1).isVisible()))
      {
        Object localObject2;
        for (int i2 = 0; i2 < ((Worksheet)localObject1).getHyperlinks().getCount(); i2++)
        {
          localObject2 = ((Worksheet)localObject1).getHyperlinks().get(i2);
          a(localHashMap, (Hyperlink)localObject2, (Worksheet)localObject1);
        }
        if (((Worksheet)localObject1).w() != null)
        {
          Iterator localIterator2 = ((Worksheet)localObject1).getShapes().iterator();
          while (localIterator2.hasNext())
          {
            localObject2 = (Shape)localIterator2.next();
            Hyperlink localHyperlink = ((Shape)localObject2).getHyperlink();
            if (localHyperlink != null) {
              a(localHashMap, localHyperlink, null);
            }
          }
        }
      }
    }
  }
  
  private void a(HashMap paramHashMap, Hyperlink paramHyperlink, Worksheet paramWorksheet)
  {
    if (this.p.get(paramHyperlink) != null) {
      return;
    }
    if (paramHyperlink.getAddress() == null) {
      return;
    }
    String str1 = paramHyperlink.getAddress().toLowerCase();
    int i1 = -1;
    String str2 = str1;
    int i2 = str1.indexOf("!");
    Object localObject1;
    Object localObject2;
    Worksheet localWorksheet;
    if (i2 != -1)
    {
      localObject1 = zw.d(str1, '!');
      localObject2 = localObject1[0];
      str2 = str2.substring(i2 + 1);
      if (((String)localObject2).charAt(0) == '\'') {
        localObject2 = ((String)localObject2).substring(1, 1 + (((String)localObject2).length() - 2));
      }
      localWorksheet = this.i.getWorksheets().get((String)localObject2);
      if (localWorksheet != null) {
        i1 = localWorksheet.getIndex();
      }
      if ((localObject1[1] != null) && (!"".equals(localObject1[1])) && (localObject1[1].indexOf(":") == -1))
      {
        int i3 = 0;
        int i4 = 0;
        if ((localWorksheet != null) && (zamm.c(localObject1[1])) && (localWorksheet != null)) {
          try
          {
            localObject1[1] = zw.a(localObject1[1], "$", "");
            int[] arrayOfInt1 = { i3 };
            int[] arrayOfInt2 = { i4 };
            CellsHelper.a(localObject1[1], arrayOfInt1, arrayOfInt2);
            i3 = arrayOfInt1[0];
            i4 = arrayOfInt2[0];
            Cell localCell2 = localWorksheet.getCells().a(i3, i4, false);
            this.p.put(paramHyperlink, localCell2);
            if (paramWorksheet != null)
            {
              RowCollection localRowCollection = paramWorksheet.getCells().getRows();
              CellArea localCellArea = paramHyperlink.getArea();
              int i5 = localCellArea.EndRow;
              int i6 = localCellArea.StartColumn;
              int i7 = localCellArea.EndColumn;
              for (i3 = localCellArea.StartRow; i3 <= i5; i3++)
              {
                Row localRow = localRowCollection.a(i3, false, true, false);
                for (i4 = i6; i4 <= i7; i4++) {
                  localRow.c(i4);
                }
              }
            }
            return;
          }
          catch (Exception localException) {}
        }
      }
    }
    i2 = this.i.getWorksheets().getNames().a(str2, i1, true);
    if (i2 != -1)
    {
      localObject1 = this.i.getWorksheets().getNames().get(i2);
      localObject2 = ((Name)localObject1).getRanges();
      if ((localObject2 == null) || (localObject2.length == 0)) {
        return;
      }
      localWorksheet = localObject2[0];
      i2 = localWorksheet.getWorksheet().getIndex();
      Cell localCell1 = this.i.getWorksheets().get(i2).getCells().a(localWorksheet.getFirstRow(), localWorksheet.getFirstColumn(), false);
      if (this.p.get(paramHyperlink) == null) {
        this.p.put(paramHyperlink, localCell1);
      }
    }
  }
  
  private void a(PdfSaveOptions paramPdfSaveOptions)
    throws Exception
  {
    this.h = paramPdfSaveOptions.getDefaultFont();
    if (paramPdfSaveOptions.getCalculateFormula())
    {
      boolean bool = this.i.getSettings().getCreateCalcChain();
      this.i.getSettings().setCreateCalcChain(false);
      this.i.calculateFormula();
      this.i.getSettings().setCreateCalcChain(bool);
    }
    this.b = paramPdfSaveOptions.c;
    this.b.a(paramPdfSaveOptions.a);
    this.b.d(paramPdfSaveOptions.b);
    try
    {
      this.b.c((String)this.i.getBuiltInDocumentProperties().get("Author").getValue());
      if (this.b.m() != null) {
        this.b.c(this.b.m().trim());
      }
      this.b.b((String)this.i.getBuiltInDocumentProperties().get("Title").getValue());
      if (this.b.l() != null) {
        this.b.b(this.b.l().trim());
      }
      this.b.a((String)this.i.getBuiltInDocumentProperties().get("Subject").getValue());
      if (this.b.k() != null) {
        this.b.a(this.b.k().trim());
      }
      this.b.d((String)this.i.getBuiltInDocumentProperties().get("Keywords").getValue());
      if (this.b.n() != null) {
        this.b.d(this.b.n().trim());
      }
    }
    catch (Exception localException) {}
    this.u = new zavu();
    ImageOrPrintOptions localImageOrPrintOptions = paramPdfSaveOptions.d;
    localImageOrPrintOptions.setWarningCallback(paramPdfSaveOptions.getWarningCallback());
    localImageOrPrintOptions.i = paramPdfSaveOptions.getStreamProvider();
    localImageOrPrintOptions.l = (paramPdfSaveOptions.getCompliance() == 2);
    zis localzis = new zis(localImageOrPrintOptions.getCheckWorkbookDefaultFont() ? this.i.getWorksheets().T().getName() : null, localImageOrPrintOptions.getDefaultFont());
    this.a = new zfn(localzis, this.u, this.b, localImageOrPrintOptions.e());
    this.a.e = paramPdfSaveOptions.getImageType();
    d();
    for (int i1 = 0; i1 < this.w.length; i1++)
    {
      localObject1 = this.i.getWorksheets().get(i1);
      if ((((Worksheet)localObject1).isVisible()) && (((Worksheet)localObject1).getPivotTables() != null) && (((Worksheet)localObject1).getPivotTables().getCount() > 0)) {
        for (i2 = 0; i2 < ((Worksheet)localObject1).getPivotTables().getCount(); i2++) {
          if ((((Worksheet)localObject1).isVisible()) && (!((Worksheet)localObject1).getPivotTables().get(i2).ah)) {
            ((Worksheet)localObject1).getPivotTables().get(i2).a();
          }
        }
      }
    }
    a();
    HashMap localHashMap = new HashMap();
    a(this.b.j());
    this.o = this.i.getDefaultStyle();
    if (this.b.p() != null)
    {
      this.b.a(new zfq(((zfn)this.a).d(), this.b.p()));
      this.b.o().d();
    }
    Object localObject1 = new zuj(this.i, this);
    ((zuj)localObject1).e = this.a;
    for (int i2 = 0; i2 < this.w.length; i2++)
    {
      localObject2 = this.i.getWorksheets().get(i2);
      if (((Worksheet)localObject2).isVisible()) {
        ((zuj)localObject1).a((Worksheet)localObject2, localImageOrPrintOptions);
      }
    }
    zaca localzaca = zla.a(this.i);
    Object localObject2 = new zzu();
    ((zzu)localObject2).a(this.i.getSettings().getGlobalizationSettings());
    zia localzia = new zia(this.i, true, true);
    ((zzu)localObject2).a(localzia);
    int i3 = -1;
    int i4 = -1;
    int i5 = 1;
    for (int i6 = 0; (i6 < ((zuj)localObject1).f.size()) && (i6 - localImageOrPrintOptions.e() < localImageOrPrintOptions.f()); i6++)
    {
      zaus localzaus = (zaus)((zuj)localObject1).f.get(i6);
      if ((localzaus.a != i3) && (i3 != -1)) {
        this.a.c();
      }
      if ((localzaus.a == i3) && (i4 != -1) && (localzaus.b != -1) && (localzaus.b != i4)) {
        this.a.c();
      }
      if ((i6 % 200 == 0) && (i6 != 0))
      {
        long l1 = zg.a(false);
        if (l1 - this.A > 100000000L)
        {
          this.A = l1;
          zg.a();
          zg.b();
        }
      }
      Worksheet localWorksheet = this.i.getWorksheets().get(localzaus.a);
      if ((localzaus.a != i3) && (!localWorksheet.getPageSetup().isAutoFirstPageNumber())) {
        i5 = localWorksheet.getPageSetup().getFirstPageNumber();
      }
      zbox localzbox = (zbox)this.g.get(Integer.valueOf(localzaus.a));
      localzia.a(localzbox.a());
      zat localzat2 = new zat(localWorksheet, localzaus, i5, ((zuj)localObject1).f.size(), ((zuj)localObject1).f, localImageOrPrintOptions, this, i6, localzaca, (zzu)localObject2);
      i5++;
      localzat2.o = this.p;
      localzat2.s = this.t;
      localzat2.r = this.s;
      localzat2.q = this.r;
      localzat2.p = this.q;
      this.a.a((localWorksheet.getPageSetup().getBlackAndWhite()) || ((localImageOrPrintOptions != null) && (localImageOrPrintOptions.e)));
      this.a.a(localzat2);
      i3 = localzaus.a;
      i4 = localzaus.b;
      this.u.a(this.m);
      this.u.b_();
      this.i.i();
      localzat2 = null;
    }
    if (((zuj)localObject1).f.size() == 0)
    {
      zat localzat1 = e();
      this.a.a(localzat1);
    }
    f();
    g();
    this.a.a();
    this.u.a(this.m);
    this.u.a();
    this.u = null;
    localObject1 = null;
    this.a = null;
    localzaca.c();
  }
  
  private zat e()
  {
    double d1 = 8.267716535433072D;
    double d2 = 11.692913385826772D;
    if ((this.i != null) && (this.i.getWorksheets().getCount() > 0))
    {
      localObject = this.i.getWorksheets().get(0).getPageSetup();
      double[] arrayOfDouble1 = { d1 };
      double[] arrayOfDouble2 = { d2 };
      zauu.a((PageSetup)localObject, arrayOfDouble1, arrayOfDouble2);
      d1 = arrayOfDouble1[0];
      d2 = arrayOfDouble2[0];
    }
    Object localObject = zat.a(d1, d2);
    return (zat)localObject;
  }
  
  private void f()
  {
    if (((this.a instanceof zfn)) && (this.s != null) && (this.s.size() > 0))
    {
      zec localzec = ((zfn)this.a).d();
      Iterator localIterator1 = this.s.keySet().iterator();
      while (localIterator1.hasNext())
      {
        Object localObject = localIterator1.next();
        Cell localCell = (Cell)this.s.get(localObject);
        String str = (String)this.r.get(localCell);
        if ((str != null) && (str.length() > 0))
        {
          String[] arrayOfString = zw.d(str, '_');
          int i1 = zp.a(arrayOfString[0]);
          float f1 = Float.parseFloat(arrayOfString[1]);
          float f2 = Float.parseFloat(arrayOfString[2]);
          com.aspose.cells.a.d.zk localzk = (com.aspose.cells.a.d.zk)this.q.get(localObject);
          Iterator localIterator2 = ((zfn)this.a).d().f().a.iterator();
          while (localIterator2.hasNext())
          {
            zdt localzdt = (zdt)localIterator2.next();
            if (zw.b(localzdt.b(), localzk.c())) {
              localzdt.a((String)this.r.get(localCell));
            }
          }
          localzk.a((String)this.r.get(localCell));
          if (localzec.f().b.get(localzk.c()) == null) {
            localzec.f().b.put(localzk.c(), new zed(i1, new com.aspose.cells.b.a.b.zo(f1, f2), localzec.m()));
          }
        }
      }
    }
  }
  
  private void g()
  {
    if (this.b.j() == null) {
      return;
    }
    a(this.b.j(), 0);
  }
  
  private void a(PdfBookmarkEntry paramPdfBookmarkEntry)
  {
    if (paramPdfBookmarkEntry == null) {
      return;
    }
    this.t.put(paramPdfBookmarkEntry, null);
    if ((paramPdfBookmarkEntry != null) && (paramPdfBookmarkEntry.getSubEntry() != null) && (paramPdfBookmarkEntry.getSubEntry().size() > 0))
    {
      Iterator localIterator = paramPdfBookmarkEntry.getSubEntry().iterator();
      while (localIterator.hasNext())
      {
        PdfBookmarkEntry localPdfBookmarkEntry = (PdfBookmarkEntry)localIterator.next();
        a(localPdfBookmarkEntry);
      }
    }
  }
  
  private void a(PdfBookmarkEntry paramPdfBookmarkEntry, int paramInt)
  {
    if (paramPdfBookmarkEntry != null)
    {
      zec localzec = ((zfn)this.a).d();
      zed localzed = new zed(paramPdfBookmarkEntry.a, paramPdfBookmarkEntry.b, localzec.m());
      Object localObject;
      if ((paramPdfBookmarkEntry.getText() == null) || (paramPdfBookmarkEntry.getText().length() == 0))
      {
        paramInt--;
      }
      else
      {
        if (!paramPdfBookmarkEntry.a()) {
          return;
        }
        if (zw.b(paramPdfBookmarkEntry.getDestinationName()))
        {
          localzec.g().a(paramPdfBookmarkEntry.getText(), paramInt, localzed, paramPdfBookmarkEntry.isOpen());
        }
        else
        {
          localObject = new zfd(localzec.m(), paramPdfBookmarkEntry.getDestinationName());
          localzec.g().a(paramPdfBookmarkEntry.getText(), paramInt, (zeb)localObject, paramPdfBookmarkEntry.isOpen());
          localzec.h().b().a(paramPdfBookmarkEntry.getDestinationName(), localzed);
        }
      }
      if ((paramPdfBookmarkEntry.getSubEntry() != null) && (paramPdfBookmarkEntry.getSubEntry().size() > 0))
      {
        paramInt++;
        localObject = paramPdfBookmarkEntry.getSubEntry().iterator();
        while (((Iterator)localObject).hasNext())
        {
          PdfBookmarkEntry localPdfBookmarkEntry = (PdfBookmarkEntry)((Iterator)localObject).next();
          a(localPdfBookmarkEntry, paramInt);
        }
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbyr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */