package com.aspose.cells;

import com.aspose.cells.b.a.d.zb;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zw;
import java.util.HashMap;
import java.util.Iterator;

public class VbaProject
{
  HashMap a;
  private byte[] z;
  private boolean A;
  private boolean B = false;
  private boolean C = false;
  byte[] b;
  int c;
  Encoding d;
  String e;
  String f;
  String g;
  String h;
  String i;
  int j;
  int k;
  int l;
  short m;
  String n = "";
  VbaProjectReferenceCollection o;
  Workbook p;
  zaoz q;
  String r;
  boolean s;
  String t;
  String u;
  byte v;
  zbyk w;
  zbym x;
  zbym y;
  private VbaModuleCollection D;
  
  byte[] a()
  {
    if (!isSigned()) {
      return null;
    }
    if (this.A) {
      return d(this.z);
    }
    return this.z;
  }
  
  void a(byte[] paramArrayOfByte)
  {
    this.z = paramArrayOfByte;
    this.A = false;
  }
  
  byte[] b()
    throws Exception
  {
    if (!isSigned()) {
      return null;
    }
    if (!this.A) {
      return c(this.z);
    }
    return this.z;
  }
  
  void b(byte[] paramArrayOfByte)
  {
    this.z = paramArrayOfByte;
    this.A = true;
  }
  
  private static byte[] c(byte[] paramArrayOfByte)
    throws Exception
  {
    zh localzh = new zh();
    zb localzb = new zb(localzh);
    int i1 = paramArrayOfByte.length;
    int i2 = i1 % 4;
    int i3 = i1;
    if (i2 > 0) {
      i3 += 4 - i2;
    }
    localzb.a(i3);
    localzb.a(8L);
    localzb.a(paramArrayOfByte, 0, paramArrayOfByte.length);
    if (i2 > 0) {
      for (int i4 = 0; i4 < 4 - i2; i4++) {
        localzb.a((byte)0);
      }
    }
    byte[] arrayOfByte = localzh.o();
    localzh.a();
    return arrayOfByte;
  }
  
  private static byte[] d(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = new byte[paramArrayOfByte.length - 8];
    for (int i1 = 0; i1 + 8 < paramArrayOfByte.length; i1++) {
      arrayOfByte[i1] = paramArrayOfByte[(i1 + 8)];
    }
    return arrayOfByte;
  }
  
  public String getName()
  {
    return this.f;
  }
  
  public void setName(String value)
  {
    this.f = value;
  }
  
  public boolean isSigned()
  {
    return this.z != null;
  }
  
  VbaProject(Workbook workbook)
  {
    this.p = workbook;
    this.D = new VbaModuleCollection(this);
    a(workbook);
  }
  
  private void a(Workbook paramWorkbook)
  {
    this.s = true;
    this.d = Encoding.getEncoding(1252);
    this.t = "{CB33A643-8B4C-46B8-9472-C4D12694F216}";
    this.f = "VBAProject";
    this.u = "393222000";
    this.v = 8;
    this.D.add(1, "ThisWorkbook");
    paramWorkbook.getWorksheets().b("ThisWorkbook");
    Iterator localIterator = paramWorkbook.getWorksheets().iterator();
    while (localIterator.hasNext())
    {
      Worksheet localWorksheet = (Worksheet)localIterator.next();
      String str = localWorksheet.p;
      if (zw.b(str)) {
        str = localWorksheet.getName();
      }
      localWorksheet.p = str;
      this.D.add(1, str);
    }
    g().a("&H00000001", "{3832D640-CF90-11CF-8E43-00A0C911005A};VBE;&H00000000");
    getReferences().addRegisteredReference("stdole", "*\\G{00020430-0000-0000-C000-000000000046}#2.0#0#C:\\Windows\\system32\\stdole2.tlb#");
    getReferences().addRegisteredReference("Office", "*\\G{2DF8D04C-5BFA-101B-BDE5-00AA0044DE52}#2.0#0#C:\\Program Files\\Common Files\\Microsoft Shared\\OFFICE15\\MSO.DLL#Microsoft Office 15.0 Object Library");
  }
  
  VbaProject(Workbook workbook, zaoz VBAStorage, String macroFn)
  {
    this.p = workbook;
    this.D = new VbaModuleCollection(this);
    this.q = VBAStorage;
    this.r = macroFn;
    this.v = 8;
  }
  
  boolean c()
  {
    return (this.v & 0xFF & 0x4) != 0;
  }
  
  void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.v = ((byte)(this.v | 0x4));
    } else {
      this.v = ((byte)(this.v & 0xFFFFFFFB));
    }
  }
  
  public void protect(boolean islockedForViewing, String password)
  {
    if (zw.b(password))
    {
      this.w = null;
      a(false);
      islockedForViewing = false;
      this.t = "{CB33A643-8B4C-46B8-9472-C4D12694F216}";
    }
    else
    {
      this.w = new zbyk(password, this.d);
      a(true);
      this.t = "{00000000-0000-0000-0000-000000000000}";
    }
    b(!islockedForViewing);
  }
  
  public boolean isProtected()
  {
    return c();
  }
  
  public boolean getIslockedForViewing()
  {
    return !d();
  }
  
  boolean d()
  {
    return (this.v & 0xFF & 0x8) != 0;
  }
  
  void b(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.v = ((byte)(this.v | 0x8));
    } else {
      this.v = ((byte)(this.v & 0xFFFFFFF7));
    }
  }
  
  void a(VbaProject paramVbaProject)
  {
    this.q = paramVbaProject.q;
    this.r = paramVbaProject.r;
    this.s = paramVbaProject.s;
    if (this.s)
    {
      this.c = paramVbaProject.c;
      this.d = paramVbaProject.d;
      this.f = paramVbaProject.f;
      this.g = paramVbaProject.g;
      this.h = paramVbaProject.h;
      this.i = paramVbaProject.i;
      this.j = paramVbaProject.j;
      this.k = paramVbaProject.k;
      this.l = paramVbaProject.l;
      this.m = paramVbaProject.m;
      this.n = paramVbaProject.n;
      this.o = null;
      if (paramVbaProject.o != null) {
        getReferences().a(paramVbaProject.o);
      }
      g().b(paramVbaProject.g());
      this.e = paramVbaProject.e;
      this.t = paramVbaProject.t;
      this.v = paramVbaProject.v;
      this.w = (paramVbaProject.w == null ? null : (zbyk)paramVbaProject.w.b());
      if (paramVbaProject.D != null)
      {
        this.D = new VbaModuleCollection(this);
        for (int i1 = 0; i1 < paramVbaProject.getModules().getCount(); i1++)
        {
          VbaModule localVbaModule1 = paramVbaProject.getModules().get(i1);
          VbaModule localVbaModule2 = new VbaModule(this);
          localVbaModule2.a(localVbaModule1);
          getModules().a(localVbaModule2);
        }
      }
    }
  }
  
  zm a(String paramString)
    throws Exception
  {
    if ((this.p.a != null) && (this.p.a.a != null))
    {
      byte[] arrayOfByte = zalq.a(this.p.a.a.b, paramString);
      if (arrayOfByte != null) {
        return new zh(arrayOfByte);
      }
    }
    return null;
  }
  
  void e()
    throws Exception
  {
    if (this.s) {
      return;
    }
    zaoz localzaoz = this.q;
    if (localzaoz == null)
    {
      localObject = a(this.r);
      zxf localzxf = new zxf((zm)localObject);
      localzaoz = this.q = localzxf.a();
    }
    Object localObject = new zbyn(this, localzaoz);
    ((zbyn)localObject).a();
    this.s = true;
  }
  
  zm a(zxf paramzxf)
    throws Exception
  {
    zaoz localzaoz = this.q;
    Object localObject1;
    Object localObject2;
    if (this.s)
    {
      localzaoz = new zaoz();
      if (this.q != null)
      {
        localObject1 = this.q.c().iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (String)((Iterator)localObject1).next();
          localzaoz.a(localObject2, this.q.d(localObject2));
        }
      }
    }
    if (paramzxf == null)
    {
      if (this.s)
      {
        localObject1 = new zbyp(this, localzaoz);
        ((zbyp)localObject1).a();
        paramzxf = new zxf(localzaoz);
      }
      else
      {
        if (this.r != null) {
          return a(this.r);
        }
        paramzxf = new zxf(localzaoz);
      }
      if (paramzxf != null)
      {
        localObject1 = new zh();
        paramzxf.a((zm)localObject1);
        ((zh)localObject1).b(0L);
        return (zm)localObject1;
      }
      return null;
    }
    if (this.s)
    {
      localObject1 = new zbyp(this, localzaoz);
      ((zbyp)localObject1).a();
    }
    else if (this.r != null)
    {
      localObject1 = a(this.r);
      if (localObject1 != null)
      {
        localObject2 = new zxf((zm)localObject1);
        localzaoz = ((zxf)localObject2).a();
        this.p.getWorksheets().b(true);
      }
    }
    if (localzaoz != null) {
      paramzxf.a().b("_VBA_PROJECT_CUR", localzaoz);
    }
    return null;
  }
  
  zbym f()
  {
    if (this.x == null) {
      this.x = new zbym();
    }
    return this.x;
  }
  
  zbym g()
  {
    if (this.y == null) {
      this.y = new zbym();
    }
    return this.y;
  }
  
  public VbaModuleCollection getModules()
  {
    return this.D;
  }
  
  public VbaProjectReferenceCollection getReferences()
  {
    if (this.o == null) {
      this.o = new VbaProjectReferenceCollection(this);
    }
    return this.o;
  }
  
  void a(String paramString1, String paramString2)
  {
    if (!this.s) {
      return;
    }
    VbaModule localVbaModule1 = this.D.get(paramString1);
    VbaModule localVbaModule2 = this.D.get(paramString2);
    if (localVbaModule2 != null)
    {
      localVbaModule2.a(localVbaModule1);
      return;
    }
    localVbaModule2 = new VbaModule(this);
    localVbaModule2.a(localVbaModule1);
    localVbaModule2.a = paramString2;
    localVbaModule2.c = paramString2;
    this.D.a(localVbaModule2);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/VbaProject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */