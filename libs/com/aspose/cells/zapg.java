package com.aspose.cells;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

class zapg
{
  private String e = null;
  private zapn f = null;
  private static boolean g;
  private static zapg h = null;
  protected static String a = "POST";
  protected static String b = "GET";
  protected static String c = "PUT";
  protected static String d = "DELETE";
  
  private static SSLContext a()
  {
    zaph localzaph = new zaph();
    SSLContext localSSLContext = null;
    try
    {
      localSSLContext = SSLContext.getInstance("SSL");
      localSSLContext.init(null, new TrustManager[] { localzaph }, null);
    }
    catch (GeneralSecurityException localGeneralSecurityException) {}
    return localSSLContext;
  }
  
  public static zapg a(zapn paramzapn, String paramString, boolean paramBoolean)
  {
    zapg localzapg = new zapg();
    localzapg.a(paramzapn);
    if ((paramString != null) && (paramString.length() > 0))
    {
      if (paramString.substring(paramString.length() - 1).equals("/")) {
        paramString = paramString.substring(0, paramString.length() - 1);
      }
      localzapg.a(paramString);
    }
    localzapg.a(paramBoolean);
    h = localzapg;
    return localzapg;
  }
  
  private void a(zapn paramzapn)
  {
    this.f = paramzapn;
  }
  
  private String b()
  {
    return this.e;
  }
  
  public void a(String paramString)
  {
    this.e = paramString;
  }
  
  public String a(String paramString1, String paramString2, Map<String, String> paramMap1, String paramString3, Map<String, String> paramMap2)
    throws zapf
  {
    if ((b() == null) || (b().length() == 0))
    {
      localObject1 = new String[] { b() };
      throw new zapf(1005, (String[])localObject1);
    }
    Object localObject1 = new StringBuilder(b()).append(paramString1);
    Object localObject3;
    if (paramMap1.keySet().size() > 0)
    {
      int i = 0;
      localObject2 = paramMap1.keySet().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        String str1 = (String)((Iterator)localObject2).next();
        localObject3 = "&";
        if (i == 0) {
          localObject3 = "?";
        }
        ((StringBuilder)localObject1).append((String)localObject3).append(str1).append("=").append((String)paramMap1.get(str1));
        i++;
      }
    }
    HashMap localHashMap = new HashMap();
    if ((paramString2.equals(b)) && (this.f != null)) {
      this.f.a((StringBuilder)localObject1, localHashMap);
    }
    Object localObject2 = null;
    try
    {
      localObject2 = new URL(((StringBuilder)localObject1).toString());
    }
    catch (Exception localException1)
    {
      throw new zapf(0, localException1.getMessage());
    }
    HttpsURLConnection localHttpsURLConnection = null;
    try
    {
      localHttpsURLConnection = (HttpsURLConnection)((URL)localObject2).openConnection();
      localHttpsURLConnection.setSSLSocketFactory(a().getSocketFactory());
      localHttpsURLConnection.setConnectTimeout(10000);
      localHttpsURLConnection.setConnectTimeout(0);
      localHttpsURLConnection.setRequestProperty("Content-Type", "application/xml");
      Object localObject5;
      if (paramString2.equals(b))
      {
        localHttpsURLConnection.setRequestMethod("GET");
      }
      else if (paramString2.equals(a))
      {
        localObject3 = paramString3;
        a(localHashMap, localHttpsURLConnection, localObject3);
        localHttpsURLConnection.setRequestMethod("POST");
        localHttpsURLConnection.setDoOutput(true);
        localObject4 = localHttpsURLConnection.getOutputStream();
        localObject5 = new BufferedWriter(new OutputStreamWriter((OutputStream)localObject4, "UTF-8"));
        ((BufferedWriter)localObject5).write((String)localObject3);
        ((BufferedWriter)localObject5).flush();
        ((BufferedWriter)localObject5).close();
        ((OutputStream)localObject4).close();
      }
      else if (paramString2.equals(c))
      {
        localObject3 = paramString3;
        a(localHashMap, localHttpsURLConnection, localObject3);
        localHttpsURLConnection.setRequestMethod("PUT");
        localHttpsURLConnection.setDoOutput(true);
        localObject4 = localHttpsURLConnection.getOutputStream();
        localObject5 = new BufferedWriter(new OutputStreamWriter((OutputStream)localObject4, "UTF-8"));
        ((BufferedWriter)localObject5).write((String)localObject3);
        ((BufferedWriter)localObject5).flush();
        ((BufferedWriter)localObject5).close();
        ((OutputStream)localObject4).close();
      }
      else if (paramString2.equals(d))
      {
        localHttpsURLConnection.setRequestMethod("DELETE");
      }
      localObject3 = localHttpsURLConnection.getInputStream();
      Object localObject4 = new BufferedReader(new InputStreamReader((InputStream)localObject3));
      StringBuilder localStringBuilder = new StringBuilder();
      while ((localObject5 = ((BufferedReader)localObject4).readLine()) != null) {
        localStringBuilder.append((String)localObject5);
      }
      ((BufferedReader)localObject4).close();
      ((InputStream)localObject3).close();
      int j = localHttpsURLConnection.getResponseCode();
      if ((j == 200) || (j == 202) || (j == 201))
      {
        String str2 = localStringBuilder.toString();
        return str2;
      }
      throw new zapf(j, localStringBuilder.toString());
    }
    catch (zapf localzapf)
    {
      localzapf = localzapf;
      throw localzapf;
    }
    catch (Exception localException2)
    {
      localException2 = localException2;
      throw new zapf(500, localException2.getMessage());
    }
    finally {}
  }
  
  private void a(Map<String, String> paramMap, HttpsURLConnection paramHttpsURLConnection, Object paramObject)
  {
    if (this.f != null)
    {
      paramMap.clear();
      this.f.a(new StringBuilder((String)paramObject), paramMap);
      Iterator localIterator = paramMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        paramHttpsURLConnection.setRequestProperty(str, (String)paramMap.get(str));
      }
    }
  }
  
  public static String b(String paramString)
  {
    paramString = paramString == null ? "" : paramString;
    return c(paramString);
  }
  
  public static String a(Long paramLong)
  {
    String str = paramLong.toString();
    return c(str);
  }
  
  private static String c(String paramString)
  {
    return paramString;
  }
  
  public void a(boolean paramBoolean)
  {
    g = paramBoolean;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zapg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */