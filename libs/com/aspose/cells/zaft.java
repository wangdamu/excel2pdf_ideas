package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.za;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zaft
{
  private Worksheet a = null;
  private ArrayList b = null;
  private ArrayList c = null;
  private ArrayList d = null;
  private ArrayList e = null;
  private int f = 0;
  private int g = 0;
  private int h = -1;
  private ArrayList i = new ArrayList();
  private zafo j = null;
  private HashMap k;
  private String l = null;
  private String m;
  private HashMap n = null;
  
  zaft(zafo paramzafo, Worksheet paramWorksheet, zago paramzago, String paramString1, String paramString2, String paramString3, String paramString4, HtmlSaveOptions paramHtmlSaveOptions)
    throws Exception
  {
    this.k = new HashMap(paramWorksheet.getCells().getColumns().getCount());
    this.a = paramWorksheet;
    this.j = paramzafo;
    g();
    if ((this.j.q != null) || (this.j.c().getExportImagesAsBase64())) {
      a(paramzago, paramString1, paramString2, paramString3, paramString4, paramHtmlSaveOptions);
    }
    this.m = paramString2;
    b(this.a);
    a(this.a);
    b(paramHtmlSaveOptions);
    this.g = h();
    this.h = i();
    a(paramHtmlSaveOptions);
    m();
    k();
    l();
    j();
  }
  
  private void g()
  {
    this.n = new HashMap();
    if ((this.a.getComments() == null) || (this.a.getComments().getCount() == 0)) {
      return;
    }
    Cells localCells = this.a.getCells();
    int i1 = this.a.getComments().getCount();
    for (int i2 = 0; i2 < i1; i2++)
    {
      Comment localComment = this.a.getComments().get(i2);
      this.n.put(localCells.get(localComment.getRow(), localComment.getColumn()).getName(), Integer.valueOf(i2 + 1));
    }
  }
  
  HashMap a()
  {
    return this.n;
  }
  
  private void a(Worksheet paramWorksheet)
  {
    if (paramWorksheet == null) {
      return;
    }
    ListObjectCollection localListObjectCollection = paramWorksheet.getListObjects();
    int i1 = localListObjectCollection.getCount();
    for (int i2 = 0; i2 < i1; i2++) {
      localListObjectCollection.get(i2).applyStyleToRange();
    }
  }
  
  private void a(HtmlSaveOptions paramHtmlSaveOptions)
  {
    if ((paramHtmlSaveOptions != null) && (paramHtmlSaveOptions.getHiddenColDisplayType() == 1)) {
      for (int i1 = 0; i1 <= this.h; i1++) {
        if (this.k.get(Integer.valueOf(i1)) == null) {
          this.k.put(Integer.valueOf(i1), Integer.valueOf(this.a.getCells().getStandardWidthPixels()));
        }
      }
    }
  }
  
  private boolean a(PivotTable paramPivotTable)
  {
    CellArea localCellArea = paramPivotTable.getTableRange2();
    for (int i1 = localCellArea.StartRow; i1 <= localCellArea.EndRow; i1++) {
      if (!this.a.getCells().getRows().getRowByIndex(i1).isHidden()) {
        return false;
      }
    }
    return true;
  }
  
  private boolean b(PivotTable paramPivotTable)
  {
    CellArea localCellArea = paramPivotTable.getTableRange2();
    for (int i1 = localCellArea.StartColumn; i1 <= localCellArea.EndColumn; i1++) {
      if (!this.a.getCells().getColumns().getColumnByIndex(i1).isHidden()) {
        return false;
      }
    }
    return true;
  }
  
  private void b(HtmlSaveOptions paramHtmlSaveOptions)
  {
    c(paramHtmlSaveOptions);
    Cells localCells;
    int i1;
    Object localObject;
    if ((paramHtmlSaveOptions != null) && (paramHtmlSaveOptions.getHiddenRowDisplayType() == 1))
    {
      localCells = this.a.getCells();
      for (i1 = localCells.getRows().getCount() - 1; i1 >= 0; i1--)
      {
        localObject = localCells.getRows().getRowByIndex(i1);
        if (((Row)localObject).isHidden()) {
          localCells.deleteRow(((Row)localObject).getIndex());
        }
      }
    }
    if ((paramHtmlSaveOptions != null) && (paramHtmlSaveOptions.getHiddenColDisplayType() == 1))
    {
      localCells = this.a.getCells();
      for (i1 = 0; i1 < localCells.getColumns().getCount(); i1++)
      {
        localObject = localCells.getColumns().getColumnByIndex(i1);
        if (((Column)localObject).isHidden())
        {
          localCells.deleteColumn(((Column)localObject).getIndex());
          i1--;
        }
        else
        {
          this.k.put(Integer.valueOf(((Column)localObject).getIndex()), Integer.valueOf(((Column)localObject).a()));
        }
      }
    }
  }
  
  private void c(HtmlSaveOptions paramHtmlSaveOptions)
  {
    if (paramHtmlSaveOptions != null)
    {
      int i1 = this.a.getPivotTables().getCount();
      PivotTable localPivotTable = null;
      int i2;
      if (paramHtmlSaveOptions.getHiddenRowDisplayType() == 1) {
        for (i2 = i1 - 1; i2 >= 0; i2--)
        {
          localPivotTable = this.a.b.get(i2);
          if (a(localPivotTable)) {
            this.a.b.removeAt(i2);
          }
        }
      }
      if (paramHtmlSaveOptions.getHiddenColDisplayType() == 1)
      {
        i1 = this.a.getPivotTables().getCount();
        for (i2 = i1 - 1; i2 >= 0; i2--)
        {
          localPivotTable = this.a.b.get(i2);
          if (b(localPivotTable)) {
            this.a.b.removeAt(i2);
          }
        }
      }
    }
  }
  
  private void b(Worksheet paramWorksheet)
  {
    if (paramWorksheet.isVisible())
    {
      int i1 = paramWorksheet.getPivotTables().getCount();
      PivotTable localPivotTable = null;
      for (int i2 = 0; i2 < i1; i2++)
      {
        localPivotTable = paramWorksheet.getPivotTables().get(i2);
        if (!localPivotTable.ah) {
          localPivotTable.a();
        }
      }
    }
  }
  
  Worksheet b()
  {
    return this.a;
  }
  
  int c()
  {
    return this.h;
  }
  
  int d()
  {
    return this.g;
  }
  
  private void a(zago paramzago, String paramString1, String paramString2, String paramString3, String paramString4, HtmlSaveOptions paramHtmlSaveOptions)
    throws Exception
  {
    ShapeCollection localShapeCollection = this.a.w();
    if ((localShapeCollection == null) || (localShapeCollection.getCount() == 0)) {
      return;
    }
    String str1 = "";
    IExportObjectListener localIExportObjectListener = this.j.c().getExportObjectListener();
    if (localIExportObjectListener == null) {
      str1 = this.j.b(paramString1);
    }
    this.e = new ArrayList();
    HashMap localHashMap = this.j.g();
    int i1 = localShapeCollection.getCount();
    for (int i2 = 0; i2 < i1; i2++)
    {
      this.l = null;
      localObject1 = localShapeCollection.get(i2);
      if ((!((Shape)localObject1).W()) && ((((Shape)localObject1).getWidth() > 0) || (((Shape)localObject1).getHeight() > 0)))
      {
        String str2 = null;
        if (localIExportObjectListener != null)
        {
          Object localObject2 = localIExportObjectListener.exportObject(new ExportObjectEvent(localObject1));
          if ((localObject2 != null) && ((localObject2 instanceof String))) {
            str2 = (String)localObject2;
          }
        }
        else
        {
          Object localObject3;
          switch (((Shape)localObject1).getMsoDrawingType())
          {
          case 8: 
            if (zagn.a((Picture)localObject1))
            {
              str2 = zagn.e(((Shape)localObject1).getMsoDrawingType()) + this.a.getName() + "_" + zauj.z(i2) + ".";
              str2 = str2 + a(paramHtmlSaveOptions.getImageOptions());
              str2 = zagn.d(str2);
              try
              {
                a(paramzago, (Shape)localObject1, paramHtmlSaveOptions, str1, paramString2, str2);
              }
              catch (Exception localException1)
              {
                continue;
              }
              str2 = str1 + str2;
            }
            else if ((localHashMap != null) && (localHashMap.size() > 0))
            {
              localObject3 = localHashMap.get(Integer.valueOf(((Picture)localObject1).b() - 1));
              if (localObject3 != null)
              {
                str2 = (String)localObject3;
                if ((paramHtmlSaveOptions.getImageOptions().d) && (((Picture)localObject1).getImageFormat() != paramHtmlSaveOptions.getImageOptions().getImageFormat()))
                {
                  str2 = zagn.e(((Shape)localObject1).getMsoDrawingType()) + this.a.getName() + "_" + zauj.z(i2) + "." + a(paramHtmlSaveOptions.getImageOptions());
                  str2 = zagn.d(str2);
                  try
                  {
                    a(paramzago, (Shape)localObject1, paramHtmlSaveOptions, str1, paramString2, str2);
                  }
                  catch (Exception localException4)
                  {
                    continue;
                  }
                  str2 = str1 + str2;
                }
                else
                {
                  Object localObject4 = this.j.h().get(Integer.valueOf(((Picture)localObject1).b() - 1));
                  if (localObject4 != null) {
                    this.l = ((String)localObject4);
                  }
                }
              }
            }
            break;
          case 24: 
            if ((localHashMap != null) && (localHashMap.size() > 0))
            {
              localObject3 = localHashMap.get(Integer.valueOf(((OleObject)localObject1).e() - 1));
              if (localObject3 != null)
              {
                str2 = (String)localObject3;
                if (((str2.endsWith(".emf")) || (str2.endsWith(".EMF"))) && (paramHtmlSaveOptions.getImageOptions().getImageFormat() != ImageFormat.getEmf()))
                {
                  str2 = zagn.e(((Shape)localObject1).getMsoDrawingType()) + this.a.getName() + "_" + zauj.z(i2) + "." + a(paramHtmlSaveOptions.getImageOptions());
                  str2 = zagn.d(str2);
                  try
                  {
                    a(paramzago, (Shape)localObject1, paramHtmlSaveOptions, str1, paramString2, str2);
                  }
                  catch (Exception localException5)
                  {
                    continue;
                  }
                  str2 = str1 + str2;
                }
                else
                {
                  Object localObject5 = this.j.h().get(Integer.valueOf(((OleObject)localObject1).e() - 1));
                  if (localObject5 != null) {
                    this.l = ((String)localObject5);
                  }
                }
              }
            }
            break;
          case 0: 
          case 1: 
          case 2: 
          case 3: 
          case 4: 
          case 5: 
          case 6: 
          case 7: 
          case 9: 
          case 11: 
          case 12: 
          case 14: 
          case 15: 
          case 16: 
          case 17: 
          case 18: 
          case 19: 
          case 20: 
          case 30: 
            str2 = zagn.e(((Shape)localObject1).getMsoDrawingType()) + this.a.getName() + "_" + zauj.z(i2) + ".";
            str2 = str2 + a(paramHtmlSaveOptions.getImageOptions());
            str2 = zagn.d(str2);
            try
            {
              a(paramzago, (Shape)localObject1, paramHtmlSaveOptions, str1, paramString2, str2);
            }
            catch (Exception localException2)
            {
              continue;
            }
            str2 = str1 + str2;
            break;
          case 25: 
            break;
          case 10: 
          case 13: 
          case 21: 
          case 22: 
          case 23: 
          case 26: 
          case 27: 
          case 28: 
          case 29: 
          default: 
            str2 = zagn.e(((Shape)localObject1).getMsoDrawingType()) + this.a.getName() + "_" + zauj.z(i2) + ".";
            str2 = str2 + a(paramHtmlSaveOptions.getImageOptions());
            str2 = zagn.d(str2);
            try
            {
              a(paramzago, (Shape)localObject1, paramHtmlSaveOptions, str1, paramString2, str2);
            }
            catch (Exception localException3)
            {
              continue;
            }
            str2 = str1 + str2;
          }
        }
        if (str2 != null)
        {
          if (this.l != null) {
            str2 = this.l;
          }
          zf.a(this.e, new zafr((Shape)localObject1, i2, str2));
        }
      }
    }
    i2 = this.e.size();
    Object localObject1 = new zafr[i2];
    for (int i3 = 0; i3 < i2; i3++)
    {
      zafr localzafr = (zafr)this.e.get(i3);
      localObject1[i3] = localzafr;
    }
    zafs localzafs = new zafs();
    za.a((Object[])localObject1, localzafs);
    this.e = new ArrayList(i2);
    for (int i4 = 0; i4 < i2; i4++) {
      zf.a(this.e, localObject1[i4]);
    }
  }
  
  private void a(zago paramzago, Shape paramShape, HtmlSaveOptions paramHtmlSaveOptions, String paramString1, String paramString2, String paramString3)
    throws Exception
  {
    ImageFormat localImageFormat = paramHtmlSaveOptions.getImageOptions().getImageFormat();
    Object localObject;
    if (paramzago.a() == 12)
    {
      if (!paramHtmlSaveOptions.getExportImagesAsBase64())
      {
        localObject = new StreamProviderOptions();
        ((StreamProviderOptions)localObject).a = (this.j.r + "/" + paramString3);
        this.j.x.initStream((StreamProviderOptions)localObject);
        this.l = ((StreamProviderOptions)localObject).b;
        paramShape.a(((StreamProviderOptions)localObject).c, paramHtmlSaveOptions.getImageOptions());
        this.j.x.closeStream((StreamProviderOptions)localObject);
      }
    }
    else
    {
      localObject = new zh();
      ImageOrPrintOptions localImageOrPrintOptions = new ImageOrPrintOptions();
      localImageOrPrintOptions.setChartImageType(localImageFormat);
      localImageOrPrintOptions.setImageFormat(localImageFormat);
      paramShape.a((zm)localObject, localImageOrPrintOptions);
      byte[] arrayOfByte = ((zh)localObject).o();
      paramzago.b().put(paramString2 + zw.a(paramString1, "\\", "/") + paramString3, arrayOfByte);
    }
  }
  
  static String a(ImageOrPrintOptions paramImageOrPrintOptions)
  {
    if (paramImageOrPrintOptions.getSaveFormat() == 22) {
      return "svg";
    }
    return a(paramImageOrPrintOptions.getImageFormat());
  }
  
  static String a(ImageFormat paramImageFormat)
  {
    if (paramImageFormat == ImageFormat.getBmp()) {
      return "bmp";
    }
    if (paramImageFormat == ImageFormat.getEmf()) {
      return "emf";
    }
    if (paramImageFormat == ImageFormat.getExif()) {
      return "exif";
    }
    if (paramImageFormat == ImageFormat.getGif()) {
      return "gif";
    }
    if (paramImageFormat == ImageFormat.getJpeg()) {
      return "jpg";
    }
    if (paramImageFormat == ImageFormat.getPng()) {
      return "png";
    }
    if (paramImageFormat == ImageFormat.getTiff()) {
      return "tiff";
    }
    if (paramImageFormat == ImageFormat.getWmf()) {
      return "wmf";
    }
    if (paramImageFormat == ImageFormat.getIcon()) {
      return "svg";
    }
    return "png";
  }
  
  private int h()
  {
    Cells localCells = this.a.getCells();
    int i1 = 0;
    int i2 = localCells.getRows().getCount();
    for (int i3 = i2 - 1; i3 >= 0; i3--)
    {
      localObject = localCells.getRows().getRowByIndex(i3);
      if ((!((Row)localObject).isBlank()) || (a((Row)localObject)))
      {
        i1 = ((Row)localObject).getIndex();
        break;
      }
    }
    zapd localzapd = this.a.getCells().o();
    if ((localzapd != null) && (localzapd.getCount() > 0))
    {
      localObject = localzapd.a(localzapd.getCount() - 1);
      if ((i1 < ((CellArea)localObject).EndRow) && (((CellArea)localObject).EndRow <= this.a.getCells().getMaxRow())) {
        i1 = ((CellArea)localObject).EndRow;
      }
    }
    Object localObject = this.a.w();
    if ((localObject != null) && (((ShapeCollection)localObject).getCount() > 0)) {
      for (int i4 = 0; i4 < ((ShapeCollection)localObject).getCount(); i4++)
      {
        Shape localShape = ((ShapeCollection)localObject).get(i4);
        int i5 = localShape.getLowerRightRow();
        if (i5 > i1) {
          i1 = i5;
        }
      }
    }
    return i1;
  }
  
  private boolean a(Row paramRow)
  {
    Iterator localIterator = paramRow.iterator();
    while (localIterator.hasNext())
    {
      Cell localCell = (Cell)localIterator.next();
      if (localCell.q()) {
        return true;
      }
    }
    return false;
  }
  
  private int i()
    throws Exception
  {
    Cells localCells = this.a.getCells();
    int i1 = 0;
    Object localObject;
    for (int i2 = 0; i2 < localCells.getRows().getCount(); i2++)
    {
      Row localRow = localCells.getRows().getRowByIndex(i2);
      for (int i4 = localRow.a() - 1; i4 >= 0; i4--)
      {
        localObject = localRow.getCellByIndex(i4);
        Style localStyle = ((Cell)localObject).p();
        if (((Cell)localObject).getType() != 3)
        {
          int i7 = ((Cell)localObject).getColumn();
          if ((!localStyle.isTextWrapped()) && (((Cell)localObject).getType() == 5))
          {
            String str = ((Cell)localObject).getStringValue();
            StringBuilder localStringBuilder = new StringBuilder(str.length() + 100);
            int i8 = 0;
            if (((Cell)localObject).isRichText())
            {
              ArrayList localArrayList = ((Cell)localObject).I();
              for (int i10 = 0; i10 < localArrayList.size(); i10++)
              {
                zqb localzqb = (zqb)localArrayList.get(i10);
                localzqb.c = this.j.e().a(localzqb.b, localzqb.a);
                i8 += localzqb.c;
              }
            }
            else
            {
              i8 = this.j.e().a(((Cell)localObject).p(), str);
            }
            int i9 = a(i7);
            if (i8 > i9)
            {
              Cell localCell = null;
              if (localObject != null) {
                if ((((Cell)localObject).d.p().p().f() == 0) && (((Cell)localObject).getColumn() < 255)) {
                  localCell = this.a.getCells().get(((Cell)localObject).getRow(), ((Cell)localObject).getColumn() + 1);
                } else if ((((Cell)localObject).d.p().p().f() == 1) && (((Cell)localObject).getColumn() < 16383)) {
                  localCell = this.a.getCells().get(((Cell)localObject).getRow(), ((Cell)localObject).getColumn() + 1);
                }
              }
              int i11 = 0;
              Column localColumn = null;
              while ((localCell != null) && (zagn.b(((Cell)localObject).getDisplayStyle(), localCell.getDisplayStyle())) && (null == localCell.getValue()))
              {
                localColumn = this.a.getCells().checkColumn(localCell.getColumn());
                if (null == localColumn) {
                  i11 += this.a.getCells().getStandardWidthPixels();
                } else {
                  i11 += localColumn.a(true);
                }
                if (localColumn != null)
                {
                  localColumn = null;
                  i7++;
                }
                if ((i11 + i9 > i8) || (localCell.getColumn() >= 255)) {
                  break;
                }
                localCell = this.a.getCells().get(localCell.getRow(), localCell.getColumn() + 1);
              }
            }
          }
          if (i1 >= i7) {
            break;
          }
          i1 = i7;
          break;
        }
        if ((localStyle != null) && (zagn.a(localStyle, this.j.i())))
        {
          if (i1 >= ((Cell)localObject).getColumn()) {
            break;
          }
          i1 = ((Cell)localObject).getColumn();
          break;
        }
      }
    }
    zapd localzapd = this.a.getCells().o();
    if (localzapd != null) {
      for (int i3 = 0; i3 < localzapd.getCount(); i3++)
      {
        CellArea localCellArea = localzapd.a(i3);
        if ((i1 < localCellArea.EndColumn) && (((b().c().p().f() == 0) && (localCellArea.EndColumn != 255)) || ((b().c().p().f() == 1) && (localCellArea.EndColumn != 16383)))) {
          i1 = localCellArea.EndColumn;
        }
      }
    }
    ShapeCollection localShapeCollection = this.a.w();
    if ((localShapeCollection != null) && (localShapeCollection.getCount() > 0)) {
      for (int i5 = 0; i5 < localShapeCollection.getCount(); i5++)
      {
        localObject = localShapeCollection.get(i5);
        if (!(localObject instanceof CommentShape))
        {
          int i6 = ((Shape)localObject).getLowerRightColumn();
          if (i6 > i1) {
            i1 = i6;
          }
        }
      }
    }
    return i1;
  }
  
  private zafn a(Column paramColumn)
  {
    zafn localzafn = new zafn();
    localzafn.a = paramColumn.getIndex();
    localzafn.e = paramColumn.c();
    localzafn.f = paramColumn.f();
    localzafn.c = a(paramColumn.getIndex());
    if (paramColumn.isHidden())
    {
      localzafn.d = true;
      localzafn.c = 0;
    }
    if ((paramColumn.c() == 15) && (localzafn.c == this.a.getCells().getStandardWidthPixels())) {
      localzafn.g = true;
    }
    return localzafn;
  }
  
  private zafn b(int paramInt)
  {
    zafn localzafn = new zafn();
    localzafn.a = paramInt;
    localzafn.e = 15;
    localzafn.f = this.a.d().getDefaultStyle();
    localzafn.c = this.a.getCells().getStandardWidthPixels();
    localzafn.g = true;
    return localzafn;
  }
  
  private zafn c(int paramInt)
  {
    int i1 = this.a.getCells().getColumns().e(paramInt);
    if (i1 < 0) {
      return b(paramInt);
    }
    Column localColumn = this.a.getCells().getColumns().getColumnByIndex(i1);
    return a(localColumn);
  }
  
  private void j()
  {
    Object localObject = null;
    for (int i1 = 0; i1 <= this.h; i1++)
    {
      zafn localzafn = c(i1);
      if ((localObject != null) && (((zafn)localObject).a(localzafn)))
      {
        localObject.b += 1;
      }
      else
      {
        if (localObject != null) {
          zf.a(this.i, localObject);
        }
        localObject = localzafn;
      }
    }
    if (localObject != null) {
      zf.a(this.i, localObject);
    }
  }
  
  ArrayList e()
  {
    return this.i;
  }
  
  long f()
  {
    long l1 = 0L;
    for (int i1 = 0; i1 <= this.h; i1++) {
      l1 += a(i1);
    }
    return l1;
  }
  
  private void k()
  {
    HyperlinkCollection localHyperlinkCollection = this.a.getHyperlinks();
    int i1 = localHyperlinkCollection.getCount();
    if (i1 == 0)
    {
      this.c = null;
      return;
    }
    Hyperlink[] arrayOfHyperlink = new Hyperlink[i1];
    for (int i2 = 0; i2 < i1; i2++)
    {
      Hyperlink localHyperlink = localHyperlinkCollection.get(i2);
      arrayOfHyperlink[i2] = localHyperlink;
    }
    zafp localzafp = new zafp();
    za.a(arrayOfHyperlink, localzafp);
    this.c = new ArrayList(i1);
    for (int i3 = 0; i3 < i1; i3++) {
      zf.a(this.c, arrayOfHyperlink[i3]);
    }
  }
  
  private void l()
  {
    ArrayList localArrayList = this.j.j();
    int i1 = localArrayList.size();
    if (i1 == 0)
    {
      this.d = null;
      return;
    }
    CellArea[] arrayOfCellArea1 = new CellArea[i1];
    int i2 = 0;
    for (int i3 = 0; i3 < i1; i3++)
    {
      String str = null;
      Object localObject = null;
      Hyperlink localHyperlink = (Hyperlink)localArrayList.get(i3);
      String[] arrayOfString = { str };
      CellArea[] arrayOfCellArea2 = { localObject };
      boolean bool = zagn.a(this.j.j.getWorksheets(), localHyperlink, arrayOfString, arrayOfCellArea2);
      str = arrayOfString[0];
      localObject = arrayOfCellArea2[0];
      if ((bool) && (zw.b(str, this.a.getName())))
      {
        arrayOfCellArea1[i2] = localObject;
        i2++;
      }
    }
    if (i2 == 0) {
      return;
    }
    zafm localzafm = new zafm();
    za.a(arrayOfCellArea1, 0, i2, localzafm);
    this.d = new ArrayList(i2);
    for (int i4 = 0; i4 < i2; i4++) {
      zf.a(this.d, arrayOfCellArea1[i4]);
    }
  }
  
  private void m()
  {
    zapd localzapd = this.a.getCells().o();
    int i1 = localzapd.getCount();
    if (i1 == 0)
    {
      this.b = null;
      return;
    }
    CellArea[] arrayOfCellArea = new CellArea[i1];
    for (int i2 = 0; i2 < i1; i2++)
    {
      CellArea localCellArea = localzapd.a(i2);
      arrayOfCellArea[i2] = localCellArea;
    }
    zafm localzafm = new zafm();
    za.a(arrayOfCellArea, localzafm);
    this.b = new ArrayList(i1);
    for (int i3 = 0; i3 < i1; i3++) {
      zf.a(this.b, arrayOfCellArea[i3]);
    }
  }
  
  private void a(zafq paramzafq)
  {
    if (this.b == null) {
      return;
    }
    int i1 = paramzafq.d();
    int i2 = this.b.size();
    paramzafq.a = new ArrayList(i2);
    ArrayList localArrayList = new ArrayList(i2);
    for (int i3 = 0; i3 < i2; i3++)
    {
      CellArea localCellArea = (CellArea)this.b.get(i3);
      if ((i1 >= localCellArea.StartRow) && (i1 <= localCellArea.EndRow))
      {
        zf.a(paramzafq.a, localCellArea);
      }
      else
      {
        if (i1 < localCellArea.StartRow) {
          break;
        }
        if (i1 > localCellArea.EndRow) {
          zf.a(localArrayList, localCellArea);
        }
      }
    }
    for (i3 = 0; i3 < localArrayList.size(); i3++) {
      this.b.remove(localArrayList.get(i3));
    }
    if (this.b.size() == 0) {
      this.b = null;
    }
  }
  
  private void b(zafq paramzafq)
  {
    if (this.d == null) {
      return;
    }
    int i1 = paramzafq.d();
    int i2 = this.d.size();
    paramzafq.c = new ArrayList(i2);
    ArrayList localArrayList = new ArrayList(i2);
    for (int i3 = 0; i3 < i2; i3++)
    {
      CellArea localCellArea = (CellArea)this.d.get(i3);
      if ((i1 >= localCellArea.StartRow) && (i1 <= localCellArea.EndRow))
      {
        zf.a(paramzafq.c, localCellArea);
      }
      else
      {
        if (i1 < localCellArea.StartRow) {
          break;
        }
        if (i1 > localCellArea.EndRow) {
          zf.a(localArrayList, localCellArea);
        }
      }
    }
    for (i3 = 0; i3 < localArrayList.size(); i3++) {
      this.d.remove(localArrayList.get(i3));
    }
    if (this.d.size() == 0) {
      this.d = null;
    }
  }
  
  private void c(zafq paramzafq)
  {
    if (this.c == null) {
      return;
    }
    int i1 = paramzafq.d();
    int i2 = this.c.size();
    paramzafq.b = new ArrayList(i2);
    ArrayList localArrayList = new ArrayList(i2);
    for (int i3 = 0; i3 < i2; i3++)
    {
      Hyperlink localHyperlink = (Hyperlink)this.c.get(i3);
      CellArea localCellArea = localHyperlink.getArea();
      if ((i1 >= localCellArea.StartRow) && (i1 <= localCellArea.EndRow))
      {
        zf.a(paramzafq.b, localHyperlink);
      }
      else
      {
        if (i1 < localCellArea.StartRow) {
          break;
        }
        if (i1 > localCellArea.EndRow) {
          zf.a(localArrayList, localHyperlink);
        }
      }
    }
    for (i3 = 0; i3 < localArrayList.size(); i3++) {
      this.c.remove(localArrayList.get(i3));
    }
    if (this.c.size() == 0) {
      this.c = null;
    }
  }
  
  private void d(zafq paramzafq)
  {
    if (this.e == null) {
      return;
    }
    int i1 = paramzafq.d();
    int i2 = this.e.size();
    paramzafq.d = new ArrayList(i2);
    ArrayList localArrayList = new ArrayList(i2);
    for (int i3 = 0; i3 < i2; i3++)
    {
      zafr localzafr = (zafr)this.e.get(i3);
      if (i1 == localzafr.a())
      {
        zf.a(localArrayList, localzafr);
        zf.a(paramzafq.d, localzafr);
      }
      else if (i1 < localzafr.a())
      {
        if (paramzafq.a == null) {
          break;
        }
        for (int i4 = 0; i4 < paramzafq.a.size(); i4++)
        {
          CellArea localCellArea = (CellArea)paramzafq.a.get(i4);
          if ((localCellArea.StartRow <= localzafr.a()) && ((localCellArea.EndRow >= localzafr.b()) || ((localCellArea.EndRow >= localzafr.a()) && (localCellArea.EndRow < localzafr.b()))) && (localCellArea.StartColumn <= localzafr.c()) && ((localCellArea.EndColumn >= localzafr.d()) || ((localCellArea.EndColumn < localzafr.d()) && (localCellArea.EndColumn >= localzafr.c()))))
          {
            zf.a(localArrayList, localzafr);
            zf.a(paramzafq.d, localzafr);
          }
        }
      }
      else if (i1 > localzafr.a())
      {
        zf.a(localArrayList, localzafr);
      }
    }
    for (i3 = 0; i3 < localArrayList.size(); i3++) {
      this.e.remove(localArrayList.get(i3));
    }
    if (this.e.size() == 0) {
      this.e = null;
    }
  }
  
  zafq a(Row paramRow, int paramInt)
  {
    zafq localzafq = new zafq(this.j, this, paramRow, paramInt, this.j.c(), this.m);
    a(localzafq);
    c(localzafq);
    b(localzafq);
    d(localzafq);
    return localzafq;
  }
  
  int a(int paramInt1, int paramInt2)
  {
    int i1 = 0;
    for (int i2 = paramInt1; i2 < paramInt2; i2++) {
      i1 += a(i2);
    }
    return i1;
  }
  
  int a(int paramInt)
  {
    Object localObject = this.k.get(Integer.valueOf(paramInt));
    if (localObject != null) {
      return ((Integer)localObject).intValue();
    }
    int i1 = this.a.getCells().getColumnWidthPixel(paramInt);
    if ((i1 == 0) && (this.j.c().getHiddenColDisplayType() == 1)) {
      i1 = this.a.getCells().getColumns().get(paramInt).a();
    }
    this.k.put(Integer.valueOf(paramInt), Integer.valueOf(i1));
    return i1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaft.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */