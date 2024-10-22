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
import com.qanplatform.model.ResponseTransaction;
import java.io.IOException;
import java.net.URI;
import java.util.Arrays;

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
 * OutputGetTransactionByBlockNumberAndIndex
 */

public class OutputGetTransactionByBlockNumberAndIndex {
  public static final String SERIALIZED_NAME_$_SCHEMA = "$schema";
  @SerializedName(SERIALIZED_NAME_$_SCHEMA)
  private URI $schema;

  public static final String SERIALIZED_NAME_TRANSACTION = "Transaction";
  @SerializedName(SERIALIZED_NAME_TRANSACTION)
  private ResponseTransaction transaction;

  public OutputGetTransactionByBlockNumberAndIndex() {
  }

  public OutputGetTransactionByBlockNumberAndIndex(
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



  public OutputGetTransactionByBlockNumberAndIndex transaction(ResponseTransaction transaction) {
    this.transaction = transaction;
    return this;
  }

  /**
   * The transaction response object, or null if no transaction is found
   * @return transaction
   */
  @javax.annotation.Nonnull
  public ResponseTransaction getTransaction() {
    return transaction;
  }

  public void setTransaction(ResponseTransaction transaction) {
    this.transaction = transaction;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutputGetTransactionByBlockNumberAndIndex outputGetTransactionByBlockNumberAndIndex = (OutputGetTransactionByBlockNumberAndIndex) o;
    return Objects.equals(this.$schema, outputGetTransactionByBlockNumberAndIndex.$schema) &&
        Objects.equals(this.transaction, outputGetTransactionByBlockNumberAndIndex.transaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash($schema, transaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutputGetTransactionByBlockNumberAndIndex {\n");
    sb.append("    $schema: ").append(toIndentedString($schema)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
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
    openapiFields.add("Transaction");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Transaction");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OutputGetTransactionByBlockNumberAndIndex
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OutputGetTransactionByBlockNumberAndIndex.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OutputGetTransactionByBlockNumberAndIndex is not found in the empty JSON string", OutputGetTransactionByBlockNumberAndIndex.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OutputGetTransactionByBlockNumberAndIndex.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OutputGetTransactionByBlockNumberAndIndex` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OutputGetTransactionByBlockNumberAndIndex.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("$schema") != null && !jsonObj.get("$schema").isJsonNull()) && !jsonObj.get("$schema").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `$schema` to be a primitive type in the JSON string but got `%s`", jsonObj.get("$schema").toString()));
      }
      // validate the required field `Transaction`
      ResponseTransaction.validateJsonElement(jsonObj.get("Transaction"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OutputGetTransactionByBlockNumberAndIndex.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OutputGetTransactionByBlockNumberAndIndex' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OutputGetTransactionByBlockNumberAndIndex> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OutputGetTransactionByBlockNumberAndIndex.class));

       return (TypeAdapter<T>) new TypeAdapter<OutputGetTransactionByBlockNumberAndIndex>() {
           @Override
           public void write(JsonWriter out, OutputGetTransactionByBlockNumberAndIndex value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OutputGetTransactionByBlockNumberAndIndex read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OutputGetTransactionByBlockNumberAndIndex given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OutputGetTransactionByBlockNumberAndIndex
   * @throws IOException if the JSON string is invalid with respect to OutputGetTransactionByBlockNumberAndIndex
   */
  public static OutputGetTransactionByBlockNumberAndIndex fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OutputGetTransactionByBlockNumberAndIndex.class);
  }

  /**
   * Convert an instance of OutputGetTransactionByBlockNumberAndIndex to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

