package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.d.zk;
import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;

public class OleObject
  extends Shape
{
  private boolean b = false;
  private byte c = 1;
  private byte[] d;
  private boolean e;
  private String f;
  private int C = 255;
  private boolean D;
  String a;
  private int E = -1;
  private boolean F;
  private int G;
  private com.aspose.cells.b.a.zh H = com.aspose.cells.b.a.zh.a;
  private byte I = 0;
  private static final za J = new za(new String[] { ".wav", "Acrobat Document" });
  
  OleObject(ShapeCollection shapes)
  {
    super(shapes, 24, shapes);
    R().d().a(267, 0, Integer.valueOf(1));
  }
  
  boolean a()
  {
    return this.b;
  }
  
  void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }
  
  byte b()
  {
    return this.c;
  }
  
  void a(byte paramByte)
  {
    this.c = paramByte;
  }
  
  public boolean isAutoSize()
  {
    return (this.c & 0xFF & 0x1) != 0;
  }
  
  public void setAutoSize(boolean value)
  {
    if (value) {
      this.c = ((byte)(this.c | 0x1));
    } else {
      this.c = ((byte)(this.c & 0xFE));
    }
  }
  
  public boolean isLink()
  {
    return (this.c & 0xFF & 0x2) == 2;
  }
  
  public void setLink(boolean value)
  {
    if (value) {
      this.c = ((byte)(this.c | 0x2));
    } else {
      this.c = ((byte)(this.c & 0xFD));
    }
  }
  
  boolean c()
  {
    return (isLink()) && (this.E != -1);
  }
  
  public boolean getDisplayAsIcon()
  {
    return (this.c & 0xFF & 0x8) != 0;
  }
  
  public void setDisplayAsIcon(boolean value)
  {
    if (value) {
      this.c = ((byte)(this.c | 0x8));
    } else {
      this.c = ((byte)(this.c & 0xF7));
    }
  }
  
  zcf d()
  {
    if (e() > 0) {
      return P().L().b().a(e() - 1);
    }
    return null;
  }
  
  int e()
  {
    return R().d().c(16644, 0);
  }
  
  void a(int paramInt)
  {
    R().d().a(16644, 0, Integer.valueOf(paramInt));
  }
  
  public byte[] getImageData()
  {
    zcf localzcf = d();
    if (localzcf == null) {
      return null;
    }
    return localzcf.b();
  }
  
  public void setImageData(byte[] value)
    throws Exception
  {
    if (e() != -1)
    {
      int i = e();
      a(0);
      N().f(i);
    }
    if (value == null) {
      return;
    }
    a(N().e().b().a(value) + 1);
  }
  
  public byte[] getObjectData()
  {
    return this.d;
  }
  
  public void setObjectData(byte[] value)
  {
    this.d = value;
  }
  
  public String getImageSourceFullName()
  {
    if ((f() & 0xA) != 0) {
      return R().d().e(49413);
    }
    return null;
  }
  
  public void setImageSourceFullName(String value)
  {
    R().d().a(49413, 2, value);
    b(14);
    if (R().d().c(16644) != null)
    {
      d().j();
      R().d().b(16644);
    }
  }
  
  int f()
  {
    return R().d().c(262, 0);
  }
  
  void b(int paramInt)
  {
    R().d().a(262, 0, Integer.valueOf(paramInt));
  }
  
  boolean g()
    throws Exception
  {
    u();
    return FileFormatUtil.e(this.C);
  }
  
  byte[] h()
    throws Exception
  {
    if (l())
    {
      localzxf = new zxf(this.H);
      localzh1 = new com.aspose.cells.b.a.d.zh(j());
      localzxf.a().a("\001Ole10Native", localzh1);
      localzh2 = new com.aspose.cells.b.a.d.zh();
      localzxf.a(localzh2);
      return localzh2.o();
    }
    if (g()) {
      return this.d;
    }
    if (FileFormatUtil.a(this.d)) {
      return this.d;
    }
    if (this.d == null) {
      return null;
    }
    zxf localzxf = new zxf(this.H);
    com.aspose.cells.b.a.d.zh localzh1 = new com.aspose.cells.b.a.d.zh(this.d);
    localzxf.a().a("CONTENTS", localzh1);
    com.aspose.cells.b.a.d.zh localzh2 = new com.aspose.cells.b.a.d.zh();
    localzxf.a(localzh2);
    return localzh2.o();
  }
  
  void a(byte[] paramArrayOfByte)
    throws Exception
  {
    this.d = paramArrayOfByte;
    if (FileFormatUtil.a(paramArrayOfByte))
    {
      com.aspose.cells.b.a.d.zh localzh = new com.aspose.cells.b.a.d.zh(paramArrayOfByte);
      zxf localzxf = new zxf(localzh);
      FileFormatInfo localFileFormatInfo = FileFormatUtil.a(null, null, localzxf.a());
      zaoz localzaoz = localzxf.a();
      a(localzaoz.a());
      c(localFileFormatInfo.getFileFormatType());
      this.b = false;
      switch (localFileFormatInfo.getFileFormatType())
      {
      case 35: 
        localzh = localzaoz.a("\001Ole10Native");
        this.e = true;
        a(localzh);
        break;
      case 31: 
        localzaoz.g("\001Ole");
        break;
      case 255: 
        localzh = localzaoz.a("CONTENTS");
        if (localzh != null) {
          this.d = localzh.o();
        }
        break;
      }
    }
  }
  
  boolean i()
  {
    switch (this.c)
    {
    case 0: 
    case 1: 
    case 5: 
    case 8: 
    case 9: 
      return true;
    case 3: 
      return (!this.b) || ((this.f != null) && ("Equation".equals(this.f)));
    }
    return false;
  }
  
  byte[] j()
  {
    if ((this.a == null) || ("".equals(this.a)))
    {
      if ((this.d == null) || (this.d.length == 0)) {
        return new byte[0];
      }
      int i = this.d.length;
      byte[] arrayOfByte1 = new byte[i + 4];
      System.arraycopy(zc.a(i), 0, arrayOfByte1, 0, 4);
      System.arraycopy(this.d, 0, arrayOfByte1, 4, this.d.length);
      return arrayOfByte1;
    }
    String str1 = this.a;
    int j = str1.lastIndexOf('\\');
    String str2 = str1.substring(j + 1);
    byte[] arrayOfByte2 = Encoding.getDefault().a(str2);
    byte[] arrayOfByte3 = Encoding.getDefault().a(this.a);
    int k = arrayOfByte3.length * 2 + arrayOfByte2.length + 19 + this.d.length;
    byte[] arrayOfByte4 = new byte[k + 4];
    System.arraycopy(zc.a(k), 0, arrayOfByte4, 0, 4);
    int m = 4;
    arrayOfByte4[m] = 2;
    m += 2;
    System.arraycopy(arrayOfByte2, 0, arrayOfByte4, m, arrayOfByte2.length);
    m += arrayOfByte2.length + 1;
    System.arraycopy(arrayOfByte3, 0, arrayOfByte4, m, arrayOfByte3.length);
    m += arrayOfByte3.length + 1;
    arrayOfByte4[(m + 2)] = 3;
    m += 4;
    System.arraycopy(zc.a(arrayOfByte3.length + 1), 0, arrayOfByte4, m, 4);
    m += 4;
    System.arraycopy(arrayOfByte3, 0, arrayOfByte4, m, arrayOfByte3.length);
    m += arrayOfByte3.length + 1;
    System.arraycopy(zc.a(this.d.length), 0, arrayOfByte4, m, 4);
    m += 4;
    System.arraycopy(this.d, 0, arrayOfByte4, m, this.d.length);
    return arrayOfByte4;
  }
  
  void a(com.aspose.cells.b.a.d.zh paramzh)
    throws Exception
  {
    byte[] arrayOfByte1 = paramzh.o();
    if (arrayOfByte1.length == 0) {
      return;
    }
    int i = zc.a(arrayOfByte1, 0);
    int j = zc.b(arrayOfByte1, 4);
    if (j != 2)
    {
      k = i;
      localObject = new byte[k];
      System.arraycopy(arrayOfByte1, 4, localObject, 0, k);
      this.d = ((byte[])localObject);
      return;
    }
    int k = 6;
    Object localObject = { k };
    String str = a(arrayOfByte1, (int[])localObject);
    k = localObject[0];
    localObject[0] = k;
    this.a = a(arrayOfByte1, (int[])localObject);
    k = localObject[0];
    k += 8;
    localObject[0] = k;
    b(arrayOfByte1, (int[])localObject);
    k = localObject[0];
    int m = zc.a(arrayOfByte1, k);
    k += 4;
    byte[] arrayOfByte2 = new byte[m];
    System.arraycopy(arrayOfByte1, k, arrayOfByte2, 0, m);
    this.d = arrayOfByte2;
  }
  
  static String a(byte[] paramArrayOfByte, int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt[0];
    int j = 0;
    for (;;)
    {
      if ((paramArrayOfByte[paramArrayOfInt[0]] & 0xFF) > Byte.MAX_VALUE) {
        j = 1;
      }
      int tmp25_24 = 0;
      int[] tmp25_23 = paramArrayOfInt;
      int tmp27_26 = tmp25_23[tmp25_24];
      tmp25_23[tmp25_24] = (tmp27_26 + 1);
      if ((paramArrayOfByte[tmp27_26] & 0xFF) == 0) {
        break;
      }
    }
    if (j != 0) {
      return Encoding.getDefault().a(paramArrayOfByte, i, paramArrayOfInt[0] - i - 1);
    }
    return Encoding.getASCII().a(paramArrayOfByte, i, paramArrayOfInt[0] - i - 1);
  }
  
  static void b(byte[] paramArrayOfByte, int[] paramArrayOfInt)
  {
    for (;;)
    {
      int tmp3_2 = 0;
      int[] tmp3_1 = paramArrayOfInt;
      int tmp5_4 = tmp3_1[tmp3_2];
      tmp3_1[tmp3_2] = (tmp5_4 + 1);
      if ((paramArrayOfByte[tmp5_4] & 0xFF) == 0) {
        break;
      }
    }
  }
  
  boolean k()
  {
    return this.e;
  }
  
  void b(boolean paramBoolean)
  {
    this.e = true;
  }
  
  boolean l()
    throws Exception
  {
    if (this.e) {
      return true;
    }
    if (isLink()) {
      return false;
    }
    if ((this.a == null) || ("".equals(this.a))) {
      switch (m())
      {
      case 5: 
      case 6: 
      case 7: 
      case 8: 
      case 9: 
      case 13: 
      case 16: 
      case 22: 
      case 23: 
      case 24: 
      case 25: 
      case 26: 
      case 27: 
      case 31: 
      case 32: 
      case 38: 
      case 39: 
      case 40: 
      case 41: 
      case 42: 
      case 43: 
      case 44: 
      case 45: 
      case 52: 
        break;
      case 255: 
        break;
      default: 
        String str = FileFormatUtil.a(m(), ".bin");
        if (!".bin".equals(str))
        {
          this.a = ("oleObject" + this.G + str);
          this.e = true;
          setProgID("Package");
          a(zaej.b);
        }
        break;
      }
    }
    if (m() == 35)
    {
      this.e = true;
      if (".bin".equals(this.a)) {}
    }
    return this.e;
  }
  
  public void setNativeSourceFullName(String sourceFullName)
    throws Exception
  {
    this.a = sourceFullName;
    this.e = true;
    a(zaej.b);
    setProgID("Package");
    c(FileFormatUtil.a(zk.d(sourceFullName), 255));
  }
  
  public String getProgID()
    throws Exception
  {
    u();
    return this.f;
  }
  
  public void setProgID(String value)
  {
    this.f = value;
    this.I = ((byte)(this.I | 0x4));
  }
  
  int m()
    throws Exception
  {
    u();
    return this.C;
  }
  
  void c(int paramInt)
  {
    this.C = paramInt;
    this.I = ((byte)(this.I | 0x1));
    if (paramInt == 35) {
      this.e = true;
    }
  }
  
  public int getFileFormatType()
    throws Exception
  {
    u();
    return this.C;
  }
  
  public void setFileFormatType(int value)
  {
    if ((this.C != 255) || (this.C != value))
    {
      this.I = ((byte)(this.I & 0xFD));
      this.H = com.aspose.cells.b.a.zh.a;
    }
    c(value);
  }
  
  /**
   * @deprecated
   */
  public int getFileType()
  {
    switch (this.C)
    {
    case 5: 
    case 52: 
      return 0;
    case 31: 
      return 1;
    case 32: 
      return 2;
    case 13: 
      return 3;
    case 34: 
      return 4;
    case 33: 
      return 5;
    case 6: 
      return 6;
    case 16: 
      return 7;
    case 27: 
    case 38: 
    case 39: 
    case 40: 
      return 8;
    case 26: 
    case 41: 
    case 42: 
    case 43: 
    case 44: 
    case 45: 
      return 9;
    }
    return 10;
  }
  
  /**
   * @deprecated
   */
  public void setFileType(int value)
  {
    switch (value)
    {
    case 0: 
      setFileFormatType(5);
      break;
    case 1: 
      setFileFormatType(31);
      break;
    case 2: 
      setFileFormatType(32);
      break;
    case 3: 
      setFileFormatType(13);
      break;
    case 4: 
      setFileFormatType(34);
      break;
    case 5: 
      setFileFormatType(33);
      break;
    case 6: 
      setFileFormatType(6);
      break;
    case 7: 
      setFileFormatType(16);
      break;
    case 8: 
      setFileFormatType(27);
      break;
    case 9: 
      setFileFormatType(26);
      break;
    }
  }
  
  int n()
  {
    if ((isLink()) && (this.E == -1))
    {
      WorksheetCollection localWorksheetCollection = N().j();
      zbth localzbth = localWorksheetCollection.w();
      for (int i = 0; i < localzbth.getCount(); i++)
      {
        zbti localzbti = localzbth.a(i);
        if (localzbti.a() == 4)
        {
          ArrayList localArrayList = localzbti.b();
          if ((localArrayList != null) && (localArrayList.size() >= 1)) {
            for (int j = 0; j < localArrayList.size(); j++)
            {
              int k = ((zwh)localArrayList.get(j)).c();
              if (k == this.G) {
                this.E = P().r().a(i, 65534, 65534, true);
              }
            }
          }
        }
      }
    }
    return this.E;
  }
  
  void d(int paramInt)
  {
    this.E = paramInt;
  }
  
  int o()
  {
    int i = P().r().c(this.E);
    zbti localzbti = P().w().a(i);
    for (int j = 0; j < localzbti.b().size(); j++)
    {
      zwh localzwh = (zwh)localzbti.b().get(j);
      if (localzwh.c() == this.G) {
        return j;
      }
    }
    return -1;
  }
  
  void e(int paramInt)
  {
    int i = P().r().c(this.E);
    zbti localzbti = P().w().a(i);
    zwh localzwh = (zwh)localzbti.b().get(paramInt);
    this.G = localzwh.c();
    String str1 = null;
    String str2 = null;
    String[] arrayOfString1 = { str1 };
    String[] arrayOfString2 = { str2 };
    localzbti.a(arrayOfString1, arrayOfString2);
    str1 = arrayOfString1[0];
    str2 = arrayOfString2[0];
    setProgID(str1);
    this.a = str2;
  }
  
  void a(String paramString)
    throws Exception
  {
    WorksheetCollection localWorksheetCollection = this.j.j();
    int i = localWorksheetCollection.w().a(this.f, paramString, true);
    zbti localzbti = localWorksheetCollection.w().a(i);
    int j = localWorksheetCollection.r().a(i, 65534, 65534, true);
    this.E = j;
    this.a = localzbti.l();
    if (localzbti.a() == 4)
    {
      if (localWorksheetCollection.h() == null) {
        localWorksheetCollection.a(new zxf(zaej.n));
      }
      zwh localzwh;
      if (localzbti.b().size() == 0)
      {
        localzwh = new zwh(localzbti);
        localzwh.a("'");
        zf.a(localzbti.b(), localzwh);
        localzwh.b(this.G);
        localzwh.d(86);
        localzwh.c = 9;
        String str = "LNK" + com.aspose.cells.a.c.zp.d(this.G);
        com.aspose.cells.b.a.d.zh localzh = new com.aspose.cells.b.a.d.zh();
        localWorksheetCollection.h().a().a(str, localzh);
      }
      else
      {
        localzwh = (zwh)localzbti.b().get(0);
        this.G = localzwh.c();
        localzwh.d(localzwh.g() | 0x10);
      }
    }
  }
  
  public String getObjectSourceFullName()
  {
    return this.a;
  }
  
  public void setObjectSourceFullName(String value)
    throws Exception
  {
    this.a = value;
    if (this.C != 255) {
      return;
    }
    if (value == null) {
      return;
    }
    c(FileFormatUtil.a(zk.d(value), 255));
    setProgID(FileFormatUtil.d(this.C));
    if ((isLink()) && (getObjectData() == null))
    {
      if (this.b) {
        S().a = null;
      }
      a(value);
      this.b = false;
      return;
    }
    switch (m())
    {
    case 5: 
      this.a = value;
      setProgID("Excel.Sheet.8");
      break;
    case 13: 
      if (((!isLink()) || (getObjectData() != null)) && (m() == 13)) {
        this.a = null;
      }
      break;
    case 1: 
    case 11: 
    case 12: 
    case 14: 
    case 15: 
    case 17: 
    case 20: 
    case 21: 
    case 28: 
    case 30: 
    case 33: 
    case 34: 
    case 35: 
    case 37: 
    case 55: 
    case 255: 
      switch (J.a(zk.d(value).toLowerCase()))
      {
      case 0: 
        this.e = true;
        setProgID("Sound Recorder Document");
        this.c = 9;
        a(zaej.a);
        break;
      default: 
        this.a = value;
        this.e = true;
        setProgID("Package");
        a(zaej.b);
      }
      return;
    }
  }
  
  /**
   * @deprecated
   */
  public String getSourceFullName()
  {
    return this.a;
  }
  
  /**
   * @deprecated
   */
  public void setSourceFullName(String value)
    throws Exception
  {
    setObjectSourceFullName(value);
  }
  
  void b(String paramString)
  {
    this.a = paramString;
  }
  
  int p()
  {
    int i = n();
    if (i != -1) {
      return P().r().c(i);
    }
    return -1;
  }
  
  String q()
  {
    if (isLink())
    {
      int i = p();
      if (i == -1) {
        return null;
      }
      WorksheetCollection localWorksheetCollection = N().j();
      zbth localzbth = localWorksheetCollection.w();
      i += (localWorksheetCollection.v() > i ? 1 : 0);
      return "[" + i + "]!''''";
    }
    return null;
  }
  
  void c(String paramString)
    throws Exception
  {
    this.b = true;
    int i = paramString.indexOf("]");
    if (i == -1)
    {
      this.a = paramString;
      return;
    }
    String str1 = paramString.substring(1, 1 + (i - 1));
    if (!zarb.c(str1))
    {
      this.a = paramString;
      return;
    }
    this.c = 3;
    int j = com.aspose.cells.b.a.zp.a(str1);
    WorksheetCollection localWorksheetCollection = this.j.j();
    zbti localzbti = localWorksheetCollection.w().a(j);
    this.a = localzbti.l();
    this.E = P().r().a(j, 65534, 65534, true);
    if (localzbti.a() == 4)
    {
      if (localWorksheetCollection.h() == null) {
        localWorksheetCollection.a(new zxf(zaej.n));
      }
      com.aspose.cells.b.a.d.zh localzh = new com.aspose.cells.b.a.d.zh();
      String str2 = "LNK" + com.aspose.cells.a.c.zp.d(this.G);
      localWorksheetCollection.h().a().a(str2, localzh);
      zwh localzwh;
      if (localzbti.b().size() == 0)
      {
        localzwh = new zwh(localzbti);
        localzwh.a("'");
        zf.a(localzbti.b(), localzwh);
        localzwh.b(this.G);
        localzwh.d(86);
      }
      else
      {
        localzwh = (zwh)localzbti.b().get(0);
        localzwh.b(this.G);
        localzwh.d(localzwh.g() | 0x10);
      }
    }
  }
  
  byte[] r()
  {
    byte[] arrayOfByte = new byte[15];
    arrayOfByte[0] = 7;
    arrayOfByte[4] = 89;
    int i = this.E;
    int j = o();
    System.arraycopy(zc.a(i), 0, arrayOfByte, 5, 2);
    System.arraycopy(zc.a(j + 1), 0, arrayOfByte, 7, 2);
    return arrayOfByte;
  }
  
  void b(byte[] paramArrayOfByte)
    throws Exception
  {
    WorksheetCollection localWorksheetCollection = P();
    byte[] arrayOfByte = paramArrayOfByte;
    int i = 5;
    int j = zc.e(arrayOfByte, i) & 0xFFFF;
    this.E = j;
    int k = P().r().c(j);
    zbti localzbti = P().w().a(k);
    i += 2;
    int m = zc.e(arrayOfByte, i) & 0xFFFF;
    zwh localzwh = (zwh)localzbti.b().get(m - 1);
    if (localzbti.a() == 4)
    {
      if (localWorksheetCollection.h() == null) {
        localWorksheetCollection.a(new zxf(zaej.n));
      }
      com.aspose.cells.b.a.d.zh localzh = new com.aspose.cells.b.a.d.zh();
      String str = "LNK" + com.aspose.cells.a.c.zp.d(this.G);
      localWorksheetCollection.h().a().a(str, localzh);
      localzwh.b(this.G);
      localzwh.d(localzwh.g() | 0x10);
    }
  }
  
  public boolean getAutoUpdate()
  {
    return this.D;
  }
  
  public void setAutoUpdate(boolean value)
  {
    this.D = value;
  }
  
  public boolean getAutoLoad()
  {
    return this.F;
  }
  
  public void setAutoLoad(boolean value)
  {
    this.F = value;
  }
  
  int s()
  {
    return this.G;
  }
  
  void f(int paramInt)
  {
    this.G = paramInt;
  }
  
  com.aspose.cells.b.a.zh t()
    throws Exception
  {
    u();
    return this.H;
  }
  
  void a(com.aspose.cells.b.a.zh paramzh)
  {
    this.H = paramzh;
    this.I = ((byte)(this.I | 0x2));
  }
  
  public byte[] getClassIdentifier()
  {
    if (this.H == null) {
      return null;
    }
    return this.H.a();
  }
  
  public void setClassIdentifier(byte[] value)
  {
    a(new com.aspose.cells.b.a.zh(value));
  }
  
  /* Error */
  void u()
    throws Exception
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 69	com/aspose/cells/OleObject:I	B
    //   4: bipush 7
    //   6: if_icmpne +4 -> 10
    //   9: return
    //   10: aconst_null
    //   11: astore_1
    //   12: aload_0
    //   13: getfield 69	com/aspose/cells/OleObject:I	B
    //   16: sipush 255
    //   19: iand
    //   20: iconst_1
    //   21: iand
    //   22: ifne +238 -> 260
    //   25: aload_0
    //   26: getfield 71	com/aspose/cells/OleObject:a	Ljava/lang/String;
    //   29: ifnull +30 -> 59
    //   32: aload_0
    //   33: getfield 71	com/aspose/cells/OleObject:a	Ljava/lang/String;
    //   36: ifnull +23 -> 59
    //   39: aload_0
    //   40: aload_0
    //   41: getfield 71	com/aspose/cells/OleObject:a	Ljava/lang/String;
    //   44: invokestatic 147	com/aspose/cells/b/a/d/zk:d	(Ljava/lang/String;)Ljava/lang/String;
    //   47: sipush 255
    //   50: invokestatic 93	com/aspose/cells/FileFormatUtil:a	(Ljava/lang/String;I)I
    //   53: invokevirtual 111	com/aspose/cells/OleObject:c	(I)V
    //   56: goto +67 -> 123
    //   59: aload_0
    //   60: getfield 74	com/aspose/cells/OleObject:d	[B
    //   63: ifnull +53 -> 116
    //   66: new 34	com/aspose/cells/b/a/d/zh
    //   69: dup
    //   70: aload_0
    //   71: getfield 74	com/aspose/cells/OleObject:d	[B
    //   74: invokespecial 144	com/aspose/cells/b/a/d/zh:<init>	([B)V
    //   77: astore_2
    //   78: aload_2
    //   79: invokestatic 96	com/aspose/cells/FileFormatUtil:b	(Lcom/aspose/cells/b/a/d/zm;)Lcom/aspose/cells/FileFormatInfo;
    //   82: astore_1
    //   83: aload_0
    //   84: aload_1
    //   85: invokevirtual 90	com/aspose/cells/FileFormatInfo:getFileFormatType	()I
    //   88: invokevirtual 111	com/aspose/cells/OleObject:c	(I)V
    //   91: aload_2
    //   92: ifnull +21 -> 113
    //   95: aload_2
    //   96: invokevirtual 145	com/aspose/cells/b/a/d/zh:a	()V
    //   99: goto +14 -> 113
    //   102: astore_3
    //   103: aload_2
    //   104: ifnull +7 -> 111
    //   107: aload_2
    //   108: invokevirtual 145	com/aspose/cells/b/a/d/zh:a	()V
    //   111: aload_3
    //   112: athrow
    //   113: goto +10 -> 123
    //   116: aload_0
    //   117: sipush 255
    //   120: invokevirtual 111	com/aspose/cells/OleObject:c	(I)V
    //   123: aload_0
    //   124: getfield 63	com/aspose/cells/OleObject:C	I
    //   127: sipush 255
    //   130: if_icmpne +218 -> 348
    //   133: aload_0
    //   134: getfield 69	com/aspose/cells/OleObject:I	B
    //   137: sipush 255
    //   140: iand
    //   141: iconst_2
    //   142: iand
    //   143: ifeq +48 -> 191
    //   146: aload_0
    //   147: invokevirtual 128	com/aspose/cells/OleObject:t	()Lcom/aspose/cells/b/a/zh;
    //   150: bipush 13
    //   152: invokestatic 91	com/aspose/cells/FileFormatUtil:a	(I)Lcom/aspose/cells/b/a/zh;
    //   155: invokevirtual 155	com/aspose/cells/b/a/zh:equals	(Ljava/lang/Object;)Z
    //   158: ifeq +12 -> 170
    //   161: aload_0
    //   162: bipush 13
    //   164: invokevirtual 111	com/aspose/cells/OleObject:c	(I)V
    //   167: goto +24 -> 191
    //   170: aload_0
    //   171: invokevirtual 128	com/aspose/cells/OleObject:t	()Lcom/aspose/cells/b/a/zh;
    //   174: bipush 54
    //   176: invokestatic 91	com/aspose/cells/FileFormatUtil:a	(I)Lcom/aspose/cells/b/a/zh;
    //   179: invokevirtual 155	com/aspose/cells/b/a/zh:equals	(Ljava/lang/Object;)Z
    //   182: ifeq +9 -> 191
    //   185: aload_0
    //   186: bipush 54
    //   188: invokevirtual 111	com/aspose/cells/OleObject:c	(I)V
    //   191: aload_0
    //   192: getfield 63	com/aspose/cells/OleObject:C	I
    //   195: sipush 255
    //   198: if_icmpne +150 -> 348
    //   201: aload_0
    //   202: getfield 76	com/aspose/cells/OleObject:f	Ljava/lang/String;
    //   205: ifnull +143 -> 348
    //   208: ldc 4
    //   210: aload_0
    //   211: getfield 76	com/aspose/cells/OleObject:f	Ljava/lang/String;
    //   214: invokevirtual 199	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   217: ifne +131 -> 348
    //   220: getstatic 70	com/aspose/cells/OleObject:J	Lcom/aspose/cells/b/c/a/za;
    //   223: aload_0
    //   224: getfield 76	com/aspose/cells/OleObject:f	Ljava/lang/String;
    //   227: invokevirtual 158	com/aspose/cells/b/c/a/za:a	(Ljava/lang/String;)I
    //   230: lookupswitch	default:+27->257, 1:+18->248
    //   248: aload_0
    //   249: bipush 13
    //   251: invokevirtual 111	com/aspose/cells/OleObject:c	(I)V
    //   254: goto +94 -> 348
    //   257: goto +91 -> 348
    //   260: aload_0
    //   261: getfield 69	com/aspose/cells/OleObject:I	B
    //   264: sipush 255
    //   267: iand
    //   268: iconst_2
    //   269: iand
    //   270: ifne +78 -> 348
    //   273: aload_0
    //   274: getfield 74	com/aspose/cells/OleObject:d	[B
    //   277: ifnull +71 -> 348
    //   280: aload_0
    //   281: getfield 63	com/aspose/cells/OleObject:C	I
    //   284: lookupswitch	default:+64->348, 32:+20->304
    //   304: new 34	com/aspose/cells/b/a/d/zh
    //   307: dup
    //   308: aload_0
    //   309: getfield 74	com/aspose/cells/OleObject:d	[B
    //   312: invokespecial 144	com/aspose/cells/b/a/d/zh:<init>	([B)V
    //   315: astore_2
    //   316: aload_2
    //   317: invokestatic 96	com/aspose/cells/FileFormatUtil:b	(Lcom/aspose/cells/b/a/d/zm;)Lcom/aspose/cells/FileFormatInfo;
    //   320: astore_1
    //   321: aload_2
    //   322: ifnull +23 -> 345
    //   325: aload_2
    //   326: invokevirtual 145	com/aspose/cells/b/a/d/zh:a	()V
    //   329: goto +16 -> 345
    //   332: astore 4
    //   334: aload_2
    //   335: ifnull +7 -> 342
    //   338: aload_2
    //   339: invokevirtual 145	com/aspose/cells/b/a/d/zh:a	()V
    //   342: aload 4
    //   344: athrow
    //   345: goto +3 -> 348
    //   348: aload_0
    //   349: getfield 69	com/aspose/cells/OleObject:I	B
    //   352: sipush 255
    //   355: iand
    //   356: iconst_2
    //   357: iand
    //   358: ifne +46 -> 404
    //   361: aload_1
    //   362: ifnull +18 -> 380
    //   365: aload_1
    //   366: getfield 62	com/aspose/cells/FileFormatInfo:d	Lcom/aspose/cells/b/a/zh;
    //   369: ifnull +11 -> 380
    //   372: aload_0
    //   373: aload_1
    //   374: getfield 62	com/aspose/cells/FileFormatInfo:d	Lcom/aspose/cells/b/a/zh;
    //   377: invokevirtual 106	com/aspose/cells/OleObject:a	(Lcom/aspose/cells/b/a/zh;)V
    //   380: aload_0
    //   381: getfield 68	com/aspose/cells/OleObject:H	Lcom/aspose/cells/b/a/zh;
    //   384: getstatic 79	com/aspose/cells/b/a/zh:a	Lcom/aspose/cells/b/a/zh;
    //   387: invokestatic 154	com/aspose/cells/b/a/zh:a	(Lcom/aspose/cells/b/a/zh;Lcom/aspose/cells/b/a/zh;)Z
    //   390: ifeq +14 -> 404
    //   393: aload_0
    //   394: aload_0
    //   395: getfield 63	com/aspose/cells/OleObject:C	I
    //   398: invokestatic 91	com/aspose/cells/FileFormatUtil:a	(I)Lcom/aspose/cells/b/a/zh;
    //   401: invokevirtual 106	com/aspose/cells/OleObject:a	(Lcom/aspose/cells/b/a/zh;)V
    //   404: aload_0
    //   405: getfield 69	com/aspose/cells/OleObject:I	B
    //   408: sipush 255
    //   411: iand
    //   412: iconst_4
    //   413: iand
    //   414: ifne +14 -> 428
    //   417: aload_0
    //   418: aload_0
    //   419: getfield 63	com/aspose/cells/OleObject:C	I
    //   422: invokestatic 97	com/aspose/cells/FileFormatUtil:d	(I)Ljava/lang/String;
    //   425: invokevirtual 127	com/aspose/cells/OleObject:setProgID	(Ljava/lang/String;)V
    //   428: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	429	0	this	OleObject
    //   11	363	1	localFileFormatInfo	FileFormatInfo
    //   77	262	2	localzh	com.aspose.cells.b.a.d.zh
    //   102	10	3	localObject1	Object
    //   332	11	4	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   78	91	102	finally
    //   316	321	332	finally
    //   332	334	332	finally
  }
  
  void a(OleObject paramOleObject, CopyOptions paramCopyOptions)
  {
    super.a(paramOleObject, paramCopyOptions);
    boolean bool = paramOleObject.P() == P();
    this.c = paramOleObject.c;
    this.H = paramOleObject.H;
    this.b = paramOleObject.b;
    this.f = paramOleObject.f;
    this.I = paramOleObject.I;
    P().d += 1;
    this.G = P().d;
    this.D = paramOleObject.D;
    if ((paramCopyOptions.a()) || (paramOleObject.isLink()) || (paramOleObject.d == null) || (paramOleObject.k())) {
      this.a = paramOleObject.a;
    }
    this.e = paramOleObject.e;
    this.C = paramOleObject.C;
    a(P().L().b().a(paramOleObject.d(), paramOleObject.e(), bool));
    if (paramOleObject.d != null)
    {
      this.d = new byte[paramOleObject.d.length];
      System.arraycopy(paramOleObject.d, 0, this.d, 0, this.d.length);
    }
  }
  
  public ImageFormat getImageFormat()
    throws Exception
  {
    zcf localzcf = d();
    if ((localzcf == null) || (localzcf.f() == null) || (localzcf.f().e() == null)) {
      return ImageFormat.getBmp();
    }
    return localzcf.a();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/OleObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */