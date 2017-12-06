package com.aspose.cells;

import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.d.zo;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;

class zuk
{
  static void a(zm paramzm, Workbook paramWorkbook, TxtSaveOptions paramTxtSaveOptions)
    throws Exception
  {
    Cells localCells;
    if (zug.a(paramWorkbook.getWorksheets())) {
      localCells = paramWorkbook.getWorksheets().get(0).getCells();
    } else {
      localCells = paramWorkbook.getWorksheets().get(paramWorkbook.getWorksheets().getActiveSheetIndex()).getCells();
    }
    zajm localzajm = null;
    int i = 0;
    Object localObject1;
    if (paramTxtSaveOptions.getLightCellsDataProvider() != null)
    {
      if (!paramTxtSaveOptions.getLightCellsDataProvider().startSheet(localCells.g().getIndex())) {
        return;
      }
      localObject2 = new zadm(localCells.g().d(), 1);
      zang localzang = new zang((zadm)localObject2, paramTxtSaveOptions.getLightCellsDataProvider());
      localzajm = paramWorkbook.getWorksheets().C();
      i = localzajm.b();
      if (paramTxtSaveOptions.getFormatStrategy() == 2) {
        paramWorkbook.getWorksheets().a(new zbsz(localzang));
      } else {
        paramWorkbook.getWorksheets().a(new zbta((zadm)localObject2));
      }
      localObject1 = localzang.a(localCells.g());
    }
    else
    {
      localObject1 = new zhy(localCells.g());
    }
    Object localObject2 = paramTxtSaveOptions.a ? new zo(paramzm) : new zo(paramzm, paramTxtSaveOptions.getEncoding());
    try
    {
      localCells.b = new zlv(localCells, 16383);
      localCells.c = new zlt(localCells, 16383);
      a((zo)localObject2, localCells, (zahd)localObject1, paramTxtSaveOptions);
    }
    finally
    {
      localCells.k();
      localCells.l();
      if (localzajm != null) {
        paramWorkbook.getWorksheets().a(localzajm);
      }
    }
    ((zo)localObject2).c();
    if (paramTxtSaveOptions.getClearData()) {
      paramWorkbook.initialize();
    }
  }
  
  private static void a(zo paramzo, Cells paramCells, zahd paramzahd, TxtSaveOptions paramTxtSaveOptions)
    throws Exception
  {
    int i = paramTxtSaveOptions.getFormatStrategy();
    int j = i != 0 ? 1 : 0;
    WorkbookSettings localWorkbookSettings = paramCells.g().d().getSettings();
    zzx localzzx = localWorkbookSettings.f();
    zzu localzzu = localzzx.j();
    int k = !paramCells.g().getDisplayZeros() ? 1 : 0;
    boolean bool = paramCells.g().getShowFormulas();
    String str1 = paramTxtSaveOptions.getSeparatorString();
    String str2;
    if (paramTxtSaveOptions.getQuoteType() == 1) {
      str2 = "\"\"" + str1;
    } else {
      str2 = str1;
    }
    int m = 0;
    int n = 0;
    if (paramTxtSaveOptions.getTrimLeadingBlankRowAndColumn())
    {
      m = paramCells.getMinColumn();
      n = paramCells.getMinRow();
    }
    int i1 = 0;
    int i2 = paramCells.getMaxDataColumn();
    if (i2 < 0) {
      i2 = 0;
    }
    Style localStyle1 = paramCells.p().Q();
    zajm localzajm = paramCells.p().C();
    Style localStyle2 = null;
    int i3 = 0;
    zbdx localzbdx = new zbdx();
    for (;;)
    {
      zt localzt = paramzahd.b();
      if (localzt == null) {
        break;
      }
      int i4;
      if (j != 0)
      {
        localObject = localzt.a(localzbdx, 11);
        i4 = ((zbdx)localObject).a;
        if (((zbdx)localObject).d())
        {
          localStyle2 = localzajm.b(((zbdx)localObject).d);
          i3 = localStyle2 != null ? 1 : 0;
        }
        else
        {
          i3 = 0;
        }
      }
      else
      {
        i4 = localzt.i();
      }
      if (n < i4) {
        for (;;)
        {
          paramzo.a("\r\n");
          n++;
          if (n == i4) {
            break;
          }
        }
      }
      n++;
      i1 = m;
      for (;;)
      {
        zgs localzgs1 = paramzahd.c();
        if (localzgs1 == null) {
          break;
        }
        if (localzgs1.c != 0)
        {
          if (i1 > m) {
            paramzo.a(str1);
          }
          if (localzgs1.a > i1) {
            for (;;)
            {
              paramzo.a(str2);
              i1++;
              if (i1 == localzgs1.a) {
                break;
              }
            }
          }
          i1++;
          localObject = null;
          if (bool)
          {
            if (localzgs1.c == 5) {
              localObject = paramzahd.a().t();
            } else {
              localObject = localzgs1.a(true, localWorkbookSettings);
            }
          }
          else
          {
            zgs localzgs2 = localzgs1.e();
            int i6 = 18;
            switch (localzgs2.c)
            {
            case 0: 
              localObject = "";
              break;
            case 4: 
              i6 = 18;
              break;
            case 6: 
              if ((k != 0) && (((Integer)localzgs2.d).intValue() == 0)) {
                localObject = "";
              } else {
                i6 = 9;
              }
              break;
            case 3: 
              localObject = paramCells.g().getWorkbook().getSettings().getGlobalizationSettings().getErrorValueString(localzgs2.g());
              break;
            case 1: 
              if ((k != 0) && (((Double)localzgs2.d).doubleValue() == 0.0D)) {
                localObject = "";
              } else {
                i6 = 14;
              }
              break;
            case 2: 
              i6 = 3;
            }
            if (localObject == null) {
              if (paramTxtSaveOptions.getFormatStrategy() == 0)
              {
                localObject = zs.a(localzgs2.d);
              }
              else
              {
                Style localStyle3 = localzajm.b(localzgs1.b);
                if (localStyle3 == null) {
                  if (i3 != 0) {
                    localStyle3 = localStyle2;
                  } else {
                    localStyle3 = localzajm.a(paramCells.c.a(localzgs1.a));
                  }
                }
                zzz localzzz = localzzx.a(localStyle3).a(localzzu, i6, localzgs2.d);
                if (localzzz.e()) {
                  localObject = "###############################################################################################################################################################################################################################################################";
                } else {
                  localObject = localzzz.a(0, true);
                }
              }
            }
          }
          int i5 = 0;
          switch (paramTxtSaveOptions.getQuoteType())
          {
          case 1: 
            i5 = 1;
            break;
          case 0: 
            if (((String)localObject).length() > 0)
            {
              i5 = ((String)localObject).indexOf('"') > -1 ? 1 : 0;
              if (i5 == 0)
              {
                i5 = ((String)localObject).indexOf('\n') > -1 ? 1 : 0;
                if (i5 == 0) {
                  i5 = ((String)localObject).indexOf(str1) > -1 ? 1 : 0;
                }
              }
            }
            break;
          case 2: 
            if (((String)localObject).length() > 0)
            {
              i5 = ((String)localObject).charAt(0) == '"' ? 1 : 0;
              if (i5 == 0)
              {
                i5 = ((String)localObject).indexOf('\n') > -1 ? 1 : 0;
                if (i5 == 0) {
                  i5 = ((String)localObject).indexOf(str1) > -1 ? 1 : 0;
                }
              }
            }
            break;
          }
          if (i5 != 0)
          {
            String str3 = zw.a((String)localObject, "\"", "\"\"");
            str3 = '"' + str3 + '"';
            paramzo.a(str3);
          }
          else
          {
            paramzo.a((String)localObject);
          }
        }
      }
      if (i1 <= i2)
      {
        paramzo.a(str1);
        while (i1 < i2)
        {
          paramzo.a(str2);
          i1++;
        }
        if (paramTxtSaveOptions.getQuoteType() == 1) {
          paramzo.a("\"\"");
        }
      }
      paramzo.a("\r\n");
    }
    Object localObject = paramCells.p().p().m();
    if (localObject != null) {
      paramzo.a((String)localObject);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zuk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */