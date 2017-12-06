package com.aspose.cells;

import com.aspose.cells.a.c.zi;
import com.aspose.cells.a.c.zy;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.zc;
import java.util.ArrayList;
import java.util.HashMap;

class zrd
{
  private Workbook a;
  private WorksheetCollection b;
  private zajl c;
  private Cells d;
  private Worksheet e;
  private HashMap f = new HashMap();
  private int g = 5;
  private int h;
  private int i;
  private byte[] j;
  private byte[] k;
  private LoadDataOption l;
  private ArrayList m;
  private ArrayList n;
  private ArrayList o;
  private ztl p;
  
  zrd(Workbook paramWorkbook, LoadDataOption paramLoadDataOption)
  {
    this.a = paramWorkbook;
    this.b = this.a.getWorksheets();
    this.b.clear();
    this.j = new byte[2];
    this.l = paramLoadDataOption;
    this.c = this.b.g;
  }
  
  private void a(zqj paramzqj)
    throws Exception
  {
    this.h = paramzqj.b(this.j);
    if ((this.h & 0xFFFF) != 2057) {
      throw new Exception("Bad Workbook file format.");
    }
    this.i = paramzqj.b(this.j);
    this.k = new byte[this.i];
    paramzqj.a(this.k);
    if (this.k[1] == 6) {
      this.g = 5;
    } else {
      throw new Exception("Bad Workbook file format.");
    }
  }
  
  private void b(zqj paramzqj)
    throws Exception
  {
    c(paramzqj);
    zzw localzzw = new zzw();
    localzzw.b(this.k);
    zf.a(this.b.B(), localzzw);
    int i1 = zc.e(this.k, 0);
    if ((i1 & 0xFFFF) > (this.b.x() & 0xFFFF)) {
      this.b.d(i1);
    }
    for (;;)
    {
      this.h = paramzqj.b(this.j);
      if ((this.h & 0xFFFF) != 1054) {
        break;
      }
      c(paramzqj);
      localzzw = new zzw();
      localzzw.b(this.k);
      zf.a(this.b.B(), localzzw);
      i1 = zc.e(this.k, 0);
      if ((i1 & 0xFFFF) > (this.b.x() & 0xFFFF)) {
        this.b.d(i1);
      }
    }
    paramzqj.a(-2);
  }
  
  private int c(zqj paramzqj)
    throws Exception
  {
    this.i = paramzqj.b(this.j);
    if ((this.i & 0xFFFF) != 0)
    {
      this.k = new byte[this.i];
      paramzqj.a(this.k);
      l(paramzqj);
    }
    else
    {
      this.k = null;
    }
    return this.i;
  }
  
  private void d(zqj paramzqj)
    throws Exception
  {
    this.m = new ArrayList();
    c(paramzqj);
    zf.a(this.m, this.k);
    for (;;)
    {
      this.h = paramzqj.b(this.j);
      if ((this.h & 0xFFFF) != 224) {
        break;
      }
      c(paramzqj);
      zf.a(this.m, this.k);
    }
    paramzqj.a(-2);
  }
  
  private void a(byte[] paramArrayOfByte)
  {
    Style localStyle = new Style(this.b);
    localStyle.a(paramArrayOfByte);
    ((zbzv)this.b.C()).c(localStyle);
  }
  
  private void e(zqj paramzqj)
  {
    try
    {
      String str;
      if (this.k[7] == 0)
      {
        byte[] arrayOfByte = new byte[2 * this.k.length - 16];
        for (int i2 = 0; i2 < this.k.length - 8; i2++) {
          arrayOfByte[(2 * i2)] = this.k[(8 + i2)];
        }
        str = Encoding.getUnicode().a(arrayOfByte);
      }
      else
      {
        str = Encoding.getUnicode().a(this.k, 8, this.k.length - 8);
      }
      if (str.length() >= 32) {
        str = str.substring(0, 31);
      }
      int i1 = this.b.c(str);
      if (this.k[5] == 0) {
        this.b.get(i1).setType(1);
      } else if (this.k[5] == 2) {
        this.b.get(i1).setType(2);
      } else if (this.k[5] == 6) {
        this.b.get(i1).setType(0);
      } else {
        this.b.get(i1).setType(4);
      }
      this.b.get(i1).a(this.k[4]);
    }
    catch (Exception localException)
    {
      throw new CellsException(6, "Incalid sheet name info");
    }
  }
  
  private void f(zqj paramzqj)
    throws Exception
  {
    ArrayList localArrayList = new ArrayList();
    c(paramzqj);
    zf.a(localArrayList, this.k);
    for (;;)
    {
      this.h = paramzqj.b(this.j);
      if ((this.h & 0xFFFF) != 60) {
        break;
      }
      c(paramzqj);
      zf.a(localArrayList, this.k);
    }
    paramzqj.a(-2);
    zbel localzbel = new zbel(localArrayList, this.b);
    localzbel.a();
  }
  
  private void g(zqj paramzqj)
    throws Exception
  {
    a(paramzqj);
    for (;;)
    {
      this.h = paramzqj.b(this.j);
      Object localObject;
      switch (this.h)
      {
      case 23: 
        h(paramzqj);
        break;
      case 24: 
        o(paramzqj);
        break;
      case 49: 
        m(paramzqj);
        break;
      case 61: 
        n(paramzqj);
        break;
      case 133: 
        k(paramzqj);
        break;
      case 146: 
        H(paramzqj);
        break;
      case 224: 
        d(paramzqj);
        break;
      case 659: 
        j(paramzqj);
        break;
      case 1054: 
        b(paramzqj);
        break;
      case 252: 
        f(paramzqj);
        break;
      case 430: 
        i(paramzqj);
        break;
      case 10: 
        paramzqj.a(2);
        int i1 = ((this.b.U() * 8 + zlp.a) / 8 + 1) * 8;
        double d1 = (i1 - zlp.a) / this.b.U();
        for (int i2 = 0; i2 < this.b.getCount(); i2++)
        {
          localObject = this.b.get(i2).getCells();
          ((Cells)localObject).getColumns().d = d1;
        }
        zug.a(this.b.p());
        return;
      case 47: 
        this.i = paramzqj.b(this.j);
        this.k = new byte[this.i];
        paramzqj.a(this.k);
        if ((this.k[0] == 0) && (this.k[1] == 0)) {
          throw new CellsException(19, "BIFF7 Encryption is not supported.");
        }
        if (this.k[4] != 1) {
          throw new CellsException(19, "Strong Workbook Encryption is not supported.");
        }
        byte[] arrayOfByte1 = new byte[16];
        localObject = new byte[16];
        byte[] arrayOfByte2 = new byte[16];
        System.arraycopy(this.k, 6, arrayOfByte1, 0, 16);
        System.arraycopy(this.k, 22, localObject, 0, 16);
        System.arraycopy(this.k, 38, arrayOfByte2, 0, 16);
        try
        {
          if ((this.a.getSettings().getPassword() == null) || ("".equals(this.a.getSettings().getPassword()))) {
            this.p = new ztl("VelvetSweatshop", arrayOfByte1, (byte[])localObject, arrayOfByte2);
          } else {
            this.p = new ztl(this.a.getSettings().getPassword(), arrayOfByte1, (byte[])localObject, arrayOfByte2);
          }
        }
        catch (Exception localException)
        {
          if ((this.a.getSettings().getPassword() == null) || ("".equals(this.a.getSettings().getPassword()))) {
            throw new CellsException(8, "Please provide password for the Workbook file.");
          }
          throw new CellsException(8, "Invalid password.");
        }
      default: 
        this.i = paramzqj.b(this.j);
        paramzqj.a(this.i & 0xFFFF);
      }
    }
  }
  
  private void h(zqj paramzqj)
    throws Exception
  {
    c(paramzqj);
    int i1 = zc.e(this.k, 0);
    this.b.r().clear();
    int i2;
    int i3;
    int i4;
    int i5;
    if ((i1 & 0xFFFF) * 6 + 2 > 8224)
    {
      i2 = (this.k.length - 2) / 6;
      int i6;
      for (i3 = 0; i3 < i2; i3++)
      {
        i4 = zc.e(this.k, 6 * i3 + 2);
        i5 = zc.e(this.k, 6 * i3 + 4);
        i6 = zc.e(this.k, 6 * i3 + 6);
        this.b.r().b(i4 & 0xFFFF, i5 & 0xFFFF, i6 & 0xFFFF);
      }
      for (;;)
      {
        this.h = paramzqj.b(this.j);
        if ((this.h & 0xFFFF) != 60)
        {
          paramzqj.a(-2);
          break;
        }
        c(paramzqj);
        i2 = this.k.length / 6;
        for (i3 = 0; i3 < i2; i3++)
        {
          i4 = zc.e(this.k, 6 * i3);
          i5 = zc.e(this.k, 6 * i3 + 2);
          i6 = zc.e(this.k, 6 * i3 + 4);
          this.b.r().b(i4 & 0xFFFF, i5 & 0xFFFF, i6 & 0xFFFF);
        }
      }
    }
    else
    {
      for (i2 = 0; i2 < (i1 & 0xFFFF); i2++)
      {
        i3 = zc.e(this.k, 6 * i2 + 2);
        i4 = zc.e(this.k, 6 * i2 + 4);
        i5 = zc.e(this.k, 6 * i2 + 6);
        this.b.r().b(i3 & 0xFFFF, i4 & 0xFFFF, i5 & 0xFFFF);
      }
    }
  }
  
  private void i(zqj paramzqj)
    throws Exception
  {
    c(paramzqj);
    if (this.b.w() == null) {
      this.b.a(new zbth());
    }
    zbti localzbti = new zbti();
    int i2;
    if (this.k.length == 4)
    {
      if ((this.k[2] == 1) && (this.k[3] == 4))
      {
        localzbti.a(1);
        this.b.c(this.b.w().getCount());
      }
      else if ((this.k[0] == 1) && (this.k[2] == 1) && (this.k[3] == 58))
      {
        localzbti.a(2);
      }
    }
    else
    {
      int i1 = zc.e(this.k, 0) & 0xFFFF;
      localzbti.a(i1 == 0 ? 3 : 0);
      i2 = 2;
      int i3 = zc.e(this.k, i2) & 0xFFFF;
      if (this.k[(i2 + 2)] == 1)
      {
        localzbti.c(Encoding.getUnicode().a(this.k, i2 + 3, i3 * 2));
        i2 += 3 + i3 * 2;
      }
      else
      {
        localzbti.c(Encoding.getASCII().a(this.k, i2 + 3, i3));
        i2 += 3 + i3;
      }
      if (i1 != 0)
      {
        String[] arrayOfString = new String[i1];
        for (int i4 = 0; i4 < i1; i4++)
        {
          i3 = zc.e(this.k, i2) & 0xFFFF;
          if (this.k[(i2 + 2)] == 1)
          {
            arrayOfString[i4] = Encoding.getUnicode().a(this.k, i2 + 3, i3 * 2);
            i2 += 3 + i3 * 2;
          }
          else
          {
            arrayOfString[i4] = Encoding.getASCII().a(this.k, i2 + 3, i3);
            i2 += 3 + i3;
          }
          if ((i2 >= (this.i & 0xFFFF)) && (i4 != i1 - 1))
          {
            this.h = paramzqj.b(this.j);
            if ((this.h & 0xFFFF) != 60)
            {
              paramzqj.a(-2);
              break;
            }
            c(paramzqj);
            i2 = 0;
          }
        }
        localzbti.a(arrayOfString);
      }
    }
    for (;;)
    {
      this.h = paramzqj.b(this.j);
      if ((this.h & 0xFFFF) != 35) {
        break;
      }
      c(paramzqj);
      zwh localzwh = new zwh(localzbti);
      localzwh.d(zc.e(this.k, 0));
      localzwh.a(zc.a(this.k, 2));
      i2 = 8;
      if (this.k[7] == 0)
      {
        localzwh.a(Encoding.getASCII().a(this.k, 8, this.k[6] & 0xFF));
        i2 += (this.k[6] & 0xFF);
      }
      else
      {
        localzwh.a(Encoding.getUnicode().a(this.k, 8, (this.k[6] & 0xFF) * 2));
        i2 += (this.k[6] & 0xFF) * 2;
      }
      if (this.k.length - i2 > 0)
      {
        byte[] arrayOfByte = new byte[this.k.length - i2];
        System.arraycopy(this.k, i2, arrayOfByte, 0, arrayOfByte.length);
        localzwh.b(arrayOfByte);
      }
      if ((localzbti.a() == 3) && (localzbti.b().size() == 0) && (this.k.length == 9)) {
        localzbti.a(4);
      }
      zf.a(localzbti.b(), localzwh);
    }
    paramzqj.a(-2);
    this.b.w().a(localzbti);
    for (;;)
    {
      this.h = paramzqj.b(this.j);
      if ((this.h & 0xFFFF) != 89) {
        break;
      }
      a(paramzqj, localzbti);
    }
    paramzqj.a(-2);
  }
  
  private void a(zqj paramzqj, zbti paramzbti)
    throws Exception
  {
    c(paramzqj);
    int i1 = zc.e(this.k, 0) & 0xFFFF;
    int i2 = zc.e(this.k, 2) & 0xFFFF;
    if (i1 == 0) {
      return;
    }
    zwr localzwr = paramzbti.b(i2);
    for (int i3 = 0; i3 < i1; i3++)
    {
      this.h = paramzqj.b(this.j);
      if (((this.h & 0xFFFF) == 90) || ((this.h & 0xFFFF) == 60))
      {
        c(paramzqj);
        int i4 = this.k[1] & 0xFF;
        int i5 = this.k[0] & 0xFF;
        int i6 = zc.e(this.k, 2) & 0xFFFF;
        zwn localzwn = localzwr.e(i6);
        int i7 = 4;
        for (int i8 = i4; i8 <= i5; i8++)
        {
          if (i7 >= this.k.length)
          {
            this.h = paramzqj.b(this.j);
            if ((this.h & 0xFFFF) != 60)
            {
              paramzqj.a(-2);
              break;
            }
            c(paramzqj);
            i7 = 0;
          }
          if ((this.k[i7] != 2) && (i7 + 9 > this.k.length))
          {
            byte[] arrayOfByte1 = this.k;
            this.h = paramzqj.b(this.j);
            if ((this.h & 0xFFFF) != 60)
            {
              paramzqj.a(-2);
              break;
            }
            c(paramzqj);
            byte[] arrayOfByte2 = this.k;
            this.k = new byte[this.k.length + arrayOfByte1.length - i7];
            System.arraycopy(arrayOfByte1, i7, this.k, 0, arrayOfByte1.length - i7);
            System.arraycopy(arrayOfByte2, arrayOfByte1.length - i7, this.k, 0, arrayOfByte2.length);
            i7 = 0;
          }
          switch (this.k[i7])
          {
          case 0: 
            i7 += 9;
            break;
          case 1: 
            localzwn.a(i8, Double.valueOf(zc.f(this.k, i7 + 1)));
            i7 += 9;
            break;
          case 2: 
            int i9 = zc.e(this.k, i7 + 1) & 0xFFFF;
            if (this.k[(i7 + 3)] == 0)
            {
              localzwn.a(i8, Encoding.getASCII().a(this.k, i7 + 4, i9));
              i7 += 4 + i9;
            }
            else
            {
              localzwn.a(i8, Encoding.getUnicode().a(this.k, i7 + 4, i9 * 2));
              i7 += 4 + i9 * 2;
            }
            break;
          case 4: 
            localzwn.a(i8, Boolean.valueOf(this.k[(i7 + 1)] == 1));
            i7 += 9;
            break;
          case 16: 
            localzwn.a(i8, ztr.a(this.k[(i7 + 1)]));
            i7 += 9;
            break;
          default: 
            return;
          }
        }
      }
      else
      {
        paramzqj.a(-2);
        return;
      }
    }
  }
  
  private void j(zqj paramzqj)
    throws Exception
  {
    c(paramzqj);
    if (this.n == null) {
      this.n = new ArrayList();
    }
    zf.a(this.n, this.k);
    for (;;)
    {
      this.h = paramzqj.b(this.j);
      if ((this.h & 0xFFFF) != 659) {
        break;
      }
      c(paramzqj);
      zf.a(this.n, this.k);
    }
    paramzqj.a(-2);
  }
  
  private void k(zqj paramzqj)
    throws Exception
  {
    byte[] arrayOfByte1;
    for (int i1 = 0; i1 < this.o.size(); i1++)
    {
      arrayOfByte1 = (byte[])this.o.get(i1);
      c(arrayOfByte1);
    }
    this.o = null;
    for (i1 = 0; i1 < this.m.size(); i1++)
    {
      arrayOfByte1 = (byte[])this.m.get(i1);
      a(arrayOfByte1);
    }
    if (this.n != null) {
      for (i1 = 0; i1 < this.n.size(); i1++)
      {
        arrayOfByte1 = (byte[])this.n.get(i1);
        b(arrayOfByte1);
      }
    }
    this.b.V();
    this.m = null;
    this.i = paramzqj.b(this.j);
    this.k = new byte[this.i];
    paramzqj.a(this.k);
    long l1;
    byte[] arrayOfByte2;
    if (this.p != null)
    {
      l1 = paramzqj.b() - this.k.length + 4L;
      arrayOfByte2 = this.p.a(this.k, 4, this.k.length - 4, l1);
      System.arraycopy(arrayOfByte2, 0, this.k, 4, arrayOfByte2.length);
    }
    e(paramzqj);
    for (;;)
    {
      this.h = paramzqj.b(this.j);
      if ((this.h & 0xFFFF) != 133) {
        break;
      }
      this.i = paramzqj.b(this.j);
      this.k = new byte[this.i];
      paramzqj.a(this.k);
      if (this.p != null)
      {
        l1 = paramzqj.b() - this.k.length + 4L;
        arrayOfByte2 = this.p.a(this.k, 4, this.k.length - 4, l1);
        System.arraycopy(arrayOfByte2, 0, this.k, 4, arrayOfByte2.length);
      }
      e(paramzqj);
    }
    paramzqj.a(-2);
  }
  
  private void b(byte[] paramArrayOfByte)
    throws Exception
  {
    int i1 = zc.e(paramArrayOfByte, 0) & 0xFFFF;
    int i2 = i1 & 0x8000;
    i1 &= 0xFFF;
    String str = "";
    Object localObject;
    if (i2 == 0)
    {
      if (paramArrayOfByte[2] == 0) {
        return;
      }
      if (paramArrayOfByte[4] == 0)
      {
        localObject = new byte[2 * paramArrayOfByte.length - 10];
        for (int i3 = 0; i3 < paramArrayOfByte.length - 5; i3++) {
          localObject[(2 * i3)] = paramArrayOfByte[(i3 + 5)];
        }
        str = Encoding.getUnicode().a((byte[])localObject);
      }
      else
      {
        str = Encoding.getUnicode().a(paramArrayOfByte, 5, paramArrayOfByte.length - 5);
      }
    }
    else
    {
      switch (paramArrayOfByte[2])
      {
      case 0: 
        str = "Normal";
        break;
      case 1: 
        str = "RowLevel_" + Byte.toString(paramArrayOfByte[3]);
        break;
      case 2: 
        str = "ColLevel_" + Byte.toString(paramArrayOfByte[3]);
        break;
      case 3: 
        str = "Comma";
        break;
      case 4: 
        str = "Currency";
        break;
      case 5: 
        str = "Percent";
        break;
      case 6: 
        str = "Comma [0]";
        break;
      case 7: 
        str = "Currency [0]";
        break;
      case 8: 
        str = "Hyperlink";
        break;
      case 9: 
        str = "Followed Hyperlink";
        break;
      }
    }
    if ((str != null) && (!"".equals(str)))
    {
      localObject = this.b.C().a(i1);
      this.b.s().a((Style)localObject);
      ((Style)localObject).a(str);
    }
  }
  
  private void l(zqj paramzqj)
    throws Exception
  {
    if (this.p != null)
    {
      long l1 = paramzqj.b() - this.k.length;
      this.k = this.p.a(this.k, 0, this.k.length, l1);
    }
  }
  
  private void m(zqj paramzqj)
    throws Exception
  {
    this.o = new ArrayList();
    c(paramzqj);
    zf.a(this.o, this.k);
    for (;;)
    {
      this.h = paramzqj.b(this.j);
      if ((this.h & 0xFFFF) != 49) {
        break;
      }
      c(paramzqj);
      zf.a(this.o, this.k);
    }
    paramzqj.a(-2);
  }
  
  private void c(byte[] paramArrayOfByte)
  {
    Font localFont = new Font(this.b, null, false);
    localFont.a(paramArrayOfByte);
    if (this.b.A().size() > 3) {
      localFont.d(this.b.A().size() + 1);
    } else {
      localFont.d(this.b.A().size());
    }
    zf.a(this.b.A(), localFont);
  }
  
  private void n(zqj paramzqj)
    throws Exception
  {
    c(paramzqj);
    int i1 = this.k[8];
    int i2 = (byte)(i1 & 0xFF & 0x8);
    if (i2 == 0) {
      this.b.p().getSettings().setHScrollBarVisible(false);
    } else {
      this.b.p().getSettings().setHScrollBarVisible(true);
    }
    i2 = (byte)(i1 & 0xFF & 0x10);
    if (i2 == 0) {
      this.b.p().getSettings().setVScrollBarVisible(false);
    } else {
      this.b.p().getSettings().setVScrollBarVisible(true);
    }
    i2 = (byte)(i1 & 0xFF & 0x20);
    if (i2 == 0) {
      this.b.p().getSettings().setShowTabs(false);
    } else {
      this.b.p().getSettings().setShowTabs(true);
    }
    this.b.b(zc.e(this.k, 10) & 0xFFFF);
    this.b.k(zc.e(this.k, 12));
  }
  
  private void o(zqj paramzqj)
    throws Exception
  {
    c(paramzqj);
    a();
    for (;;)
    {
      this.h = paramzqj.b(this.j);
      if ((this.h & 0xFFFF) != 24) {
        break;
      }
      c(paramzqj);
      a();
    }
    paramzqj.a(-2);
  }
  
  private void a()
  {
    Name localName = new Name(this.b);
    localName.b(this.k);
    this.b.getNames().a(localName, false);
  }
  
  private void p(zqj paramzqj)
    throws Exception
  {
    c(paramzqj);
    byte[] tmp12_7 = this.k;
    tmp12_7[14] = ((byte)(tmp12_7[14] | 0x2));
    int i1 = zc.e(this.k, 0);
    int i2 = zc.e(this.k, 2);
    int i3 = zc.e(this.k, 4);
    Cell localCell = this.d.getRows().a(i1 & 0xFFFF, i2 & 0xFFFF, false, false, false);
    localCell.b(i3);
    double d1;
    if (((this.k[12] & 0xFF) == 255) && ((this.k[13] & 0xFF) == 255))
    {
      switch (this.k[6])
      {
      case 0: 
        break;
      case 1: 
        localCell.a(2, this.k[8] == 0 ? znq.e : znq.d);
        break;
      case 2: 
        localCell.a(2, Byte.valueOf(this.k[8]));
        break;
      case 3: 
        break;
      default: 
        d1 = zc.f(this.k, 6);
        if (d1 == 0.0D) {
          localCell.a(1, znq.g);
        } else {
          localCell.a(1, Double.valueOf(d1));
        }
        break;
      }
    }
    else
    {
      d1 = zc.f(this.k, 6);
      if (d1 == 0.0D) {
        localCell.a(1, znq.g);
      } else {
        localCell.a(1, Double.valueOf(d1));
      }
    }
    this.h = paramzqj.b(this.j);
    String str;
    switch (this.h)
    {
    case 519: 
      c(paramzqj);
      if (this.k[2] == 0)
      {
        byte[] arrayOfByte = new byte[2 * this.k.length - 6];
        for (int i4 = 0; i4 < this.k.length - 3; i4++) {
          arrayOfByte[(2 * i4)] = this.k[(i4 + 3)];
        }
        str = Encoding.getUnicode().a(arrayOfByte);
      }
      else
      {
        str = Encoding.getUnicode().a(this.k, 3, this.k.length - 3);
      }
      localCell.putValue(str);
      break;
    case 545: 
    case 1212: 
      this.i = paramzqj.b(this.j);
      paramzqj.a(this.i & 0xFFFF);
      this.h = paramzqj.b(this.j);
      if ((this.h & 0xFFFF) == 519)
      {
        c(paramzqj);
        if (this.k[2] == 0) {
          str = Encoding.getASCII().a(this.k, 3, this.k.length - 3);
        } else {
          str = Encoding.getUnicode().a(this.k, 3, this.k.length - 3);
        }
        localCell.putValue(str);
      }
      else
      {
        paramzqj.a(-2);
      }
      break;
    default: 
      paramzqj.a(-2);
    }
  }
  
  private void q(zqj paramzqj)
    throws Exception
  {
    c(paramzqj);
    int i1 = zc.e(this.k, 0);
    int i2 = zc.e(this.k, 2);
    int i3 = zc.e(this.k, 4);
    Cell localCell = this.d.getRows().a(i1 & 0xFFFF, i2 & 0xFFFF, false, false, false);
    localCell.b(i3);
    zaai localzaai = a(i1 & 0xFFFF, i2 & 0xFFFF);
    localCell.a(localzaai);
    this.h = paramzqj.b(this.j);
    Object localObject;
    int i4;
    String str;
    switch (this.h)
    {
    case 519: 
      c(paramzqj);
      if (this.k[2] == 0)
      {
        localObject = new byte[2 * this.k.length - 6];
        for (i4 = 0; i4 < this.k.length - 3; i4++) {
          localObject[(2 * i4)] = this.k[(i4 + 3)];
        }
        str = Encoding.getUnicode().a((byte[])localObject);
      }
      else
      {
        str = Encoding.getUnicode().a(this.k, 3, this.k.length - 3);
      }
      localCell.a(4, str);
      break;
    case 545: 
      a(localCell, paramzqj);
      this.h = paramzqj.b(this.j);
      if ((this.h & 0xFFFF) == 519)
      {
        c(paramzqj);
        if (this.k[2] == 0) {
          str = Encoding.getASCII().a(this.k, 3, this.k.length - 3);
        } else {
          str = Encoding.getUnicode().a(this.k, 3, this.k.length - 3);
        }
        localCell.a(4, str);
      }
      else
      {
        paramzqj.a(-2);
      }
      break;
    case 1212: 
      b(localCell, paramzqj);
      this.h = paramzqj.b(this.j);
      switch (this.h)
      {
      case 519: 
        c(paramzqj);
        if (this.k[2] == 0) {
          str = zct.a(this.k, 3, this.k.length - 3);
        } else {
          str = Encoding.getUnicode().a(this.k, 3, this.k.length - 3);
        }
        localCell.a(4, str);
        break;
      case 545: 
        a(localCell, paramzqj);
        break;
      default: 
        paramzqj.a(-2);
      }
      break;
    default: 
      paramzqj.a(-2);
    }
    if (localCell.isArrayHeader())
    {
      localObject = localCell.F().a();
      i4 = ((CellArea)localObject).EndRow;
      int i5 = ((CellArea)localObject).EndColumn;
      if ((((CellArea)localObject).StartRow < i4) || (((CellArea)localObject).StartColumn < i5))
      {
        int i6 = i1 & 0xFFFF;
        int i7 = i2 & 0xFFFF;
        this.f.put(Integer.valueOf(i6 << 8 | i7), Integer.valueOf(i4 << 8 | i5));
      }
    }
  }
  
  zaai a(int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = new byte[this.k.length - 20];
    System.arraycopy(this.k, 20, arrayOfByte, 0, arrayOfByte.length);
    int i1 = 0;
    Object localObject1 = null;
    if (((this.k[12] & 0xFF) == 255) && ((this.k[13] & 0xFF) == 255)) {}
    switch (this.k[6])
    {
    case 0: 
      break;
    case 1: 
      i1 = 2;
      localObject1 = this.k[8] == 0 ? znq.e : znq.d;
      break;
    case 2: 
      i1 = 3;
      localObject1 = zi.a(this.k[8]);
      break;
    case 3: 
      break;
    default: 
      i1 = 1;
      localObject1 = Double.valueOf(zc.f(this.k, 6));
      break;
      i1 = 1;
      localObject1 = Double.valueOf(zc.f(this.k, 6));
    }
    zaai localzaai = new zaai(paramInt1, paramInt2);
    localzaai.b = arrayOfByte;
    localzaai.c = i1;
    localzaai.d = localObject1;
    if ((arrayOfByte[0] == 5) && (arrayOfByte[1] == 0) && (arrayOfByte[2] == 1))
    {
      int i2 = 0;
      int i3 = 0;
      int[] arrayOfInt1 = { i2 };
      int[] arrayOfInt2 = { i3 };
      this.d.p().y().a(arrayOfByte, arrayOfInt1, arrayOfInt2);
      i2 = arrayOfInt1[0];
      i3 = arrayOfInt2[0];
      if ((i2 != paramInt1) || (i3 != paramInt2))
      {
        Integer localInteger = Integer.valueOf(i2 << 8 | i3);
        Object localObject2 = this.f.get(localInteger);
        if (localObject2 != null)
        {
          localzaai.b(true);
          int i4 = ((Integer)localObject2).intValue();
          if ((paramInt1 == i4 >> 8) && (paramInt2 == (i4 & 0xFF))) {
            this.f.put(localInteger, null);
          }
        }
      }
    }
    return localzaai;
  }
  
  private void a(Cell paramCell, zqj paramzqj)
    throws Exception
  {
    c(paramzqj);
    CellArea localCellArea = new CellArea();
    localCellArea.StartRow = (zc.e(this.k, 0) & 0xFFFF);
    localCellArea.EndRow = (zc.e(this.k, 2) & 0xFFFF);
    localCellArea.StartColumn = (this.k[4] & 0xFF);
    localCellArea.EndColumn = (this.k[5] & 0xFF);
    byte[] arrayOfByte = new byte[(this.i & 0xFFFF) - 12];
    System.arraycopy(this.k, 12, arrayOfByte, 0, arrayOfByte.length);
    paramCell.a(new zbf(localCellArea, true, arrayOfByte));
    paramCell.h().b(true);
  }
  
  private void b(Cell paramCell, zqj paramzqj)
    throws Exception
  {
    c(paramzqj);
    CellArea localCellArea = new CellArea();
    localCellArea.StartRow = (zc.e(this.k, 0) & 0xFFFF);
    localCellArea.EndRow = (zc.e(this.k, 2) & 0xFFFF);
    localCellArea.StartColumn = (this.k[4] & 0xFF);
    localCellArea.EndColumn = (this.k[5] & 0xFF);
    byte[] arrayOfByte = new byte[(this.i & 0xFFFF) - 8];
    System.arraycopy(this.k, 8, arrayOfByte, 0, arrayOfByte.length);
    paramCell.a(new zbf(localCellArea, false, arrayOfByte));
  }
  
  private void r(zqj paramzqj)
    throws Exception
  {
    c(paramzqj);
    int i1 = zc.e(this.k, 0);
    int i2 = this.k[2];
    int i3 = zc.e(this.k, 4);
    byte b1 = this.k[6];
    int i4 = this.k[7];
    Cell localCell;
    if (i4 == 0)
    {
      localCell = this.d.getRows().a(i1 & 0xFFFF, i2 & 0xFF, false, false, false);
      localCell.b(i3);
      boolean bool;
      if (b1 == 0) {
        bool = false;
      } else {
        bool = true;
      }
      localCell.putValue(bool);
    }
    else
    {
      localCell = this.d.getRows().a(i1 & 0xFFFF, i2 & 0xFF, false, false, false);
      localCell.b(i3);
      localCell.a(3, Byte.valueOf(b1));
    }
  }
  
  private void s(zqj paramzqj)
    throws Exception
  {
    c(paramzqj);
    int i1 = zc.e(this.k, 0);
    int i2 = this.k[2];
    int i3 = zc.e(this.k, 4);
    Cell localCell = this.d.getRows().a(i1 & 0xFFFF, i2 & 0xFF, false, false, false);
    localCell.b(i3);
  }
  
  private void t(zqj paramzqj)
    throws Exception
  {
    c(paramzqj);
    int i1 = zc.e(this.k, 0);
    int i2 = this.k[2];
    for (int i3 = 0; i3 < this.k.length / 2 - 3; i3++)
    {
      int i4 = zc.e(this.k, 4 + 2 * i3);
      Cell localCell = this.d.getRows().a(i1 & 0xFFFF, (i2 & 0xFF) + i3, false, false, false);
      localCell.b(i4);
    }
  }
  
  private void u(zqj paramzqj)
    throws Exception
  {
    c(paramzqj);
    int i1 = zc.e(this.k, 0);
    int i2 = this.k[2];
    int i3 = zc.e(this.k, 4);
    double d1 = zc.f(this.k, 6);
    Cell localCell = this.d.getRows().a(i1 & 0xFFFF, i2 & 0xFF, false, false, false);
    localCell.b(i3);
    localCell.putValue(d1);
  }
  
  private void v(zqj paramzqj)
    throws Exception
  {
    c(paramzqj);
    int i1 = zc.e(this.k, 0);
    int i2 = this.k[2];
    int i3 = zc.e(this.k, 4);
    int i4 = zc.a(this.k, 6);
    double d1 = 0.0D;
    if ((i4 & 0x2) != 0)
    {
      d1 = i4 >> 2;
    }
    else
    {
      int i5 = i4 - (i4 & 0x3);
      byte[] arrayOfByte = new byte[8];
      System.arraycopy(zc.a(i5), 0, arrayOfByte, 4, 4);
      d1 = zc.f(arrayOfByte, 0);
    }
    if ((i4 & 0x1) != 0) {
      d1 /= 100.0D;
    }
    Cell localCell = this.d.getRows().a(i1 & 0xFFFF, i2 & 0xFF, false, false, false);
    localCell.b(i3);
    localCell.putValue(d1);
  }
  
  private void w(zqj paramzqj)
    throws Exception
  {
    c(paramzqj);
    int i1 = zc.e(this.k, 0);
    int i2 = zc.e(this.k, 2);
    int i3 = ((this.i & 0xFFFF) - 6) / 6;
    for (int i4 = 0; i4 < i3; i4++)
    {
      int i5 = zc.e(this.k, 4 + 6 * i4);
      int i6 = zc.a(this.k, 6 + 6 * i4);
      double d1 = 0.0D;
      if ((i6 & 0x2) != 0)
      {
        d1 = i6 >> 2;
      }
      else
      {
        int i7 = i6 - (i6 & 0x3);
        byte[] arrayOfByte = new byte[8];
        System.arraycopy(zc.a(i7), 0, arrayOfByte, 4, 4);
        d1 = zc.f(arrayOfByte, 0);
      }
      if ((i6 & 0x1) != 0) {
        d1 /= 100.0D;
      }
      Cell localCell = this.d.getRows().a(i1 & 0xFFFF, (i2 & 0xFFFF) + i4, false, false, false);
      localCell.b(i5);
      localCell.a(1, Double.valueOf(d1), false);
    }
  }
  
  private void x(zqj paramzqj)
    throws Exception
  {
    c(paramzqj);
    int i1 = zc.e(this.k, 0);
    int i2 = this.k[2];
    int i3 = zc.e(this.k, 4);
    int i4 = zc.a(this.k, 6);
    Cell localCell = this.d.getRows().a(i1 & 0xFFFF, i2 & 0xFF, false, false, false);
    localCell.b(i3);
    zbbj localzbbj = this.c.a(i4);
    localzbbj.d += 1;
    localCell.a(4, localzbbj, false);
  }
  
  private void y(zqj paramzqj)
    throws Exception
  {
    this.i = paramzqj.b(this.j);
    paramzqj.a(this.i & 0xFFFF);
    this.h = paramzqj.b(this.j);
    if ((this.h & 0xFFFF) != 93)
    {
      paramzqj.a(-2);
      return;
    }
    c(paramzqj);
    if (this.k[4] != 5) {
      return;
    }
    this.h = paramzqj.b(this.j);
    if ((this.h & 0xFFFF) != 2057)
    {
      this.i = paramzqj.b(this.j);
      paramzqj.a(this.i & 0xFFFF);
      return;
    }
    paramzqj.a(18);
    for (;;)
    {
      this.h = paramzqj.b(this.j);
      switch (this.h)
      {
      case 10: 
        paramzqj.a(2);
        return;
      }
      this.i = paramzqj.b(this.j);
      paramzqj.a(this.i & 0xFFFF);
    }
  }
  
  private void z(zqj paramzqj)
    throws Exception
  {
    int i1 = 0;
    for (;;)
    {
      this.h = paramzqj.b(this.j);
      switch (this.h)
      {
      case 2057: 
        this.i = paramzqj.b(this.j);
        paramzqj.a(this.i & 0xFFFF);
        i1++;
        break;
      case 10: 
        paramzqj.a(2);
        i1--;
        if (i1 == 0) {
          return;
        }
        break;
      default: 
        this.i = paramzqj.b(this.j);
        paramzqj.a(this.i & 0xFFFF);
      }
    }
  }
  
  private void A(zqj paramzqj)
    throws Exception
  {
    for (;;)
    {
      this.h = paramzqj.b(this.j);
      switch (this.h)
      {
      case 549: 
        C(paramzqj);
        break;
      case 85: 
        D(paramzqj);
        break;
      case 125: 
        E(paramzqj);
        break;
      case 520: 
        B(paramzqj);
        break;
      case 6: 
      case 1030: 
        if ((this.l != null) && (!this.l.getImportFormula())) {
          p(paramzqj);
        } else {
          q(paramzqj);
        }
        break;
      case 513: 
        s(paramzqj);
        break;
      case 515: 
        u(paramzqj);
        break;
      case 517: 
        r(paramzqj);
        break;
      case 638: 
        v(paramzqj);
        break;
      case 189: 
        w(paramzqj);
        break;
      case 190: 
        t(paramzqj);
        break;
      case 236: 
        y(paramzqj);
        break;
      case 253: 
        x(paramzqj);
        break;
      case 10: 
        paramzqj.a(2);
        return;
      case 574: 
        F(paramzqj);
        break;
      default: 
        this.i = paramzqj.b(this.j);
        paramzqj.a(this.i & 0xFFFF);
      }
    }
  }
  
  private void B(zqj paramzqj)
    throws Exception
  {
    c(paramzqj);
    zbdx localzbdx = new zbdx();
    localzbdx.a = (zc.e(this.k, 0) & 0xFFFF);
    int i1 = zc.b(this.k, 2);
    int i2 = zc.b(this.k, 4);
    if ((this.k[7] & 0xFF & 0x80) == 0) {
      localzbdx.e = ((short)Math.min(zc.b(this.k, 6), 8190));
    } else {
      localzbdx.e = ((short)Math.min(zc.b(this.k, 6) & 0x7FFF, 8190));
    }
    Row localRow = this.d.getRows().a(localzbdx.a, false, false, false);
    localzbdx.b = this.k[12];
    localzbdx.c = this.k[15];
    localzbdx.d = (this.k[14] & 0xFF | (localzbdx.c & 0xFF & 0xF) << 8);
    if (localzbdx.d < 15) {
      localzbdx.d = 15;
    }
    zbdx tmp200_199 = localzbdx;
    tmp200_199.c = ((byte)(tmp200_199.c & 0xF0));
    localRow.c.b(localzbdx, 13);
    if ((localzbdx.e() & 0xFF) > (this.d.s() & 0xFF)) {
      this.d.c(localzbdx.e());
    }
  }
  
  private void C(zqj paramzqj)
    throws Exception
  {
    c(paramzqj);
    byte b1 = this.k[0];
    int i1 = zc.e(this.k, 2);
    int i2 = paramzqj.b(this.j);
    if ((i2 & 0xFFFF) != 128)
    {
      this.d.a(b1);
      this.d.a(i1);
    }
    paramzqj.a(-2);
  }
  
  private void D(zqj paramzqj)
    throws Exception
  {
    c(paramzqj);
    int i1 = zc.e(this.k, 0);
    if ((i1 & 0xFFFF) != 8)
    {
      int i2 = (i1 & 0xFFFF) * 8;
      double d1 = 0.0D;
      if (i2 >= 12) {
        d1 = (i2 - 5) / 7.0D;
      } else {
        d1 = i2 / 12.0D;
      }
      this.d.getColumns().c = d1;
    }
    this.h = paramzqj.b(this.j);
    if ((this.h & 0xFFFF) == 512) {
      c(paramzqj);
    } else {
      paramzqj.a(-2);
    }
  }
  
  private void E(zqj paramzqj)
    throws Exception
  {
    c(paramzqj);
    int i1 = zc.e(this.k, 0);
    int i2 = zc.e(this.k, 2);
    for (int i3 = i1 & 0xFFFF; (i3 <= (i2 & 0xFFFF)) && (i3 <= 255); i3++)
    {
      Column localColumn = this.d.getColumns().get(i3);
      localColumn.a(this.k);
      if ((localColumn.b() & 0xFF) > (this.d.r() & 0xFF)) {
        this.d.b(localColumn.b());
      }
    }
  }
  
  private void F(zqj paramzqj)
    throws Exception
  {
    c(paramzqj);
    this.e.b(zc.e(this.k, 0) & 0xFFFF & 0x3FF);
    if ((this.k[1] & 0xFF & 0x8) != 0) {
      this.e.n = 1;
    }
    this.e.setFirstVisibleRow(zc.e(this.k, 2));
    this.e.setFirstVisibleColumn(this.k[4] & 0xFF & 0xFF);
    this.e.d(this.k[6]);
    if ((this.i & 0xFFFF) > 10)
    {
      int i1 = zc.e(this.k, 10) & 0xFFFF;
      if (i1 != 0) {
        this.e.y()[1] = i1;
      }
      i1 = zc.e(this.k, 12) & 0xFFFF;
      if (i1 != 0) {
        this.e.y()[0] = i1;
      }
    }
  }
  
  private void G(zqj paramzqj)
    throws Exception
  {
    for (int i1 = 0; i1 < this.b.getCount(); i1++)
    {
      if (this.l != null)
      {
        int i2 = 0;
        int i3;
        if (this.l.SheetNames != null) {
          for (i3 = 0; i3 < this.l.SheetNames.length; i3++) {
            if (zy.a(this.b.get(i1).getName(), this.l.SheetNames[i3]))
            {
              i2 = 1;
              break;
            }
          }
        } else if (this.l.SheetIndexes != null) {
          for (i3 = 0; i3 < this.l.SheetIndexes.length; i3++) {
            if (i1 == this.l.SheetIndexes[i3])
            {
              i2 = 1;
              break;
            }
          }
        } else {
          i2 = 1;
        }
        if (i2 == 0)
        {
          z(paramzqj);
          continue;
        }
      }
      this.e = this.b.get(i1);
      this.d = this.e.getCells();
      if (this.e.getType() == 2)
      {
        this.e.setType(1);
        for (this.h = paramzqj.b(this.j); (this.h & 0xFFFF) != 10; this.h = paramzqj.b(this.j))
        {
          this.i = paramzqj.b(this.j);
          paramzqj.a(this.i & 0xFFFF);
        }
        paramzqj.a(2);
      }
      else
      {
        A(paramzqj);
      }
    }
  }
  
  void a(zxf paramzxf)
    throws Exception
  {
    zh localzh = paramzxf.a().a("Workbook");
    if (localzh == null) {
      localzh = paramzxf.a().a("WORKBOOK");
    }
    if (localzh == null) {
      throw new CellsException(4, "Invalid BIFF8 file.");
    }
    a(localzh);
  }
  
  private void a(zh paramzh)
    throws Exception
  {
    zqj localzqj = new zqj(paramzh);
    this.b.u();
    g(localzqj);
    if (this.l.getOnlyCreateWorksheet()) {
      return;
    }
    int i1 = 0;
    if ((this.b.w() != null) && (this.b.w().getCount() != 0))
    {
      for (int i2 = 0; i2 < this.b.w().getCount(); i2++)
      {
        zbti localzbti2 = this.b.w().a(i2);
        if (localzbti2.e())
        {
          i1 = i2;
          break;
        }
      }
    }
    else
    {
      this.b.a(new zbth());
      zbti localzbti1 = new zbti();
      localzbti1.a(1);
      this.b.w().a(localzbti1);
      i1 = 0;
    }
    for (int i3 = 0; i3 < this.b.getCount(); i3++) {
      this.b.r().a(i1, i3, i3);
    }
    if (this.l.getOnlyVisibleWorksheet())
    {
      i3 = this.b.getCount();
      for (int i4 = 0; i4 < this.b.getCount(); i4++) {
        if (!this.b.get(i4).isVisible()) {
          i3--;
        }
      }
      this.l.SheetIndexes = new int[i3];
      i3 = 0;
      for (i4 = 0; i4 < this.b.getCount(); i4++) {
        if (this.b.get(i4).isVisible())
        {
          this.l.SheetIndexes[i3] = i4;
          i3++;
        }
      }
    }
    G(localzqj);
  }
  
  private void H(zqj paramzqj)
    throws Exception
  {
    c(paramzqj);
    int i1 = zc.e(this.k, 0);
    for (int i2 = 0; i2 < (i1 & 0xFFFF); i2++)
    {
      int i3 = zc.a(this.k, 4 * i2 + 2);
      this.b.o().a(i3, i2 + 8);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zrd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */