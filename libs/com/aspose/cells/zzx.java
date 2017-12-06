package com.aspose.cells;

import com.aspose.cells.a.c.zj;
import com.aspose.cells.a.c.zy;
import com.aspose.cells.b.a.c.zc;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import java.util.HashMap;

public class zzx
{
  private int a = 0;
  private boolean b = false;
  private zaik c;
  private short d = 0;
  private com.aspose.cells.b.a.c.za e;
  private com.aspose.cells.a.a.za f;
  private zavl g;
  private zik h;
  private zhz i;
  private String[] j;
  private HashMap k;
  private zii l;
  private zzu m = new zzu();
  private int n = 11;
  
  public zzx()
  {
    a(null);
  }
  
  public zzx(com.aspose.cells.b.a.c.za paramza)
  {
    a(paramza);
  }
  
  public void a(zzx paramzzx)
  {
    this.b = paramzzx.b;
    this.a = paramzzx.a;
    this.e = paramzzx.e;
    this.d = paramzzx.d;
    this.f = paramzzx.f;
    this.n = paramzzx.n;
    this.i = null;
    this.h = null;
    this.j = null;
    this.k = null;
    this.l = null;
  }
  
  private void n()
  {
    this.f = new com.aspose.cells.a.a.za(this.e);
    this.i = null;
    this.h = null;
    this.j = null;
    this.k = null;
    this.l = null;
  }
  
  public void a(char paramChar1, char paramChar2)
  {
    this.f = new com.aspose.cells.a.a.za(this.f, paramChar1, paramChar2);
    this.i = null;
    this.h = null;
    this.j = null;
    this.k = null;
    this.l = null;
  }
  
  public com.aspose.cells.b.a.c.za a()
  {
    return this.e;
  }
  
  public void a(com.aspose.cells.b.a.c.za paramza)
  {
    if (paramza == null)
    {
      if ((this.e == null) || (this.a != 0))
      {
        this.e = com.aspose.cells.b.a.c.za.a();
        this.a = 0;
        this.d = ((short)this.e.g());
        n();
      }
    }
    else
    {
      this.e = paramza;
      this.d = ((short)this.e.g());
      this.a = zamr.c(this.d);
      n();
    }
  }
  
  public int b()
  {
    return this.a;
  }
  
  public void a(int paramInt)
  {
    if (this.a != paramInt)
    {
      this.a = paramInt;
      if (paramInt == 0)
      {
        this.e = com.aspose.cells.b.a.c.za.a();
        this.d = ((short)this.e.g());
      }
      else
      {
        this.d = zamr.d(paramInt);
        this.e = zj.a(paramInt);
      }
      n();
    }
  }
  
  public boolean c()
  {
    return this.b;
  }
  
  public void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }
  
  public zaik d()
  {
    return this.c;
  }
  
  public void a(zaik paramzaik)
  {
    this.c = paramzaik;
  }
  
  public short e()
  {
    return this.d;
  }
  
  public com.aspose.cells.a.a.za f()
  {
    return this.f;
  }
  
  public zavl g()
  {
    if (this.g == null)
    {
      this.g = new zavl();
      this.g.a(this);
      this.g.a(new zil(this.g));
    }
    return this.g;
  }
  
  public zik h()
  {
    if (this.h == null) {
      this.h = new zik(g());
    }
    return this.h;
  }
  
  public zhz i()
  {
    if (this.i == null) {
      this.i = new zhz(g());
    }
    return this.i;
  }
  
  public static int b(int paramInt)
  {
    if (paramInt == 0) {
      return 0;
    }
    if (paramInt < 11) {
      return 2;
    }
    if (paramInt < 12) {
      return 5;
    }
    if (paramInt < 14) {
      return 4;
    }
    if (paramInt < 23) {
      return 3;
    }
    if (paramInt < 27) {
      return 2;
    }
    if (paramInt < 37) {
      return 3;
    }
    if (paramInt < 41) {
      return 2;
    }
    if (paramInt < 45) {
      return 6;
    }
    if (paramInt < 48) {
      return 3;
    }
    if (paramInt < 49) {
      return 5;
    }
    if (paramInt < 50) {
      return 1;
    }
    if (paramInt < 59) {
      return 3;
    }
    return 0;
  }
  
  public static int c(int paramInt)
  {
    if (paramInt == 0) {
      return 0;
    }
    if (paramInt < 11) {
      return 2;
    }
    if (paramInt < 12) {
      return 6;
    }
    if (paramInt < 14) {
      return 5;
    }
    if (paramInt < 18) {
      return 3;
    }
    if (paramInt < 23) {
      return 4;
    }
    if (paramInt < 27) {
      return 2;
    }
    if (paramInt < 37) {
      return 3;
    }
    if (paramInt < 41) {
      return 2;
    }
    if (paramInt < 45) {
      return 0;
    }
    if (paramInt < 48) {
      return 4;
    }
    if (paramInt < 49) {
      return 6;
    }
    if (paramInt < 50) {
      return 1;
    }
    if (paramInt < 55) {
      return 3;
    }
    if (paramInt < 57) {
      return 4;
    }
    if (paramInt < 59) {
      return 3;
    }
    return 0;
  }
  
  public int a(String paramString)
  {
    if (this.j == null) {
      o();
    }
    paramString = zw.a(paramString, this.e.d().d(), "\"" + this.e.d().d() + "\"");
    for (int i1 = 1; i1 < 59; i1++) {
      if (zw.b(paramString, this.j[i1])) {
        return i1;
      }
    }
    return -1;
  }
  
  public String d(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 59)) {
      return null;
    }
    if (this.j == null) {
      o();
    }
    return this.j[paramInt];
  }
  
  private void o()
  {
    String str1 = "\"" + this.e.d().d() + "\"";
    StringBuilder localStringBuilder = new StringBuilder(20);
    this.j = new String[59];
    this.j[0] = "General";
    this.j[1] = "0";
    this.j[2] = "0.00";
    this.j[3] = "#,##0";
    this.j[4] = "#,##0.00";
    String str2 = null;
    switch (this.d)
    {
    case 4: 
    case 17: 
    case 18: 
    case 1028: 
    case 1041: 
    case 1042: 
    case 2052: 
    case 3076: 
    case 4100: 
    case 5124: 
    case 31748: 
      localStringBuilder.setLength(0);
      this.j[7] = zs.a(localStringBuilder.append(str1).append("#,##0.00;").append(str1).append("-#,##0.00"));
      localStringBuilder.setLength(0);
      this.j[8] = zs.a(localStringBuilder.append(str1).append("#,##0.00;[Red]").append(str1).append("-#,##0.00"));
      localStringBuilder.setLength(0);
      this.j[44] = zs.a(localStringBuilder.append("_ ").append(str1).append("* #,##0.00_ ;_ ").append(str1).append("* -#,##0.00_ ;_ ").append(str1).append("* \"-\"??_ ;_ @_ "));
      str2 = "";
      break;
    case 7: 
    case 12: 
    case 16: 
    case 1031: 
    case 1036: 
    case 1040: 
    case 2064: 
      localStringBuilder.setLength(0);
      this.j[7] = zs.a(localStringBuilder.append("#,##0.00 ").append(str1).append(";-#,##0.00 ").append(str1));
      localStringBuilder.setLength(0);
      this.j[8] = zs.a(localStringBuilder.append("#,##0.00 ").append(str1).append(";[Red]-#,##0.00 ").append(str1));
      localStringBuilder.setLength(0);
      this.j[44] = zs.a(localStringBuilder.append("_-* #,##0.00 ").append(str1).append("_-;-* #,##0 ").append(str1).append("_-;_-* \"-\"?? ").append(str1).append("_-;_-@_-"));
      str2 = "_" + this.e.d().d();
      break;
    case 3084: 
      localStringBuilder.setLength(0);
      this.j[7] = zs.a(localStringBuilder.append("#,##0.00 ").append(str1).append("_);(#,##0.00 ").append(str1).append(")"));
      localStringBuilder.setLength(0);
      this.j[8] = zs.a(localStringBuilder.append("#,##0.00 ").append(str1).append("_);[Red](#,##0.00 ").append(str1).append(")"));
      localStringBuilder.setLength(0);
      this.j[44] = zs.a(localStringBuilder.append("_ * #,##0.00_) ").append(str1).append("_ ;_ * (#,##0.00) ").append(str1).append("_ ;_ * \"-\"??_) ").append(str1).append("_ ;_ @_"));
      str2 = "_" + this.e.d().d();
      break;
    default: 
      localStringBuilder.setLength(0);
      this.j[7] = zs.a(localStringBuilder.append(str1).append("#,##0.00_);(").append(str1).append("#,##0.00)"));
      localStringBuilder.setLength(0);
      this.j[8] = zs.a(localStringBuilder.append(str1).append("#,##0.00_);[Red](").append(str1).append("#,##0.00)"));
      localStringBuilder.setLength(0);
      this.j[44] = zs.a(localStringBuilder.append("_(").append(str1).append("* #,##0.00_);_(").append(str1).append("* (#,##0.00);_(").append(str1).append("* \"-\"??_);_(@_)"));
      str2 = "";
    }
    this.j[5] = zw.a(this.j[7], "0.00", "0");
    this.j[6] = zw.a(this.j[8], "0.00", "0");
    this.j[39] = zw.a(this.j[7], str1, str2);
    this.j[37] = zw.a(this.j[39], "0.00", "0");
    this.j[40] = zw.a(this.j[8], str1, str2);
    this.j[38] = zw.a(this.j[40], "0.00", "0");
    this.j[42] = zw.a(zw.a(this.j[44], "0.00", "0"), "??", "");
    this.j[43] = zw.a(this.j[44], str1, str2);
    this.j[41] = zw.a(zw.a(this.j[43], "0.00", "0"), "??", "");
    this.j[9] = "0%";
    this.j[10] = "0.00%";
    this.j[11] = "0.00E+00";
    this.j[12] = "# ?/?";
    this.j[13] = "# ??/??";
    localStringBuilder.setLength(0);
    this.j[14] = zs.a(a("yyyy", this.f.i(), this.f.j(), localStringBuilder));
    if (zamr.a((short)7, this.d))
    {
      localStringBuilder.setLength(0);
      this.j[15] = zs.a(localStringBuilder.append(this.f.j()).append(".MMM yy"));
      localStringBuilder.setLength(0);
      this.j[16] = zs.a(localStringBuilder.append(this.f.j()).append(".MMM"));
      this.j[17] = "MMM yy";
    }
    else
    {
      localStringBuilder.setLength(0);
      this.j[15] = zs.a(localStringBuilder.append(this.f.j()).append("-MMM-yy"));
      localStringBuilder.setLength(0);
      this.j[16] = zs.a(localStringBuilder.append(this.f.j()).append("-MMM"));
      this.j[17] = "MMM-yy";
    }
    this.j[18] = "h:mm AM/PM";
    this.j[19] = "h:mm:ss AM/PM";
    this.j[20] = "h:mm";
    localStringBuilder.setLength(0);
    this.j[21] = zs.a(localStringBuilder.append(this.f.k()).append(":").append(this.f.l()).append(":").append(this.f.m()));
    localStringBuilder.setLength(0);
    this.j[22] = zs.a(localStringBuilder.append(this.j[14]).append(" h:mm"));
    this.j[23] = "\"$\"#,##0;(\"$\"#,##0)";
    this.j[24] = this.j[23];
    this.j[25] = "\"$\"#,##0.00;(\"$\"#,##0.00)";
    this.j[26] = this.j[25];
    localStringBuilder.setLength(0);
    this.j[30] = zs.a(localStringBuilder.append(this.f.i()).append(this.f.g()).append(this.f.j()).append(this.f.g()).append("yy"));
    switch (this.d)
    {
    case 4: 
    case 2052: 
    case 4100: 
      this.j[27] = "yyyy\"年\"m\"月\"";
      this.j[28] = "m\"月\"d\"日\"";
      this.j[31] = "yyyy\"年\"m\"月\"d\"日\"";
      this.j[32] = "h\"时\"mm\"分\"";
      this.j[33] = "h\"时\"mm\"分\"ss\"秒\"";
      this.j[34] = "上午/下午h\"时\"mm\"分\"";
      this.j[35] = "上午/下午h\"时\"mm\"分\"ss\"秒\"";
      break;
    case 1028: 
    case 3076: 
    case 5124: 
    case 31748: 
      this.j[27] = "e/m/d";
      this.j[28] = "e\"年\"m\"月\"d\"日\"";
      this.j[31] = "yyyy\"年\"m\"月\"d\"日\"";
      this.j[32] = "hh\"時\"mm\"分\"";
      this.j[33] = "hh\"時\"mm\"分\"ss\"秒\"";
      this.j[34] = "上午/下午hh\"時\"mm\"分\"";
      this.j[35] = "上午/下午hh\"時\"mm\"分\"ss\"秒\"";
      break;
    case 17: 
    case 1041: 
      this.j[27] = "ge.m.d";
      this.j[28] = "ggge\"年\"m\"月\"d\"日\"";
      this.j[31] = "yyyy\"年\"m\"月\"d\"日\"";
      this.j[32] = "h\"時\"mm\"分\"";
      this.j[33] = "h\"時\"mm\"分\"ss\"秒\"";
      this.j[34] = "yyyy\"年\"m\"月\"";
      this.j[35] = "m\"月\"d\"日\"";
      break;
    case 18: 
    case 1042: 
      this.j[27] = "yyyy\"年\" mm\"月\" dd\"日\"";
      this.j[28] = "mm-dd";
      this.j[29] = this.j[28];
      this.j[31] = "yyyy\"년\" mm\"월\" dd\"일\"";
      this.j[32] = "h\"시\" mm\"분\"";
      this.j[33] = "h\"시\" mm\"분\" ss\"초\"";
      this.j[34] = "yyyy-mm-dd";
      this.j[35] = this.j[34];
      break;
    default: 
      this.j[27] = this.j[14];
      this.j[28] = this.j[14];
      this.j[31] = this.j[14];
      this.j[32] = this.j[21];
      this.j[33] = this.j[21];
      this.j[34] = this.j[14];
      this.j[35] = this.j[14];
    }
    this.j[29] = this.j[28];
    this.j[36] = this.j[27];
    this.j[45] = "mm:ss";
    this.j[46] = "[h]:mm:ss";
    this.j[47] = "mm:ss.0";
    this.j[48] = "##0.0E+0";
    this.j[49] = "@";
    this.j[50] = this.j[27];
    this.j[51] = this.j[28];
    this.j[52] = this.j[27];
    this.j[53] = this.j[28];
    this.j[54] = this.j[28];
    this.j[55] = this.j[34];
    this.j[56] = this.j[35];
    this.j[57] = this.j[27];
    this.j[58] = this.j[28];
  }
  
  public zzu j()
  {
    return this.m;
  }
  
  public zzz a(int paramInt, Object paramObject)
  {
    return e(paramInt).a(this.m, paramObject);
  }
  
  public zzz a(String paramString, Object paramObject, boolean paramBoolean)
  {
    return a(paramString, paramBoolean).a(this.m, paramObject);
  }
  
  public zahf a(Style paramStyle)
  {
    if ((paramStyle.s() == null) || ("".equals(paramStyle.s()))) {
      return e(paramStyle.getNumber());
    }
    return a(paramStyle.s(), true);
  }
  
  public zahf e(int paramInt)
  {
    if (paramInt == 0) {
      return k();
    }
    String str = d(paramInt);
    if (str == null) {
      return k();
    }
    return a(str, true);
  }
  
  public zahf a(String paramString, boolean paramBoolean)
  {
    if ((paramString == null) || (zy.a(paramString, "General"))) {
      return k();
    }
    if (this.k != null)
    {
      localObject = this.k.get(paramString);
      if (localObject != null) {
        return (zahf)localObject;
      }
    }
    else if (paramBoolean)
    {
      this.k = new HashMap(50);
    }
    Object localObject = new zaaa(this);
    return ((zaaa)localObject).a(paramString, paramBoolean);
  }
  
  public zahf b(String paramString, boolean paramBoolean)
  {
    if ((paramString == null) || (paramString.equals("General"))) {
      return k();
    }
    if ((paramBoolean) && (this.k == null)) {
      this.k = new HashMap(50);
    }
    zaaa localzaaa = new zaaa(this);
    return localzaaa.a(paramString, paramBoolean);
  }
  
  public zii k()
  {
    if (this.l == null)
    {
      zig localzig = new zig();
      localzig.a(this);
      this.l = new zii(localzig, null, null);
    }
    return this.l;
  }
  
  public int a(zahf paramzahf, Object paramObject)
  {
    if (paramzahf.a() == 6) {
      return ((zaab)paramzahf).b(paramObject);
    }
    return paramzahf.g();
  }
  
  public int l()
  {
    return this.n;
  }
  
  public HashMap m()
  {
    return this.k;
  }
  
  public StringBuilder a(String paramString1, String paramString2, String paramString3, StringBuilder paramStringBuilder)
  {
    if (paramStringBuilder == null) {
      paramStringBuilder = new StringBuilder();
    }
    switch (this.f.f())
    {
    case 4: 
      paramStringBuilder.append(paramString1);
      paramStringBuilder.append(this.f.g());
      paramStringBuilder.append(paramString2);
      paramStringBuilder.append(this.f.g());
      paramStringBuilder.append(paramString3);
      break;
    case 5: 
      paramStringBuilder.append(paramString1);
      paramStringBuilder.append(this.f.g());
      paramStringBuilder.append(paramString3);
      paramStringBuilder.append(this.f.g());
      paramStringBuilder.append(paramString2);
      break;
    case 3: 
      paramStringBuilder.append(paramString3);
      paramStringBuilder.append(this.f.g());
      paramStringBuilder.append(paramString2);
      paramStringBuilder.append(this.f.g());
      paramStringBuilder.append(paramString1);
      break;
    case 7: 
      paramStringBuilder.append(paramString3);
      paramStringBuilder.append(this.f.g());
      paramStringBuilder.append(paramString1);
      paramStringBuilder.append(this.f.g());
      paramStringBuilder.append(paramString2);
      break;
    case 2: 
      paramStringBuilder.append(paramString2);
      paramStringBuilder.append(this.f.g());
      paramStringBuilder.append(paramString3);
      paramStringBuilder.append(this.f.g());
      paramStringBuilder.append(paramString1);
      break;
    case 6: 
      paramStringBuilder.append(paramString2);
      paramStringBuilder.append(this.f.g());
      paramStringBuilder.append(paramString1);
      paramStringBuilder.append(this.f.g());
      paramStringBuilder.append(paramString3);
    }
    return paramStringBuilder;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zzx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */