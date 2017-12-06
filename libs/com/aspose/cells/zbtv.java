package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zo;
import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.a.zs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class zbtv
{
  private zawp r;
  String a;
  int b;
  ArrayList c;
  String d;
  byte[] e;
  ArrayList f;
  int g;
  int h;
  int i;
  SxRng j;
  String k;
  String l;
  int m;
  boolean n = false;
  boolean o;
  boolean p;
  int q = -1;
  private byte s;
  private static final com.aspose.cells.b.c.a.za t = new com.aspose.cells.b.c.a.za(new String[] { "#DIV/0!", "#N/A", "#NAME?", "#NULL!", "#NUM!", "#REF!", "#VALUE!" });
  
  zawp a()
  {
    return this.r;
  }
  
  zbtv(zawp paramzawp)
  {
    this.r = paramzawp;
    this.b = 1025;
  }
  
  zbtv(zawp paramzawp, String paramString, boolean paramBoolean)
  {
    if ((paramString == null) || ("".equals(paramString))) {
      throw new CellsException(12, "The PivotTable field name is invalid.");
    }
    this.r = paramzawp;
    if (paramBoolean) {
      this.b = 1025;
    } else {
      this.b = 1026;
    }
    this.a = paramString;
  }
  
  zbtv(zawp paramzawp, String paramString1, String paramString2)
  {
    if ((paramString1 == null) || ("".equals(paramString1))) {
      throw new CellsException(12, "The PivotTable field name is invalid.");
    }
    this.r = paramzawp;
    this.b = 33829;
    this.a = paramString1;
    this.d = paramString2;
    this.f = new ArrayList();
  }
  
  void a(zbtv paramzbtv)
  {
    this.a = paramzbtv.a;
    this.b = paramzbtv.b;
    this.s = paramzbtv.s;
    this.g = paramzbtv.g;
    this.h = paramzbtv.h;
    this.i = paramzbtv.i;
    this.k = paramzbtv.k;
    this.l = paramzbtv.l;
    this.m = paramzbtv.m;
    this.n = paramzbtv.n;
    this.o = paramzbtv.o;
    this.p = paramzbtv.p;
    this.q = paramzbtv.q;
    int i1;
    int i2;
    Object localObject;
    if (paramzbtv.c != null)
    {
      i1 = paramzbtv.c.size();
      this.c = new ArrayList(i1);
      for (i2 = 0; i2 < i1; i2++)
      {
        localObject = new zbos();
        ((zbos)localObject).a((zbos)paramzbtv.c.get(i2));
        zf.a(this.c, localObject);
      }
    }
    if (paramzbtv.f != null)
    {
      i1 = paramzbtv.f.size();
      this.f = new ArrayList(i1);
      for (i2 = 0; i2 < i1; i2++)
      {
        localObject = new zbui();
        ((zbui)localObject).a((zbui)paramzbtv.f.get(i2));
        zf.a(this.f, localObject);
      }
    }
    if (paramzbtv.j != null)
    {
      this.j = new SxRng(this);
      this.j.a(paramzbtv.j);
    }
    this.d = paramzbtv.d;
    if (null != paramzbtv.e) {
      this.e = ((byte[])com.aspose.cells.b.a.za.a(paramzbtv.e));
    }
  }
  
  String b()
  {
    try
    {
      if (this.e == null) {
        return this.d;
      }
      WorksheetCollection localWorksheetCollection = this.r.e.a;
      localWorksheetCollection.a(this.r);
      String str = localWorksheetCollection.d().a(0, this.e, 0, 0, false);
      localWorksheetCollection.a(null);
      return str;
    }
    catch (Exception localException) {}
    return this.d;
  }
  
  boolean c()
  {
    return (this.b & 0xFFFF & 0x1) != 0;
  }
  
  void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.b &= 0xFFFC;
      this.b |= 0x1;
    }
    else
    {
      this.b &= 0xFFFC;
      this.b |= 0x2;
    }
  }
  
  boolean d()
  {
    return (this.b & 0xFFFF & 0x200) != 0;
  }
  
  boolean e()
  {
    return (!i()) && (!j());
  }
  
  boolean f()
  {
    return (this.b & 0xFFFF & 0x20) != 0;
  }
  
  void b(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.b |= 0x120;
    } else {
      this.b &= 0xFF9F;
    }
  }
  
  boolean g()
  {
    return (this.b & 0xFFFF & 0x40) != 0;
  }
  
  void c(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.b |= 0x160;
    } else {
      this.b &= 0xFFBF;
    }
  }
  
  boolean h()
  {
    return (this.b & 0xFFFF & 0x160) == 288;
  }
  
  void d(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.b &= 0xFFBF;
      this.b |= 0x120;
    }
  }
  
  boolean i()
  {
    return (this.b & 0xFFFF & 0x80) != 0;
  }
  
  void e(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.b |= 0x80;
    } else {
      this.b &= 0xFF7F;
    }
  }
  
  boolean j()
  {
    return (this.b & 0xFFFF & 0x800) != 0;
  }
  
  void f(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.b |= 0x900;
      this.b &= 0xFBFF;
    }
    else
    {
      this.b &= 0xF7FF;
    }
  }
  
  boolean k()
  {
    boolean bool = (i()) || (f());
    return bool;
  }
  
  boolean l()
  {
    return (this.b & 0xFFFF & 0x8) != 0;
  }
  
  boolean m()
  {
    return (this.b & 0xFFFF & 0x8000) != 0;
  }
  
  void g(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.b |= 0x8000;
    } else {
      this.b &= 0x7FFF;
    }
  }
  
  boolean n()
  {
    return (this.b & 0xFFFF & 0x10) != 0;
  }
  
  void h(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.b |= 0x10;
    } else {
      this.b &= 0xFFEF;
    }
  }
  
  boolean o()
  {
    return (this.b & 0xFFFF & 0x9A0) == 2304;
  }
  
  boolean p()
  {
    return (this.b & 0xFFFF & 0x9A0) == 288;
  }
  
  boolean q()
  {
    return (this.b & 0xFFFF & 0x9A0) == 128;
  }
  
  boolean r()
  {
    return (!p()) && (!q()) && (!o());
  }
  
  boolean s()
  {
    return (i()) || ((u()) && ((j()) || (f())));
  }
  
  boolean t()
  {
    return (this.s & 0xFF & 0x10) != 0;
  }
  
  void i(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.s = ((byte)(this.s | 0x10));
    } else {
      this.s = ((byte)(this.s & 0xEF));
    }
  }
  
  boolean u()
  {
    if (this.c != null) {
      for (int i1 = 0; i1 < this.c.size(); i1++)
      {
        zbos localzbos = (zbos)this.c.get(i1);
        if ((localzbos == null) || (localzbos.a == null)) {
          return true;
        }
      }
    }
    return (this.s & 0xFF & 0x1) != 0;
  }
  
  void j(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.s = ((byte)(this.s | 0x1));
    } else {
      this.s = ((byte)(this.s & 0xFE));
    }
  }
  
  boolean v()
  {
    return (u()) && ((this.c == null) || (this.c.size() == 1));
  }
  
  private int y()
  {
    int i1 = 0;
    if (this.c == null) {
      return i1;
    }
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext())
    {
      Object localObject1 = localIterator.next();
      if (localObject1 == null)
      {
        i1 += 4;
      }
      else
      {
        Object localObject2 = ((zbos)localObject1).a;
        if (localObject2 == null)
        {
          i1 += 4;
        }
        else if ((localObject2 instanceof String))
        {
          int i2 = 0;
          boolean[] arrayOfBoolean = { i2 };
          boolean bool = ztr.b((String)localObject2, arrayOfBoolean);
          i2 = arrayOfBoolean[0];
          if ((bool) && (i2 == 0)) {
            i1 += 6;
          } else {
            i1 += 6 + zct.a((String)localObject2);
          }
        }
        else if ((localObject2 instanceof Double))
        {
          i1 += 12;
        }
        else if ((localObject2 instanceof Short))
        {
          i1 += 6;
        }
        else if ((localObject2 instanceof Integer))
        {
          i1 += 12;
        }
        else if ((localObject2 instanceof Long))
        {
          i1 += 12;
        }
        else if ((localObject2 instanceof DateTime))
        {
          i1 += 12;
        }
        else if ((localObject2 instanceof Boolean))
        {
          i1 += 6;
        }
      }
    }
    return i1;
  }
  
  private int a(ArrayList paramArrayList)
  {
    int i1 = 0;
    if (paramArrayList == null) {
      return i1;
    }
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      Object localObject1 = localIterator.next();
      if (localObject1 == null)
      {
        i1 += 4;
      }
      else
      {
        Object localObject2 = ((zbos)localObject1).a;
        if (localObject2 == null)
        {
          i1 += 4;
        }
        else if ((localObject2 instanceof String))
        {
          int i2 = 0;
          boolean[] arrayOfBoolean = { i2 };
          boolean bool = ztr.b((String)localObject2, arrayOfBoolean);
          i2 = arrayOfBoolean[0];
          if ((bool) && (i2 == 0)) {
            i1 += 6;
          } else {
            i1 += 6 + zct.a((String)localObject2);
          }
        }
        else if ((localObject2 instanceof Double))
        {
          i1 += 12;
        }
        else if ((localObject2 instanceof Short))
        {
          i1 += 6;
        }
        else if ((localObject2 instanceof Integer))
        {
          i1 += 12;
        }
        else if ((localObject2 instanceof Long))
        {
          i1 += 12;
        }
        else if ((localObject2 instanceof DateTime))
        {
          i1 += 12;
        }
        else if ((localObject2 instanceof Boolean))
        {
          i1 += 6;
        }
      }
    }
    return i1;
  }
  
  private int z()
  {
    int i1 = 0;
    if (this.j.d == null) {
      return i1;
    }
    Iterator localIterator = this.j.d.iterator();
    while (localIterator.hasNext())
    {
      Object localObject1 = localIterator.next();
      if (localObject1 == null)
      {
        i1 += 4;
      }
      else
      {
        Object localObject2 = ((zbos)localObject1).a;
        if (localObject2 == null)
        {
          i1 += 4;
        }
        else if ((localObject2 instanceof String))
        {
          int i2 = 0;
          boolean[] arrayOfBoolean = { i2 };
          boolean bool = ztr.b((String)localObject2, arrayOfBoolean);
          i2 = arrayOfBoolean[0];
          if ((bool) && (i2 == 0)) {
            i1 += 6;
          } else {
            i1 += 6 + zct.a((String)localObject2);
          }
        }
        else if ((localObject2 instanceof Double))
        {
          i1 += 12;
        }
        else if ((localObject2 instanceof Short))
        {
          i1 += 6;
        }
        else if ((localObject2 instanceof Integer))
        {
          i1 += 12;
        }
        else if ((localObject2 instanceof Long))
        {
          i1 += 12;
        }
        else if ((localObject2 instanceof DateTime))
        {
          i1 += 12;
        }
        else if ((localObject2 instanceof Boolean))
        {
          i1 += 6;
        }
      }
    }
    return i1;
  }
  
  void a(byte[] paramArrayOfByte, ArrayList paramArrayList)
  {
    int i1 = 0;
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      Object localObject1 = localIterator.next();
      if (localObject1 == null)
      {
        i1 += a(paramArrayOfByte, i1);
      }
      else
      {
        Object localObject2 = ((zbos)localObject1).a;
        if (localObject2 == null)
        {
          i1 += a(paramArrayOfByte, i1);
        }
        else if ((localObject2 instanceof String))
        {
          String str = (String)localObject2;
          switch (t.a(str))
          {
          case 0: 
            i1 += a(paramArrayOfByte, i1, (byte)7);
            break;
          case 1: 
            i1 += a(paramArrayOfByte, i1, (byte)42);
            break;
          case 2: 
            i1 += a(paramArrayOfByte, i1, (byte)29);
            break;
          case 3: 
            i1 += a(paramArrayOfByte, i1, (byte)0);
            break;
          case 4: 
            i1 += a(paramArrayOfByte, i1, (byte)36);
            break;
          case 5: 
            i1 += a(paramArrayOfByte, i1, (byte)23);
            break;
          case 6: 
            i1 += a(paramArrayOfByte, i1, (byte)15);
            break;
          default: 
            i1 += a(paramArrayOfByte, i1, str);
            break;
          }
        }
        else if ((localObject2 instanceof Double))
        {
          i1 += a(paramArrayOfByte, i1, ((Double)localObject2).doubleValue());
        }
        else if ((localObject2 instanceof Short))
        {
          i1 += a(paramArrayOfByte, i1, ((Short)localObject2).shortValue());
        }
        else if ((localObject2 instanceof Integer))
        {
          i1 += a(paramArrayOfByte, i1, ((Integer)localObject2).intValue());
        }
        else if ((localObject2 instanceof Long))
        {
          i1 += a(paramArrayOfByte, i1, ((Long)localObject2).longValue());
        }
        else if ((localObject2 instanceof DateTime))
        {
          i1 += a(paramArrayOfByte, i1, (DateTime)localObject2);
        }
        else if ((localObject2 instanceof Boolean))
        {
          i1 += a(paramArrayOfByte, i1, ((Boolean)localObject2).booleanValue());
        }
      }
    }
  }
  
  void a(zrg paramzrg)
    throws Exception
  {
    zbtw localzbtw = new zbtw(this);
    localzbtw.a(paramzrg);
    zbtx localzbtx = new zbtx(this.g);
    localzbtx.a(paramzrg);
    Object localObject2;
    Object localObject3;
    Object localObject4;
    if (m())
    {
      localObject1 = new zbty(this);
      ((zbty)localObject1).a(paramzrg);
      localObject2 = this.f.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (zbui)((Iterator)localObject2).next();
        localObject4 = new zbum((zbui)localObject3);
        ((zbum)localObject4).a(paramzrg);
      }
      return;
    }
    Object localObject1 = null;
    if (n())
    {
      if ((this.j == null) || (this.j.d == null)) {
        return;
      }
      if (this.j != null)
      {
        localObject1 = new byte[z()];
        a((byte[])localObject1, this.j.d);
        paramzrg.a((byte[])localObject1);
      }
      localObject2 = new zbuq(this.j);
      ((zbuq)localObject2).a(paramzrg);
      localObject3 = new ArrayList();
      if (this.j.c == 0)
      {
        localObject4 = new zbos();
        ((zbos)localObject4).a = Double.valueOf(this.j.h);
        zf.a((ArrayList)localObject3, localObject4);
        localObject4 = new zbos();
        ((zbos)localObject4).a = Double.valueOf(this.j.i);
        zf.a((ArrayList)localObject3, localObject4);
        localObject4 = new zbos();
        ((zbos)localObject4).a = Double.valueOf(this.j.j);
        zf.a((ArrayList)localObject3, localObject4);
        zf.a((ArrayList)localObject3, this.c);
      }
      else
      {
        localObject4 = new zbos();
        ((zbos)localObject4).a = this.j.f;
        zf.a((ArrayList)localObject3, localObject4);
        localObject4 = new zbos();
        ((zbos)localObject4).a = this.j.g;
        zf.a((ArrayList)localObject3, localObject4);
        localObject4 = new zbos();
        ((zbos)localObject4).a = Short.valueOf((short)(int)this.j.j);
        zf.a((ArrayList)localObject3, localObject4);
        if (this.c != null) {
          zf.a((ArrayList)localObject3, this.c);
        }
      }
      localObject1 = new byte[a((ArrayList)localObject3)];
      a((byte[])localObject1, (ArrayList)localObject3);
      paramzrg.a((byte[])localObject1);
    }
    else
    {
      if (this.c == null) {
        return;
      }
      localObject1 = new byte[y()];
      a((byte[])localObject1, this.c);
      paramzrg.a((byte[])localObject1);
    }
  }
  
  int w()
  {
    int i1 = 0;
    Iterator localIterator = this.r.i.iterator();
    while (localIterator.hasNext())
    {
      zbtv localzbtv = (zbtv)localIterator.next();
      if (localzbtv == this) {
        return i1;
      }
      i1++;
    }
    return 0;
  }
  
  void a(int paramInt)
  {
    this.i = paramInt;
  }
  
  static int a(byte[] paramArrayOfByte, int paramInt, byte paramByte)
  {
    paramArrayOfByte[(paramInt++)] = -53;
    paramArrayOfByte[(paramInt++)] = 0;
    paramArrayOfByte[(paramInt++)] = 2;
    paramArrayOfByte[(paramInt++)] = 0;
    paramArrayOfByte[(paramInt++)] = paramByte;
    paramArrayOfByte[(paramInt++)] = 0;
    return 6;
  }
  
  static int a(byte[] paramArrayOfByte, int paramInt)
  {
    paramArrayOfByte[(paramInt++)] = -49;
    paramArrayOfByte[(paramInt++)] = 0;
    paramArrayOfByte[(paramInt++)] = 0;
    paramArrayOfByte[(paramInt++)] = 0;
    return 4;
  }
  
  static int a(byte[] paramArrayOfByte, int paramInt, String paramString)
  {
    int i1 = paramInt;
    paramArrayOfByte[(paramInt++)] = -51;
    paramArrayOfByte[(paramInt++)] = 0;
    paramInt += 2;
    int i2 = paramString.length();
    System.arraycopy(zc.a((short)i2), 0, paramArrayOfByte, paramInt, 2);
    paramInt += 2;
    int i3 = 0;
    if ("".equals(paramString))
    {
      System.arraycopy(zc.a((short)3), 0, paramArrayOfByte, i1 + 2, 2);
      return 7;
    }
    i3 = zct.b(paramArrayOfByte, paramInt, paramString);
    System.arraycopy(zc.a((short)(2 + i3)), 0, paramArrayOfByte, i1 + 2, 2);
    return 4 + i3 + 2;
  }
  
  static int a(byte[] paramArrayOfByte, int paramInt, double paramDouble)
  {
    paramArrayOfByte[(paramInt++)] = -55;
    paramArrayOfByte[(paramInt++)] = 0;
    paramArrayOfByte[(paramInt++)] = 8;
    paramArrayOfByte[(paramInt++)] = 0;
    System.arraycopy(zc.a(paramDouble), 0, paramArrayOfByte, paramInt, 8);
    return 12;
  }
  
  static int a(byte[] paramArrayOfByte, int paramInt, short paramShort)
  {
    paramArrayOfByte[(paramInt++)] = -52;
    paramArrayOfByte[(paramInt++)] = 0;
    paramArrayOfByte[(paramInt++)] = 2;
    paramArrayOfByte[(paramInt++)] = 0;
    System.arraycopy(zc.a(paramShort), 0, paramArrayOfByte, paramInt, 2);
    return 6;
  }
  
  static int a(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
  {
    paramArrayOfByte[(paramInt++)] = -54;
    paramArrayOfByte[(paramInt++)] = 0;
    paramArrayOfByte[(paramInt++)] = 2;
    paramArrayOfByte[(paramInt++)] = 0;
    paramArrayOfByte[(paramInt++)] = ((byte)(paramBoolean ? 1 : 0));
    paramArrayOfByte[(paramInt++)] = 0;
    return 6;
  }
  
  static int a(byte[] paramArrayOfByte, int paramInt, DateTime paramDateTime)
  {
    paramArrayOfByte[(paramInt++)] = -50;
    paramArrayOfByte[(paramInt++)] = 0;
    paramArrayOfByte[(paramInt++)] = 8;
    paramArrayOfByte[(paramInt++)] = 0;
    System.arraycopy(zc.a(paramDateTime.getYear()), 0, paramArrayOfByte, paramInt, 2);
    System.arraycopy(zc.a(paramDateTime.getMonth()), 0, paramArrayOfByte, paramInt + 2, 2);
    paramArrayOfByte[(paramInt + 4)] = ((byte)paramDateTime.getDay());
    paramArrayOfByte[(paramInt + 5)] = ((byte)paramDateTime.getHour());
    paramArrayOfByte[(paramInt + 6)] = ((byte)paramDateTime.getMinute());
    paramArrayOfByte[(paramInt + 7)] = ((byte)paramDateTime.getSecond());
    return 12;
  }
  
  String[] x()
  {
    String[] arrayOfString = new String[3];
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    Object localObject1 = this.c.iterator();
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = ((Iterator)localObject1).next();
      zbos localzbos = (zbos)localObject2;
      if ((localzbos.a instanceof DateTime))
      {
        arrayOfString[2] = "Calendar";
        zf.a(localArrayList1, (DateTime)localzbos.a);
      }
      else if ((localzbos.a instanceof Integer))
      {
        arrayOfString[2] = "Number";
        zf.a(localArrayList2, Double.valueOf(((Integer)localzbos.a).intValue()));
      }
      else if ((localzbos.a instanceof Double))
      {
        arrayOfString[2] = "Number";
        zf.a(localArrayList2, (Double)localzbos.a);
      }
    }
    if ((arrayOfString[2] != null) && (arrayOfString[2].equals("Calendar")))
    {
      Collections.sort(localArrayList1);
      localObject1 = ((DateTime)localArrayList1.get(0)).a("yyyy-MM-dd\\THH:mm:ss.fff", com.aspose.cells.b.a.c.za.b());
      localObject2 = ((DateTime)localArrayList1.get(localArrayList1.size() - 1)).a("yyyy-MM-dd\\THH:mm:ss.fff", com.aspose.cells.b.a.c.za.b());
      arrayOfString[0] = localObject1;
      arrayOfString[1] = localObject2;
    }
    else if ((arrayOfString[2] != null) && (arrayOfString[2].equals("Number")))
    {
      Collections.sort(localArrayList2);
      arrayOfString[0] = zs.a(localArrayList2.get(0));
      arrayOfString[1] = zs.a(localArrayList2.get(localArrayList2.size() - 1));
    }
    return arrayOfString;
  }
  
  Object[] a(SxRng paramSxRng)
  {
    String[] arrayOfString = x();
    if (arrayOfString[2] != null)
    {
      if (arrayOfString[2].equals("Calendar"))
      {
        Object[] arrayOfObject1 = { "<" + com.aspose.cells.b.a.zw.d(arrayOfString[0], 'T')[0], "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", ">" + com.aspose.cells.b.a.zw.d(arrayOfString[1], 'T')[0] };
        return arrayOfObject1;
      }
      if (arrayOfString[2].equals("Number"))
      {
        double d1 = zauj.C(arrayOfString[0]);
        double d2 = zauj.C(arrayOfString[1]);
        double d3 = 0.1D;
        if ((arrayOfString[0].indexOf('.') == -1) || (arrayOfString[0].indexOf('.') == -1)) {
          d3 = 1.0D;
        }
        if (d2 - d1 <= 2.0D) {
          d3 = 0.1D;
        }
        paramSxRng.j = d3;
        int i1 = (int)((d2 - d1) / d3) + 2;
        Object[] arrayOfObject2 = new Object[i1];
        arrayOfObject2[0] = ("<" + zo.b(d1));
        int i2;
        if (d3 == 1.0D) {
          for (i2 = 1; i2 < i1 - 1; i2++)
          {
            d2 = d1 + d3;
            if (i2 == i1 - 2) {
              arrayOfObject2[i2] = (zo.b(d1) + "-" + zo.b(d2));
            } else {
              arrayOfObject2[i2] = (zo.b(d1) + "-" + zo.b(d2 - 1.0D));
            }
            d1 = d2;
          }
        } else {
          for (i2 = 1; i2 < i1 - 1; i2++)
          {
            d2 = d1 + d3;
            arrayOfObject2[i2] = (zo.b(d1) + "-" + zo.b(d2));
            d1 = d2;
          }
        }
        arrayOfObject2[(i1 - 1)] = (">" + zo.b(d2));
        return arrayOfObject2;
      }
    }
    return null;
  }
  
  Object[] a(String paramString1, String paramString2, ArrayList paramArrayList, double paramDouble, int paramInt)
  {
    int i7;
    int i11;
    if (paramArrayList.size() == 1)
    {
      if (paramInt == 4)
      {
        Object[] arrayOfObject1 = new Object['Ű'];
        str2 = "<" + com.aspose.cells.b.a.zw.d(paramString1, 'T')[0];
        String str3 = ">" + com.aspose.cells.b.a.zw.d(paramString2, 'T')[0];
        arrayOfObject1[0] = str2;
        String[] arrayOfString1 = { "Jan", "Mar", "May", "Jul", "Aug", "Oct", "Dec" };
        int i2 = 0;
        for (int i4 = 0; i4 < arrayOfString1.length; i4++)
        {
          if (i4 == 1) {
            i2 += 29;
          } else if ((i4 != 0) && (i4 != 4)) {
            i2 += 30;
          }
          for (i7 = 1; i7 <= 31; i7++)
          {
            i2++;
            arrayOfObject1[i2] = (i7 + "-" + arrayOfString1[i4]);
          }
        }
        String[] arrayOfString2 = { "Apr", "Jun", "Sep", "Nov" };
        i2 = 60;
        for (i7 = 0; i7 < arrayOfString2.length; i7++)
        {
          if (i7 != 2) {
            i2 += 31;
          } else {
            i2 += 62;
          }
          for (int i9 = 1; i9 <= 30; i9++)
          {
            i2++;
            arrayOfObject1[i2] = (i9 + "-" + arrayOfString2[i7]);
          }
        }
        i2 = 31;
        for (i7 = 1; i7 <= 29; i7++)
        {
          i2++;
          arrayOfObject1[i2] = (i7 + "-Feb");
        }
        arrayOfObject1['ů'] = str3;
        return arrayOfObject1;
      }
      if (paramInt == 0)
      {
        double d1 = zauj.C(paramString1);
        double d2 = zauj.C(paramString2);
        double d3 = paramDouble;
        i7 = 0;
        if ((int)((d2 - d1) % d3) != 0) {
          i7 = (int)((d2 - d1) / d3) + 1 + 2;
        } else {
          i7 = (int)((d2 - d1) / d3) + 2;
        }
        Object[] arrayOfObject2 = new Object[i7];
        arrayOfObject2[0] = ("<" + zo.b(d1));
        for (i11 = 1; i11 < i7 - 1; i11++)
        {
          d2 = d1 + d3;
          arrayOfObject2[i11] = (zo.b(d1) + "-" + zo.b(d2 - 1.0D));
          d1 = d2;
        }
        arrayOfObject2[(i7 - 1)] = (">" + zo.b(d2));
        return arrayOfObject2;
      }
    }
    String str1 = "<" + com.aspose.cells.b.a.zw.d(paramString1, 'T')[0];
    String str2 = ">" + com.aspose.cells.b.a.zw.d(paramString2, 'T')[0];
    Object localObject1;
    int i1;
    Object localObject2;
    int i3;
    switch (paramInt)
    {
    case 1: 
    case 2: 
      localObject1 = new Object[62];
      localObject1[0] = str1;
      for (i1 = 0; i1 < 60; i1++) {
        if (i1 < 10) {
          localObject1[(i1 + 1)] = (":0" + i1);
        } else {
          localObject1[(i1 + 1)] = (":" + i1);
        }
      }
      localObject1[61] = str2;
      return (Object[])localObject1;
    case 3: 
      localObject1 = new Object[26];
      localObject1[0] = str1;
      localObject1[1] = "12 AM";
      for (i1 = 1; i1 < 12; i1++) {
        localObject1[(i1 + 1)] = (i1 + " AM");
      }
      localObject1[13] = "12 PM";
      for (i1 = 1; i1 < 12; i1++) {
        localObject1[(i1 + 13)] = (i1 + " PM");
      }
      localObject1[25] = str2;
      return (Object[])localObject1;
    case 4: 
      localObject1 = new Object['Ű'];
      localObject1[0] = str1;
      localObject2 = new String[] { "Jan", "Mar", "May", "Jul", "Aug", "Oct", "Dec" };
      i3 = 0;
      for (int i5 = 0; i5 < localObject2.length; i5++)
      {
        if (i5 == 1) {
          i3 += 29;
        } else if ((i5 != 0) && (i5 != 4)) {
          i3 += 30;
        }
        for (i7 = 1; i7 <= 31; i7++)
        {
          i3++;
          localObject1[i3] = (i7 + "-" + localObject2[i5]);
        }
      }
      String[] arrayOfString3 = { "Apr", "Jun", "Sep", "Nov" };
      i3 = 60;
      for (i7 = 0; i7 < arrayOfString3.length; i7++)
      {
        if (i7 != 2) {
          i3 += 31;
        } else {
          i3 += 62;
        }
        for (int i10 = 1; i10 <= 30; i10++)
        {
          i3++;
          localObject1[i3] = (i10 + "-" + arrayOfString3[i7]);
        }
      }
      i3 = 31;
      for (i7 = 1; i7 <= 29; i7++)
      {
        i3++;
        localObject1[i3] = (i7 + "-Feb");
      }
      localObject1['ů'] = str2;
      return (Object[])localObject1;
    case 5: 
      localObject1 = new Object[] { str1, "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", str2 };
      return (Object[])localObject1;
    case 6: 
      localObject1 = new Object[] { str1, "Qtr1", "Qtr2", "Qtr3", "Qtr4", str2 };
      return (Object[])localObject1;
    case 7: 
      localObject1 = "<" + com.aspose.cells.b.a.zw.d(paramString1, 'T')[0];
      localObject2 = ">" + com.aspose.cells.b.a.zw.d(paramString2, 'T')[0];
      i3 = 0;
      int i6 = 0;
      try
      {
        i3 = DateTime.a(com.aspose.cells.b.a.zw.d(paramString1, 'T')[0]).getYear();
        i6 = DateTime.a(com.aspose.cells.b.a.zw.d(paramString2, 'T')[0]).getYear();
      }
      catch (Exception localException)
      {
        throw new IllegalArgumentException("Invalid start end years.");
      }
      int i8 = i6 - i3 + 1 + 2;
      Object[] arrayOfObject3 = new Object[i8];
      arrayOfObject3[0] = localObject1;
      for (i11 = 1; i11 < i8 - 1; i11++)
      {
        arrayOfObject3[i11] = zp.a(i3);
        i3++;
      }
      arrayOfObject3[(i8 - 1)] = localObject2;
      return arrayOfObject3;
    }
    return null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbtv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */