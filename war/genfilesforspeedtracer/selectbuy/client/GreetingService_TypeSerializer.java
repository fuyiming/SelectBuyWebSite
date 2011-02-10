package selectbuy.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.user.client.rpc.impl.TypeHandler;
import java.util.HashMap;
import java.util.Map;

public class GreetingService_TypeSerializer extends com.google.gwt.user.client.rpc.impl.SerializerBase {
  private static final Map<String, TypeHandler> methodMapJava;
  private static final MethodMap methodMapNative;
  private static final Map<Class<?>, String> signatureMapJava;
  private static final JsArrayString signatureMapNative;
  
  static {
    if (GWT.isScript()) {
      methodMapJava = null;
      methodMapNative = loadMethodsNative();
      signatureMapJava = null;
      signatureMapNative = loadSignaturesNative();
    } else {
      methodMapJava = loadMethodsJava();
      methodMapNative = null;
      signatureMapJava = loadSignaturesJava();
      signatureMapNative = null;
    }
  }
  
  @SuppressWarnings("deprecation")
  private static Map<String, TypeHandler> loadMethodsJava() {
    Map<String, TypeHandler> result = new HashMap<String, TypeHandler>();
    result.put("com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533", new com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer.Handler());
    result.put("java.lang.IllegalArgumentException/1755012560", new com.google.gwt.user.client.rpc.core.java.lang.IllegalArgumentException_FieldSerializer.Handler());
    result.put("java.lang.NumberFormatException/3305228476", new com.google.gwt.user.client.rpc.core.java.lang.NumberFormatException_FieldSerializer.Handler());
    result.put("java.lang.String/2004016611", new com.google.gwt.user.client.rpc.core.java.lang.String_FieldSerializer.Handler());
    return result;
  }
  
  @SuppressWarnings("deprecation")
  private static native MethodMap loadMethodsNative() /*-{
    var result = {};
    result["com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533"] = [
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/rpc/IncompatibleRemoteServiceException;),
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/IncompatibleRemoteServiceException;)
      ];
    
    result["java.lang.IllegalArgumentException/1755012560"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.IllegalArgumentException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.IllegalArgumentException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/IllegalArgumentException;),
      ];
    
    result["java.lang.NumberFormatException/3305228476"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.NumberFormatException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.NumberFormatException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/NumberFormatException;),
      ];
    
    result["java.lang.String/2004016611"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/String;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/String;)
      ];
    
    return result;
  }-*/;
  
  @SuppressWarnings("deprecation")
  private static Map<Class<?>, String> loadSignaturesJava() {
    Map<Class<?>, String> result = new HashMap<Class<?>, String>();
    result.put(com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer.concreteType(), "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533");
    result.put(com.google.gwt.user.client.rpc.core.java.lang.IllegalArgumentException_FieldSerializer.concreteType(), "java.lang.IllegalArgumentException/1755012560");
    result.put(com.google.gwt.user.client.rpc.core.java.lang.NumberFormatException_FieldSerializer.concreteType(), "java.lang.NumberFormatException/3305228476");
    result.put(com.google.gwt.user.client.rpc.core.java.lang.String_FieldSerializer.concreteType(), "java.lang.String/2004016611");
    return result;
  }
  
  @SuppressWarnings("deprecation")
  private static native JsArrayString loadSignaturesNative() /*-{
    var result = [];
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException::class)] = "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.IllegalArgumentException::class)] = "java.lang.IllegalArgumentException/1755012560";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.NumberFormatException::class)] = "java.lang.NumberFormatException/3305228476";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.String::class)] = "java.lang.String/2004016611";
    return result;
  }-*/;
  
  public GreetingService_TypeSerializer() {
    super(methodMapJava, methodMapNative, signatureMapJava, signatureMapNative);
  }
  
}
