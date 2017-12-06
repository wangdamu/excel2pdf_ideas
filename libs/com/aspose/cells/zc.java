package com.aspose.cells;

class zc
  extends zcd
{
  zc()
  {
    c(4177);
  }
  
  void a(int paramInt)
  {
    b(8);
    this.b = new byte[8];
    this.b[0] = ((byte)paramInt);
    this.b[1] = 1;
  }
  
  void a()
  {
    b(8);
    this.b = new byte[8];
    this.b[1] = 1;
  }
  
  void a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
    {
      b(8);
      this.b = new byte[8];
      this.b[1] = 1;
    }
    else
    {
      a((short)(paramArrayOfByte.length + 6));
      this.b = new byte[d()];
      this.b[1] = 2;
      System.arraycopy(paramArrayOfByte, 0, this.b, 6, paramArrayOfByte.length);
    }
  }
  
  void a(DataLabels paramDataLabels, WorksheetCollection paramWorksheetCollection, byte[] paramArrayOfByte)
  {
    b(6);
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length != 0)) {
      a((short)(d() + paramArrayOfByte.length));
    } else {
      b(d() + 2);
    }
    this.b = new byte[d()];
    this.b[1] = 1;
    if ((!paramDataLabels.getNumberFormatLinked()) || (paramDataLabels.getShowPercentage()))
    {
      if ((paramDataLabels.getNumberFormat() != null) && (!"".equals(paramDataLabels.getNumberFormat())))
      {
        this.b[2] = 1;
        int i = paramDataLabels.M();
        System.arraycopy(com.aspose.cells.b.a.zc.a(i), 0, this.b, 4, 2);
      }
      else if (paramDataLabels.M() > 0)
      {
        this.b[2] = 1;
        System.arraycopy(com.aspose.cells.b.a.zc.a(paramDataLabels.getNumber()), 0, this.b, 4, 2);
      }
      if ((paramDataLabels.getShowPercentage()) && (this.b[2] != 1))
      {
        this.b[2] = 1;
        this.b[4] = 9;
      }
    }
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length != 0))
    {
      this.b[1] = 2;
      System.arraycopy(paramArrayOfByte, 0, this.b, 6, paramArrayOfByte.length);
    }
  }
  
  void a(Chart paramChart, Series paramSeries, WorksheetCollection paramWorksheetCollection, int paramInt, zrg paramzrg)
    throws Exception
  {
    Object localObject = paramSeries.l();
    if ((localObject == null) || (((localObject instanceof String)) && ("".equals((String)localObject))))
    {
      b(8);
      this.b = new byte[8];
      this.b[1] = 1;
      a(paramzrg);
      return;
    }
    if ((localObject instanceof String))
    {
      b(8);
      this.b = new byte[8];
      this.b[1] = 1;
      a(paramzrg);
      a((String)localObject, paramzrg);
      return;
    }
    if ((localObject instanceof byte[]))
    {
      byte[] arrayOfByte = (byte[])localObject;
      a((short)(6 + arrayOfByte.length));
      this.b = new byte[d()];
      this.b[1] = 2;
      System.arraycopy(arrayOfByte, 0, this.b, 6, arrayOfByte.length);
      a(paramzrg);
      int i = 2;
      int j = com.aspose.cells.b.a.zc.e(arrayOfByte, i + 1) & 0xFFFF;
      paramInt = paramWorksheetCollection.r().d(j, paramWorksheetCollection.v());
      if ((paramInt < 0) || (paramInt >= paramWorksheetCollection.getCount()))
      {
        if (paramSeries.c != null) {
          a(paramSeries.c, paramzrg);
        }
        return;
      }
      Worksheet localWorksheet = paramWorksheetCollection.get(paramInt);
      Cells localCells = localWorksheet.getCells();
      int k = com.aspose.cells.b.a.zc.e(arrayOfByte, i + 3) & 0xFFFF;
      int m = arrayOfByte[(i + 5)];
      Cell localCell = localCells.checkCell(k, m & 0xFF);
      String str = localCell == null ? "" : localCell.k();
      a(str, paramzrg);
    }
  }
  
  void a(byte paramByte, zjk paramzjk, int paramInt1, zrg paramzrg, int paramInt2)
    throws Exception
  {
    paramzrg.c(4177);
    if (paramzjk == null)
    {
      paramzrg.c(8);
      paramzrg.a(paramByte);
      if (paramByte != 2) {
        paramzrg.a((byte)1);
      } else {
        paramzrg.a((byte)0);
      }
      paramzrg.c(0);
      paramzrg.a(0);
      return;
    }
    switch (paramzjk.a())
    {
    case 1: 
    case 3: 
      paramzrg.c(8);
      paramzrg.a(paramByte);
      paramzrg.a((byte)1);
      paramzrg.c(0);
      paramzrg.a(0);
      break;
    case 2: 
      byte[] arrayOfByte = paramzjk.c;
      paramzrg.a((short)(arrayOfByte.length + 6));
      paramzrg.a(paramByte);
      paramzrg.a((byte)2);
      if (paramByte == 1)
      {
        paramzrg.c(0);
        paramzrg.a((short)paramInt2);
      }
      else
      {
        paramzrg.a(0);
      }
      paramzrg.a(arrayOfByte);
      break;
    default: 
      throw new Exception("Invalid ASeries values/xvalues/bubble sizes.");
    }
  }
  
  void b(Chart paramChart, Series paramSeries, WorksheetCollection paramWorksheetCollection, int paramInt, zrg paramzrg)
    throws Exception
  {
    a(paramChart, paramSeries, paramWorksheetCollection, paramInt, paramzrg);
    a((byte)1, paramSeries.m(), paramInt, paramzrg, paramSeries.d);
    a((byte)2, paramSeries.o(), paramInt, paramzrg, 0);
    if (ChartCollection.q(paramSeries.getType())) {
      a((byte)3, paramSeries.p(), paramInt, paramzrg, 0);
    } else {
      a((byte)3, null, paramInt, paramzrg, 0);
    }
  }
  
  private void a(String paramString, zrg paramzrg)
    throws Exception
  {
    zbfk localzbfk = new zbfk(paramString);
    localzbfk.a(paramzrg);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */