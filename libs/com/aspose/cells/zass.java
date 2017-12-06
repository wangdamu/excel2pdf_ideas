package com.aspose.cells;

import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import com.aspose.cells.b.c.a.za;
import java.util.HashMap;

class zass
{
  private zasg a;
  private zcjy b;
  private Font c;
  private static final za d = new za(new String[] { "master-page", "name", "page-layout-name", "header", "header-left", "footer", "footer-left", "display", "span", "p", "region-left", "region-right", "region-center", "style-name", "page-number", "page-count", "sheet-name", "date", "time", "file-name" });
  
  zass(zasg paramzasg)
  {
    this.a = paramzasg;
  }
  
  void a(zcjy paramzcjy)
    throws Exception
  {
    this.b = paramzcjy;
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (d.a(paramzcjy.q()))
      {
      case 0: 
        a();
        break;
      default: 
        paramzcjy.a();
      }
    }
  }
  
  private void a()
    throws Exception
  {
    if (this.b.o())
    {
      this.b.a();
      return;
    }
    zasi localzasi = new zasi();
    if (this.b.n())
    {
      while (this.b.m()) {
        switch (d.a(this.b.q()))
        {
        case 1: 
          localzasi.a = this.b.t();
          break;
        case 2: 
          localzasi.b = this.b.t();
        }
      }
      this.b.l();
    }
    this.a.l.put(localzasi.a, localzasi);
    this.b.d();
    while (zauz.a(this.b))
    {
      this.c = null;
      switch (d.a(this.b.q()))
      {
      case 3: 
        if (localzasi.e == null) {
          localzasi.e = new String[3];
        }
        a(localzasi.e);
        break;
      case 4: 
        if (localzasi.g == null) {
          localzasi.g = new String[3];
        }
        if (a(localzasi.g)) {
          localzasi.c = true;
        }
        break;
      case 5: 
        if (localzasi.f == null) {
          localzasi.f = new String[3];
        }
        a(localzasi.f);
        break;
      case 6: 
        if (localzasi.h == null) {
          localzasi.h = new String[3];
        }
        if (a(localzasi.h)) {
          localzasi.d = true;
        }
        break;
      }
    }
  }
  
  private boolean a(String[] paramArrayOfString)
    throws Exception
  {
    boolean bool = true;
    if (this.b.o())
    {
      this.b.a();
      return false;
    }
    if (this.b.n())
    {
      while (this.b.m()) {
        switch (d.a(this.b.q()))
        {
        case 7: 
          bool = Boolean.parseBoolean(this.b.t());
        }
      }
      this.b.l();
    }
    StringBuilder localStringBuilder = new StringBuilder();
    this.c = null;
    this.b.d();
    while (zauz.a(this.b)) {
      switch (d.a(this.b.q()))
      {
      case 8: 
        String str = null;
        if (this.b.n())
        {
          while (this.b.m()) {
            switch (d.a(this.b.q()))
            {
            case 13: 
              str = this.b.t();
            }
          }
          this.b.l();
        }
        a(localStringBuilder);
        break;
      case 9: 
        a(localStringBuilder);
        break;
      case 10: 
        a(paramArrayOfString, 0);
        break;
      case 11: 
        a(paramArrayOfString, 2);
        break;
      case 12: 
        a(paramArrayOfString, 1);
      }
    }
    if (localStringBuilder.length() != 0) {
      paramArrayOfString[1] = zs.a(localStringBuilder);
    }
    return bool;
  }
  
  private void a(String[] paramArrayOfString, int paramInt)
    throws Exception
  {
    if (this.b.o())
    {
      this.b.a();
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    this.c = null;
    this.b.d();
    while (zauz.a(this.b)) {
      switch (d.a(this.b.q()))
      {
      case 8: 
        String str = null;
        if (this.b.n())
        {
          while (this.b.m()) {
            switch (d.a(this.b.q()))
            {
            case 13: 
              str = this.b.t();
            }
          }
          this.b.l();
        }
        Font localFont = null;
        if (str != null) {
          localFont = (Font)this.a.o.b.get(str);
        }
        a(this.c, localFont, localStringBuilder);
        this.c = localFont;
        a(localStringBuilder);
        break;
      case 9: 
        if (localStringBuilder.length() != 0) {
          localStringBuilder.append('\n');
        }
        a(localStringBuilder);
      }
    }
    if ((localStringBuilder != null) && (localStringBuilder.length() != 0)) {
      paramArrayOfString[paramInt] = zs.a(localStringBuilder);
    }
  }
  
  private void a(StringBuilder paramStringBuilder)
    throws Exception
  {
    if (this.b.o())
    {
      this.b.a();
      return;
    }
    this.b.d();
    while (this.b.s() != 4)
    {
      this.b.k();
      if (this.b.s() != 1)
      {
        String str1 = zw.a(this.b.t(), "&", "&&");
        if ((str1.length() > 1) && (str1.charAt(0) >= '0') && (str1.charAt(0) <= '9'))
        {
          int i = 0;
          for (int j = paramStringBuilder.length() - 1; j >= 0; j--)
          {
            if (paramStringBuilder.charAt(j) == '&')
            {
              i = 1;
              break;
            }
            if ((paramStringBuilder.charAt(j) < '0') || (paramStringBuilder.charAt(j) > '9')) {
              break;
            }
          }
          if (i != 0) {
            paramStringBuilder.append(' ');
          }
        }
        paramStringBuilder.append(str1);
        this.b.a();
      }
      else
      {
        switch (d.a(this.b.q()))
        {
        case 9: 
          if (paramStringBuilder.length() != 0) {
            paramStringBuilder.append('\n');
          }
          a(paramStringBuilder);
          break;
        case 14: 
          paramStringBuilder.append("&P");
          this.b.a();
          break;
        case 15: 
          paramStringBuilder.append("&N");
          this.b.a();
          break;
        case 16: 
          paramStringBuilder.append("&A");
          this.b.a();
          break;
        case 17: 
          paramStringBuilder.append("&D");
          this.b.a();
          break;
        case 18: 
          paramStringBuilder.append("&T");
          this.b.a();
          break;
        case 19: 
          boolean bool = false;
          if (this.b.n())
          {
            while (this.b.m()) {
              switch (d.a(this.b.q()))
              {
              case 7: 
                bool = "full".equals(this.b.t());
              }
            }
            this.b.l();
          }
          if (bool) {
            paramStringBuilder.append("&Z");
          } else {
            paramStringBuilder.append("&F");
          }
          this.b.a();
          break;
        case 8: 
          String str2 = null;
          if (this.b.n())
          {
            while (this.b.m()) {
              switch (d.a(this.b.q()))
              {
              case 13: 
                str2 = this.b.t();
              }
            }
            this.b.l();
          }
          Font localFont = null;
          if (str2 != null) {
            localFont = (Font)this.a.o.b.get(str2);
          }
          a(this.c, localFont, paramStringBuilder);
          this.c = localFont;
          a(paramStringBuilder);
          break;
        case 10: 
        case 11: 
        case 12: 
        case 13: 
        default: 
          this.b.a();
        }
      }
    }
    this.b.h();
  }
  
  private void a(Font paramFont1, Font paramFont2, StringBuilder paramStringBuilder)
  {
    if ((paramFont1 == null) && (paramFont2 == null)) {
      return;
    }
    if ((paramFont1 == null) && (paramFont2 != null))
    {
      if (!zw.b(paramFont2.getName(), this.a.b.getWorksheets().T().getName()))
      {
        paramStringBuilder.append("&\"");
        paramStringBuilder.append(paramFont2.getName());
        paramStringBuilder.append("\"");
      }
      if (paramFont2.f(12))
      {
        paramStringBuilder.append("&");
        paramStringBuilder.append(paramFont2.getSize());
      }
      if (paramFont2.isBold()) {
        paramStringBuilder.append("&B");
      }
      if (paramFont2.isItalic()) {
        paramStringBuilder.append("&I");
      }
      switch (paramFont2.getUnderline())
      {
      case 1: 
      case 3: 
        paramStringBuilder.append("&U");
        break;
      case 2: 
      case 4: 
        paramStringBuilder.append("&E");
      }
      if (paramFont2.isStrikeout()) {
        paramStringBuilder.append("&S");
      }
      if (paramFont2.isSubscript()) {
        paramStringBuilder.append("&Y");
      }
      if (paramFont2.isSuperscript()) {
        paramStringBuilder.append("&X");
      }
      return;
    }
    if ((paramFont1 != null) && (paramFont2 == null))
    {
      if (paramFont1.isBold()) {
        paramStringBuilder.append("&B");
      }
      if (paramFont1.isItalic()) {
        paramStringBuilder.append("&I");
      }
      switch (paramFont1.getUnderline())
      {
      case 1: 
      case 3: 
        paramStringBuilder.append("&U");
        break;
      case 2: 
      case 4: 
        paramStringBuilder.append("&E");
      }
      if (paramFont1.isStrikeout()) {
        paramStringBuilder.append("&S");
      }
      if (paramFont1.isSubscript()) {
        paramStringBuilder.append("&Y");
      }
      if (paramFont1.isSuperscript()) {
        paramStringBuilder.append("&X");
      }
      return;
    }
    if (paramFont1.a(paramFont2)) {
      return;
    }
    if ((paramFont1.isSubscript()) && (!paramFont2.isSubscript())) {
      paramStringBuilder.append("&X");
    }
    if ((paramFont1.isSuperscript()) && (!paramFont2.isSuperscript())) {
      paramStringBuilder.append("&Y");
    }
    if ((paramFont1.isStrikeout()) && (!paramFont2.isStrikeout())) {
      paramStringBuilder.append("&S");
    }
    if (paramFont1.getUnderline() != paramFont2.getUnderline()) {
      switch (paramFont1.getUnderline())
      {
      case 1: 
      case 3: 
        paramStringBuilder.append("&U");
        break;
      case 2: 
      case 4: 
        paramStringBuilder.append("&E");
      }
    }
    if ((paramFont1.isItalic()) && (!paramFont2.isItalic())) {
      paramStringBuilder.append("&I");
    }
    if ((paramFont1.isBold()) && (!paramFont2.isBold())) {
      paramStringBuilder.append("&B");
    }
    if (!zw.b(paramFont1.getName(), paramFont2.getName()))
    {
      paramStringBuilder.append("&\"");
      paramStringBuilder.append(paramFont2.getName());
      paramStringBuilder.append("\"");
    }
    if (paramFont1.getSize() != paramFont2.getSize())
    {
      paramStringBuilder.append("&");
      paramStringBuilder.append(paramFont2.getSize());
    }
    if ((paramFont2.isItalic()) && (!paramFont1.isItalic())) {
      paramStringBuilder.append("&I");
    }
    if ((paramFont2.isBold()) && (!paramFont1.isBold())) {
      paramStringBuilder.append("&B");
    }
    if (paramFont2.getUnderline() != paramFont1.getUnderline()) {
      switch (paramFont2.getUnderline())
      {
      case 1: 
      case 3: 
        paramStringBuilder.append("&U");
        break;
      case 2: 
      case 4: 
        paramStringBuilder.append("&E");
      }
    }
    if ((paramFont2.isStrikeout()) && (!paramFont1.isStrikeout())) {
      paramStringBuilder.append("&S");
    }
    if ((paramFont2.isSubscript()) && (!paramFont1.isSubscript())) {
      paramStringBuilder.append("&Y");
    }
    if ((paramFont2.isSuperscript()) && (!paramFont1.isSuperscript())) {
      paramStringBuilder.append("&X");
    }
    if (paramFont2.f(16))
    {
      paramStringBuilder.append("&");
      paramStringBuilder.append(zasp.a(paramFont2.getColor()));
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zass.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */