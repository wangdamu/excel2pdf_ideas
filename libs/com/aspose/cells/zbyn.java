package com.aspose.cells;

import com.aspose.cells.a.c.zp;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.d.zn;
import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zw;
import com.aspose.cells.b.c.a.za;

class zbyn
{
  private zaoz a;
  private zaoz b;
  private VbaProject c;
  private byte[] d;
  private int e;
  private int f = 0;
  private byte[] g = new byte[6];
  private static final za h = new za(new String[] { "ID", "Document", "Module", "Class", "BaseClass", "Package", "ExeName32", "HelpFile", "Name", "ProjectHelpId", "ProjectDescription", "VersionCompatible32", "CMG", "DPB", "GC", "I", "Z" });
  
  zbyn(VbaProject paramVbaProject, zaoz paramzaoz)
  {
    this.c = paramVbaProject;
    this.b = paramzaoz;
    this.a = paramzaoz.b("VBA");
    paramzaoz.g("VBA");
  }
  
  void a()
    throws Exception
  {
    e();
    b();
    d();
    c();
  }
  
  private void a(zm paramzm, int paramInt)
    throws Exception
  {
    this.f = zc.a(this.g, 2);
    this.d = new byte[this.f + paramInt];
    paramzm.a(this.d, 0, this.d.length);
  }
  
  void b()
    throws Exception
  {
    Object localObject = this.a.a("dir");
    this.a.g("dir");
    localObject = zbyq.a((zm)localObject, 0);
    ((zm)localObject).a(0L, 0);
    this.c.getReferences().clear();
    int i = 0;
    VbaModule localVbaModule = null;
    VbaProjectReference localVbaProjectReference = null;
    while (((zm)localObject).a(this.g, 0, 6) == 6)
    {
      this.e = (zc.e(this.g, 0) & 0xFFFF);
      a((zm)localObject, this.e == 9 ? 2 : 0);
      int j;
      int k;
      switch (this.e)
      {
      case 1: 
        this.c.c = (this.d[0] & 0xFF);
        break;
      case 3: 
        this.c.d = Encoding.getEncoding(zc.e(this.d, 0) & 0xFFFF);
        break;
      case 4: 
        this.c.f = this.c.d.a(this.d);
        break;
      case 5: 
        this.c.g = this.c.d.a(this.d);
        break;
      case 64: 
        this.c.g = Encoding.getUnicode().a(this.d);
        break;
      case 6: 
        this.c.h = this.c.d.a(this.d);
        break;
      case 61: 
        this.c.i = this.c.d.a(this.d);
        break;
      case 7: 
        this.c.j = zc.a(this.d, 0);
        break;
      case 8: 
        this.c.k = zc.a(this.d, 0);
        break;
      case 9: 
        this.c.l = zc.a(this.d, 0);
        this.c.m = zc.b(this.d, 4);
        break;
      case 12: 
        this.c.n = this.c.d.a(this.d);
        break;
      case 60: 
        this.c.n = Encoding.getUnicode().a(this.d);
        break;
      case 22: 
        localVbaProjectReference = new VbaProjectReference();
        this.c.getReferences().a(localVbaProjectReference);
        localVbaProjectReference.setName(this.c.d.a(this.d));
        break;
      case 62: 
        if (localVbaProjectReference == null)
        {
          localVbaProjectReference = new VbaProjectReference();
          this.c.getReferences().a(localVbaProjectReference);
        }
        localVbaProjectReference.setName(Encoding.getUnicode().a(this.d));
        break;
      case 13: 
        localVbaProjectReference.a = 0;
        j = zc.a(this.d, 0);
        localVbaProjectReference.c = this.c.d.a(this.d, 4, j);
        break;
      case 51: 
        localVbaProjectReference.a = 1;
        localVbaProjectReference.c = this.c.d.a(this.d);
        break;
      case 47: 
        localVbaProjectReference.a = 1;
        j = zc.a(this.d, 0);
        localVbaProjectReference.d = this.c.d.a(this.d, 4, j);
        break;
      case 48: 
        localVbaProjectReference.a = 1;
        j = zc.a(this.d, 0);
        localVbaProjectReference.e = this.c.d.a(this.d, 4, j);
        k = j + 4;
        k += 6;
        localVbaProjectReference.f = new byte[16];
        System.arraycopy(this.d, k, localVbaProjectReference.f, 0, 16);
        k += 16;
        localVbaProjectReference.g = zc.a(this.d, k);
        k += 4;
        break;
      case 14: 
        localVbaProjectReference.a = 2;
        j = zc.a(this.d, 0);
        localVbaProjectReference.c = this.c.d.a(this.d, 4, j);
        k = 4 + j;
        j = zc.a(this.d, k);
        localVbaProjectReference.d = this.c.d.a(this.d, k + 4, j);
        k += 4;
        break;
      case 15: 
        i = zc.e(this.d, 0) & 0xFFFF;
        if (i == 0) {
          return;
        }
        localVbaModule = new VbaModule(this.c);
        this.c.getModules().a(localVbaModule);
        break;
      case 19: 
        this.c.getModules().a = zc.b(this.d, 0);
        break;
      case 25: 
        localVbaModule.a = this.c.d.a(this.d);
        break;
      case 71: 
        localVbaModule.a = Encoding.getUnicode().a(this.d);
        break;
      case 26: 
        localVbaModule.c = this.c.d.a(this.d);
        break;
      case 50: 
        localVbaModule.c = Encoding.getUnicode().a(this.d);
        break;
      case 28: 
        localVbaModule.d = this.c.d.a(this.d);
        break;
      case 72: 
        localVbaModule.d = Encoding.getUnicode().a(this.d);
        break;
      case 49: 
        localVbaModule.e = zc.a(this.d, 0);
        break;
      case 30: 
        localVbaModule.f = zc.a(this.d, 0);
        break;
      case 44: 
        localVbaModule.g = zc.b(this.d, 0);
        break;
      case 33: 
        localVbaModule.h = 0;
        break;
      case 34: 
        localVbaModule.h = 1;
        break;
      case 37: 
        localVbaModule.i = true;
        break;
      case 40: 
        localVbaModule.j = true;
        break;
      case 43: 
        i--;
        if (i != 0)
        {
          localVbaModule = new VbaModule(this.c);
          this.c.getModules().a(localVbaModule);
        }
        break;
      }
    }
  }
  
  void c()
    throws Exception
  {
    for (int i = 0; i < this.c.getModules().getCount(); i++)
    {
      VbaModule localVbaModule = this.c.getModules().get(i);
      String str = localVbaModule.c;
      zh localzh = this.a.a(str);
      this.a.g(str);
      byte[] arrayOfByte = new byte[(int)localzh.h()];
      localzh.a(arrayOfByte, 0, arrayOfByte.length);
      localVbaModule.k = arrayOfByte;
    }
  }
  
  void d()
    throws Exception
  {
    zh localzh = this.b.a("PROJECT");
    this.b.g("PROJECT");
    zn localzn = new zn(localzh, this.c.d);
    String str3;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    while (localzn.c() != -1)
    {
      localObject1 = localzn.f();
      if ((localObject1 != null) && (!"".equals(localObject1)))
      {
        if (("[Host Extender Info]".equals(localObject1)) || ("[Workspace]".equals(localObject1))) {
          break;
        }
        int i = ((String)localObject1).indexOf('=');
        String str2 = ((String)localObject1).substring(0, 0 + i).trim();
        str3 = ((String)localObject1).substring(i + 1).trim();
        switch (h.a(str2))
        {
        case 0: 
          this.c.t = str3.substring(1, 1 + (str3.length() - 2));
          break;
        case 1: 
          i = str3.indexOf("/");
          localObject2 = str3.substring(0, 0 + i).trim();
          localObject3 = str3.substring(i + 1).trim();
          localObject4 = this.c.getModules().get((String)localObject2);
          if (localObject4 != null)
          {
            ((VbaModule)localObject4).h = 1;
            ((VbaModule)localObject4).b = zp.c(((String)localObject3).substring(2));
          }
          break;
        case 2: 
          localObject2 = this.c.getModules().get(str3);
          if (localObject2 != null) {
            ((VbaModule)localObject2).h = 0;
          }
          break;
        case 3: 
          localObject2 = this.c.getModules().get(str3);
          if (localObject2 != null) {
            ((VbaModule)localObject2).h = 2;
          }
          break;
        case 4: 
          localObject2 = this.c.getModules().get(str3);
          if (localObject2 != null) {
            ((VbaModule)localObject2).h = 3;
          }
          break;
        case 5: 
          this.c.f().a(str2, str3);
          break;
        case 6: 
          this.c.e = str3;
          break;
        case 7: 
        case 8: 
        case 9: 
        case 10: 
          break;
        case 11: 
          this.c.u = str3.substring(1, 1 + (str3.length() - 2));
          break;
        case 12: 
          VbaProject tmp454_451 = this.c;
          tmp454_451.v = ((byte)(tmp454_451.v | (byte)(zbyq.a(str3.substring(1, 1 + (str3.length() - 2)))[0] & 0xFF & 0x7)));
          break;
        case 13: 
          localObject2 = zbyq.a(str3.substring(1, 1 + (str3.length() - 2)));
          if (localObject2.length > 1) {
            this.c.w = new zbyk((byte[])localObject2, this.c.d);
          }
          break;
        case 14: 
          if (zbyq.a(str3.substring(1, 1 + (str3.length() - 2)))[0] == 0) {
            this.c.b(false);
          }
          break;
        }
      }
    }
    Object localObject1 = this.c.g();
    ((zbym)localObject1).clear();
    String str1;
    int j;
    while (localzn.c() != -1)
    {
      str1 = localzn.f();
      if ((str1 != null) && (!"".equals(str1)))
      {
        if ("[Workspace]".equals(str1)) {
          break;
        }
        j = str1.indexOf('=');
        str3 = str1.substring(0, 0 + j).trim();
        localObject2 = str1.substring(j + 1).trim();
        ((zbym)localObject1).a(str3, (String)localObject2);
      }
    }
    while (localzn.c() != -1)
    {
      str1 = localzn.f();
      if ((str1 != null) && (!"".equals(str1)))
      {
        j = str1.indexOf('=');
        str3 = str1.substring(0, 0 + j);
        localObject2 = str1.substring(j + 1);
        localObject3 = this.c.getModules().get(str3);
        if (localObject3 != null)
        {
          localObject4 = zw.d((String)localObject2, ',');
          ((VbaModule)localObject3).m = a((String[])localObject4, 0);
          ((VbaModule)localObject3).n = a((String[])localObject4, 5);
        }
      }
    }
  }
  
  private zbyo a(String[] paramArrayOfString, int paramInt)
  {
    if (paramArrayOfString.length >= 4 + paramInt)
    {
      zbyo localzbyo = new zbyo();
      localzbyo.a = zp.b(paramArrayOfString[(paramInt + 0)].trim());
      localzbyo.b = zp.b(paramArrayOfString[(paramInt + 1)].trim());
      localzbyo.c = zp.b(paramArrayOfString[(paramInt + 2)].trim());
      localzbyo.d = zp.b(paramArrayOfString[(paramInt + 3)].trim());
      if (paramArrayOfString.length >= 5 + paramInt) {
        switch (h.a(paramArrayOfString[(paramInt + 4)].trim()))
        {
        case 15: 
          localzbyo.e = 2;
          break;
        case 16: 
          localzbyo.e = 1;
          break;
        default: 
          localzbyo.e = 0;
        }
      }
      return localzbyo;
    }
    return null;
  }
  
  void e()
  {
    this.b.g("PROJECTwm");
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbyn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */