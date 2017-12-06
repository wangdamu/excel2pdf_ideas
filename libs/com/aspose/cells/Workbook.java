package com.aspose.cells;

import com.aspose.cells.a.c.zl;
import com.aspose.cells.a.c.zu;
import com.aspose.cells.a.c.zx;
import com.aspose.cells.a.c.zy;
import com.aspose.cells.a.f.zi;
import com.aspose.cells.b.a.d.za;
import com.aspose.cells.b.a.d.zc;
import com.aspose.cells.b.a.d.zd;
import com.aspose.cells.b.a.d.zk;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.d.zn;
import com.aspose.cells.b.a.zg;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Workbook
  implements com.aspose.cells.b.a.zj
{
  private WorkbookSettings j;
  zqw a = null;
  private WorksheetCollection k;
  private String l = "";
  private DataSorter m;
  zrs b = null;
  boolean c = false;
  int d = 6;
  private int n = 1;
  private InterruptMonitor o;
  ContentTypePropertyCollection e;
  CustomXmlPartCollection f;
  private String p;
  ExternalConnectionCollection g;
  private DigitalSignatureCollection q;
  boolean h;
  zbzp i;
  private HashMap r = new HashMap();
  private static byte[] s = { 14, 61, 42, 39, 62, 42, 63, 34, 36, 37, 107, 4, 37, 39, 50, 101, 107, 8, 57, 46, 42, 63, 46, 47, 107, 60, 34, 63, 35, 107, 10, 56, 59, 36, 56, 46, 101, 8, 46, 39, 39, 56, 107, 45, 36, 57, 107, 1, 42, 61, 42, 101, 8, 36, 59, 50, 57, 34, 44, 35, 63, 107, 121, 123, 123, 120, 107, 102, 107, 121, 123, 122, 125, 107, 10, 56, 59, 36, 56, 46, 107, 27, 63, 50, 107, 7, 63, 47, 101 };
  private boolean t = false;
  
  public WorkbookSettings getSettings()
  {
    return this.j;
  }
  
  public Workbook()
  {
    this(6);
  }
  
  public Workbook(int fileFormatType)
  {
    b(fileFormatType);
    this.j = new WorkbookSettings(this, null);
    this.k = new WorksheetCollection(this);
    this.k.t();
    this.b = new zrs(true);
  }
  
  public Workbook(String file)
    throws Exception
  {
    a(file, new LoadOptions());
  }
  
  public Workbook(InputStream stream)
    throws Exception
  {
    com.aspose.cells.b.a.d.zh localzh = new com.aspose.cells.b.a.d.zh(stream);
    a(localzh, new LoadOptions(), true);
  }
  
  public Workbook(String file, LoadOptions loadOptions)
    throws Exception
  {
    a(file, loadOptions);
  }
  
  public Workbook(InputStream stream, LoadOptions loadOptions)
    throws Exception
  {
    com.aspose.cells.b.a.d.zh localzh = new com.aspose.cells.b.a.d.zh(stream);
    a(localzh, loadOptions, true);
  }
  
  Workbook(zm stream, LoadOptions loadOptions)
    throws Exception
  {
    a(stream, loadOptions, true);
  }
  
  /**
   * @deprecated
   */
  public void initialize()
  {
    this.l = "";
    this.k.clear();
    this.k = null;
    this.j = new WorkbookSettings(this, null);
    this.k = new WorksheetCollection(this);
    this.k.t();
    this.a = null;
  }
  
  private void a(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      b(paramInt);
      this.j.a(paramInt, this.n, true);
    }
    else
    {
      this.l = "";
      this.k = new WorksheetCollection(this);
      this.k.t();
      b(paramInt);
      this.j.a(paramInt, this.n, false);
      this.a = null;
      this.c = false;
    }
  }
  
  void a()
  {
    c();
    b();
  }
  
  void b()
  {
    if (this.j.c)
    {
      Iterator localIterator = this.k.iterator();
      while (localIterator.hasNext())
      {
        Worksheet localWorksheet = (Worksheet)localIterator.next();
        localWorksheet.getCells().a.f = null;
      }
    }
  }
  
  void c()
  {
    if ((this.j.getParsingFormulaOnOpen()) || (this.j.a) || (f() != 1)) {
      return;
    }
    for (int i1 = this.k.getCount() - 1; i1 > -1; i1--)
    {
      Cells localCells = this.k.get(i1).getCells();
      zabw localzabw = localCells.a;
      if (localzabw.c >= 1)
      {
        zahb localzahb = localCells.getRows().a;
        for (int i2 = localzabw.d - 1; i2 > -1; i2--)
        {
          zaai localzaai = localzabw.b[i2];
          if ((localzaai != null) && (localzaai.i()))
          {
            Cell localCell = localzahb.a(localzaai.e, localzaai.f);
            if ((localCell != null) && (localCell.c.d == localzaai)) {
              localzaai.a(getWorksheets(), i1);
            } else {
              localzabw.b(i2);
            }
          }
        }
      }
    }
    getSettings().a = true;
  }
  
  private void a(String paramString, LoadOptions paramLoadOptions)
    throws Exception
  {
    a(paramString);
    this.j = new WorkbookSettings(this, paramLoadOptions.a());
    this.j.d = paramLoadOptions;
    this.j.setMemorySetting(paramLoadOptions.getMemorySetting());
    getSettings().m = paramLoadOptions.c;
    getSettings().setPassword(paramLoadOptions.getPassword());
    getSettings().setParsingFormulaOnOpen(paramLoadOptions.getParsingFormulaOnOpen());
    getSettings().setLanguageCode(paramLoadOptions.getLanguageCode());
    getSettings().setWarningCallback(paramLoadOptions.getWarningCallback());
    if (paramLoadOptions.e) {
      getSettings().b(paramLoadOptions.getStandardFont());
    }
    if (paramLoadOptions.f) {
      getSettings().a(paramLoadOptions.getStandardFontSize());
    }
    this.j.o = paramLoadOptions.getIgnoreNotPrinted();
    this.j.p = paramLoadOptions.b();
    this.j.setCheckExcelRestriction(paramLoadOptions.getCheckExcelRestriction());
    this.o = paramLoadOptions.getInterruptMonitor();
    this.k = new WorksheetCollection(this);
    this.k.t();
    this.b = new zrs(true);
    com.aspose.cells.b.a.d.ze localze = null;
    try
    {
      localze = zd.a(zit.a(paramString), 3, 1, 3);
      if (localze.h() == 0L) {
        return;
      }
      if (paramLoadOptions.getLoadFormat() == 0)
      {
        int i1 = 0;
        int i2 = 0;
        boolean[] arrayOfBoolean = { i1 };
        int[] arrayOfInt = { i2 };
        paramLoadOptions.a(zamm.a(paramString, localze, arrayOfBoolean, arrayOfInt));
        i1 = arrayOfBoolean[0];
        i2 = arrayOfInt[0];
        if (i1 != 0)
        {
          if (paramLoadOptions.getLoadFormat() == 5)
          {
            boolean bool = false;
            zxf localzxf = new zxf(localze);
            Object localObject2;
            if (localzxf.a().a("EncryptionInfo") != null)
            {
              bool = true;
              localObject2 = zto.a(localzxf, this.j.getPassword());
              int i3 = 6;
              a((zm)localObject2);
              zqw localzqw = this.a;
              zi localzi = localzqw.a.b;
              String str = "xl/workbook.bin";
              if (localzi.a(str, true) != -1) {
                i3 = 16;
              }
              paramLoadOptions.a(i3);
              switch (i3)
              {
              case 16: 
                a(16, true);
                this.a = localzqw;
                zchd.a(this, paramLoadOptions);
                break;
              default: 
                a(6, true);
                if (paramLoadOptions.getLoadDataAndFormatting())
                {
                  zalr.a(this, localzi, paramLoadOptions.getLoadDataOptions());
                }
                else
                {
                  this.a = localzqw;
                  zalp.a(this, paramLoadOptions);
                }
                break;
              }
            }
            else
            {
              if (zcal.a(localzxf) == null)
              {
                if (localzxf.a().a("WordDocument") != null) {
                  throw new CellsException(4, "This is a word doc file.");
                }
                if (localzxf.a().a("PowerPoint Document") != null) {
                  throw new CellsException(4, "This is a PowerPoint file.");
                }
                throw new CellsException(4, "This file's format is not supported or you don't specify a correct format.");
              }
              a(5, true);
              if (paramLoadOptions.getLoadDataAndFormatting())
              {
                localObject2 = new zrd(this, paramLoadOptions.getLoadDataOptions());
                ((zrd)localObject2).a(localzxf);
              }
              else if (paramLoadOptions.getOnlyLoadDocumentProperties())
              {
                b(localzxf);
                getWorksheets().a(localzxf);
              }
              else
              {
                localObject2 = new zcal(this, paramLoadOptions);
                ((zcal)localObject2).b(localzxf);
                getWorksheets().a(localzxf);
                bool = ((zcal)localObject2).d;
              }
            }
            if (!bool) {
              getSettings().setPassword(null);
            }
          }
          else
          {
            Object localObject1;
            if (paramLoadOptions.getLoadFormat() == 13)
            {
              localObject1 = new zaoi(this, paramLoadOptions);
              ((zaoi)localObject1).a(paramString);
            }
            else if (paramLoadOptions.getLoadFormat() == 12)
            {
              localObject1 = new zagl(this, paramLoadOptions);
              ((zagl)localObject1).a(paramString);
            }
            else
            {
              a(localze, paramLoadOptions, false);
              return;
            }
          }
          double d1 = localze.h() / 1048576.0D;
          zapk.a().a(d1);
        }
        else
        {
          switch (i2)
          {
          case 2057: 
            throw new CellsException(19, "This Excel file contains (Excel95 or earlier file format) records.");
          case 1033: 
            throw new CellsException(19, "This Excel file contains (Excel4.0 or earlier file format) records.");
          case 521: 
            throw new CellsException(19, "This Excel file contains (Excel3.0 or earlier file format) records.");
          case 9: 
            throw new CellsException(19, "This Excel file contains (Excel2.1 or earlier file format) records.");
          }
          throw new CellsException(4, "This file's format is not supported or you don't specify a correct format.");
        }
      }
      else
      {
        a(localze, paramLoadOptions, false);
      }
    }
    finally
    {
      if (localze != null) {
        localze.a();
      }
    }
  }
  
  private void a(zm paramzm, LoadOptions paramLoadOptions, boolean paramBoolean)
    throws Exception
  {
    if (paramBoolean) {
      this.j = new WorkbookSettings(this, paramLoadOptions.a());
    }
    double d1 = paramzm.h() / 1048576.0D;
    zapk.a().a(d1);
    this.j.d = paramLoadOptions;
    getSettings().setPassword(paramLoadOptions.getPassword());
    getSettings().setParsingFormulaOnOpen(paramLoadOptions.getParsingFormulaOnOpen());
    getSettings().setLanguageCode(paramLoadOptions.getLanguageCode());
    getSettings().setRegion(paramLoadOptions.getRegion());
    getSettings().m = paramLoadOptions.c;
    getSettings().setMemorySetting(paramLoadOptions.getMemorySetting());
    getSettings().setWarningCallback(paramLoadOptions.getWarningCallback());
    if (paramLoadOptions.e) {
      getSettings().b(paramLoadOptions.getStandardFont());
    }
    if (paramLoadOptions.f) {
      getSettings().a(paramLoadOptions.getStandardFontSize());
    }
    this.j.o = paramLoadOptions.getIgnoreNotPrinted();
    this.j.p = paramLoadOptions.b();
    this.j.setCheckExcelRestriction(paramLoadOptions.getCheckExcelRestriction());
    this.o = paramLoadOptions.getInterruptMonitor();
    if (paramBoolean)
    {
      this.k = new WorksheetCollection(this);
      this.k.t();
      this.b = new zrs(true);
    }
    boolean bool = false;
    if (paramzm.h() == 0L) {
      return;
    }
    zl.c("Initialization of workbook finished.");
    if (paramLoadOptions.getLoadFormat() == 0)
    {
      int i1 = 0;
      if (!paramzm.e())
      {
        byte[] arrayOfByte = new byte[(int)paramzm.h()];
        i3 = 0;
        int i4 = 0;
        while (i4 > 0)
        {
          i4 = paramzm.a(arrayOfByte, i3, arrayOfByte.length - i3);
          i3 += i4;
        }
        paramzm = new com.aspose.cells.b.a.d.zh(arrayOfByte);
        i1 = 1;
      }
      paramzm.a(0L, 0);
      int i2 = 0;
      int i3 = 0;
      boolean[] arrayOfBoolean = { i2 };
      int[] arrayOfInt = { i3 };
      paramLoadOptions.a(zamm.a(null, paramzm, arrayOfBoolean, arrayOfInt));
      i2 = arrayOfBoolean[0];
      i3 = arrayOfInt[0];
      if (i2 != 0)
      {
        Object localObject3;
        Object localObject4;
        if (paramLoadOptions.getLoadFormat() == 6)
        {
          if (i1 == 0)
          {
            localObject3 = new com.aspose.cells.b.a.d.zh();
            zx.a(paramzm, (zm)localObject3);
            ((com.aspose.cells.b.a.d.zh)localObject3).b(0L);
            paramzm = (zm)localObject3;
          }
          a(paramzm);
          localObject3 = this.a;
          localObject4 = ((zqw)localObject3).a.b;
          if (((zi)localObject4).a("xl/workbook.xml", true) != -1)
          {
            a(6, true);
            if (paramLoadOptions.getLoadDataAndFormatting())
            {
              zalr.a(this, (zi)localObject4, paramLoadOptions.getLoadDataOptions());
            }
            else
            {
              this.a = ((zqw)localObject3);
              zalp.a(this, paramLoadOptions);
            }
            return;
          }
          if (((zi)localObject4).a("xl/workbook.bin", true) != -1)
          {
            a(16, true);
            this.a = ((zqw)localObject3);
            zchd.a(this, paramLoadOptions);
            return;
          }
          if (((zi)localObject4).a("content.xml", true) != -1)
          {
            a(14, true);
            zatq localzatq = new zatq(this);
            localzatq.a((zi)localObject4);
            return;
          }
        }
        else if (paramLoadOptions.getLoadFormat() == 5)
        {
          localObject3 = new zxf(paramzm);
          if (((zxf)localObject3).a().a("EncryptionInfo") != null)
          {
            paramLoadOptions.a(6);
            bool = true;
            localObject4 = zto.a((zxf)localObject3, this.j.getPassword());
            int i5 = 6;
            a((zm)localObject4);
            zqw localzqw = this.a;
            zi localzi = localzqw.a.b;
            String str = "xl/workbook.bin";
            if (localzi.a(str, true) != -1)
            {
              i5 = 16;
              paramLoadOptions.a(i5);
            }
            switch (i5)
            {
            case 16: 
              a(16, true);
              this.a = localzqw;
              zchd.a(this, paramLoadOptions);
              break;
            default: 
              a(6, true);
              if (paramLoadOptions.getLoadDataAndFormatting())
              {
                zalr.a(this, localzi, paramLoadOptions.getLoadDataOptions());
              }
              else
              {
                this.a = localzqw;
                zalp.a(this, paramLoadOptions);
              }
              break;
            }
          }
          else
          {
            if (zcal.a((zxf)localObject3) == null)
            {
              if (((zxf)localObject3).a().a("WordDocument") != null) {
                throw new CellsException(4, "This is a word doc file.");
              }
              if (((zxf)localObject3).a().a("PowerPoint Document") != null) {
                throw new CellsException(4, "This is a PowerPoint file.");
              }
              throw new CellsException(4, "This file's format is not supported or you don't specify a correct format.");
            }
            a(5, true);
            if (paramLoadOptions.getLoadDataAndFormatting())
            {
              localObject4 = new zrd(this, paramLoadOptions.getLoadDataOptions());
              ((zrd)localObject4).a((zxf)localObject3);
            }
            else if (paramLoadOptions.getOnlyLoadDocumentProperties())
            {
              b((zxf)localObject3);
              getWorksheets().a((zxf)localObject3);
            }
            else
            {
              localObject4 = new zcal(this, paramLoadOptions);
              ((zcal)localObject4).b((zxf)localObject3);
              getWorksheets().a((zxf)localObject3);
              bool = ((zcal)localObject4).d;
            }
          }
        }
      }
      else
      {
        switch (i3)
        {
        case 2057: 
          throw new CellsException(19, "This Excel file contains (Excel95 or earlier file format) records.");
        case 1033: 
          throw new CellsException(19, "This Excel file contains (Excel4.0 or earlier file format) records.");
        case 521: 
          throw new CellsException(19, "This Excel file contains (Excel3.0 or earlier file format) records.");
        case 9: 
          throw new CellsException(19, "This Excel file contains (Excel2.1 or earlier file format) records.");
        }
        throw new CellsException(4, "This file's format is not supported or you don't specify a correct format.");
      }
    }
    Object localObject1;
    zn localzn;
    if ((paramLoadOptions instanceof TxtLoadOptions))
    {
      localObject1 = (TxtLoadOptions)paramLoadOptions;
      a(1, true);
      if (!((TxtLoadOptions)localObject1).a) {
        getSettings().a(((TxtLoadOptions)localObject1).getEncoding());
      }
      localzn = new zn(paramzm, getSettings().g());
      zbyz.a(localzn, this.k.get(0).getCells(), 0, 0, (TxtLoadOptions)localObject1);
      return;
    }
    switch (paramLoadOptions.getLoadFormat())
    {
    case 1: 
      a(1, true);
      localObject1 = new TxtLoadOptions();
      ((TxtLoadOptions)localObject1).setConvertNumericData(paramLoadOptions.getConvertNumericData());
      if (getSettings().l)
      {
        localzn = new zn(paramzm);
      }
      else
      {
        localzn = new zn(paramzm, getSettings().g());
        ((TxtLoadOptions)localObject1).setEncoding(getSettings().g());
      }
      zbyz.a(localzn, this.k.get(0).getCells(), 0, 0, (TxtLoadOptions)localObject1);
      break;
    case 11: 
      a(11, true);
      localObject1 = new TxtLoadOptions();
      ((TxtLoadOptions)localObject1).setConvertNumericData(paramLoadOptions.getConvertNumericData());
      if (getSettings().l)
      {
        localzn = new zn(paramzm);
      }
      else
      {
        localzn = new zn(paramzm, getSettings().g());
        ((TxtLoadOptions)localObject1).setEncoding(getSettings().g());
      }
      ((TxtLoadOptions)localObject1).setSeparator('\t');
      zbyz.a(localzn, this.k.get(0).getCells(), 0, 0, (TxtLoadOptions)localObject1);
      break;
    case 6: 
      a(6, true);
      localObject1 = new za(paramzm);
      long l1 = ((za)localObject1).s();
      paramzm.a(0L, 0);
      if (l1 == -2226271756974174256L) {
        paramzm = zto.a(new zxf(paramzm), this.j.getPassword());
      }
      if (paramLoadOptions.getLoadDataAndFormatting())
      {
        zalr.a(this, paramzm, paramLoadOptions.getLoadDataOptions());
      }
      else
      {
        a(paramzm);
        zalp.a(this, paramLoadOptions);
      }
      break;
    case 5: 
      a(5, true);
      localObject1 = new zxf(paramzm);
      Object localObject2;
      if (paramLoadOptions.getLoadDataAndFormatting())
      {
        localObject2 = new zrd(this, paramLoadOptions.getLoadDataOptions());
        ((zrd)localObject2).a((zxf)localObject1);
      }
      else if (paramLoadOptions.getOnlyLoadDocumentProperties())
      {
        b((zxf)localObject1);
        getWorksheets().a((zxf)localObject1);
      }
      else
      {
        localObject2 = new zcal(this, paramLoadOptions);
        ((zcal)localObject2).b((zxf)localObject1);
        getWorksheets().a((zxf)localObject1);
        bool = ((zcal)localObject2).d;
      }
      break;
    case 16: 
      a(16, true);
      localObject1 = new za(paramzm);
      long l2 = ((za)localObject1).s();
      paramzm.a(0L, 0);
      if (l2 == -2226271756974174256L) {
        paramzm = zto.a(new zxf(paramzm), this.j.getPassword());
      }
      a(paramzm);
      zchd.a(this, paramLoadOptions);
      break;
    case 12: 
      localObject1 = new zagl(this, paramLoadOptions);
      ((zagl)localObject1).a(paramzm);
      break;
    case 13: 
      localObject1 = new zaoi(this, paramLoadOptions);
      ((zaoi)localObject1).a(paramzm);
      break;
    case 15: 
      a(15, true);
      localObject1 = new zbeg();
      ((zbeg)localObject1).a(paramzm, this);
      break;
    case 14: 
      a(14, true);
      localObject1 = new zatq(this);
      ((zatq)localObject1).a(paramzm);
      break;
    case 56: 
      a(56, true);
      zaku localzaku = new zaku(this, paramzm, paramLoadOptions);
      localzaku.a();
      break;
    default: 
      throw new CellsException(4, "This file's format is not supported or you don't specify a correct format.");
    }
    if (!bool) {
      getSettings().setPassword(null);
    }
  }
  
  private void b(zxf paramzxf)
    throws Exception
  {
    zcal.a(paramzxf, getWorksheets());
  }
  
  public void save(String fileName, int saveFormat)
    throws Exception
  {
    SaveOptions localSaveOptions = FileFormatUtil.a(fileName, getFileFormat(), saveFormat, null);
    save(fileName, localSaveOptions);
  }
  
  public void save(String fileName)
    throws Exception
  {
    String str = zk.d(fileName);
    int i1 = FileFormatUtil.a(str, this.d);
    save(fileName, FileFormatUtil.a(i1, null));
  }
  
  public void save(String fileName, SaveOptions saveOptions)
    throws Exception
  {
    if (saveOptions.getCreateDirectory())
    {
      String str = zk.e(fileName);
      if (!zc.a(str)) {
        zc.b(str);
      }
    }
    if ((saveOptions instanceof OoxmlSaveOptions))
    {
      switch (saveOptions.getSaveFormat())
      {
      case 6: 
      case 7: 
      case 8: 
      case 9: 
      case 10: 
        break;
      default: 
        int i1 = FileFormatUtil.extensionToSaveFormat(zk.d(fileName));
        switch (i1)
        {
        case 6: 
        case 7: 
        case 8: 
        case 9: 
        case 10: 
          saveOptions.a(i1);
        }
        break;
      }
    }
    else if ((saveOptions instanceof XlsSaveOptions))
    {
      if (".xlt".equals(zk.d(fileName))) {
        ((XlsSaveOptions)saveOptions).a = true;
      }
    }
    else if ((saveOptions instanceof HtmlSaveOptions))
    {
      localObject1 = null;
      HtmlSaveOptions localHtmlSaveOptions = (HtmlSaveOptions)saveOptions;
      if (localHtmlSaveOptions.getExportActiveWorksheetOnly()) {
        localObject1 = getWorksheets().get(getWorksheets().getActiveSheetIndex()).getName();
      }
      zafj localzafj = new zafj(this, fileName, (String)localObject1, localHtmlSaveOptions);
      localzafj.a();
      return;
    }
    switch (saveOptions.getSaveFormat())
    {
    case 13: 
    case 20: 
    case 21: 
    case 22: 
      break;
    case 14: 
    case 15: 
    case 16: 
    case 17: 
    case 18: 
    case 19: 
    default: 
      if (!zw.b(fileName)) {
        this.l = fileName;
      }
      break;
    }
    Object localObject1 = zd.a(fileName);
    try
    {
      a((zm)localObject1, saveOptions);
    }
    catch (Exception localException1)
    {
      throw localException1;
    }
    finally
    {
      if (localObject1 != null) {
        ((com.aspose.cells.b.a.d.ze)localObject1).a();
      }
    }
  }
  
  public void save(OutputStream stream, SaveOptions saveOptions)
    throws Exception
  {
    String str = saveOptions.getCachedFileFolder();
    Object localObject;
    if ((str != null) && (str.length() > 0))
    {
      switch (str.charAt(str.length() - 1))
      {
      case '/': 
      case '\\': 
        break;
      default: 
        str = str + '/';
      }
      str = str + "Aspose.Cells" + zs.a(com.aspose.cells.b.a.zh.b());
      str = str + ".xls";
      com.aspose.cells.b.a.d.ze localze = zd.a(str);
      a(localze, saveOptions);
      localze.b(0L);
      localObject = new byte['က'];
      for (;;)
      {
        int i2 = localze.a((byte[])localObject, 0, localObject.length);
        if (i2 <= 0) {
          break;
        }
        stream.write((byte[])localObject, 0, i2);
      }
      localze.a();
      zd.d(str);
    }
    else
    {
      int i1 = 1;
      switch (saveOptions.getSaveFormat())
      {
      case 6: 
      case 7: 
      case 8: 
      case 9: 
        if (((getSettings().getPassword() == null) || ("".equals(getSettings().getPassword()))) && ((getWorksheets().h == null) || ((getWorksheets().h.b() & 0xFFFF) == 0)) && (this.q == null))
        {
          i1 = 0;
          a(new com.aspose.cells.b.a.d.zj(stream), saveOptions);
        }
        break;
      }
      if (i1 != 0)
      {
        localObject = new com.aspose.cells.b.a.d.zh();
        a((zm)localObject, saveOptions);
        ((com.aspose.cells.b.a.d.zh)localObject).a(0L, 0);
        ((com.aspose.cells.b.a.d.zh)localObject).a(stream);
      }
    }
  }
  
  public void save(OutputStream stream, int saveFormat)
    throws Exception
  {
    save(stream, FileFormatUtil.a(null, getFileFormat(), saveFormat, null));
  }
  
  void a(zm paramzm, int paramInt)
    throws Exception
  {
    SaveOptions localSaveOptions = FileFormatUtil.a(null, getFileFormat(), paramInt, null);
    a(paramzm, localSaveOptions);
  }
  
  void a(zm paramzm, SaveOptions paramSaveOptions)
    throws Exception
  {
    Object localObject1;
    SheetRender localSheetRender;
    if ((paramSaveOptions != null) && ((paramSaveOptions instanceof OoxmlSaveOptions)) && (((OoxmlSaveOptions)paramSaveOptions).getUpdateZoom()))
    {
      ImageOrPrintOptions localImageOrPrintOptions = new ImageOrPrintOptions();
      localObject1 = getWorksheets().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Worksheet localWorksheet = (Worksheet)((Iterator)localObject1).next();
        if (!localWorksheet.getPageSetup().isPercentScale())
        {
          localSheetRender = new SheetRender(localWorksheet, localImageOrPrintOptions);
          localWorksheet.getPageSetup().c((int)(localSheetRender.getPageScale() * 100.0D));
        }
      }
    }
    paramSaveOptions.e = getFileFormat();
    if (paramSaveOptions.getRefreshChartCache()) {
      for (i1 = 0; i1 < getWorksheets().getCount(); i1++)
      {
        localObject1 = getWorksheets().get(i1);
        for (int i2 = 0; i2 < ((Worksheet)localObject1).getCharts().getCount(); i2++) {
          ((Worksheet)localObject1).getCharts().get(i2).j();
        }
      }
    }
    for (int i1 = 0; i1 < this.k.getCount(); i1++)
    {
      localObject1 = this.k.get(i1);
      ((Worksheet)localObject1).f = i1;
    }
    i1 = FileFormatUtil.a(paramSaveOptions.getSaveFormat(), this.d);
    if ((paramSaveOptions instanceof SpreadsheetML2003SaveOptions)) {
      b(i1, ((SpreadsheetML2003SaveOptions)paramSaveOptions).getLimitAsXls());
    } else {
      setFileFormat(i1);
    }
    try
    {
      double d5;
      Object localObject2;
      Object localObject4;
      double d8;
      double d7;
      double d6;
      Object localObject3;
      Object localObject5;
      Object localObject6;
      switch (paramSaveOptions.getSaveFormat())
      {
      case 30: 
        localObject1 = new zsf(this);
        ((zsf)localObject1).a(paramzm);
        return;
      case 1: 
      case 11: 
        localObject1 = TxtSaveOptions.a(getSettings(), paramSaveOptions.getSaveFormat(), paramSaveOptions);
        zuk.a(paramzm, this, (TxtSaveOptions)localObject1);
        return;
      case 6: 
      case 7: 
      case 8: 
      case 9: 
      case 10: 
        if (((getSettings().getPassword() == null) || ("".equals(getSettings().getPassword()))) && (getSettings().isDefaultEncrypted()) && (getSettings().isProtected()) && ((getWorksheets().h.b() & 0xFFFF) != 0)) {
          getSettings().setPassword("VelvetSweatshop");
        }
        if ((getSettings().getPassword() != null) && (!"".equals(getSettings().getPassword())))
        {
          localObject1 = new com.aspose.cells.b.a.d.zh();
          zvv.a(this, (zm)localObject1, i1, paramSaveOptions);
          zto.a(paramzm, (com.aspose.cells.b.a.d.zh)localObject1, this.j.getPassword(), getSettings().i());
        }
        else
        {
          zvv.a(this, paramzm, i1, paramSaveOptions);
        }
        if (paramSaveOptions.getClearData()) {
          initialize();
        }
        double d1;
        return;
      case 22: 
        localObject2 = SvgSaveOptions.c(paramSaveOptions);
        localObject4 = getWorksheets().get(((SvgSaveOptions)localObject2).getSheetIndex() == -1 ? getWorksheets().getActiveSheetIndex() : ((SvgSaveOptions)localObject2).getSheetIndex());
        localSheetRender = new SheetRender((Worksheet)localObject4, ((SvgSaveOptions)localObject2).getImageOrPrintOptions());
        for (int i3 = 0; i3 < localSheetRender.getPageCount(); i3++) {
          localSheetRender.a(i3, paramzm);
        }
        return;
      case 20: 
        localObject2 = XpsSaveOptions.a(paramSaveOptions);
        localObject4 = new WorkbookRender(this, ((XpsSaveOptions)localObject2).b());
        ((WorkbookRender)localObject4).a(paramzm);
        return;
      case 21: 
        localObject2 = ImageSaveOptions.a(paramSaveOptions);
        localObject4 = new WorkbookRender(this, ((ImageSaveOptions)localObject2).getImageOrPrintOptions());
        ((WorkbookRender)localObject4).a(paramzm);
        return;
      case 13: 
        localObject2 = new zbyr(this);
        ((zbyr)localObject2).a(paramzm, paramSaveOptions);
        if (paramSaveOptions.getClearData()) {
          initialize();
        }
        return;
      case 14: 
        c();
        localObject2 = new zatr(this, paramSaveOptions);
        try
        {
          ((zatr)localObject2).a(paramzm);
        }
        finally
        {
          if (localObject2 != null) {
            ((zatr)localObject2).a();
          }
        }
        if (paramSaveOptions.getClearData()) {
          initialize();
        }
        return;
      case 15: 
        zbee.a(this, paramzm, paramSaveOptions);
        if (paramSaveOptions.getClearData()) {
          initialize();
        }
        double d2;
        return;
      case 12: 
        localObject3 = (HtmlSaveOptions)paramSaveOptions;
        localObject5 = null;
        if (((HtmlSaveOptions)localObject3).getExportActiveWorksheetOnly()) {
          localObject5 = getWorksheets().get(getWorksheets().getActiveSheetIndex()).getName();
        }
        localObject6 = new zafj(this, paramzm, (String)localObject5, (HtmlSaveOptions)localObject3);
        ((zafj)localObject6).a();
        if (paramSaveOptions.getClearData()) {
          initialize();
        }
        return;
      case 17: 
        localObject3 = (HtmlSaveOptions)paramSaveOptions;
        localObject5 = null;
        if (((HtmlSaveOptions)localObject3).getExportActiveWorksheetOnly()) {
          localObject5 = getWorksheets().get(getWorksheets().getActiveSheetIndex()).getName();
        }
        localObject6 = new zapq(this, paramzm, (HtmlSaveOptions)localObject3);
        ((zapq)localObject6).a(paramzm);
        if (paramSaveOptions.getClearData()) {
          initialize();
        }
        return;
      case 16: 
        if (((getSettings().getPassword() == null) || ("".equals(getSettings().getPassword()))) && (getSettings().isProtected()) && ((getWorksheets().D().b() & 0xFFFF) != 0)) {
          getSettings().setPassword("VelvetSweatshop");
        }
        if ((getSettings().getPassword() != null) && (!"".equals(getSettings().getPassword())))
        {
          localObject3 = new com.aspose.cells.b.a.d.zh();
          localObject5 = new zciq(this, hasMacro(), paramSaveOptions);
          try
          {
            ((zciq)localObject5).a((zm)localObject3);
          }
          finally
          {
            if (localObject5 != null) {
              ((zciq)localObject5).a();
            }
          }
          ((com.aspose.cells.b.a.d.zh)localObject3).a(0L, 0);
          localObject6 = new zbz(getSettings().getPassword(), getSettings().i());
          com.aspose.cells.b.a.d.zh localzh = ((zbz)localObject6).b();
          localObject3 = ((zbz)localObject6).b((com.aspose.cells.b.a.d.zh)localObject3);
          zxf localzxf = new zxf(zaej.n);
          localzxf.a().a("EncryptionInfo", localzh);
          localzxf.a().a("EncryptedPackage", (com.aspose.cells.b.a.d.zh)localObject3);
          localzxf.a(paramzm);
        }
        else
        {
          localObject3 = new zciq(this, hasMacro(), paramSaveOptions);
          try
          {
            ((zciq)localObject3).a(paramzm);
          }
          finally
          {
            if (localObject3 != null) {
              ((zciq)localObject3).a();
            }
          }
        }
        if (paramSaveOptions.getClearData()) {
          initialize();
        }
        double d3;
        return;
      }
      zcam localzcam = new zcam(this, paramSaveOptions);
      try
      {
        if (paramzm.e())
        {
          localzcam.a(paramzm);
        }
        else
        {
          localObject5 = new com.aspose.cells.b.a.d.zh();
          localzcam.a((zm)localObject5);
          ((com.aspose.cells.b.a.d.zh)localObject5).a(paramzm);
        }
      }
      finally
      {
        if (localzcam != null) {
          localzcam.a();
        }
      }
      if (paramSaveOptions.getClearData()) {
        initialize();
      }
    }
    catch (Exception localException)
    {
      double d4;
      throw localException;
    }
    finally
    {
      double d9 = paramzm.h() / 1048576.0D;
      zapk.a().a(d9);
    }
  }
  
  public WorksheetCollection getWorksheets()
  {
    return this.k;
  }
  
  public boolean isLicensed()
  {
    zij localzij = new zij();
    return localzij.a();
  }
  
  /**
   * @deprecated
   */
  public StyleCollection getStyles()
  {
    return this.k.s();
  }
  
  public void removeUnusedStyles()
  {
    if (getWorksheets().Z() != null) {
      for (int i1 = getWorksheets().getTableStyles().getCount() - 1; i1 >= 0; i1--)
      {
        TableStyle localTableStyle = getWorksheets().getTableStyles().get(i1);
        if (!localTableStyle.b()) {
          getWorksheets().getTableStyles().removeAt(i1);
        }
      }
    }
    ((zbzv)getWorksheets().C()).a(0, 0);
  }
  
  public Style createStyle()
  {
    Style localStyle = new Style(this.k);
    localStyle.a(this.k, 15);
    return localStyle;
  }
  
  public Style createBuiltinStyle(int type)
  {
    return zbtc.a(type, getWorksheets());
  }
  
  public CellsColor createCellsColor()
  {
    return new CellsColor(this);
  }
  
  public int replace(String placeHolder, String newValue)
  {
    zxc localzxc = new zxc(this.k);
    return localzxc.a(placeHolder, newValue);
  }
  
  public int replace(String placeHolder, int newValue)
  {
    zxc localzxc = new zxc(this.k);
    return localzxc.a(placeHolder, newValue);
  }
  
  public int replace(String placeHolder, double newValue)
  {
    zxc localzxc = new zxc(this.k);
    return localzxc.a(placeHolder, newValue);
  }
  
  public int replace(String placeHolder, String[] newValues, boolean isVertical)
  {
    zxc localzxc = new zxc(this.k);
    return localzxc.a(placeHolder, newValues, isVertical);
  }
  
  public int replace(String placeHolder, int[] newValues, boolean isVertical)
  {
    zxc localzxc = new zxc(this.k);
    return localzxc.a(placeHolder, newValues, isVertical);
  }
  
  public int replace(String placeHolder, double[] newValues, boolean isVertical)
  {
    zxc localzxc = new zxc(this.k);
    return localzxc.a(placeHolder, newValues, isVertical);
  }
  
  public int replace(boolean boolValue, Object newValue)
  {
    zxc localzxc = new zxc(this.k);
    return localzxc.a(boolValue, newValue);
  }
  
  public int replace(int intValue, Object newValue)
  {
    zxc localzxc = new zxc(this.k);
    return localzxc.a(intValue, newValue);
  }
  
  public int replace(String placeHolder, String newValue, ReplaceOptions options)
  {
    zxc localzxc = new zxc(this.k, options);
    return localzxc.a(placeHolder, newValue);
  }
  
  public void copy(Workbook source0)
    throws Exception
  {
    Workbook localWorkbook = source0;
    this.k.u();
    this.d = localWorkbook.d;
    this.n = localWorkbook.n;
    this.k.a(localWorkbook.k);
    this.b.a(localWorkbook.b);
    this.c = localWorkbook.c;
    this.j.a(localWorkbook.j);
    if (localWorkbook.a != null)
    {
      this.a = new zqw();
      this.a.a(localWorkbook.a);
    }
    getDataConnections().a(localWorkbook.getDataConnections());
    this.p = localWorkbook.p;
    if (localWorkbook.f != null) {
      getCustomXmlParts().a(localWorkbook.f);
    }
    if (localWorkbook.e != null) {
      getContentTypeProperties().a(localWorkbook.e);
    }
  }
  
  public void combine(Workbook secondWorkbook)
    throws Exception
  {
    c();
    secondWorkbook.c();
    this.k.b(secondWorkbook.getWorksheets());
  }
  
  public Color[] getColors()
  {
    return this.j.d().c();
  }
  
  public Style getStyleInPool(int index)
  {
    return getWorksheets().C().a(index);
  }
  
  public int getCountOfStylesInPool()
  {
    return this.k.C().b();
  }
  
  public Font[] getFonts()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.k.A().iterator();
    while (localIterator.hasNext())
    {
      Font localFont = (Font)localIterator.next();
      a(localArrayList, localFont);
    }
    int i1 = getCountOfStylesInPool();
    for (int i2 = 0; i2 < i1; i2++)
    {
      Style localStyle = getStyleInPool(i2);
      if (localStyle.q() != null) {
        a(localArrayList, localStyle.q());
      }
    }
    Font[] arrayOfFont = new Font[localArrayList.size()];
    for (int i3 = 0; i3 < localArrayList.size(); i3++) {
      arrayOfFont[i3] = ((Font)localArrayList.get(i3));
    }
    return arrayOfFont;
  }
  
  private void a(ArrayList paramArrayList, Font paramFont)
  {
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      Font localFont = (Font)localIterator.next();
      if (localFont.b(paramFont)) {
        return;
      }
    }
    paramArrayList.add(paramFont);
  }
  
  public Style getNamedStyle(String name)
  {
    return this.k.C().a(name);
  }
  
  public void changePalette(Color color, int index)
  {
    if ((index < 0) || (index > 55)) {
      throw new IllegalArgumentException("Index is out of range.");
    }
    this.j.d().a(color, index + 8);
  }
  
  public boolean isColorInPalette(Color color)
  {
    return this.j.d().b(color);
  }
  
  public void calculateFormula()
  {
    calculateFormula(false, null);
  }
  
  public void calculateFormula(boolean ignoreError)
  {
    calculateFormula(ignoreError, null);
  }
  
  public void calculateFormula(boolean ignoreError, ICustomFunction customFunction)
  {
    CalculationOptions localCalculationOptions = new CalculationOptions();
    localCalculationOptions.b = ignoreError;
    localCalculationOptions.setCustomFunction(customFunction);
    calculateFormula(localCalculationOptions);
  }
  
  public void calculateFormula(CalculationOptions options)
  {
    int i1 = (!getSettings().getParsingFormulaOnOpen()) && (!getSettings().a) && (f() == 1) ? 1 : 0;
    int i2 = 1;
    int i3 = 0;
    CellsException localCellsException1 = this.k.getCount();
    boolean bool = getSettings().c;
    zaca localzaca = null;
    if (bool) {
      localzaca = new zaca(this, 1, options);
    }
    Object localObject1;
    for (CellsException localCellsException2 = 0; localCellsException2 < localCellsException1; localCellsException2++)
    {
      localObject1 = this.k.get(localCellsException2).getCells().a;
      if (bool)
      {
        ((zabw)localObject1).a();
        localzaca.a(localCellsException2);
      }
      if (((zabw)localObject1).c > 0)
      {
        zaai[] arrayOfzaai = ((zabw)localObject1).b;
        if (i2 != 0) {
          i2 = 0;
        }
        if (i1 != 0) {
          for (int i4 = ((zabw)localObject1).d - 1; i4 > -1; i4--) {
            if ((arrayOfzaai[i4] != null) && (arrayOfzaai[i4].i()))
            {
              i1 = 0;
              i3 = 1;
              break;
            }
          }
        }
        if (bool) {
          ((zabw)localObject1).a(localzaca);
        } else {
          ((zabw)localObject1).a((byte)0);
        }
      }
    }
    if (i2 != 0) {
      return;
    }
    this.k.af();
    if (!bool) {
      localzaca = new zaca(this, 1, options);
    }
    localCellsException2 = null;
    try
    {
      for (Object localObject2 = 0; localObject2 < localCellsException1; localObject2++)
      {
        localObject1 = this.k.get(localObject2).getCells();
        ((Cells)localObject1).getRows().a(16);
      }
      if (i3 != 0) {
        c();
      }
      zgs localzgs1 = new zgs();
      Iterator localIterator = this.k.iterator();
      while (localIterator.hasNext())
      {
        Worksheet localWorksheet = (Worksheet)localIterator.next();
        zabw localzabw = localWorksheet.getCells().a;
        if (localzabw.c >= 1)
        {
          localObject2 = localWorksheet.getCells().getRows().a;
          localzaca.a(localWorksheet);
          int i5 = localzabw.d;
          for (int i6 = 0; i6 < i5; i6++)
          {
            zaai localzaai = localzabw.a(i6);
            if ((localzaai != null) && (localzaai.c() != 2))
            {
              localzgs1.a = localzaai.f;
              zgs localzgs2 = ((zahb)localObject2).a(localzaai.e, localzgs1, 4);
              if ((localzgs2 == null) || (localzgs2.d != localzaai)) {
                localzabw.b(i6);
              } else {
                localzaca.c(localzaai);
              }
            }
          }
          localzaca.p.a(localWorksheet.getIndex());
        }
      }
      if (bool) {
        localzaca.p.j();
      }
    }
    catch (CellsException localCellsException4)
    {
      CellsException localCellsException3;
      if ((localCellsException4.getCode() != 17) || (!zw.b(localCellsException4.getMessage()))) {
        localCellsException2 = localCellsException4;
      }
    }
    finally
    {
      CellsException localCellsException5;
      for (CellsException localCellsException6 = 0; localCellsException6 < localCellsException1; localCellsException6++) {
        this.k.get(localCellsException6).getCells().getRows().a();
      }
      localzaca.c();
    }
    if (localCellsException2 != null) {
      throw localCellsException2;
    }
  }
  
  public Style getDefaultStyle()
  {
    return this.k.Q();
  }
  
  public void setDefaultStyle(Style value)
  {
    this.k.b(value);
  }
  
  public Color getMatchingColor(Color rawColor)
  {
    Object localObject = rawColor;
    int i1 = Integer.MAX_VALUE;
    int i2 = 0;
    for (Color localColor : this.j.d().c())
    {
      i2 = com.aspose.cells.b.a.ze.f(Double.valueOf(Math.pow((com.aspose.cells.a.c.zh.b(localColor) & 0xFF) - (com.aspose.cells.a.c.zh.b(rawColor) & 0xFF), 2.0D) + Math.pow((com.aspose.cells.a.c.zh.c(localColor) & 0xFF) - (com.aspose.cells.a.c.zh.c(rawColor) & 0xFF), 2.0D) + Math.pow((com.aspose.cells.a.c.zh.d(localColor) & 0xFF) - (com.aspose.cells.a.c.zh.d(rawColor) & 0xFF), 2.0D)));
      if (i2 < i1)
      {
        localObject = localColor;
        if (i2 == 0) {
          break;
        }
        i1 = i2;
      }
    }
    return (Color)localObject;
  }
  
  public boolean isDigitallySigned()
  {
    return getSettings().h;
  }
  
  public void setEncryptionOptions(int encryptionType, int keyLength)
  {
    getSettings().a(encryptionType);
    getSettings().b(keyLength);
  }
  
  /**
   * @deprecated
   */
  public boolean checkWriteProtectedPassword(String password)
  {
    return getSettings().getWriteProtection().validatePassword(password);
  }
  
  public void protect(int protectionType, String password)
  {
    this.k.a(protectionType, password);
  }
  
  public void unprotect(String password)
  {
    this.k.e(password);
  }
  
  public void removeMacro()
  {
    this.k.a(null);
    this.k.b(false);
    for (int i1 = this.k.getCount() - 1; i1 >= 0; i1--) {
      switch (this.k.get(i1).getType())
      {
      case 0: 
      case 3: 
        this.k.removeAt(i1);
      }
    }
  }
  
  public VbaProject getVbaProject()
  {
    VbaProject localVbaProject = getWorksheets().H();
    if (localVbaProject == null)
    {
      getWorksheets().a(new VbaProject(this));
      localVbaProject = getWorksheets().G();
      getWorksheets().b(true);
    }
    return localVbaProject;
  }
  
  public void removeDigitalSignature()
  {
    if (this.a != null) {
      this.a.b(this);
    }
    zxf localzxf = getWorksheets().h();
    if (localzxf != null)
    {
      localzxf.a().g("_signatures");
      localzxf.a().g("_xmlsignatures");
    }
    getSettings().h = false;
    this.i = null;
    this.q = null;
  }
  
  public void acceptAllRevisions()
  {
    zbcv localzbcv = new zbcv(this);
    localzbcv.b();
  }
  
  public boolean hasMacro()
  {
    if ((getWorksheets().h() != null) && ((!this.k.k()) || (this.k.l()))) {
      return false;
    }
    return this.k.G() != null;
  }
  
  public boolean hasRevisions()
    throws Exception
  {
    zbcv localzbcv = new zbcv(this);
    return localzbcv.a();
  }
  
  public String getFileName()
  {
    return this.l;
  }
  
  public void setFileName(String value)
  {
    a(value);
  }
  
  private void a(String paramString)
  {
    this.l = paramString;
  }
  
  public DataSorter getDataSorter()
  {
    if (this.m == null) {
      this.m = new DataSorter(this);
    }
    return this.m;
  }
  
  public void removeExternalLinks()
  {
    c();
    int i1 = 0;
    int i2 = getWorksheets().w().getCount();
    boolean[] arrayOfBoolean = new boolean[i2];
    for (int i3 = 0; i3 < i2; i3++)
    {
      zbti localzbti = getWorksheets().w().a(i3);
      switch (localzbti.a())
      {
      case 0: 
        if (!localzbti.g())
        {
          arrayOfBoolean[i3] = true;
          i1 |= arrayOfBoolean[i3];
          localzbti.b(null);
          localzbti.d("book1.xlsx");
        }
        break;
      case 3: 
        arrayOfBoolean[i3] = true;
        i1 |= arrayOfBoolean[i3];
        localzbti.b(null);
      }
    }
    if (i1 == 0) {
      return;
    }
    HashMap localHashMap1 = new HashMap();
    for (int i4 = 0; i4 < getWorksheets().r().getCount(); i4++)
    {
      i5 = getWorksheets().r().b(i4).a;
      if (arrayOfBoolean[(i5 & 0xFFFF)] != 0) {
        localHashMap1.put(Integer.valueOf(i4), Integer.valueOf(i4));
      }
    }
    if (localHashMap1.size() == 0) {
      return;
    }
    HashMap localHashMap2 = new HashMap();
    for (int i5 = 0; i5 < getWorksheets().getNames().getCount(); i5++)
    {
      Name localName = getWorksheets().getNames().get(i5);
      if ((localName.b() != null) && (zaaq.a(localName.b(), -1, -1, getWorksheets())))
      {
        localName.w();
        localName.a(true);
        localHashMap2.put(Integer.valueOf(i5), Boolean.valueOf(true));
      }
    }
    for (i5 = 0; i5 < getWorksheets().getCount(); i5++)
    {
      getWorksheets().get(i5).getCells().getRows().a(localHashMap1, localHashMap2);
      getWorksheets().get(i5).getCharts().b();
    }
  }
  
  void a(zm paramzm)
    throws Exception
  {
    this.a = new zqw();
    this.a.a = new zqr();
    this.a.a.a(paramzm);
    zl.c("Finished loading zip data.");
  }
  
  public Color getThemeColor(int type)
  {
    return this.b.a(type);
  }
  
  public void setThemeColor(int type, Color color)
  {
    this.b.e[type].a(color);
    this.c = true;
  }
  
  public String getTheme()
  {
    return this.b.a;
  }
  
  zrs d()
  {
    return this.b;
  }
  
  public void customTheme(String themeName, Color[] colors)
  {
    this.b.a(themeName, colors);
    this.c = true;
  }
  
  public void copyTheme(Workbook source)
  {
    this.b.a(source.d());
    setDefaultStyle(source.getDefaultStyle());
    this.c = true;
  }
  
  String e()
  {
    if ((this.l == null) || ("".equals(this.l))) {
      return null;
    }
    String str = zu.b(this.l);
    if (str.length() == this.l.length()) {
      return null;
    }
    return this.l.substring(0, 0 + (this.l.length() - str.length()));
  }
  
  public boolean hasExernalLinks()
  {
    for (int i1 = 0; i1 < getWorksheets().w().getCount(); i1++)
    {
      zbti localzbti = getWorksheets().w().a(i1);
      switch (localzbti.a())
      {
      case 0: 
        return true;
      }
    }
    return false;
  }
  
  public void updateLinkedDataSource(Workbook[] exteralWorkbooks)
    throws Exception
  {
    if (!hasExernalLinks()) {
      return;
    }
    a();
    for (int i1 = 0; i1 < getWorksheets().w().getCount(); i1++)
    {
      zbti localzbti = getWorksheets().w().a(i1);
      switch (localzbti.a())
      {
      case 0: 
        String str1 = localzbti.a(this);
        Object localObject1 = null;
        if (exteralWorkbooks != null) {
          for (int i2 = 0; i2 < exteralWorkbooks.length; i2++)
          {
            Workbook localWorkbook = exteralWorkbooks[i2];
            if (zy.a(localWorkbook.getFileName(), str1))
            {
              localObject1 = localWorkbook;
              break;
            }
          }
        }
        Object localObject2;
        if (localObject1 == null)
        {
          if (zd.c(str1))
          {
            localObject2 = new LoadOptions();
            ((LoadOptions)localObject2).setLoadDataAndFormatting(true);
            ((LoadOptions)localObject2).getLoadDataOptions().setImportFormula(false);
            localObject1 = new Workbook(str1, (LoadOptions)localObject2);
          }
        }
        else
        {
          localObject2 = localzbti.d();
          if (localObject2 != null) {
            ((ArrayList)localObject2).clear();
          }
          if (localzbti.c() == null)
          {
            localzbti.a(new String[((Workbook)localObject1).getWorksheets().getCount()]);
            for (int i3 = 0; i3 < ((Workbook)localObject1).getWorksheets().getCount(); i3++) {
              localzbti.c()[i3] = ((Workbook)localObject1).getWorksheets().get(i3).getName();
            }
            for (i3 = 0; i3 < localzbti.b().size(); i3++)
            {
              zwh localzwh = (zwh)localzbti.b().get(i3);
              String str2 = localzwh.e();
              if (localzwh.d() != 0) {
                str2 = ((Workbook)localObject1).getWorksheets().get(localzwh.d() - 1).getName() + "!" + str2;
              }
              Name localName1 = ((Workbook)localObject1).getWorksheets().getNames().get(str2);
              if ((localName1 != null) && (localName1.getRefersTo() != null)) {
                localzwh.a(getWorksheets(), localName1.getRefersTo());
              }
              if (localzwh.f() != null) {
                zaaq.a(localzwh.f(), -1, -1, ((Workbook)localObject1).getWorksheets(), ((Workbook)localObject1).getWorksheets(), 0, localzbti, true, this);
              }
            }
          }
          else
          {
            String[] arrayOfString = localzbti.c();
            localzbti.a(new String[((Workbook)localObject1).getWorksheets().getCount()]);
            for (int i5 = 0; i5 < ((Workbook)localObject1).getWorksheets().getCount(); i5++) {
              localzbti.c()[i5] = ((Workbook)localObject1).getWorksheets().get(i5).getName();
            }
            Object localObject3 = new HashMap();
            for (int i6 = 0; i6 < arrayOfString.length; i6++) {
              for (int i7 = 0; i7 < ((Workbook)localObject1).getWorksheets().getCount(); i7++) {
                if (zy.a(((Workbook)localObject1).getWorksheets().get(i7).getName(), arrayOfString[i6]))
                {
                  ((HashMap)localObject3).put(Integer.valueOf(i6), Integer.valueOf(i7));
                  break;
                }
              }
            }
            getWorksheets().r().a(i1, (HashMap)localObject3);
            Object localObject4;
            for (int i4 = 0; i4 < localzbti.b().size(); i4++)
            {
              localObject3 = (zwh)localzbti.b().get(i4);
              localObject4 = ((zwh)localObject3).e();
              if (((zwh)localObject3).d() != 0) {
                localObject4 = ((Workbook)localObject1).getWorksheets().get(((zwh)localObject3).d() - 1).getName() + "!" + (String)localObject4;
              }
              Name localName2 = ((Workbook)localObject1).getWorksheets().getNames().get((String)localObject4);
              if ((localName2 != null) && (localName2.getRefersTo() != null)) {
                ((zwh)localObject3).a(getWorksheets(), localName2.getRefersTo());
              }
              if (((zwh)localObject3).f() != null) {
                zaaq.a(((zwh)localObject3).f(), -1, -1, ((Workbook)localObject1).getWorksheets(), ((Workbook)localObject1).getWorksheets(), 0, localzbti, true, this);
              }
            }
            for (i4 = 0; i4 < this.k.getCount(); i4++)
            {
              localObject3 = this.k.get(i4).getCells();
              localObject4 = null;
              for (int i8 = 0; i8 < ((Cells)localObject3).getRows().getCount(); i8++)
              {
                Row localRow = ((Cells)localObject3).getRows().c(i8);
                for (int i10 = 0; i10 < localRow.a(); i10++)
                {
                  localObject4 = localRow.getCellByIndex(i10);
                  if (((Cell)localObject4).g())
                  {
                    zaai localzaai = ((Cell)localObject4).h();
                    zaaq.a(localzaai.b, -1, -1, this.k, ((Workbook)localObject1).getWorksheets(), i1, localzbti, false, this);
                    if (localzaai.a() != null) {
                      zaaq.a(localzaai.a().c(), -1, -1, this.k, ((Workbook)localObject1).getWorksheets(), i1, localzbti, false, this);
                    }
                  }
                }
              }
              ChartCollection localChartCollection = this.k.get(i4).getCharts();
              for (int i9 = 0; i9 < localChartCollection.getCount(); i9++)
              {
                Chart localChart = localChartCollection.get(i9);
                for (int i11 = 0; i11 < localChart.getNSeries().getCount(); i11++)
                {
                  zjk localzjk = localChart.getNSeries().get(i11).m();
                  if (localzjk != null)
                  {
                    byte[] arrayOfByte = localzjk.c;
                    if ((arrayOfByte != null) && (zaaq.a(arrayOfByte, -1, -1, this.k))) {
                      zaaq.a(arrayOfByte, -1, -1, this.k, ((Workbook)localObject1).getWorksheets(), i1, localzbti, false, this);
                    }
                  }
                }
              }
            }
            for (i4 = 0; i4 < this.k.getNames().getCount(); i4++)
            {
              localObject3 = this.k.getNames().get(i4);
              if (((Name)localObject3).b() != null) {
                zaaq.a(((Name)localObject3).b(), -1, -1, this.k, ((Workbook)localObject1).getWorksheets(), i1, localzbti, false, this);
              }
            }
          }
        }
        break;
      }
    }
  }
  
  public BuiltInDocumentPropertyCollection getBuiltInDocumentProperties()
  {
    return getWorksheets().getBuiltInDocumentProperties();
  }
  
  public CustomDocumentPropertyCollection getCustomDocumentProperties()
  {
    return getWorksheets().getCustomDocumentProperties();
  }
  
  public int getFileFormat()
  {
    return this.d;
  }
  
  public void setFileFormat(int value)
    throws Exception
  {
    this.d = value;
    int i1 = a(value, this.n, true);
    if (i1 != this.n) {
      a(this.n, i1);
    }
    this.n = i1;
  }
  
  private void b(int paramInt, boolean paramBoolean)
    throws Exception
  {
    this.d = paramInt;
    int i1 = a(paramInt, this.n, paramBoolean);
    if (i1 != this.n) {
      a(this.n, i1);
    }
    this.n = i1;
  }
  
  void a(int paramInt)
  {
    this.d = paramInt;
    int i1 = a(paramInt, this.n, true);
    this.n = i1;
  }
  
  int f()
  {
    return this.n;
  }
  
  private void b(int paramInt)
  {
    this.d = paramInt;
    this.n = a(paramInt, this.n, true);
  }
  
  private static int a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    switch (paramInt1)
    {
    case 5: 
    case 52: 
      return 0;
    case 15: 
      if (paramBoolean) {
        return 0;
      }
      return paramInt2;
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
    case 16: 
      return 1;
    }
    return paramInt2;
  }
  
  boolean g()
  {
    return this.n == 1;
  }
  
  boolean h()
  {
    return this.n == 1;
  }
  
  private void a(int paramInt1, int paramInt2)
    throws Exception
  {
    switch (paramInt1)
    {
    case 0: 
      switch (paramInt2)
      {
      case 0: 
        break;
      case 1: 
        o();
      }
      break;
    case 1: 
      switch (paramInt2)
      {
      case 0: 
        p();
        break;
      case 1: 
        
      }
      break;
    }
  }
  
  private void o()
    throws Exception
  {
    NameCollection localNameCollection = this.k.getNames();
    Object localObject2;
    byte[] arrayOfByte;
    for (int i3 = 0; i3 < localNameCollection.getCount(); i3++)
    {
      localObject2 = localNameCollection.get(i3);
      ((Name)localObject2).i();
      arrayOfByte = ((Name)localObject2).b();
      if ((arrayOfByte != null) && (arrayOfByte.length > 2)) {
        ((Name)localObject2).a(zcv.a(arrayOfByte, -1, 0, 0, true, null));
      }
    }
    Object localObject1 = this.k.w().iterator();
    Object localObject4;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (zbti)((Iterator)localObject1).next();
      if ((((zbti)localObject2).b() != null) && (((zbti)localObject2).b().size() > 0)) {
        for (int i4 = 0; i4 < ((zbti)localObject2).b().size(); i4++)
        {
          localObject4 = (zwh)((zbti)localObject2).b().get(i4);
          zcv.a((zwh)localObject4);
        }
      }
    }
    localObject1 = this.k.W().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (zawp)((Iterator)localObject1).next();
      ((zawp)localObject2).a(true, null);
    }
    if (hasRevisions())
    {
      localObject1 = getWorksheets().ah();
      ((zbcj)localObject1).a(null);
    }
    localObject1 = this.k.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (Worksheet)((Iterator)localObject1).next();
      Object localObject3;
      if ((((Worksheet)localObject2).getType() == 2) && (((Worksheet)localObject2).getCharts().getCount() > 0))
      {
        localObject3 = ((Worksheet)localObject2).getCharts().get(0);
        ((Chart)localObject3).K();
      }
      else
      {
        if ((((Worksheet)localObject2).w() != null) && (((Worksheet)localObject2).w().getCount() > 0)) {
          ((Worksheet)localObject2).getShapes().m();
        }
        localObject3 = ((Worksheet)localObject2).getCells();
        localObject4 = ((Cells)localObject3).e();
        Object localObject6;
        if (((zv)localObject4).a() > 0)
        {
          zaiv localzaiv = ((zv)localObject4).b();
          int i7;
          do
          {
            i7 = localzaiv.a();
            if (i7 < 0) {
              break;
            }
            localObject5 = ((zv)localObject4).f(i7);
          } while (((zt)localObject5).a() <= 0);
          int i8 = ((zt)localObject5).i();
          localObject6 = ((zt)localObject5).b();
          for (;;)
          {
            i7 = ((zaiv)localObject6).a();
            if (i7 < 0) {
              break;
            }
            if (((zt)localObject5).h(i7) == 5)
            {
              zaai localzaai = (zaai)((zt)localObject5).i(i7);
              arrayOfByte = localzaai.b;
              if (arrayOfByte != null)
              {
                int i9 = ((zt)localObject5).a(i7);
                localzaai.b = zcv.a(arrayOfByte, -1, i8, i9, false, null);
                if (localzaai.a() != null)
                {
                  arrayOfByte = localzaai.a().c();
                  localzaai.a().a(zcv.a(arrayOfByte, -1, i8, i9, false, null));
                }
              }
            }
          }
        }
        Object localObject5 = ((Worksheet)localObject2).getValidations();
        for (int i5 = 0; i5 < ((ValidationCollection)localObject5).getCount(); i5++)
        {
          localObject6 = ((ValidationCollection)localObject5).get(i5);
          int i1 = 0;
          int i2 = 0;
          localObject7 = ((Validation)localObject6).b();
          if (localObject7 != null)
          {
            i1 = localObject7[0];
            i2 = localObject7[1];
          }
          if (((Validation)localObject6).c != null) {
            ((Validation)localObject6).c = zcv.a(((Validation)localObject6).c, 0, i1, i2, true, null);
          }
          if (((Validation)localObject6).d != null) {
            ((Validation)localObject6).d = zcv.a(((Validation)localObject6).d, 0, i1, i2, true, null);
          }
        }
        ConditionalFormattingCollection localConditionalFormattingCollection = ((Worksheet)localObject2).r;
        if ((localConditionalFormattingCollection != null) && (localConditionalFormattingCollection.getCount() > 0)) {
          for (int i6 = 0; i6 < localConditionalFormattingCollection.getCount(); i6++)
          {
            localObject7 = localConditionalFormattingCollection.get(i6);
            ((FormatConditionCollection)localObject7).a(true, null);
          }
        }
        ListObjectCollection localListObjectCollection = ((Worksheet)localObject2).k();
        if ((localListObjectCollection != null) && (localListObjectCollection.getCount() > 0))
        {
          localObject7 = localListObjectCollection.iterator();
          while (((Iterator)localObject7).hasNext())
          {
            ListObject localListObject = (ListObject)((Iterator)localObject7).next();
            localListObject.a(true, null);
          }
        }
        Object localObject7 = ((Worksheet)localObject2).getSparklineGroupCollection();
        if (((SparklineGroupCollection)localObject7).getCount() > 0) {
          ((SparklineGroupCollection)localObject7).c();
        }
      }
    }
  }
  
  private void p()
    throws Exception
  {
    zcw localzcw = new zcw(getWorksheets());
    c();
    NameCollection localNameCollection = this.k.getNames();
    Object localObject2;
    byte[] arrayOfByte1;
    for (int i1 = 0; i1 < localNameCollection.getCount(); i1++)
    {
      localObject2 = localNameCollection.get(i1);
      arrayOfByte1 = ((Name)localObject2).b();
      if ((arrayOfByte1 != null) && (arrayOfByte1.length > 2)) {
        ((Name)localObject2).a(localzcw.a(arrayOfByte1, -1));
      }
    }
    Object localObject1 = this.k.w().iterator();
    Object localObject4;
    Object localObject5;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (zbti)((Iterator)localObject1).next();
      if ((((zbti)localObject2).a() == 0) && (this.k.b() != null))
      {
        String str = ((zbti)localObject2).a;
        if ((str != null) && (str.length() > 0)) {
          switch (str.charAt(0))
          {
          case '\000': 
          case '\001': 
          case '\002': 
            break;
          default: 
            localObject4 = new StringBuilder();
            localObject5 = getWorksheets().b();
            ((StringBuilder)localObject4).append((String)localObject5);
            if ((((String)localObject5).length() > 0) && (((String)localObject5).charAt(((String)localObject5).length() - 1) != '\\') && (((String)localObject5).charAt(((String)localObject5).length() - 1) != '/')) {
              ((StringBuilder)localObject4).append('/');
            }
            ((StringBuilder)localObject4).append(str);
            ((zbti)localObject2).a(str, ((zbti)localObject2).c(), 0);
          }
        }
      }
      if ((((zbti)localObject2).b() != null) && (((zbti)localObject2).b().size() > 0)) {
        for (int i2 = 0; i2 < ((zbti)localObject2).b().size(); i2++)
        {
          localObject4 = (zwh)((zbti)localObject2).b().get(i2);
          localzcw.a((zwh)localObject4);
        }
      }
    }
    localObject1 = this.k.W().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (zawp)((Iterator)localObject1).next();
      ((zawp)localObject2).a(false, localzcw);
    }
    if (hasRevisions())
    {
      localObject1 = getWorksheets().ah();
      ((zbcj)localObject1).a(localzcw);
    }
    localObject1 = this.k.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (Worksheet)((Iterator)localObject1).next();
      Object localObject3;
      if (((Worksheet)localObject2).getType() == 2)
      {
        localObject3 = ((Worksheet)localObject2).getCharts().get(0);
        ((Chart)localObject3).a(localzcw);
      }
      else
      {
        if ((((Worksheet)localObject2).w() != null) && (((Worksheet)localObject2).w().getCount() > 0)) {
          ((Worksheet)localObject2).w().a(localzcw);
        }
        localObject3 = ((Worksheet)localObject2).getCells();
        localObject4 = ((Cells)localObject3).e();
        Object localObject6;
        Object localObject8;
        if (((zv)localObject4).a() > 0)
        {
          localObject5 = ((zv)localObject4).b();
          localObject7 = ((Cells)localObject3).getRows();
          int i5;
          do
          {
            i5 = ((zaiv)localObject5).a();
            if (i5 < 0) {
              break;
            }
            localObject6 = ((zv)localObject4).f(i5);
            localObject8 = new Row((Cells)localObject3, (RowCollection)localObject7, (zt)localObject6, false);
          } while (((zt)localObject6).a() <= 0);
          zaiv localzaiv = ((zt)localObject6).b();
          for (;;)
          {
            i5 = localzaiv.a();
            if (i5 < 0) {
              break;
            }
            if (((zt)localObject6).h(i5) == 5)
            {
              Cell localCell = new Cell((Row)localObject8, i5);
              byte[] arrayOfByte2 = localCell.v();
              if (arrayOfByte2 != null)
              {
                arrayOfByte2 = localzcw.a(arrayOfByte2, -1);
                if (localzcw.a) {
                  arrayOfByte2 = getWorksheets().y().a(localCell, localCell.getFormula(), (byte)0);
                }
                if (localCell.h().a() != null)
                {
                  arrayOfByte1 = localCell.h().a().c();
                  arrayOfByte1 = localzcw.a(arrayOfByte1, -1);
                  if (localzcw.a) {
                    arrayOfByte1 = getWorksheets().y().a(localCell, localCell.getFormula(), (byte)(localCell.h().a().b() ? 0 : 1));
                  }
                  localCell.h().a().a(arrayOfByte1);
                }
                localCell.a(arrayOfByte2);
              }
            }
          }
        }
        localObject5 = ((Worksheet)localObject2).getValidations();
        for (int i3 = 0; i3 < ((ValidationCollection)localObject5).getCount(); i3++)
        {
          localObject6 = ((ValidationCollection)localObject5).get(i3);
          if (((Validation)localObject6).c != null) {
            ((Validation)localObject6).c = localzcw.a(((Validation)localObject6).c, 0);
          }
          if (((Validation)localObject6).d != null) {
            ((Validation)localObject6).d = localzcw.a(((Validation)localObject6).d, 0);
          }
        }
        ConditionalFormattingCollection localConditionalFormattingCollection = ((Worksheet)localObject2).r;
        if ((localConditionalFormattingCollection != null) && (localConditionalFormattingCollection.getCount() > 0)) {
          for (int i4 = 0; i4 < localConditionalFormattingCollection.getCount(); i4++)
          {
            localObject7 = localConditionalFormattingCollection.get(i4);
            ((FormatConditionCollection)localObject7).a(false, null);
          }
        }
        ListObjectCollection localListObjectCollection = ((Worksheet)localObject2).k();
        if ((localListObjectCollection != null) && (localListObjectCollection.getCount() > 0))
        {
          localObject7 = localListObjectCollection.iterator();
          while (((Iterator)localObject7).hasNext())
          {
            localObject8 = (ListObject)((Iterator)localObject7).next();
            ((ListObject)localObject8).a(false, null);
          }
        }
        Object localObject7 = ((Worksheet)localObject2).getSparklineGroupCollection();
        if (((SparklineGroupCollection)localObject7).getCount() > 0) {
          ((SparklineGroupCollection)localObject7).a(localzcw);
        }
      }
    }
  }
  
  void i()
  {
    if ((this.o != null) && (this.o.a)) {
      throw new CellsException(17, "Interrupted by user");
    }
  }
  
  public InterruptMonitor getInterruptMonitor()
  {
    return this.o;
  }
  
  public void setInterruptMonitor(InterruptMonitor value)
  {
    this.o = value;
  }
  
  public ContentTypePropertyCollection getContentTypeProperties()
    throws Exception
  {
    if (this.e == null)
    {
      this.e = new ContentTypePropertyCollection();
      zakk localzakk = new zakk(this);
      zxf localzxf = getWorksheets().h();
      if ((this.f == null) && (localzxf != null))
      {
        this.f = new CustomXmlPartCollection();
        localzakk.a(localzxf);
      }
      localzakk.a();
    }
    return this.e;
  }
  
  public CustomXmlPartCollection getCustomXmlParts()
    throws Exception
  {
    if (this.f == null)
    {
      this.f = new CustomXmlPartCollection();
      zxf localzxf = getWorksheets().h();
      if (localzxf != null)
      {
        zakk localzakk = new zakk(this);
        localzakk.a(localzxf);
      }
    }
    return this.f;
  }
  
  public String getRibbonXml()
  {
    return this.p;
  }
  
  public void setRibbonXml(String value)
  {
    this.p = value;
  }
  
  public String getAbsolutePath()
  {
    return this.k.b();
  }
  
  public void setAbsolutePath(String value)
  {
    this.k.a(value);
  }
  
  public ExternalConnectionCollection getDataConnections()
  {
    if (this.g == null) {
      return this.g = new ExternalConnectionCollection(this);
    }
    return this.g;
  }
  
  public void importXml(String url, String sheetName, int row, int col)
    throws Exception
  {
    if ((url == null) || (!zd.c(url))) {
      throw new IllegalArgumentException("Invalid xml url: " + url);
    }
    Worksheet localWorksheet = getWorksheets().get(sheetName);
    if (localWorksheet == null) {
      throw new IllegalArgumentException("There is no sheet named: " + sheetName);
    }
    zalx localzalx = new zalx(url, this, localWorksheet, row, col);
    localzalx.a();
  }
  
  public void exportXml(String mapName, String path)
    throws Exception
  {
    zwb localzwb = new zwb(this, mapName, path);
    localzwb.a();
  }
  
  public void setDigitalSignature(DigitalSignatureCollection digitalSignatureCollection)
  {
    this.q = digitalSignatureCollection;
    this.h = false;
  }
  
  public void addDigitalSignature(DigitalSignatureCollection digitalSignatureCollection)
  {
    this.q = digitalSignatureCollection;
    this.h = true;
  }
  
  public DigitalSignatureCollection getDigitalSignature()
  {
    if (this.i == null) {
      return null;
    }
    return this.i.b();
  }
  
  void b(zm paramzm)
    throws Exception
  {
    if ((this.q != null) && (this.q.a.size() > 0))
    {
      paramzm.b(0L);
      zaua localzaua = new zaua(this.q, (getSettings().h) && (this.h));
      localzaua.a(paramzm);
    }
  }
  
  void a(zxf paramzxf)
    throws Exception
  {
    if ((this.q != null) && (this.q.a.size() > 0))
    {
      zdc localzdc = new zdc(this.q);
      localzdc.a(paramzxf);
    }
  }
  
  void j()
  {
    if ((this.q != null) && (this.q.a.size() > 0))
    {
      if ((isDigitallySigned()) && (!this.h))
      {
        if (this.a != null) {
          this.a.b(this);
        }
        zxf localzxf = getWorksheets().h();
        if (localzxf != null)
        {
          localzxf.a().g("_signatures");
          localzxf.a().g("_xmlsignatures");
        }
        this.i = null;
        getSettings().h = false;
      }
      this.j.setReCalculateOnOpen(false);
      this.j.setCalcMode(2);
    }
  }
  
  HashMap k()
  {
    return this.r;
  }
  
  boolean l()
  {
    return zit.a();
  }
  
  String m()
  {
    if (zit.a()) {
      return a(s);
    }
    return null;
  }
  
  private static String a(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = new byte[paramArrayOfByte.length];
    for (int i1 = 0; i1 < paramArrayOfByte.length; i1++) {
      arrayOfByte[i1] = ((byte)(paramArrayOfByte[i1] & 0xFF ^ 0x4B));
    }
    String str1 = Encoding.getUTF8().a(arrayOfByte);
    String str2 = com.aspose.cells.a.c.zt.b().substring(0, 4);
    if ((str1.indexOf(str2) < 0) && (str1.indexOf("2016") > -1)) {
      str1 = zw.a(str1, "2016", str2);
    }
    return str1;
  }
  
  public void dispose()
  {
    if (this.t) {
      return;
    }
    this.r = null;
    this.g = null;
    this.e = null;
    this.f = null;
    this.m = null;
    this.l = null;
    this.o = null;
    this.p = null;
    if (this.j != null) {
      this.j.a();
    }
    this.j = null;
    if (this.a != null) {
      this.a.dispose();
    }
    this.a = null;
    this.b = null;
    this.k.a();
    this.k = null;
    this.q = null;
    this.t = true;
    zg.a(this);
  }
  
  ContentTypePropertyCollection n()
  {
    return this.e;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/Workbook.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */