/*
 * QAN AutoApi
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.qanplatform.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.qanplatform.model.ResponseTransactionReceipt;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.qanplatform.invoker.JSON;

/**
 * OutputGetBlockReceipts
 */

public class OutputGetBlockReceipts {
  public static final String SERIALIZED_NAME_$_SCHEMA = "$schema";
  @SerializedName(SERIALIZED_NAME_$_SCHEMA)
  private URI $schema;

  public static final String SERIALIZED_NAME_TRANSACTION_RECEIPTS = "TransactionReceipts";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_RECEIPTS)
  private List<ResponseTransactionReceipt> transactionReceipts = new ArrayList<>();

  public OutputGetBlockReceipts() {
  }

  public OutputGetBlockReceipts(
     URI $schema
  ) {
    this();
    this.$schema = $schema;
  }

  /**
   * A URL to the JSON Schema for this object.
   * @return $schema
   */
  @javax.annotation.Nullable
  public URI get$Schema() {
    return $schema;
  }



  public OutputGetBlockReceipts transactionReceipts(List<ResponseTransactionReceipt> transactionReceipts) {
    this.transactionReceipts = transactionReceipts;
    return this;
  }

  public OutputGetBlockReceipts addTransactionReceiptsItem(ResponseTransactionReceipt transactionReceiptsItem) {
    if (this.transactionReceipts == null) {
      this.transactionReceipts = new ArrayList<>();
    }
    this.transactionReceipts.add(transactionReceiptsItem);
    return this;
  }

  /**
   * An array of transaction receipt objects
   * @return transactionReceipts
   */
  @javax.annotation.Nonnull
  public List<ResponseTransactionReceipt> getTransactionReceipts() {
    return transactionReceipts;
  }

  public void setTransactionReceipts(List<ResponseTransactionReceipt> transactionReceipts) {
    this.transactionReceipts = transactionReceipts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutputGetBlockReceipts outputGetBlockReceipts = (OutputGetBlockReceipts) o;
    return Objects.equals(this.$schema, outputGetBlockReceipts.$schema) &&
        Objects.equals(this.transactionReceipts, outputGetBlockReceipts.transactionReceipts);
  }

  @Override
  public int hashCode() {
    return Objects.hash($schema, transactionReceipts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutputGetBlockReceipts {\n");
    sb.append("    $schema: ").append(toIndentedString($schema)).append("\n");
    sb.append("    transactionReceipts: ").append(toIndentedString(transactionReceipts)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("$schema");
    openapiFields.add("TransactionReceipts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("TransactionReceipts");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OutputGetBlockReceipts
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OutputGetBlockReceipts.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OutputGetBlockReceipts is not found in the empty JSON string", OutputGetBlockReceipts.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OutputGetBlockReceipts.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OutputGetBlockReceipts` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OutputGetBlockReceipts.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("$schema") != null && !jsonObj.get("$schema").isJsonNull()) && !jsonObj.get("$schema").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `$schema` to be a primitive type in the JSON string but got `%s`", jsonObj.get("$schema").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("TransactionReceipts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `TransactionReceipts` to be an array in the JSON string but got `%s`", jsonObj.get("TransactionReceipts").toString()));
      }

      JsonArray jsonArraytransactionReceipts = jsonObj.getAsJsonArray("TransactionReceipts");
      // validate the required field `TransactionReceipts` (array)
      for (int i = 0; i < jsonArraytransactionReceipts.size(); i++) {
        ResponseTransactionReceipt.validateJsonElement(jsonArraytransactionReceipts.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OutputGetBlockReceipts.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OutputGetBlockReceipts' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OutputGetBlockReceipts> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OutputGetBlockReceipts.class));

       return (TypeAdapter<T>) new TypeAdapter<OutputGetBlockReceipts>() {
           @Override
           public void write(JsonWriter out, OutputGetBlockReceipts value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OutputGetBlockReceipts read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OutputGetBlockReceipts given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OutputGetBlockReceipts
   * @throws IOException if the JSON string is invalid with respect to OutputGetBlockReceipts
   */
  public static OutputGetBlockReceipts fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OutputGetBlockReceipts.class);
  }

  /**
   * Convert an instance of OutputGetBlockReceipts to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

